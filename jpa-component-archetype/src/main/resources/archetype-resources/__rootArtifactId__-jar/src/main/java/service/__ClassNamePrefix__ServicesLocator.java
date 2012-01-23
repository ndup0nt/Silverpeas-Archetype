#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * Copyright (C) 2000 - 2011 Silverpeas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * As a special exception to the terms and conditions of version 3.0 of
 * the GPL, you may redistribute this Program in connection with Free/Libre
 * Open Source Software ("FLOSS") applications as described in Silverpeas's
 * FLOSS exception.  You should have recieved a copy of the text describing
 * the FLOSS exception, and it is also available here:
 * "http://www.silverpeas.org/legal/licensing"
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ${package}.service;

//import javax.inject.Inject;

public class ${ClassNamePrefix}ServicesLocator {
	//TODO inject your services here.
	/* Your services implementation class should be annotated 
	 * with standard annotations : @Singleton and @Named 
	 */
//    @Inject
//    private SampleService sampleService;

    private static class SingletonLoader {
        private static final ${ClassNamePrefix}ServicesLocator _instance = new ${ClassNamePrefix}ServicesLocator();
    }

    public static ${ClassNamePrefix}ServicesLocator getInstance() {
        return SingletonLoader._instance;
    }

    //TODO insert your services getters here
//    public SampleService getSampleService() {
//        return sampleService;
//    }

}