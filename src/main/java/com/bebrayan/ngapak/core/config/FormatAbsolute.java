package com.bebrayan.ngapak.core.config;

import java.text.SimpleDateFormat;

/**
 *
 * @author hasani
 */
public final class FormatAbsolute {
    private final SimpleDateFormat LONG_DATE_FORMAT;
    private final SimpleDateFormat SHORT_MONTH__FORMAT;
    private final String LINE_SEPARATOR;
    private final String PATH_SEPARATOR;

    public FormatAbsolute() {
        this.LONG_DATE_FORMAT = new SimpleDateFormat("dd MMMM yyyy");
        this.SHORT_MONTH__FORMAT = new SimpleDateFormat("dd MM yyyy");
        this.LINE_SEPARATOR = System.getProperty("line.separator");
        this.PATH_SEPARATOR = System.getProperty("path.separator");
    }

    public SimpleDateFormat getLONG_DATE_FORMAT() {
        return LONG_DATE_FORMAT;
    }

    public SimpleDateFormat getSHORT_MONTH__FORMAT() {
        return SHORT_MONTH__FORMAT;
    }

    public String getLINE_SEPARATOR() {
        return LINE_SEPARATOR;
    }

    public String getPATH_SEPARATOR() {
        return PATH_SEPARATOR;
    }
    
    public static FormatAbsolute newFormatAbsolute(){
        return new FormatAbsolute();
    }
    
    
}
