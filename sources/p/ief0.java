package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ief0 {
    public final dof1 a;
    public final String b;
    public final tv80 c;

    public ief0(dof1 dof1Var, String str, tv80 tv80Var) {
        this.a = dof1Var;
        this.b = str;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ief0)) {
            return false;
        }
        ief0 ief0Var = (ief0) obj;
        return this.a.equals(ief0Var.a) && this.b.equals(ief0Var.b) && this.c.equals(ief0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
