package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t2i1 {
    public final String a;
    public final s2i1 b;

    public t2i1(String str, s2i1 s2i1Var) {
        this.a = str;
        this.b = s2i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2i1)) {
            return false;
        }
        t2i1 t2i1Var = (t2i1) obj;
        return this.a.equals(t2i1Var.a) && u890.j(this.b, t2i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
