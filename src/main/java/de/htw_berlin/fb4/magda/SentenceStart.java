/*
 * Copyright (c) 2026 Magdalena Uçar
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * SPDX-License-Identifier: MIT
 *
 * The full license text is available in the LICENSE file.
 */


package de.htw_berlin.fb4.magda;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class SentenceStart implements Sentence {
    @Override
    public String get(){
        return "Ich heiße ... ";
    }
    
}
