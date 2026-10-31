package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sxm0 implements vxm0 {
    public final x6n a;
    public final zu30 b;

    public sxm0(x6n x6nVar, zu30 zu30Var) {
        this.a = x6nVar;
        this.b = zu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxm0)) {
            return false;
        }
        sxm0 sxm0Var = (sxm0) obj;
        return this.a.equals(sxm0Var.a) && this.b.equals(sxm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
