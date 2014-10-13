package de.Albritter.SSHJava.helper;

public class Names
{
	public static class LoginFrameNames
	{
		public final static String	LABLE_LOGIN			= "Bitte das Administrator (root) Passwort eingeben";
		public final static String	BUTTON_LOGIN_LOGIN	= "Log in";

	}

	public static class ButtonsActionComands
	{
		public final static String	BUTTON_LOGIN	= "login";

	}

	public static class Messages
	{
		public final static String	LOGIN_FAILD		= "The Login information that you provided are not correct";
		public static final String	TLD_DETECTED	= "Do not type Domains in here";

	}

	public static class Console
	{
		public final static String	TITLE	= "Console";

	}

	public static class Values
	{
		
		public static final String[]	PROTOCOLL_LIST			=
																{ "http", "ftp", "ssh", "udp", "https", "sftp", "ftps" };
		public static final char[]		REMOV_CHARACTER_LIST	=
																{ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'o', 'p', 'q', 'r', 's',
																		't', 'u', 'v', 'w', 'x', 'y', 'z', '/', ':', '\\', ',', '\'' };
		public static final String[]	TLD_LIST				=
																{ ".abogado", ".academy", ".accountant", ".accoun", ".ants", ".active", ".actor", ".ads",
																		".adult", ".africa", ".agency", ".airforce", ".alsace", ".amsterdam", ".analytics",
																		".apartments", ".app", ".arab", ".archi", ".architect", ".army", ".art", ".associates",
																		".attorney", ".auction", ".audible", ".audio", ".auto", ".autos", ".baby", ".band",
																		".bank", ".banque", ".bar", ".barcelona", ".bargains", ".baseball", ".basketball",
																		".bayern", ".beauty", ".beer", ".berlin", ".best", ".bet", ".bible", ".bid", ".bike",
																		".bingo", ".bio", ".black", ".blackfriday", ".blog", ".blue", ".boats", ".boo",
																		".book", ".booking", ".boston", ".boutique", ".box", ".broadway", ".broker",
																		".brussels", ".budapest", ".build", ".builders", ".business", ".buy", ".buzz", ".bway",
																		".bzh", ".cab", ".cafe", ".cam", ".camera", ".camp", ".capetown", ".capital", ".car",
																		".cards", ".care", ".career", ".careers", ".cars", ".casa", ".cash	", ".casino",
																		".catalonia", ".catering", ".center", ".ceo", ".cfd", ".charity", ".chat", ".cheap",
																		".christmas", ".church", ".city", ".cityeats", ".claims", ".cleaning", ".click",
																		".clinic", ".clothing", ".cloud", ".club", ".coach", ".codes", ".coffee", ".college",
																		".cologne", ".community", ".company", ".computer", ".comsec", ".condos",
																		".construction", ".consulting", ".contact", ".contractors", ".cooking", ".cool",
																		".corp", ".country", ".coupon", ".coupons", ".courses", ".cpa", ".credit",
																		".creditcard", ".creditunion", ".cricket", ".cruises", ".cymru", ".cyou", ".dad",
																		".dance", ".data", ".date", ".dating", ".day", ".dds", ".deal", ".deals", ".degree",
																		".delivery", ".democrat", ".dental", ".dentist", ".desi", ".design", ".diamonds",
																		".diet", ".digital", ".direct", ".directory", ".discount", ".diy", ".docs", ".doctor",
																		".dog", ".domains", ".dot", ".download", ".earth", ".eat", ".eco", ".ecom",
																		".education", ".email", ".energy", ".engineer", ".engineering", ".enterprises",
																		".epost", ".equipment", ".esq", ".estate", ".eus", ".events", ".exchange", ".expert",
																		".exposed", ".express", ".fail", ".faith", ".family", ".fan", ".fans", ".farm",
																		".fashion", ".feedback", ".film", ".final", ".finance", ".financial", ".financialaid",
																		".fish", ".fishing", ".fit", ".fitness", ".flights", ".florist", ".flowers", ".fly",
																		".foo", ".food", ".football", ".forsale", ".forum", ".foundation", ".free", ".frl",
																		".fun", ".fund", ".furniture", ".futbol", ".fyi", ".gal", ".gallery", ".game",
																		".games", ".garden", ".gay", ".gent", ".gift", ".gifts", ".gives", ".glass", ".global",
																		".gmbh", ".gold", ".golf", ".goo", ".gop", ".graphics", ".gratis", ".green", ".gripe",
																		".group", ".guide", ".guitars", ".guru", ".hair", ".halal", ".hamburg", ".haus",
																		".health", ".healthcare", ".heart", ".help", ".helsinki", ".here", ".hiphop", ".hiv",
																		".hockey", ".holdings", ".holiday", ".home", ".homes", ".horse", ".hospital", ".host",
																		".hosting", ".hot", ".hotel", ".hotels", ".house", ".how", ".icu", ".idn", ".immo",
																		".immobilien", ".inc", ".indians", ".industries", ".ing", ".ink", ".institute",
																		".insurance", ".insure", ".international", ".investments", ".ira", ".irish", ".islam",
																		".ist", ".istanbul", ".jetzt", ".jewelry", ".joburg", ".juegos", ".kaufen", ".kid",
																		".kids", ".kim", ".kitchen", ".kiwi", ".kosher", ".kyoto", ".land", ".lat", ".latino",
																		".law", ".lawyer", ".lds", ".lease", ".legal", ".lgbt", ".life", ".lifestyle",
																		".lighting", ".limited", ".limo", ".link", ".live", ".living", ".llc", ".llp", ".loan",
																		".loans", ".lol", ".london", ".lotto", ".love", ".ltd", ".luxe", ".luxury", ".madrid",
																		".mail", ".maison", ".management", ".map", ".market", ".marketing", ".markets", ".mba",
																		".med", ".media", ".medical", ".meet", ".melbourne", ".meme", ".memorial", ".men",
																		".menu", ".miami", ".mls", ".mobile", ".mobily", ".moda", ".moe", ".mom", ".money",
																		".mormon", ".mortgage", ".moscow", ".moto", ".motorcycles", ".mov", ".movie", ".music",
																		".nagoya", ".navy", ".network", ".new", ".news", ".ngo", ".ninja", ".now", ".nowruz",
																		".nrw", ".nyc", ".okinawa", ".one", ".ong", ".online", ".ooo", ".organic", ".osaka",
																		".paris", ".pars", ".partners", ".parts", ".party", ".pay", ".persiangulf", ".pet",
																		".pets", ".pharmacy", ".phd", ".phone", ".photo", ".photography", ".photos", ".physio",
																		".pics", ".pictures", ".pid", ".pink", ".pizza", ".place", ".play", ".plumbing",
																		".plus", ".poker", ".porn", ".press", ".productions", ".prof", ".promo", ".properties",
																		".property", ".pub", ".qpon", ".quebec", ".racing", ".radio", ".realestate",
																		".realtor", ".realty", ".recipes", ".red", ".rehab", ".reise", ".reisen", ".reit",
																		".ren", ".rent", ".rentals", ".repair", ".report", ".republican", ".rest",
																		".restaurant", ".review", ".reviews", ".rich", ".rip", ".rocks", ".rodeo", ".roma",
																		".rsvp", ".rugby", ".ruhr", ".run", ".ryukyu", ".safe", ".sale", ".salon", ".sarl",
																		".save", ".scholarships", ".school", ".schule", ".science", ".scot", ".search",
																		".secure", ".security", ".services", ".sex", ".sexy", ".shia", ".shiksha", ".shoes",
																		".shop", ".shopping", ".show", ".singles", ".site", ".ski", ".soccer", ".social",
																		".software", ".solar", ".solutions", ".soy", ".spa", ".space", ".sport", ".sports",
																		".spot", ".srl", ".stockholm", ".storage", ".store", ".studio", ".style", ".sucks",
																		".supplies", ".supply", ".support", ".surf", ".surgery", ".swiss", ".sydney",
																		".systems", ".taipei", ".tatar", ".tattoo", ".tax", ".taxi", ".team", ".tech",
																		".technology", ".tennis", ".thai", ".theater", ".theatre", ".tickets", ".tienda",
																		".tips", ".tires", ".tirol", ".today", ".tokyo", ".tools", ".top", ".tour", ".tours",
																		".town", ".toys", ".trade", ".trading", ".training", ".translations", ".tube",
																		".university", ".uno", ".vacations", ".vegas", ".ventures", ".versicherung", ".vet",
																		".viajes", ".video", ".villas", ".vin", ".vip", ".vision", ".vlaanderen", ".vodka",
																		".vote", ".voting", ".voto", ".voyage", ".wales", ".wang", ".watch", ".web", ".webcam",
																		".website", ".wed", ".wedding", ".weibo", ".whoswho", ".wien", ".wiki", ".win",
																		".wine", ".work", ".works", ".world", ".wow", ".wtf", ".xin", ".xyz", ".yachts",
																		".yoga", ".yokohama", ".you", ".zip", ".zone", ".zuerich", ".zulu" };
	}
}
