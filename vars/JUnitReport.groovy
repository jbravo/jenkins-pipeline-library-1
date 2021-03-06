#!/usr/bin/groovy

/**
 * Publishes JUnit report.
 *
 * @param report JUnit report [default]
 * @see https://plugins.jenkins.io/junit
 */
def call(String report='**/target/surefire-reports/*.xml') {
    junit report
}
