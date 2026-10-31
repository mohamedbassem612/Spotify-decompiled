package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class stk1 implements mh91 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final Function0 e;
    public final ke71 f;
    public final String g;
    public final Float h;
    public final boolean i;

    public stk1(String str, String str2, String str3, ots otsVar, String str4, Float f, boolean z, int i) {
        int i2 = (i & 8) != 0 ? 2 : 1;
        otsVar = (i & 16) != 0 ? kvj1.N0 : otsVar;
        ke71 ke71Var = new ke71();
        str4 = (i & 64) != 0 ? null : str4;
        f = (i & 128) != 0 ? null : f;
        z = (i & 256) != 0 ? false : z;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = otsVar;
        this.f = ke71Var;
        this.g = str4;
        this.h = f;
        this.i = z;
    }

    public final void a() {
        this.f.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof stk1) {
            stk1 stk1Var = (stk1) obj;
            if (u890.j(this.a, stk1Var.a) && u890.j(this.b, stk1Var.b) && this.c.equals(stk1Var.c) && this.d == stk1Var.d && this.e.equals(stk1Var.e) && this.f == stk1Var.f && u890.j(this.g, stk1Var.g) && u890.j(this.h, stk1Var.h) && this.i == stk1Var.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + rjx.n(ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode2 + (f != null ? f.hashCode() : 0)) * 31);
    }
}
