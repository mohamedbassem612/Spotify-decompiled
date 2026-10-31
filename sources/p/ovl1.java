package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ovl1 {
    public final String a;
    public final cqs0 b;

    public ovl1(String str, cqs0 cqs0Var) {
        this.a = str;
        this.b = cqs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovl1)) {
            return false;
        }
        ovl1 ovl1Var = (ovl1) obj;
        return u890.j(this.a, ovl1Var.a) && u890.j(this.b, ovl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
