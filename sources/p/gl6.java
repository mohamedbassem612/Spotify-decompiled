package p;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gl6 {
    public final tb51 a;

    public static hl6 b(i6k i6kVar) {
        if (i6kVar == null) {
            return null;
        }
        j7r j7rVar = i6kVar.b;
        String str = i6kVar.a;
        String str2 = i6kVar.c;
        String str3 = i6kVar.d;
        String str4 = j7rVar.a;
        int i = j7rVar.b;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.parse(str4, dateTimeFormatter);
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        return new hl6(str, str2, str3, localDateTime.atOffset(zoneOffset).plusMinutes(i).getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), String.valueOf(LocalDateTime.parse(j7rVar.a, dateTimeFormatter).atOffset(zoneOffset).plusMinutes(i).getDayOfMonth()));
    }

    public ol6 a(lby lbyVar, jb6 jb6Var, boolean z, d8r0 d8r0Var, String str, int i, Integer num, String str2) {
        il6 il6Var;
        l6k l6kVar = jb6Var.e;
        String str3 = lbyVar.a;
        String str4 = lbyVar.b;
        String strG = tb51.g(this.a, lbyVar);
        boolean z2 = jb6Var.a;
        boolean z3 = jb6Var.b;
        boolean z4 = jb6Var.c;
        String str5 = lbyVar.c;
        q8b q8bVar = z ? new q8b(Collections.singletonList(lbyVar.a), true) : new q8b(z6x.a, false);
        hl6 hl6VarB = l6kVar != null ? null : b(jb6Var.d);
        if (l6kVar != null) {
            il6Var = new il6(l6kVar.a, l6kVar.b, l6kVar.c, l6kVar.d, l6kVar.f, l6kVar.e);
        } else {
            il6Var = null;
        }
        return new ol6(str3, str4, strG, str5, z2, z3, z4, q8bVar, str, d8r0Var, i, hl6VarB, il6Var, num, str2);
    }

    public ol6 c(lby lbyVar, jb6 jb6Var, boolean z, d8r0 d8r0Var, String str, int i) {
        il6 il6Var;
        l6k l6kVar = jb6Var.e;
        String str2 = lbyVar.a;
        String str3 = lbyVar.b;
        String string = this.a.c(lbyVar).toString();
        boolean z2 = jb6Var.a;
        boolean z3 = jb6Var.b;
        boolean z4 = jb6Var.c;
        String str4 = lbyVar.c;
        q8b q8bVar = z ? new q8b(Collections.singletonList(lbyVar.a), true) : new q8b(z6x.a, false);
        hl6 hl6VarB = l6kVar != null ? null : b(jb6Var.d);
        if (l6kVar != null) {
            il6Var = new il6(l6kVar.a, l6kVar.b, l6kVar.c, l6kVar.d, l6kVar.f, l6kVar.e);
        } else {
            il6Var = null;
        }
        return new ol6(str2, str3, string, str4, z2, z3, z4, q8bVar, str, d8r0Var, i, hl6VarB, il6Var, null, null);
    }
}
