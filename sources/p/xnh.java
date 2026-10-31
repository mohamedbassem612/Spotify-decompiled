package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xnh implements iph {
    public final kp8 a;
    public final tv80 b;

    public xnh(kp8 kp8Var, tv80 tv80Var) {
        this.a = kp8Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnh)) {
            return false;
        }
        xnh xnhVar = (xnh) obj;
        return this.a.equals(xnhVar.a) && u890.j(this.b, xnhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
