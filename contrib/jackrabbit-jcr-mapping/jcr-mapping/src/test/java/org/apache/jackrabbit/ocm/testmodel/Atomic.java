/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.jackrabbit.ocm.testmodel;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.apache.jackrabbit.ocm.manager.atomic.Int2BooleanTypeConverterImpl;
import org.apache.jackrabbit.ocm.manager.atomictypeconverter.impl.NameTypeConverterImpl;
import org.apache.jackrabbit.ocm.manager.atomictypeconverter.impl.PathTypeConverterImpl;
import org.apache.jackrabbit.ocm.manager.atomictypeconverter.impl.UndefinedTypeConverterImpl;
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Field;
import org.apache.jackrabbit.ocm.mapper.impl.annotation.Node;

/**
 *
 * Simple object used to test atomic type
 * @author <a href="mailto:christophe.lombart@sword-technologies.com">Lombart Christophe </a>
 * @version $Id: Exp $
 */
@Node
public class Atomic
{
	
	private String path;
    private String string;
    private Boolean booleanObject;
    private boolean booleanPrimitive;
    private Integer integerObject;
    private int intPrimitive;
    private byte[] byteArray;
    private Calendar calendar;
    private Date date;
    private Double doubleObject;
    private double doublePrimitive;
    private InputStream inputStream;
    private Timestamp timestamp;
    private boolean int2boolean;
    private Collection multiValue;
    
    private String namedProperty;
    private String pathProperty; // used to refer another node
    private Object undefinedProperty;
    
    
    @Field(path=true)
    public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@Field
	public Boolean getBooleanObject()
    {
        return booleanObject;
    }
	
    public void setBooleanObject(Boolean booleanObject)
    {
        this.booleanObject = booleanObject;
    }
    
    @Field
    public boolean isBooleanPrimitive()
    {
        return booleanPrimitive;
    }
    
    public void setBooleanPrimitive(boolean booleanPrimitive)
    {
        this.booleanPrimitive = booleanPrimitive;
    }
    
    @Field
    public Integer getIntegerObject()
    {
        return integerObject;
    
    }
    public void setIntegerObject(Integer integerObject)
    {
        this.integerObject = integerObject;
    }
    
    @Field
    public int getIntPrimitive()
    {
        return intPrimitive;
    }
    
    public void setIntPrimitive(int intPrimitive)
    {
        this.intPrimitive = intPrimitive;
    }
    
    @Field
    public String getString()
    {
        return string;
    }
    public void setString(String string)
    {
        this.string = string;
    }
    
    @Field
    public byte[] getByteArray()
    {
        return byteArray;
    }
    
    public void setByteArray(byte[] byteArray)
    {
        this.byteArray = byteArray;
    }
    
    @Field
    public Calendar getCalendar()
    {
        return calendar;
    }
    
    
    public void setCalendar(Calendar calandar)
    {
        this.calendar = calandar;
    }
    
    @Field
    public Date getDate()
    {
        return date;
    }
    
    public void setDate(Date date)
    {
        this.date = date;
    }
    
    @Field
    public Double getDoubleObject()
    {
        return doubleObject;
    }
    
    public void setDoubleObject(Double doubleObject)
    {
        this.doubleObject = doubleObject;
    }
    
    @Field
    public double getDoublePrimitive()
    {
        return doublePrimitive;
    }
    
    public void setDoublePrimitive(double doublePrimitive)
    {
        this.doublePrimitive = doublePrimitive;
    }
    
    @Field
    public InputStream getInputStream()
    {
        return inputStream;
    }
    public void setInputStream(InputStream inputStream)
    {
        this.inputStream = inputStream;
    }
    
    @Field
    public Timestamp getTimestamp()
    {
        return timestamp;
    }
    
    public void setTimestamp(Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }
        
    @Field (converter = Int2BooleanTypeConverterImpl.class)
	public boolean isInt2boolean() 
	{
		return int2boolean;
	}
	
	public void setInt2boolean(boolean int2boolean) 
	{
		this.int2boolean = int2boolean;
	}
	
	
	public Collection getMultiValue()
	{
		return multiValue;
	}
	
	
	public void setMultiValue(Collection multiValue)
	{
		this.multiValue = multiValue;
	}
	
	@Field (converter = NameTypeConverterImpl.class)
	public String getNamedProperty() {
		return namedProperty;
	}
	
	
	public void setNamedProperty(String namedProperty) 
	{
		this.namedProperty = namedProperty;
	}
	
	@Field (converter = PathTypeConverterImpl.class)
	public String getPathProperty() 
	{
		return pathProperty;
	}
	
	public void setPathProperty(String pathProperty) 
	{
		this.pathProperty = pathProperty;
	}
	
	@Field (converter = UndefinedTypeConverterImpl.class)
	public Object getUndefinedProperty() 
	{
		return undefinedProperty;
	}
	
	public void setUndefinedProperty(Object undefinedProperty) 
	{
		this.undefinedProperty = undefinedProperty;
	}
    
    	
}
