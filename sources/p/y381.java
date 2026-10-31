package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class y381 {
    public static final v381 Companion = new v381();
    public final e3z a;
    public final x381 b;
    public final aqa0 c;

    public /* synthetic */ y381(int i, e3z e3zVar, x381 x381Var, aqa0 aqa0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = e3zVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = x381Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aqa0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y381)) {
            return false;
        }
        y381 y381Var = (y381) obj;
        return u890.j(this.a, y381Var.a) && u890.j(this.b, y381Var.b) && u890.j(this.c, y381Var.c);
    }

    public final int hashCode() {
        e3z e3zVar = this.a;
        int iHashCode = (e3zVar == null ? 0 : e3zVar.hashCode()) * 31;
        x381 x381Var = this.b;
        int iHashCode2 = (iHashCode + (x381Var == null ? 0 : x381Var.hashCode())) * 31;
        aqa0 aqa0Var = this.c;
        return iHashCode2 + (aqa0Var != null ? aqa0Var.a.hashCode() : 0);
    }

    public y381(e3z e3zVar, x381 x381Var, aqa0 aqa0Var) {
        this.a = e3zVar;
        this.b = x381Var;
        this.c = aqa0Var;
    }

    public /* synthetic */ y381(e3z e3zVar, x381 x381Var, int i) {
        this((i & 1) != 0 ? null : e3zVar, x381Var, (aqa0) null);
    }
}
