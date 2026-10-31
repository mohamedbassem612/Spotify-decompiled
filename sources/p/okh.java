package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class okh extends pkh {
    public final String b;
    public final int c;
    public final boolean d;

    public okh(String str, int i, boolean z) {
        super(fkh.X);
        this.b = str;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okh)) {
            return false;
        }
        okh okhVar = (okh) obj;
        return this.b.equals(okhVar.b) && this.c == okhVar.c && this.d == okhVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, this.b.hashCode() * 31, 31);
    }
}
