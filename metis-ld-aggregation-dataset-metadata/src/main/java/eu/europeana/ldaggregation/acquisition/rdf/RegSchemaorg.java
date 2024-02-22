package eu.europeana.ldaggregation.acquisition.rdf;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;

public final class RegSchemaorg {
	public static String PREFIX = "schemaorg";
	public static String NS = "http://schema.org/";

	public static final Property openingHours = ResourceFactory.createProperty("http://schema.org/openingHours");
	public static final Resource PlayAction = ResourceFactory.createResource("http://schema.org/PlayAction");
	public static final Resource ReservationHold = ResourceFactory.createResource("http://schema.org/ReservationHold");
	public static final Property softwareRequirements = ResourceFactory
			.createProperty("http://schema.org/softwareRequirements");
	public static final Property isFamilyFriendly = ResourceFactory
			.createProperty("http://schema.org/isFamilyFriendly");
	public static final Property broadcastTimezone = ResourceFactory
			.createProperty("http://schema.org/broadcastTimezone");
	public static final Property upvoteCount = ResourceFactory.createProperty("http://schema.org/upvoteCount");
	public static final Property relatedTo = ResourceFactory.createProperty("http://schema.org/relatedTo");
	public static final Property responsibilities = ResourceFactory
			.createProperty("http://schema.org/responsibilities");
	public static final Property employees = ResourceFactory.createProperty("http://schema.org/employees");
	public static final Resource OnlineFull = ResourceFactory.createResource("http://schema.org/OnlineFull");
	public static final Property valueMinLength = ResourceFactory.createProperty("http://schema.org/valueMinLength");
	public static final Property courseCode = ResourceFactory.createProperty("http://schema.org/courseCode");
	public static final Property replacee = ResourceFactory.createProperty("http://schema.org/replacee");
	public static final Property programmingLanguage = ResourceFactory
			.createProperty("http://schema.org/programmingLanguage");
	public static final Resource CheckoutPage = ResourceFactory.createResource("http://schema.org/CheckoutPage");
	public static final Property countriesSupported = ResourceFactory
			.createProperty("http://schema.org/countriesSupported");
	public static final Property sportsEvent = ResourceFactory.createProperty("http://schema.org/sportsEvent");
	public static final Property publicAccess = ResourceFactory.createProperty("http://schema.org/publicAccess");
	public static final Property contentRating = ResourceFactory.createProperty("http://schema.org/contentRating");
	public static final Resource MusicVideoObject = ResourceFactory
			.createResource("http://schema.org/MusicVideoObject");
	public static final Resource PriceSpecification = ResourceFactory
			.createResource("http://schema.org/PriceSpecification");
	public static final Property founders = ResourceFactory.createProperty("http://schema.org/founders");
	public static final Property permitAudience = ResourceFactory.createProperty("http://schema.org/permitAudience");
	public static final Property contactOption = ResourceFactory.createProperty("http://schema.org/contactOption");
	public static final Resource DepartAction = ResourceFactory.createResource("http://schema.org/DepartAction");
	public static final Resource EducationEvent = ResourceFactory.createResource("http://schema.org/EducationEvent");
	public static final Property area = ResourceFactory.createProperty("http://schema.org/area");
	public static final Resource KosherDiet = ResourceFactory.createResource("http://schema.org/KosherDiet");
	public static final Resource EntertainmentBusiness = ResourceFactory
			.createResource("http://schema.org/EntertainmentBusiness");
	public static final Property roleName = ResourceFactory.createProperty("http://schema.org/roleName");
	public static final Resource GasStation = ResourceFactory.createResource("http://schema.org/GasStation");
	public static final Property reviewAspect = ResourceFactory.createProperty("http://schema.org/reviewAspect");
	public static final Resource Code = ResourceFactory.createResource("http://schema.org/Code");
	public static final Resource SpeakableSpecification = ResourceFactory
			.createResource("http://schema.org/SpeakableSpecification");
	public static final Resource LocationFeatureSpecification = ResourceFactory
			.createResource("http://schema.org/LocationFeatureSpecification");
	public static final Resource InStoreOnly = ResourceFactory.createResource("http://schema.org/InStoreOnly");
	public static final Property processingTime = ResourceFactory.createProperty("http://schema.org/processingTime");
	public static final Property transFatContent = ResourceFactory.createProperty("http://schema.org/transFatContent");
	public static final Resource CollegeOrUniversity = ResourceFactory
			.createResource("http://schema.org/CollegeOrUniversity");
	public static final Property language = ResourceFactory.createProperty("http://schema.org/language");
	public static final Property contactType = ResourceFactory.createProperty("http://schema.org/contactType");
	public static final Property sport = ResourceFactory.createProperty("http://schema.org/sport");
	public static final Property sameAs = ResourceFactory.createProperty("http://schema.org/sameAs");
	public static final Resource TelevisionStation = ResourceFactory
			.createResource("http://schema.org/TelevisionStation");
	public static final Property benefits = ResourceFactory.createProperty("http://schema.org/benefits");
	public static final Resource GameServerStatus = ResourceFactory
			.createResource("http://schema.org/GameServerStatus");
	public static final Property seatRow = ResourceFactory.createProperty("http://schema.org/seatRow");
	public static final Resource BedAndBreakfast = ResourceFactory.createResource("http://schema.org/BedAndBreakfast");
	public static final Property arrivalTerminal = ResourceFactory.createProperty("http://schema.org/arrivalTerminal");
	public static final Property arrivalTime = ResourceFactory.createProperty("http://schema.org/arrivalTime");
	public static final Property lesser = ResourceFactory.createProperty("http://schema.org/lesser");
	public static final Resource DanceGroup = ResourceFactory.createResource("http://schema.org/DanceGroup");
	public static final Property actionOption = ResourceFactory.createProperty("http://schema.org/actionOption");
	public static final Resource CommentAction = ResourceFactory.createResource("http://schema.org/CommentAction");
	public static final Property percentile25 = ResourceFactory.createProperty("http://schema.org/percentile25");
	public static final Resource ImageGallery = ResourceFactory.createResource("http://schema.org/ImageGallery");
	public static final Property wordCount = ResourceFactory.createProperty("http://schema.org/wordCount");
	public static final Property step = ResourceFactory.createProperty("http://schema.org/step");
	public static final Property map = ResourceFactory.createProperty("http://schema.org/map");
	public static final Property equal = ResourceFactory.createProperty("http://schema.org/equal");
	public static final Resource PerformingGroup = ResourceFactory.createResource("http://schema.org/PerformingGroup");
	public static final Property creditedTo = ResourceFactory.createProperty("http://schema.org/creditedTo");
	public static final Property propertyID = ResourceFactory.createProperty("http://schema.org/propertyID");
	public static final Resource LockerDelivery = ResourceFactory.createResource("http://schema.org/LockerDelivery");
	public static final Property alumni = ResourceFactory.createProperty("http://schema.org/alumni");
	public static final Property depth = ResourceFactory.createProperty("http://schema.org/depth");
	public static final Resource UserDownloads = ResourceFactory.createResource("http://schema.org/UserDownloads");
	public static final Resource Trip = ResourceFactory.createResource("http://schema.org/Trip");
	public static final Resource Text = ResourceFactory.createResource("http://schema.org/Text");
	public static final Resource LandmarksOrHistoricalBuildings = ResourceFactory
			.createResource("http://schema.org/LandmarksOrHistoricalBuildings");
	public static final Property gameTip = ResourceFactory.createProperty("http://schema.org/gameTip");
	public static final Property exerciseCourse = ResourceFactory.createProperty("http://schema.org/exerciseCourse");
	public static final Property typeOfBed = ResourceFactory.createProperty("http://schema.org/typeOfBed");
	public static final Resource JobPosting = ResourceFactory.createResource("http://schema.org/JobPosting");
	public static final Property event = ResourceFactory.createProperty("http://schema.org/event");
	public static final Resource WarrantyPromise = ResourceFactory.createResource("http://schema.org/WarrantyPromise");
	public static final Property coverageStartTime = ResourceFactory
			.createProperty("http://schema.org/coverageStartTime");
	public static final Resource ActiveActionStatus = ResourceFactory
			.createResource("http://schema.org/ActiveActionStatus");
	public static final Resource RVPark = ResourceFactory.createResource("http://schema.org/RVPark");
	public static final Resource InsertAction = ResourceFactory.createResource("http://schema.org/InsertAction");
	public static final Resource Residence = ResourceFactory.createResource("http://schema.org/Residence");
	public static final Property netWorth = ResourceFactory.createProperty("http://schema.org/netWorth");
	public static final Property calories = ResourceFactory.createProperty("http://schema.org/calories");
	public static final Property organizer = ResourceFactory.createProperty("http://schema.org/organizer");
	public static final Resource ActionStatusType = ResourceFactory
			.createResource("http://schema.org/ActionStatusType");
	public static final Resource AchieveAction = ResourceFactory.createResource("http://schema.org/AchieveAction");
	public static final Property previousItem = ResourceFactory.createProperty("http://schema.org/previousItem");
	public static final Property error = ResourceFactory.createProperty("http://schema.org/error");
	public static final Property reservationFor = ResourceFactory.createProperty("http://schema.org/reservationFor");
	public static final Property acceptedAnswer = ResourceFactory.createProperty("http://schema.org/acceptedAnswer");
	public static final Property lyrics = ResourceFactory.createProperty("http://schema.org/lyrics");
	public static final Resource AutoRepair = ResourceFactory.createResource("http://schema.org/AutoRepair");
	public static final Property distance = ResourceFactory.createProperty("http://schema.org/distance");
	public static final Resource EndorsementRating = ResourceFactory
			.createResource("http://schema.org/EndorsementRating");
	public static final Resource HowTo = ResourceFactory.createResource("http://schema.org/HowTo");
	public static final Property securityScreening = ResourceFactory
			.createProperty("http://schema.org/securityScreening");
	public static final Resource APIReference = ResourceFactory.createResource("http://schema.org/APIReference");
	public static final Property vehicleModelDate = ResourceFactory
			.createProperty("http://schema.org/vehicleModelDate");
	public static final Resource Brewery = ResourceFactory.createResource("http://schema.org/Brewery");
	public static final Resource ElementarySchool = ResourceFactory
			.createResource("http://schema.org/ElementarySchool");
	public static final Resource IceCreamShop = ResourceFactory.createResource("http://schema.org/IceCreamShop");
	public static final Resource DisagreeAction = ResourceFactory.createResource("http://schema.org/DisagreeAction");
	public static final Property commentTime = ResourceFactory.createProperty("http://schema.org/commentTime");
	public static final Property valueRequired = ResourceFactory.createProperty("http://schema.org/valueRequired");
	public static final Resource ApplyAction = ResourceFactory.createResource("http://schema.org/ApplyAction");
	public static final Property memberOf = ResourceFactory.createProperty("http://schema.org/memberOf");
	public static final Property interactionType = ResourceFactory.createProperty("http://schema.org/interactionType");
	public static final Property multipleValues = ResourceFactory.createProperty("http://schema.org/multipleValues");
	public static final Property underName = ResourceFactory.createProperty("http://schema.org/underName");
	public static final Resource VideoGameSeries = ResourceFactory.createResource("http://schema.org/VideoGameSeries");
	public static final Resource AgreeAction = ResourceFactory.createResource("http://schema.org/AgreeAction");
	public static final Property educationalUse = ResourceFactory.createProperty("http://schema.org/educationalUse");
	public static final Resource HVACBusiness = ResourceFactory.createResource("http://schema.org/HVACBusiness");
	public static final Resource AMRadioChannel = ResourceFactory.createResource("http://schema.org/AMRadioChannel");
	public static final Resource LiquorStore = ResourceFactory.createResource("http://schema.org/LiquorStore");
	public static final Resource GatedResidenceCommunity = ResourceFactory
			.createResource("http://schema.org/GatedResidenceCommunity");
	public static final Property copyrightHolder = ResourceFactory.createProperty("http://schema.org/copyrightHolder");
	public static final Resource CheckOutAction = ResourceFactory.createResource("http://schema.org/CheckOutAction");
	public static final Property containedInPlace = ResourceFactory
			.createProperty("http://schema.org/containedInPlace");
	public static final Property dissolutionDate = ResourceFactory.createProperty("http://schema.org/dissolutionDate");
	public static final Resource FMRadioChannel = ResourceFactory.createResource("http://schema.org/FMRadioChannel");
	public static final Property jobLocation = ResourceFactory.createProperty("http://schema.org/jobLocation");
	public static final Property releaseOf = ResourceFactory.createProperty("http://schema.org/releaseOf");
	public static final Resource MarryAction = ResourceFactory.createResource("http://schema.org/MarryAction");
	public static final Resource OrderInTransit = ResourceFactory.createResource("http://schema.org/OrderInTransit");
	public static final Property downvoteCount = ResourceFactory.createProperty("http://schema.org/downvoteCount");
	public static final Resource SaleEvent = ResourceFactory.createResource("http://schema.org/SaleEvent");
	public static final Property fiberContent = ResourceFactory.createProperty("http://schema.org/fiberContent");
	public static final Property track = ResourceFactory.createProperty("http://schema.org/track");
	public static final Resource RejectAction = ResourceFactory.createResource("http://schema.org/RejectAction");
	public static final Resource Integer = ResourceFactory.createResource("http://schema.org/Integer");
	public static final Resource TrainStation = ResourceFactory.createResource("http://schema.org/TrainStation");
	public static final Resource LakeBodyOfWater = ResourceFactory.createResource("http://schema.org/LakeBodyOfWater");
	public static final Resource TollFree = ResourceFactory.createResource("http://schema.org/TollFree");
	public static final Property carrierRequirements = ResourceFactory
			.createProperty("http://schema.org/carrierRequirements");
	public static final Property countryOfOrigin = ResourceFactory.createProperty("http://schema.org/countryOfOrigin");
	public static final Property orderDelivery = ResourceFactory.createProperty("http://schema.org/orderDelivery");
	public static final Property audience = ResourceFactory.createProperty("http://schema.org/audience");
	public static final Resource TaxiStand = ResourceFactory.createResource("http://schema.org/TaxiStand");
	public static final Property citation = ResourceFactory.createProperty("http://schema.org/citation");
	public static final Resource ToyStore = ResourceFactory.createResource("http://schema.org/ToyStore");
	public static final Property itemCondition = ResourceFactory.createProperty("http://schema.org/itemCondition");
	public static final Resource TieAction = ResourceFactory.createResource("http://schema.org/TieAction");
	public static final Property eventStatus = ResourceFactory.createProperty("http://schema.org/eventStatus");
	public static final Resource WebPage = ResourceFactory.createResource("http://schema.org/WebPage");
	public static final Property runtimePlatform = ResourceFactory.createProperty("http://schema.org/runtimePlatform");
	public static final Property color = ResourceFactory.createProperty("http://schema.org/color");
	public static final Resource SportingGoodsStore = ResourceFactory
			.createResource("http://schema.org/SportingGoodsStore");
	public static final Resource DigitalDocumentPermission = ResourceFactory
			.createResource("http://schema.org/DigitalDocumentPermission");
	public static final Property codeSampleType = ResourceFactory.createProperty("http://schema.org/codeSampleType");
	public static final Property option = ResourceFactory.createProperty("http://schema.org/option");
	public static final Property typeOfGood = ResourceFactory.createProperty("http://schema.org/typeOfGood");
	public static final Property replacer = ResourceFactory.createProperty("http://schema.org/replacer");
	public static final Property accountId = ResourceFactory.createProperty("http://schema.org/accountId");
	public static final Property honorificSuffix = ResourceFactory.createProperty("http://schema.org/honorificSuffix");
	public static final Property orderedItem = ResourceFactory.createProperty("http://schema.org/orderedItem");
	public static final Resource CheckInAction = ResourceFactory.createResource("http://schema.org/CheckInAction");
	public static final Property recipient = ResourceFactory.createProperty("http://schema.org/recipient");
	public static final Resource HearingImpairedSupported = ResourceFactory
			.createResource("http://schema.org/HearingImpairedSupported");
	public static final Property ticketNumber = ResourceFactory.createProperty("http://schema.org/ticketNumber");
	public static final Resource BuyAction = ResourceFactory.createResource("http://schema.org/BuyAction");
	public static final Property interactionStatistic = ResourceFactory
			.createProperty("http://schema.org/interactionStatistic");
	public static final Resource CompilationAlbum = ResourceFactory
			.createResource("http://schema.org/CompilationAlbum");
	public static final Property ownedThrough = ResourceFactory.createProperty("http://schema.org/ownedThrough");
	public static final Resource Church = ResourceFactory.createResource("http://schema.org/Church");
	public static final Property geoEquals = ResourceFactory.createProperty("http://schema.org/geoEquals");
	public static final Resource RemixAlbum = ResourceFactory.createResource("http://schema.org/RemixAlbum");
	public static final Resource DayOfWeek = ResourceFactory.createResource("http://schema.org/DayOfWeek");
	public static final Property educationalCredentialAwarded = ResourceFactory
			.createProperty("http://schema.org/educationalCredentialAwarded");
	public static final Property workHours = ResourceFactory.createProperty("http://schema.org/workHours");
	public static final Property publication = ResourceFactory.createProperty("http://schema.org/publication");
	public static final Resource MapCategoryType = ResourceFactory.createResource("http://schema.org/MapCategoryType");
	public static final Property partySize = ResourceFactory.createProperty("http://schema.org/partySize");
	public static final Property aggregateRating = ResourceFactory.createProperty("http://schema.org/aggregateRating");
	public static final Resource PaymentStatusType = ResourceFactory
			.createResource("http://schema.org/PaymentStatusType");
	public static final Property paymentMethodId = ResourceFactory.createProperty("http://schema.org/paymentMethodId");
	public static final Property jobBenefits = ResourceFactory.createProperty("http://schema.org/jobBenefits");
	public static final Property title = ResourceFactory.createProperty("http://schema.org/title");
	public static final Property isLiveBroadcast = ResourceFactory.createProperty("http://schema.org/isLiveBroadcast");
	public static final Property industry = ResourceFactory.createProperty("http://schema.org/industry");
	public static final Property representativeOfPage = ResourceFactory
			.createProperty("http://schema.org/representativeOfPage");
	public static final Resource Recipe = ResourceFactory.createResource("http://schema.org/Recipe");
	public static final Property game = ResourceFactory.createProperty("http://schema.org/game");
	public static final Property hasMenuItem = ResourceFactory.createProperty("http://schema.org/hasMenuItem");
	public static final Resource PaymentService = ResourceFactory.createResource("http://schema.org/PaymentService");
	public static final Resource ConvenienceStore = ResourceFactory
			.createResource("http://schema.org/ConvenienceStore");
	public static final Resource HowToStep = ResourceFactory.createResource("http://schema.org/HowToStep");
	public static final Resource SoldOut = ResourceFactory.createResource("http://schema.org/SoldOut");
	public static final Resource GeoCircle = ResourceFactory.createResource("http://schema.org/GeoCircle");
	public static final Property parentItem = ResourceFactory.createProperty("http://schema.org/parentItem");
	public static final Resource HowToDirection = ResourceFactory.createResource("http://schema.org/HowToDirection");
	public static final Property trailer = ResourceFactory.createProperty("http://schema.org/trailer");
	public static final Property permissions = ResourceFactory.createProperty("http://schema.org/permissions");
	public static final Resource BusinessAudience = ResourceFactory
			.createResource("http://schema.org/BusinessAudience");
	public static final Resource CableOrSatelliteService = ResourceFactory
			.createResource("http://schema.org/CableOrSatelliteService");
	public static final Resource BefriendAction = ResourceFactory.createResource("http://schema.org/BefriendAction");
	public static final Property validIn = ResourceFactory.createProperty("http://schema.org/validIn");
	public static final Resource DryCleaningOrLaundry = ResourceFactory
			.createResource("http://schema.org/DryCleaningOrLaundry");
	public static final Resource TouristInformationCenter = ResourceFactory
			.createResource("http://schema.org/TouristInformationCenter");
	public static final Resource IgnoreAction = ResourceFactory.createResource("http://schema.org/IgnoreAction");
	public static final Property referenceQuantity = ResourceFactory
			.createProperty("http://schema.org/referenceQuantity");
	public static final Resource Answer = ResourceFactory.createResource("http://schema.org/Answer");
	public static final Property alignmentType = ResourceFactory.createProperty("http://schema.org/alignmentType");
	public static final Property fatContent = ResourceFactory.createProperty("http://schema.org/fatContent");
	public static final Resource MultiPlayer = ResourceFactory.createResource("http://schema.org/MultiPlayer");
	public static final Property bed = ResourceFactory.createProperty("http://schema.org/bed");
	public static final Resource Waterfall = ResourceFactory.createResource("http://schema.org/Waterfall");
	public static final Resource BedDetails = ResourceFactory.createResource("http://schema.org/BedDetails");
	public static final Property cholesterolContent = ResourceFactory
			.createProperty("http://schema.org/cholesterolContent");
	public static final Property vendor = ResourceFactory.createProperty("http://schema.org/vendor");
	public static final Property serviceSmsNumber = ResourceFactory
			.createProperty("http://schema.org/serviceSmsNumber");
	public static final Resource MovieClip = ResourceFactory.createResource("http://schema.org/MovieClip");
	public static final Resource Country = ResourceFactory.createResource("http://schema.org/Country");
	public static final Resource LowLactoseDiet = ResourceFactory.createResource("http://schema.org/LowLactoseDiet");
	public static final Resource Bakery = ResourceFactory.createResource("http://schema.org/Bakery");
	public static final Resource DaySpa = ResourceFactory.createResource("http://schema.org/DaySpa");
	public static final Property bookFormat = ResourceFactory.createProperty("http://schema.org/bookFormat");
	public static final Resource ReadPermission = ResourceFactory.createResource("http://schema.org/ReadPermission");
	public static final Resource EmploymentAgency = ResourceFactory
			.createResource("http://schema.org/EmploymentAgency");
	public static final Resource ParkingMap = ResourceFactory.createResource("http://schema.org/ParkingMap");
	public static final Property menuAddOn = ResourceFactory.createProperty("http://schema.org/menuAddOn");
	public static final Property albumProductionType = ResourceFactory
			.createProperty("http://schema.org/albumProductionType");
	public static final Resource PetStore = ResourceFactory.createResource("http://schema.org/PetStore");
	public static final Property servesCuisine = ResourceFactory.createProperty("http://schema.org/servesCuisine");
	public static final Property owns = ResourceFactory.createProperty("http://schema.org/owns");
	public static final Property resultReview = ResourceFactory.createProperty("http://schema.org/resultReview");
	public static final Property validUntil = ResourceFactory.createProperty("http://schema.org/validUntil");
	public static final Resource BikeStore = ResourceFactory.createResource("http://schema.org/BikeStore");
	public static final Property embedUrl = ResourceFactory.createProperty("http://schema.org/embedUrl");
	public static final Property currency = ResourceFactory.createProperty("http://schema.org/currency");
	public static final Property actionStatus = ResourceFactory.createProperty("http://schema.org/actionStatus");
	public static final Resource InsuranceAgency = ResourceFactory.createResource("http://schema.org/InsuranceAgency");
	public static final Resource ContactPage = ResourceFactory.createResource("http://schema.org/ContactPage");
	public static final Property keywords = ResourceFactory.createProperty("http://schema.org/keywords");
	public static final Resource JoinAction = ResourceFactory.createResource("http://schema.org/JoinAction");
	public static final Property valuePattern = ResourceFactory.createProperty("http://schema.org/valuePattern");
	public static final Resource OrganizationRole = ResourceFactory
			.createResource("http://schema.org/OrganizationRole");
	public static final Resource Comment = ResourceFactory.createResource("http://schema.org/Comment");
	public static final Property fileFormat = ResourceFactory.createProperty("http://schema.org/fileFormat");
	public static final Resource TheaterEvent = ResourceFactory.createResource("http://schema.org/TheaterEvent");
	public static final Property comment = ResourceFactory.createProperty("http://schema.org/comment");
	public static final Property mileageFromOdometer = ResourceFactory
			.createProperty("http://schema.org/mileageFromOdometer");
	public static final Property cookingMethod = ResourceFactory.createProperty("http://schema.org/cookingMethod");
	public static final Property targetCollection = ResourceFactory
			.createProperty("http://schema.org/targetCollection");
	public static final Resource DownloadAction = ResourceFactory.createResource("http://schema.org/DownloadAction");
	public static final Property fuelType = ResourceFactory.createProperty("http://schema.org/fuelType");
	public static final Property starRating = ResourceFactory.createProperty("http://schema.org/starRating");
	public static final Property geoCoveredBy = ResourceFactory.createProperty("http://schema.org/geoCoveredBy");
	public static final Resource AllWheelDriveConfiguration = ResourceFactory
			.createResource("http://schema.org/AllWheelDriveConfiguration");
	public static final Property additionalNumberOfGuests = ResourceFactory
			.createProperty("http://schema.org/additionalNumberOfGuests");
	public static final Resource EntryPoint = ResourceFactory.createResource("http://schema.org/EntryPoint");
	public static final Property installUrl = ResourceFactory.createProperty("http://schema.org/installUrl");
	public static final Resource SportsTeam = ResourceFactory.createResource("http://schema.org/SportsTeam");
	public static final Resource WebPageElement = ResourceFactory.createResource("http://schema.org/WebPageElement");
	public static final Resource DateTime = ResourceFactory.createResource("http://schema.org/DateTime");
	public static final Resource VideoGame = ResourceFactory.createResource("http://schema.org/VideoGame");
	public static final Property bestRating = ResourceFactory.createProperty("http://schema.org/bestRating");
	public static final Property containedIn = ResourceFactory.createProperty("http://schema.org/containedIn");
	public static final Property availabilityStarts = ResourceFactory
			.createProperty("http://schema.org/availabilityStarts");
	public static final Property availableAtOrFrom = ResourceFactory
			.createProperty("http://schema.org/availableAtOrFrom");
	public static final Property unsaturatedFatContent = ResourceFactory
			.createProperty("http://schema.org/unsaturatedFatContent");
	public static final Resource StudioAlbum = ResourceFactory.createResource("http://schema.org/StudioAlbum");
	public static final Property blogPosts = ResourceFactory.createProperty("http://schema.org/blogPosts");
	public static final Property coach = ResourceFactory.createProperty("http://schema.org/coach");
	public static final Property pickupLocation = ResourceFactory.createProperty("http://schema.org/pickupLocation");
	public static final Property numTracks = ResourceFactory.createProperty("http://schema.org/numTracks");
	public static final Resource EventVenue = ResourceFactory.createResource("http://schema.org/EventVenue");
	public static final Resource TVEpisode = ResourceFactory.createResource("http://schema.org/TVEpisode");
	public static final Resource Festival = ResourceFactory.createResource("http://schema.org/Festival");
	public static final Property contentSize = ResourceFactory.createProperty("http://schema.org/contentSize");
	public static final Property paymentStatus = ResourceFactory.createProperty("http://schema.org/paymentStatus");
	public static final Property athlete = ResourceFactory.createProperty("http://schema.org/athlete");
	public static final Property readonlyValue = ResourceFactory.createProperty("http://schema.org/readonlyValue");
	public static final Property customer = ResourceFactory.createProperty("http://schema.org/customer");
	public static final Resource PerformanceRole = ResourceFactory.createResource("http://schema.org/PerformanceRole");
	public static final Resource SiteNavigationElement = ResourceFactory
			.createResource("http://schema.org/SiteNavigationElement");
	public static final Property honorificPrefix = ResourceFactory.createProperty("http://schema.org/honorificPrefix");
	public static final Property userInteractionCount = ResourceFactory
			.createProperty("http://schema.org/userInteractionCount");
	public static final Resource ParcelDelivery = ResourceFactory.createResource("http://schema.org/ParcelDelivery");
	public static final Property workFeatured = ResourceFactory.createProperty("http://schema.org/workFeatured");
	public static final Resource HairSalon = ResourceFactory.createResource("http://schema.org/HairSalon");
	public static final Property mainEntity = ResourceFactory.createProperty("http://schema.org/mainEntity");
	public static final Resource Role = ResourceFactory.createResource("http://schema.org/Role");
	public static final Resource WriteAction = ResourceFactory.createResource("http://schema.org/WriteAction");
	public static final Resource VinylFormat = ResourceFactory.createResource("http://schema.org/VinylFormat");
	public static final Property bookingAgent = ResourceFactory.createProperty("http://schema.org/bookingAgent");
	public static final Property telephone = ResourceFactory.createProperty("http://schema.org/telephone");
	public static final Resource CommentPermission = ResourceFactory
			.createResource("http://schema.org/CommentPermission");
	public static final Property occupancy = ResourceFactory.createProperty("http://schema.org/occupancy");
	public static final Property encodesCreativeWork = ResourceFactory
			.createProperty("http://schema.org/encodesCreativeWork");
	public static final Property parentService = ResourceFactory.createProperty("http://schema.org/parentService");
	public static final Property includedDataCatalog = ResourceFactory
			.createProperty("http://schema.org/includedDataCatalog");
	public static final Resource MobileApplication = ResourceFactory
			.createResource("http://schema.org/MobileApplication");
	public static final Resource VideoObject = ResourceFactory.createResource("http://schema.org/VideoObject");
	public static final Property instructor = ResourceFactory.createProperty("http://schema.org/instructor");
	public static final Resource Airport = ResourceFactory.createResource("http://schema.org/Airport");
	public static final Resource ItemAvailability = ResourceFactory
			.createResource("http://schema.org/ItemAvailability");
	public static final Resource UserBlocks = ResourceFactory.createResource("http://schema.org/UserBlocks");
	public static final Property expires = ResourceFactory.createProperty("http://schema.org/expires");
	public static final Resource HotelRoom = ResourceFactory.createResource("http://schema.org/HotelRoom");
	public static final Property orderNumber = ResourceFactory.createProperty("http://schema.org/orderNumber");
	public static final Property polygon = ResourceFactory.createProperty("http://schema.org/polygon");
	public static final Property hasOccupation = ResourceFactory.createProperty("http://schema.org/hasOccupation");
	public static final Resource DiscussionForumPosting = ResourceFactory
			.createResource("http://schema.org/DiscussionForumPosting");
	public static final Resource ReplyAction = ResourceFactory.createResource("http://schema.org/ReplyAction");
	public static final Property member = ResourceFactory.createProperty("http://schema.org/member");
	public static final Resource Duration = ResourceFactory.createResource("http://schema.org/Duration");
	public static final Property associatedArticle = ResourceFactory
			.createProperty("http://schema.org/associatedArticle");
	public static final Resource ParkingFacility = ResourceFactory.createResource("http://schema.org/ParkingFacility");
	public static final Property areaServed = ResourceFactory.createProperty("http://schema.org/areaServed");
	public static final Resource PaintAction = ResourceFactory.createResource("http://schema.org/PaintAction");
	public static final Resource BusinessFunction = ResourceFactory
			.createResource("http://schema.org/BusinessFunction");
	public static final Property eligibleCustomerType = ResourceFactory
			.createProperty("http://schema.org/eligibleCustomerType");
	public static final Property deathDate = ResourceFactory.createProperty("http://schema.org/deathDate");
	public static final Resource MusicRecording = ResourceFactory.createResource("http://schema.org/MusicRecording");
	public static final Resource OutletStore = ResourceFactory.createResource("http://schema.org/OutletStore");
	public static final Property containsPlace = ResourceFactory.createProperty("http://schema.org/containsPlace");
	public static final Property orderQuantity = ResourceFactory.createProperty("http://schema.org/orderQuantity");
	public static final Resource Taxi = ResourceFactory.createResource("http://schema.org/Taxi");
	public static final Resource LeftHandDriving = ResourceFactory.createResource("http://schema.org/LeftHandDriving");
	public static final Property accessibilitySummary = ResourceFactory
			.createProperty("http://schema.org/accessibilitySummary");
	public static final Property printSection = ResourceFactory.createProperty("http://schema.org/printSection");
	public static final Property colleague = ResourceFactory.createProperty("http://schema.org/colleague");
	public static final Property seatSection = ResourceFactory.createProperty("http://schema.org/seatSection");
	public static final Resource DefenceEstablishment = ResourceFactory
			.createResource("http://schema.org/DefenceEstablishment");
	public static final Property minPrice = ResourceFactory.createProperty("http://schema.org/minPrice");
	public static final Resource EPRelease = ResourceFactory.createResource("http://schema.org/EPRelease");
	public static final Resource ScheduleAction = ResourceFactory.createResource("http://schema.org/ScheduleAction");
	public static final Property processorRequirements = ResourceFactory
			.createProperty("http://schema.org/processorRequirements");
	public static final Property workExample = ResourceFactory.createProperty("http://schema.org/workExample");
	public static final Resource ContactPointOption = ResourceFactory
			.createResource("http://schema.org/ContactPointOption");
	public static final Property workPerformed = ResourceFactory.createProperty("http://schema.org/workPerformed");
	public static final Property numberedPosition = ResourceFactory
			.createProperty("http://schema.org/numberedPosition");
	public static final Resource EmployeeRole = ResourceFactory.createResource("http://schema.org/EmployeeRole");
	public static final Property arrivalAirport = ResourceFactory.createProperty("http://schema.org/arrivalAirport");
	public static final Property yearsInOperation = ResourceFactory
			.createProperty("http://schema.org/yearsInOperation");
	public static final Property characterAttribute = ResourceFactory
			.createProperty("http://schema.org/characterAttribute");
	public static final Resource WPHeader = ResourceFactory.createResource("http://schema.org/WPHeader");
	public static final Property orderDate = ResourceFactory.createProperty("http://schema.org/orderDate");
	public static final Property ingredients = ResourceFactory.createProperty("http://schema.org/ingredients");
	public static final Resource CookAction = ResourceFactory.createResource("http://schema.org/CookAction");
	public static final Resource Conversation = ResourceFactory.createResource("http://schema.org/Conversation");
	public static final Resource Hardcover = ResourceFactory.createResource("http://schema.org/Hardcover");
	public static final Resource AdministrativeArea = ResourceFactory
			.createResource("http://schema.org/AdministrativeArea");
	public static final Resource FollowAction = ResourceFactory.createResource("http://schema.org/FollowAction");
	public static final Resource SeatingMap = ResourceFactory.createResource("http://schema.org/SeatingMap");
	public static final Property includedComposition = ResourceFactory
			.createProperty("http://schema.org/includedComposition");
	public static final Property isVariantOf = ResourceFactory.createProperty("http://schema.org/isVariantOf");
	public static final Property foodEvent = ResourceFactory.createProperty("http://schema.org/foodEvent");
	public static final Property availableThrough = ResourceFactory
			.createProperty("http://schema.org/availableThrough");
	public static final Property borrower = ResourceFactory.createProperty("http://schema.org/borrower");
	public static final Resource SomeProducts = ResourceFactory.createResource("http://schema.org/SomeProducts");
	public static final Resource TireShop = ResourceFactory.createResource("http://schema.org/TireShop");
	public static final Property expectsAcceptanceOf = ResourceFactory
			.createProperty("http://schema.org/expectsAcceptanceOf");
	public static final Property datePublished = ResourceFactory.createProperty("http://schema.org/datePublished");
	public static final Property artworkSurface = ResourceFactory.createProperty("http://schema.org/artworkSurface");
	public static final Property artMedium = ResourceFactory.createProperty("http://schema.org/artMedium");
	public static final Property educationalAlignment = ResourceFactory
			.createProperty("http://schema.org/educationalAlignment");
	public static final Property releasedEvent = ResourceFactory.createProperty("http://schema.org/releasedEvent");
	public static final Resource EventScheduled = ResourceFactory.createResource("http://schema.org/EventScheduled");
	public static final Resource DeliveryMethod = ResourceFactory.createResource("http://schema.org/DeliveryMethod");
	public static final Resource Reservoir = ResourceFactory.createResource("http://schema.org/Reservoir");
	public static final Resource NightClub = ResourceFactory.createResource("http://schema.org/NightClub");
	public static final Property estimatedFlightDuration = ResourceFactory
			.createProperty("http://schema.org/estimatedFlightDuration");
	public static final Property urlTemplate = ResourceFactory.createProperty("http://schema.org/urlTemplate");
	public static final Resource Continent = ResourceFactory.createResource("http://schema.org/Continent");
	public static final Resource Preschool = ResourceFactory.createResource("http://schema.org/Preschool");
	public static final Property participant = ResourceFactory.createProperty("http://schema.org/participant");
	public static final Property billingIncrement = ResourceFactory
			.createProperty("http://schema.org/billingIncrement");
	public static final Property yield = ResourceFactory.createProperty("http://schema.org/yield");
	public static final Resource AutomotiveBusiness = ResourceFactory
			.createResource("http://schema.org/AutomotiveBusiness");
	public static final Resource EBook = ResourceFactory.createResource("http://schema.org/EBook");
	public static final Property toLocation = ResourceFactory.createProperty("http://schema.org/toLocation");
	public static final Resource Energy = ResourceFactory.createResource("http://schema.org/Energy");
	public static final Property suitableForDiet = ResourceFactory.createProperty("http://schema.org/suitableForDiet");
	public static final Property publishingPrinciples = ResourceFactory
			.createProperty("http://schema.org/publishingPrinciples");
	public static final Resource ReservationConfirmed = ResourceFactory
			.createResource("http://schema.org/ReservationConfirmed");
	public static final Resource SendAction = ResourceFactory.createResource("http://schema.org/SendAction");
	public static final Property device = ResourceFactory.createProperty("http://schema.org/device");
	public static final Resource Season = ResourceFactory.createResource("http://schema.org/Season");
	public static final Property actors = ResourceFactory.createProperty("http://schema.org/actors");
	public static final Property childMaxAge = ResourceFactory.createProperty("http://schema.org/childMaxAge");
	public static final Resource AutoPartsStore = ResourceFactory.createResource("http://schema.org/AutoPartsStore");
	public static final Resource HinduTemple = ResourceFactory.createResource("http://schema.org/HinduTemple");
	public static final Property bookEdition = ResourceFactory.createProperty("http://schema.org/bookEdition");
	public static final Property videoFormat = ResourceFactory.createProperty("http://schema.org/videoFormat");
	public static final Property description = ResourceFactory.createProperty("http://schema.org/description");
	public static final Property printColumn = ResourceFactory.createProperty("http://schema.org/printColumn");
	public static final Property validThrough = ResourceFactory.createProperty("http://schema.org/validThrough");
	public static final Property cargoVolume = ResourceFactory.createProperty("http://schema.org/cargoVolume");
	public static final Resource Sculpture = ResourceFactory.createResource("http://schema.org/Sculpture");
	public static final Resource Series = ResourceFactory.createResource("http://schema.org/Series");
	public static final Property members = ResourceFactory.createProperty("http://schema.org/members");
	public static final Property broadcastChannelId = ResourceFactory
			.createProperty("http://schema.org/broadcastChannelId");
	public static final Resource MotorcycleRepair = ResourceFactory
			.createResource("http://schema.org/MotorcycleRepair");
	public static final Property numberOfEpisodes = ResourceFactory
			.createProperty("http://schema.org/numberOfEpisodes");
	public static final Property percentile75 = ResourceFactory.createProperty("http://schema.org/percentile75");
	public static final Resource BuddhistTemple = ResourceFactory.createResource("http://schema.org/BuddhistTemple");
	public static final Property operatingSystem = ResourceFactory.createProperty("http://schema.org/operatingSystem");
	public static final Resource CreativeWorkSeason = ResourceFactory
			.createResource("http://schema.org/CreativeWorkSeason");
	public static final Resource CreativeWorkSeries = ResourceFactory
			.createResource("http://schema.org/CreativeWorkSeries");
	public static final Property applicationSubCategory = ResourceFactory
			.createProperty("http://schema.org/applicationSubCategory");
	public static final Resource PaymentMethod = ResourceFactory.createResource("http://schema.org/PaymentMethod");
	public static final Property departureTime = ResourceFactory.createProperty("http://schema.org/departureTime");
	public static final Property offeredBy = ResourceFactory.createProperty("http://schema.org/offeredBy");
	public static final Property featureList = ResourceFactory.createProperty("http://schema.org/featureList");
	public static final Resource AutoWash = ResourceFactory.createResource("http://schema.org/AutoWash");
	public static final Resource PaymentPastDue = ResourceFactory.createResource("http://schema.org/PaymentPastDue");
	public static final Property endorsee = ResourceFactory.createProperty("http://schema.org/endorsee");
	public static final Property dropoffTime = ResourceFactory.createProperty("http://schema.org/dropoffTime");
	public static final Property expectedArrivalFrom = ResourceFactory
			.createProperty("http://schema.org/expectedArrivalFrom");
	public static final Property musicCompositionForm = ResourceFactory
			.createProperty("http://schema.org/musicCompositionForm");
	public static final Property feesAndCommissionsSpecification = ResourceFactory
			.createProperty("http://schema.org/feesAndCommissionsSpecification");
	public static final Property locationCreated = ResourceFactory.createProperty("http://schema.org/locationCreated");
	public static final Resource SingleRelease = ResourceFactory.createResource("http://schema.org/SingleRelease");
	public static final Resource AutomatedTeller = ResourceFactory.createResource("http://schema.org/AutomatedTeller");
	public static final Property percentile10 = ResourceFactory.createProperty("http://schema.org/percentile10");
	public static final Property discountCurrency = ResourceFactory
			.createProperty("http://schema.org/discountCurrency");
	public static final Resource Attorney = ResourceFactory.createResource("http://schema.org/Attorney");
	public static final Resource TravelAction = ResourceFactory.createResource("http://schema.org/TravelAction");
	public static final Property speakable = ResourceFactory.createProperty("http://schema.org/speakable");
	public static final Resource ServiceChannel = ResourceFactory.createResource("http://schema.org/ServiceChannel");
	public static final Resource PublicationVolume = ResourceFactory
			.createResource("http://schema.org/PublicationVolume");
	public static final Property passengerPriorityStatus = ResourceFactory
			.createProperty("http://schema.org/passengerPriorityStatus");
	public static final Resource Thursday = ResourceFactory.createResource("http://schema.org/Thursday");
	public static final Resource NailSalon = ResourceFactory.createResource("http://schema.org/NailSalon");
	public static final Resource RegisterAction = ResourceFactory.createResource("http://schema.org/RegisterAction");
	public static final Property includedInDataCatalog = ResourceFactory
			.createProperty("http://schema.org/includedInDataCatalog");
	public static final Resource ItemListOrderAscending = ResourceFactory
			.createResource("http://schema.org/ItemListOrderAscending");
	public static final Property attendees = ResourceFactory.createProperty("http://schema.org/attendees");
	public static final Property headline = ResourceFactory.createProperty("http://schema.org/headline");
	public static final Resource CreativeWork = ResourceFactory.createResource("http://schema.org/CreativeWork");
	public static final Property reviewBody = ResourceFactory.createProperty("http://schema.org/reviewBody");
	public static final Resource SubwayStation = ResourceFactory.createResource("http://schema.org/SubwayStation");
	public static final Resource BusTrip = ResourceFactory.createResource("http://schema.org/BusTrip");
	public static final Property geoDisjoint = ResourceFactory.createProperty("http://schema.org/geoDisjoint");
	public static final Resource CompletedActionStatus = ResourceFactory
			.createResource("http://schema.org/CompletedActionStatus");
	public static final Property articleSection = ResourceFactory.createProperty("http://schema.org/articleSection");
	public static final Property follows = ResourceFactory.createProperty("http://schema.org/follows");
	public static final Resource City = ResourceFactory.createResource("http://schema.org/City");
	public static final Property priceCurrency = ResourceFactory.createProperty("http://schema.org/priceCurrency");
	public static final Resource Beach = ResourceFactory.createResource("http://schema.org/Beach");
	public static final Resource AssignAction = ResourceFactory.createResource("http://schema.org/AssignAction");
	public static final Resource OrderAction = ResourceFactory.createResource("http://schema.org/OrderAction");
	public static final Resource MedicalOrganization = ResourceFactory
			.createResource("http://schema.org/MedicalOrganization");
	public static final Resource LowCalorieDiet = ResourceFactory.createResource("http://schema.org/LowCalorieDiet");
	public static final Property programName = ResourceFactory.createProperty("http://schema.org/programName");
	public static final Property productionCompany = ResourceFactory
			.createProperty("http://schema.org/productionCompany");
	public static final Resource GeoShape = ResourceFactory.createResource("http://schema.org/GeoShape");
	public static final Resource WinAction = ResourceFactory.createResource("http://schema.org/WinAction");
	public static final Property itemListElement = ResourceFactory.createProperty("http://schema.org/itemListElement");
	public static final Property originAddress = ResourceFactory.createProperty("http://schema.org/originAddress");
	public static final Property smokingAllowed = ResourceFactory.createProperty("http://schema.org/smokingAllowed");
	public static final Property serviceArea = ResourceFactory.createProperty("http://schema.org/serviceArea");
	public static final Property departureBusStop = ResourceFactory
			.createProperty("http://schema.org/departureBusStop");
	public static final Property scheduledPaymentDate = ResourceFactory
			.createProperty("http://schema.org/scheduledPaymentDate");
	public static final Resource SportsActivityLocation = ResourceFactory
			.createResource("http://schema.org/SportsActivityLocation");
	public static final Resource OnSitePickup = ResourceFactory.createResource("http://schema.org/OnSitePickup");
	public static final Property baseSalary = ResourceFactory.createProperty("http://schema.org/baseSalary");
	public static final Property recipeIngredient = ResourceFactory
			.createProperty("http://schema.org/recipeIngredient");
	public static final Property playMode = ResourceFactory.createProperty("http://schema.org/playMode");
	public static final Property worksFor = ResourceFactory.createProperty("http://schema.org/worksFor");
	public static final Property image = ResourceFactory.createProperty("http://schema.org/image");
	public static final Property trackingUrl = ResourceFactory.createProperty("http://schema.org/trackingUrl");
	public static final Resource Episode = ResourceFactory.createResource("http://schema.org/Episode");
	public static final Property inPlaylist = ResourceFactory.createProperty("http://schema.org/inPlaylist");
	public static final Resource DepositAccount = ResourceFactory.createResource("http://schema.org/DepositAccount");
	public static final Resource DeactivateAction = ResourceFactory
			.createResource("http://schema.org/DeactivateAction");
	public static final Resource ShareAction = ResourceFactory.createResource("http://schema.org/ShareAction");
	public static final Resource MusicPlaylist = ResourceFactory.createResource("http://schema.org/MusicPlaylist");
	public static final Property numberOfSeasons = ResourceFactory.createProperty("http://schema.org/numberOfSeasons");
	public static final Property deliveryStatus = ResourceFactory.createProperty("http://schema.org/deliveryStatus");
	public static final Property valueMaxLength = ResourceFactory.createProperty("http://schema.org/valueMaxLength");
	public static final Resource TattooParlor = ResourceFactory.createResource("http://schema.org/TattooParlor");
	public static final Property issuedThrough = ResourceFactory.createProperty("http://schema.org/issuedThrough");
	public static final Resource DigitalFormat = ResourceFactory.createResource("http://schema.org/DigitalFormat");
	public static final Resource Hostel = ResourceFactory.createResource("http://schema.org/Hostel");
	public static final Property arrivalBusStop = ResourceFactory.createProperty("http://schema.org/arrivalBusStop");
	public static final Resource ImageObject = ResourceFactory.createResource("http://schema.org/ImageObject");
	public static final Property alternateName = ResourceFactory.createProperty("http://schema.org/alternateName");
	public static final Property broadcastServiceTier = ResourceFactory
			.createProperty("http://schema.org/broadcastServiceTier");
	public static final Resource RightHandDriving = ResourceFactory
			.createResource("http://schema.org/RightHandDriving");
	public static final Resource ArriveAction = ResourceFactory.createResource("http://schema.org/ArriveAction");
	public static final Resource MovieSeries = ResourceFactory.createResource("http://schema.org/MovieSeries");
	public static final Property recipeCuisine = ResourceFactory.createProperty("http://schema.org/recipeCuisine");
	public static final Property eligibleTransactionVolume = ResourceFactory
			.createProperty("http://schema.org/eligibleTransactionVolume");
	public static final Property dateline = ResourceFactory.createProperty("http://schema.org/dateline");
	public static final Property line = ResourceFactory.createProperty("http://schema.org/line");
	public static final Property numberOfPages = ResourceFactory.createProperty("http://schema.org/numberOfPages");
	public static final Property distribution = ResourceFactory.createProperty("http://schema.org/distribution");
	public static final Property breadcrumb = ResourceFactory.createProperty("http://schema.org/breadcrumb");
	public static final Property coursePrerequisites = ResourceFactory
			.createProperty("http://schema.org/coursePrerequisites");
	public static final Property availabilityEnds = ResourceFactory
			.createProperty("http://schema.org/availabilityEnds");
	public static final Property exifData = ResourceFactory.createProperty("http://schema.org/exifData");
	public static final Property messageAttachment = ResourceFactory
			.createProperty("http://schema.org/messageAttachment");
	public static final Resource PostalAddress = ResourceFactory.createResource("http://schema.org/PostalAddress");
	public static final Property iswcCode = ResourceFactory.createProperty("http://schema.org/iswcCode");
	public static final Resource DVDFormat = ResourceFactory.createResource("http://schema.org/DVDFormat");
	public static final Resource HinduDiet = ResourceFactory.createResource("http://schema.org/HinduDiet");
	public static final Resource FinancialProduct = ResourceFactory
			.createResource("http://schema.org/FinancialProduct");
	public static final Property videoFrameSize = ResourceFactory.createProperty("http://schema.org/videoFrameSize");
	public static final Resource School = ResourceFactory.createResource("http://schema.org/School");
	public static final Resource PropertyValue = ResourceFactory.createResource("http://schema.org/PropertyValue");
	public static final Resource BookStore = ResourceFactory.createResource("http://schema.org/BookStore");
	public static final Property isPartOf = ResourceFactory.createProperty("http://schema.org/isPartOf");
	public static final Property suggestedGender = ResourceFactory.createProperty("http://schema.org/suggestedGender");
	public static final Property license = ResourceFactory.createProperty("http://schema.org/license");
	public static final Property ratingCount = ResourceFactory.createProperty("http://schema.org/ratingCount");
	public static final Resource SelfStorage = ResourceFactory.createResource("http://schema.org/SelfStorage");
	public static final Property departureStation = ResourceFactory
			.createProperty("http://schema.org/departureStation");
	public static final Property query = ResourceFactory.createProperty("http://schema.org/query");
	public static final Resource Offer = ResourceFactory.createResource("http://schema.org/Offer");
	public static final Property providesService = ResourceFactory.createProperty("http://schema.org/providesService");
	public static final Resource Order = ResourceFactory.createResource("http://schema.org/Order");
	public static final Resource VideoGallery = ResourceFactory.createResource("http://schema.org/VideoGallery");
	public static final Resource DriveWheelConfigurationValue = ResourceFactory
			.createResource("http://schema.org/DriveWheelConfigurationValue");
	public static final Property schemaVersion = ResourceFactory.createProperty("http://schema.org/schemaVersion");
	public static final Property nonEqual = ResourceFactory.createProperty("http://schema.org/nonEqual");
	public static final Property catalogNumber = ResourceFactory.createProperty("http://schema.org/catalogNumber");
	public static final Property saturatedFatContent = ResourceFactory
			.createProperty("http://schema.org/saturatedFatContent");
	public static final Property discount = ResourceFactory.createProperty("http://schema.org/discount");
	public static final Property departureGate = ResourceFactory.createProperty("http://schema.org/departureGate");
	public static final Property arrivalStation = ResourceFactory.createProperty("http://schema.org/arrivalStation");
	public static final Property median = ResourceFactory.createProperty("http://schema.org/median");
	public static final Property recordedIn = ResourceFactory.createProperty("http://schema.org/recordedIn");
	public static final Resource MixtapeAlbum = ResourceFactory.createResource("http://schema.org/MixtapeAlbum");
	public static final Resource ReservationPackage = ResourceFactory
			.createResource("http://schema.org/ReservationPackage");
	public static final Property events = ResourceFactory.createProperty("http://schema.org/events");
	public static final Property cookTime = ResourceFactory.createProperty("http://schema.org/cookTime");
	public static final Resource Restaurant = ResourceFactory.createResource("http://schema.org/Restaurant");
	public static final Resource Suite = ResourceFactory.createResource("http://schema.org/Suite");
	public static final Resource HalalDiet = ResourceFactory.createResource("http://schema.org/HalalDiet");
	public static final Resource Dentist = ResourceFactory.createResource("http://schema.org/Dentist");
	public static final Property serialNumber = ResourceFactory.createProperty("http://schema.org/serialNumber");
	public static final Property targetProduct = ResourceFactory.createProperty("http://schema.org/targetProduct");
	public static final Resource MusicVenue = ResourceFactory.createResource("http://schema.org/MusicVenue");
	public static final Property releaseDate = ResourceFactory.createProperty("http://schema.org/releaseDate");
	public static final Property downloadUrl = ResourceFactory.createProperty("http://schema.org/downloadUrl");
	public static final Property gameItem = ResourceFactory.createProperty("http://schema.org/gameItem");
	public static final Resource Casino = ResourceFactory.createResource("http://schema.org/Casino");
	public static final Resource Blog = ResourceFactory.createResource("http://schema.org/Blog");
	public static final Resource PaymentDue = ResourceFactory.createResource("http://schema.org/PaymentDue");
	public static final Resource RestrictedDiet = ResourceFactory.createResource("http://schema.org/RestrictedDiet");
	public static final Resource PerformingArtsTheater = ResourceFactory
			.createResource("http://schema.org/PerformingArtsTheater");
	public static final Resource ZoneBoardingPolicy = ResourceFactory
			.createResource("http://schema.org/ZoneBoardingPolicy");
	public static final Resource GovernmentService = ResourceFactory
			.createResource("http://schema.org/GovernmentService");
	public static final Property programMembershipUsed = ResourceFactory
			.createProperty("http://schema.org/programMembershipUsed");
	public static final Property birthDate = ResourceFactory.createProperty("http://schema.org/birthDate");
	public static final Property endTime = ResourceFactory.createProperty("http://schema.org/endTime");
	public static final Property width = ResourceFactory.createProperty("http://schema.org/width");
	public static final Property worstRating = ResourceFactory.createProperty("http://schema.org/worstRating");
	public static final Resource MotorcycleDealer = ResourceFactory
			.createResource("http://schema.org/MotorcycleDealer");
	public static final Resource FurnitureStore = ResourceFactory.createResource("http://schema.org/FurnitureStore");
	public static final Resource EatAction = ResourceFactory.createResource("http://schema.org/EatAction");
	public static final Property arrivalPlatform = ResourceFactory.createProperty("http://schema.org/arrivalPlatform");
	public static final Resource OrderReturned = ResourceFactory.createResource("http://schema.org/OrderReturned");
	public static final Property hasOfferCatalog = ResourceFactory.createProperty("http://schema.org/hasOfferCatalog");
	public static final Property price = ResourceFactory.createProperty("http://schema.org/price");
	public static final Resource MenuItem = ResourceFactory.createResource("http://schema.org/MenuItem");
	public static final Property browserRequirements = ResourceFactory
			.createProperty("http://schema.org/browserRequirements");
	public static final Property subEvent = ResourceFactory.createProperty("http://schema.org/subEvent");
	public static final Resource MenuSection = ResourceFactory.createResource("http://schema.org/MenuSection");
	public static final Property employee = ResourceFactory.createProperty("http://schema.org/employee");
	public static final Property catalog = ResourceFactory.createProperty("http://schema.org/catalog");
	public static final Property specialOpeningHoursSpecification = ResourceFactory
			.createProperty("http://schema.org/specialOpeningHoursSpecification");
	public static final Property priceSpecification = ResourceFactory
			.createProperty("http://schema.org/priceSpecification");
	public static final Resource CourseInstance = ResourceFactory.createResource("http://schema.org/CourseInstance");
	public static final Property vehicleEngine = ResourceFactory.createProperty("http://schema.org/vehicleEngine");
	public static final Property warranty = ResourceFactory.createProperty("http://schema.org/warranty");
	public static final Property isAccessoryOrSparePartFor = ResourceFactory
			.createProperty("http://schema.org/isAccessoryOrSparePartFor");
	public static final Resource TVSeries = ResourceFactory.createResource("http://schema.org/TVSeries");
	public static final Resource URL = ResourceFactory.createResource("http://schema.org/URL");
	public static final Resource Event = ResourceFactory.createResource("http://schema.org/Event");
	public static final Property availableLanguage = ResourceFactory
			.createProperty("http://schema.org/availableLanguage");
	public static final Property valueAddedTaxIncluded = ResourceFactory
			.createProperty("http://schema.org/valueAddedTaxIncluded");
	public static final Property isrcCode = ResourceFactory.createProperty("http://schema.org/isrcCode");
	public static final Property makesOffer = ResourceFactory.createProperty("http://schema.org/makesOffer");
	public static final Property busNumber = ResourceFactory.createProperty("http://schema.org/busNumber");
	public static final Property accessibilityHazard = ResourceFactory
			.createProperty("http://schema.org/accessibilityHazard");
	public static final Property addOn = ResourceFactory.createProperty("http://schema.org/addOn");
	public static final Property numberOfDoors = ResourceFactory.createProperty("http://schema.org/numberOfDoors");
	public static final Property reservationId = ResourceFactory.createProperty("http://schema.org/reservationId");
	public static final Resource Female = ResourceFactory.createResource("http://schema.org/Female");
	public static final Property orderItemNumber = ResourceFactory.createProperty("http://schema.org/orderItemNumber");
	public static final Resource ViewAction = ResourceFactory.createResource("http://schema.org/ViewAction");
	public static final Resource Paperback = ResourceFactory.createResource("http://schema.org/Paperback");
	public static final Property genre = ResourceFactory.createProperty("http://schema.org/genre");
	public static final Property circle = ResourceFactory.createProperty("http://schema.org/circle");
	public static final Property paymentAccepted = ResourceFactory.createProperty("http://schema.org/paymentAccepted");
	public static final Property resultComment = ResourceFactory.createProperty("http://schema.org/resultComment");
	public static final Resource QAPage = ResourceFactory.createResource("http://schema.org/QAPage");
	public static final Property alternativeHeadline = ResourceFactory
			.createProperty("http://schema.org/alternativeHeadline");
	public static final Resource LowSaltDiet = ResourceFactory.createResource("http://schema.org/LowSaltDiet");
	public static final Property reviewCount = ResourceFactory.createProperty("http://schema.org/reviewCount");
	public static final Property thumbnailUrl = ResourceFactory.createProperty("http://schema.org/thumbnailUrl");
	public static final Property partOfTVSeries = ResourceFactory.createProperty("http://schema.org/partOfTVSeries");
	public static final Property seatingType = ResourceFactory.createProperty("http://schema.org/seatingType");
	public static final Property applicationSuite = ResourceFactory
			.createProperty("http://schema.org/applicationSuite");
	public static final Resource FailedActionStatus = ResourceFactory
			.createResource("http://schema.org/FailedActionStatus");
	public static final Property assembly = ResourceFactory.createProperty("http://schema.org/assembly");
	public static final Resource Brand = ResourceFactory.createResource("http://schema.org/Brand");
	public static final Property agent = ResourceFactory.createProperty("http://schema.org/agent");
	public static final Property dateVehicleFirstRegistered = ResourceFactory
			.createProperty("http://schema.org/dateVehicleFirstRegistered");
	public static final Property slogan = ResourceFactory.createProperty("http://schema.org/slogan");
	public static final Property dateSent = ResourceFactory.createProperty("http://schema.org/dateSent");
	public static final Resource MusicAlbumProductionType = ResourceFactory
			.createResource("http://schema.org/MusicAlbumProductionType");
	public static final Property albumRelease = ResourceFactory.createProperty("http://schema.org/albumRelease");
	public static final Property hasPOS = ResourceFactory.createProperty("http://schema.org/hasPOS");
	public static final Resource UserPageVisits = ResourceFactory.createResource("http://schema.org/UserPageVisits");
	public static final Property productSupported = ResourceFactory
			.createProperty("http://schema.org/productSupported");
	public static final Property checkinTime = ResourceFactory.createProperty("http://schema.org/checkinTime");
	public static final Resource BorrowAction = ResourceFactory.createResource("http://schema.org/BorrowAction");
	public static final Property vehicleInteriorType = ResourceFactory
			.createProperty("http://schema.org/vehicleInteriorType");
	public static final Resource Movie = ResourceFactory.createResource("http://schema.org/Movie");
	public static final Resource StadiumOrArena = ResourceFactory.createResource("http://schema.org/StadiumOrArena");
	public static final Resource UpdateAction = ResourceFactory.createResource("http://schema.org/UpdateAction");
	public static final Resource UserInteraction = ResourceFactory.createResource("http://schema.org/UserInteraction");
	public static final Resource EventStatusType = ResourceFactory.createResource("http://schema.org/EventStatusType");
	public static final Property defaultValue = ResourceFactory.createProperty("http://schema.org/defaultValue");
	public static final Resource Photograph = ResourceFactory.createResource("http://schema.org/Photograph");
	public static final Property episodeNumber = ResourceFactory.createProperty("http://schema.org/episodeNumber");
	public static final Resource MovieTheater = ResourceFactory.createResource("http://schema.org/MovieTheater");
	public static final Property priceType = ResourceFactory.createProperty("http://schema.org/priceType");
	public static final Resource Landform = ResourceFactory.createResource("http://schema.org/Landform");
	public static final Property bitrate = ResourceFactory.createProperty("http://schema.org/bitrate");
	public static final Resource GeoCoordinates = ResourceFactory.createResource("http://schema.org/GeoCoordinates");
	public static final Property dataset = ResourceFactory.createProperty("http://schema.org/dataset");
	public static final Property siblings = ResourceFactory.createProperty("http://schema.org/siblings");
	public static final Resource UserComments = ResourceFactory.createResource("http://schema.org/UserComments");
	public static final Resource RecyclingCenter = ResourceFactory.createResource("http://schema.org/RecyclingCenter");
	public static final Property vehicleTransmission = ResourceFactory
			.createProperty("http://schema.org/vehicleTransmission");
	public static final Property editor = ResourceFactory.createProperty("http://schema.org/editor");
	public static final Resource DataFeedItem = ResourceFactory.createResource("http://schema.org/DataFeedItem");
	public static final Property containsSeason = ResourceFactory.createProperty("http://schema.org/containsSeason");
	public static final Property sportsTeam = ResourceFactory.createProperty("http://schema.org/sportsTeam");
	public static final Property modifiedTime = ResourceFactory.createProperty("http://schema.org/modifiedTime");
	public static final Resource TVClip = ResourceFactory.createResource("http://schema.org/TVClip");
	public static final Resource Boolean = ResourceFactory.createResource("http://schema.org/Boolean");
	public static final Property printPage = ResourceFactory.createProperty("http://schema.org/printPage");
	public static final Property about = ResourceFactory.createProperty("http://schema.org/about");
	public static final Resource PreOrder = ResourceFactory.createResource("http://schema.org/PreOrder");
	public static final Property arrivalGate = ResourceFactory.createProperty("http://schema.org/arrivalGate");
	public static final Resource TravelAgency = ResourceFactory.createResource("http://schema.org/TravelAgency");
	public static final Resource ClothingStore = ResourceFactory.createResource("http://schema.org/ClothingStore");
	public static final Property trainNumber = ResourceFactory.createProperty("http://schema.org/trainNumber");
	public static final Resource DigitalDocument = ResourceFactory.createResource("http://schema.org/DigitalDocument");
	public static final Resource AlignmentObject = ResourceFactory.createResource("http://schema.org/AlignmentObject");
	public static final Resource MusicReleaseFormatType = ResourceFactory
			.createResource("http://schema.org/MusicReleaseFormatType");
	public static final Resource PublicationIssue = ResourceFactory
			.createResource("http://schema.org/PublicationIssue");
	public static final Property audio = ResourceFactory.createProperty("http://schema.org/audio");
	public static final Property numAdults = ResourceFactory.createProperty("http://schema.org/numAdults");
	public static final Property answerCount = ResourceFactory.createProperty("http://schema.org/answerCount");
	public static final Resource AutoRental = ResourceFactory.createResource("http://schema.org/AutoRental");
	public static final Resource Seat = ResourceFactory.createResource("http://schema.org/Seat");
	public static final Property sportsActivityLocation = ResourceFactory
			.createProperty("http://schema.org/sportsActivityLocation");
	public static final Property steps = ResourceFactory.createProperty("http://schema.org/steps");
	public static final Property contentLocation = ResourceFactory.createProperty("http://schema.org/contentLocation");
	public static final Property surface = ResourceFactory.createProperty("http://schema.org/surface");
	public static final Resource TradeAction = ResourceFactory.createResource("http://schema.org/TradeAction");
	public static final Resource RefurbishedCondition = ResourceFactory
			.createResource("http://schema.org/RefurbishedCondition");
	public static final Property elevation = ResourceFactory.createProperty("http://schema.org/elevation");
	public static final Property loanTerm = ResourceFactory.createProperty("http://schema.org/loanTerm");
	public static final Resource BeautySalon = ResourceFactory.createResource("http://schema.org/BeautySalon");
	public static final Resource ComputerLanguage = ResourceFactory
			.createResource("http://schema.org/ComputerLanguage");
	public static final Property nationality = ResourceFactory.createProperty("http://schema.org/nationality");
	public static final Resource Courthouse = ResourceFactory.createResource("http://schema.org/Courthouse");
	public static final Property targetName = ResourceFactory.createProperty("http://schema.org/targetName");
	public static final Property subOrganization = ResourceFactory.createProperty("http://schema.org/subOrganization");
	public static final Property annualPercentageRate = ResourceFactory
			.createProperty("http://schema.org/annualPercentageRate");
	public static final Resource DanceEvent = ResourceFactory.createResource("http://schema.org/DanceEvent");
	public static final Resource PawnShop = ResourceFactory.createResource("http://schema.org/PawnShop");
	public static final Resource SoundtrackAlbum = ResourceFactory.createResource("http://schema.org/SoundtrackAlbum");
	public static final Resource LiteraryEvent = ResourceFactory.createResource("http://schema.org/LiteraryEvent");
	public static final Resource AggregateOffer = ResourceFactory.createResource("http://schema.org/AggregateOffer");
	public static final Resource SkiResort = ResourceFactory.createResource("http://schema.org/SkiResort");
	public static final Property vehicleIdentificationNumber = ResourceFactory
			.createProperty("http://schema.org/vehicleIdentificationNumber");
	public static final Property departureTerminal = ResourceFactory
			.createProperty("http://schema.org/departureTerminal");
	public static final Property departureAirport = ResourceFactory
			.createProperty("http://schema.org/departureAirport");
	public static final Property totalPrice = ResourceFactory.createProperty("http://schema.org/totalPrice");
	public static final Property mapType = ResourceFactory.createProperty("http://schema.org/mapType");
	public static final Property recipe = ResourceFactory.createProperty("http://schema.org/recipe");
	public static final Property occupationLocation = ResourceFactory
			.createProperty("http://schema.org/occupationLocation");
	public static final Property musicReleaseFormat = ResourceFactory
			.createProperty("http://schema.org/musicReleaseFormat");
	public static final Resource MonetaryAmount = ResourceFactory.createResource("http://schema.org/MonetaryAmount");
	public static final Resource PoliceStation = ResourceFactory.createResource("http://schema.org/PoliceStation");
	public static final Resource SportsEvent = ResourceFactory.createResource("http://schema.org/SportsEvent");
	public static final Resource Mosque = ResourceFactory.createResource("http://schema.org/Mosque");
	public static final Property recipeYield = ResourceFactory.createProperty("http://schema.org/recipeYield");
	public static final Resource Quantity = ResourceFactory.createResource("http://schema.org/Quantity");
	public static final Property foundingDate = ResourceFactory.createProperty("http://schema.org/foundingDate");
	public static final Property subReservation = ResourceFactory.createProperty("http://schema.org/subReservation");
	public static final Resource Hospital = ResourceFactory.createResource("http://schema.org/Hospital");
	public static final Resource Question = ResourceFactory.createResource("http://schema.org/Question");
	public static final Resource Cemetery = ResourceFactory.createResource("http://schema.org/Cemetery");
	public static final Resource LocalBusiness = ResourceFactory.createResource("http://schema.org/LocalBusiness");
	public static final Property dayOfWeek = ResourceFactory.createProperty("http://schema.org/dayOfWeek");
	public static final Resource BroadcastFrequencySpecification = ResourceFactory
			.createResource("http://schema.org/BroadcastFrequencySpecification");
	public static final Resource BlogPosting = ResourceFactory.createResource("http://schema.org/BlogPosting");
	public static final Property commentText = ResourceFactory.createProperty("http://schema.org/commentText");
	public static final Property itemListOrder = ResourceFactory.createProperty("http://schema.org/itemListOrder");
	public static final Resource LikeAction = ResourceFactory.createResource("http://schema.org/LikeAction");
	public static final Resource LendAction = ResourceFactory.createResource("http://schema.org/LendAction");
	public static final Resource Corporation = ResourceFactory.createResource("http://schema.org/Corporation");
	public static final Property naics = ResourceFactory.createProperty("http://schema.org/naics");
	public static final Resource ScholarlyArticle = ResourceFactory
			.createResource("http://schema.org/ScholarlyArticle");
	public static final Resource Wednesday = ResourceFactory.createResource("http://schema.org/Wednesday");
	public static final Resource Action = ResourceFactory.createResource("http://schema.org/Action");
	public static final Property potentialAction = ResourceFactory.createProperty("http://schema.org/potentialAction");
	public static final Resource ChildCare = ResourceFactory.createResource("http://schema.org/ChildCare");
	public static final Property businessFunction = ResourceFactory
			.createProperty("http://schema.org/businessFunction");
	public static final Resource AuthorizeAction = ResourceFactory.createResource("http://schema.org/AuthorizeAction");
	public static final Resource TakeAction = ResourceFactory.createResource("http://schema.org/TakeAction");
	public static final Property storageRequirements = ResourceFactory
			.createProperty("http://schema.org/storageRequirements");
	public static final Property audienceType = ResourceFactory.createProperty("http://schema.org/audienceType");
	public static final Property serviceOutput = ResourceFactory.createProperty("http://schema.org/serviceOutput");
	public static final Resource HousePainter = ResourceFactory.createResource("http://schema.org/HousePainter");
	public static final Property deliveryLeadTime = ResourceFactory
			.createProperty("http://schema.org/deliveryLeadTime");
	public static final Property realEstateAgent = ResourceFactory.createProperty("http://schema.org/realEstateAgent");
	public static final Resource OfflineTemporarily = ResourceFactory
			.createResource("http://schema.org/OfflineTemporarily");
	public static final Property geographicArea = ResourceFactory.createProperty("http://schema.org/geographicArea");
	public static final Property suggestedMaxAge = ResourceFactory.createProperty("http://schema.org/suggestedMaxAge");
	public static final Resource BroadcastChannel = ResourceFactory
			.createResource("http://schema.org/BroadcastChannel");
	public static final Property actionAccessibilityRequirement = ResourceFactory
			.createProperty("http://schema.org/actionAccessibilityRequirement");
	public static final Property location = ResourceFactory.createProperty("http://schema.org/location");
	public static final Property requiredMinAge = ResourceFactory.createProperty("http://schema.org/requiredMinAge");
	public static final Resource HealthAndBeautyBusiness = ResourceFactory
			.createResource("http://schema.org/HealthAndBeautyBusiness");
	public static final Resource ShoeStore = ResourceFactory.createResource("http://schema.org/ShoeStore");
	public static final Property cssSelector = ResourceFactory.createProperty("http://schema.org/cssSelector");
	public static final Resource HomeGoodsStore = ResourceFactory.createResource("http://schema.org/HomeGoodsStore");
	public static final Property musicGroupMember = ResourceFactory
			.createProperty("http://schema.org/musicGroupMember");
	public static final Resource UsedCondition = ResourceFactory.createResource("http://schema.org/UsedCondition");
	public static final Property boardingPolicy = ResourceFactory.createProperty("http://schema.org/boardingPolicy");
	public static final Resource MusicEvent = ResourceFactory.createResource("http://schema.org/MusicEvent");
	public static final Property hasCourseInstance = ResourceFactory
			.createProperty("http://schema.org/hasCourseInstance");
	public static final Property text = ResourceFactory.createProperty("http://schema.org/text");
	public static final Property servicePhone = ResourceFactory.createProperty("http://schema.org/servicePhone");
	public static final Resource Winery = ResourceFactory.createResource("http://schema.org/Winery");
	public static final Resource SpokenWordAlbum = ResourceFactory.createResource("http://schema.org/SpokenWordAlbum");
	public static final Property priceRange = ResourceFactory.createProperty("http://schema.org/priceRange");
	public static final Property sharedContent = ResourceFactory.createProperty("http://schema.org/sharedContent");
	public static final Resource Vehicle = ResourceFactory.createResource("http://schema.org/Vehicle");
	public static final Resource Distance = ResourceFactory.createResource("http://schema.org/Distance");
	public static final Property quest = ResourceFactory.createProperty("http://schema.org/quest");
	public static final Property accessCode = ResourceFactory.createProperty("http://schema.org/accessCode");
	public static final Resource FourWheelDriveConfiguration = ResourceFactory
			.createResource("http://schema.org/FourWheelDriveConfiguration");
	public static final Property version = ResourceFactory.createProperty("http://schema.org/version");
	public static final Property minimumPaymentDue = ResourceFactory
			.createProperty("http://schema.org/minimumPaymentDue");
	public static final Resource BroadcastRelease = ResourceFactory
			.createResource("http://schema.org/BroadcastRelease");
	public static final Property associatedMedia = ResourceFactory.createProperty("http://schema.org/associatedMedia");
	public static final Resource PaymentAutomaticallyApplied = ResourceFactory
			.createResource("http://schema.org/PaymentAutomaticallyApplied");
	public static final Resource Car = ResourceFactory.createResource("http://schema.org/Car");
	public static final Property totalPaymentDue = ResourceFactory.createProperty("http://schema.org/totalPaymentDue");
	public static final Property value = ResourceFactory.createProperty("http://schema.org/value");
	public static final Property album = ResourceFactory.createProperty("http://schema.org/album");
	public static final Property result = ResourceFactory.createProperty("http://schema.org/result");
	public static final Property composer = ResourceFactory.createProperty("http://schema.org/composer");
	public static final Property albumReleaseType = ResourceFactory
			.createProperty("http://schema.org/albumReleaseType");
	public static final Property fromLocation = ResourceFactory.createProperty("http://schema.org/fromLocation");
	public static final Resource Thing = ResourceFactory.createResource("http://schema.org/Thing");
	public static final Resource MusicRelease = ResourceFactory.createResource("http://schema.org/MusicRelease");
	public static final Property parent = ResourceFactory.createProperty("http://schema.org/parent");
	public static final Resource PaymentDeclined = ResourceFactory.createResource("http://schema.org/PaymentDeclined");
	public static final Resource ItemListOrderDescending = ResourceFactory
			.createResource("http://schema.org/ItemListOrderDescending");
	public static final Property webCheckinTime = ResourceFactory.createProperty("http://schema.org/webCheckinTime");
	public static final Property duringMedia = ResourceFactory.createProperty("http://schema.org/duringMedia");
	public static final Resource GenderType = ResourceFactory.createResource("http://schema.org/GenderType");
	public static final Property vehicleInteriorColor = ResourceFactory
			.createProperty("http://schema.org/vehicleInteriorColor");
	public static final Resource LaserDiscFormat = ResourceFactory.createResource("http://schema.org/LaserDiscFormat");
	public static final Resource Canal = ResourceFactory.createResource("http://schema.org/Canal");
	public static final Property isBasedOnUrl = ResourceFactory.createProperty("http://schema.org/isBasedOnUrl");
	public static final Resource House = ResourceFactory.createResource("http://schema.org/House");
	public static final Property video = ResourceFactory.createProperty("http://schema.org/video");
	public static final Resource EducationalOrganization = ResourceFactory
			.createResource("http://schema.org/EducationalOrganization");
	public static final Property globalLocationNumber = ResourceFactory
			.createProperty("http://schema.org/globalLocationNumber");
	public static final Property greaterOrEqual = ResourceFactory.createProperty("http://schema.org/greaterOrEqual");
	public static final Resource TheaterGroup = ResourceFactory.createResource("http://schema.org/TheaterGroup");
	public static final Property highPrice = ResourceFactory.createProperty("http://schema.org/highPrice");
	public static final Resource QuantitativeValueDistribution = ResourceFactory
			.createResource("http://schema.org/QuantitativeValueDistribution");
	public static final Resource FireStation = ResourceFactory.createResource("http://schema.org/FireStation");
	public static final Property thumbnail = ResourceFactory.createProperty("http://schema.org/thumbnail");
	public static final Property discussionUrl = ResourceFactory.createProperty("http://schema.org/discussionUrl");
	public static final Resource InStock = ResourceFactory.createResource("http://schema.org/InStock");
	public static final Resource ProductModel = ResourceFactory.createResource("http://schema.org/ProductModel");
	public static final Property targetPlatform = ResourceFactory.createProperty("http://schema.org/targetPlatform");
	public static final Property acceptedPaymentMethod = ResourceFactory
			.createProperty("http://schema.org/acceptedPaymentMethod");
	public static final Property productionDate = ResourceFactory.createProperty("http://schema.org/productionDate");
	public static final Property pagination = ResourceFactory.createProperty("http://schema.org/pagination");
	public static final Resource PaymentComplete = ResourceFactory.createResource("http://schema.org/PaymentComplete");
	public static final Property grantee = ResourceFactory.createProperty("http://schema.org/grantee");
	public static final Property model = ResourceFactory.createProperty("http://schema.org/model");
	public static final Property sourceOrganization = ResourceFactory
			.createProperty("http://schema.org/sourceOrganization");
	public static final Resource Book = ResourceFactory.createResource("http://schema.org/Book");
	public static final Property servicePostalAddress = ResourceFactory
			.createProperty("http://schema.org/servicePostalAddress");
	public static final Property opponent = ResourceFactory.createProperty("http://schema.org/opponent");
	public static final Resource Intangible = ResourceFactory.createResource("http://schema.org/Intangible");
	public static final Property regionsAllowed = ResourceFactory.createProperty("http://schema.org/regionsAllowed");
	public static final Property requiresSubscription = ResourceFactory
			.createProperty("http://schema.org/requiresSubscription");
	public static final Property email = ResourceFactory.createProperty("http://schema.org/email");
	public static final Resource LimitedAvailability = ResourceFactory
			.createResource("http://schema.org/LimitedAvailability");
	public static final Property numberOfRooms = ResourceFactory.createProperty("http://schema.org/numberOfRooms");
	public static final Property recordedAs = ResourceFactory.createProperty("http://schema.org/recordedAs");
	public static final Resource AmusementPark = ResourceFactory.createResource("http://schema.org/AmusementPark");
	public static final Resource ConfirmAction = ResourceFactory.createResource("http://schema.org/ConfirmAction");
	public static final Property lesserOrEqual = ResourceFactory.createProperty("http://schema.org/lesserOrEqual");
	public static final Property primaryImageOfPage = ResourceFactory
			.createProperty("http://schema.org/primaryImageOfPage");
	public static final Resource PresentationDigitalDocument = ResourceFactory
			.createResource("http://schema.org/PresentationDigitalDocument");
	public static final Property commentCount = ResourceFactory.createProperty("http://schema.org/commentCount");
	public static final Resource Pharmacy = ResourceFactory.createResource("http://schema.org/Pharmacy");
	public static final Resource Apartment = ResourceFactory.createResource("http://schema.org/Apartment");
	public static final Property recordedAt = ResourceFactory.createProperty("http://schema.org/recordedAt");
	public static final Property geoOverlaps = ResourceFactory.createProperty("http://schema.org/geoOverlaps");
	public static final Resource DiscoverAction = ResourceFactory.createResource("http://schema.org/DiscoverAction");
	public static final Resource Game = ResourceFactory.createResource("http://schema.org/Game");
	public static final Resource BookFormatType = ResourceFactory.createResource("http://schema.org/BookFormatType");
	public static final Resource BookSeries = ResourceFactory.createResource("http://schema.org/BookSeries");
	public static final Resource Friday = ResourceFactory.createResource("http://schema.org/Friday");
	public static final Resource HowToSupply = ResourceFactory.createResource("http://schema.org/HowToSupply");
	public static final Property logo = ResourceFactory.createProperty("http://schema.org/logo");
	public static final Resource ItemPage = ResourceFactory.createResource("http://schema.org/ItemPage");
	public static final Property addressLocality = ResourceFactory.createProperty("http://schema.org/addressLocality");
	public static final Resource EmailMessage = ResourceFactory.createResource("http://schema.org/EmailMessage");
	public static final Property subtitleLanguage = ResourceFactory
			.createProperty("http://schema.org/subtitleLanguage");
	public static final Resource SearchResultsPage = ResourceFactory
			.createResource("http://schema.org/SearchResultsPage");
	public static final Property claimReviewed = ResourceFactory.createProperty("http://schema.org/claimReviewed");
	public static final Property performers = ResourceFactory.createProperty("http://schema.org/performers");
	public static final Resource Barcode = ResourceFactory.createResource("http://schema.org/Barcode");
	public static final Resource DislikeAction = ResourceFactory.createResource("http://schema.org/DislikeAction");
	public static final Resource ReplaceAction = ResourceFactory.createResource("http://schema.org/ReplaceAction");
	public static final Property identifier = ResourceFactory.createProperty("http://schema.org/identifier");
	public static final Resource CoOp = ResourceFactory.createResource("http://schema.org/CoOp");
	public static final Resource DJMixAlbum = ResourceFactory.createResource("http://schema.org/DJMixAlbum");
	public static final Resource Report = ResourceFactory.createResource("http://schema.org/Report");
	public static final Resource HowToTip = ResourceFactory.createResource("http://schema.org/HowToTip");
	public static final Property entertainmentBusiness = ResourceFactory
			.createProperty("http://schema.org/entertainmentBusiness");
	public static final Resource EducationalAudience = ResourceFactory
			.createResource("http://schema.org/EducationalAudience");
	public static final Resource SearchAction = ResourceFactory.createResource("http://schema.org/SearchAction");
	public static final Resource OwnershipInfo = ResourceFactory.createResource("http://schema.org/OwnershipInfo");
	public static final Resource Locksmith = ResourceFactory.createResource("http://schema.org/Locksmith");
	public static final Resource RentalCarReservation = ResourceFactory
			.createResource("http://schema.org/RentalCarReservation");
	public static final Resource ControlAction = ResourceFactory.createResource("http://schema.org/ControlAction");
	public static final Resource BookmarkAction = ResourceFactory.createResource("http://schema.org/BookmarkAction");
	public static final Property eligibleRegion = ResourceFactory.createProperty("http://schema.org/eligibleRegion");
	public static final Resource TennisComplex = ResourceFactory.createResource("http://schema.org/TennisComplex");
	public static final Resource WPSideBar = ResourceFactory.createResource("http://schema.org/WPSideBar");
	public static final Property recipeInstructions = ResourceFactory
			.createProperty("http://schema.org/recipeInstructions");
	public static final Resource UnitPriceSpecification = ResourceFactory
			.createResource("http://schema.org/UnitPriceSpecification");
	public static final Property itemOffered = ResourceFactory.createProperty("http://schema.org/itemOffered");
	public static final Property ratingValue = ResourceFactory.createProperty("http://schema.org/ratingValue");
	public static final Property dateIssued = ResourceFactory.createProperty("http://schema.org/dateIssued");
	public static final Property discusses = ResourceFactory.createProperty("http://schema.org/discusses");
	public static final Property performerIn = ResourceFactory.createProperty("http://schema.org/performerIn");
	public static final Property replyToUrl = ResourceFactory.createProperty("http://schema.org/replyToUrl");
	public static final Property relevantOccupation = ResourceFactory
			.createProperty("http://schema.org/relevantOccupation");
	public static final Property faxNumber = ResourceFactory.createProperty("http://schema.org/faxNumber");
	public static final Property candidate = ResourceFactory.createProperty("http://schema.org/candidate");
	public static final Resource ItemList = ResourceFactory.createResource("http://schema.org/ItemList");
	public static final Resource DonateAction = ResourceFactory.createResource("http://schema.org/DonateAction");
	public static final Property awards = ResourceFactory.createProperty("http://schema.org/awards");
	public static final Property award = ResourceFactory.createProperty("http://schema.org/award");
	public static final Resource Organization = ResourceFactory.createResource("http://schema.org/Organization");
	public static final Resource OrganizeAction = ResourceFactory.createResource("http://schema.org/OrganizeAction");
	public static final Resource InviteAction = ResourceFactory.createResource("http://schema.org/InviteAction");
	public static final Resource TipAction = ResourceFactory.createResource("http://schema.org/TipAction");
	public static final Property beforeMedia = ResourceFactory.createProperty("http://schema.org/beforeMedia");
	public static final Property issueNumber = ResourceFactory.createProperty("http://schema.org/issueNumber");
	public static final Property category = ResourceFactory.createProperty("http://schema.org/category");
	public static final Property interestRate = ResourceFactory.createProperty("http://schema.org/interestRate");
	public static final Resource EngineSpecification = ResourceFactory
			.createResource("http://schema.org/EngineSpecification");
	public static final Property collection = ResourceFactory.createProperty("http://schema.org/collection");
	public static final Property awayTeam = ResourceFactory.createProperty("http://schema.org/awayTeam");
	public static final Resource Article = ResourceFactory.createResource("http://schema.org/Article");
	public static final Resource ExerciseAction = ResourceFactory.createResource("http://schema.org/ExerciseAction");
	public static final Resource CampingPitch = ResourceFactory.createResource("http://schema.org/CampingPitch");
	public static final Resource SportsClub = ResourceFactory.createResource("http://schema.org/SportsClub");
	public static final Property billingAddress = ResourceFactory.createProperty("http://schema.org/billingAddress");
	public static final Property mentions = ResourceFactory.createProperty("http://schema.org/mentions");
	public static final Property validFrom = ResourceFactory.createProperty("http://schema.org/validFrom");
	public static final Resource HobbyShop = ResourceFactory.createResource("http://schema.org/HobbyShop");
	public static final Resource GameServer = ResourceFactory.createResource("http://schema.org/GameServer");
	public static final Property membershipNumber = ResourceFactory
			.createProperty("http://schema.org/membershipNumber");
	public static final Property orderItemStatus = ResourceFactory.createProperty("http://schema.org/orderItemStatus");
	public static final Resource PaymentChargeSpecification = ResourceFactory
			.createResource("http://schema.org/PaymentChargeSpecification");
	public static final Property clipNumber = ResourceFactory.createProperty("http://schema.org/clipNumber");
	public static final Resource OrderCancelled = ResourceFactory.createResource("http://schema.org/OrderCancelled");
	public static final Property permittedUsage = ResourceFactory.createProperty("http://schema.org/permittedUsage");
	public static final Property publishedOn = ResourceFactory.createProperty("http://schema.org/publishedOn");
	public static final Resource SeaBodyOfWater = ResourceFactory.createResource("http://schema.org/SeaBodyOfWater");
	public static final Property translator = ResourceFactory.createProperty("http://schema.org/translator");
	public static final Property loser = ResourceFactory.createProperty("http://schema.org/loser");
	public static final Property instrument = ResourceFactory.createProperty("http://schema.org/instrument");
	public static final Resource InstallAction = ResourceFactory.createResource("http://schema.org/InstallAction");
	public static final Resource GlutenFreeDiet = ResourceFactory.createResource("http://schema.org/GlutenFreeDiet");
	public static final Resource Language = ResourceFactory.createResource("http://schema.org/Language");
	public static final Resource DigitalDocumentPermissionType = ResourceFactory
			.createResource("http://schema.org/DigitalDocumentPermissionType");
	public static final Resource TechArticle = ResourceFactory.createResource("http://schema.org/TechArticle");
	public static final Property encodings = ResourceFactory.createProperty("http://schema.org/encodings");
	public static final Property occupationalCategory = ResourceFactory
			.createProperty("http://schema.org/occupationalCategory");
	public static final Resource HowToTool = ResourceFactory.createResource("http://schema.org/HowToTool");
	public static final Resource State = ResourceFactory.createResource("http://schema.org/State");
	public static final Property familyName = ResourceFactory.createProperty("http://schema.org/familyName");
	public static final Resource OrderDelivered = ResourceFactory.createResource("http://schema.org/OrderDelivered");
	public static final Property floorSize = ResourceFactory.createProperty("http://schema.org/floorSize");
	public static final Resource InternetCafe = ResourceFactory.createResource("http://schema.org/InternetCafe");
	public static final Property flightNumber = ResourceFactory.createProperty("http://schema.org/flightNumber");
	public static final Resource PlaceOfWorship = ResourceFactory.createResource("http://schema.org/PlaceOfWorship");
	public static final Resource WorkersUnion = ResourceFactory.createResource("http://schema.org/WorkersUnion");
	public static final Property nextItem = ResourceFactory.createProperty("http://schema.org/nextItem");
	public static final Property numberOfBeds = ResourceFactory.createProperty("http://schema.org/numberOfBeds");
	public static final Property address = ResourceFactory.createProperty("http://schema.org/address");
	public static final Property mpn = ResourceFactory.createProperty("http://schema.org/mpn");
	public static final Resource Distillery = ResourceFactory.createResource("http://schema.org/Distillery");
	public static final Resource ArtGallery = ResourceFactory.createResource("http://schema.org/ArtGallery");
	public static final Resource AppendAction = ResourceFactory.createResource("http://schema.org/AppendAction");
	public static final Property appliesToDeliveryMethod = ResourceFactory
			.createProperty("http://schema.org/appliesToDeliveryMethod");
	public static final Property offerCount = ResourceFactory.createProperty("http://schema.org/offerCount");
	public static final Property geoIntersects = ResourceFactory.createProperty("http://schema.org/geoIntersects");
	public static final Resource CreditCard = ResourceFactory.createResource("http://schema.org/CreditCard");
	public static final Property merchant = ResourceFactory.createProperty("http://schema.org/merchant");
	public static final Property followee = ResourceFactory.createProperty("http://schema.org/followee");
	public static final Property significantLinks = ResourceFactory
			.createProperty("http://schema.org/significantLinks");
	public static final Property providesBroadcastService = ResourceFactory
			.createProperty("http://schema.org/providesBroadcastService");
	public static final Resource TypeAndQuantityNode = ResourceFactory
			.createResource("http://schema.org/TypeAndQuantityNode");
	public static final Property hasBroadcastChannel = ResourceFactory
			.createProperty("http://schema.org/hasBroadcastChannel");
	public static final Property disambiguatingDescription = ResourceFactory
			.createProperty("http://schema.org/disambiguatingDescription");
	public static final Resource IndividualProduct = ResourceFactory
			.createResource("http://schema.org/IndividualProduct");
	public static final Property dateReceived = ResourceFactory.createProperty("http://schema.org/dateReceived");
	public static final Resource GamePlayMode = ResourceFactory.createResource("http://schema.org/GamePlayMode");
	public static final Resource BusinessEntityType = ResourceFactory
			.createResource("http://schema.org/BusinessEntityType");
	public static final Property superEvent = ResourceFactory.createProperty("http://schema.org/superEvent");
	public static final Property partOfOrder = ResourceFactory.createProperty("http://schema.org/partOfOrder");
	public static final Property serviceAudience = ResourceFactory.createProperty("http://schema.org/serviceAudience");
	public static final Resource Ticket = ResourceFactory.createResource("http://schema.org/Ticket");
	public static final Resource RealEstateAgent = ResourceFactory.createResource("http://schema.org/RealEstateAgent");
	public static final Property prepTime = ResourceFactory.createProperty("http://schema.org/prepTime");
	public static final Property performTime = ResourceFactory.createProperty("http://schema.org/performTime");
	public static final Property seasonNumber = ResourceFactory.createProperty("http://schema.org/seasonNumber");
	public static final Resource FoodEvent = ResourceFactory.createResource("http://schema.org/FoodEvent");
	public static final Resource Mountain = ResourceFactory.createResource("http://schema.org/Mountain");
	public static final Property course = ResourceFactory.createProperty("http://schema.org/course");
	public static final Property opens = ResourceFactory.createProperty("http://schema.org/opens");
	public static final Resource ReadAction = ResourceFactory.createResource("http://schema.org/ReadAction");
	public static final Property gender = ResourceFactory.createProperty("http://schema.org/gender");
	public static final Resource ItemListOrderType = ResourceFactory
			.createResource("http://schema.org/ItemListOrderType");
	public static final Resource Periodical = ResourceFactory.createResource("http://schema.org/Periodical");
	public static final Property broadcastFrequency = ResourceFactory
			.createProperty("http://schema.org/broadcastFrequency");
	public static final Resource AutoDealer = ResourceFactory.createResource("http://schema.org/AutoDealer");
	public static final Resource Audience = ResourceFactory.createResource("http://schema.org/Audience");
	public static final Resource ShoppingCenter = ResourceFactory.createResource("http://schema.org/ShoppingCenter");
	public static final Property includesObject = ResourceFactory.createProperty("http://schema.org/includesObject");
	public static final Resource MusicStore = ResourceFactory.createResource("http://schema.org/MusicStore");
	public static final Property unitText = ResourceFactory.createProperty("http://schema.org/unitText");
	public static final Property hostingOrganization = ResourceFactory
			.createProperty("http://schema.org/hostingOrganization");
	public static final Resource WholesaleStore = ResourceFactory.createResource("http://schema.org/WholesaleStore");
	public static final Property skills = ResourceFactory.createProperty("http://schema.org/skills");
	public static final Property referencesOrder = ResourceFactory.createProperty("http://schema.org/referencesOrder");
	public static final Property legalName = ResourceFactory.createProperty("http://schema.org/legalName");
	public static final Property trackingNumber = ResourceFactory.createProperty("http://schema.org/trackingNumber");
	public static final Resource OfflinePermanently = ResourceFactory
			.createResource("http://schema.org/OfflinePermanently");
	public static final Resource FilmAction = ResourceFactory.createResource("http://schema.org/FilmAction");
	public static final Property coverageEndTime = ResourceFactory.createProperty("http://schema.org/coverageEndTime");
	public static final Property artEdition = ResourceFactory.createProperty("http://schema.org/artEdition");
	public static final Property subEvents = ResourceFactory.createProperty("http://schema.org/subEvents");
	public static final Resource GovernmentOrganization = ResourceFactory
			.createResource("http://schema.org/GovernmentOrganization");
	public static final Resource MiddleSchool = ResourceFactory.createResource("http://schema.org/MiddleSchool");
	public static final Property reservedTicket = ResourceFactory.createProperty("http://schema.org/reservedTicket");
	public static final Resource CityHall = ResourceFactory.createResource("http://schema.org/CityHall");
	public static final Property startTime = ResourceFactory.createProperty("http://schema.org/startTime");
	public static final Resource CompoundPriceSpecification = ResourceFactory
			.createResource("http://schema.org/CompoundPriceSpecification");
	public static final Property dropoffLocation = ResourceFactory.createProperty("http://schema.org/dropoffLocation");
	public static final Property reviewRating = ResourceFactory.createProperty("http://schema.org/reviewRating");
	public static final Resource OutOfStock = ResourceFactory.createResource("http://schema.org/OutOfStock");
	public static final Resource Accommodation = ResourceFactory.createResource("http://schema.org/Accommodation");
	public static final Property maximumAttendeeCapacity = ResourceFactory
			.createProperty("http://schema.org/maximumAttendeeCapacity");
	public static final Resource TVSeason = ResourceFactory.createResource("http://schema.org/TVSeason");
	public static final Property partOfInvoice = ResourceFactory.createProperty("http://schema.org/partOfInvoice");
	public static final Property broker = ResourceFactory.createProperty("http://schema.org/broker");
	public static final Property hasDeliveryMethod = ResourceFactory
			.createProperty("http://schema.org/hasDeliveryMethod");
	public static final Property geoMidpoint = ResourceFactory.createProperty("http://schema.org/geoMidpoint");
	public static final Property geoCrosses = ResourceFactory.createProperty("http://schema.org/geoCrosses");
	public static final Resource Electrician = ResourceFactory.createResource("http://schema.org/Electrician");
	public static final Resource OfficeEquipmentStore = ResourceFactory
			.createResource("http://schema.org/OfficeEquipmentStore");
	public static final Property checkoutTime = ResourceFactory.createProperty("http://schema.org/checkoutTime");
	public static final Resource SuspendAction = ResourceFactory.createResource("http://schema.org/SuspendAction");
	public static final Property assemblyVersion = ResourceFactory.createProperty("http://schema.org/assemblyVersion");
	public static final Resource GovernmentPermit = ResourceFactory
			.createResource("http://schema.org/GovernmentPermit");
	public static final Resource Museum = ResourceFactory.createResource("http://schema.org/Museum");
	public static final Property partOfSeries = ResourceFactory.createProperty("http://schema.org/partOfSeries");
	public static final Resource Product = ResourceFactory.createResource("http://schema.org/Product");
	public static final Property validFor = ResourceFactory.createProperty("http://schema.org/validFor");
	public static final Property duration = ResourceFactory.createProperty("http://schema.org/duration");
	public static final Resource MusicComposition = ResourceFactory
			.createResource("http://schema.org/MusicComposition");
	public static final Property character = ResourceFactory.createProperty("http://schema.org/character");
	public static final Property inBroadcastLineup = ResourceFactory
			.createProperty("http://schema.org/inBroadcastLineup");
	public static final Resource EndorseAction = ResourceFactory.createResource("http://schema.org/EndorseAction");
	public static final Property seeks = ResourceFactory.createProperty("http://schema.org/seeks");
	public static final Resource BoardingPolicyType = ResourceFactory
			.createResource("http://schema.org/BoardingPolicyType");
	public static final Resource SocialEvent = ResourceFactory.createResource("http://schema.org/SocialEvent");
	public static final Property colleagues = ResourceFactory.createProperty("http://schema.org/colleagues");
	public static final Property isAccessibleForFree = ResourceFactory
			.createProperty("http://schema.org/isAccessibleForFree");
	public static final Property latitude = ResourceFactory.createProperty("http://schema.org/latitude");
	public static final Property serviceType = ResourceFactory.createProperty("http://schema.org/serviceType");
	public static final Property paymentUrl = ResourceFactory.createProperty("http://schema.org/paymentUrl");
	public static final Property countriesNotSupported = ResourceFactory
			.createProperty("http://schema.org/countriesNotSupported");
	public static final Resource InformAction = ResourceFactory.createResource("http://schema.org/InformAction");
	public static final Resource BodyOfWater = ResourceFactory.createResource("http://schema.org/BodyOfWater");
	public static final Property accessModeSufficient = ResourceFactory
			.createProperty("http://schema.org/accessModeSufficient");
	public static final Property seatNumber = ResourceFactory.createProperty("http://schema.org/seatNumber");
	public static final Resource RadioClip = ResourceFactory.createResource("http://schema.org/RadioClip");
	public static final Property rsvpResponse = ResourceFactory.createProperty("http://schema.org/rsvpResponse");
	public static final Resource EmergencyService = ResourceFactory
			.createResource("http://schema.org/EmergencyService");
	public static final Resource LiveBlogPosting = ResourceFactory.createResource("http://schema.org/LiveBlogPosting");
	public static final Resource ReservationStatusType = ResourceFactory
			.createResource("http://schema.org/ReservationStatusType");
	public static final Resource TelevisionChannel = ResourceFactory
			.createResource("http://schema.org/TelevisionChannel");
	public static final Resource PrependAction = ResourceFactory.createResource("http://schema.org/PrependAction");
	public static final Resource ConsumeAction = ResourceFactory.createResource("http://schema.org/ConsumeAction");
	public static final Resource Mass = ResourceFactory.createResource("http://schema.org/Mass");
	public static final Resource QuoteAction = ResourceFactory.createResource("http://schema.org/QuoteAction");
	public static final Resource LoanOrCredit = ResourceFactory.createResource("http://schema.org/LoanOrCredit");
	public static final Property encodingType = ResourceFactory.createProperty("http://schema.org/encodingType");
	public static final Property requirements = ResourceFactory.createProperty("http://schema.org/requirements");
	public static final Property lodgingUnitType = ResourceFactory.createProperty("http://schema.org/lodgingUnitType");
	public static final Property birthPlace = ResourceFactory.createProperty("http://schema.org/birthPlace");
	public static final Property paymentDue = ResourceFactory.createProperty("http://schema.org/paymentDue");
	public static final Property deliveryAddress = ResourceFactory.createProperty("http://schema.org/deliveryAddress");
	public static final Property copyrightYear = ResourceFactory.createProperty("http://schema.org/copyrightYear");
	public static final Property educationalFramework = ResourceFactory
			.createProperty("http://schema.org/educationalFramework");
	public static final Resource Message = ResourceFactory.createResource("http://schema.org/Message");
	public static final Resource VisualArtsEvent = ResourceFactory.createResource("http://schema.org/VisualArtsEvent");
	public static final Property incentiveCompensation = ResourceFactory
			.createProperty("http://schema.org/incentiveCompensation");
	public static final Property broadcastAffiliateOf = ResourceFactory
			.createProperty("http://schema.org/broadcastAffiliateOf");
	public static final Resource HowToItem = ResourceFactory.createResource("http://schema.org/HowToItem");
	public static final Property afterMedia = ResourceFactory.createProperty("http://schema.org/afterMedia");
	public static final Resource TransitMap = ResourceFactory.createResource("http://schema.org/TransitMap");
	public static final Property tool = ResourceFactory.createProperty("http://schema.org/tool");
	public static final Property applicationCategory = ResourceFactory
			.createProperty("http://schema.org/applicationCategory");
	public static final Property fuelEfficiency = ResourceFactory.createProperty("http://schema.org/fuelEfficiency");
	public static final Property fileSize = ResourceFactory.createProperty("http://schema.org/fileSize");
	public static final Property screenshot = ResourceFactory.createProperty("http://schema.org/screenshot");
	public static final Property winner = ResourceFactory.createProperty("http://schema.org/winner");
	public static final Property geoWithin = ResourceFactory.createProperty("http://schema.org/geoWithin");
	public static final Resource CurrencyConversionService = ResourceFactory
			.createResource("http://schema.org/CurrencyConversionService");
	public static final Resource RsvpResponseMaybe = ResourceFactory
			.createResource("http://schema.org/RsvpResponseMaybe");
	public static final Property iataCode = ResourceFactory.createProperty("http://schema.org/iataCode");
	public static final Property photo = ResourceFactory.createProperty("http://schema.org/photo");
	public static final Property doorTime = ResourceFactory.createProperty("http://schema.org/doorTime");
	public static final Resource ExerciseGym = ResourceFactory.createResource("http://schema.org/ExerciseGym");
	public static final Property supportingData = ResourceFactory.createProperty("http://schema.org/supportingData");
	public static final Property contactPoint = ResourceFactory.createProperty("http://schema.org/contactPoint");
	public static final Resource Painting = ResourceFactory.createResource("http://schema.org/Painting");
	public static final Property inLanguage = ResourceFactory.createProperty("http://schema.org/inLanguage");
	public static final Resource InteractAction = ResourceFactory.createResource("http://schema.org/InteractAction");
	public static final Resource Online = ResourceFactory.createResource("http://schema.org/Online");
	public static final Property directors = ResourceFactory.createProperty("http://schema.org/directors");
	public static final Resource Menu = ResourceFactory.createResource("http://schema.org/Menu");
	public static final Property spouse = ResourceFactory.createProperty("http://schema.org/spouse");
	public static final Property numberOfPreviousOwners = ResourceFactory
			.createProperty("http://schema.org/numberOfPreviousOwners");
	public static final Property numberOfItems = ResourceFactory.createProperty("http://schema.org/numberOfItems");
	public static final Resource LeaveAction = ResourceFactory.createResource("http://schema.org/LeaveAction");
	public static final Property runtime = ResourceFactory.createProperty("http://schema.org/runtime");
	public static final Resource Tuesday = ResourceFactory.createResource("http://schema.org/Tuesday");
	public static final Property geoRadius = ResourceFactory.createProperty("http://schema.org/geoRadius");
	public static final Property vehicleConfiguration = ResourceFactory
			.createProperty("http://schema.org/vehicleConfiguration");
	public static final Property performer = ResourceFactory.createProperty("http://schema.org/performer");
	public static final Resource CheckAction = ResourceFactory.createResource("http://schema.org/CheckAction");
	public static final Resource PaymentCard = ResourceFactory.createResource("http://schema.org/PaymentCard");
	public static final Resource DepartmentStore = ResourceFactory.createResource("http://schema.org/DepartmentStore");
	public static final Property blogPost = ResourceFactory.createProperty("http://schema.org/blogPost");
	public static final Property dependencies = ResourceFactory.createProperty("http://schema.org/dependencies");
	public static final Resource DataDownload = ResourceFactory.createResource("http://schema.org/DataDownload");
	public static final Resource RadioSeries = ResourceFactory.createResource("http://schema.org/RadioSeries");
	public static final Resource GroupBoardingPolicy = ResourceFactory
			.createResource("http://schema.org/GroupBoardingPolicy");
	public static final Resource GroceryStore = ResourceFactory.createResource("http://schema.org/GroceryStore");
	public static final Property box = ResourceFactory.createProperty("http://schema.org/box");
	public static final Property children = ResourceFactory.createProperty("http://schema.org/children");
	public static final Property requiredQuantity = ResourceFactory
			.createProperty("http://schema.org/requiredQuantity");
	public static final Property maps = ResourceFactory.createProperty("http://schema.org/maps");
	public static final Resource Campground = ResourceFactory.createResource("http://schema.org/Campground");
	public static final Property sponsor = ResourceFactory.createProperty("http://schema.org/sponsor");
	public static final Property recordingOf = ResourceFactory.createProperty("http://schema.org/recordingOf");
	public static final Resource DatedMoneySpecification = ResourceFactory
			.createResource("http://schema.org/DatedMoneySpecification");
	public static final Resource Time = ResourceFactory.createResource("http://schema.org/Time");
	public static final Resource RearWheelDriveConfiguration = ResourceFactory
			.createResource("http://schema.org/RearWheelDriveConfiguration");
	public static final Resource RsvpAction = ResourceFactory.createResource("http://schema.org/RsvpAction");
	public static final Property courseMode = ResourceFactory.createProperty("http://schema.org/courseMode");
	public static final Resource AccountingService = ResourceFactory
			.createResource("http://schema.org/AccountingService");
	public static final Resource Volcano = ResourceFactory.createResource("http://schema.org/Volcano");
	public static final Resource GeneralContractor = ResourceFactory
			.createResource("http://schema.org/GeneralContractor");
	public static final Resource AlbumRelease = ResourceFactory.createResource("http://schema.org/AlbumRelease");
	public static final Property parents = ResourceFactory.createProperty("http://schema.org/parents");
	public static final Resource Service = ResourceFactory.createResource("http://schema.org/Service");
	public static final Resource FastFoodRestaurant = ResourceFactory
			.createResource("http://schema.org/FastFoodRestaurant");
	public static final Resource CollectionPage = ResourceFactory.createResource("http://schema.org/CollectionPage");
	public static final Property busName = ResourceFactory.createProperty("http://schema.org/busName");
	public static final Resource AboutPage = ResourceFactory.createResource("http://schema.org/AboutPage");
	public static final Resource OfferCatalog = ResourceFactory.createResource("http://schema.org/OfferCatalog");
	public static final Property partOfSeason = ResourceFactory.createProperty("http://schema.org/partOfSeason");
	public static final Resource MoveAction = ResourceFactory.createResource("http://schema.org/MoveAction");
	public static final Property broadcastFrequencyValue = ResourceFactory
			.createProperty("http://schema.org/broadcastFrequencyValue");
	public static final Resource Review = ResourceFactory.createResource("http://schema.org/Review");
	public static final Resource WebApplication = ResourceFactory.createResource("http://schema.org/WebApplication");
	public static final Property purchaseDate = ResourceFactory.createProperty("http://schema.org/purchaseDate");
	public static final Property recordLabel = ResourceFactory.createProperty("http://schema.org/recordLabel");
	public static final Property liveBlogUpdate = ResourceFactory.createProperty("http://schema.org/liveBlogUpdate");
	public static final Property cheatCode = ResourceFactory.createProperty("http://schema.org/cheatCode");
	public static final Property temporal = ResourceFactory.createProperty("http://schema.org/temporal");
	public static final Property totalTime = ResourceFactory.createProperty("http://schema.org/totalTime");
	public static final Property sender = ResourceFactory.createProperty("http://schema.org/sender");
	public static final Property contentType = ResourceFactory.createProperty("http://schema.org/contentType");
	public static final Property itemShipped = ResourceFactory.createProperty("http://schema.org/itemShipped");
	public static final Property workPresented = ResourceFactory.createProperty("http://schema.org/workPresented");
	public static final Property serviceOperator = ResourceFactory.createProperty("http://schema.org/serviceOperator");
	public static final Property lastReviewed = ResourceFactory.createProperty("http://schema.org/lastReviewed");
	public static final Resource CafeOrCoffeeShop = ResourceFactory
			.createResource("http://schema.org/CafeOrCoffeeShop");
	public static final Property priceValidUntil = ResourceFactory.createProperty("http://schema.org/priceValidUntil");
	public static final Resource ContactPoint = ResourceFactory.createResource("http://schema.org/ContactPoint");
	public static final Property estimatedSalary = ResourceFactory.createProperty("http://schema.org/estimatedSalary");
	public static final Resource UserPlusOnes = ResourceFactory.createResource("http://schema.org/UserPlusOnes");
	public static final Resource DeliveryChargeSpecification = ResourceFactory
			.createResource("http://schema.org/DeliveryChargeSpecification");
	public static final Resource Pond = ResourceFactory.createResource("http://schema.org/Pond");
	public static final Resource SocialMediaPosting = ResourceFactory
			.createResource("http://schema.org/SocialMediaPosting");
	public static final Resource Motel = ResourceFactory.createResource("http://schema.org/Motel");
	public static final Property inAlbum = ResourceFactory.createProperty("http://schema.org/inAlbum");
	public static final Resource GiveAction = ResourceFactory.createResource("http://schema.org/GiveAction");
	public static final Property competitor = ResourceFactory.createProperty("http://schema.org/competitor");
	public static final Resource PreOrderAction = ResourceFactory.createResource("http://schema.org/PreOrderAction");
	public static final Property position = ResourceFactory.createProperty("http://schema.org/position");
	public static final Resource DemoAlbum = ResourceFactory.createResource("http://schema.org/DemoAlbum");
	public static final Resource ScreeningEvent = ResourceFactory.createResource("http://schema.org/ScreeningEvent");
	public static final Property sampleType = ResourceFactory.createProperty("http://schema.org/sampleType");
	public static final Property ccRecipient = ResourceFactory.createProperty("http://schema.org/ccRecipient");
	public static final Property stepValue = ResourceFactory.createProperty("http://schema.org/stepValue");
	public static final Resource EmployerAggregateRating = ResourceFactory
			.createResource("http://schema.org/EmployerAggregateRating");
	public static final Resource ReservationCancelled = ResourceFactory
			.createResource("http://schema.org/ReservationCancelled");
	public static final Property discountCode = ResourceFactory.createProperty("http://schema.org/discountCode");
	public static final Property percentile90 = ResourceFactory.createProperty("http://schema.org/percentile90");
	public static final Resource BankAccount = ResourceFactory.createResource("http://schema.org/BankAccount");
	public static final Resource BusinessEvent = ResourceFactory.createResource("http://schema.org/BusinessEvent");
	public static final Resource VisualArtwork = ResourceFactory.createResource("http://schema.org/VisualArtwork");
	public static final Resource SoftwareApplication = ResourceFactory
			.createResource("http://schema.org/SoftwareApplication");
	public static final Resource UseAction = ResourceFactory.createResource("http://schema.org/UseAction");
	public static final Resource TaxiService = ResourceFactory.createResource("http://schema.org/TaxiService");
	public static final Property geo = ResourceFactory.createProperty("http://schema.org/geo");
	public static final Resource ReserveAction = ResourceFactory.createResource("http://schema.org/ReserveAction");
	public static final Property proficiencyLevel = ResourceFactory
			.createProperty("http://schema.org/proficiencyLevel");
	public static final Property closes = ResourceFactory.createProperty("http://schema.org/closes");
	public static final Property contentUrl = ResourceFactory.createProperty("http://schema.org/contentUrl");
	public static final Property xpath = ResourceFactory.createProperty("http://schema.org/xpath");
	public static final Property endDate = ResourceFactory.createProperty("http://schema.org/endDate");
	public static final Property serviceUrl = ResourceFactory.createProperty("http://schema.org/serviceUrl");
	public static final Resource RsvpResponseYes = ResourceFactory.createResource("http://schema.org/RsvpResponseYes");
	public static final Property unitCode = ResourceFactory.createProperty("http://schema.org/unitCode");
	public static final Resource MovingCompany = ResourceFactory.createResource("http://schema.org/MovingCompany");
	public static final Property department = ResourceFactory.createProperty("http://schema.org/department");
	public static final Resource LiveAlbum = ResourceFactory.createResource("http://schema.org/LiveAlbum");
	public static final Property hasMenu = ResourceFactory.createProperty("http://schema.org/hasMenu");
	public static final Resource RadioStation = ResourceFactory.createResource("http://schema.org/RadioStation");
	public static final Property carbohydrateContent = ResourceFactory
			.createProperty("http://schema.org/carbohydrateContent");
	public static final Property itemReviewed = ResourceFactory.createProperty("http://schema.org/itemReviewed");
	public static final Property datasetTimeInterval = ResourceFactory
			.createProperty("http://schema.org/datasetTimeInterval");
	public static final Property tracks = ResourceFactory.createProperty("http://schema.org/tracks");
	public static final Resource SellAction = ResourceFactory.createResource("http://schema.org/SellAction");
	public static final Resource Airline = ResourceFactory.createResource("http://schema.org/Airline");
	public static final Resource Synagogue = ResourceFactory.createResource("http://schema.org/Synagogue");
	public static final Resource Permit = ResourceFactory.createResource("http://schema.org/Permit");
	public static final Resource ReactAction = ResourceFactory.createResource("http://schema.org/ReactAction");
	public static final Property hasMap = ResourceFactory.createProperty("http://schema.org/hasMap");
	public static final Resource VideoGameClip = ResourceFactory.createResource("http://schema.org/VideoGameClip");
	public static final Resource Person = ResourceFactory.createResource("http://schema.org/Person");
	public static final Resource GardenStore = ResourceFactory.createResource("http://schema.org/GardenStore");
	public static final Resource BusStation = ResourceFactory.createResource("http://schema.org/BusStation");
	public static final Resource PublicSwimmingPool = ResourceFactory
			.createResource("http://schema.org/PublicSwimmingPool");
	public static final Property providerMobility = ResourceFactory
			.createProperty("http://schema.org/providerMobility");
	public static final Resource FlightReservation = ResourceFactory
			.createResource("http://schema.org/FlightReservation");
	public static final Property lender = ResourceFactory.createProperty("http://schema.org/lender");
	public static final Property founder = ResourceFactory.createProperty("http://schema.org/founder");
	public static final Property lyricist = ResourceFactory.createProperty("http://schema.org/lyricist");
	public static final Property paymentMethod = ResourceFactory.createProperty("http://schema.org/paymentMethod");
	public static final Property author = ResourceFactory.createProperty("http://schema.org/author");
	public static final Property ownedFrom = ResourceFactory.createProperty("http://schema.org/ownedFrom");
	public static final Property touristType = ResourceFactory.createProperty("http://schema.org/touristType");
	public static final Property reportNumber = ResourceFactory.createProperty("http://schema.org/reportNumber");
	public static final Resource OrderPaymentDue = ResourceFactory.createResource("http://schema.org/OrderPaymentDue");
	public static final Property httpMethod = ResourceFactory.createProperty("http://schema.org/httpMethod");
	public static final Property geoTouches = ResourceFactory.createProperty("http://schema.org/geoTouches");
	public static final Resource Discontinued = ResourceFactory.createResource("http://schema.org/Discontinued");
	public static final Resource Clip = ResourceFactory.createResource("http://schema.org/Clip");
	public static final Property foundingLocation = ResourceFactory
			.createProperty("http://schema.org/foundingLocation");
	public static final Resource CatholicChurch = ResourceFactory.createResource("http://schema.org/CatholicChurch");
	public static final Property longitude = ResourceFactory.createProperty("http://schema.org/longitude");
	public static final Resource DigitalAudioTapeFormat = ResourceFactory
			.createResource("http://schema.org/DigitalAudioTapeFormat");
	public static final Resource VeganDiet = ResourceFactory.createResource("http://schema.org/VeganDiet");
	public static final Property fuelConsumption = ResourceFactory.createProperty("http://schema.org/fuelConsumption");
	public static final Property lodgingUnitDescription = ResourceFactory
			.createProperty("http://schema.org/lodgingUnitDescription");
	public static final Property tickerSymbol = ResourceFactory.createProperty("http://schema.org/tickerSymbol");
	public static final Property openingHoursSpecification = ResourceFactory
			.createProperty("http://schema.org/openingHoursSpecification");
	public static final Resource Bridge = ResourceFactory.createResource("http://schema.org/Bridge");
	public static final Property ineligibleRegion = ResourceFactory
			.createProperty("http://schema.org/ineligibleRegion");
	public static final Property advanceBookingRequirement = ResourceFactory
			.createProperty("http://schema.org/advanceBookingRequirement");
	public static final Property priceComponent = ResourceFactory.createProperty("http://schema.org/priceComponent");
	public static final Resource Physician = ResourceFactory.createResource("http://schema.org/Physician");
	public static final Resource FoodEstablishmentReservation = ResourceFactory
			.createResource("http://schema.org/FoodEstablishmentReservation");
	public static final Property targetUrl = ResourceFactory.createProperty("http://schema.org/targetUrl");
	public static final Property isRelatedTo = ResourceFactory.createProperty("http://schema.org/isRelatedTo");
	public static final Property dateCreated = ResourceFactory.createProperty("http://schema.org/dateCreated");
	public static final Property hiringOrganization = ResourceFactory
			.createProperty("http://schema.org/hiringOrganization");
	public static final Resource ChildrensEvent = ResourceFactory.createResource("http://schema.org/ChildrensEvent");
	public static final Resource Specialty = ResourceFactory.createResource("http://schema.org/Specialty");
	public static final Property contactPoints = ResourceFactory.createProperty("http://schema.org/contactPoints");
	public static final Property geoCovers = ResourceFactory.createProperty("http://schema.org/geoCovers");
	public static final Property volumeNumber = ResourceFactory.createProperty("http://schema.org/volumeNumber");
	public static final Resource ItemListUnordered = ResourceFactory
			.createResource("http://schema.org/ItemListUnordered");
	public static final Property availableFrom = ResourceFactory.createProperty("http://schema.org/availableFrom");
	public static final Property aircraft = ResourceFactory.createProperty("http://schema.org/aircraft");
	public static final Property expectedArrivalUntil = ResourceFactory
			.createProperty("http://schema.org/expectedArrivalUntil");
	public static final Resource TouristAttraction = ResourceFactory
			.createResource("http://schema.org/TouristAttraction");
	public static final Property interactionCount = ResourceFactory
			.createProperty("http://schema.org/interactionCount");
	public static final Property issuedBy = ResourceFactory.createProperty("http://schema.org/issuedBy");
	public static final Property illustrator = ResourceFactory.createProperty("http://schema.org/illustrator");
	public static final Resource DeleteAction = ResourceFactory.createResource("http://schema.org/DeleteAction");
	public static final Property postalCode = ResourceFactory.createProperty("http://schema.org/postalCode");
	public static final Property isBasedOn = ResourceFactory.createProperty("http://schema.org/isBasedOn");
	public static final Resource AskAction = ResourceFactory.createResource("http://schema.org/AskAction");
	public static final Resource Date = ResourceFactory.createResource("http://schema.org/Date");
	public static final Resource SubscribeAction = ResourceFactory.createResource("http://schema.org/SubscribeAction");
	public static final Resource Table = ResourceFactory.createResource("http://schema.org/Table");
	public static final Resource SinglePlayer = ResourceFactory.createResource("http://schema.org/SinglePlayer");
	public static final Property streetAddress = ResourceFactory.createProperty("http://schema.org/streetAddress");
	public static final Property gameLocation = ResourceFactory.createProperty("http://schema.org/gameLocation");
	public static final Property ticketedSeat = ResourceFactory.createProperty("http://schema.org/ticketedSeat");
	public static final Resource ProfessionalService = ResourceFactory
			.createResource("http://schema.org/ProfessionalService");
	public static final Property softwareVersion = ResourceFactory.createProperty("http://schema.org/softwareVersion");
	public static final Resource HighSchool = ResourceFactory.createResource("http://schema.org/HighSchool");
	public static final Resource FrontWheelDriveConfiguration = ResourceFactory
			.createResource("http://schema.org/FrontWheelDriveConfiguration");
	public static final Property deathPlace = ResourceFactory.createProperty("http://schema.org/deathPlace");
	public static final Property object = ResourceFactory.createProperty("http://schema.org/object");
	public static final Resource MobilePhoneStore = ResourceFactory
			.createResource("http://schema.org/MobilePhoneStore");
	public static final Resource NoteDigitalDocument = ResourceFactory
			.createResource("http://schema.org/NoteDigitalDocument");
	public static final Resource Number = ResourceFactory.createResource("http://schema.org/Number");
	public static final Property suggestedAnswer = ResourceFactory.createProperty("http://schema.org/suggestedAnswer");
	public static final Property accessibilityControl = ResourceFactory
			.createProperty("http://schema.org/accessibilityControl");
	public static final Resource RsvpResponseNo = ResourceFactory.createResource("http://schema.org/RsvpResponseNo");
	public static final Property amountOfThisGood = ResourceFactory
			.createProperty("http://schema.org/amountOfThisGood");
	public static final Property codeRepository = ResourceFactory.createProperty("http://schema.org/codeRepository");
	public static final Property eligibleDuration = ResourceFactory
			.createProperty("http://schema.org/eligibleDuration");
	public static final Property departurePlatform = ResourceFactory
			.createProperty("http://schema.org/departurePlatform");
	public static final Resource PhotographAction = ResourceFactory
			.createResource("http://schema.org/PhotographAction");
	public static final Resource AllocateAction = ResourceFactory.createResource("http://schema.org/AllocateAction");
	public static final Resource CancelAction = ResourceFactory.createResource("http://schema.org/CancelAction");
	public static final Property gamePlatform = ResourceFactory.createProperty("http://schema.org/gamePlatform");
	public static final Resource TaxiReservation = ResourceFactory.createResource("http://schema.org/TaxiReservation");
	public static final Resource InvestmentOrDeposit = ResourceFactory
			.createResource("http://schema.org/InvestmentOrDeposit");
	public static final Property icaoCode = ResourceFactory.createProperty("http://schema.org/icaoCode");
	public static final Property billingPeriod = ResourceFactory.createProperty("http://schema.org/billingPeriod");
	public static final Resource PotentialActionStatus = ResourceFactory
			.createResource("http://schema.org/PotentialActionStatus");
	public static final Resource BusStop = ResourceFactory.createResource("http://schema.org/BusStop");
	public static final Resource GovernmentOffice = ResourceFactory
			.createResource("http://schema.org/GovernmentOffice");
	public static final Resource MonetaryAmountDistribution = ResourceFactory
			.createResource("http://schema.org/MonetaryAmountDistribution");
	public static final Resource DataType = ResourceFactory.createResource("http://schema.org/DataType");
	public static final Resource BroadcastEvent = ResourceFactory.createResource("http://schema.org/BroadcastEvent");
	public static final Property foodEstablishment = ResourceFactory
			.createProperty("http://schema.org/foodEstablishment");
	public static final Resource StructuredValue = ResourceFactory.createResource("http://schema.org/StructuredValue");
	public static final Property valueName = ResourceFactory.createProperty("http://schema.org/valueName");
	public static final Property authenticator = ResourceFactory.createProperty("http://schema.org/authenticator");
	public static final Resource TrainReservation = ResourceFactory
			.createResource("http://schema.org/TrainReservation");
	public static final Resource PublicHolidays = ResourceFactory.createResource("http://schema.org/PublicHolidays");
	public static final Property successorOf = ResourceFactory.createProperty("http://schema.org/successorOf");
	public static final Property availableChannel = ResourceFactory
			.createProperty("http://schema.org/availableChannel");
	public static final Property knows = ResourceFactory.createProperty("http://schema.org/knows");
	public static final Resource RadioSeason = ResourceFactory.createResource("http://schema.org/RadioSeason");
	public static final Resource WatchAction = ResourceFactory.createResource("http://schema.org/WatchAction");
	public static final Resource BreadcrumbList = ResourceFactory.createResource("http://schema.org/BreadcrumbList");
	public static final Resource MeetingRoom = ResourceFactory.createResource("http://schema.org/MeetingRoom");
	public static final Property sibling = ResourceFactory.createProperty("http://schema.org/sibling");
	public static final Property producer = ResourceFactory.createProperty("http://schema.org/producer");
	public static final Resource ReservationPending = ResourceFactory
			.createResource("http://schema.org/ReservationPending");
	public static final Resource Library = ResourceFactory.createResource("http://schema.org/Library");
	public static final Resource TextDigitalDocument = ResourceFactory
			.createResource("http://schema.org/TextDigitalDocument");
	public static final Property uploadDate = ResourceFactory.createProperty("http://schema.org/uploadDate");
	public static final Resource CreateAction = ResourceFactory.createResource("http://schema.org/CreateAction");
	public static final Resource AudioObject = ResourceFactory.createResource("http://schema.org/AudioObject");
	public static final Resource CommunicateAction = ResourceFactory
			.createResource("http://schema.org/CommunicateAction");
	public static final Property actionPlatform = ResourceFactory.createProperty("http://schema.org/actionPlatform");
	public static final Resource DiabeticDiet = ResourceFactory.createResource("http://schema.org/DiabeticDiet");
	public static final Resource Reservation = ResourceFactory.createResource("http://schema.org/Reservation");
	public static final Property typicalAgeRange = ResourceFactory.createProperty("http://schema.org/typicalAgeRange");
	public static final Resource BowlingAlley = ResourceFactory.createResource("http://schema.org/BowlingAlley");
	public static final Resource SoftwareSourceCode = ResourceFactory
			.createResource("http://schema.org/SoftwareSourceCode");
	public static final Resource MediaObject = ResourceFactory.createResource("http://schema.org/MediaObject");
	public static final Property produces = ResourceFactory.createProperty("http://schema.org/produces");
	public static final Property publisher = ResourceFactory.createProperty("http://schema.org/publisher");
	public static final Property availableDeliveryMethod = ResourceFactory
			.createProperty("http://schema.org/availableDeliveryMethod");
	public static final Resource ParentAudience = ResourceFactory.createResource("http://schema.org/ParentAudience");
	public static final Property episode = ResourceFactory.createProperty("http://schema.org/episode");
	public static final Property availability = ResourceFactory.createProperty("http://schema.org/availability");
	public static final Resource JewelryStore = ResourceFactory.createResource("http://schema.org/JewelryStore");
	public static final Property hoursAvailable = ResourceFactory.createProperty("http://schema.org/hoursAvailable");
	public static final Property numberOfForwardGears = ResourceFactory
			.createProperty("http://schema.org/numberOfForwardGears");
	public static final Resource RadioEpisode = ResourceFactory.createResource("http://schema.org/RadioEpisode");
	public static final Property gtin14 = ResourceFactory.createProperty("http://schema.org/gtin14");
	public static final Property articleBody = ResourceFactory.createProperty("http://schema.org/articleBody");
	public static final Property offers = ResourceFactory.createProperty("http://schema.org/offers");
	public static final Resource NutritionInformation = ResourceFactory
			.createResource("http://schema.org/NutritionInformation");
	public static final Property menu = ResourceFactory.createProperty("http://schema.org/menu");
	public static final Resource ClaimReview = ResourceFactory.createResource("http://schema.org/ClaimReview");
	public static final Property childMinAge = ResourceFactory.createProperty("http://schema.org/childMinAge");
	public static final Resource PayAction = ResourceFactory.createResource("http://schema.org/PayAction");
	public static final Property actor = ResourceFactory.createProperty("http://schema.org/actor");
	public static final Resource True = ResourceFactory.createResource("http://schema.org/True");
	public static final Resource RentAction = ResourceFactory.createResource("http://schema.org/RentAction");
	public static final Property flightDistance = ResourceFactory.createProperty("http://schema.org/flightDistance");
	public static final Property accountablePerson = ResourceFactory
			.createProperty("http://schema.org/accountablePerson");
	public static final Resource ApartmentComplex = ResourceFactory
			.createResource("http://schema.org/ApartmentComplex");
	public static final Resource LodgingReservation = ResourceFactory
			.createResource("http://schema.org/LodgingReservation");
	public static final Resource Playground = ResourceFactory.createResource("http://schema.org/Playground");
	public static final Resource UserCheckins = ResourceFactory.createResource("http://schema.org/UserCheckins");
	public static final Resource Crematorium = ResourceFactory.createResource("http://schema.org/Crematorium");
	public static final Property accessMode = ResourceFactory.createProperty("http://schema.org/accessMode");
	public static final Property givenName = ResourceFactory.createProperty("http://schema.org/givenName");
	public static final Property musicBy = ResourceFactory.createProperty("http://schema.org/musicBy");
	public static final Resource Map = ResourceFactory.createResource("http://schema.org/Map");
	public static final Property incentives = ResourceFactory.createProperty("http://schema.org/incentives");
	public static final Property parentOrganization = ResourceFactory
			.createProperty("http://schema.org/parentOrganization");
	public static final Property gtin12 = ResourceFactory.createProperty("http://schema.org/gtin12");
	public static final Resource WearAction = ResourceFactory.createResource("http://schema.org/WearAction");
	public static final Property estimatedCost = ResourceFactory.createProperty("http://schema.org/estimatedCost");
	public static final Property scheduledTime = ResourceFactory.createProperty("http://schema.org/scheduledTime");
	public static final Property productID = ResourceFactory.createProperty("http://schema.org/productID");
	public static final Property toRecipient = ResourceFactory.createProperty("http://schema.org/toRecipient");
	public static final Property provider = ResourceFactory.createProperty("http://schema.org/provider");
	public static final Property carrier = ResourceFactory.createProperty("http://schema.org/carrier");
	public static final Resource NewsArticle = ResourceFactory.createResource("http://schema.org/NewsArticle");
	public static final Resource Plumber = ResourceFactory.createResource("http://schema.org/Plumber");
	public static final Property sodiumContent = ResourceFactory.createProperty("http://schema.org/sodiumContent");
	public static final Property gameServer = ResourceFactory.createProperty("http://schema.org/gameServer");
	public static final Property alumniOf = ResourceFactory.createProperty("http://schema.org/alumniOf");
	public static final Property gtin13 = ResourceFactory.createProperty("http://schema.org/gtin13");
	public static final Property transcript = ResourceFactory.createProperty("http://schema.org/transcript");
	public static final Resource MusicGroup = ResourceFactory.createResource("http://schema.org/MusicGroup");
	public static final Property dateDeleted = ResourceFactory.createProperty("http://schema.org/dateDeleted");
	public static final Property name = ResourceFactory.createProperty("http://schema.org/name");
	public static final Property datePosted = ResourceFactory.createProperty("http://schema.org/datePosted");
	public static final Resource Flight = ResourceFactory.createResource("http://schema.org/Flight");
	public static final Resource OrderProcessing = ResourceFactory.createResource("http://schema.org/OrderProcessing");
	public static final Property targetDescription = ResourceFactory
			.createProperty("http://schema.org/targetDescription");
	public static final Resource ComedyClub = ResourceFactory.createResource("http://schema.org/ComedyClub");
	public static final Property pageEnd = ResourceFactory.createProperty("http://schema.org/pageEnd");
	public static final Property season = ResourceFactory.createProperty("http://schema.org/season");
	public static final Property permissionType = ResourceFactory.createProperty("http://schema.org/permissionType");
	public static final Resource DataFeed = ResourceFactory.createResource("http://schema.org/DataFeed");
	public static final Resource Occupation = ResourceFactory.createResource("http://schema.org/Occupation");
	public static final Property artform = ResourceFactory.createProperty("http://schema.org/artform");
	public static final Property isicV4 = ResourceFactory.createProperty("http://schema.org/isicV4");
	public static final Property programmingModel = ResourceFactory
			.createProperty("http://schema.org/programmingModel");
	public static final Resource ActionAccessSpecification = ResourceFactory
			.createResource("http://schema.org/ActionAccessSpecification");
	public static final Property acquiredFrom = ResourceFactory.createProperty("http://schema.org/acquiredFrom");
	public static final Property byArtist = ResourceFactory.createProperty("http://schema.org/byArtist");
	public static final Property petsAllowed = ResourceFactory.createProperty("http://schema.org/petsAllowed");
	public static final Property paymentDueDate = ResourceFactory.createProperty("http://schema.org/paymentDueDate");
	public static final Property leiCode = ResourceFactory.createProperty("http://schema.org/leiCode");
	public static final Property numberOfAirbags = ResourceFactory.createProperty("http://schema.org/numberOfAirbags");
	public static final Resource OpeningHoursSpecification = ResourceFactory
			.createResource("http://schema.org/OpeningHoursSpecification");
	public static final Property minValue = ResourceFactory.createProperty("http://schema.org/minValue");
	public static final Property spatialCoverage = ResourceFactory.createProperty("http://schema.org/spatialCoverage");
	public static final Resource WPFooter = ResourceFactory.createResource("http://schema.org/WPFooter");
	public static final Resource Saturday = ResourceFactory.createResource("http://schema.org/Saturday");
	public static final Property executableLibraryName = ResourceFactory
			.createProperty("http://schema.org/executableLibraryName");
	public static final Property creator = ResourceFactory.createProperty("http://schema.org/creator");
	public static final Property serviceLocation = ResourceFactory.createProperty("http://schema.org/serviceLocation");
	public static final Property vatID = ResourceFactory.createProperty("http://schema.org/vatID");
	public static final Resource GolfCourse = ResourceFactory.createResource("http://schema.org/GolfCourse");
	public static final Property homeTeam = ResourceFactory.createProperty("http://schema.org/homeTeam");
	public static final Resource UserPlays = ResourceFactory.createResource("http://schema.org/UserPlays");
	public static final Property acceptedOffer = ResourceFactory.createProperty("http://schema.org/acceptedOffer");
	public static final Resource WritePermission = ResourceFactory.createResource("http://schema.org/WritePermission");
	public static final Property url = ResourceFactory.createProperty("http://schema.org/url");
	public static final Resource BusReservation = ResourceFactory.createResource("http://schema.org/BusReservation");
	public static final Resource EventReservation = ResourceFactory
			.createResource("http://schema.org/EventReservation");
	public static final Property numberOfAxles = ResourceFactory.createProperty("http://schema.org/numberOfAxles");
	public static final Property pageStart = ResourceFactory.createProperty("http://schema.org/pageStart");
	public static final Resource VenueMap = ResourceFactory.createResource("http://schema.org/VenueMap");
	public static final Resource BroadcastService = ResourceFactory
			.createResource("http://schema.org/BroadcastService");
	public static final Property softwareAddOn = ResourceFactory.createProperty("http://schema.org/softwareAddOn");
	public static final Property affiliation = ResourceFactory.createProperty("http://schema.org/affiliation");
	public static final Resource HowToSection = ResourceFactory.createResource("http://schema.org/HowToSection");
	public static final Property seasons = ResourceFactory.createProperty("http://schema.org/seasons");
	public static final Resource MusicAlbum = ResourceFactory.createResource("http://schema.org/MusicAlbum");
	public static final Property additionalProperty = ResourceFactory
			.createProperty("http://schema.org/additionalProperty");
	public static final Property hasDigitalDocumentPermission = ResourceFactory
			.createProperty("http://schema.org/hasDigitalDocumentPermission");
	public static final Resource LegalService = ResourceFactory.createResource("http://schema.org/LegalService");
	public static final Resource VegetarianDiet = ResourceFactory.createResource("http://schema.org/VegetarianDiet");
	public static final Resource ActivateAction = ResourceFactory.createResource("http://schema.org/ActivateAction");
	public static final Property recipeCategory = ResourceFactory.createProperty("http://schema.org/recipeCategory");
	public static final Property suggestedMinAge = ResourceFactory.createProperty("http://schema.org/suggestedMinAge");
	public static final Resource False = ResourceFactory.createResource("http://schema.org/False");
	public static final Resource InteractionCounter = ResourceFactory
			.createResource("http://schema.org/InteractionCounter");
	public static final Resource HomeAndConstructionBusiness = ResourceFactory
			.createResource("http://schema.org/HomeAndConstructionBusiness");
	public static final Resource LoseAction = ResourceFactory.createResource("http://schema.org/LoseAction");
	public static final Resource OnDemandEvent = ResourceFactory.createResource("http://schema.org/OnDemandEvent");
	public static final Property maxValue = ResourceFactory.createProperty("http://schema.org/maxValue");
	public static final Resource RoofingContractor = ResourceFactory
			.createResource("http://schema.org/RoofingContractor");
	public static final Resource Course = ResourceFactory.createResource("http://schema.org/Course");
	public static final Resource UserTweets = ResourceFactory.createResource("http://schema.org/UserTweets");
	public static final Resource EventRescheduled = ResourceFactory
			.createResource("http://schema.org/EventRescheduled");
	public static final Resource MediaSubscription = ResourceFactory
			.createResource("http://schema.org/MediaSubscription");
	public static final Resource WPAdBlock = ResourceFactory.createResource("http://schema.org/WPAdBlock");
	public static final Resource FoodEstablishment = ResourceFactory
			.createResource("http://schema.org/FoodEstablishment");
	public static final Resource DrinkAction = ResourceFactory.createResource("http://schema.org/DrinkAction");
	public static final Property orderStatus = ResourceFactory.createProperty("http://schema.org/orderStatus");
	public static final Resource ProgramMembership = ResourceFactory
			.createResource("http://schema.org/ProgramMembership");
	public static final Property mainContentOfPage = ResourceFactory
			.createProperty("http://schema.org/mainContentOfPage");
	public static final Resource ComedyEvent = ResourceFactory.createResource("http://schema.org/ComedyEvent");
	public static final Resource Male = ResourceFactory.createResource("http://schema.org/Male");
	public static final Property broadcastOfEvent = ResourceFactory
			.createProperty("http://schema.org/broadcastOfEvent");
	public static final Resource UserLikes = ResourceFactory.createResource("http://schema.org/UserLikes");
	public static final Property addressRegion = ResourceFactory.createProperty("http://schema.org/addressRegion");
	public static final Property height = ResourceFactory.createProperty("http://schema.org/height");
	public static final Property postOfficeBoxNumber = ResourceFactory
			.createProperty("http://schema.org/postOfficeBoxNumber");
	public static final Property experienceRequirements = ResourceFactory
			.createProperty("http://schema.org/experienceRequirements");
	public static final Property director = ResourceFactory.createProperty("http://schema.org/director");
	public static final Property proteinContent = ResourceFactory.createProperty("http://schema.org/proteinContent");
	public static final Property trainName = ResourceFactory.createProperty("http://schema.org/trainName");
	public static final Resource ReturnAction = ResourceFactory.createResource("http://schema.org/ReturnAction");
	public static final Property partOfEpisode = ResourceFactory.createProperty("http://schema.org/partOfEpisode");
	public static final Property amenityFeature = ResourceFactory.createProperty("http://schema.org/amenityFeature");
	public static final Property additionalName = ResourceFactory.createProperty("http://schema.org/additionalName");
	public static final Resource ReceiveAction = ResourceFactory.createResource("http://schema.org/ReceiveAction");
	public static final Property accessibilityFeature = ResourceFactory
			.createProperty("http://schema.org/accessibilityFeature");
	public static final Resource NGO = ResourceFactory.createResource("http://schema.org/NGO");
	public static final Resource Rating = ResourceFactory.createResource("http://schema.org/Rating");
	public static final Resource BarOrPub = ResourceFactory.createResource("http://schema.org/BarOrPub");
	public static final Property geoContains = ResourceFactory.createProperty("http://schema.org/geoContains");
	public static final Resource FinancialService = ResourceFactory
			.createResource("http://schema.org/FinancialService");
	public static final Resource OfferItemCondition = ResourceFactory
			.createResource("http://schema.org/OfferItemCondition");
	public static final Property inventoryLevel = ResourceFactory.createProperty("http://schema.org/inventoryLevel");
	public static final Property nutrition = ResourceFactory.createProperty("http://schema.org/nutrition");
	public static final Property interactionService = ResourceFactory
			.createProperty("http://schema.org/interactionService");
	public static final Resource Dataset = ResourceFactory.createResource("http://schema.org/Dataset");
	public static final Resource MusicAlbumReleaseType = ResourceFactory
			.createResource("http://schema.org/MusicAlbumReleaseType");
	public static final Property actionApplication = ResourceFactory
			.createProperty("http://schema.org/actionApplication");
	public static final Property encoding = ResourceFactory.createProperty("http://schema.org/encoding");
	public static final Property confirmationNumber = ResourceFactory
			.createProperty("http://schema.org/confirmationNumber");
	public static final Property timeRequired = ResourceFactory.createProperty("http://schema.org/timeRequired");
	public static final Property material = ResourceFactory.createProperty("http://schema.org/material");
	public static final Resource RsvpResponseType = ResourceFactory
			.createResource("http://schema.org/RsvpResponseType");
	public static final Property workLocation = ResourceFactory.createProperty("http://schema.org/workLocation");
	public static final Property pickupTime = ResourceFactory.createProperty("http://schema.org/pickupTime");
	public static final Property driveWheelConfiguration = ResourceFactory
			.createProperty("http://schema.org/driveWheelConfiguration");
	public static final Property additionalType = ResourceFactory.createProperty("http://schema.org/additionalType");
	public static final Property amount = ResourceFactory.createProperty("http://schema.org/amount");
	public static final Resource PostOffice = ResourceFactory.createResource("http://schema.org/PostOffice");
	public static final Property broadcaster = ResourceFactory.createProperty("http://schema.org/broadcaster");
	public static final Property relatedLink = ResourceFactory.createProperty("http://schema.org/relatedLink");
	public static final Resource OnlineOnly = ResourceFactory.createResource("http://schema.org/OnlineOnly");
	public static final Resource OrderPickupAvailable = ResourceFactory
			.createResource("http://schema.org/OrderPickupAvailable");
	public static final Property previousStartDate = ResourceFactory
			.createProperty("http://schema.org/previousStartDate");
	public static final Resource Resort = ResourceFactory.createResource("http://schema.org/Resort");
	public static final Property buyer = ResourceFactory.createProperty("http://schema.org/buyer");
	public static final Resource ResumeAction = ResourceFactory.createResource("http://schema.org/ResumeAction");
	public static final Property gtin8 = ResourceFactory.createProperty("http://schema.org/gtin8");
	public static final Property durationOfWarranty = ResourceFactory
			.createProperty("http://schema.org/durationOfWarranty");
	public static final Property playerType = ResourceFactory.createProperty("http://schema.org/playerType");
	public static final Property weight = ResourceFactory.createProperty("http://schema.org/weight");
	public static final Property employmentType = ResourceFactory.createProperty("http://schema.org/employmentType");
	public static final Property isbn = ResourceFactory.createProperty("http://schema.org/isbn");
	public static final Property dataFeedElement = ResourceFactory.createProperty("http://schema.org/dataFeedElement");
	public static final Resource BedType = ResourceFactory.createResource("http://schema.org/BedType");
	public static final Property salaryCurrency = ResourceFactory.createProperty("http://schema.org/salaryCurrency");
	public static final Resource EventCancelled = ResourceFactory.createResource("http://schema.org/EventCancelled");
	public static final Resource MensClothingStore = ResourceFactory
			.createResource("http://schema.org/MensClothingStore");
	public static final Resource AddAction = ResourceFactory.createResource("http://schema.org/AddAction");
	public static final Property steeringPosition = ResourceFactory
			.createProperty("http://schema.org/steeringPosition");
	public static final Property passengerSequenceNumber = ResourceFactory
			.createProperty("http://schema.org/passengerSequenceNumber");
	public static final Resource PreSale = ResourceFactory.createResource("http://schema.org/PreSale");
	public static final Property musicalKey = ResourceFactory.createProperty("http://schema.org/musicalKey");
	public static final Resource Researcher = ResourceFactory.createResource("http://schema.org/Researcher");
	public static final Resource VoteAction = ResourceFactory.createResource("http://schema.org/VoteAction");
	public static final Property bookingTime = ResourceFactory.createProperty("http://schema.org/bookingTime");
	public static final Property remainingAttendeeCapacity = ResourceFactory
			.createProperty("http://schema.org/remainingAttendeeCapacity");
	public static final Property videoQuality = ResourceFactory.createProperty("http://schema.org/videoQuality");
	public static final Property vehicleSeatingCapacity = ResourceFactory
			.createProperty("http://schema.org/vehicleSeatingCapacity");
	public static final Property ticketToken = ResourceFactory.createProperty("http://schema.org/ticketToken");
	public static final Property memoryRequirements = ResourceFactory
			.createProperty("http://schema.org/memoryRequirements");
	public static final Resource UnRegisterAction = ResourceFactory
			.createResource("http://schema.org/UnRegisterAction");
	public static final Resource RadioChannel = ResourceFactory.createResource("http://schema.org/RadioChannel");
	public static final Resource FindAction = ResourceFactory.createResource("http://schema.org/FindAction");
	public static final Property issn = ResourceFactory.createProperty("http://schema.org/issn");
	public static final Property branchOf = ResourceFactory.createProperty("http://schema.org/branchOf");
	public static final Resource ElectronicsStore = ResourceFactory
			.createResource("http://schema.org/ElectronicsStore");
	public static final Property softwareHelp = ResourceFactory.createProperty("http://schema.org/softwareHelp");
	public static final Property printEdition = ResourceFactory.createProperty("http://schema.org/printEdition");
	public static final Resource OceanBodyOfWater = ResourceFactory
			.createResource("http://schema.org/OceanBodyOfWater");
	public static final Property isSimilarTo = ResourceFactory.createProperty("http://schema.org/isSimilarTo");
	public static final Resource MovieRentalStore = ResourceFactory
			.createResource("http://schema.org/MovieRentalStore");
	public static final Resource Zoo = ResourceFactory.createResource("http://schema.org/Zoo");
	public static final Property taxID = ResourceFactory.createProperty("http://schema.org/taxID");
	public static final Resource DamagedCondition = ResourceFactory
			.createResource("http://schema.org/DamagedCondition");
	public static final Property photos = ResourceFactory.createProperty("http://schema.org/photos");
	public static final Property availableOnDevice = ResourceFactory
			.createProperty("http://schema.org/availableOnDevice");
	public static final Resource SingleFamilyResidence = ResourceFactory
			.createResource("http://schema.org/SingleFamilyResidence");
	public static final Property requiredCollateral = ResourceFactory
			.createProperty("http://schema.org/requiredCollateral");
	public static final Resource ExhibitionEvent = ResourceFactory.createResource("http://schema.org/ExhibitionEvent");
	public static final Property accessibilityAPI = ResourceFactory
			.createProperty("http://schema.org/accessibilityAPI");
	public static final Property characterName = ResourceFactory.createProperty("http://schema.org/characterName");
	public static final Property servingSize = ResourceFactory.createProperty("http://schema.org/servingSize");
	public static final Resource LegislativeBuilding = ResourceFactory
			.createResource("http://schema.org/LegislativeBuilding");
	public static final Property yearlyRevenue = ResourceFactory.createProperty("http://schema.org/yearlyRevenue");
	public static final Property valueReference = ResourceFactory.createProperty("http://schema.org/valueReference");
	public static final Resource AssessAction = ResourceFactory.createResource("http://schema.org/AssessAction");
	public static final Property mainEntityOfPage = ResourceFactory
			.createProperty("http://schema.org/mainEntityOfPage");
	public static final Property free = ResourceFactory.createProperty("http://schema.org/free");
	public static final Property landlord = ResourceFactory.createProperty("http://schema.org/landlord");
	public static final Resource ReviewAction = ResourceFactory.createResource("http://schema.org/ReviewAction");
	public static final Resource ParcelService = ResourceFactory.createResource("http://schema.org/ParcelService");
	public static final Resource BankOrCreditUnion = ResourceFactory
			.createResource("http://schema.org/BankOrCreditUnion");
	public static final Property educationalRole = ResourceFactory.createProperty("http://schema.org/educationalRole");
	public static final Resource TrainTrip = ResourceFactory.createResource("http://schema.org/TrainTrip");
	public static final Resource PeopleAudience = ResourceFactory.createResource("http://schema.org/PeopleAudience");
	public static final Resource QualitativeValue = ResourceFactory
			.createResource("http://schema.org/QualitativeValue");
	public static final Property caption = ResourceFactory.createProperty("http://schema.org/caption");
	public static final Resource CDFormat = ResourceFactory.createResource("http://schema.org/CDFormat");
	public static final Resource WantAction = ResourceFactory.createResource("http://schema.org/WantAction");
	public static final Property item = ResourceFactory.createProperty("http://schema.org/item");
	public static final Property supply = ResourceFactory.createProperty("http://schema.org/supply");
	public static final Property attendee = ResourceFactory.createProperty("http://schema.org/attendee");
	public static final Property sugarContent = ResourceFactory.createProperty("http://schema.org/sugarContent");
	public static final Resource RiverBodyOfWater = ResourceFactory
			.createResource("http://schema.org/RiverBodyOfWater");
	public static final Resource LodgingBusiness = ResourceFactory.createResource("http://schema.org/LodgingBusiness");
	public static final Resource TransferAction = ResourceFactory.createResource("http://schema.org/TransferAction");
	public static final Resource Store = ResourceFactory.createResource("http://schema.org/Store");
	public static final Property releaseNotes = ResourceFactory.createProperty("http://schema.org/releaseNotes");
	public static final Property exampleOfWork = ResourceFactory.createProperty("http://schema.org/exampleOfWork");
	public static final Resource Invoice = ResourceFactory.createResource("http://schema.org/Invoice");
	public static final Property addressCountry = ResourceFactory.createProperty("http://schema.org/addressCountry");
	public static final Property boardingGroup = ResourceFactory.createProperty("http://schema.org/boardingGroup");
	public static final Property bccRecipient = ResourceFactory.createProperty("http://schema.org/bccRecipient");
	public static final Property lowPrice = ResourceFactory.createProperty("http://schema.org/lowPrice");
	public static final Resource HealthClub = ResourceFactory.createResource("http://schema.org/HealthClub");
	public static final Resource Demand = ResourceFactory.createResource("http://schema.org/Demand");
	public static final Resource HardwareStore = ResourceFactory.createResource("http://schema.org/HardwareStore");
	public static final Resource OrderItem = ResourceFactory.createResource("http://schema.org/OrderItem");
	public static final Resource Sunday = ResourceFactory.createResource("http://schema.org/Sunday");
	public static final Property playersOnline = ResourceFactory.createProperty("http://schema.org/playersOnline");
	public static final Property isGift = ResourceFactory.createProperty("http://schema.org/isGift");
	public static final Resource Florist = ResourceFactory.createResource("http://schema.org/Florist");
	public static final Property interactivityType = ResourceFactory
			.createProperty("http://schema.org/interactivityType");
	public static final Property numberOfPlayers = ResourceFactory.createProperty("http://schema.org/numberOfPlayers");
	public static final Resource Room = ResourceFactory.createResource("http://schema.org/Room");
	public static final Property episodes = ResourceFactory.createProperty("http://schema.org/episodes");
	public static final Property musicArrangement = ResourceFactory
			.createProperty("http://schema.org/musicArrangement");
	public static final Property startDate = ResourceFactory.createProperty("http://schema.org/startDate");
	public static final Property manufacturer = ResourceFactory.createProperty("http://schema.org/manufacturer");
	public static final Resource OrderProblem = ResourceFactory.createResource("http://schema.org/OrderProblem");
	public static final Resource EventPostponed = ResourceFactory.createResource("http://schema.org/EventPostponed");
	public static final Property spatial = ResourceFactory.createProperty("http://schema.org/spatial");
	public static final Property temporalCoverage = ResourceFactory
			.createProperty("http://schema.org/temporalCoverage");
	public static final Property application = ResourceFactory.createProperty("http://schema.org/application");
	public static final Property review = ResourceFactory.createProperty("http://schema.org/review");
	public static final Property branchCode = ResourceFactory.createProperty("http://schema.org/branchCode");
	public static final Resource PlanAction = ResourceFactory.createResource("http://schema.org/PlanAction");
	public static final Resource PropertyValueSpecification = ResourceFactory
			.createResource("http://schema.org/PropertyValueSpecification");
	public static final Property currenciesAccepted = ResourceFactory
			.createProperty("http://schema.org/currenciesAccepted");
	public static final Resource ChooseAction = ResourceFactory.createResource("http://schema.org/ChooseAction");
	public static final Resource PublicationEvent = ResourceFactory
			.createResource("http://schema.org/PublicationEvent");
	public static final Property appliesToPaymentMethod = ResourceFactory
			.createProperty("http://schema.org/appliesToPaymentMethod");
	public static final Property requiredGender = ResourceFactory.createProperty("http://schema.org/requiredGender");
	public static final Resource Park = ResourceFactory.createResource("http://schema.org/Park");
	public static final Property target = ResourceFactory.createProperty("http://schema.org/target");
	public static final Property warrantyPromise = ResourceFactory.createProperty("http://schema.org/warrantyPromise");
	public static final Property isConsumableFor = ResourceFactory.createProperty("http://schema.org/isConsumableFor");
	public static final Property hasPart = ResourceFactory.createProperty("http://schema.org/hasPart");
	public static final Property specialty = ResourceFactory.createProperty("http://schema.org/specialty");
	public static final Property learningResourceType = ResourceFactory
			.createProperty("http://schema.org/learningResourceType");
	public static final Resource AnimalShelter = ResourceFactory.createResource("http://schema.org/AnimalShelter");
	public static final Resource CassetteFormat = ResourceFactory.createResource("http://schema.org/CassetteFormat");
	public static final Property subjectOf = ResourceFactory.createProperty("http://schema.org/subjectOf");
	public static final Resource DeliveryEvent = ResourceFactory.createResource("http://schema.org/DeliveryEvent");
	public static final Resource LowFatDiet = ResourceFactory.createResource("http://schema.org/LowFatDiet");
	public static final Resource ListenAction = ResourceFactory.createResource("http://schema.org/ListenAction");
	public static final Property sku = ResourceFactory.createProperty("http://schema.org/sku");
	public static final Property seller = ResourceFactory.createProperty("http://schema.org/seller");
	public static final Property duns = ResourceFactory.createProperty("http://schema.org/duns");
	public static final Resource Hotel = ResourceFactory.createResource("http://schema.org/Hotel");
	public static final Resource DrawAction = ResourceFactory.createResource("http://schema.org/DrawAction");
	public static final Property acceptsReservations = ResourceFactory
			.createProperty("http://schema.org/acceptsReservations");
	public static final Resource SpreadsheetDigitalDocument = ResourceFactory
			.createResource("http://schema.org/SpreadsheetDigitalDocument");
	public static final Resource SteeringPositionValue = ResourceFactory
			.createResource("http://schema.org/SteeringPositionValue");
	public static final Property firstPerformance = ResourceFactory
			.createProperty("http://schema.org/firstPerformance");
	public static final Property reviewedBy = ResourceFactory.createProperty("http://schema.org/reviewedBy");
	public static final Resource WarrantyScope = ResourceFactory.createResource("http://schema.org/WarrantyScope");
	public static final Property mealService = ResourceFactory.createProperty("http://schema.org/mealService");
	public static final Property numberOfEmployees = ResourceFactory
			.createProperty("http://schema.org/numberOfEmployees");
	public static final Property deliveryMethod = ResourceFactory.createProperty("http://schema.org/deliveryMethod");
	public static final Property reviews = ResourceFactory.createProperty("http://schema.org/reviews");
	public static final Property specialCommitments = ResourceFactory
			.createProperty("http://schema.org/specialCommitments");
	public static final Resource AdultEntertainment = ResourceFactory
			.createResource("http://schema.org/AdultEntertainment");
	public static final Resource AutoBodyShop = ResourceFactory.createResource("http://schema.org/AutoBodyShop");
	public static final Property encodingFormat = ResourceFactory.createProperty("http://schema.org/encodingFormat");
	public static final Resource TrackAction = ResourceFactory.createResource("http://schema.org/TrackAction");
	public static final Property knownVehicleDamages = ResourceFactory
			.createProperty("http://schema.org/knownVehicleDamages");
	public static final Property broadcastDisplayName = ResourceFactory
			.createProperty("http://schema.org/broadcastDisplayName");
	public static final Resource SportsOrganization = ResourceFactory
			.createResource("http://schema.org/SportsOrganization");
	public static final Resource Enumeration = ResourceFactory.createResource("http://schema.org/Enumeration");
	public static final Resource ProfilePage = ResourceFactory.createResource("http://schema.org/ProfilePage");
	public static final Property eligibleQuantity = ResourceFactory
			.createProperty("http://schema.org/eligibleQuantity");
	public static final Resource AcceptAction = ResourceFactory.createResource("http://schema.org/AcceptAction");
	public static final Resource Embassy = ResourceFactory.createResource("http://schema.org/Embassy");
	public static final Property dateRead = ResourceFactory.createProperty("http://schema.org/dateRead");
	public static final Resource FAQPage = ResourceFactory.createResource("http://schema.org/FAQPage");
	public static final Resource GovernmentBuilding = ResourceFactory
			.createResource("http://schema.org/GovernmentBuilding");
	public static final Resource DataCatalog = ResourceFactory.createResource("http://schema.org/DataCatalog");
	public static final Resource OrderStatus = ResourceFactory.createResource("http://schema.org/OrderStatus");
	public static final Property namedPosition = ResourceFactory.createProperty("http://schema.org/namedPosition");
	public static final Resource Place = ResourceFactory.createResource("http://schema.org/Place");
	public static final Property contributor = ResourceFactory.createProperty("http://schema.org/contributor");
	public static final Resource QuantitativeValue = ResourceFactory
			.createResource("http://schema.org/QuantitativeValue");
	public static final Resource CivicStructure = ResourceFactory.createResource("http://schema.org/CivicStructure");
	public static final Resource Aquarium = ResourceFactory.createResource("http://schema.org/Aquarium");
	public static final Property hasMenuSection = ResourceFactory.createProperty("http://schema.org/hasMenuSection");
	public static final Property brand = ResourceFactory.createProperty("http://schema.org/brand");
	public static final Resource Notary = ResourceFactory.createResource("http://schema.org/Notary");
	public static final Resource ComputerStore = ResourceFactory.createResource("http://schema.org/ComputerStore");
	public static final Resource Float = ResourceFactory.createResource("http://schema.org/Float");
	public static final Property homeLocation = ResourceFactory.createProperty("http://schema.org/homeLocation");
	public static final Property dateModified = ResourceFactory.createProperty("http://schema.org/dateModified");
	public static final Resource ListItem = ResourceFactory.createResource("http://schema.org/ListItem");
	public static final Resource Monday = ResourceFactory.createResource("http://schema.org/Monday");
	public static final Property numChildren = ResourceFactory.createProperty("http://schema.org/numChildren");
	public static final Property albums = ResourceFactory.createProperty("http://schema.org/albums");
	public static final Property reservationStatus = ResourceFactory
			.createProperty("http://schema.org/reservationStatus");
	public static final Resource PerformAction = ResourceFactory.createResource("http://schema.org/PerformAction");
	public static final Resource AudiobookFormat = ResourceFactory.createResource("http://schema.org/AudiobookFormat");
	public static final Property serverStatus = ResourceFactory.createProperty("http://schema.org/serverStatus");
	public static final Property greater = ResourceFactory.createProperty("http://schema.org/greater");
	public static final Property screenCount = ResourceFactory.createProperty("http://schema.org/screenCount");
	public static final Property significantLink = ResourceFactory.createProperty("http://schema.org/significantLink");
	public static final Resource NewCondition = ResourceFactory.createResource("http://schema.org/NewCondition");
	public static final Property requiredMaxAge = ResourceFactory.createProperty("http://schema.org/requiredMaxAge");
	public static final Property maxPrice = ResourceFactory.createProperty("http://schema.org/maxPrice");
	public static final Resource WebSite = ResourceFactory.createResource("http://schema.org/WebSite");
	public static final Resource FoodService = ResourceFactory.createResource("http://schema.org/FoodService");
	public static final Property warrantyScope = ResourceFactory.createProperty("http://schema.org/warrantyScope");
	public static final Property question = ResourceFactory.createProperty("http://schema.org/question");
	public static final Property funder = ResourceFactory.createProperty("http://schema.org/funder");
	public static final Property predecessorOf = ResourceFactory.createProperty("http://schema.org/predecessorOf");
	public static final Resource AggregateRating = ResourceFactory.createResource("http://schema.org/AggregateRating");
}
