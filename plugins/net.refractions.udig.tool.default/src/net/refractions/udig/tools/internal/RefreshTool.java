/*
 *    uDig - User Friendly Desktop Internet GIS client
 *    http://udig.refractions.net
 *    (C) 2004, Refractions Research Inc.
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 */
package net.refractions.udig.tools.internal;

import net.refractions.udig.project.ui.tool.AbstractActionTool;

/**
 * A tool that triggers a rerender
 * 
 * @author jeichar
 * @since 0.3
 */
public class RefreshTool  extends AbstractActionTool {

	
	public void run() {
        // Force an update of the renderers
        context.getRenderManager().refresh(null);
    }

    public void dispose() {
        // do nothing
    }

}
