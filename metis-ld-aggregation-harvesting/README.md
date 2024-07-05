# Metis Harvesting for LD

The final build of this project consists of two files:
* `[MODULE NAME AND VERSION].jar`
* `[MODULE NAME AND VERSION].lib`

The first of these is a **_jar_** file (essentially a zip file) containing the binary executable files, 
the second is a directory with many more **_jar_** files that contain library functionality needed by 
the application. Both are needed to run any functionality in this project.

To access any functionality, java needs to be available in the command line. The required java 
version 21 at the time of writing (you can check by issuing the following command: ` java --version`). 

Functionality is accessible through a so-called main class (i.e. a Java class with a `main` method 
in it). To execute any such functionality the syntax is as follows (on unix systems): 
```
java \
    -cp "[PATH TO JAR FILE]:[PATH TO LIB DIRECTORY]/*" \
    [FULLY QUALIFIED CLASS NAME OF MAIN CLASS] \
    [ADDITIONAL PARAMETERS FOR SPECIFIC MAIN CLASS]
```
Or, the equivalent on Windows systems (where the line break escape character and the class path 
separator differ):
```
java ^
    -cp "[JAR FILE LOCATION];[LIB DIRECTORY LOCATION]/*" ^
    [FULLY QUALIFIED CLASS NAME OF MAIN CLASS] ^
    [ADDITIONAL PARAMETERS FOR SPECIFIC MAIN CLASS]
```

## Harvesting a dataset from an LD repository

The name of the main class for harvesting a dataset from an LD repository (SPARQL endpoint) is
`eu.europeana.metis.ldaggregation.harvesting.HarvestLDFromEndpoint`. The functionality requires 
three parameters, in the following order:
1. The URL of ths SPARQL endpoint
2. The ID of the dataset as known at the SPARQL endpoint
3. The name of the output ZIP file that will contain all records. Any path and name can be given 
here - if the file already exists it will be overwritten.

For example, at the time of writing the following command worked on a unix environment (provided
the user is executing this from within the directory containing the jar file and lib directory):
```
java \
    -cp "metis-ld-aggregation-harvesting-1.0-SNAPSHOT.jar:metis-ld-aggregation-harvesting-1.0-SNAPSHOT.lib/*" \
    eu.europeana.metis.ldaggregation.harvesting.HarvestLDFromEndpoint \
    https://triplestore.netwerkdigitaalerfgoed.nl/repositories/registry \
    https://archief.nl/id/dataset/foto/2-10-62ntfoto \
    ~/2-10-62ntfoto.zip
```
Or, the equivalent on Windows systems:
```
java ^
    -cp "metis-ld-aggregation-harvesting-1.0-SNAPSHOT.jar;metis-ld-aggregation-harvesting-1.0-SNAPSHOT.lib/*" ^
    eu.europeana.metis.ldaggregation.harvesting.HarvestLDFromEndpoint ^
    https://triplestore.netwerkdigitaalerfgoed.nl/repositories/registry ^
    https://archief.nl/id/dataset/foto/2-10-62ntfoto ^
    C:\Users\User\Documents\2-10-62ntfoto.zip
```

