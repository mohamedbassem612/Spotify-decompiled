package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q791 {
    public final int a;
    public final u791 b;

    public q791(int i, u791 u791Var) {
        this.a = i;
        this.b = u791Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q791)) {
            return false;
        }
        q791 q791Var = (q791) obj;
        return this.a == q791Var.a && u890.j(this.b, q791Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }

    public /* synthetic */ q791(int i) {
        this(i, s791.a);
    }
}
