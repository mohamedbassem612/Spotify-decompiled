package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dtd {
    public final int a;
    public final int b;
    public final String c;
    public final hux d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public dtd(int i, int i2, String str, hux huxVar, String str2, String str3, String str4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = huxVar;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtd)) {
            return false;
        }
        dtd dtdVar = (dtd) obj;
        return this.a == dtdVar.a && this.b == dtdVar.b && this.c.equals(dtdVar.c) && u890.j(this.d, dtdVar.d) && this.e.equals(dtdVar.e) && this.f.equals(dtdVar.f) && this.g.equals(dtdVar.g) && this.h == dtdVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + cy30.d(cy30.d(cy30.d(eqq.k(cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
