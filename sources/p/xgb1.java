package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xgb1 implements zul1 {
    public final int a;
    public final z771 b;
    public final ez61 c;
    public final wa71 d;
    public final boolean e;

    static {
        zy61 zy61Var = ez61.c;
    }

    public xgb1(int i, z771 z771Var, ez61 ez61Var, wa71 wa71Var, boolean z) {
        this.a = i;
        this.b = z771Var;
        this.c = ez61Var;
        this.d = wa71Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgb1)) {
            return false;
        }
        xgb1 xgb1Var = (xgb1) obj;
        return this.a == xgb1Var.a && u890.j(this.b, xgb1Var.b) && u890.j(this.c, xgb1Var.c) && u890.j(this.d, xgb1Var.d) && this.e == xgb1Var.e;
    }

    public final String getEntityUri() {
        return this.d.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + pze0.f(this.c, xvj1.j(this.b.a, l1d.C(this.a) * 31, 31), 31)) * 31);
    }
}
