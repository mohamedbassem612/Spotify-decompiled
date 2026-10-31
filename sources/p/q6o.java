package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q6o {
    public final j7o a;
    public final jo70 b;

    public q6o(j7o j7oVar, jo70 jo70Var) {
        this.a = j7oVar;
        this.b = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6o)) {
            return false;
        }
        q6o q6oVar = (q6o) obj;
        return this.a.equals(q6oVar.a) && u890.j(this.b, q6oVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        return iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode());
    }
}
