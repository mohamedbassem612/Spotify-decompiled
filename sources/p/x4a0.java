package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x4a0 implements a5a0 {
    public final nwc a;
    public final nwc b;

    public x4a0() {
        kwc kwcVar = new kwc(2131953095);
        kwc kwcVar2 = new kwc(2131953099);
        this.a = kwcVar;
        this.b = kwcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4a0)) {
            return false;
        }
        x4a0 x4a0Var = (x4a0) obj;
        return this.a.equals(x4a0Var.a) && this.b.equals(x4a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
