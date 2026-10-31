package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public class z {
    public static final ConcurrentMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final x b = new x();
    public static final z c = new z();

    public static Object a(TemporalField temporalField, Locale locale) {
        Object yVar;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        Object obj = ((ConcurrentHashMap) a).get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        HashMap map = new HashMap();
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    map2.put(Long.valueOf(j), eras[i]);
                    Long lValueOf = Long.valueOf(j);
                    String str = eras[i];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            yVar = new y(map);
        } else if (temporalField == ChronoField.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j2 = 1; j2 <= length; j2++) {
                String strB = j$.desugar.sun.nio.fs.g.b(j2, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j2), strB);
                linkedHashMap2.put(Long.valueOf(j2), strB.substring(0, Character.charCount(strB.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j2), j$.desugar.sun.nio.fs.g.b(j2, "LLL", locale));
            }
            if (length > 0) {
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                map.put(TextStyle.FULL, linkedHashMap);
                map.put(TextStyle.NARROW, linkedHashMap2);
                map.put(TextStyle.SHORT, linkedHashMap3);
            }
            yVar = new y(map);
        } else if (temporalField == ChronoField.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j3 = 1; j3 <= length2; j3++) {
                String strA = j$.desugar.sun.nio.fs.g.a(j3, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j3), strA);
                linkedHashMap5.put(Long.valueOf(j3), z ? new StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString() : strA.substring(0, Character.charCount(strA.codePointAt(0))));
                linkedHashMap6.put(Long.valueOf(j3), j$.desugar.sun.nio.fs.g.a(j3, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                map.put(TextStyle.FULL, linkedHashMap4);
                map.put(TextStyle.NARROW, linkedHashMap5);
                map.put(TextStyle.SHORT, linkedHashMap6);
            }
            yVar = new y(map);
        } else if (temporalField == ChronoField.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                if (!amPmStrings[i2].isEmpty()) {
                    long j4 = i2;
                    map4.put(Long.valueOf(j4), amPmStrings[i2]);
                    Long lValueOf2 = Long.valueOf(j4);
                    String str2 = amPmStrings[i2];
                    map5.put(lValueOf2, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(TextStyle.FULL, map4);
                map.put(TextStyle.SHORT, map4);
                map.put(TextStyle.NARROW, map5);
            }
            yVar = new y(map);
        } else {
            yVar = "";
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, yVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    public String b(Chronology chronology, TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return c(temporalField, j, textStyle, locale);
        }
        return null;
    }

    public String c(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        Object objA = a(temporalField, locale);
        if (objA instanceof y) {
            return ((y) objA).a(j, textStyle);
        }
        return null;
    }

    public Iterator d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return e(temporalField, textStyle, locale);
        }
        return null;
    }

    public Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list;
        Object objA = a(temporalField, locale);
        if (!(objA instanceof y) || (list = (List) ((HashMap) ((y) objA).b).get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }
}
