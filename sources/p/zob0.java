package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zob0 implements srb0 {
    public final upb0 a;

    public zob0(upb0 upb0Var) {
        this.a = upb0Var;
    }

    public final int a() {
        return this.a.h().q;
    }

    public final int b() {
        int i;
        upb0 upb0Var = this.a;
        if (upb0Var.h().n.isEmpty()) {
            return 0;
        }
        lpb0 lpb0VarH = upb0Var.h();
        int iP = (int) (lpb0VarH.r == qqq0.a ? lpb0VarH.p() & 4294967295L : lpb0VarH.p() >> 32);
        int iA = iko1.A(upb0Var.h());
        if (iA != 0 && (i = iP / iA) >= 1) {
            return i;
        }
        return 1;
    }

    public final boolean c() {
        return !this.a.h().n.isEmpty();
    }

    public final int d() {
        return ((err0) this.a.d.c).s();
    }

    public final int e() {
        return ((mpb0) o7h.A0(this.a.h().n)).a;
    }
}
