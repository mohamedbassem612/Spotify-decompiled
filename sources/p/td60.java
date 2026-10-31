package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class td60 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rd60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td60(rd60 rd60Var, byte b) {
        super(3);
        this.a = b;
        this.b = rd60Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rd60 rd60Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Uri uri = rd60Var.b ? Uri.EMPTY : Uri.parse(rd60Var.a.f);
                    uri.getClass();
                    h6m h6mVar = mif1.Q0;
                    fwx fwxVarG = hso1.G(akx.c, 0L, 0L, x340Var2, akx.d, 30);
                    eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var2, 1075314736, 0, 3516);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    d36 d36Var = new d36(4.0f, true, new um5(false));
                    fra fraVar = een.N0;
                    qd60 qd60Var = rd60Var.a;
                    jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var4, 48);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarF);
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
                    int iO = oqn1.o(qd60Var.j);
                    if (iO == 0) {
                        x340Var4.i0(-1853899516);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1853899515);
                        kqn1.d(iO, 0, 2, x340Var4, (qim0) null);
                        x340Var4.r(false);
                    }
                    uwo1.e(qd60Var.d, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 1572864, 0, 1726);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
