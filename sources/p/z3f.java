package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z3f extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3f(int i, j2i j2iVar, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 6;
        this.d = i;
        this.b = j2iVar;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        j2i j2iVar = this.b;
        int i = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                fqo1.f(czo1.p(i | 1), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                iqo1.h(czo1.p(i | 1), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                iqo1.n(czo1.p(i | 1), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarW = uyn1.w(dug.f(qim0Var, cbx.a(x340Var2).a.c, er31.b(rjx.b(i, x340Var2))), rjx.h(i, x340Var2));
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarW);
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
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    dv20.l(0, j2iVar, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b3o1.f(rjx.j(i, x340Var4), apo.r(1897314622, new z3f(qim0Var, i, j2iVar), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                d9p1.h(i, czo1.p(24577), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                who1.g(i, czo1.p(49), j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3f(byte b, int i, j2i j2iVar, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3f(int i, qim0 qim0Var, j2i j2iVar) {
        super(2);
        this.a = (byte) 4;
        this.d = i;
        this.c = qim0Var;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3f(int i, qim0 qim0Var, j2i j2iVar, int i2) {
        super(2);
        this.a = (byte) 5;
        this.d = i;
        this.c = qim0Var;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3f(qim0 qim0Var, int i, j2i j2iVar) {
        super(2);
        this.a = (byte) 3;
        this.c = qim0Var;
        this.d = i;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3f(qim0 qim0Var, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 0;
        this.c = qim0Var;
        this.b = j2iVar;
        this.d = i;
    }
}
