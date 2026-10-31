package p;

import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class st11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tt11 b;
    public final /* synthetic */ ComposeView c;
    public final /* synthetic */ yt11 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st11(ComposeView composeView, tt11 tt11Var, yt11 yt11Var) {
        super(2);
        this.a = (byte) 2;
        this.c = composeView;
        this.b = tt11Var;
        this.d = yt11Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Object obj3;
        fg91 fg91VarN;
        vu30 vu30Var;
        vu30 vu30Var2;
        vu30 vu30Var3;
        vu30 vu30Var4;
        int i;
        rih1 rih1Var;
        qim0 qim0Var;
        ?? r3;
        rih1 rih1Var2;
        byte b = this.a;
        yt11 yt11Var = this.d;
        rih1 rih1Var3 = rih1.a;
        tt11 tt11Var = this.b;
        ComposeView composeView = this.c;
        byte b2 = 1;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = tt11Var.a;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var3;
                }
                ven0 ven0VarH = rwq.h(tt11Var.W0, x340Var2, 0);
                jmb1 jmb1Var = (jmb1) ven0VarH.getValue();
                if (jmb1Var == null) {
                    x340Var2.i0(2138681886);
                    x340Var2.r(false);
                    rih1Var = rih1Var3;
                    i = 1;
                    r3 = 0;
                    qim0Var = null;
                    rih1Var2 = null;
                } else {
                    bv11 bv11Var = jmb1Var.b;
                    x340Var2.i0(2138681887);
                    boolean zI = x340Var2.i(tt11Var) | x340Var2.i(jmb1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        zkz0 zkz0Var = new zkz0(tt11Var, jmb1Var, (byte) 24);
                        x340Var2.s0(zkz0Var);
                        obj3 = zkz0Var;
                    }
                    qxd0.S((Function0) obj3, x340Var2);
                    Long l = bv11Var.c;
                    yqg yqgVar = tt11Var.c;
                    boolean zG = x340Var2.g(l) | x340Var2.g(yqgVar);
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (zG || objT2 == m4cVar) {
                        String strC = tt11Var.e.c(bv11Var.c, yqgVar, composeView.getContext());
                        x340Var2.s0(strC);
                        obj4 = strC;
                    }
                    c9 c9VarK = xzo1.k(jmb1Var, (String) obj4, yqgVar, x340Var2);
                    jmb1 jmb1Var2 = (jmb1) ven0VarH.getValue();
                    if (jmb1Var2 == null) {
                        x340Var2.i0(1211635051);
                        x340Var2.r(false);
                        fg91VarN = null;
                    } else {
                        x340Var2.i0(454726998);
                        fg91VarN = tgp1.n(jmb1Var2, yqgVar, x340Var2);
                        x340Var2.r(false);
                    }
                    qim0 qim0VarF = u291.f(uyn1.z(tt11Var.d ? 4.0f : 0.0f, 0.0f, 2, nim0.a), 1.0f);
                    int i2 = tt11Var.a1;
                    uu11 uu11Var = tt11Var.V0;
                    if (fg91VarN == null) {
                        fg91VarN = fg91.b;
                    }
                    fg91 fg91Var = fg91VarN;
                    dtw dtwVar = tt11Var.T0;
                    if (dtwVar == null) {
                        x340Var2.i0(1212254121);
                        x340Var2.r(false);
                        vu30Var = null;
                    } else {
                        x340Var2.i0(1212254122);
                        vu30 vu30VarR = apo.r(1357116481, new qt11(dtwVar, (byte) 0), x340Var2);
                        x340Var2.r(false);
                        vu30Var = vu30VarR;
                    }
                    dtw dtwVar2 = tt11Var.U0;
                    if (dtwVar2 == null) {
                        x340Var2.i0(1212395295);
                        x340Var2.r(false);
                        vu30Var2 = null;
                    } else {
                        x340Var2.i0(1212395296);
                        vu30 vu30VarR2 = apo.r(-1191996471, new qt11(dtwVar2, (byte) 1), x340Var2);
                        x340Var2.r(false);
                        vu30Var2 = vu30VarR2;
                    }
                    uh uhVar = tt11Var.Z;
                    if (uhVar == null) {
                        x340Var2.i0(1212554170);
                        x340Var2.r(false);
                        vu30Var3 = null;
                    } else {
                        x340Var2.i0(454756647);
                        vu30 vu30VarR3 = apo.r(-961138079, new ps11(uhVar, (byte) 2), x340Var2);
                        x340Var2.r(false);
                        vu30Var3 = vu30VarR3;
                    }
                    uh uhVar2 = tt11Var.N0;
                    if (uhVar2 == null) {
                        x340Var2.i0(1212629562);
                        x340Var2.r(false);
                        vu30Var4 = null;
                    } else {
                        x340Var2.i0(454759079);
                        vu30 vu30VarR4 = apo.r(-961138079, new ps11(uhVar2, (byte) 2), x340Var2);
                        x340Var2.r(false);
                        vu30Var4 = vu30VarR4;
                    }
                    x340Var2.i0(900373061);
                    i = 1;
                    List listI0 = f46.i0(new uh[]{tt11Var.O0, tt11Var.P0, tt11Var.Q0, tt11Var.R0});
                    ArrayList arrayList = new ArrayList(q7h.U(listI0, 10));
                    Iterator it = listI0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(apo.r(-961138079, new ps11((uh) it.next(), (byte) 2), x340Var2));
                    }
                    x340Var2.r(false);
                    c380 c380VarA = mqo1.A(arrayList);
                    ppc1 ppc1Var = tt11Var.g;
                    boolean z2 = tt11Var.i;
                    rih1Var = rih1Var3;
                    qim0Var = null;
                    u4p1.w(uu11Var, jmb1Var, c9VarK, fg91Var, iu30Var, tt11Var.t, !(tt11Var.f instanceof dgx0), vu30Var, vu30Var2, vu30Var3, vu30Var4, c380VarA, tt11Var.X, iu30Var, qim0VarF, new o27(z2 ? 3 : 1, tt11Var.b1), z2, false, tt11Var.h, apo.r(1369443658, new rt11(tt11Var, jmb1Var, (byte) 0), x340Var2), i2, this.d, ppc1Var, (vu30) null, (vu30) null, false, (String) null, (w5w0) null, x340Var2, 4096, 260177920);
                    r3 = 0;
                    x340Var2.r(false);
                    rih1Var2 = rih1Var;
                }
                if (rih1Var2 != null) {
                    x340Var2.i0(900273551);
                    x340Var2.r((boolean) r3);
                    return rih1Var;
                }
                x340Var2.i0(2143586056);
                int iC = l1d.C(tt11Var.Z0);
                if (iC == 0) {
                    x340Var2.i0(-1758901199);
                    l4p1.g(qim0Var, x340Var2, (int) r3);
                    x340Var2.r((boolean) r3);
                } else {
                    if (iC != i) {
                        throw p3d1.k(x340Var2, -1758903103, (boolean) r3);
                    }
                    x340Var2.i0(-1758899279);
                    l4p1.m(qim0Var, x340Var2, (int) r3);
                    x340Var2.r((boolean) r3);
                }
                x340Var2.r((boolean) r3);
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(2034454095, new st11(tt11Var, composeView, yt11Var, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var3;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qsw.c(new obk1(composeView), apo.r(-91871364, new st11(tt11Var, composeView, yt11Var, b2), x340Var6), x340Var6, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st11(tt11 tt11Var, ComposeView composeView, yt11 yt11Var, byte b) {
        super(2);
        this.a = b;
        this.b = tt11Var;
        this.c = composeView;
        this.d = yt11Var;
    }
}
