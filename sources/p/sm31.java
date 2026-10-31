package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sm31 {
    public final f7a1 a;
    public final jo70 b;
    public final jo70 c;

    public sm31(f7a1 f7a1Var, jo70 jo70Var, jo70 jo70Var2) {
        this.a = f7a1Var;
        this.b = jo70Var;
        this.c = jo70Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm31)) {
            return false;
        }
        sm31 sm31Var = (sm31) obj;
        return this.a.equals(sm31Var.a) && this.b.equals(sm31Var.b) && u890.j(this.c, sm31Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        jo70 jo70Var = this.c;
        return iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode());
    }
}
