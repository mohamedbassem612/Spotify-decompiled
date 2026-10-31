package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wsn0 {
    public final int a;
    public final zzq0 b;

    public wsn0(int i, zzq0 zzq0Var) {
        this.a = i;
        this.b = zzq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsn0)) {
            return false;
        }
        wsn0 wsn0Var = (wsn0) obj;
        return this.a == wsn0Var.a && this.b.equals(wsn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
