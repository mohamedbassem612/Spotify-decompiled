package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dtn0 {
    public final int a;
    public final zzq0 b;
    public final c380 c;

    public dtn0(int i, zzq0 zzq0Var, c380 c380Var) {
        this.a = i;
        this.b = zzq0Var;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtn0)) {
            return false;
        }
        dtn0 dtn0Var = (dtn0) obj;
        return this.a == dtn0Var.a && this.b.equals(dtn0Var.b) && u890.j(this.c, dtn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
