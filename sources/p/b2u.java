package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.Annotation;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
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
import com.spotify.extendedmetadata.extensions.concertimpl.proto.ConcertTimes;
import com.spotify.extendedmetadata.extensions.concertimpl.proto.DateWithOffset;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class b2u {
    public static final j2i a = new j2i(1890101041, new dh((byte) 9), false);
    public static b180 b;
    public static b180 c;

    public static final void a(ArrayList arrayList, String str, String str2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1424203403);
        int i2 = (x340Var.g(arrayList) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zIsEmpty = arrayList.isEmpty();
            qim0 qim0Var3 = nim0.a;
            if (zIsEmpty) {
                x340Var.i0(1538542796);
                d(qim0Var3, x340Var, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(1538582941);
                b(arrayList, str, str2, x340Var, i2 & 8190);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(arrayList, str, str2, qim0Var2, i, (byte) 26);
        }
    }

    public static final void b(ArrayList arrayList, String str, String str2, b0k b0kVar, int i) {
        int i2;
        int i3;
        boolean z;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1677573863);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        int i4 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i2 |= x340Var.g(nim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131952154);
            int i5 = i2 & 14;
            int i6 = i2 & 896;
            boolean zG = ((i2 & 112) == 32) | (i5 == 4) | (i6 == 256) | x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                ye5 ye5Var = new ye5();
                Iterator it = arrayList.iterator();
                int i7 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    StringBuilder sb = ye5Var.a;
                    if (!zHasNext) {
                        i3 = i2;
                        if (str2.length() > 0) {
                            ye5Var.g(" • ");
                            sb.append((char) 8296);
                            ye5Var.g(str2);
                            sb.append((char) 8297);
                        }
                        objT = ye5Var.p();
                        x340Var.s0(objT);
                        break;
                    }
                    Object next = it.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        p7h.T();
                        throw null;
                    }
                    n13 n13Var = (n13) next;
                    if (i7 > 0) {
                        ye5Var.g(str.concat(" "));
                    }
                    String str3 = n13Var.a;
                    int i9 = i2;
                    sb.append((char) 8296);
                    ye5Var.g(str3);
                    sb.append((char) 8297);
                    if (n13Var.b) {
                        z6p1.r(ye5Var, "ai_persona_badge", strO0);
                    }
                    i2 = i9;
                    i7 = i8;
                }
            } else {
                i3 = i2;
            }
            af5 af5Var = (af5) objT;
            boolean zG2 = (i5 == 4) | (i6 == 256) | x340Var.g(strO0);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    n13 n13Var2 = (n13) it2.next();
                    boolean z2 = n13Var2.b;
                    String strI = n13Var2.a;
                    if (z2) {
                        strI = xcg1.i(strI, ", ", strO0);
                    }
                    arrayList2.add(strI);
                }
                if (str2.length() != 0) {
                    arrayList2 = o7h.O0(str2, arrayList2);
                }
                objT2 = o7h.y0(arrayList2, "; ", (String) null, (String) null, (iu30) null, 62);
                x340Var.s0(objT2);
            }
            String str4 = (String) objT2;
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    } else if (((n13) it3.next()).b) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            l6p1.d(((i3 >> 6) & 112) | 384, apo.r(-518259939, new wf(str4, af5Var, (byte) 12), x340Var), x340Var, nim0Var, z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(i, str, str2, arrayList);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1897445570);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x74.f(function0, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-645814493, new oa5(function1, (byte) 5), x340Var), x340Var, i2 & 14, 48, 2046);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 19);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-904265131);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cjc0 cjc0Var = new cjc0(1);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = b03.c;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
            uwr uwrVar = cbx.a;
            uwo1.e(" ", qim0VarA, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, x340Var, 6, 0, 1784);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2(qim0Var, i, (byte) 1);
        }
    }

    public static final void e(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1723007588);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131956190);
            String strO1 = cwl1.o0(x340Var, 2131956187);
            i3u i3uVar = new i3u(5, false, false, false);
            String strO2 = cwl1.o0(x340Var, 2131956188);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new zg20(function0, (byte) 14);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT));
            String strO3 = cwl1.o0(x340Var, 2131956189);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new zg20(function1, (byte) 15);
                x340Var.s0(objT2);
            }
            zgx zgxVar2 = new zgx(strO3, new gbx(z50Var, (Function0) objT2));
            boolean z3 = i3 == 32;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new zg20(function1, (byte) 16);
                x340Var.s0(objT3);
            }
            mqo1.d((Function0) objT3, i3uVar, (hux) null, strO0, strO1, zgxVar, zgxVar2, x340Var, 2359296, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 25);
        }
    }

    public static final void f(ebf0 ebf0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1246405655);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ebf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            nyx.a(2, (wux) null, apo.r(-1425798108, new d0e0(ebf0Var, iu30Var), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(ebf0Var, iu30Var, qim0Var2, i, (byte) 7);
        }
    }

    public static final void g(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(895162154);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            cr31 cr31Var = er31.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(nim0Var, cr31Var);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarF = dug.f(u291.r(qim0VarQ, 56.0f), u7h.b(cbx.a(x340Var).a.b.a(), 0.07f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            jmr0 jmr0VarN = i3o1.n(i, x340Var, i3 & 14);
            as80 as80Var = mif1.T0;
            f2b f2bVar = new f2b(((vex) zex.a.b).b, 5);
            zov0 zov0Var = cbx.b(x340Var).g;
            cwl1.f(jmr0VarN, (String) null, h2c.a.a(u291.r(nim0Var, 24.0f), een.h), (tl3) null, as80Var, 0.0f, f2bVar, x340Var, 24632, 40);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 7, i, i2);
        }
    }

    public static final void h(dpo dpoVar, ijf1 ijf1Var, float f, pmg1 pmg1Var, b0k b0kVar, int i) {
        h311 h311VarV;
        oel1 oel1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-626437229);
        int i2 = i | (x340Var.g(dpoVar) ? 4 : 2) | (x340Var.d(f) ? 256 : 128) | (x340Var.g(pmg1Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            xoo xooVar = (xoo) dpoVar.c.getValue();
            if (xooVar == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    oel1Var = new oel1(dpoVar, ijf1Var, f, pmg1Var, i, (byte) 2);
                }
            } else if (xooVar.a == ijf1Var) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    oel1Var = new oel1(dpoVar, ijf1Var, f, pmg1Var, i, (byte) 0);
                }
            } else {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xooVar.b >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
                long j = xooVar.c;
                boolean z = (i2 & 7168) == 2048;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new a9b(pmg1Var, (byte) 2);
                    x340Var.s0(objT);
                }
                zho1.f(jFloatToRawIntBits, j, pmg1Var, 0.0f, f, i541.C(nim0.a, (iu30) objT), false, "mixing_curve_drag_guide_continuation", x340Var, ((i2 << 6) & 57344) | ((i2 >> 3) & 896) | 14158848, 0);
            }
            h311VarV.d = oel1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            oel1Var = new oel1(dpoVar, ijf1Var, f, pmg1Var, i, (byte) 1);
            h311VarV.d = oel1Var;
        }
    }

    public static final void i(List list, ard1 ard1Var, b0k b0kVar, int i) {
        Integer num;
        iu30 iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-834502427);
        int i2 = (x340Var.i(list) ? 4 : 2) | i | (x340Var.i(ard1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                tnu0 tnu0Var = (tnu0) obj;
                Integer numValueOf = Integer.valueOf(i3);
                boolean zE = x340Var.e(i3) | x340Var.i(ard1Var) | x340Var.i(tnu0Var);
                Object objT = x340Var.T();
                if (zE || objT == m4cVar) {
                    objT = new ju01(i3, ard1Var, tnu0Var, (byte) 14);
                    x340Var.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                boolean zI = x340Var.i(ard1Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    num = numValueOf;
                    iu30Var = iu30Var2;
                    hcf1 hcf1Var = new hcf1(1, ard1Var, ard1.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 0);
                    x340Var.s0(hcf1Var);
                    objT2 = hcf1Var;
                } else {
                    num = numValueOf;
                    iu30Var = iu30Var2;
                }
                yhm1.a(num, iu30Var, (iu30) objT2, x340Var, 0);
                i3 = i4;
                m4cVar = m4cVar;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(list, ard1Var, i, (byte) 1);
        }
    }

    public static final void j(awg1 awg1Var, iu30 iu30Var, b0k b0kVar, int i) {
        boolean z;
        String str;
        awg1Var = awg1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1961242109);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.e(awg1Var.ordinal()) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zov0 zov0Var = cbx.b(x340Var).g;
            cvx cvxVar2 = cbx.b(x340Var).b;
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(uyn1.B(nim0Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
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
            w0h1.a(eox.c, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, eox.d | 48, 56);
            op71.g(x340Var, u291.v(nim0Var, 6.0f));
            int i3 = awg1Var.a;
            int i4 = awg1Var.b;
            String strO0 = cwl1.o0(x340Var, i3);
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.a;
            x340Var = x340Var;
            uwo1.e(strO0, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 38.0f, 2.0f, 16.0f, 0.0f, 8);
            lee1 lee1Var2 = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            kiv kivVar = AndroidCompositionLocals_androidKt.b;
            CharSequence text = ((Context) x340Var.k(kivVar)).getResources().getText(i4);
            if (text instanceof Spanned) {
                if (((Spanned) text).getSpans(0, text.length(), Annotation.class).length == 0) {
                    z = false;
                } else {
                    x340Var.i0(341464726);
                    Spanned spanned = (Spanned) ((Context) x340Var.k(kivVar)).getResources().getText(i4);
                    int i5 = i2 << 3;
                    ye5 ye5Var = new ye5(spanned.toString());
                    x340Var.i0(-1188476179);
                    Object[] spans = spanned.getSpans(0, spanned.length(), Annotation.class);
                    ArrayList arrayList = new ArrayList();
                    int length = spans.length;
                    int i6 = 0;
                    while (true) {
                        str = "link";
                        if (i6 >= length) {
                            break;
                        }
                        Object obj = spans[i6];
                        if (u890.j(((Annotation) obj).getKey(), "link")) {
                            arrayList.add(obj);
                        }
                        i6++;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Annotation annotation = (Annotation) it.next();
                        int spanStart = spanned.getSpanStart(annotation);
                        int spanEnd = spanned.getSpanEnd(annotation);
                        ye5Var.c(spanStart, str, spanEnd, annotation.getValue());
                        String value = annotation.getValue();
                        Iterator it2 = it;
                        Spanned spanned2 = spanned;
                        boolean zI = ((((i5 & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (i5 & 384) == 256) | x340Var.i(annotation) | ((((i5 & 112) ^ 48) > 32 && x340Var.e(awg1Var.ordinal())) || (i5 & 48) == 32);
                        Object objT = x340Var.T();
                        if (zI || objT == fkj0.X) {
                            objT = new cbf0(annotation, iu30Var, awg1Var);
                            x340Var.s0(objT);
                        }
                        ye5Var.a(new kjc0(value, (pae1) null, (rjc0) objT), spanStart, spanEnd);
                        uwr uwrVar2 = cbx.a;
                        ye5Var.d(new zma1(cbx.a(x340Var).b.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), spanStart, spanEnd);
                        str = str;
                        it = it2;
                        spanned = spanned2;
                    }
                    x340Var.r(false);
                    uwo1.d(ye5Var.p(), j2, qim0VarB, lee1Var2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4080);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                x340Var.r(true);
            } else {
                z = false;
            }
            x340Var.i0(341821939);
            uwo1.e(cwl1.o0(x340Var, i4), qim0VarB, lee1Var2, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(z);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(awg1Var, iu30Var, i, (byte) 14);
        }
    }

    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v39 */
    public static final void k(dok0 dok0Var, yqg yqgVar, agq agqVar, int i, int i2, int i3, ycu0 ycu0Var, float f, iu30 iu30Var, qim0 qim0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Integer num, Integer num2, vu30 vu30Var, iu30 iu30Var2, iu30 iu30Var3, vu30 vu30Var2, zu30 zu30Var, zu30 zu30Var2, zu30 zu30Var3, zu30 zu30Var4, int i4, float f2, boolean z10, boolean z11, b0k b0kVar, int i5) {
        b0k b0kVar2;
        qim0 qim0Var2;
        int i6;
        int i7;
        int i8;
        qim0 qim0Var3;
        int i9;
        Boolean bool;
        dpo dpoVar;
        byte b2;
        Object objValueOf;
        ?? r12;
        int i10;
        float f3;
        float f4;
        tob1 tob1Var;
        Object objA;
        tob1 tob1Var2;
        Object pel1Var;
        dlv dlvVarQ;
        float f5;
        drr0 drr0Var;
        float f6;
        float f7;
        int i11;
        pxg1 pxg1VarO0;
        cok0 cok0Var = dok0Var.a;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1238641968);
        int i12 = i5 | (b0kVar3.i(dok0Var) ? 32 : 16) | (b0kVar3.g(yqgVar) ? 256 : 128) | (b0kVar3.i(agqVar) ? 2048 : 1024) | (b0kVar3.e(i) ? 16384 : 8192) | (b0kVar3.e(i2) ? 131072 : 65536) | (b0kVar3.e(i3) ? 1048576 : 524288) | (b0kVar3.g(ycu0Var) ? 8388608 : 4194304) | (b0kVar3.h(false) ? 67108864 : 33554432) | (b0kVar3.d(f) ? 536870912 : 268435456);
        int i13 = (b0kVar3.i(iu30Var) ? (char) 4 : (char) 2) | '0' | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.h(z2) ? 2048 : 1024) | (b0kVar3.h(z3) ? 16384 : 8192) | (b0kVar3.h(z4) ? 131072 : 65536) | (b0kVar3.h(z5) ? 1048576 : 524288) | (b0kVar3.h(z6) ? 8388608 : 4194304) | (b0kVar3.h(z7) ? 67108864 : 33554432) | (b0kVar3.h(z8) ? 536870912 : 268435456);
        int i14 = (b0kVar3.h(z9) ? (char) 4 : (char) 2) | (b0kVar3.g(num) ? ' ' : (char) 16) | (b0kVar3.g(num2) ? 256 : 128) | (b0kVar3.i(vu30Var) ? 2048 : 1024) | (b0kVar3.i(iu30Var2) ? 16384 : 8192) | (b0kVar3.i(iu30Var3) ? (char) 0 : (char) 0) | (b0kVar3.i(vu30Var2) ? (char) 0 : (char) 0) | (b0kVar3.i(zu30Var) ? (char) 0 : (char) 0) | (b0kVar3.i(zu30Var2) ? (char) 0 : (char) 0) | (b0kVar3.i(zu30Var3) ? (char) 0 : (char) 0);
        int i15 = (b0kVar3.i(zu30Var4) ? (char) 4 : (char) 2) | 16 | (b0kVar3.d(f2) ? 256 : 128) | (b0kVar3.h(z10) ? (char) 2048 : (char) 1024) | (b0kVar3.h(z11) ? (char) 16384 : (char) 8192) | 196608;
        if (b0kVar3.Y(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (i14 & 306783379) == 306783378 && (74899 & i15) == 74898) ? false : true)) {
            b0kVar3.d0();
            if ((i5 & 1) == 0 || b0kVar3.E()) {
                i7 = cok0Var.x;
                i8 = i15 & (-113);
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
                i7 = i4;
                i8 = i15 & (-113);
            }
            b0kVar3.s();
            float fH = ((wat) b0kVar3.k(t4k.h)).h();
            int i16 = cok0Var.a.b.X;
            Object objT = b0kVar3.T();
            o6x o6xVar = o6x.a;
            if (objT == obj) {
                objT = qxd0.M(o6xVar, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zG = b0kVar3.g(c9nVar);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == obj) {
                objT2 = new dpo(c9nVar);
                b0kVar3.s0(objT2);
            }
            dpo dpoVar2 = (dpo) objT2;
            boolean z12 = cok0Var.q;
            Resources resources = ((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b)).getResources();
            Locale locale = ((Configuration) b0kVar3.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            boolean zG2 = b0kVar3.g(resources) | b0kVar3.g(locale);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == obj) {
                resources.getClass();
                locale.getClass();
                objT3 = new r69(resources, locale);
                b0kVar3.s0(objT3);
            }
            r69 r69Var = (r69) objT3;
            boolean zG3 = b0kVar3.g(r69Var);
            Object objT4 = b0kVar3.T();
            if (zG3 || objT4 == obj) {
                objT4 = new lh2(3, r69Var, r69.class, "format", "format(DLcom/spotify/playlistmixing/model/AutomationCurves;Lcom/spotify/playlistmixing/model/AutomationValueSemantics;)Ljava/lang/String;", 0, (byte) 22);
                b0kVar3.s0(objT4);
            }
            nla0 nla0Var = (nla0) objT4;
            Boolean boolValueOf = Boolean.valueOf(z10);
            Boolean boolValueOf2 = Boolean.valueOf(z12);
            int i17 = i8 & 7168;
            boolean zH = (i17 == 2048) | b0kVar3.h(z12) | b0kVar3.g(dpoVar2);
            Object objT5 = b0kVar3.T();
            if (zH || objT5 == obj) {
                i9 = 4;
                bool = boolValueOf;
                oy3 oy3Var = new oy3(z10, z12, dpoVar2, (lnm) null, (byte) 23);
                dpoVar = dpoVar2;
                b0kVar3.s0(oy3Var);
                objT5 = oy3Var;
            } else {
                dpoVar = dpoVar2;
                bool = boolValueOf;
                i9 = 4;
            }
            qxd0.s(bool, boolValueOf2, (vu30) objT5, b0kVar3);
            float f8 = 2.0f;
            float f9 = i > 0 ? (i * 16) / 2.0f : 4.0f;
            int i18 = i12 >> 12;
            boolean z13 = (((i18 & 14) ^ 6) > i9 && b0kVar3.e(i)) || (i18 & 6) == i9;
            Object objT6 = b0kVar3.T();
            if (z13 || objT6 == obj) {
                b2 = 2;
                if (i == 0 || i == 2 || i == i9) {
                    f8 = 3.0f;
                } else if (i != 8) {
                    f8 = 1.0f;
                }
                objValueOf = Float.valueOf(f8);
                b0kVar3.s0(objValueOf);
            } else {
                objValueOf = objT6;
                b2 = 2;
            }
            float fFloatValue = ((Number) objValueOf).floatValue();
            int i19 = i12 >> 15;
            boolean z14 = (((i19 & 14) ^ 6) > i9 && b0kVar3.e(i2)) || (i19 & 6) == i9;
            Object objT7 = b0kVar3.T();
            if (z14 || objT7 == obj) {
                objT7 = Float.valueOf(i2 - 120.0f);
                b0kVar3.s0(objT7);
            }
            float fFloatValue2 = ((Number) objT7).floatValue();
            Object objT8 = b0kVar3.T();
            if (objT8 == obj) {
                r12 = 0;
                objT8 = v8r.q(new cfl1(0, false));
                b0kVar3.s0(objT8);
            } else {
                r12 = 0;
            }
            ven0 ven0Var = (ven0) objT8;
            Object objT9 = b0kVar3.T();
            if (objT9 == obj) {
                objT9 = v8r.q(new cfl1((int) r12, (boolean) r12));
                b0kVar3.s0(objT9);
            }
            ven0 ven0Var2 = (ven0) objT9;
            Object objT10 = b0kVar3.T();
            if (objT10 == obj) {
                objT10 = us71.i(1.0f, b0kVar3);
            }
            drr0 drr0Var2 = (drr0) objT10;
            byte b3 = b2;
            tob1 tob1VarB = z95.b(drr0Var2.s(), z10 ? irn1.j0() : irn1.o0(300, 0, mlv.a, b2), "zoomScaleAnimation", (iu30) null, b0kVar3, 3072, 20);
            Object objT11 = b0kVar3.T();
            if (objT11 == obj) {
                objT11 = us71.i(0.0f, b0kVar3);
            }
            drr0 drr0Var3 = (drr0) objT11;
            tob1 tob1VarB2 = z95.b(drr0Var3.s(), z10 ? irn1.j0() : irn1.o0(300, 0, mlv.a, b3), "panOffsetAnimation", (iu30) null, b0kVar3, 3072, 20);
            int i20 = i12 & 458752;
            int i21 = i8 & 57344;
            boolean zD = b0kVar3.d(((Number) tob1VarB.getValue()).floatValue()) | (i20 == 131072) | b0kVar3.d(fFloatValue2) | b0kVar3.d(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x049f: ARITH (r7v40 'zD' boolean) = (wrap boolean:0x0490: ARITH (wrap boolean:0x0487: ARITH (wrap boolean:0x0482: ARITH (wrap boolean:0x047d: ARITH (wrap boolean:0x046d: INVOKE 
                  (r5v1 'b0kVar3' p.b0k)
                  (wrap float:0x0469: INVOKE 
                  (wrap java.lang.Number:0x0467: CHECK_CAST (java.lang.Number) (wrap java.lang.Object:0x0463: INVOKE (r57v0 'tob1VarB' p.tob1) INTERFACE call: p.tob1.getValue():java.lang.Object A[WRAPPED] (LINE:84)))
                 VIRTUAL call: java.lang.Number.floatValue():float A[MD:():float (c), WRAPPED] (LINE:84))
                 VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:85)) | (wrap boolean:?: TERNARY null = ((r8v41 'i20' int) == (131072 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:85)) | (wrap boolean:0x047e: INVOKE (r5v1 'b0kVar3' p.b0k), (r2v10 'fFloatValue2' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:86)) A[DONT_WRAP, WRAPPED] (LINE:86)) | (wrap boolean:0x0483: INVOKE (r5v1 'b0kVar3' p.b0k), (r80v1 float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:87)) A[DONT_WRAP, WRAPPED] (LINE:87)) | (wrap boolean:?: TERNARY null = ((r10v20 'i17' int) == (2048(0x800, float:2.87E-42) ??[int, float, short, byte, char])) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:87)) | (wrap boolean:?: TERNARY null = ((r11v38 'i21' int) == (16384 int)) ? true : false) A[DECLARE_VAR] (LINE:87) in method: p.b2u.k(p.dok0, p.yqg, p.agq, int, int, int, p.ycu0, float, p.iu30, p.qim0, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Integer, java.lang.Integer, p.vu30, p.iu30, p.iu30, p.vu30, p.zu30, p.zu30, p.zu30, p.zu30, int, float, boolean, boolean, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r80v1 float
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2151
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.b2u.k(p.dok0, p.yqg, p.agq, int, int, int, p.ycu0, float, p.iu30, p.qim0, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.Integer, java.lang.Integer, p.vu30, p.iu30, p.iu30, p.vu30, p.zu30, p.zu30, p.zu30, p.zu30, int, float, boolean, boolean, p.b0k, int):void");
        }

        public static final float l(tob1 tob1Var) {
            return ((Number) tob1Var.getValue()).floatValue();
        }

        public static final yqk m(ConcertTimes concertTimes) {
            DateWithOffset dateWithOffsetO = concertTimes.o();
            return new yqk(new k7r(dateWithOffsetO.n(), dateWithOffsetO.p()));
        }

        public static BoringLayout n(int i, int i2, BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, boolean z) {
            if (i < 0) {
                rf80.a("negative width");
            }
            if (i2 < 0) {
                rf80.a("negative ellipsized width");
            }
            return Build.VERSION.SDK_INT >= 33 ? rqb.c(i, i2, metrics, alignment, textPaint, truncateAt, charSequence, z) : new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
        }

        public static v9w0 o(View view) {
            return new v9w0(view, Float.valueOf(0.96f).floatValue());
        }

        public static v9w0 p(View view) {
            return new v9w0(view, Float.valueOf(0.97f).floatValue());
        }

        public static v9w0 q(View view) {
            return new v9w0(view, Float.valueOf(0.99f).floatValue());
        }

        public static final int r(rq31 rq31Var) {
            vp31 vp31Var = rq31Var.a;
            uq31 uq31Var = rq31Var.c;
            if (uq31Var instanceof sq31) {
                return vp31Var.g.indexOf(((sq31) uq31Var).a);
            }
            if (uq31Var instanceof tq31) {
                return vp31Var.g.indexOf(((tq31) uq31Var).a);
            }
            eg.o();
            return 0;
        }

        public static boolean s(BoringLayout boringLayout) {
            if (Build.VERSION.SDK_INT >= 33) {
                return gg.y(boringLayout);
            }
            return false;
        }

        public static final ven0 t(b0k b0kVar) {
            x340 x340Var = (x340) b0kVar;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                Object systemService = context.getSystemService("accessibility");
                objT = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                x340Var.s0(objT);
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) objT;
            boolean z = false;
            if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = x340Var.i(accessibilityManager);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new jh(accessibilityManager, (lnm) null, (byte) 1);
                x340Var.s0(objT2);
            }
            return yto.q(boolValueOf, x340Var, (vu30) objT2);
        }

        public static final void u(int i, j7s j7sVar, ard1 ard1Var, xhm1 xhm1Var) {
            rx7 rx7Var;
            sju sjuVar;
            if (xhm1Var == null) {
                return;
            }
            int i2 = i - 1;
            int i3 = 1;
            if (i != 1) {
                i3 = 2;
                if (i != 2) {
                    i3 = 3;
                    if (i != 3) {
                        i3 = 4;
                        if (i != 4) {
                            i3 = 5;
                            if (i != 5) {
                                i3 = 0;
                            }
                        }
                    }
                }
            }
            int i4 = i3;
            if (i4 == 0) {
                return;
            }
            tnu0 tnu0Var = (tnu0) o7h.t0(i2, (List) j7sVar.f);
            ard1Var.b(xhm1Var, zqd1.c, i2, (tnu0Var == null || (rx7Var = tnu0Var.h) == null || (sjuVar = rx7Var.c) == null) ? null : sjuVar.c, i4);
        }

        public static BoringLayout.Metrics v(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
            if (Build.VERSION.SDK_INT >= 33) {
                return gg.x(charSequence, textPaint, textDirectionHeuristic);
            }
            if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
                return null;
            }
            return BoringLayout.isBoring(charSequence, textPaint, null);
        }

        public static final b091 w(mmr0 mmr0Var) {
            Object obj = mmr0Var.a;
            b091 b091Var = new b091((yky0) obj);
            b091Var.Q((yky0) obj, mmr0Var.b);
            return b091Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static EventSource x(Observable observable, ti61 ti61Var, Flowable flowable, dxz0 dxz0Var, d6c d6cVar, Observable observable2) {
            return RxEventSources.a(new ObservableSource[]{observable, ti61Var.a.b("social-connect/v2/session_update", new d061(1, ti61Var, ti61.class, "convert", "convert(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/jam/internal/socialconnect/models/SessionUpdate;", 0, (byte) 3)).map(rdx0.O0).doOnError(w841.e1).onErrorComplete(), new ObservableFromPublisher(flowable.J(gtv0.h).t(Functions.a).J(icx0.O0)).doOnError(wx91.c).onErrorComplete(), dxz0Var.c().skip(1L).distinctUntilChanged().map(kcx0.P0), d6cVar.a.b("social-connect/v2/broadcast_status_update", new qka(d6cVar)).map(pdx0.P0).doOnError(w841.d1).onErrorComplete(), observable2.distinctUntilChanged().map(jcx0.P0)});
        }
    }
