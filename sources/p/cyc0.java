package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyc0 {
    public final String a;
    public final long b;

    public cyc0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyc0)) {
            return false;
        }
        cyc0 cyc0Var = (cyc0) obj;
        return u890.j(this.a, cyc0Var.a) && this.b == cyc0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
