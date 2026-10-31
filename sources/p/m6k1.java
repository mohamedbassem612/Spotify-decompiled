package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m6k1 {
    public final t7l1 a;
    public final String b;
    public final String c;
    public final zau0 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Function0 j;
    public final u7h k;

    public m6k1(t7l1 t7l1Var, String str, String str2, zau0 zau0Var, String str3, String str4, String str5, String str6, String str7, Function0 function0, u7h u7hVar) {
        this.a = t7l1Var;
        this.b = str;
        this.c = str2;
        this.d = zau0Var;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = function0;
        this.k = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6k1)) {
            return false;
        }
        m6k1 m6k1Var = (m6k1) obj;
        return u890.j(this.a, m6k1Var.a) && u890.j(this.b, m6k1Var.b) && u890.j(this.c, m6k1Var.c) && u890.j(this.d, m6k1Var.d) && u890.j(this.e, m6k1Var.e) && u890.j(this.f, m6k1Var.f) && u890.j(this.g, m6k1Var.g) && u890.j(this.h, m6k1Var.h) && u890.j(this.i, m6k1Var.i) && u890.j(this.j, m6k1Var.j) && u890.j(this.k, m6k1Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        zau0 zau0Var = this.d;
        int iN = rjx.n(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iD + (zau0Var == null ? 0 : zau0Var.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        u7h u7hVar = this.k;
        return iN + (u7hVar != null ? z4h1.c(u7hVar.a) : 0);
    }

    public /* synthetic */ m6k1(t7l1 t7l1Var, String str, String str2, zau0 zau0Var, String str3, String str4, String str5, String str6, String str7, u7h u7hVar, int i) {
        this(t7l1Var, str, str2, zau0Var, str3, str4, str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, w0n0.Z0, u7hVar);
    }
}
