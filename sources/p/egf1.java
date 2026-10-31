package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class egf1 {
    public final boolean a;
    public final gy6 b;

    public egf1(boolean z, gy6 gy6Var) {
        this.a = z;
        this.b = gy6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egf1)) {
            return false;
        }
        egf1 egf1Var = (egf1) obj;
        return this.a == egf1Var.a && this.b.equals(egf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
