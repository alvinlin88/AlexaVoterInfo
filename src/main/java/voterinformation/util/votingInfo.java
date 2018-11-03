package voterinformation.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class votingInfo {
    /**
    public static Map getFactMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Airbus-A380", "The airbus A-380 is the world's largest passenger airliner. It has 40% more usable floor than the next largest airliner, the Boeing 747-8, and provides seating for 525 people in a typical three-class configuration or up to 853 people in an all-economy class configuration.");
        map.put("Boeing-747", "The 747-400, the most common variant in service, has a high-subsonic cruise speed of up to 570 miles per hour.");
        map.put("Boeing-767", "In 1985, the 767 became the first twin-engined airliner to receive regulatory approval for extended overseas flights.");
        map.put("Airbus-A320", "As of 31 March 2018, a total of 8,074 Airbus A320-family aircraft have been delivered, of which 7,722 are in service.");
        map.put("Concorde", "The Concorde had a maximum speed over twice the speed of sound at Mach 2.04, that is 1,354 mph at cruise altitude, with seating for 92 to 128 passengers.");
        return map;
    }

    public static Map getImageMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Airbus-A380", "https://s3.amazonaws.com/ask-samples-resources/images/airbus.jpg");
        map.put("Boeing-747", "https://s3.amazonaws.com/ask-samples-resources/images/airplane-1.jpg");
        map.put("Boeing-767", "https://s3.amazonaws.com/ask-samples-resources/images/airplane-2.jpg");
        map.put("Airbus-A320", "https://s3.amazonaws.com/ask-samples-resources/images/airplane-3.jpg");
        map.put("Concorde", "https://s3.amazonaws.com/ask-samples-resources/images/airplane-4.jpg");
        return map;
    }

    public static List getKeys() {
        List<String> keys = new ArrayList<>();
        keys.add("Airbus-A380");
        keys.add("Boeing-747");
        keys.add("Boeing-767");
        keys.add("Airbus-A320");
        keys.add("Concorde");
        return keys;
    }
    **/
    public static Map getInfo(){
        Map<String, String> map = new HashMap();
        map.put("Candidate","The Democratic candidate for governor in the state of Florida is Andrew Gillum");
        map.put("Amendment3", "Amendment 3 gives voters the exclusive right to decide whether a new casino can open in Florida. This right was previously reserved for Florida legislators who have in recent years not been able to reach an agreement on the issue");
        map.put("Judge", "Jamey Moody and Robin Fuson are the judicial candidates for Florida’s 13th circuit.");
        return map;
    }

    public static Map getInfo2(){
        Map<String, String> map= new HashMap();
        map.put(    "Candidate", "Andrew Gillum has called for a series of gun-control measures, including a ban on assault weapons, limiting the size of magazines, banning armor-piercing bullets and prohibiting guns to those with domestic violence felonies or misdemeanors. For health care, Gillum has also campaigned on a platform of “Medicare for all,” has stated that universal health care is a right, and plans to expand Medicaid in line with the Affordable Care Act, and to guarantee care for those with pre-existing conditions.");
        map.put("Amendment3", "This means that anyone who wanted to build a casino would need to get hundreds of thousands of signatures to get it on a ballot and then hope for voter approval. This would make it more difficult for any dog track or horse track wishing to expand its gaming to do so.");
        map.put("Judge", "According to his website, Jamey Moody is a Hillsborough County native with a long family history of upholding the law. Jamey graduated from the University of Florida with a Bachelor of Science in Finance and a Juris Doctor from UF’s Levin College of Law. His entire career has been spent in Circuit Court, where he has practiced law as a local attorney and partner.");
        return map;
    }

    public static Map getInfo3(){
        Map<String, String> map = new HashMap();
        map.put("Candidate", "Andrew Gillum has stated that disbelief in climate change and inaction threatens the future of our planet. He promises to promote alternative energy sources, and that doing so would enlist more job opportunities to help make the US the world’s leader in clean energy.");
        map.put("Amendment3", "The Seminole Tribe of Florida and Disney because the amendment would make it harder to expand gambling. The two groups have spent nearly $40 million campaigning for Amendment 3.");
        map.put("Judge", "Jamey Moody has been practicing law for 15 years.");
        return map;
    }

    public static Map getInfo4(){
        Map<String, String> map = new HashMap();
        map.put("Candidate", "Andrew Gillum’s running mate is American entrepreneur and democrat, Chris King");
        map.put("Amedement3", "The Seminole Tribe is a casino operator and is not subject to the state’s restrictions on casino-style gambling. Disney has argued that more gambling could tarnish the family-friendly image it banks on to bring in vacationers.");
        map.put("Judge", "Jamey Moody specializes in plaintiff’s personal injury which excludes pro bono services.");
        return map;
    }

    public static Map getInfo5(){
        Map<String, String> map = new HashMap();
        map.put("Candidate", "Andrew Gillum is running for Governor of Florida against republican and former U.S. Representative for Florida's 6th congressional district, Ron DeSantis");
        map.put("Amendment3", "South Florida pari-mutuels that have slot machines, along with firms such as FanDuel and DraftKings and owners of dog and horse tracks");
        map.put("Judge", "Robin Fuson is an experienced criminal defense lawyer, based in the city of Tampa, Florida. He has experience both as a prosecutor and now, as a criminal defense attorney. For the past 15 years, he has been representing and defending clients from a broad range of crimes, which includes the most minor misdemeanors to even the most serious felony charges.");
        return map;
    }

    public static Map getInfo6(){
        Map<String, String> map = new HashMap();
        map.put("Amendment3", "Because they would need statewide voter approval to add casino gambling at those locations.");
        map.put("Judge", "Robin Fuson has been practicing law for 25 years and specializes in criminal law.");
        return map;
    }

    public static List getKeys(){
        List<String> keys = new ArrayList();
        keys.add("Candidate");
        keys.add("Amendment3");
        keys.add("Judge");
        return keys;
    }








}
