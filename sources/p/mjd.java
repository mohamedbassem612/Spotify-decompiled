package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mjd {
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    public mjd(int i, String str, int i2, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjd)) {
            return false;
        }
        mjd mjdVar = (mjd) obj;
        return this.a.equals(mjdVar.a) && this.b == mjdVar.b && this.c == mjdVar.c && this.d.equals(mjdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
