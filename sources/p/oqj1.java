package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oqj1 {
    public final String a;
    public final long b;

    public oqj1(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqj1)) {
            return false;
        }
        oqj1 oqj1Var = (oqj1) obj;
        return this.a.equals(oqj1Var.a) && this.b == oqj1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
