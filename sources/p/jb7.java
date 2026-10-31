package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jb7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb7(String str, int i, boolean z, boolean z2) {
        super(3);
        this.d = str;
        this.c = i;
        this.b = z;
        this.e = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.e;
        int i = this.c;
        boolean z2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                uwo1.e(this.d, aqo1.e(z2, z), null, 0L, null, null, 2, false, new cjc0(i), 0, null, (b0k) obj2, 0, 0, 1724);
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0.a);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (z2) {
                        x340Var2.i0(-1776843453);
                        uwr uwrVar = cbx.a;
                        uwo1.e(this.d, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 2, false, new cjc0(i), 0, null, x340Var2, 1572864, 0, 1714);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1776602893);
                        x340Var2.r(false);
                    }
                    if (z) {
                        x340Var2.i0(-1776552394);
                        String strO0 = cwl1.o0(x340Var2, 2131962873);
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(strO0, null, cbx.d(x340Var2).j, ((vex) zex.a.b).l, null, null, 2, false, new cjc0(1), 0, null, x340Var2, 1572864, 0, 1714);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1776268589);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb7(boolean z, int i, String str, boolean z2) {
        super(3);
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = z2;
    }
}
