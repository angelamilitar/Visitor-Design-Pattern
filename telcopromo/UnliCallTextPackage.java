public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if(!unliCallText) {
            return "No Unlimited Calls & Texts";
        }

        if(telcoName.equalsIgnoreCase("Globe")) {
            return "Unlimited calls & texts within Globe network";
        }
        else if(telcoName.equalsIgnoreCase("Ditto")) {
            return "Unlimited calls & texts to ALL networks";
        }
        else {
            return "No Unlimited Calls & Texts";
        }
    }
}
