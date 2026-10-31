package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hv50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ nt70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv50(nt70 nt70Var) {
        super(2);
        this.b = nt70Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        llj lljVar;
        qim0 qim0Var;
        Function0 function0;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        float fE;
        boolean z4;
        float fE2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nt70 nt70Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                d1o1.d(nt70Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                gra graVar = een.d;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var2, qim0Var2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z5 = x340Var2.S;
                Function0 function1 = hmb0.t1;
                if (z5) {
                    x340Var2.l(function1);
                } else {
                    x340Var2.v0();
                }
                llj lljVar2 = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar2);
                llj lljVar3 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar3);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar4 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar4);
                nko1.F(x340Var2);
                llj lljVar5 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar5);
                maa maaVar = nt70Var.i;
                boolean z6 = nt70Var.f25p;
                if (maaVar != null) {
                    x340Var2.i0(-259068280);
                    qim0 qim0VarN = anm1.N("metadata_row", qim0Var2);
                    if (z6) {
                        x340Var2.i0(-258872639);
                        Object objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = ktd.o(0.0f, x340Var2);
                        }
                        ven0 ven0Var = (ven0) objT;
                        j2i j2iVarR = apo.r(-1531405060, new nf0(ven0Var, (byte) 1), x340Var2);
                        qim0Var = qim0Var2;
                        z = z6;
                        function0 = function1;
                        lljVar = lljVar4;
                        w2g0.c((qim0) null, (tl3) null, j2iVarR, x340Var2, 3072, 7);
                        fE2 = ((p3v) ven0Var.getValue()).a;
                        z4 = false;
                        x340Var2.r(false);
                    } else {
                        lljVar = lljVar4;
                        qim0Var = qim0Var2;
                        function0 = function1;
                        z = z6;
                        z4 = false;
                        fE2 = z5c.e(x340Var2, -258793279, 2131165289, x340Var2, false);
                    }
                    qim0 qim0VarZ = uyn1.z(fE2, 0.0f, 2, qim0VarN);
                    gfh0 gfh0VarC = t1c.c(graVar, z4);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(function0);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar2);
                    nko1.H(xos0VarM2, x340Var2, lljVar3);
                    x0d.q(iHashCode2, x340Var2, lljVar, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar5);
                    otw.c(nt70Var.i, nt70Var.a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2 = x340Var2;
                    x340Var2.r(true);
                    i = 0;
                    x340Var2.r(false);
                } else {
                    rih1Var = rih1Var;
                    lljVar = lljVar4;
                    qim0Var = qim0Var2;
                    function0 = function1;
                    z = z6;
                    i = 0;
                    v8i0.i(8.0f, -258562732, x340Var2, x340Var2, qim0Var);
                    x340Var2.r(false);
                }
                d1o1.d(nt70Var, x340Var2, i);
                if (nt70Var.g != null) {
                    x340Var2.i0(-258304564);
                    qim0 qim0VarN2 = anm1.N("banner_row", qim0Var);
                    if (z) {
                        x340Var2.i0(-258110783);
                        Object objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = ktd.o(0.0f, x340Var2);
                        }
                        ven0 ven0Var2 = (ven0) objT2;
                        w2g0.c((qim0) null, (tl3) null, apo.r(-1531405060, new nf0(ven0Var2, (byte) 1), x340Var2), x340Var2, 3072, 7);
                        fE = ((p3v) ven0Var2.getValue()).a;
                        z3 = false;
                        x340Var2.r(false);
                    } else {
                        z3 = false;
                        fE = z5c.e(x340Var2, -258031423, 2131165289, x340Var2, false);
                    }
                    qim0 qim0VarZ2 = uyn1.z(fE, 0.0f, 2, qim0VarN2);
                    gfh0 gfh0VarC2 = t1c.c(graVar, z3);
                    int iHashCode3 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM3 = x340Var2.m();
                    qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarZ2);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(function0);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var2, lljVar2);
                    nko1.H(xos0VarM3, x340Var2, lljVar3);
                    x0d.q(iHashCode3, x340Var2, lljVar, x340Var2);
                    nko1.H(qim0VarE3, x340Var2, lljVar5);
                    x340 x340Var3 = x340Var2;
                    otw.c(nt70Var.g, nt70Var.a, (qim0) null, (ipb1) null, x340Var3, 0, 12);
                    x340Var2 = x340Var3;
                    z2 = true;
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    z2 = true;
                    x340Var2.i0(-257813493);
                    x340Var2.r(false);
                }
                x340Var2.r(z2);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv50(nt70 nt70Var, int i) {
        super(2);
        this.b = nt70Var;
    }
}
