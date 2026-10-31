package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ggg0 {
    public final boolean a;
    public final of8 b;

    public ggg0(boolean z, of8 of8Var) {
        this.a = z;
        this.b = of8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggg0)) {
            return false;
        }
        ggg0 ggg0Var = (ggg0) obj;
        return this.a == ggg0Var.a && this.b.equals(ggg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
