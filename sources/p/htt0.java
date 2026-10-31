package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class htt0 {
    public final String a;
    public final boolean b;

    public htt0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htt0)) {
            return false;
        }
        htt0 htt0Var = (htt0) obj;
        return this.a.equals(htt0Var.a) && this.b == htt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
