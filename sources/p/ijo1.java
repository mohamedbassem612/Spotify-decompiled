package p;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
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
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ijo1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static b180 b;

    public static String A(Context context) {
        try {
            return context.getResources().getResourcePackageName(2131954152);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final Boolean B(Resources resources, String str) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final void a(p9z0 p9z0Var, Function0 function0, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1972831906);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(p9z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            n(p9z0Var, null, x340Var, i2 & 14);
            boolean z = p9z0Var.f instanceof n9z0;
            bby bbyVarQ = xa4.q();
            era eraVar = een.P0;
            fq7.f(z, (qim0) null, bbyVarQ.a(xay.b(irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), eraVar, (iu30) null, 12)), xa4.r().a(xay.i(irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), eraVar, (iu30) null, 12)), (String) null, apo.r(-958715418, new r9z0(p9z0Var, function0, vu30Var, (byte) 0), x340Var), x340Var, 1572870, 18);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s9z0(p9z0Var, function0, vu30Var, i, (byte) 0);
        }
    }

    public static final void b(rph1 rph1Var, iu30 iu30Var, qim0 qim0Var, ptf1 ptf1Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(642235304);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(rph1Var) : x340Var.i(rph1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? x340Var.g(ptf1Var) : x340Var.i(ptf1Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 8190;
            x340Var.i0(-1793708788);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new y7e1((String) null, 3);
                x340Var.s0(objT);
            }
            y7e1 y7e1Var = (y7e1) objT;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(context, 2132017504, new ioh1(ptf1Var, y7e1Var, iu30Var), 2000, 0, 1);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                x340Var.s0(datePickerDialog);
                objT2 = datePickerDialog;
            }
            boolean zEquals = rph1Var.equals(qph1.a);
            boolean zEquals2 = rph1Var.equals(oph1.a);
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, apo.r(-1767327047, new hoh1(iu30Var, rph1Var.equals(pph1.a), y7e1Var, (byte) 0), x340Var), null, null, apo.r(-73140045, new gb7(zEquals, objT2, zEquals2, (Object) y7e1Var, (byte) 6), x340Var), x340Var, ((i4 >> 6) & 14) | 24624, 12);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, rph1Var, iu30Var, qim0Var2, ptf1Var, (byte) 14);
        }
    }

    public static final void c(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(717153776);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(0.0f, 16.0f, 1, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String strO0 = cwl1.o0(x340Var, 2131960772);
            if (z) {
                x340Var.i0(1770236088);
                lee1Var = cbx.d(x340Var).h;
                x340Var.r(false);
            } else {
                x340Var.i0(1770237620);
                lee1Var = cbx.d(x340Var).e;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
            uwo1.e(strO0, null, lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            mbh mbhVarA2 = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            pbh pbhVar = pbh.a;
            op71.g(x340Var, pbhVar.a(0.13200001f, qim0Var2, true));
            d(qim0Var2, x340Var, 6);
            op71.g(x340Var, pbhVar.a(1.0f, qim0Var2, true));
            x340Var.r(true);
            op71.g(x340Var, pbhVar.a(0.33999997f, qim0Var2, true));
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var2, i, (byte) 8);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(177268942);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qrx qrxVar = qrx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            w0h1.a(qrxVar, isl.a, u291.r(nim0Var, 64.0f), 0L, 0L, false, x340Var, qrx.d | 48, 56);
            uwo1.e(cwl1.o0(x340Var, 2131960761), uyn1.x(nim0Var, cbx.b(x340Var).b.c), cbx.d(x340Var).c, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            uwo1.e(cwl1.o0(x340Var, 2131960760), nim0Var, cbx.d(x340Var).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 48, 0, 2024);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 18);
        }
    }

    public static final void e(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1768509060);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 16384 : 8192;
        } else {
            qim0Var2 = qim0Var;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            woa woaVar = (woa) x340Var.k(q7f0.a);
            kma kmaVar = (kma) x340Var.k(q7f0.b);
            int i3 = i2 >> 9;
            ven0 ven0VarS = v8r.s(function1, x340Var);
            int i4 = i2 & 14;
            boolean zG = x340Var.g(woaVar) | x340Var.g(kmaVar) | (i4 == 4);
            Object objT = x340Var.T();
            Object obj = objT;
            if (zG || objT == m4cVar) {
                uoa uoaVarA = woa.a(woaVar, "premium-destination-visual-header", (o2u0) null, (w2k1) null, kmaVar, Collections.singletonList(new cv7(ven0VarS, (byte) 6)), false, (bas) null, (sn10) null, 998);
                uoaVarA.q(true);
                uoaVarA.p(2);
                x340Var.s0(uoaVarA);
                obj = uoaVarA;
            }
            uoa uoaVar = (uoa) obj;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new i030(ven0Var, (byte) 18);
                x340Var.s0(objT3);
            }
            ven0 ven0VarS2 = v8r.s(objT3, x340Var);
            boolean zI2 = x340Var.i(woaVar) | x340Var.i(uoaVar);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new m760(woaVar, uoaVar, (byte) 0);
                x340Var.s0(objT4);
            }
            qxd0.i(uoaVar, (iu30) objT4, x340Var);
            boolean zI3 = (i4 == 4) | x340Var.i(uoaVar);
            Object objT5 = x340Var.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new o760(uoaVar, str, (byte) 0);
                x340Var.s0(objT5);
            }
            qxd0.h(uoaVar, str, (iu30) objT5, x340Var);
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ven0Var.getValue();
            boolean zI4 = x340Var.i(ven0Var) | x340Var.i(uoaVar);
            Object objT6 = x340Var.T();
            if (zI4 || objT6 == m4cVar) {
                objT6 = new q760(ven0Var, uoaVar, (byte) 0);
                x340Var.s0(objT6);
            }
            qxd0.h(uoaVar, videoSurfaceView, (iu30) objT6, x340Var);
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT7);
            }
            ven0 ven0Var2 = (ven0) objT7;
            ven0 ven0VarS3 = v8r.s(Boolean.valueOf(z), x340Var);
            ven0 ven0VarS4 = v8r.s(function0, x340Var);
            boolean zI5 = x340Var.i(ven0Var2) | x340Var.i(uoaVar) | x340Var.i(ven0VarS3) | x340Var.i(iac0Var);
            Object objT8 = x340Var.T();
            if (zI5 || objT8 == m4cVar) {
                objT8 = new lhx(iac0Var, uoaVar, ven0Var2, ven0VarS3, (byte) 17);
                x340Var.s0(objT8);
            }
            qxd0.h(iac0Var, uoaVar, (iu30) objT8, x340Var);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI6 = x340Var.i(ven0Var2) | ((i2 & 112) == 32) | x340Var.i(uoaVar);
            Object objT9 = x340Var.T();
            if (zI6 || objT9 == m4cVar) {
                objT9 = new x060(z, uoaVar, ven0Var2, (lnm) null);
                x340Var.s0(objT9);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT9);
            boolean zI7 = x340Var.i(ven0VarS4) | x340Var.i(ven0VarS2);
            Object objT10 = x340Var.T();
            if (zI7 || objT10 == m4cVar) {
                objT10 = new xs3(ven0VarS4, ven0VarS2, (byte) 7);
                x340Var.s0(objT10);
            }
            iu30 iu30Var = (iu30) objT10;
            boolean zI8 = x340Var.i(ven0Var);
            Object objT11 = x340Var.T();
            if (zI8 || objT11 == m4cVar) {
                objT11 = new i030(ven0Var, (byte) 15);
                x340Var.s0(objT11);
            }
            iu30 iu30Var2 = (iu30) objT11;
            boolean zI9 = x340Var.i(ven0Var);
            Object objT12 = x340Var.T();
            if (zI9 || objT12 == m4cVar) {
                objT12 = new i030(ven0Var, (byte) 16);
                x340Var.s0(objT12);
            }
            iu30 iu30Var3 = (iu30) objT12;
            boolean zI10 = x340Var.i(ven0Var);
            Object objT13 = x340Var.T();
            if (zI10 || objT13 == m4cVar) {
                objT13 = new i030(ven0Var, (byte) 17);
                x340Var.s0(objT13);
            }
            dm5.b(iu30Var, qim0Var2, iu30Var2, iu30Var3, (iu30) objT13, x340Var, i3 & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((Object) str, z, (Object) function0, (Object) function1, (Object) qim0Var, i, (byte) 15);
        }
    }

    public static final void f(List list, String str, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-235550383);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= x340Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new LinkedHashSet();
                x340Var.s0(objT);
            }
            Set set = (Set) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uvx uvxVar = new uvx(0, (pgx) null, 0, new zzq0(0.0f, 8.0f, 0.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zI = ((i3 & 896) == 256) | x340Var.i(list) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                tjf0 tjf0Var = new tjf0(list, vu30Var, vu30Var2, set, str2, (byte) 6);
                x340Var.s0(tjf0Var);
                objT2 = tjf0Var;
            }
            j2h1.d(qim0Var, (xtb0) null, uvxVar, 0, zzq0Var, (g36) null, (iu30) objT2, x340Var, ((i3 >> 12) & 14) | 512, 106);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(list, str, vu30Var, vu30Var2, qim0Var, i, (byte) 10);
        }
    }

    public static final void g(p9z0 p9z0Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1262037167);
        int i2 = i | (x340Var2.g(p9z0Var) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16) | (x340Var2.i(vu30Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            String strX = x(p9z0Var, x340Var2);
            String str = p9z0Var.a;
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            if (strX.length() > 0) {
                x340Var2.i0(733028965);
                i(0, strX, x340Var2, null);
                x340Var2.r(false);
            } else {
                x340Var2.i0(733030968);
                j(0, str, x340Var2, null);
                x340Var2.r(false);
            }
            if (vu30Var == null) {
                x340Var2.i0(1249193651);
                x340Var2.r(false);
                x340Var = x340Var2;
                z = true;
            } else {
                x340Var2.i0(1249193652);
                String strO0 = cwl1.o0(x340Var2, 2131960795);
                Object objT = x340Var2.T();
                if (objT == fkj0.X) {
                    objT = ucy0.e1;
                    x340Var2.s0(objT);
                }
                uwo1.e(strO0, s161.a(nim0.a, (iu30) objT), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                x340Var = x340Var2;
                us71.j(0, vu30Var, x340Var, false);
                z = true;
            }
            x340Var.r(z);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t9z0(p9z0Var, qim0Var, vu30Var, i, (byte) 0);
        }
    }

    public static final void h(int i, int i2, int i3, long j, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1484652410);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            x340Var.d0();
            if ((i3 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            String strN0 = cwl1.n0(2131957047, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, x340Var);
            uwr uwrVar = cbx.a;
            uwo1.e(strN0, qim0Var, cbx.d(x340Var).h, j, new a0e1(6), null, 0, false, null, 0, null, x340Var, ((i4 >> 3) & 112) | (i4 & 7168), 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wur0(i, i2, i3, j, qim0Var);
        }
    }

    public static final void i(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(67723827);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strN0 = cwl1.n0(2131960796, new Object[]{str}, x340Var);
            ye5 ye5VarO = kk0.o(658094596, x340Var);
            uwr uwrVar = cbx.a;
            int iO = ye5VarO.o(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5VarO.g(strN0);
                ye5VarO.k(iO);
                int iW0 = ihc1.w0(strN0, str, 0, false, 6);
                if (iW0 != -1) {
                    x340Var.i0(-1838060119);
                    ye5VarO.d(new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), iW0, str.length() + iW0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1837964980);
                    x340Var.r(false);
                }
                af5 af5VarP = ye5VarO.p();
                x340Var.r(false);
                lee1 lee1Var = cbx.d(x340Var).j;
                qim0Var2 = nim0.a;
                uwo1.f(af5VarP, qim0Var2, lee1Var, null, null, null, 0, false, null, 0, null, null, x340Var, 48, 0, 4088);
            } catch (Throwable th) {
                ye5VarO.k(iO);
                throw th;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 17);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-521481611);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(1367349053);
            String strO0 = str.length() == 0 ? cwl1.o0(x340Var, 2131960771) : str;
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            qim0Var2 = nim0.a;
            uwo1.e(strO0, qim0Var2, lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 18);
        }
    }

    public static final void k(p9z0 p9z0Var, Function0 function0, jtl1 jtl1Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1513481491);
        int i2 = i | (x340Var.g(p9z0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(jtl1Var) ? 256 : 128) | 3072 | (x340Var.i(vu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (((Boolean) f4p1.j(new x6a(jtl1Var.b, (byte) 2), Boolean.FALSE, (iac0) null, x340Var, 48, 14).getValue()).booleanValue()) {
                x340Var.i0(439975456);
                a(p9z0Var, function0, vu30Var, x340Var, ((i2 >> 3) & 7168) | (i2 & 126) | 384);
                x340Var.r(false);
            } else {
                x340Var.i0(440129216);
                l(p9z0Var, function0, vu30Var, x340Var, ((i2 >> 3) & 7168) | (i2 & 126) | 384);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(p9z0Var, function0, jtl1Var, qim0Var2, vu30Var, i, (byte) 1);
        }
    }

    public static final void l(p9z0 p9z0Var, Function0 function0, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1111015095);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(p9z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f);
            mbh mbhVarA = jbh.a(new d36(2.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            n(p9z0Var, null, x340Var, i2 & 14);
            fq7.b(pbh.a, p9z0Var.f instanceof n9z0, (qim0) null, xa4.q().a(xay.d(irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), een.Z, 12)), xa4.r().a(xay.l(12, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6))), (String) null, apo.r(-1938300869, new r9z0(p9z0Var, function0, vu30Var, (byte) 1), x340Var), x340Var, 1572870, 18);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s9z0(p9z0Var, function0, vu30Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void m(p3v p3vVar, float f, float f2, b0k b0kVar, int i, int i2) {
        float f3;
        int i3;
        boolean z;
        float f4;
        h311 h311VarV;
        float f5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(651532924);
        int i4 = i | (x340Var.g(p3vVar) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f3 = f2;
            int i5 = x340Var.d(f3) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if ((i2 & 4) != 0) {
                        f5 = 0.0f;
                    }
                    x340Var.s();
                    qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var).a.b.a();
                    cua cuaVar = cbx.b(x340Var).f;
                    t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                    f4 = f5;
                } else {
                    x340Var.b0();
                    int i6 = i2 & 4;
                }
                f5 = f3;
                x340Var.s();
                qim0 qim0VarB2 = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                long jA2 = cbx.a(x340Var).a.b.a();
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(cwl1.l0(dug.f(qim0VarB2, jA2, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                f4 = f5;
            } else {
                x340Var.b0();
                f4 = f3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xky(p3vVar, f, f4, i, i2, (byte) 2);
            }
        }
        f3 = f2;
        i3 = i4 | i5;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    f5 = 0.0f;
                } else {
                    f5 = f3;
                }
            } else if ((i2 & 4) != 0) {
                f5 = 0.0f;
            } else {
                f5 = f3;
            }
            x340Var.s();
            qim0 qim0VarB3 = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
            uwr uwrVar3 = cbx.a;
            long jA3 = cbx.a(x340Var).a.b.a();
            cua cuaVar3 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB3, jA3, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f4 = f5;
        } else {
            x340Var.b0();
            f4 = f3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xky(p3vVar, f, f4, i, i2, (byte) 2);
        }
    }

    public static final void n(p9z0 p9z0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        o9z0 o9z0Var = p9z0Var.f;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1779896214);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(p9z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var2.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var2);
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
            boolean z = o9z0Var instanceof o9z0;
            Boolean boolValueOf = Boolean.valueOf(z);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v9z0.b;
                x340Var2.s0(objT);
            }
            hm5.a(boolValueOf, (qim0) null, (iu30) objT, (tl3) null, (String) null, (iu30) null, apo.r(34678013, new ixt0(p9z0Var, (byte) 25), x340Var2), x340Var2, 1573248, 58);
            o9z0 o9z0Var2 = z ? o9z0Var : null;
            int i4 = o9z0Var2 != null ? o9z0Var2.d : 0;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Integer.valueOf(i4));
                x340Var2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            if (i4 > 0) {
                ven0Var.setValue(Integer.valueOf(i4));
            }
            fq7.f(i4 > 0, (qim0) null, xa4.q(), xa4.r(), (String) null, apo.r(1467236050, new hho0(p9z0Var, ((Resources) x340Var2.k(AndroidCompositionLocals_androidKt.c)).getQuantityString(2131820768, ((Number) ven0Var.getValue()).intValue(), Integer.valueOf(((Number) ven0Var.getValue()).intValue())), ven0Var, (byte) 12), x340Var2), x340Var2, 1572870, 18);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) p9z0Var, (Object) qim0Var2, i, (byte) 28);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final void o(p9z0 p9z0Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        ?? r2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(548393271);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(p9z0Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strX = x(p9z0Var, x340Var);
            String str = p9z0Var.a;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(2.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarN = e9k.n(62, nim0.a);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (strX.length() > 0) {
                x340Var.i0(-386732863);
                r2 = 0;
                i(0, strX, x340Var, null);
                x340Var.r(false);
            } else {
                r2 = 0;
                x340Var.i0(-386730796);
                j(0, str, x340Var, null);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (vu30Var == null) {
                x340Var.i0(98110032);
            } else {
                c13.o(x340Var, 98110033, r2, vu30Var, x340Var);
            }
            x340Var.r((boolean) r2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t9z0(p9z0Var, qim0Var, vu30Var, i, (byte) 1);
        }
    }

    public static final boolean p(ly51 ly51Var, int i) {
        List list = ly51Var.d;
        List list2 = ly51Var.e;
        if ((list.get(i) instanceof sv31) && !list2.contains(Integer.valueOf(i)) && list2.size() < ly51Var.h) {
            Iterator it = list2.iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((sv31) list.get(((Number) it.next()).intValue())).c.length();
            }
            if (((sv31) list.get(i)).c.length() + length < ly51Var.i) {
                return true;
            }
        }
        return false;
    }

    public static void q(long j, izr0 izr0Var, gtf1[] gtf1VarArr) {
        int i;
        int iE;
        while (true) {
            if (izr0Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (izr0Var.a() == 0) {
                    i = -1;
                    break;
                }
                int iE2 = izr0Var.E();
                i2 += iE2;
                if (iE2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (izr0Var.a() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iE = izr0Var.E();
                    i3 += iE;
                }
            } while (iE == 255);
            int i4 = izr0Var.b + i3;
            if (i3 == -1 || i3 > izr0Var.a()) {
                oon1.H("Skipping remainder of malformed SEI NAL unit.");
                i4 = izr0Var.c;
            } else if (i == 4 && i3 >= 8) {
                int iE3 = izr0Var.E();
                int iL = izr0Var.L();
                int iQ = iL == 49 ? izr0Var.q() : 0;
                int iE4 = izr0Var.E();
                if (iL == 47) {
                    izr0Var.S(1);
                }
                boolean z = iE3 == 181 && (iL == 49 || iL == 47) && iE4 == 3;
                if (iL == 49) {
                    z &= iQ == 1195456820;
                }
                if (z) {
                    r(j, izr0Var, gtf1VarArr);
                }
            }
            izr0Var.R(i4);
        }
    }

    public static void r(long j, izr0 izr0Var, gtf1[] gtf1VarArr) {
        int iE = izr0Var.E();
        if ((iE & 64) != 0) {
            izr0Var.S(1);
            int i = (iE & 31) * 3;
            int i2 = izr0Var.b;
            for (gtf1 gtf1Var : gtf1VarArr) {
                izr0Var.R(i2);
                gtf1Var.f(i, izr0Var);
                dm5.y(j != -9223372036854775807L);
                gtf1Var.b(j, 1, i, 0, (ftf1) null);
            }
        }
    }

    public static final long s(float f, int i, long j, boolean z) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && hjl.e(j)) ? hjl.i(j) : Integer.MAX_VALUE;
        if (hjl.k(j) != i2) {
            i2 = yoi1.p(r2p1.h(f), hjl.k(j), i2);
        }
        return m5n1.v(0, i2, 0, hjl.h(j));
    }

    public static final int t(int i, int i2, boolean z) {
        if ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) {
            return i2;
        }
        return 1;
    }

    public static final Set u(ly51 ly51Var) {
        List list = ly51Var.e;
        List list2 = ly51Var.d;
        if (list.isEmpty()) {
            return w7x.a;
        }
        HashSet hashSet = new HashSet();
        List list3 = list;
        Iterator it = list3.iterator();
        Integer numValueOf = null;
        if (!it.hasNext()) {
            hhg1.k();
            return null;
        }
        int iIntValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        int i = iIntValue - 1;
        while (i >= 0 && !(list2.get(i) instanceof sv31)) {
            i--;
        }
        Integer numValueOf2 = (i < 0 || !p(ly51Var, i)) ? null : Integer.valueOf(i);
        if (numValueOf2 != null) {
            hashSet.add(Integer.valueOf(numValueOf2.intValue()));
        }
        Iterator it2 = list3.iterator();
        if (!it2.hasNext()) {
            hhg1.k();
            return null;
        }
        int iIntValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int iIntValue4 = ((Number) it2.next()).intValue();
            if (iIntValue3 < iIntValue4) {
                iIntValue3 = iIntValue4;
            }
        }
        do {
            iIntValue3++;
            if (iIntValue3 >= list2.size()) {
                break;
            }
        } while (!(list2.get(iIntValue3) instanceof sv31));
        if (iIntValue3 < list2.size() && p(ly51Var, iIntValue3)) {
            numValueOf = Integer.valueOf(iIntValue3);
        }
        if (numValueOf != null) {
            hashSet.add(Integer.valueOf(numValueOf.intValue()));
        }
        return hashSet;
    }

    public static final boolean v(ly51 ly51Var) {
        List list = ly51Var.e;
        if (list.size() >= ly51Var.h) {
            return true;
        }
        return u(ly51Var).isEmpty() && !list.isEmpty();
    }

    public static Integer w(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                return str.equals("REPEAT_ALL_AND_SHUFFLE") ? 3 : null;
            case -962896020:
                return str.equals("REPEAT_SINGLE") ? 2 : null;
            case 1645938909:
                return str.equals("REPEAT_ALL") ? 1 : null;
            case 1645952171:
                return str.equals("REPEAT_OFF") ? 0 : null;
            default:
                return null;
        }
    }

    public static final String x(p9z0 p9z0Var, b0k b0kVar) {
        if (p9z0Var.g) {
            x340 x340Var = (x340) b0kVar;
            return x0d.k(x340Var, 2122039016, 2131960794, x340Var, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(2122041270);
        x340Var2.r(false);
        return p9z0Var.b;
    }

    public static final int y(pvc0 pvc0Var) {
        String str = (String) pvc0Var.f.get("record_count");
        Integer numC0 = str != null ? nhc1.c0(str) : null;
        if (numC0 != null) {
            return numC0.intValue();
        }
        return 0;
    }

    public static final znb0 z(String str, ubw0 ubw0Var, iu30 iu30Var, x340 x340Var) {
        boolean zG = x340Var.g(str) | x340Var.g(ubw0Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new idd1(new c3n((byte) 0, ubw0Var, iu30Var));
            x340Var.s0(objT);
        }
        return (znb0) objT;
    }
}
