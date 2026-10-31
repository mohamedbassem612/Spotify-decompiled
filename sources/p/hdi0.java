package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hdi0 implements idi0 {
    public final String a;
    public final boolean b;

    public hdi0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdi0)) {
            return false;
        }
        hdi0 hdi0Var = (hdi0) obj;
        return this.a.equals(hdi0Var.a) && this.b == hdi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
