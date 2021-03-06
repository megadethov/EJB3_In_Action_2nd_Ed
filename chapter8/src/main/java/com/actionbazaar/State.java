/**
 *  State.java
 *  EJB 3 in Action
 *  Book: http://manning.com/panda2/
 *  Code: http://code.google.com/p/action-bazaar/
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.actionbazaar;

/**
 * List of states for the state drop down.
 * @author Ryan Cuprak
 */
public enum State {
    Alabama("AL"),
    Alaska("AK"),
    Arizona("AZ"),
    Arkansas("AR"),
    California("CA"),
    Colorado("CO"),
    Connecticut("CT"),
    Delaware("DE"),
    Florida("FL"),
    Georgia("GA"),
    Hawaii("HI"),
    Idaho("ID"),
    Illinois("IL"),
    Indiana("IN"),
    Iowa("IA"),
    Kansas("KS"),
    Kentucky("KY"),
    Louisiana("LA"),
    Maine("ME"),
    Maryland("MD"),
    Massachusetts("MA"),
    Michigan("MI"),
    Minnesota("MN"),
    Mississippi("MS"),
    Missouri("MO"),
    Montana("MT"),
    Nebraska("NE"),
    Nevada("NV"),
    NewHampshire("NH"),
    NewJersey("NJ"),
    NewMexico("NM"),
    NewYork("NY"),
    NorthCarolina("NC"),
    NorthDakota("ND"),
    Ohio("OH"),
    Oklahoma("OK"),
    Oregon("OR"),
    Pennsylvania("PA"),
    RhodeIsland("RI"),
    SouthCarolina("SC"),
    SouthDakota("SD"),
    Tennessee("TN"),
    Texas("TX"),
    Utah("UT"),
    Vermont("VT"),
    Virginia("VA"),
    Washington("WA"),
    WestVirginia("WV"),
    Wisconsin("WI"),
    Wyoming("WY");

    /**
     * State abbreviation
     */
    private String abbreviation;

    /**
     * Constructs a new state
     * @param abbreviation - abbreviation
     */
    private State(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return abbreviation;
    }

}