package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wwx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwx(vu30 vu30Var, vu30 vu30Var2, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = vu30Var;
        this.c = vu30Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        vu30 vu30Var2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                guo1.i(vu30Var2, vu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                op80 op80Var = (op80) obj;
                aul aulVar = (aul) obj2;
                op80 op80Var2 = (op80) vu30Var2.invoke(op80Var, aulVar);
                if (op80Var2 != null) {
                    op80 wchVar = q6x.b;
                    if (op80Var.equals(wchVar) && op80Var2.equals(wchVar)) {
                        op80Var = wchVar;
                    } else if (op80Var.equals(wchVar)) {
                        op80Var = op80Var2;
                    } else if (!op80Var2.equals(wchVar)) {
                        wchVar = new wch(op80Var, op80Var2);
                        op80Var = wchVar;
                    }
                }
                op80 op80Var3 = (op80) vu30Var.invoke(op80Var, aulVar);
                if (op80Var2 != null && op80Var3 != null) {
                    wch wchVar2 = q6x.b;
                    if (!op80Var2.equals(wchVar2) || !op80Var3.equals(wchVar2)) {
                        if (!op80Var2.equals(wchVar2)) {
                            if (op80Var3.equals(wchVar2)) {
                                return op80Var2;
                            }
                            wchVar2 = new wch(op80Var2, op80Var3);
                        }
                    }
                    return wchVar2;
                }
                if (op80Var2 != null) {
                    return op80Var2;
                }
                return op80Var3;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
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
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (vu30Var2 == null) {
                        x340Var2.i0(467702008);
                    } else {
                        x340Var2.i0(-539102167);
                        vu30Var2.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                    if (vu30Var == null) {
                        x340Var2.i0(467743672);
                    } else {
                        x340Var2.i0(-539100823);
                        vu30Var.invoke(x340Var2, 0);
                    }
                    x340Var2.r(false);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwx(vu30 vu30Var, vu30 vu30Var2, byte b) {
        super(2);
        this.a = b;
        this.b = vu30Var;
        this.c = vu30Var2;
    }
}
