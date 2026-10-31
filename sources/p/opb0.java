package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class opb0 implements vsb0, bs41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bs41 b;
    public final /* synthetic */ ct41 c;

    public /* synthetic */ opb0(bs41 bs41Var, ct41 ct41Var, byte b) {
        this.a = b;
        this.c = ct41Var;
        this.b = bs41Var;
    }

    @Override // p.vsb0
    public final int a() {
        byte b = this.a;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case 0:
                return ((upb0) xtb0Var).h().q;
            default:
                return xtb0Var.h().o;
        }
    }

    @Override // p.vsb0
    public final int b() {
        byte b = this.a;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case 0:
                mpb0 mpb0Var = (mpb0) o7h.C0(((upb0) xtb0Var).h().n);
                if (mpb0Var != null) {
                    return mpb0Var.a;
                }
                return 0;
            default:
                qtb0 qtb0Var = (qtb0) o7h.C0(xtb0Var.h().l);
                if (qtb0Var != null) {
                    return qtb0Var.a;
                }
                return 0;
        }
    }

    @Override // p.vsb0
    public final void c(int i, int i2) {
        byte b = this.a;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case 0:
                ((upb0) xtb0Var).j(i, i2, true);
                break;
            default:
                xtb0Var.l(i, i2, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // p.vsb0
    public final int e(int i) {
        Object obj;
        qtb0 qtb0Var;
        byte b = this.a;
        Integer numValueOf = null;
        Object obj2 = null;
        numValueOf = null;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case 0:
                upb0 upb0Var = (upb0) xtb0Var;
                lpb0 lpb0VarH = upb0Var.h();
                if (lpb0VarH.n.isEmpty()) {
                    return 0;
                }
                int iH = h();
                if (i > b() || iH > i) {
                    int iO = ((lpb0) upb0Var.e.getValue()).o();
                    return (((((iO - 1) * (i < h() ? -1 : 1)) + (i - h())) / iO) * iko1.A(lpb0VarH)) - g();
                }
                List list = lpb0VarH.n;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        obj = list.get(i2);
                        if (((mpb0) obj).a != i) {
                            i2++;
                        }
                    } else {
                        obj = null;
                    }
                }
                mpb0 mpb0Var = (mpb0) obj;
                if (lpb0VarH.r == qqq0.a) {
                    if (mpb0Var != null) {
                        numValueOf = Integer.valueOf((int) (mpb0Var.w & 4294967295L));
                    }
                } else if (mpb0Var != null) {
                    numValueOf = Integer.valueOf((int) (mpb0Var.w >> 32));
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                ptb0 ptb0VarH = xtb0Var.h();
                if (ptb0VarH.l.isEmpty()) {
                    return 0;
                }
                int iH2 = h();
                if (i > b() || iH2 > i) {
                    return ((i - h()) * fno1.n(ptb0VarH)) - g();
                }
                List list2 = ptb0VarH.l;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj3 = list2.get(i3);
                    if (((qtb0) obj3).a == i) {
                        obj2 = obj3;
                        qtb0Var = (qtb0) obj2;
                        if (qtb0Var != null) {
                            return qtb0Var.p;
                        }
                        return 0;
                    }
                }
                qtb0Var = (qtb0) obj2;
                if (qtb0Var != null) {
                    return qtb0Var.p;
                }
                return 0;
        }
    }

    public final float f(float f) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.f(f);
    }

    @Override // p.vsb0
    public final int g() {
        byte b = this.a;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case 0:
                return ((err0) ((upb0) xtb0Var).d.d).s();
            default:
                return ((err0) xtb0Var.e.c).s();
        }
    }

    @Override // p.vsb0
    public final int h() {
        byte b = this.a;
        xtb0 xtb0Var = this.c;
        switch (b) {
            case 0:
                return ((err0) ((upb0) xtb0Var).d.c).s();
            default:
                return ((err0) xtb0Var.e.b).s();
        }
    }
}
