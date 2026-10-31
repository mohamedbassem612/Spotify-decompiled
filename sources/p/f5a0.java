package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class f5a0 {
    public static final d5a0 Companion = new d5a0();
    public final tpt a;
    public final ga61 b;
    public final wb0 c;
    public final np21 d;

    public /* synthetic */ f5a0(int i, tpt tptVar, ga61 ga61Var, wb0 wb0Var, np21 np21Var) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, c5a0.a.getDescriptor());
            throw null;
        }
        this.a = tptVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ga61Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = wb0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = np21Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5a0)) {
            return false;
        }
        f5a0 f5a0Var = (f5a0) obj;
        return u890.j(this.a, f5a0Var.a) && u890.j(this.b, f5a0Var.b) && u890.j(this.c, f5a0Var.c) && u890.j(this.d, f5a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ga61 ga61Var = this.b;
        int iHashCode2 = (iHashCode + (ga61Var == null ? 0 : ga61Var.hashCode())) * 31;
        wb0 wb0Var = this.c;
        int iHashCode3 = (iHashCode2 + (wb0Var == null ? 0 : wb0Var.hashCode())) * 31;
        np21 np21Var = this.d;
        return iHashCode3 + (np21Var != null ? np21Var.hashCode() : 0);
    }

    public f5a0(tpt tptVar, ga61 ga61Var, wb0 wb0Var) {
        this.a = tptVar;
        this.b = ga61Var;
        this.c = wb0Var;
        this.d = null;
    }
}
