package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mxm0 {
    public final fnn a;
    public final xkm0 b;

    public mxm0(fnn fnnVar, xkm0 xkm0Var) {
        this.a = fnnVar;
        this.b = xkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxm0)) {
            return false;
        }
        mxm0 mxm0Var = (mxm0) obj;
        return this.a == mxm0Var.a && this.b == mxm0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
