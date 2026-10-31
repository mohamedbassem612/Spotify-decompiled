package p;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class prg1 {
    public final yqg a;
    public final boolean b;
    public final DateTimeFormatter c = DateTimeFormatter.ofPattern("HH:mm:ss.SSS", Locale.US);
    public final bpb1 d = gio1.b("");

    public prg1(yqg yqgVar, boolean z) {
        this.a = yqgVar;
        this.b = z;
    }

    public final void a(String str) {
        bpb1 bpb1Var;
        Object value;
        String strF;
        int length;
        if (this.b) {
            yqg yqgVar = this.a;
            String strH = gvg.h("[", this.c.format(Instant.ofEpochMilli(yqgVar.b()).atZone(ZoneId.of(yqgVar.g().getID()))), "] ", str);
            do {
                bpb1Var = this.d;
                value = bpb1Var.getValue();
                String str2 = (String) value;
                strF = str2.length() == 0 ? strH : f4i1.f(str2, "\n", strH);
                length = strF.length();
            } while (!bpb1Var.k(value, strF.substring(length - (20000 > length ? length : 20000))));
        }
    }
}
