package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ivm1 {
    public final of20 a;
    public final Integer b;
    public final mml c;

    public ivm1(of20 of20Var, Integer num, mml mmlVar) {
        this.a = of20Var;
        this.b = num;
        this.c = mmlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivm1)) {
            return false;
        }
        ivm1 ivm1Var = (ivm1) obj;
        return this.a.equals(ivm1Var.a) && this.b.equals(ivm1Var.b) && u890.j(this.c, ivm1Var.c);
    }

    public final int hashCode() {
        int iE = pze0.e(this.a.hashCode() * 31, 31, this.b);
        mml mmlVar = this.c;
        return iE + (mmlVar == null ? 0 : mmlVar.hashCode());
    }
}
