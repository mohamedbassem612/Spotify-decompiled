package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class up50 {
    public final tp50 a;
    public final boolean b;

    public up50(tp50 tp50Var, boolean z) {
        this.a = tp50Var;
        this.b = z;
    }

    public static up50 a(up50 up50Var, tp50 tp50Var, boolean z, int i) {
        if ((i & 1) != 0) {
            tp50Var = up50Var.a;
        }
        if ((i & 2) != 0) {
            z = up50Var.b;
        }
        up50Var.getClass();
        return new up50(tp50Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up50)) {
            return false;
        }
        up50 up50Var = (up50) obj;
        return this.a.equals(up50Var.a) && this.b == up50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
