package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e8y0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final cio f;
    public final Map g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ e8y0(boolean z, String str, String str2, int i, boolean z2, Map map, boolean z3, boolean z4, int i2) {
        this(z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? false : z2, (cio) null, (i2 & 64) != 0 ? b7x.a : map, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8y0)) {
            return false;
        }
        e8y0 e8y0Var = (e8y0) obj;
        return this.a == e8y0Var.a && u890.j(this.b, e8y0Var.b) && u890.j(this.c, e8y0Var.c) && this.d == e8y0Var.d && this.e == e8y0Var.e && u890.j(this.f, e8y0Var.f) && u890.j(this.g, e8y0Var.g) && this.h == e8y0Var.h && this.i == e8y0Var.i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iG = xcg1.g(ab80.k(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.e);
        cio cioVar = this.f;
        return Boolean.hashCode(this.i) + xcg1.g(cy30.e((iG + (cioVar != null ? cioVar.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public e8y0(boolean z, String str, String str2, int i, boolean z2, cio cioVar, Map map, boolean z3, boolean z4) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = z2;
        this.f = cioVar;
        this.g = map;
        this.h = z3;
        this.i = z4;
    }
}
