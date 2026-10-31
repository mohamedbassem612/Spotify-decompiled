package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class i implements e {
    public static final ConcurrentMap c = new ConcurrentHashMap(16, 0.75f, 2);
    public final FormatStyle a;
    public final FormatStyle b;

    public i(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    public final DateTimeFormatter a(Locale locale, Chronology chronology) {
        String id = chronology.getId();
        String string = locale.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append("|");
        sb.append(string);
        sb.append("|");
        FormatStyle formatStyle = this.a;
        sb.append(formatStyle);
        FormatStyle formatStyle2 = this.b;
        sb.append(formatStyle2);
        String string2 = sb.toString();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(string2);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(formatStyle, formatStyle2, chronology, locale);
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.i(localizedDateTimePattern);
        DateTimeFormatter dateTimeFormatterS = dateTimeFormatterBuilder.s(locale, ResolverStyle.SMART, null);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(string2, dateTimeFormatterS);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : dateTimeFormatterS;
    }

    @Override // j$.time.format.e
    public final boolean p(w wVar, StringBuilder sb) {
        a(wVar.b.b, Chronology.n(wVar.a)).c().p(wVar, sb);
        return true;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            obj = "";
        }
        FormatStyle formatStyle = this.b;
        return "Localized(" + obj + "," + (formatStyle != null ? formatStyle : "") + ")";
    }

    @Override // j$.time.format.e
    public final int x(v vVar, CharSequence charSequence, int i) {
        return a(vVar.a.b, vVar.d()).c().x(vVar, charSequence, i);
    }
}
