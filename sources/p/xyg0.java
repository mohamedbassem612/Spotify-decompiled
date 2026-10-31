package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xyg0 {
    public final String a;
    public final boolean b;

    public xyg0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyg0)) {
            return false;
        }
        xyg0 xyg0Var = (xyg0) obj;
        return this.a.equals(xyg0Var.a) && this.b == xyg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
