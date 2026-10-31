package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ttn0 {
    public final int a;
    public final zzq0 b;

    public ttn0(int i, zzq0 zzq0Var) {
        this.a = i;
        this.b = zzq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttn0)) {
            return false;
        }
        ttn0 ttn0Var = (ttn0) obj;
        return this.a == ttn0Var.a && this.b.equals(ttn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
