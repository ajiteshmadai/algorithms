package com.ajiteshmadai.algorithm.searching;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class LinearSearchTest {

    private static final String[] WORDS = {"sheep", "pipe", "dream", "crawl", "goofy", "sleep", "subsequent", "eyes", "motion", "ritzy",
            "tasteless", "duck", "ruthless", "chunky", "talented", "plucky", "evanescent", "scarecrow", "fallacious",
            "direction", "party", "live", "innocent", "imminent", "drop", "jolly", "statuesque", "pine", "ahead",
            "deserted", "activity", "follow", "abaft", "houses", "sticks", "doubt", "knotty", "cagey", "march",
            "arrange", "colour", "orange", "unit", "bore", "lopsided", "butter", "glib", "harm", "battle", "vase",
            "blood", "flaky", "bent", "trade", "babies", "belong", "sticky", "dance", "rings", "canvas", "sore",
            "fry", "normal", "silent", "language", "silver", "borrow", "supply", "savory", "abusive", "exotic",
            "thoughtful", "upset", "aloof", "walk", "explode", "stiff", "ready", "touch", "rail", "support",
            "wiggly", "tough", "recognise", "wooden", "tease", "loaf", "honey", "nutritious", "mint",
            "anxious", "adhesive", "scold", "meaty", "prefer", "remarkable", "mother", "ink", "agree",
            "flippant", "digestion", "seal", "wretched", "purring", "group", "grab", "attempt", "stew",
            "glossy", "deliver", "worried", "ill", "fireman", "ambiguous", "learn", "structure",
            "business", "consider", "quirky", "unnatural", "scrape", "toy", "join", "flowers",
            "eye", "impress", "eminent", "hesitant", "scared", "sneaky", "hollow", "tax", "jellyfish",
            "irritating", "servant", "sleepy", "melted", "confuse", "dogs", "many", "wink", "story", "moaning",
            "square", "call", "cuddly", "giants", "compare", "aftermath", "bee", "fear", "feigned", "encouraging",
            "illustrious", "question", "account", "spell", "gusty", "old-fashioned", "sassy", "efficient", "red",
            "bottle", "heal", "cheat", "thick", "trashy", "divide", "cumbersome", "umbrella", "toes", "decay", "rare",
            "furniture", "nosy", "include", "rifle", "sturdy", "weather", "nondescript", "tempt", "threatening", "knife",
            "care", "frogs", "zephyr", "instruct", "grouchy", "afterthought", "mice", "yarn", "extra-small", "fish", "measly",
            "wrap", "unequaled", "stale", "letters", "giant", "cut", "spot", "wreck", "irate", "friends", "bushes", "jar",
            "press", "help", "recess", "perfect", "yell", "continue", "legs", "roasted", "desert", "yummy", "earthy", "examine",
            "need", "chalk", "macabre", "spare", "compete", "space", "sidewalk", "suspend", "riddle", "club", "zoo", "wry",
            "obese", "peaceful", "combative", "multiply", "perpetual", "abhorrent", "right", "capricious", "fascinated",
            "mate", "laugh", "start", "entertaining", "humorous", "seashore", "vessel", "thinkable", "alarm", "bump",
            "hungry", "gold", "fantastic", "meat", "oatmeal", "temper", "solid", "plantation", "songs", "lumpy",
            "engine", "advise", "voiceless", "class", "well-made", "treatment", "lackadaisical", "secretive",
            "unarmed", "kneel", "tacit", "knock", "contain", "welcome", "meeting", "quiver", "visit", "massive",
            "needle", "easy", "rate", "expansion", "economic", "closed", "melodic", "place", "poke", "burst", "modern",
            "deserve", "foregoing", "lively", "crabby", "star", "hum", "buzz", "wary", "terrify", "attend", "rub",
            "phone", "fat", "proud", "succinct", "middle", "stove", "house", "cry", "spotless", "sedate", "burn", "cakes",
            "kill", "carve", "tip", "dry", "punishment", "reign", "improve", "hug", "illegal", "public", "program",
            "dime", "grip", "cold", "mist", "trap", "fail", "trees", "past", "root", "witty", "wobble", "juvenile", "potato",
            "parched", "crack", "straw", "wistful", "knot", "slap", "settle", "interfere", "likeable", "big", "stereotyped",
            "magenta", "territory", "stranger", "lowly", "communicate", "wish", "view", "expert", "name", "country", "unlock",
            "inquisitive", "brief", "educate", "assorted", "left", "wing", "debonair", "label", "cub", "furtive", "cowardly",
            "finger", "magical", "groovy", "push", "instrument", "guarantee", "royal", "pan", "didactic", "self", "company",
            "writing", "cast", "lewd", "faithful", "mature", "fill", "clam", "typical", "incandescent", "flight", "filthy",
            "open", "fine", "cow", "own", "scary", "driving", "governor", "pets", "tasty", "far", "check", "succeed", "sharp",
            "breathe", "next", "different", "wait", "amount", "advertisement", "face", "haircut", "parsimonious", "prick",
            "scarce", "excuse", "rigid", "agonizing", "foolish", "paper", "wrathful", "suggest", "tumble", "thaw", "precious",
            "optimal", "dear", "appreciate", "workable", "long", "hour", "nod", "dust", "wrench", "zipper", "panoramic", "frame",
            "shrill", "yellow", "reduce", "furry", "mess up", "spade", "border", "health", "yam", "number", "point",
            "thank", "arrive", "coil", "sea", "stop", "quack", "painstaking", "release", "delicious", "fruit",
            "plane", "blow", "eggs", "mountain", "run", "angle", "godly", "enchanting", "special", "cave",
            "pour", "quixotic", "bells", "sense", "price", "wheel", "impartial", "present", "pale", "worry",
            "suppose", "piquant", "grubby", "sock", "petite", "apparatus", "plastic", "wild", "detail",
            "describe", "film", "desire", "tart", "charge", "bounce", "feeble", "laborer", "bear", "event",
            "effect", "picayune", "misty", "toad", "overflow", "tub", "pen", "elbow", "pencil", "animal",
            "north", "society", "argument", "jobless", "hang", "obey", "whirl", "zany", "iron", "eatable",
            "squeal", "comfortable", "unbiased", "abject", "hover", "trick", "horse", "substance", "doubtful",
            "ultra", "avoid", "scatter", "hospitable", "employ", "dirty", "reproduce", "courageous", "spicy",
            "sheet", "mourn", "beam", "full", "phobic", "appliance", "ban", "various", "taste", "ill-informed",
            "birthday", "secretary", "mitten", "nauseating", "annoy", "birds", "amusing", "skate", "enchanted",
            "attractive", "futuristic", "strong", "disturbed", "fax", "uninterested", "paltry", "abrasive",
            "bubble", "snow", "wide-eyed", "claim", "woebegone", "cynical", "nonstop", "helpless", "receive",
            "brave", "cat", "base", "post", "neat", "admit", "use", "pedal", "versed", "ethereal", "spiritual",
            "heap", "glistening", "sound", "trip", "paste", "bath", "coordinated", "tedious", "reminiscent",
            "promise", "confess", "introduce", "annoying", "kindly", "form", "fanatical", "play", "rampant",
            "team", "adorable", "collect", "donkey", "cows", "historical", "army", "rabid", "week", "curl",
            "list", "fade", "fasten", "arithmetic", "wholesale", "curvy", "stroke", "hand", "ants", "intelligent",
            "sort", "prickly", "maid", "long-term", "fog", "scientific", "literate", "nervous", "tail",
            "calculator", "caring", "soak", "stupid", "habitual", "vein", "best", "two", "appear", "payment",
            "calculating", "top", "mend", "alcoholic", "visitor", "locket", "juggle", "rush", "loving",
            "rabbits", "able", "tangy", "room", "handle", "adaptable", "crush", "exultant", "bolt", "soap",
            "overconfident", "rice", "grumpy", "string", "wonderful", "pollution", "ordinary", "ugliest",
            "nostalgic", "travel", "color", "deafening", "please", "sip", "acidic", "count", "reflective",
            "sweltering", "preach", "teeny", "prose", "stomach", "sisters", "axiomatic", "drawer", "loutish",
            "oven", "tie", "ill-fated", "way", "sofa", "belief", "woman", "halting", "lace", "skillful",
            "giddy", "interesting", "scandalous", "numberless", "toys", "grotesque", "standing", "clean",
            "reward", "false", "tremble", "dark", "clip", "unadvised", "quicksand", "aspiring", "incredible",
            "womanly", "size", "lamp", "lake", "wound", "tray", "abrupt", "abashed", "talk", "average",
            "flood", "bashful", "pot", "nimble", "pear", "system", "spring", "minister", "arch", "surround",
            "glue", "pigs", "brawny", "weary", "authority", "dirt", "wall", "quarter", "selective", "horses",
            "stem", "kind", "insurance", "determined", "fairies", "friend", "absorbing", "quarrelsome",
            "capable", "colossal", "complex", "meal", "material", "regret", "steady", "button", "mere",
            "treat", "wacky", "responsible", "invite", "sulky", "advice", "bake", "changeable", "mark",
            "sneeze", "grieving", "jagged", "trust", "bitter", "real", "airport", "merciful", "creepy",
            "suffer", "brown", "barbarous", "wicked", "accurate", "overt", "tremendous", "rainstorm",
            "wrong", "addition", "decide", "weigh", "defiant", "hilarious", "blind", "wool", "powder",
            "smoggy", "challenge", "tidy", "fetch", "obeisant", "numerous", "girl", "scarf", "suit",
            "hard-to-find", "juice", "carry", "wilderness", "mailbox", "teaching", "destruction",
            "unused", "distinct", "stay", "nice", "embarrassed", "skip", "flat", "attract", "disgusted",
            "rich", "love", "slave", "screeching", "relation", "bedroom", "shirt", "leg", "gamy",
            "fancy", "spotty", "absent", "cabbage", "cracker", "division", "hammer", "back", "amuse",
            "turkey", "heavenly", "interest", "dysfunctional", "quince", "fly", "obnoxious", "naughty",
            "disagree", "ossified", "learned", "defeated", "shape", "straight", "chase", "snobbish",
            "admire", "bawdy", "raise", "elegant", "plant", "thundering", "ruin", "simplistic",
            "chicken", "sack", "apparel", "handsome", "young", "sigh", "current", "violent",
            "arrest", "flesh", "chop", "stare", "hope", "maddening", "torpid", "unhealthy",
            "overwrought", "example", "waiting", "evasive", "owe", "hook", "machine", "tiresome",
            "short", "lip", "useful", "six", "thirsty", "animated", "risk", "rebel", "exchange",
            "vast", "unite", "aware", "divergent", "lucky", "disappear", "chief", "dock", "hall",
            "pushy", "oval", "destroy", "double", "squeeze", "giraffe", "memorize", "protective",
            "shop", "crayon", "wiry", "classy", "feeling", "garrulous", "accidental", "detailed",
            "tiger", "hurt", "miss", "tour", "guess", "summer", "warm", "silly", "file", "tenuous",
            "homely", "fence", "vest", "drum", "onerous", "pail", "trouble", "lunch", "float",
            "educated", "peel", "shallow", "expand", "hunt", "moan", "strengthen", "cheap", "imperfect",
            "equable", "scrub", "envious", "tramp", "education", "knowing", "hard", "swim", "festive",
            "cooing", "bored", "seemly", "sprout", "energetic", "cushion", "vengeful", "step", "day",
            "possessive", "gratis", "exercise", "shelf", "rambunctious", "ablaze", "blink", "mellow",
            "damage", "bomb", "yawn", "private", "muscle", "crooked", "bizarre", "tender", "second",
            "trail", "nippy", "fair", "tranquil", "baby", "smelly", "partner", "snore", "soft", "unwieldy",
            "dazzling", "sloppy", "aunt", "bruise", "cruel", "permissible", "truculent", "snakes", "aboriginal", "smoke"};

    @Test
    public void testLinearSearch() {
        LinearSearch<String> linearSearch = new LinearSearch<>();
        Instant start = Instant.now();
        int index = linearSearch.search(WORDS, "smoke");
        Instant finish = Instant.now();
        System.out.println("index: " + index + ", time:" + (Duration.between(start, finish).toMillis()));

    }
}
