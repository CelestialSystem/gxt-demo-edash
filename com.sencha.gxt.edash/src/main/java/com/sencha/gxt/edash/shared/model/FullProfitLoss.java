/**
 * Sencha GXT 1.0.0-SNAPSHOT - Sencha for GWT
 * Copyright (c) 2006-2018, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Commercial License
 * ================================================================================
 * This version of Sencha GXT is licensed commercially and is the appropriate
 * option for the vast majority of use cases.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 *
 *
 *
 *
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.edash.shared.model;

import com.google.gwt.core.client.JavaScriptObject;

import com.google.gwt.user.client.rpc.IsSerializable;


public class FullProfitLoss extends JavaScriptObject implements IsSerializable {
  protected FullProfitLoss() {
  }

  public final native int getId() /*-{
    return this.id;
  }-*/;

  public final native String account() /*-{
    return this.account;
  }-*/;

  public final native String getRegion() /*-{
    return this.region;
  }-*/;

  public final native String getRegionFilter() /*-{
    return this.region_filter;
  }-*/;


  public final native double getColumnData(String columnName) /*-{
    return this[columnName];
  }-*/;

  public final native String[] getColumnNames() /*-{
    var items = new Array();
    for (m in this) {
      if (m[0] == "q") {
        items.push(m);
      }
    }
    return items;
  }-*/;
}
