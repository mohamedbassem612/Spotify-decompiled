package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gcx extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcx(hcx hcxVar, String str, long j, n6a1 n6a1Var, boolean z, Uri uri) {
        super(3);
        this.e = hcxVar;
        this.c = str;
        this.b = j;
        this.f = n6a1Var;
        this.d = z;
        this.g = uri;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        long j;
        ed80 ed80VarZ;
        boolean z;
        boolean z2;
        char c;
        lee1 lee1VarA;
        qim0 qim0Var;
        vu30 vu30Var;
        Function0 function0;
        float f;
        b0k b0kVar;
        vu30 vu30Var2;
        x340 x340Var;
        long j2;
        long j3;
        boolean z3;
        long j4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        boolean z4 = this.d;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ed80 ed80Var = null;
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                hcx hcxVar = (hcx) obj6;
                float fA = hcxVar.a(x340Var2);
                x340 x340Var3 = x340Var2;
                wat watVar = (wat) x340Var3.k(t4k.h);
                long j5 = ((i2c) obj).b;
                boolean zF = x340Var3.f(j5) | x340Var3.e(hcxVar.ordinal());
                Object objT = x340Var3.T();
                if (zF || objT == m4cVar) {
                    if (hjl.d(j5)) {
                        fA = watVar.M0(hjl.h(j5));
                    } else if (hjl.e(j5)) {
                        fA = watVar.M0(hjl.i(j5));
                    }
                    objT = new s3v(jhc1.c(fA, fA));
                    x340Var3.s0(objT);
                }
                long j6 = ((s3v) objT).a;
                n6a1 n6a1Var = (n6a1) obj5;
                String str = this.c;
                long j7 = this.b;
                if (str != null) {
                    x340Var3.i0(-371776269);
                    yae1 yae1VarQ = d5p1.q(0, x340Var3, 1);
                    switch (hcxVar.ordinal()) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            c = ' ';
                            x340Var3.i0(-962534446);
                            uwr uwrVar = cbx.a;
                            lee1VarA = cbx.d(x340Var3).k;
                            x340Var3.r(false);
                            break;
                        case 1:
                            c = ' ';
                            x340Var3.i0(-962532717);
                            uwr uwrVar2 = cbx.a;
                            lee1VarA = cbx.d(x340Var3).h;
                            x340Var3.r(false);
                            break;
                        case 2:
                            c = ' ';
                            x340Var3.i0(-962531121);
                            uwr uwrVar3 = cbx.a;
                            lee1VarA = cbx.d(x340Var3).e;
                            x340Var3.r(false);
                            break;
                        case 3:
                            c = ' ';
                            x340Var3.i0(-962529617);
                            uwr uwrVar4 = cbx.a;
                            lee1VarA = cbx.d(x340Var3).c;
                            x340Var3.r(false);
                            break;
                        case 4:
                            c = ' ';
                            x340Var3.i0(-962528141);
                            uwr uwrVar5 = cbx.a;
                            lee1VarA = cbx.d(x340Var3).b;
                            x340Var3.r(false);
                            break;
                        case 5:
                            c = ' ';
                            x340Var3.i0(-962525925);
                            uwr uwrVar6 = cbx.a;
                            lee1VarA = lee1.a(cbx.d(x340Var3).a, 0L, fc11.G(68), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                            x340Var3.r(false);
                            break;
                        case 6:
                            c = ' ';
                            x340Var3.i0(-962523854);
                            uwr uwrVar7 = cbx.a;
                            lee1VarA = cbx.d(x340Var3).k;
                            x340Var3.r(false);
                            break;
                        default:
                            throw p3d1.k(x340Var3, -962535936, false);
                    }
                    lee1 lee1VarA2 = lee1.a(lee1VarA, j7, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                    float fA2 = hcxVar.a(x340Var3);
                    j = j6;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(hcxVar.a(x340Var3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fA2)) << c);
                    boolean zG = x340Var3.g(yae1VarQ) | x340Var3.g(str) | x340Var3.g(lee1VarA2) | x340Var3.g(n6a1Var) | x340Var3.f(jFloatToRawIntBits) | x340Var3.f(j7);
                    Object objT2 = x340Var3.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new ed80(yae1VarQ, str, lee1VarA2, n6a1Var, jFloatToRawIntBits);
                        x340Var3.s0(objT2);
                    }
                    ed80VarZ = (ed80) objT2;
                    z = false;
                    x340Var3.r(false);
                } else {
                    j = j6;
                    if (z4) {
                        x340Var3.i0(-371772893);
                        ttx ttxVar = ttx.c;
                        dsx dsxVar = ((hux) ttxVar).b;
                        dui1 dui1VarS = byo1.s(dsxVar != null ? dsxVar.b : ((hux) ttxVar).a.b, x340Var3);
                        f2b f2bVar = new f2b(j7, 5);
                        boolean zG2 = x340Var3.g(n6a1Var);
                        Object objT3 = x340Var3.T();
                        if (zG2 || objT3 == m4cVar) {
                            z2 = false;
                            objT3 = new x9c(n6a1Var, (byte) 0);
                            x340Var3.s0(objT3);
                        } else {
                            z2 = false;
                        }
                        ed80VarZ = hso1.z(dui1VarS, f2bVar, (jmr0) objT3, false, x340Var3, 8, 8);
                        x340Var3.r(z2);
                        z = z2;
                    } else {
                        x340Var3.i0(-371770509);
                        float fA3 = hcxVar.a(x340Var3);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(hcxVar.a(x340Var3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fA3)) << 32);
                        boolean zG3 = x340Var3.g(n6a1Var) | x340Var3.f(jFloatToRawIntBits2);
                        Object objT4 = x340Var3.T();
                        if (zG3 || objT4 == m4cVar) {
                            objT4 = new i7x(n6a1Var, jFloatToRawIntBits2);
                            x340Var3.s0(objT4);
                        }
                        ed80VarZ = (i7x) objT4;
                        z = false;
                        x340Var3.r(false);
                    }
                }
                ed80 ed80Var2 = ed80VarZ;
                Uri uri = (Uri) obj4;
                Uri uri2 = !u890.j(uri, Uri.EMPTY) ? uri : null;
                if (uri2 == null) {
                    x340Var3.i0(-943736823);
                    x340Var3.r(z);
                } else {
                    x340Var3.i0(-943736822);
                    ed80 ed80VarA = oi7.a(uri2, (gw70) null, (xb10) null, (yqi1) null, ed80Var2, ed80Var2, false, false, mif1.P0, (iu30) null, (iu30) null, (iu30) null, j, x340Var3, 2359296, 6, 95134);
                    x340Var3.r(false);
                    ed80Var = ed80VarA;
                }
                ed80 ed80Var3 = ed80Var != null ? ed80Var : ed80Var2;
                float fA4 = s3v.a(j);
                cbx.a.getClass();
                eso1.h(ed80Var3, isl.a, (qim0) null, new p3v(fA4), (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, x340Var2, 24632, 452);
                return rih1Var;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                rte1 rte1Var = (rte1) obj6;
                rje1.c(rte1Var.a, this.b, b0kVar2, 0);
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarA = ((nw31) obj).a(1.0f, qim0Var2, true);
                String str2 = (String) obj5;
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                x340 x340Var4 = (x340) b0kVar2;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarA);
                hzj.A.getClass();
                x340 x340Var5 = (x340) b0kVar2;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                boolean z5 = x340Var5.S;
                Function0 function1 = hmb0.t1;
                if (z5) {
                    x340Var5.l(function1);
                } else {
                    x340Var5.v0();
                }
                vu30 vu30Var3 = y580.O0;
                nko1.H(mbhVarA, b0kVar2, vu30Var3);
                vu30 vu30Var4 = y580.N0;
                nko1.H(xos0VarM, b0kVar2, vu30Var4);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar);
                nko1.F(b0kVar2);
                llj lljVar2 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, lljVar2);
                String str3 = this.c;
                long j8 = this.b;
                if (str3 == null) {
                    x340Var5.i0(2023307531);
                    x340Var5.r(false);
                    j2 = j8;
                    vu30Var = vu30Var4;
                    x340Var = x340Var5;
                    b0kVar = b0kVar2;
                    function0 = function1;
                    f = 1.0f;
                    vu30Var2 = vu30Var3;
                    qim0Var = qim0Var2;
                } else {
                    x340Var5.i0(2023307532);
                    uwr uwrVar8 = cbx.a;
                    qim0Var = qim0Var2;
                    vu30Var = vu30Var4;
                    function0 = function1;
                    f = 1.0f;
                    b0kVar = b0kVar2;
                    vu30Var2 = vu30Var3;
                    x340Var = x340Var5;
                    uwo1.e(str3, null, cbx.d(b0kVar2).m, j8, null, null, 2, false, rje1.a, 0, null, b0kVar, 0, 0, 1714);
                    j2 = j8;
                    x340Var.r(false);
                }
                String str4 = rte1Var.d;
                uwr uwrVar9 = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar).k;
                long j9 = cbx.a(b0kVar).b.a;
                cjc0 cjc0Var = rje1.a;
                uwo1.e(str4, null, lee1Var, j9, null, null, 2, false, cjc0Var, 0, null, b0kVar, 0, 0, 1714);
                if (str2 == null) {
                    x340Var.i0(2023852263);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(2023852264);
                    lee1 lee1Var2 = cbx.d(b0kVar).j;
                    int iC = l1d.C(rte1Var.f);
                    if (iC != 0) {
                        if (iC == 1) {
                            x340Var.i0(-501706990);
                            j4 = cbx.a(b0kVar).b.b;
                            x340Var.r(false);
                        } else {
                            if (iC != 2) {
                                throw p3d1.k(x340Var, -501713143, false);
                            }
                            x340Var.i0(-501703117);
                            j4 = cbx.a(b0kVar).b.d;
                            x340Var.r(false);
                        }
                        j3 = j4;
                    } else {
                        x340Var.i0(-501710314);
                        x340Var.r(false);
                        j3 = j2;
                    }
                    uwo1.e(str2, null, lee1Var2, j3, null, null, 2, false, cjc0Var, 0, null, b0kVar, 0, 0, 1714);
                    z3 = false;
                    x340Var.r(false);
                }
                x340Var.r(true);
                lte1 lte1Var = rte1Var.h;
                if (lte1Var == null) {
                    x340Var.i0(-614454209);
                    x340Var.r(z3);
                } else {
                    x340Var.i0(-614454208);
                    Function0 function2 = (Function0) obj4;
                    qim0 qim0VarF = z4 ? u291.f(qim0Var, f) : qim0Var;
                    gfh0 gfh0VarC = t1c.c(een.i, z3);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar, qim0VarF);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar, vu30Var2);
                    nko1.H(xos0VarM2, b0kVar, vu30Var);
                    i3a.l(iHashCode2, b0kVar, lljVar, b0kVar);
                    nko1.H(qim0VarE2, b0kVar, lljVar2);
                    rje1.a(lte1Var, this.b, function2, b0kVar, 0);
                    x340Var.r(true);
                    x340Var.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcx(rte1 rte1Var, long j, String str, String str2, boolean z, Function0 function0) {
        super(3);
        this.e = rte1Var;
        this.b = j;
        this.c = str;
        this.f = str2;
        this.d = z;
        this.g = function0;
    }
}
