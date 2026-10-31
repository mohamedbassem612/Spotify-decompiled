package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z6a extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ j2i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6a(String str, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = qim0Var;
        this.d = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.d;
        qim0 qim0Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    qim0 qim0VarI = zr7.i(qim0Var, o40.d1);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarI);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    qim0 qim0VarN = anm1.N(str, u291.f(nim0.a, 1.0f));
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarN);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    k4s0.i(0, j2iVar, x340Var2, true, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                d9p1.f(czo1.p(385), str, j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG = x340Var4.g(str);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new xfa(str, (byte) 3);
                        x340Var4.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
                    uwr uwrVar = cbx.a;
                    long j = ((yex) zex.a.d).g;
                    cua cuaVar = cbx.b(x340Var4).f;
                    qim0 qim0VarF = dug.f(qim0VarB, j, er31.b(2.0f));
                    cvx cvxVar = cbx.b(x340Var4).b;
                    qim0 qim0VarZ = uyn1.z(2.0f, 0.0f, 2, qim0VarF);
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM3 = x340Var4.m();
                    qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarZ);
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
                    nko1.H(gfh0VarC3, x340Var4, y580.O0);
                    nko1.H(xos0VarM3, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE3, x340Var4, y580.Y);
                    dv20.l(0, j2iVar, x340Var4, true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    b3o1.j(lee1.a(cbx.d(x340Var6).n, cbx.a(x340Var6).b.a, fc11.G(9), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777212), 0L, apo.r(1525645025, new z6a(qim0Var, str, j2iVar, b2), x340Var6), x340Var6, 384, 2);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                o1p1.r(czo1.p(385), str, j2iVar, (b0k) obj, qim0Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6a(qim0 qim0Var, String str, j2i j2iVar, byte b) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.b = str;
        this.d = j2iVar;
    }
}
