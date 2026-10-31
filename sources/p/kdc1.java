package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kdc1 implements dec1 {
    public final mdc1 a;
    public final rm5 b;

    public kdc1(mdc1 mdc1Var, rm5 rm5Var) {
        this.a = mdc1Var;
        this.b = rm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdc1)) {
            return false;
        }
        kdc1 kdc1Var = (kdc1) obj;
        return this.a == kdc1Var.a && this.b == kdc1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
