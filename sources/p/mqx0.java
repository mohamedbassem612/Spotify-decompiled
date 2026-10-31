package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mqx0 extends frx0 {
    public final String a;
    public final long b;

    public mqx0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqx0)) {
            return false;
        }
        mqx0 mqx0Var = (mqx0) obj;
        return u890.j(this.a, mqx0Var.a) && this.b == mqx0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
