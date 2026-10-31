package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tkh implements ukh {
    public final skh a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Set f;
    public final boolean g;
    public final String h;
    public final int i;
    public final u380 j;
    public final boolean k;
    public final uwe1 l;

    public tkh(skh skhVar, boolean z, boolean z2, boolean z3, boolean z4, Set set, boolean z5, String str, int i, u380 u380Var, boolean z6, uwe1 uwe1Var) {
        this.a = skhVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = set;
        this.g = z5;
        this.h = str;
        this.i = i;
        this.j = u380Var;
        this.k = z6;
        this.l = uwe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkh)) {
            return false;
        }
        tkh tkhVar = (tkh) obj;
        return this.a.equals(tkhVar.a) && this.b == tkhVar.b && this.c == tkhVar.c && this.d == tkhVar.d && this.e == tkhVar.e && u890.j(this.f, tkhVar.f) && this.g == tkhVar.g && u890.j(this.h, tkhVar.h) && this.i == tkhVar.i && u890.j(this.j, tkhVar.j) && this.k == tkhVar.k && this.l.equals(tkhVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + xcg1.g((this.j.hashCode() + kaa0.f(this.i, cy30.d(xcg1.g(gvg.c(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31)) * 31, 31, this.k);
    }
}
