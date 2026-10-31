package p;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.allboarding.allboardingimpl.search.ui.BackKeyEditText;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.player.model.AdBreakContext;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class xap1 {
    public static b180 a;
    public static b180 b;

    public static final vir0 A(ei30 ei30Var) {
        int iOrdinal = ei30Var.ordinal();
        if (iOrdinal == 0) {
            return sir0.a;
        }
        if (iOrdinal == 1) {
            return new uir0(1);
        }
        if (iOrdinal == 2) {
            return new uir0(2);
        }
        if (iOrdinal == 3) {
            return new tir0(1);
        }
        eg.o();
        return null;
    }

    public static final int B(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        float f;
        lee1 lee1Var;
        String str2 = str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1791905675);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (z) {
                x340Var.i0(-513279313);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                x340Var.r(false);
                f = 32.0f;
            } else {
                x340Var.i0(-513211826);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                x340Var.r(false);
                f = 48.0f;
            }
            if (z) {
                x340Var.i0(260543202);
                lee1Var = cbx.d(x340Var).k;
            } else {
                x340Var.i0(260544387);
                lee1Var = cbx.d(x340Var).h;
            }
            x340Var.r(false);
            lee1 lee1Var2 = lee1Var;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            jw31 jw31VarA2 = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarF2 = dug.f(u291.r(qim0Var3, f), ((vex) zex.a.e).i, er31.b(24.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            zov0 zov0Var3 = cbx.b(x340Var).g;
            w0h1.a(dtx.c, isl.a, u291.r(qim0Var3, 16.0f), 0L, 0L, false, x340Var, dtx.d | 48, 56);
            x340Var.r(true);
            String str3 = ((klz0) x340Var.k(llz0.a)).b.d.f;
            long j = cbx.a(x340Var).b.a;
            cjc0 cjc0Var = new cjc0(1);
            cvx cvxVar = cbx.b(x340Var).b;
            gxo1.c(str3, uyn1.B(qim0Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14), lee1Var2, j, new a0e1(5), 0, false, cjc0Var, null, 0.0f, null, null, x340Var, 0, 0, 3936);
            x340Var.r(true);
            str2 = str;
            gxo1.c(str2, null, lee1Var2, cbx.a(x340Var).b.a, new a0e1(5), 0, false, new cjc0(1), null, 0.0f, null, null, x340Var, i4 & 14, 0, 3938);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ryh(str2, qim0Var2, z, i);
        }
    }

    public static final void b(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(365571495);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131952838);
            String strO1 = cwl1.o0(x340Var, 2131952837);
            String strO2 = cwl1.o0(x340Var, 2131952836);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new j3n(function0, (byte) 23);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT));
            String strO3 = cwl1.o0(x340Var, 2131952835);
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new j3n(function1, (byte) 24);
                x340Var.s0(objT2);
            }
            function2 = function1;
            mqo1.d(function2, null, null, strO0, strO1, zgxVar, new zgx(strO3, new gbx(z50Var, (Function0) objT2)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function2, i, (byte) 12);
        }
    }

    public static final void c(ule1 ule1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1490994678);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(ule1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Resources resources = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources();
            resources.getClass();
            aan aanVar = ule1Var.b;
            StringBuilder sb = new StringBuilder();
            int i3 = aanVar.a;
            int i4 = aanVar.c;
            int i5 = aanVar.b;
            if (i3 > 0) {
                sb.append(resources.getQuantityString(2131820739, i3, Integer.valueOf(i3)));
                sb.append(" ");
            }
            if (i5 > 0) {
                sb.append(resources.getQuantityString(2131820740, i5, Integer.valueOf(i5)));
                sb.append(" ");
            }
            if (i3 > 0 || i5 > 0 || i4 > 0) {
                sb.append(resources.getQuantityString(2131820741, i4, Integer.valueOf(i4)));
            }
            if (i3 == 0) {
                sb.append(" ");
                int i6 = aanVar.d;
                sb.append(resources.getQuantityString(2131820742, i6, String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1))));
            }
            String string = ihc1.e1(sb.toString()).toString();
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
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xrx.c, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, xrx.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 4.0f));
            uwo1.e(ule1Var.a, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
            x340Var.r(true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            uwo1.e(string, null, lee1.a(cbx.d(x340Var).e, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, "tnum", 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777151), cbx.a(x340Var).b.a, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(8.0f, 2131957624, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(ule1Var, i, (byte) 3);
        }
    }

    public static final void d(hz81 hz81Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(303095815);
        int i2 = (x340Var.i(hz81Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ven0 ven0Var = hz81Var.d;
            if (ven0Var == null) {
                u890.C("state");
                throw null;
            }
            for (h8k1 h8k1Var : ((rnc0) ven0Var.getValue()).b) {
                x340Var.f0(64657953, h8k1Var);
                i(hz81Var, h8k1Var.a, x340Var, i2 & 14);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gz81(hz81Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void e(String str, String str2, String str3, int i, boolean z, b0k b0kVar, int i2, int i3) {
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        h311 h311VarV;
        int i6;
        boolean z5;
        qim0 qim0Var;
        qim0 qim0VarK;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        n4k n4kVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1344117118);
        j06 j06Var = x340Var.a;
        int i7 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i7 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i7 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 == 0) {
            if ((i2 & 24576) == 0) {
                z2 = z;
                i7 |= x340Var.h(z2) ? 16384 : 8192;
            }
            i4 = i7;
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                if (i8 != 0) {
                    i6 = 9;
                } else {
                    i6 = i;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                qim0Var = nim0.a;
                if (z5) {
                    qim0VarK = d9y0.k(qim0Var, 0.3f);
                } else {
                    qim0VarK = qim0Var;
                }
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z6 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z6) {
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
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
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
                int i10 = i4 >> 6;
                suo1.f(cwl1.o0(x340Var, 2131957617), i6, qim0VarK, 0, x340Var, i10 & 112, 24);
                x340Var.i0(-2087763202);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(qim0Var, 8.0f));
                uwo1.e(str, qim0VarK, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i4 & 14, 0, 2032);
                x340Var.r(false);
                x340Var.r(true);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var, 8.0f));
                uwo1.e(str2, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, null, null, 0, false, new cjc0(2), 0, null, x340Var, (i4 >> 3) & 14, 0, 1778);
                cvx cvxVar3 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var, 8.0f));
                uwo1.e(str3, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(2), 0, null, x340Var, i10 & 14, 0, 1778);
                x340Var.r(true);
                z4 = z5;
                i5 = i6;
            } else {
                x340Var.b0();
                i5 = i;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sle1(i5, i2, i3, str, str2, str3, z4);
            }
        }
        i7 |= 24576;
        z2 = z;
        i4 = i7;
        if ((i4 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i4 & 1, z3)) {
            if (i8 != 0) {
                i6 = 9;
            } else {
                i6 = i;
            }
            if (i9 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            qim0Var = nim0.a;
            if (z5) {
                qim0VarK = d9y0.k(qim0Var, 0.3f);
            } else {
                qim0VarK = qim0Var;
            }
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z6 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar7);
            nko1.F(x340Var);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar8);
            jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar5);
            nko1.H(xos0VarM3, x340Var, lljVar6);
            x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar8);
            int i11 = i4 >> 6;
            suo1.f(cwl1.o0(x340Var, 2131957617), i6, qim0VarK, 0, x340Var, i11 & 112, 24);
            x340Var.i0(-2087763202);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var, 8.0f));
            uwo1.e(str, qim0VarK, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i4 & 14, 0, 2032);
            x340Var.r(false);
            x340Var.r(true);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var, 8.0f));
            uwo1.e(str2, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, null, null, 0, false, new cjc0(2), 0, null, x340Var, (i4 >> 3) & 14, 0, 1778);
            cvx cvxVar6 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var, 8.0f));
            uwo1.e(str3, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(2), 0, null, x340Var, i11 & 14, 0, 1778);
            x340Var.r(true);
            z4 = z5;
            i5 = i6;
        } else {
            x340Var.b0();
            i5 = i;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sle1(i5, i2, i3, str, str2, str3, z4);
        }
    }

    public static final void f(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1822844226);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            kiv kivVar = t4k.h;
            float fY = ((wat) x340Var.k(kivVar)).y(fc11.G(12));
            float fY2 = ((wat) x340Var.k(kivVar)).y(fc11.G(3));
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            pox poxVar = pox.c;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131957664));
            qim0 qim0VarX = uyn1.x(u291.r(qim0Var, fY), fY2);
            boolean zF = x340Var.f(j) | x340Var.d(fY);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = new qf0(j, fY, (byte) 1);
                x340Var.s0(objT);
            }
            w0h1.a(poxVar, jslVar, anm1.N("locked", exd0.q(qim0VarX, (iu30) objT)), cbx.a(x340Var).a.c, 0L, true, x340Var, pox.d | 196608, 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0((byte) 22, i, i2, qim0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    public static final void g(String str, String str2, hux huxVar, c380 c380Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        c380 c380Var2;
        qim0 qim0Var2;
        nl3 nl3Var;
        Function0 function2;
        ?? r11;
        int i2;
        float f;
        qim0 qim0Var3;
        g36 g36Var;
        boolean z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        nl3 nl3Var2 = een.Q0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2068422842);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(huxVar) ? 256 : 128) | (x340Var.g(c380Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i3 & 1, (i3 & 599187) != 599186)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarN = anm1.N("OFFLINE_ERROR_ROOT_TAG", u291.d(qim0Var4, 1.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function3 = hmb0.t1;
            if (z2) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            qim0 qim0VarF = u291.f(u291.z(l6o1.H(qim0Var4, l6o1.C(0, 0, 1, x340Var), false, 14), (fra) null, 3), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarF);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarZ, lhc.g(x340Var).g);
            g36 g36Var2 = h36.c;
            mbh mbhVarA = jbh.a(g36Var2, nl3Var2, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            if (huxVar != null) {
                x340Var.i0(15732168);
                zov0 zov0Var = cbx.b(x340Var).g;
                nl3Var = nl3Var2;
                function2 = function3;
                g36Var = g36Var2;
                i2 = 2;
                f = 16.0f;
                qim0Var3 = qim0Var4;
                r11 = 0;
                w0h1.a(huxVar, isl.a, u291.r(qim0Var4, 48.0f), 0L, 0L, false, x340Var, ((i3 >> 6) & 14) | 56, 56);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                nl3Var = nl3Var2;
                function2 = function3;
                r11 = 0;
                i2 = 2;
                f = 16.0f;
                qim0Var3 = qim0Var4;
                g36Var = g36Var2;
                x340Var.i0(15908992);
                x340Var.r(false);
            }
            cvx cvxVar2 = cbx.b(x340Var).b;
            lee1 lee1Var = kk0.p(qim0Var3, 8.0f, x340Var, x340Var).e;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar3 = cbx.b(x340Var).b;
            x340 x340Var2 = x340Var;
            uwo1.e(str, uyn1.z(f, 0.0f, i2, qim0Var3), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2016);
            cvx cvxVar4 = cbx.b(x340Var).b;
            lee1 lee1Var2 = kk0.p(qim0Var3, 8.0f, x340Var, x340Var).j;
            long j2 = cbx.a(x340Var).b.a;
            cvx cvxVar5 = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.z(f, 0.0f, i2, qim0Var3), lee1Var2, j2, new a0e1(3), null, 0, false, null, 0, null, x340Var2, (i3 >> 3) & 14, 0, 2016);
            if (c380Var.isEmpty()) {
                c380Var2 = c380Var;
                z = true;
                x340Var.i0(17245216);
                x340Var.r((boolean) r11);
            } else {
                x340Var.i0(16688797);
                if (!c380Var.isEmpty()) {
                    Iterator it = c380Var.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            x340Var.i0(16877184);
                            x340Var.r((boolean) r11);
                            break;
                        } else if (((urp0) it.next()) instanceof trp0) {
                            x340Var.i0(16723424);
                            uwr uwrVar2 = cbx.a;
                            x0d.s(qim0Var3, cbx.b(x340Var).b.b, x340Var, (boolean) r11);
                            break;
                        }
                    }
                } else {
                    x340Var.i0(16877184);
                    x340Var.r((boolean) r11);
                    break;
                }
                mbh mbhVarA2 = jbh.a(g36Var, nl3Var, x340Var, (int) r11);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function2);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                c380Var2 = c380Var;
                Iterator itN = kk0.n(x340Var, qim0VarE3, lljVar, -1971157358, c380Var2);
                while (itN.hasNext()) {
                    urp0 urp0Var = (urp0) itN.next();
                    if (urp0Var instanceof trp0) {
                        x340Var.i0(384989213);
                        otw.c((maa) function0.invoke(), urp0Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r((boolean) r11);
                    } else {
                        if (!(urp0Var instanceof qrp0)) {
                            throw p3d1.k(x340Var, 384987933, (boolean) r11);
                        }
                        x340Var.i0(384992352);
                        otw.c((maa) function1.invoke(), urp0Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r((boolean) r11);
                    }
                }
                z = true;
                us71.m(x340Var, (boolean) r11, true, (boolean) r11);
            }
            x340Var.r(z);
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            c380Var2 = c380Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0((Object) str, (Object) str2, (Object) huxVar, (Object) c380Var2, function0, function1, qim0Var2, i, (byte) 2);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(430133377);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mmr0 mmr0Var = new mmr0(Float.valueOf(38.0f), Float.valueOf(27.0f));
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(mmr0Var);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            Uri uri = Uri.parse("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-education/RequestParentalConsent.png");
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new qtr0(ven0Var, mmr0Var, (byte) 1);
                x340Var.s0(objT2);
            }
            eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT2, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 126974), isl.a, qim0VarF, (p3v) null, (zvx) null, new ecx(((Number) ((mmr0) ven0Var.getValue()).a).floatValue(), ((Number) ((mmr0) ven0Var.getValue()).b).floatValue()), mif1.S0, (tl3) null, (ColorFilter) null, x340Var, 3120, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var2, i, (byte) 17);
        }
    }

    public static final void i(hz81 hz81Var, Object obj, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(782980478);
        int i2 = (x340Var.i(hz81Var) ? 4 : 2) | i | (x340Var.i(obj) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(hz81Var) | x340Var.i(obj);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new iv81(hz81Var, obj, (byte) 1);
                x340Var.s0(objT);
            }
            dgo1.c(obj, (iu30) objT, apo.r(-673869118, new iz81(hz81Var, obj), x340Var), x340Var, ((i2 >> 3) & 14) | 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iz81(hz81Var, obj, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void j(yle1 yle1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-506885495);
        int i2 = (x340Var.g(yle1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = nhe1.f;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            if (yle1Var instanceof ule1) {
                x340Var.i0(701687436);
                c((ule1) yle1Var, x340Var, i2 & 14);
                x340Var.r(false);
            } else if (yle1Var instanceof xle1) {
                x340Var.i0(701690055);
                e(yap1.j(0L), cwl1.o0(x340Var, 2131957623), cwl1.o0(x340Var, 2131957622), 10, false, x340Var, 3072, 16);
                x340Var.r(false);
            } else if (yle1Var instanceof vle1) {
                x340Var.i0(701701251);
                e(((vle1) yle1Var).a, cwl1.o0(x340Var, 2131957619), cwl1.o0(x340Var, 2131957618), 0, false, x340Var, 24576, 8);
                x340Var.r(false);
            } else {
                if (!(yle1Var instanceof wle1)) {
                    throw p3d1.k(x340Var, 701686824, false);
                }
                x340Var.i0(701711432);
                e(((wle1) yle1Var).a, cwl1.o0(x340Var, 2131957621), cwl1.o0(x340Var, 2131957620), 10, false, x340Var, 3072, 16);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(yle1Var, qim0Var, i, (byte) 26);
        }
    }

    public static final ei30 k(zf30 zf30Var, zf30 zf30Var2, yun0 yun0Var, int i) {
        xun0 xun0VarH;
        xg30 xg30VarA;
        xun0 xun0VarH2;
        if (zf30Var2 == zf30Var && i > 0) {
            return ei30.c;
        }
        if (zf30Var2 == zf30Var) {
            return ei30.a;
        }
        if (((yun0Var == null || (xun0VarH2 = yun0Var.h()) == null) ? null : xun0VarH2.b()) == zf30Var2) {
            if (((yun0Var == null || (xun0VarH = yun0Var.h()) == null || (xg30VarA = xun0VarH.a()) == null) ? null : xg30VarA.d) instanceof d6w0) {
                xun0 xun0VarM = yun0Var.m();
                if ((xun0VarM != null ? xun0VarM.b() : null) == zf30Var) {
                    return ei30.b;
                }
            }
        }
        return ei30.d;
    }

    public static final AdBreakContext l(spq0 spq0Var) {
        AdBreakContext adBreakContext = (AdBreakContext) spq0Var.h();
        if (adBreakContext == null || adBreakContext.totalAdsInBreakEstimate() == 0 || adBreakContext.positionInCurrentAdBreak() > adBreakContext.totalAdsInBreakEstimate()) {
            return null;
        }
        return adBreakContext;
    }

    public static final t62 m(PlayerState playerState, Resources resources) {
        t380 t380VarDisallowSkippingNextReasons;
        String str = (String) ((ContextTrack) playerState.track().b()).metadata().get("advertiser");
        if (str == null) {
            str = "";
        }
        AdBreakContext adBreakContextL = l(playerState.adBreakContext());
        Restrictions restrictions = playerState.restrictions();
        boolean zIsEmpty = (restrictions == null || (t380VarDisallowSkippingNextReasons = restrictions.disallowSkippingNextReasons()) == null) ? true : t380VarDisallowSkippingNextReasons.isEmpty();
        String str2 = (String) ((ContextTrack) playerState.track().b()).metadata().get("ad.skippable_ad_delay");
        Integer numC0 = str2 != null ? nhc1.c0(str2) : null;
        return new t62(str.length() == 0 ? resources.getString(2131952027) : str, str.length() == 0 ? x(resources, adBreakContextL, zIsEmpty, numC0) : n(resources, adBreakContextL, zIsEmpty, numC0));
    }

    public static final String n(Resources resources, AdBreakContext adBreakContext, boolean z, Integer num) {
        if (z) {
            return resources.getString(2131952028);
        }
        if (num != null) {
            return resources.getQuantityString(2131820563, num.intValue(), num);
        }
        return adBreakContext != null ? resources.getString(2131952029, Long.valueOf(adBreakContext.positionInCurrentAdBreak()), Long.valueOf(adBreakContext.totalAdsInBreakEstimate())) : resources.getString(2131952027);
    }

    public static final long o(float f, float f2, float[] fArr) {
        int iB;
        float f3 = (f - 0.0f) * 3.0f;
        float f4 = (f2 - f) * 3.0f;
        float f5 = (1.0f - f2) * 3.0f;
        double d = f3;
        double d2 = f4;
        double d3 = f5;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iB = d2 == d3 ? 0 : B((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iB2 = B((float) ((-(d6 + d7)) / d5), fArr, 0);
            iB = B((float) ((d6 - d7) / d5), fArr, iB2) + iB2;
            if (iB > 1) {
                float f6 = fArr[0];
                float f7 = fArr[1];
                if (f6 > f7) {
                    fArr[0] = f7;
                    fArr[1] = f6;
                } else if (f6 == f7) {
                    iB--;
                }
            }
        }
        float f8 = (f4 - f3) * 2.0f;
        int iB3 = B((-f8) / (((f5 - f4) * 2.0f) - f8), fArr, iB) + iB;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iB3; i++) {
            float f9 = fArr[i];
            float f10 = (((((((((f - f2) * 3.0f) + 1.0f) - 0.0f) * f9) + (((f2 - (f * 2.0f)) + 0.0f) * 3.0f)) * f9) + f3) * f9) + 0.0f;
            fMin = Math.min(fMin, f10);
            fMax = Math.max(fMax, f10);
        }
        return (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
    }

    public static void p(View view, View view2) {
        view.animate().alpha(0.0f).setListener(new oqr(view, view2, (byte) 6)).start();
    }

    public static void q(View view, bkl bklVar) {
        view.getClass();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new pik1(bklVar, view, viewTreeObserver));
    }

    public static final float r(float f, float f2, float f3) {
        return ((((((f - f2) + 0.33333334f) * f3) + (f2 - (2.0f * f))) * f3) + f) * 3.0f * f3;
    }

    public static void s(View view) {
        if (view.getVisibility() != 0) {
            view.clearAnimation();
            view.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(hlv.d);
            alphaAnimation.setDuration(400L);
            view.startAnimation(alphaAnimation);
        }
    }

    public static final float t(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        double d = f;
        double d2 = ((d - (((double) f2) * 2.0d)) + ((double) f3)) * 3.0d;
        double d3 = ((double) (f2 - f)) * 3.0d;
        double d4 = (((double) (f2 - f3)) * 3.0d) + ((double) (-f)) + ((double) f4);
        if (Math.abs(d4 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d2 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d3 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f7 = (float) ((-d) / d3);
                f5 = f7 >= 0.0f ? f7 : 0.0f;
                f6 = f5 <= 1.0f ? f5 : 1.0f;
                if (Math.abs(f6 - f7) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f6;
            }
            double dSqrt = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d5 = d2 * 2.0d;
            float f8 = (float) ((dSqrt - d3) / d5);
            float f9 = f8 < 0.0f ? 0.0f : f8;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            if (Math.abs(f9 - f8) > 1.05E-6f) {
                f9 = Float.NaN;
            }
            if (!Float.isNaN(f9)) {
                return f9;
            }
            float f10 = (float) (((-d3) - dSqrt) / d5);
            f5 = f10 >= 0.0f ? f10 : 0.0f;
            f6 = f5 <= 1.0f ? f5 : 1.0f;
            if (Math.abs(f6 - f10) > 1.05E-6f) {
                return Float.NaN;
            }
            return f6;
        }
        double d6 = d2 / d4;
        double d7 = d3 / d4;
        double d8 = d / d4;
        double d9 = ((d7 * 3.0d) - (d6 * d6)) / 9.0d;
        double d10 = ((d8 * 27.0d) + ((((2.0d * d6) * d6) * d6) - ((9.0d * d6) * d7))) / 54.0d;
        double d11 = d9 * d9 * d9;
        double d12 = (d10 * d10) + d11;
        double d13 = d6 / 3.0d;
        if (d12 >= 0.0d) {
            if (d12 != 0.0d) {
                double dSqrt2 = Math.sqrt(d12);
                float fH = (float) (((double) (dm5.H((float) ((-d10) + dSqrt2)) - dm5.H((float) (d10 + dSqrt2)))) - d13);
                f5 = fH >= 0.0f ? fH : 0.0f;
                f6 = f5 <= 1.0f ? f5 : 1.0f;
                if (Math.abs(f6 - fH) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f6;
            }
            float f11 = -dm5.H((float) d10);
            float f12 = (float) d13;
            float f13 = (2.0f * f11) - f12;
            float f14 = f13 < 0.0f ? 0.0f : f13;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            if (Math.abs(f14 - f13) > 1.05E-6f) {
                f14 = Float.NaN;
            }
            if (!Float.isNaN(f14)) {
                return f14;
            }
            float f15 = (-f11) - f12;
            f5 = f15 >= 0.0f ? f15 : 0.0f;
            f6 = f5 <= 1.0f ? f5 : 1.0f;
            if (Math.abs(f6 - f15) > 1.05E-6f) {
                return Float.NaN;
            }
            return f6;
        }
        double dSqrt3 = Math.sqrt(-d11);
        double d14 = (-d10) / dSqrt3;
        if (d14 < -1.0d) {
            d14 = -1.0d;
        }
        if (d14 > 1.0d) {
            d14 = 1.0d;
        }
        double dAcos = Math.acos(d14);
        double dH = dm5.H((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dH) - d13);
        float f16 = fCos < 0.0f ? 0.0f : fCos;
        if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (Math.abs(f16 - fCos) > 1.05E-6f) {
            f16 = Float.NaN;
        }
        if (!Float.isNaN(f16)) {
            return f16;
        }
        float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dH) - d13);
        float f17 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (Math.abs(f17 - fCos2) > 1.05E-6f) {
            f17 = Float.NaN;
        }
        if (!Float.isNaN(f17)) {
            return f17;
        }
        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dH) - d13);
        f5 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f6 = f5 <= 1.0f ? f5 : 1.0f;
        if (Math.abs(f6 - fCos3) > 1.05E-6f) {
            return Float.NaN;
        }
        return f6;
    }

    public static qq80 u(l0l l0lVar) {
        sq80 sq80Var;
        String str = l0lVar.G().a;
        int i = 4;
        int iM = 5;
        int i2 = 6;
        if (l0lVar instanceof nnr) {
            kx7 kx7Var = ((nnr) l0lVar).B.a;
            up7 up7Var = kx7Var.e;
            int i3 = up7Var != null ? up7Var.a : 0;
            int i4 = i3 == 0 ? -1 : rq80.a[l1d.C(i3)];
            luq0 luq0Var = luq0.e;
            if (i4 != 1) {
                iM = (i4 == 2 && kx7Var.d == luq0Var) ? 6 : yap1.m(hqq0.T(l0lVar));
            } else if (kx7Var.d != luq0Var) {
                iM = yap1.m(hqq0.T(l0lVar));
            }
            int iOrdinal = kx7Var.d.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    i2 = 7;
                } else if (iOrdinal == 2) {
                    i2 = 2;
                } else if (iOrdinal == 3) {
                    i2 = 3;
                } else if (iOrdinal != 4) {
                    eg.o();
                    return null;
                }
            }
            sq80Var = new sq80(iM, i2);
        } else {
            int iM2 = yap1.m(l0lVar.getType());
            if (l0lVar.l() && l0lVar.p() == 1) {
                i = 6;
            } else {
                int iC = l1d.C(l0lVar.p());
                if (iC == 0) {
                    i = 5;
                } else if (iC != 1) {
                    eg.o();
                    return null;
                }
            }
            sq80Var = new sq80(iM2, i);
        }
        return new qq80(str, sq80Var);
    }

    public static final b180 v() {
        b180 b180Var = a;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.Collection16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(8.375f, 1.098f);
        cwh0VarG.c(0.75f, 0.75f, false, true, 0.75f, 0.0f);
        cwh0VarG.k(5.5f, 3.175f);
        cwh0VarG.c(0.75f, 0.75f, false, true, 0.375f, 0.65f);
        cwh0VarG.j(15.0f, 15.25f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, 0.75f);
        cwh0VarG.i(-5.5f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -0.75f, -0.75f);
        cwh0VarG.j(8.0f, 1.747f);
        cwh0VarG.c(0.75f, 0.75f, false, true, 0.375f, -0.65f);
        hrt.o(cwh0VarG, 9.5f, 3.046f, 9.5f, 14.5f);
        cwh0VarG.i(4.0f);
        cwh0VarG.j(13.5f, 5.356f);
        cwh0VarG.e();
        cwh0VarG.l(1.0f, 1.75f);
        cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
        cwh0VarG.v(13.5f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
        cwh0VarG.e();
        cwh0VarG.l(4.5f, 1.75f);
        cwh0VarG.c(0.75f, 0.75f, false, true, 1.5f, 0.0f);
        cwh0VarG.v(13.5f);
        cwh0VarG.c(0.75f, 0.75f, false, true, -1.5f, 0.0f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        a = b180VarB;
        return b180VarB;
    }

    public static tdl0 w() {
        return new tdl0((byte) 16);
    }

    public static final String x(Resources resources, AdBreakContext adBreakContext, boolean z, Integer num) {
        if (z) {
            return resources.getString(2131952024);
        }
        if (num != null) {
            return resources.getQuantityString(2131820562, num.intValue(), num);
        }
        return adBreakContext != null ? resources.getString(2131952025, Long.valueOf(adBreakContext.positionInCurrentAdBreak()), Long.valueOf(adBreakContext.totalAdsInBreakEstimate())) : "";
    }

    public static void y(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            } else {
                n57.m("Parent is not a ViewGroup: ".concat(String.valueOf(parent)));
            }
        }
    }

    public static void z(BackKeyEditText backKeyEditText) {
        ((InputMethodManager) backKeyEditText.getContext().getSystemService("input_method")).showSoftInput(backKeyEditText, 1);
    }
}
