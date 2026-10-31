package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class po0 implements zo0 {
    public final String a;
    public final xx10 b;

    public po0(String str, xx10 xx10Var) {
        this.a = str;
        this.b = xx10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po0)) {
            return false;
        }
        po0 po0Var = (po0) obj;
        return this.a.equals(po0Var.a) && this.b.equals(po0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
