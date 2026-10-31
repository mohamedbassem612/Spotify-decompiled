package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xah {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public xah() {
        long jG = z4p1.g(4288397311L);
        long jG2 = z4p1.g(4283205865L);
        long jG3 = z4p1.g(4284743336L);
        long jG4 = z4p1.g(4294944672L);
        long j = u7h.b;
        long jG5 = z4p1.g(4280690214L);
        long jG6 = z4p1.g(4284507232L);
        long jG7 = z4p1.g(4282532682L);
        this.a = jG;
        this.b = jG2;
        this.c = jG3;
        this.d = jG4;
        this.e = j;
        this.f = jG5;
        this.g = jG6;
        this.h = jG7;
    }

    public final long a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xah)) {
            return false;
        }
        xah xahVar = (xah) obj;
        long j = xahVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, xahVar.b) && z4h1.b(this.c, xahVar.c) && z4h1.b(this.d, xahVar.d) && z4h1.b(this.e, xahVar.e) && z4h1.b(this.f, xahVar.f) && z4h1.b(this.g, xahVar.g) && z4h1.b(this.h, xahVar.h);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.h) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        String strH = u7h.h(this.a);
        String strH2 = u7h.h(this.b);
        String strH3 = u7h.h(this.c);
        String strH4 = u7h.h(this.d);
        String strH5 = u7h.h(this.e);
        String strH6 = u7h.h(this.f);
        String strH7 = u7h.h(this.g);
        String strH8 = u7h.h(this.h);
        StringBuilder sbN = gvg.n("Colors(primary=", strH, ", secondary=", strH2, ", positive=");
        bb00.j(sbN, strH3, ", negative=", strH4, ", background=");
        bb00.j(sbN, strH5, ", surface=", strH6, ", outline=");
        return rjx.o(sbN, strH7, ", outlineVariant=", strH8, ")");
    }
}
