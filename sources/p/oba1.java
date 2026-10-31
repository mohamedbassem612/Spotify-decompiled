package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oba1 {
    public final kba1 a;
    public final int b;
    public final boolean c;

    public oba1(kba1 kba1Var, int i, boolean z) {
        this.a = kba1Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oba1)) {
            return false;
        }
        oba1 oba1Var = (oba1) obj;
        return this.a.equals(oba1Var.a) && this.b == oba1Var.b && this.c == oba1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
