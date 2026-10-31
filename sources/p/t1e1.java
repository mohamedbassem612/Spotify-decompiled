package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t1e1 {
    public final jo70 a;
    public final xkk1 b;
    public final boolean c;

    public t1e1(jo70 jo70Var, xkk1 xkk1Var, boolean z) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1e1)) {
            return false;
        }
        t1e1 t1e1Var = (t1e1) obj;
        return this.a.equals(t1e1Var.a) && this.b.equals(t1e1Var.b) && this.c == t1e1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
