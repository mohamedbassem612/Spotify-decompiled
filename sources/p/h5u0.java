package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h5u0 {
    public final boolean a;
    public final f5u0 b;
    public final int c;

    public h5u0(boolean z, f5u0 f5u0Var, int i) {
        this.a = z;
        this.b = f5u0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5u0)) {
            return false;
        }
        h5u0 h5u0Var = (h5u0) obj;
        return this.a == h5u0Var.a && this.b.equals(h5u0Var.b) && this.c == h5u0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
