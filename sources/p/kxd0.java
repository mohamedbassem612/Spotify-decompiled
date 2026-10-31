package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kxd0 implements rxd0 {
    public final String a;
    public final wzd0 b;

    public kxd0(String str, wzd0 wzd0Var) {
        this.a = str;
        this.b = wzd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxd0)) {
            return false;
        }
        kxd0 kxd0Var = (kxd0) obj;
        return this.a.equals(kxd0Var.a) && this.b.equals(kxd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
