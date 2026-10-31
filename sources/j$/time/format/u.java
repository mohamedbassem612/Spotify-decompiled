package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class u extends t {
    public static final Map i = new ConcurrentHashMap();
    public final TextStyle e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public u(TextStyle textStyle, boolean z) {
        super(j$.time.temporal.m.e, "ZoneText(" + textStyle + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.requireNonNull(textStyle, "textStyle");
        this.e = textStyle;
        this.f = z;
    }

    @Override // j$.time.format.t
    public final n a(v vVar) {
        n nVar;
        if (this.e == TextStyle.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.a.b;
        boolean z = vVar.b;
        Set set = j$.time.zone.g.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (nVar = (n) ((SoftReference) entry.getValue()).get()) != null) {
            return nVar;
        }
        n nVar2 = vVar.b ? new n("", null, null) : new m("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                nVar2.a(str, str);
                HashMap map2 = (HashMap) d0.d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) d0.g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) d0.f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) d0.e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) d0.g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i2 = this.e == TextStyle.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    nVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVar2)));
        return nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.time.format.t, j$.time.format.e
    public final boolean p(w wVar, StringBuilder sb) {
        boolean zG;
        String[] strArr;
        ZoneId zoneId = (ZoneId) wVar.b(j$.time.temporal.m.a);
        if (zoneId == null) {
            return false;
        }
        String id = zoneId.getId();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = wVar.a;
            String str = null;
            Map concurrentHashMap = null;
            if (this.f) {
                zG = 2;
            } else if (temporalAccessor.h(ChronoField.INSTANT_SECONDS)) {
                zG = zoneId.getRules().g(Instant.x(temporalAccessor));
            } else {
                ChronoField chronoField = ChronoField.EPOCH_DAY;
                if (temporalAccessor.h(chronoField)) {
                    ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                    if (temporalAccessor.h(chronoField2)) {
                        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(temporalAccessor.j(chronoField));
                        LocalTime localTimeP = LocalTime.P(temporalAccessor.j(chronoField2));
                        localDateOfEpochDay.getClass();
                        LocalDateTime localDateTimeX = LocalDateTime.x(localDateOfEpochDay, localTimeP);
                        Object objE = zoneId.getRules().e(localDateTimeX);
                        if ((objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null) == null) {
                            zG = zoneId.getRules().g(localDateTimeX.C(zoneId).toInstant());
                        } else {
                            zG = 2;
                        }
                    } else {
                        zG = 2;
                    }
                } else {
                    zG = 2;
                }
            }
            Locale locale = wVar.b.b;
            TextStyle textStyle = TextStyle.NARROW;
            TextStyle textStyle2 = this.e;
            if (textStyle2 != textStyle) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) i;
                SoftReference softReference = (SoftReference) concurrentHashMap2.get(id);
                if (softReference == null || (concurrentHashMap = (Map) softReference.get()) == null || (strArr = (String[]) concurrentHashMap.get(locale)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(id);
                    String[] strArr2 = {id, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), id, id};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(locale, strArr2);
                    concurrentHashMap2.put(id, new SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zG != 0) {
                    str = zG != 1 ? strArr[(textStyle2.a ? 1 : 0) + 5] : strArr[(textStyle2.a ? 1 : 0) + 3];
                } else {
                    str = strArr[(textStyle2.a ? 1 : 0) + 1];
                }
            }
            if (str != null) {
                id = str;
            }
        }
        sb.append(id);
        return true;
    }
}
