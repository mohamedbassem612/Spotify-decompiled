package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t9a1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s9a1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9a1(s9a1 s9a1Var, hw2 hw2Var) {
        super(3);
        this.a = (byte) 1;
        this.b = s9a1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        int i = 2;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        s9a1 s9a1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    as80 as80Var = mif1.P0;
                    String str = s9a1Var.d;
                    Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                    uri.getClass();
                    ltx ltxVar = ltx.c;
                    nux nuxVar = new nux(ltxVar, ltxVar);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0 qim0VarQ = i1p1.q(nim0Var, er31.b(4.0f));
                    cbx.a.getClass();
                    eso1.e(uri, isl.a, anm1.N("media", hno1.f(qim0VarQ, uwr.a())), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var2, 1075314736, 0, 3512);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                fra fraVar = een.N0;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarN = anm1.N("subtitle", nim0Var2);
                int i2 = s9a1Var.e;
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var4, 48);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarN);
                hzj.A.getClass();
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(jw31VarA, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                if (i2 != 3) {
                    x340Var4.i0(-916364540);
                    int iC = l1d.C(i2);
                    if (iC == 0) {
                        i = 1;
                    } else if (iC != 1) {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i = 0;
                    }
                    if (i == 0) {
                        x340Var4.i0(-916015171);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-916015170);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var4).b;
                        kqn1.d(i, 0, 0, x340Var4, anm1.N("content-restriction-badge", uyn1.B(nim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11)));
                        x340Var4.r(false);
                    }
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-915721631);
                    x340Var4.r(false);
                }
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var4).j;
                long j = cbx.a(x340Var4).b.a;
                cjc0 cjc0Var = new cjc0(1);
                String str2 = s9a1Var.h;
                String strC = gg.C(mqo1.A(s9a1Var.c), x340Var4, 0, 1);
                if (str2 != null) {
                    strC = f4i1.f(str2, " • ", strC);
                }
                uwo1.e(strC, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var4, 1572864, 0, 1714);
                x340Var4.r(true);
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qim0 qim0VarN2 = anm1.N("title", nim0Var);
                    String str3 = s9a1Var.b;
                    uwr uwrVar4 = cbx.a;
                    uwo1.e(str3, qim0VarN2, cbx.d(x340Var6).e, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var6, 1572912, 0, 1712);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9a1(s9a1 s9a1Var, byte b) {
        super(3);
        this.a = b;
        this.b = s9a1Var;
    }
}
