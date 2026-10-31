package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class utd implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;

    public /* synthetic */ utd(j2i j2iVar, byte b) {
        this.a = b;
        this.b = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbh pbhVar = pbh.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        j2i j2iVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                    int iK = tgp1.k(x340Var2);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    llj lljVar = y580.R0;
                    if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                        z5c.f(iK, x340Var2, iK, lljVar);
                    }
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    j2iVar.invoke(pbhVar, x340Var2, 6);
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
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var4, 0);
                    int iK2 = tgp1.k(x340Var4);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA2, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    llj lljVar2 = y580.R0;
                    if (x340Var4.S || !u890.j(x340Var4.T(), Integer.valueOf(iK2))) {
                        z5c.f(iK2, x340Var4, iK2, lljVar2);
                    }
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    j2iVar.invoke(pbhVar, x340Var4, 6);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
