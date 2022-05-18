package com.syntax;

public class Main {

    public static void main(String[] args) {
	// Branching scenario
        /*
        *  1. Create a basic structure of solar system
        *  and deploy it as soon as possible.
        *  2. Update the feature Sun.*/


        SolarSystem factorX = new SolarSystem();
        factorX.sun = "1";
        factorX.moon = "4";
        factorX.planet = "2";
        factorX.stars = "10000";

        // adding features to our sun
        FeatureSun xFact = new FeatureSun();
        xFact.color = "gree";
        xFact.radius = "1238401982";
        xFact.heat = "44211441223kj";

        // adding features for star in solar system
        FeatureStars starX = new FeatureStars();
        starX.color = Green;
        starX.radius = "23226546213";
        starX.size = "293874";

    }
}
