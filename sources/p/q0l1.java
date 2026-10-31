package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q0l1 extends f1l1 {
    public final String a;
    public final l2l1 b;
    public final boolean c;

    public q0l1(String str, l2l1 l2l1Var, boolean z) {
        this.a = str;
        this.b = l2l1Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0l1)) {
            return false;
        }
        q0l1 q0l1Var = (q0l1) obj;
        return u890.j(this.a, q0l1Var.a) && this.b.equals(q0l1Var.b) && this.c == q0l1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
