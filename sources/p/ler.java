package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ler {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final f0u e;
    public final boolean f;
    public final rtt g;
    public final List h;
    public final boolean i;

    public ler(String str, String str2, String str3, boolean z, f0u f0uVar, boolean z2, rtt rttVar, List list, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = f0uVar;
        this.f = z2;
        this.g = rttVar;
        this.h = list;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ler)) {
            return false;
        }
        ler lerVar = (ler) obj;
        return u890.j(this.a, lerVar.a) && u890.j(this.b, lerVar.b) && u890.j(this.c, lerVar.c) && this.d == lerVar.d && this.e == lerVar.e && this.f == lerVar.f && u890.j(this.g, lerVar.g) && u890.j(this.h, lerVar.h) && this.i == lerVar.i;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.e.hashCode() + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        rtt rttVar = this.g;
        int iHashCode = (iG + (rttVar == null ? 0 : rttVar.hashCode())) * 31;
        List list = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }
}
