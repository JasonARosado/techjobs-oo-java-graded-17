package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JobTest {
    // Establish variables as global so all test can access them without redundancy
    String jobName = "RNA";
    Employer employer = new Employer("Corsair");
    Location location = new Location("San Juan");
    PositionType positionType = new PositionType("Data Entry");
    CoreCompetency coreCompetency = new CoreCompetency("Detail oriented");
    // Creating my job object.
    Job aJob = new Job(jobName, employer, location, positionType, coreCompetency);
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        Assertions.assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        // Assert the fields.
        Assertions.assertTrue(aJob.getName() instanceof String);
        Assertions.assertTrue(aJob.getEmployer() instanceof Employer);
        Assertions.assertTrue(aJob.getLocation() instanceof Location);
        Assertions.assertTrue(aJob.getPositionType() instanceof PositionType);
        Assertions.assertTrue(aJob.getCoreCompetency() instanceof CoreCompetency);

        Assertions.assertEquals(aJob.getName(), "RNA");
        Assertions.assertEquals(aJob.getEmployer(), employer);
        Assertions.assertEquals(aJob.getLocation(), location);
        Assertions.assertEquals(aJob.getPositionType(), positionType);
        Assertions.assertEquals(aJob.getCoreCompetency(), coreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job(jobName, employer, location, positionType, coreCompetency);
        Job job2 = new Job(jobName, employer, location, positionType, coreCompetency);
        Assertions.assertNotEquals(job1,job2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String newLine = System.lineSeparator();
        String actual = aJob.toString();
        String expected = newLine +
                "ID: " + aJob.getId() + newLine +
                "Name: " + aJob.getName() + newLine +
                "Employer: " + aJob.getEmployer() + newLine +
                "Location: " + aJob.getLocation() + newLine +
                "PositionType: " + aJob.getPositionType() + newLine +
                "Core Competency: " + aJob.getCoreCompetency() + newLine;
        Assertions.assertEquals(expected, actual);
    }
}