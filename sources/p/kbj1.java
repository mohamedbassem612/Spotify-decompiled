package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kbj1 {
    public final vu30 a;
    public final vu30 b;

    public kbj1(vu30 vu30Var, vu30 vu30Var2) {
        this.a = vu30Var;
        this.b = vu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbj1)) {
            return false;
        }
        kbj1 kbj1Var = (kbj1) obj;
        return this.a.equals(kbj1Var.a) && this.b.equals(kbj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
