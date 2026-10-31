package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mdm {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public mdm(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mdm)) {
            return false;
        }
        mdm mdmVar = (mdm) obj;
        long j = mdmVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, mdmVar.b) && z4h1.b(this.c, mdmVar.c) && z4h1.b(this.d, mdmVar.d) && z4h1.b(this.e, mdmVar.e);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.e) + cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String strH = u7h.h(this.a);
        String strH2 = u7h.h(this.b);
        String strH3 = u7h.h(this.c);
        String strH4 = u7h.h(this.d);
        String strH5 = u7h.h(this.e);
        StringBuilder sbN = gvg.n("ContextMenuColors(backgroundColor=", strH, ", textColor=", strH2, ", iconColor=");
        bb00.j(sbN, strH3, ", disabledTextColor=", strH4, ", disabledIconColor=");
        return l1d.n(strH5, ")", sbN);
    }
}
