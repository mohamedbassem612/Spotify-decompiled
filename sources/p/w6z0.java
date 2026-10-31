package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w6z0 {
    public final boolean a;
    public final se10 b;
    public final boolean c;

    public w6z0(boolean z, se10 se10Var, boolean z2) {
        this.a = z;
        this.b = se10Var;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6z0)) {
            return false;
        }
        w6z0 w6z0Var = (w6z0) obj;
        return this.a == w6z0Var.a && u890.j(this.b, w6z0Var.b) && this.c == w6z0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
