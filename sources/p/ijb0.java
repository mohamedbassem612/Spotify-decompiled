package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ijb0 implements chu {
    public final ki0 a;
    public final String b;

    public ijb0(String str, ki0 ki0Var) {
        this.a = ki0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijb0)) {
            return false;
        }
        ijb0 ijb0Var = (ijb0) obj;
        return this.a.equals(ijb0Var.a) && this.b.equals(ijb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
