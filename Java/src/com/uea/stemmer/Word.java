/*******************************************************************************
 * UEA-Lite Stemmer
 *******************************************************************************
 * Copyright (c) University of East Anglia (UEA) 2013.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************
 * Original Authors:    Marie-Claire Jenkins
 *                      Dan Smith               dan.smith@uea.ac.uk
 * 
 *                      https://www.uea.ac.uk/computing/word-stemming
 *******************************************************************************
 * Author(s):           Marcus Craske           marcus.craske@uea.ac.uk
 * Version:             1.2
 *******************************************************************************
 * Change-log:
 *      2013-11-30      New headers.
 *******************************************************************************
 */
package com.uea.stemmer;

/**
 * Represents a stemmed word.
 */
public class Word
{
    // Fields ******************************************************************
    private String  word;
    private double  ruleNum;
    // Methods - Constructors **************************************************
    public Word(String word, double ruleNum)
    {
        this.word = word;
        this.ruleNum = ruleNum;
    }
    // Methods - Accessors *****************************************************
    /**
     * @return The stemmed word.
     */
    public String getWord()
    {
        return word;
    }
    /**
     * @return The rule applied whilst stemming; zero (0) indicats no stemming
     * occurred.
     */
    public double getRule()
    {
        return ruleNum;
    }
}
