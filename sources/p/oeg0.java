package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oeg0 {
    public final long a;
    public final String b;

    public oeg0(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeg0)) {
            return false;
        }
        oeg0 oeg0Var = (oeg0) obj;
        return this.a == oeg0Var.a && this.b.equals(oeg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
