package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xxz0 {
    public final String a;
    public final boolean b;

    public xxz0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxz0)) {
            return false;
        }
        xxz0 xxz0Var = (xxz0) obj;
        return this.a.equals(xxz0Var.a) && this.b == xxz0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
