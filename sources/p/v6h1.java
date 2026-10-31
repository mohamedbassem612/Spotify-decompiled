package p;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v6h1 {
    public final qfb0 a;
    public final sfb0 b;
    public final rfb0 c;
    public final yqg d;
    public final vo5 e;
    public final rj41 f;

    public v6h1(qfb0 qfb0Var, sfb0 sfb0Var, rfb0 rfb0Var, yqg yqgVar, vo5 vo5Var, rj41 rj41Var) {
        this.a = qfb0Var;
        this.b = sfb0Var;
        this.c = rfb0Var;
        this.d = yqgVar;
        this.e = vo5Var;
        this.f = rj41Var;
    }

    public final u6h1 a() {
        a8r0 a8r0VarA = this.a.a(this.f);
        String str = this.c.a;
        String string = UUID.randomUUID().toString();
        y6r0 y6r0Var = a8r0VarA != null ? a8r0VarA.a : null;
        String str2 = a8r0VarA != null ? a8r0VarA.c : null;
        String str3 = this.b.a;
        if (str3 == null) {
            str3 = "";
        }
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        String str4 = a8r0VarA != null ? a8r0VarA.b : null;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str != null ? str : "";
        String id = this.d.g().getID();
        String strA = this.e.a.a();
        vo5 vo5Var = this.e;
        acn1 acn1Var = vo5Var.a;
        hn5 hn5Var = vo5Var.c;
        return new u6h1(string, y6r0Var, str2, lowerCase, str4, str5, id, strA, hn5Var != null ? Integer.valueOf(hn5Var.a) : null);
    }
}
