package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class chx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ erl1 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ vu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ chx(erl1 erl1Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, byte b) {
        super(2);
        this.a = b;
        this.b = erl1Var;
        this.c = vu30Var;
        this.d = vu30Var2;
        this.e = vu30Var3;
        this.f = vu30Var4;
        this.g = vu30Var5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        j2i j2iVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    WeakHashMap weakHashMap = osl1.x;
                    mih1 mih1Var = new mih1(this.b, lhc.g(x340Var2).c);
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarY = too1.y(nim0Var, mih1Var);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarX = u291.x(0.0f, 472.0f, 1, uyn1.z(cbx.b(x340Var2).e.b, 0.0f, 2, qim0VarY));
                    long j = cbx.a(x340Var2).a.c;
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0 qim0VarX2 = uyn1.x(dug.f(qim0VarX, j, er31.b(8.0f)), cbx.b(x340Var2).e.c);
                    era eraVar = een.Q0;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX2);
                    hzj.A.getClass();
                    j2i j2iVar2 = null;
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
                    vu30 vu30Var = this.c;
                    if (vu30Var == null) {
                        x340Var2.i0(-1038007864);
                    } else {
                        x340Var2.i0(1767631193);
                        vu30Var.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                    vu30 vu30Var2 = this.d;
                    vu30 vu30Var3 = this.e;
                    if (vu30Var == null || (vu30Var2 == null && vu30Var3 == null)) {
                        x340Var2.i0(-1037843439);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1037932812);
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        x0d.s(nim0Var, 8.0f, x340Var2, false);
                    }
                    if (vu30Var2 == null) {
                        x340Var2.i0(-1037825832);
                        x340Var2.r(false);
                        j2iVar = null;
                    } else {
                        x340Var2.i0(1767637065);
                        j2iVar = new j2i(1668710817, new ehx(cbx.d(x340Var2).e, vu30Var2, null == true ? 1 : 0), true);
                        x340Var2.r(false);
                    }
                    if (j2iVar == null) {
                        x340Var2.i0(-1037769784);
                    } else {
                        x340Var2.i0(1767638873);
                        j2iVar.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                    if (vu30Var3 == null) {
                        x340Var2.i0(-1037742535);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1767639752);
                        j2i j2iVar3 = new j2i(1668710817, new ehx(cbx.d(x340Var2).j, vu30Var3, null == true ? 1 : 0), true);
                        x340Var2.r(false);
                        j2iVar2 = j2iVar3;
                    }
                    if (j2iVar2 == null) {
                        x340Var2.i0(-1037687448);
                    } else {
                        x340Var2.i0(1767641529);
                        j2iVar2.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                    vu30 vu30Var4 = this.f;
                    vu30 vu30Var5 = this.g;
                    if ((vu30Var4 == null && vu30Var5 == null) || (vu30Var == null && vu30Var2 == null && vu30Var3 == null)) {
                        x340Var2.i0(-1037437711);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1037527084);
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        x0d.s(nim0Var, 8.0f, x340Var2, false);
                    }
                    if (vu30Var4 == null) {
                        x340Var2.i0(-1037413656);
                    } else {
                        x340Var2.i0(1767650361);
                        vu30Var4.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                    if (vu30Var5 == null) {
                        x340Var2.i0(-1037379928);
                    } else {
                        x340Var2.i0(1767651449);
                        vu30Var5.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gfx.b(6, apo.r(1709538971, new chx(this.b, this.c, this.d, this.e, this.f, this.g, (byte) 0), x340Var4), x340Var4, 54);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
