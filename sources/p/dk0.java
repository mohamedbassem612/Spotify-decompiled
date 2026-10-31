package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dk0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(String str, String str2, String str3, int i, LocalDate localDate) {
        super(3);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.b = i;
        this.f = localDate;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        int i;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        int i2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                wj0 wj0Var = (wj0) obj7;
                hj0 hj0Var = (hj0) obj6;
                iu30 iu30Var = (iu30) obj5;
                jkr0 jkr0Var = (jkr0) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0.a);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                String str = hj0Var.a;
                ji0 ji0Var = hj0Var.d;
                String str2 = hj0Var.b;
                int i3 = this.b;
                if (i3 == 0) {
                    x340Var3.i0(-498809167);
                    boolean zG = x340Var3.g(iu30Var);
                    Object objT = x340Var3.T();
                    if (zG || objT == fkj0.X) {
                        objT = new p1(iu30Var, (byte) 15);
                        x340Var3.s0(objT);
                    }
                    x340Var3.r(false);
                    function0 = (Function0) objT;
                } else {
                    x340Var3.i0(-498732939);
                    x340Var3.r(false);
                    function0 = null;
                }
                otw.c(wj0Var, new uj0(str, ji0Var, i3, str2, function0), (qim0) null, (ipb1) null, x340Var, 0, 12);
                lj0 lj0Var = hj0Var.e;
                if (lj0Var != null) {
                    x340Var3.i0(-498628685);
                    gfx.g(18, apo.r(1018903056, new g90(jkr0Var, i3, lj0Var, (byte) 2), x340Var), x340Var, 54);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-497914662);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                String str3 = (String) obj7;
                String str4 = (String) obj6;
                String str5 = (String) obj5;
                LocalDate localDate = (LocalDate) obj4;
                jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                if (str3 == null) {
                    str3 = "";
                }
                Uri uri = Uri.parse(str3);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var4).g;
                jsl jslVar = new jsl(cwl1.o0(x340Var4, 2131960376));
                cvx cvxVar = cbx.b(x340Var4).b;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11);
                akx akxVar = akx.c;
                eso1.e(uri, jslVar, qim0VarB, new p3v(88.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(akxVar, akxVar), false, false, x340Var4, 1073741824, 0, 3568);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                int iHashCode3 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM3 = x340Var6.m();
                qim0 qim0VarE3 = zr7.E(x340Var4, nim0Var);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, x340Var4, lljVar);
                nko1.H(xos0VarM3, x340Var4, lljVar2);
                i3a.l(iHashCode3, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE3, x340Var4, lljVar4);
                cvx cvxVar2 = cbx.b(x340Var4).b;
                qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                jw31 jw31VarA2 = ew31.a(h36.a, fraVar, x340Var4, 0);
                int iHashCode4 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM4 = x340Var6.m();
                qim0 qim0VarE4 = zr7.E(x340Var4, qim0VarB2);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA2, x340Var4, lljVar);
                nko1.H(xos0VarM4, x340Var4, lljVar2);
                i3a.l(iHashCode4, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE4, x340Var4, lljVar4);
                xrx xrxVar = xrx.c;
                long j = cbx.a(x340Var4).b.b;
                cvx cvxVar3 = cbx.b(x340Var4).b;
                qim0 qim0VarB3 = uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                zov0 zov0Var2 = cbx.b(x340Var4).g;
                w0h1.a(xrxVar, isl.a, u291.r(qim0VarB3, 16.0f), j, 0L, false, x340Var4, xrx.d | 48, 48);
                uwo1.e(a4p1.j(i2, localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)), (Context) x340Var6.k(AndroidCompositionLocals_androidKt.b), false), null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var4, 0, 0, 1714);
                x340Var6.r(true);
                lee1 lee1Var = cbx.d(x340Var4).h;
                long j2 = cbx.a(x340Var4).b.a;
                cjc0 cjc0Var = new cjc0(2);
                cvx cvxVar4 = cbx.b(x340Var4).b;
                uwo1.e(str4, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), lee1Var, j2, null, null, 2, false, cjc0Var, 0, null, x340Var4, 0, 0, 1712);
                qim0 qim0VarN = anm1.N("release-type-subtitle-view", nim0Var);
                if (u890.j(str5, "ALBUM")) {
                    i = 2131960377;
                } else {
                    i = u890.j(str5, "EP") ? 2131960379 : 2131960378;
                }
                uwo1.e(cwl1.o0(x340Var4, i), qim0VarN, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var4, 0, 0, 1712);
                x340Var6.r(true);
                x340Var6.r(true);
                return rih1Var;
            default:
                pv71 pv71Var = (pv71) obj;
                ((Number) obj3).intValue();
                ti81 ti81Var = (ti81) obj7;
                Boolean boolValueOf = Boolean.valueOf(ti81Var.e);
                x340 x340Var7 = (b0k) obj2;
                boolean zE = x340Var7.e(i2);
                Object objT2 = x340Var7.T();
                if (zE || objT2 == fkj0.X) {
                    objT2 = new sl11(i2, (byte) 8);
                    x340Var7.s0(objT2);
                }
                hm5.a(boolValueOf, (qim0) null, (iu30) objT2, (tl3) null, (String) null, (iu30) null, apo.r(2022599110, new rl6(pv71Var, (pt) obj6, ti81Var, (Function0) obj5, (Function0) obj4, (byte) 7), x340Var7), x340Var7, 1572864, 58);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(wj0 wj0Var, hj0 hj0Var, int i, iu30 iu30Var, jkr0 jkr0Var) {
        super(3);
        this.c = wj0Var;
        this.d = hj0Var;
        this.b = i;
        this.e = iu30Var;
        this.f = jkr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(ti81 ti81Var, int i, pt ptVar, Function0 function0, Function0 function1) {
        super(3);
        this.c = ti81Var;
        this.b = i;
        this.d = ptVar;
        this.e = function0;
        this.f = function1;
    }
}
