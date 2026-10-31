package p;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
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
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pdp1 {
    public static b180 a;
    public static b180 b;

    public static final void a(mwq0 mwq0Var, bab1 bab1Var, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1743296795);
        int i2 = (x340Var.i(mwq0Var) ? 4 : 2) | i | (x340Var.i(bab1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zA = mwq0Var.a();
            boolean zI = x340Var.i(mwq0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ka2(mwq0Var, (byte) 1);
                x340Var.s0(objT);
            }
            q3p1.b(0, 0, (Function0) objT, x340Var, zA);
            fdg1.k(mwq0Var, j2iVar, (qim0) null, apo.r(-1093627201, new n2(bab1Var, j2iVar2, (byte) 20), x340Var), x340Var, (i2 & 14) | 3120, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) mwq0Var, (Object) bab1Var, (Object) j2iVar, (Object) j2iVar2, (byte) 18);
        }
    }

    public static final void b(Object obj, qim0 qim0Var, j6m j6mVar, b0k b0kVar, int i, int i2) {
        rf01 rf01Var;
        rf01 rf01Var2;
        if ((i2 & 64) != 0) {
            j6mVar = mif1.Q0;
        }
        j6m j6mVar2 = j6mVar;
        x340 x340Var = (x340) b0kVar;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        AtomicReference atomicReference = y191.a;
        Object obj2 = atomicReference.get();
        rf01 rf01VarA = null;
        rf01 rf01Var3 = obj2 instanceof rf01 ? (rf01) obj2 : null;
        if (rf01Var3 == null) {
            loop0: while (true) {
                Object obj3 = atomicReference.get();
                if (obj3 instanceof rf01) {
                    rf01Var2 = rf01VarA;
                    rf01VarA = (rf01) obj3;
                } else {
                    if (rf01VarA == null) {
                        context.getApplicationContext();
                        jc10 jc10Var = a291.a;
                        rf01VarA = z191.a(context);
                    }
                    rf01Var2 = rf01VarA;
                }
                do {
                    if (atomicReference.compareAndSet(obj3, rf01VarA)) {
                        break loop0;
                    }
                } while (atomicReference.get() == obj3);
                rf01VarA = rf01Var2;
            }
            rf01Var = rf01VarA;
        } else {
            rf01Var = rf01Var3;
        }
        int i3 = i << 3;
        dm5.d(obj, (String) null, rf01Var, qim0Var, j6mVar2, x340Var, (i & 126) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | (234881024 & i3) | (i3 & 1879048192), (i >> 27) & 14, 0);
    }

    public static final void c(aua auaVar, iu30 iu30Var, ffe1 ffe1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2011852827);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(auaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(ffe1Var) : x340Var.i(ffe1Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            irn1.u(null, null, null, null, apo.r(1128742466, new n891(auaVar, iu30Var, ffe1Var), x340Var), x340Var, 24576, 15);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa((byte) 1, i, auaVar, ffe1Var, iu30Var, qim0Var2);
        }
    }

    public static final void d(aua auaVar, iu30 iu30Var, ffe1 ffe1Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        int i3;
        qim0 qim0VarW;
        x340 x340Var;
        byte b2;
        int i4;
        boolean z;
        boolean z2;
        m4c m4cVar = fkj0.X;
        String str = auaVar.l;
        String str2 = auaVar.j;
        String str3 = auaVar.e;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1048369972);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(auaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var2.g(ffe1Var) : x340Var2.i(ffe1Var) ? 256 : 128;
        }
        int i5 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i5 == 0) {
            i2 |= x340Var2.i(nim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(vzq0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            if (auaVar.r) {
                x340Var2.i0(1012608533);
                i3 = 0;
                qim0 qim0VarE = d1u.E(1.0f, u7h.g, uyn1.w(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var2), false, 14), vzq0Var), d4o1.a);
                x340Var2.r(false);
                qim0VarW = qim0VarE;
            } else {
                i3 = 0;
                x340Var2.i0(1012771934);
                qim0VarW = uyn1.w(l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var2), false, 14), vzq0Var);
                x340Var2.r(false);
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, i3);
            qim0 qim0Var = qim0VarW;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE2, x340Var2, y580.Y);
            int i6 = i2;
            String str4 = auaVar.a;
            long jE = z4p1.e(Color.parseColor(auaVar.b));
            String str5 = auaVar.c;
            qim0 qim0VarN = anm1.N("PlanRow", nim0Var);
            int i7 = i6 & 112;
            boolean z3 = i7 == 32;
            Object objT = x340Var2.T();
            if (z3 || objT == m4cVar) {
                objT = new nc8(iu30Var, (byte) 13);
                x340Var2.s0(objT);
            }
            tgp1.b(str4, jE, str5, qim0VarN, (Function0) objT, x340Var2, 0);
            ye5 ye5Var = new ye5();
            ye5Var.g(auaVar.g);
            if (!ihc1.y0(str3)) {
                ye5Var.g(" · ");
                try {
                    ye5Var.o(new zma1(z4p1.e(Color.parseColor(auaVar.f)), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    ye5Var.g(str3);
                    ye5Var.j();
                } catch (NoSuchMethodError unused) {
                    ye5Var.g(str3);
                }
            }
            af5 af5VarP = ye5Var.p();
            String str6 = auaVar.d;
            int i8 = i6 & 896;
            boolean z4 = i8 == 256 || ((i6 & 512) != 0 && x340Var2.i(ffe1Var));
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new fua(ffe1Var, (byte) 0);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(str6)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            jto1.b(anm1.N("PaymentRow", nim0Var), null, null, false, null, null, new gbx(new y50(str6), function0), null, null, null, null, apo.r(-2097992242, new pf1(af5VarP, (byte) 3), x340Var2), null, null, null, apo.r(1742533074, new eua(auaVar, (byte) 4), x340Var2), x340Var2, 0, 196656, 30654);
            String str7 = auaVar.h;
            boolean z5 = i8 == 256 || ((i6 & 512) != 0 && x340Var2.i(ffe1Var));
            Object objT3 = x340Var2.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new fua(ffe1Var, (byte) 1);
                x340Var2.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            if (ihc1.y0(str7)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            jto1.b(anm1.N("PriceRow", nim0Var), null, null, false, null, null, new gbx(new y50(str7), function1), null, null, null, null, apo.r(-273852745, new eua(auaVar, (byte) 5), x340Var2), null, null, null, apo.r(1094068667, new eua(auaVar, (byte) 6), x340Var2), x340Var2, 0, 196656, 30654);
            if (ihc1.y0(str2)) {
                x340Var = x340Var2;
                b2 = 2;
                x340Var.i0(-1209471316);
                x340Var.r(false);
            } else {
                x340Var.i0(-1209778061);
                if (i8 == 256 || ((i6 & 512) != 0 && x340Var.i(ffe1Var))) {
                    x340Var = x340Var2;
                    x340Var = x340Var2;
                    z2 = true;
                } else {
                    x340Var = x340Var2;
                    x340Var = x340Var2;
                    z2 = false;
                }
                Object objT4 = x340Var.T();
                if (z2 || objT4 == m4cVar) {
                    b2 = 2;
                    objT4 = new fua(ffe1Var, (byte) 2);
                    x340Var.s0(objT4);
                } else {
                    b2 = 2;
                }
                Function0 function2 = (Function0) objT4;
                if (ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    jto1.b(anm1.N("DateRow", nim0Var), null, null, false, null, null, new gbx(new y50(str2), function2), null, null, null, null, apo.r(-898119149, new eua(auaVar, (byte) 7), x340Var), null, null, null, apo.r(-863020777, new eua(auaVar, (byte) 0), x340Var), x340Var, 0, 196656, 30654);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            }
            hr80.d(uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 16.0f, 5), 2.0f, f5p1.k(x340Var, 2131100250), x340Var, 0, 0);
            if (ihc1.y0(str)) {
                iu30Var2 = iu30Var;
                i4 = 32;
                z = false;
                x340Var.i0(-1208894964);
                x340Var.r(false);
            } else {
                x340Var.i0(-1209196904);
                i4 = 32;
                boolean z6 = i7 == 32;
                Object objT5 = x340Var.T();
                if (z6 || objT5 == m4cVar) {
                    iu30Var2 = iu30Var;
                    objT5 = new nc8(iu30Var2, (byte) 14);
                    x340Var.s0(objT5);
                } else {
                    iu30Var2 = iu30Var;
                }
                Function0 function3 = (Function0) objT5;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                x340 x340Var3 = x340Var;
                jto1.b(anm1.N("ReceiptsRow", nim0Var), null, null, false, null, null, new gbx(new y50(str), function3), null, null, null, null, apo.r(1752954300, new eua(auaVar, (byte) 1), x340Var), null, null, null, apo.r(1122751424, new eua(auaVar, b2), x340Var), x340Var3, 0, 196656, 30654);
                x340Var = x340Var3;
                z = false;
                x340Var.r(false);
            }
            String str8 = auaVar.p;
            boolean z7 = i7 == i4 ? true : z;
            Object objT6 = x340Var.T();
            if (z7 || objT6 == m4cVar) {
                objT6 = new c5a(iu30Var2, (byte) 6);
                x340Var.s0(objT6);
            }
            af5 af5VarB = xxq0.b(str8, (iu30) objT6);
            String str9 = auaVar.o;
            boolean z8 = i7 == i4 ? true : z;
            Object objT7 = x340Var.T();
            if (z8 || objT7 == m4cVar) {
                objT7 = new nc8(iu30Var2, (byte) 15);
                x340Var.s0(objT7);
            }
            Function0 function4 = (Function0) objT7;
            if (ihc1.y0(str9)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            x340 x340Var4 = x340Var;
            jto1.b(anm1.N("HelpRow", nim0Var), null, null, false, null, null, new gbx(new y50(str9), function4), null, null, null, null, apo.r(627215190, new pf1(af5VarB, b2), x340Var), null, null, null, apo.r(1995136602, new eua(auaVar, (byte) 3), x340Var), x340Var4, 0, 196656, 30654);
            x340Var2 = x340Var4;
            x340Var2.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var2.b0();
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(auaVar, iu30Var2, ffe1Var, vzq0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void e(String str, String str2, wpo1 wpo1Var, boolean z, Function0 function0, b0k b0kVar, int i, int i2) {
        wpo1 wpo1Var2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        wpo1 wpo1Var3;
        boolean z4;
        h311 h311VarV;
        wpo1 wpo1Var4;
        boolean z5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(662764277);
        int i6 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | 384;
            wpo1Var2 = wpo1Var;
        } else {
            wpo1Var2 = wpo1Var;
            i3 = i6 | (x340Var.g(wpo1Var2) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 2048 : 1024;
            }
            if (x340Var.i(function0)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i5 = i3 | i4;
            if ((i5 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i5 & 1, z3)) {
                if (i7 != 0) {
                    wpo1Var4 = fpc1.c;
                } else {
                    wpo1Var4 = wpo1Var2;
                }
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                irn1.u(null, apo.r(-1446703134, new ie1(z5, function0, (byte) 5), x340Var), null, null, apo.r(646677596, new k8((Object) str, (Object) wpo1Var4, (Object) function0, (Object) str2, (byte) 24), x340Var), x340Var, 24624, 13);
                wpo1Var3 = wpo1Var4;
                z4 = z5;
            } else {
                x340Var.b0();
                wpo1Var3 = wpo1Var2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new aat(str, str2, wpo1Var3, z4, function0, i, i2);
            }
        }
        i3 |= 3072;
        z2 = z;
        if (x340Var.i(function0)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        i5 = i3 | i4;
        if ((i5 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i5 & 1, z3)) {
            if (i7 != 0) {
                wpo1Var4 = fpc1.c;
            } else {
                wpo1Var4 = wpo1Var2;
            }
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            irn1.u(null, apo.r(-1446703134, new ie1(z5, function0, (byte) 5), x340Var), null, null, apo.r(646677596, new k8((Object) str, (Object) wpo1Var4, (Object) function0, (Object) str2, (byte) 24), x340Var), x340Var, 24624, 13);
            wpo1Var3 = wpo1Var4;
            z4 = z5;
        } else {
            x340Var.b0();
            wpo1Var3 = wpo1Var2;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new aat(str, str2, wpo1Var3, z4, function0, i, i2);
        }
    }

    public static final void f(boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1074168660);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.c(x340Var).b.d;
            ngv ngvVar = ngv.d;
            z2 = z;
            j2iVar2 = j2iVar;
            fq7.g(z2, (qim0) null, xay.e(2, irn1.o0(jfv.t(j, ngvVar), 0, ((jhx) cbx.c(x340Var).a.b).b, 2)), xay.f(2, irn1.o0(jfv.t(cbx.c(x340Var).b.d, ngvVar), 0, ((jhx) cbx.c(x340Var).a.c).b, 2)), (String) null, j2iVar2, x340Var, (i2 & 14) | ((i2 << 12) & 458752), 18);
        } else {
            z2 = z;
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new db7(z2, j2iVar2, i);
        }
    }

    public static final void g(List list, String str, long j, nr21 nr21Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        float f;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1660597415);
        j06 j06Var = x340Var2.a;
        long j2 = j;
        int i2 = i | (x340Var2.i(list) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.f(j2) ? 256 : 128) | (x340Var2.i(nr21Var) ? 2048 : 1024) | (x340Var2.h(z) ? 16384 : 8192) | (x340Var2.i(iu30Var) ? 131072 : 65536);
        if (x340Var2.Y(i2 & 1, (74899 & i2) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            x340Var2.i0(1675621161);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                fr21 fr21Var = (fr21) obj;
                y3o1.k((!z || nr21Var == null) ? null : new sqk0(new jpk0(nr21Var.b(1)), Integer.valueOf(i3), fr21Var.a, (byte) 0), null, apo.r(2035794939, new qi6((Object) fr21Var, j2, (Object) iu30Var, (byte) 14), x340Var2), x340Var2, 384);
                j2 = j;
                i3 = i4;
            }
            x340Var2.r(false);
            x340Var2.r(true);
            if (list.isEmpty()) {
                x340Var2.i0(-425269707);
                String strO0 = cwl1.o0(x340Var2, 2131961291);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strO0, null, null, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2038);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                x340Var.i0(-298291751);
                uwr uwrVar3 = cbx.a;
                long j3 = cbx.a(x340Var).b.b;
                qim0 qim0VarN = anm1.N("reserved_onboarding_shows_subtitle", nim0Var);
                if (list.size() < 3) {
                    x340Var.i0(-425255958);
                    f = cbx.b(x340Var).b.b;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-425254166);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    x340Var.r(false);
                    f = 12.0f;
                }
                uwo1.e(str, uyn1.B(qim0VarN, 0.0f, f, 0.0f, 0.0f, 13), null, j3, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2036);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sr21(list, str, j, nr21Var, z, iu30Var, i);
        }
    }

    public static final Set h(mlv0 mlv0Var) {
        return f46.S0(new Object[]{mlv0Var.e(), mlv0Var.g(), mlv0Var.b(), mlv0Var.d()});
    }

    public static void i(String str, Object obj, String str2) {
        if (Log.isLoggable(m(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void j(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m(str), 3)) {
            String.format(str2, objArr);
        }
    }

    public static void k(String str) {
        Log.isLoggable(m(str), 6);
    }

    public static d4e0 l(r6h1 r6h1Var) {
        return new d4e0(r6h1Var, (byte) 15);
    }

    public static String m(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static void n(String str, Serializable serializable) {
        if (Log.isLoggable(m("CctTransportBackend"), 4)) {
            String.format(str, serializable);
        }
    }

    public static final boolean o(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size() || !bundle.keySet().containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!o((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (!u890.j(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    public static float p(float f, float[] fArr) {
        if (fArr.length == 0) {
            return 0.0f;
        }
        return fArr[yoi1.p((int) ((fArr.length - 1) * f), 0, fArr.length - 1)];
    }

    public static boolean q(au4 au4Var) {
        return au4Var.a();
    }

    public static final b6r0 r(kvn0 kvn0Var, o7r0 o7r0Var, dg0 dg0Var, kly0 kly0Var, x340 x340Var) {
        dg30 dg30Var = (dg30) x340Var.k(mce0.a);
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        q7r0 q7r0VarG = cir0Var.g();
        boolean zG = x340Var.g(kvn0Var) | x340Var.g(o7r0Var) | x340Var.g(dg0Var) | x340Var.g(dg30Var) | x340Var.g(cir0Var) | x340Var.g(q7r0VarG) | x340Var.g(kly0Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            qe41 qe41VarD = cir0Var.d();
            q01 q01Var = new q01(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8);
            mr30 mr30Var = new mr30(dg30Var, false);
            Observable observableA = dg0Var.a(dg30Var);
            pa2 pa2Var = new pa2((byte) 0);
            b6r0 b6r0Var = new b6r0(dg30Var, qe41VarD, o7r0Var, mr30Var, (wbr0) null, (sbr0) null, new qa2(q7r0VarG, (byte) 0), s5o0.a, observableA, Observable.just(Boolean.TRUE), pa2Var, kvn0Var, q01Var, 240);
            x340Var.s0(b6r0Var);
            objT = b6r0Var;
        }
        return (b6r0) objT;
    }

    public static final o1v s(xwp0 xwp0Var) {
        if (xwp0Var.equals(rwp0.a) || xwp0Var.equals(pwp0.a)) {
            return o1v.a;
        }
        if (xwp0Var.equals(hwp0.a) || xwp0Var.equals(twp0.a)) {
            return o1v.d;
        }
        if (xwp0Var instanceof jwp0) {
            return o1v.c;
        }
        if ((xwp0Var instanceof vwp0) || xwp0Var.equals(nwp0.a)) {
            return o1v.b;
        }
        if (xwp0Var.equals(lwp0.a)) {
            return o1v.e;
        }
        eg.o();
        return null;
    }
}
