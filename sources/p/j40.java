package p;

import android.content.res.Configuration;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(e40 e40Var, float f, iu30 iu30Var, xho xhoVar, hft0 hft0Var, xgx0 xgx0Var) {
        super(2);
        this.c = e40Var;
        this.b = f;
        this.d = iu30Var;
        this.e = xhoVar;
        this.f = hft0Var;
        this.g = xgx0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                e40 e40Var = (e40) obj7;
                String str = e40Var.d;
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                ye5 ye5VarO = kk0.o(121141626, x340Var2);
                uwr uwrVar = cbx.a;
                int iO = ye5VarO.o(zma1.a(cbx.d(x340Var2).k.a, cbx.a(x340Var2).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534));
                try {
                    String str2 = e40Var.b;
                    y30 y30Var = e40Var.f;
                    ye5VarO.g(str2);
                    ye5VarO.k(iO);
                    ye5VarO.g("\n");
                    int iO2 = ye5VarO.o(zma1.a(cbx.d(x340Var2).j.a, cbx.a(x340Var2).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534));
                    try {
                        ye5VarO.g(e40Var.c);
                        ye5VarO.k(iO2);
                        af5 af5VarP = ye5VarO.p();
                        x340Var2.r(false);
                        float f2 = (y30Var == null || !y30Var.b) ? 1.0f : 0.5f;
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarK = d9y0.k(nim0Var, f2);
                        kiv kivVar = AndroidCompositionLocals_androidKt.a;
                        float f3 = ((Configuration) x340Var2.k(kivVar)).fontScale;
                        if (f3 < 1.0f) {
                            f3 = 1.0f;
                        }
                        qim0 qim0VarV = u291.v(u291.h(qim0VarK, f3 == 1.0f ? 104.0f : (f3 * 104.0f) + 48.0f), yoi1.o(0.85f * f, 272.0f, 384.0f));
                        jtr jtrVar = jtr.f;
                        Object objT = x340Var2.T();
                        m4c m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = ktd.n(x340Var2);
                        }
                        idn0 idn0Var = (idn0) objT;
                        pm31 pm31Var = new pm31(0);
                        boolean zG = x340Var2.g(iu30Var);
                        Object objT2 = x340Var2.T();
                        if (zG || objT2 == m4cVar) {
                            objT2 = new p1(iu30Var, (byte) 10);
                            x340Var2.s0(objT2);
                        }
                        Function0 function0 = (Function0) objT2;
                        boolean zG2 = x340Var2.g(iu30Var);
                        Object objT3 = x340Var2.T();
                        if (zG2 || objT3 == m4cVar) {
                            objT3 = new p1(iu30Var, (byte) 11);
                            x340Var2.s0(objT3);
                        }
                        qim0 qim0VarY = bin.y(qim0VarV, idn0Var, jtrVar, false, null, pm31Var, null, function0, (Function0) objT3, 428);
                        xho xhoVar = (xho) obj6;
                        hft0 hft0Var = (hft0) obj5;
                        xgx0 xgx0Var = (xgx0) obj3;
                        fra fraVar = een.Z;
                        gex0 gex0Var = h36.a;
                        jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var2, 0);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        boolean z = x340Var2.S;
                        n4k n4kVar = hmb0.t1;
                        if (z) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        llj lljVar = y580.O0;
                        nko1.H(jw31VarA, x340Var2, lljVar);
                        llj lljVar2 = y580.N0;
                        nko1.H(xos0VarM, x340Var2, lljVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        llj lljVar3 = y580.R0;
                        nko1.H(numValueOf, x340Var2, lljVar3);
                        nko1.F(x340Var2);
                        llj lljVar4 = y580.Y;
                        nko1.H(qim0VarE, x340Var2, lljVar4);
                        eso1.e(Uri.parse(e40Var.a), isl.a, u291.r(nim0Var, 104.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
                        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                        int iHashCode2 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM2 = x340Var2.m();
                        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD);
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(mbhVarA, x340Var2, lljVar);
                        nko1.H(xos0VarM2, x340Var2, lljVar2);
                        x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                        nko1.H(qim0VarE2, x340Var2, lljVar4);
                        float f4 = ((Configuration) x340Var2.k(kivVar)).fontScale;
                        if (f4 < 1.0f) {
                            f4 = 1.0f;
                        }
                        cjc0 cjc0Var = new cjc0((int) Math.ceil(3.0f * f4));
                        cvx cvxVar = cbx.b(x340Var2).b;
                        uwo1.f(af5VarP, kx40.h(1.0f, uyn1.B(nim0Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), true), null, null, null, null, 2, false, cjc0Var, 0, null, null, x340Var2, 0, 0, 3772);
                        qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 48.0f);
                        fra fraVar2 = een.N0;
                        jw31 jw31VarA2 = ew31.a(gex0Var, fraVar2, x340Var2, 0);
                        int iHashCode3 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM3 = x340Var2.m();
                        qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarH);
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(jw31VarA2, x340Var2, lljVar);
                        nko1.H(xos0VarM3, x340Var2, lljVar2);
                        x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                        nko1.H(qim0VarE3, x340Var2, lljVar4);
                        otw.c(xhoVar, new uho(str, str, (tho) null, (nho) null, (String) null, (Function0) null, 252), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        vyo1.c(y30Var, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), x340Var2, 0);
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        jw31 jw31VarA3 = ew31.a(gex0Var, fraVar2, x340Var2, 0);
                        int iHashCode4 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM4 = x340Var2.m();
                        qim0 qim0VarE4 = zr7.E(x340Var2, wnb0Var);
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(jw31VarA3, x340Var2, lljVar);
                        nko1.H(xos0VarM4, x340Var2, lljVar2);
                        x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
                        nko1.H(qim0VarE4, x340Var2, lljVar4);
                        String str3 = e40Var.e;
                        lee1 lee1Var = cbx.d(x340Var2).j;
                        long j = cbx.a(x340Var2).b.b;
                        cjc0 cjc0Var2 = new cjc0(1);
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        uwo1.e(str3, qim0VarB.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), lee1Var, j, null, null, 2, false, cjc0Var2, 0, null, x340Var2, 0, 0, 1712);
                        otw.c(xgx0Var, new vgx0(str, 32.0f), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                        x340Var2.r(true);
                        otw.c(hft0Var, new set0(str, true, "", "", (Function0) null, false, false, (Function0) null, (String) null, (String) null, false, 2032), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        us71.m(x340Var2, true, true, true);
                        return rih1Var;
                    } catch (Throwable th) {
                        ye5VarO.k(iO2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ye5VarO.k(iO);
                    throw th2;
                }
            case 1:
                tlc1 tlc1Var = (tlc1) obj;
                long j2 = ((hjl) obj2).a;
                vzq0 vzq0Var = (vzq0) obj7;
                int iX0 = (int) tlc1Var.X0(vzq0Var.b(tlc1Var.getLayoutDirection()));
                int iX1 = iX0 + ((int) tlc1Var.X0(vzq0Var.c(tlc1Var.getLayoutDirection())));
                int iX2 = (int) tlc1Var.X0(vzq0Var.d());
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P(lc91.a, new j2i(-68262314, new kez0((qim0) obj4, (es41) obj6, (ViewGroup) obj5, (j2i) obj3, (int) tlc1Var.X0(f), hjl.i(j2), iX1, iX2 + ((int) tlc1Var.X0(vzq0Var.a())), iX0, iX2), true)))).H(j2);
                return tlc1Var.S(hjl.i(j2), q5t0VarH.b, b7x.a, new f2(q5t0VarH, (byte) 26));
            default:
                ((Number) obj2).intValue();
                m87.d((String) obj7, (String) obj6, this.b, (max) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(24577));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(String str, String str2, float f, max maxVar, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.c = str;
        this.e = str2;
        this.b = f;
        this.f = maxVar;
        this.d = iu30Var;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(vzq0 vzq0Var, float f, qim0 qim0Var, es41 es41Var, ViewGroup viewGroup, j2i j2iVar) {
        super(2);
        this.c = vzq0Var;
        this.b = f;
        this.d = qim0Var;
        this.e = es41Var;
        this.f = viewGroup;
        this.g = j2iVar;
    }
}
