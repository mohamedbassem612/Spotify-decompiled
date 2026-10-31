package p;

import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ln8 {
    public final tb51 a;

    public pn8 a(lby lbyVar, d8r0 d8r0Var, String str, int i) {
        return new pn8(lbyVar.a, lbyVar.b, tb51.g(this.a, lbyVar), lbyVar.c, new q8b(z6x.a, false), str, d8r0Var, i);
    }

    public efk b(lby lbyVar, i6k i6kVar, d8r0 d8r0Var, String str, int i, Integer num, String str2) {
        String str3 = lbyVar.a;
        String str4 = lbyVar.b;
        String strG = tb51.g(this.a, lbyVar);
        String str5 = lbyVar.c;
        j7r j7rVar = i6kVar.b;
        String str6 = j7rVar.a;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.parse(str6, dateTimeFormatter);
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        OffsetDateTime offsetDateTimeAtOffset = localDateTime.atOffset(zoneOffset);
        int i2 = j7rVar.b;
        return new efk(str3, str4, strG, str5, offsetDateTimeAtOffset.plusMinutes(i2).getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), String.valueOf(LocalDateTime.parse(j7rVar.a, dateTimeFormatter).atOffset(zoneOffset).plusMinutes(i2).getDayOfMonth()), str, d8r0Var, i, num, str2);
    }
}
