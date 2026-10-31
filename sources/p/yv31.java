package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yv31 {
    public final String a;
    public final tzd1 b;
    public final tk70 c;
    public final bcm d;
    public final ArrayList e;
    public final alt0 f;
    public final boolean g;
    public final y3p0 h;
    public final erc1 i;

    public yv31(String str, tzd1 tzd1Var, tk70 tk70Var, bcm bcmVar, ArrayList arrayList, alt0 alt0Var, boolean z, y3p0 y3p0Var, erc1 erc1Var) {
        this.a = str;
        this.b = tzd1Var;
        this.c = tk70Var;
        this.d = bcmVar;
        this.e = arrayList;
        this.f = alt0Var;
        this.g = z;
        this.h = y3p0Var;
        this.i = erc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv31)) {
            return false;
        }
        yv31 yv31Var = (yv31) obj;
        return u890.j(this.a, yv31Var.a) && this.b.equals(yv31Var.b) && this.c.equals(yv31Var.c) && this.d.equals(yv31Var.d) && this.e.equals(yv31Var.e) && u890.j(this.f, yv31Var.f) && this.g == yv31Var.g && u890.j(this.h, yv31Var.h) && u890.j(this.i, yv31Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.f.hashCode() + p3d1.f(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31, 31, this.g);
        y3p0 y3p0Var = this.h;
        int iHashCode = (iG + (y3p0Var == null ? 0 : y3p0Var.hashCode())) * 31;
        erc1 erc1Var = this.i;
        return iHashCode + (erc1Var != null ? erc1Var.hashCode() : 0);
    }
}
