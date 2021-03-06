/* 
 * Copyright (C) 2014 Matthew Eavenson <matthew.eavenson at gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package edu.uga.qrator.logic.match.motif;

/**
 *
 * @author Matthew
 */
public class MotifComparison {
    
    public final String type;
    public final String anomer;
    public final String abconf;
    public final String link;
    public final String from;
    public final MotifComparison[] children;
    public final boolean isRoot;

    public MotifComparison(String type, String anomer, String abconf, String link, String from, boolean isRoot, MotifComparison[] children){
        this.type = type;
        this.anomer = anomer;
        this.abconf = abconf;
        this.link = link;
        this.from = from;
        this.isRoot = isRoot;
        this.children = children;
    }
    
}
