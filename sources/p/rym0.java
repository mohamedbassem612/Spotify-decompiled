package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rym0 {
    public final boolean a;
    public final fvf1 b;

    public rym0(boolean z, fvf1 fvf1Var) {
        this.a = z;
        this.b = fvf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rym0)) {
            return false;
        }
        rym0 rym0Var = (rym0) obj;
        return this.a == rym0Var.a && this.b.equals(rym0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
