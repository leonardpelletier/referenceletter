class ReferenceLetter {
    public ReferenceLetter() {
        //nothing to do...
    }
    
    public void writeLetter(String name){
        salutation();
        academicPerformance(name);
        extraCurriculars();
        personality(name);
        conclusion(name);
    }

    private void salutation() {
        System.out.println("To whom it may concern,");
        System.out.println();
    }

    private void academicPerformance(String name) {
        System.out.println(name + " is crushing it in school.");
        System.out.println();
    }
    
    private void extraCurriculars() {
        System.out.println("They are also passionate about many interests.");
        System.out.println();
    }

    private void personality(String name) {
        System.out.println("Above all else, "+name+" is a good human being.");
        System.out.println();
    }

    private void conclusion(String name) {
        System.out.println("I give "+name+" my strongest recommendation.");
        System.out.println();
        System.out.println("-- Mr. Pelletier");
    }

}