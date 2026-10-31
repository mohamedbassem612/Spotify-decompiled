package p;

import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gv6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv6(long j, Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = j;
        this.c = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(361449457);
                cb20 cb20Var = (cb20) obj4;
                ye5 ye5Var = new ye5();
                int iO = ye5Var.o(new zma1(this.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(cb20Var.c);
                    ye5Var.k(iO);
                    Integer num = cb20Var.d;
                    if (num == null) {
                        x340Var.i0(-2037848173);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-2037848172);
                        int iIntValue = num.intValue();
                        uwr uwrVar = cbx.a;
                        int iO2 = ye5Var.o(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                        try {
                            ye5Var.g(" (" + iIntValue + ")");
                            ye5Var.k(iO2);
                            x340Var.r(false);
                        } catch (Throwable th) {
                            ye5Var.k(iO2);
                            throw th;
                        }
                    }
                    af5 af5VarP = ye5Var.p();
                    x340Var.r(false);
                    uwr uwrVar2 = cbx.a;
                    uwo1.f(af5VarP, null, cbx.d(x340Var).g, null, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4090);
                    return rih1Var;
                } catch (Throwable th2) {
                    ye5Var.k(iO);
                    throw th2;
                }
            case 1:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zqo1.d((m5f) obj4, j, x340Var3, 0);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    hux huxVar = ((qkf) obj4).c;
                    qim0 qim0VarR = u291.r(nim0Var, ((wat) x340Var5.k(t4k.h)).y(j));
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var5).b;
                    w0h1.a(huxVar, isl.a, uyn1.B(qim0VarR, 0.0f, 0.0f, 4.0f, 0.0f, 11), cbx.a(x340Var5).b.b, 0L, false, x340Var5, 56, 48);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    era eraVar = een.Q0;
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var7).b;
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    fyg fygVar = (fyg) obj4;
                    String str = fygVar.c;
                    mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var7, 48);
                    int iHashCode = Long.hashCode(x340Var7.T);
                    xos0 xos0VarM = x340Var7.m();
                    qim0 qim0VarE = zr7.E(x340Var7, nim0Var);
                    hzj.A.getClass();
                    if (x340Var7.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var7.m0();
                    if (x340Var7.S) {
                        x340Var7.l(n4kVar);
                    } else {
                        x340Var7.v0();
                    }
                    nko1.H(mbhVarA, x340Var7, y580.O0);
                    nko1.H(xos0VarM, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE, x340Var7, y580.Y);
                    String str2 = fygVar.e;
                    int i = fygVar.d;
                    w2g0.k(str2, str, 120.0f, (qim0) null, new u7h(j), fygVar.f, x340Var7, 384, 8);
                    uwo1.e(str, null, cbx.d(x340Var7).k, cbx.a(x340Var7).b.a, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var7, 1572864, 0, 1698);
                    if (i > 0) {
                        x340Var7.i0(-635489177);
                        uwo1.e(cwl1.U(2131820639, i, new Object[]{Integer.valueOf(i)}, x340Var7), null, cbx.d(x340Var7).j, cbx.a(x340Var7).b.b, new a0e1(3), null, 0, false, new cjc0(1), 0, null, x340Var7, 0, 0, 1762);
                        x340Var7.r(false);
                    } else {
                        x340Var7.i0(-635110295);
                        x340Var7.r(false);
                    }
                    x340Var7.r(true);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dym.a((txm) obj4, j, x340Var9, 0);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 5:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                xln xlnVar = (xln) obj4;
                Object obj5 = fkj0.X;
                x340 x340Var10 = (b0k) obj2;
                x340Var10.i0(736249756);
                View view = (View) x340Var10.k(AndroidCompositionLocals_androidKt.f);
                boolean zG = x340Var10.g(view);
                Object objT = x340Var10.T();
                if (zG || objT == obj5) {
                    objT = view.getRootView();
                    x340Var10.s0(objT);
                }
                View view2 = (View) objT;
                boolean zI = x340Var10.i(view2) | x340Var10.i(xlnVar);
                long j2 = this.b;
                boolean zF = x340Var10.f(j2) | zI;
                Object objT2 = x340Var10.T();
                if (zF || objT2 == obj5) {
                    objT2 = new no9((Object) view2, (Object) xlnVar, j2, (byte) 4);
                    x340Var10.s0(objT2);
                }
                qim0 qim0VarX = j9k1.x(qim0Var, (xu30) objT2);
                x340Var10.r(false);
                return qim0VarX;
            case 6:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    rwq0.e(((k460) obj4).c, u291.d(nim0Var, 1.0f), isl.a, this.b, x340Var12, 432, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                ioo1.p((va60) obj4, this.b, (qim0) obj, (b0k) obj2, (((Number) obj3).intValue() << 6) & 896, 0);
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 56.0f);
                x340 x340Var13 = (b0k) obj2;
                boolean zF2 = x340Var13.f(j);
                Object objT3 = x340Var13.T();
                if (zF2 || objT3 == fkj0.X) {
                    objT3 = new ps((byte) 22, j);
                    x340Var13.s0(objT3);
                }
                qim0 qim0VarX2 = bin.x(exd0.q(qim0VarH, (iu30) objT3), false, null, null, null, (Function0) obj4, 15);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var13.T);
                xos0 xos0VarM2 = x340Var13.m();
                qim0 qim0VarE2 = zr7.E(x340Var13, qim0VarX2);
                hzj.A.getClass();
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(gfh0VarC, x340Var13, y580.O0);
                nko1.H(xos0VarM2, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE2, x340Var13, y580.Y);
                bqn1.a(x340Var13, 0);
                x340Var13.r(true);
                return rih1Var;
            default:
                tb91 tb91Var = (tb91) obj;
                x340 x340Var14 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= (iIntValue7 & 8) == 0 ? x340Var14.g(tb91Var) : x340Var14.i(tb91Var) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    lb91 lb91Var = lb91.a;
                    qim0 qim0VarH2 = u291.h(nim0Var, rr51.b);
                    fb91 fb91Var = (fb91) obj4;
                    Object objT4 = x340Var15.T();
                    m4c m4cVar = fkj0.X;
                    if (objT4 == m4cVar) {
                        objT4 = qr51.b;
                        x340Var15.s0(objT4);
                    }
                    vu30 vu30Var = (vu30) objT4;
                    boolean zF3 = x340Var15.f(j);
                    Object objT5 = x340Var15.T();
                    if (zF3 || objT5 == m4cVar) {
                        objT5 = new rvh((byte) 13, j);
                        x340Var15.s0(objT5);
                    }
                    lb91Var.b(tb91Var, qim0VarH2, false, fb91Var, vu30Var, (xu30) objT5, 0.0f, 0.0f, x340Var15, 24584 | (iIntValue7 & 14), 132);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv6(Object obj, long j, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
