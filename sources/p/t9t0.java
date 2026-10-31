package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t9t0 {
    public final int a;
    public final String b;

    public t9t0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9t0)) {
            return false;
        }
        t9t0 t9t0Var = (t9t0) obj;
        return this.a == t9t0Var.a && this.b.equals(t9t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
