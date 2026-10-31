package p;

import android.icu.text.BreakIterator;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Next;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class w2g0 {
    public static volatile Handler a;
    public static final m280 b = new m280(false);
    public static b180 c;
    public static b180 d;

    public static final void a(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1045014008);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952258);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("all-followers-toggle", u291.f(qim0Var3, 1.0f));
            boolean zG = ((i3 & 112) == 32) | b0kVar3.g(strO0);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new mr3(strO0, iu30Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(s161.b(qim0VarN, true, (iu30) objT), (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-75399728, new ip0(iu30Var, (byte) 1), b0kVar3), apo.r(-749466513, new nr3(z, iu30Var, (byte) 0), b0kVar3), (xu30) null, (xu30) null, x5i.a, b0kVar2, 0, 197040, 26622);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new or3(z, iu30Var, qim0Var2, i);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2019298351);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            qim0 qim0VarH = u291.h(u291.f(h2c.a.a(nim0.a, een.X), 1.0f), 160.0f);
            Float fValueOf = Float.valueOf(0.0f);
            uwr uwrVar = cbx.a;
            t1c.a(dug.e(qim0VarH, v9c.t(new mmr0[]{new mmr0(fValueOf, new u7h(u7h.b(cbx.a(x340Var).a.c, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(cbx.a(x340Var).a.c, 0.96f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 28);
        }
    }

    public static final void c(qim0 qim0Var, tl3 tl3Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(380139498);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.g(tl3Var) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if ((i & 3072) == 0) {
            i6 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i6 & 1, (i6 & 1171) != 1170)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            if (i5 != 0) {
                tl3Var = een.d;
            }
            gfh0 gfh0VarC = t1c.c(tl3Var, false);
            boolean zG = x340Var.g(gfh0VarC) | ((i6 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new f14(gfh0VarC, j2iVar, (byte) 4);
                x340Var.s0(objT);
            }
            ejo1.l(i6 & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        tl3 tl3Var2 = tl3Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rd4(qim0Var2, tl3Var2, j2iVar, i, i2, (byte) 2);
        }
    }

    public static final void d(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar) {
        int i2;
        String str4;
        String str5;
        h311 h311VarV;
        ptd ptdVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1164153703);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= x340Var.g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= x340Var.g(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                scx scxVarM = pno1.m(x340Var);
                boolean zI = x340Var.i(ven0Var) | ((i2 & 7168) == 2048);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new cb(function0, ven0Var, (byte) 17);
                    x340Var.s0(objT2);
                }
                x74.f((Function0) objT2, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(344323814, new c9y(str, str2, scxVarM, str3, (byte) 4), x340Var), x340Var, 12582912, 48, 1916);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ptdVar = new ptd(str, str4, str5, function0, i, (byte) 1);
                }
            }
            h311VarV.d = ptdVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ptdVar = new ptd(str, str2, str3, function0, i, (byte) 2);
            h311VarV.d = ptdVar;
        }
    }

    public static final void e(String str, float f, b0k b0kVar, int i) {
        float f2;
        fxs0 fxs0Var;
        h311 h311VarV;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1917513888);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (str == null || str.length() == 0) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    fxs0Var = new fxs0(str, f, i, (byte) 1);
                }
            } else {
                wat watVar = (wat) x340Var.k(t4k.h);
                long jY = fc11.Y((watVar.X0(f) * 0.42f) / watVar.h(), 4294967296L);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = p9a1.V0;
                    x340Var.s0(objT);
                }
                qim0 qim0VarA = s161.a(nim0.a, (iu30) objT);
                uwr uwrVar = cbx.a;
                uwo1.e(str, qim0VarA, lee1.a(cbx.d(x340Var).a, 0L, jY, FontWeight.X, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744441), cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1776);
                f2 = f;
            }
            h311VarV.d = fxs0Var;
        }
        f2 = f;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            fxs0Var = new fxs0(str, f2, i, (byte) 2);
            h311VarV.d = fxs0Var;
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(332358895);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131960774);
            String strO1 = cwl1.o0(x340Var, 2131960773);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX = bin.x(dug.f(qim0VarZ, jC, er31.b(16.0f)), false, strO1, (pm31) null, (idn0) null, function0, 13);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new ry40(strO0, (byte) 23);
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarX2, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE2, lljVar4, 1.0f, true);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0VarQ);
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
            d7e.g(0, 1, x340Var, (qim0) null);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(strO0, (qim0) null, kk0.p(qim0Var3, 4.0f, x340Var, x340Var).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            x340Var.r(true);
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0Var2 = qim0Var3;
            op71.g(x340Var, u291.v(qim0Var2, 16.0f));
            w0h1.a(plx.c, isl.a, (qim0) null, cbx.a(x340Var).b.a, 0L, false, x340Var, plx.d | 48, 52);
            x340Var.r(true);
            cvx cvxVar5 = cbx.b(x340Var).b;
            x0d.s(qim0Var2, 16.0f, x340Var, true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 4);
        }
    }

    public static final void g(ob30 ob30Var, r9u0 r9u0Var, xym xymVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1619491096);
        int i2 = i | (x340Var.g(ob30Var) ? 4 : 2) | (x340Var.g(r9u0Var) ? 32 : 16) | (x340Var.g(xymVar) ? 256 : 128) | 3072 | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gra graVar = een.X;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = z1f0.T0;
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = z1f0.U0;
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            hm5.a(ob30Var, qim0Var3, iu30Var2, graVar, "FooterTransition", (iu30) objT2, apo.r(-355633108, new gk0(iu30Var, r9u0Var, xymVar), x340Var), x340Var, (i2 & 14) | 1797552, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 26, i, ob30Var, r9u0Var, xymVar, qim0Var2, iu30Var);
        }
    }

    public static final void h(Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-752136290);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            WeakHashMap weakHashMap = osl1.x;
            function1 = function0;
            anm1.a(function1, new i3u(231, false, false, false, false), apo.r(-459348427, new kpw0(lhc.g(x340Var).l, j2iVar, (byte) 0), x340Var), x340Var, (i2 & 14) | 432, 0);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bu9(function1, j2iVar, i, (byte) 3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(y3g0 y3g0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        m4c m4cVar = fkj0.X;
        int i2 = y3g0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1589288872);
        j06 j06Var = x340Var.a;
        int i3 = (x340Var.g(y3g0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = u291.x(0.0f, 472.0f, 1, nim0Var);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarX2 = uyn1.x(dug.f(qim0VarX, jC, er31.b(8.0f)), cbx.b(x340Var).e.c);
            era eraVar = een.Q0;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
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
            int iC = l1d.C(i2);
            if (iC == 0) {
                x340Var.i0(-1992126190);
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -1992128240, false);
                }
                x340Var.i0(-1992123904);
                x340Var.r(false);
            }
            uwo1.e("", (qim0) null, lee1.a(cbx.d(x340Var).e, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744447), 0L, (a0e1) null, (iu30) null, 2, false, new zic0(2), 0, (qx8) null, x340Var, 1572864, 0, 1722);
            qim0 qim0VarF = nho1.F(nim0Var);
            mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            x340Var.i0(1249299802);
            for (r3g0 r3g0Var : n(i2)) {
                boolean z2 = r3g0Var == y3g0Var.c;
                boolean zE = ((i3 & 112) == 32) | x340Var.e(r3g0Var.ordinal());
                Object objT = x340Var.T();
                if (zE || objT == m4cVar) {
                    objT = new wpu0(iu30Var, r3g0Var, (byte) 28);
                    x340Var.s0(objT);
                }
                j(r3g0Var, z2, (Function0) objT, x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            idx idxVar = new idx(4);
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new wpu0((byte) 29, y3g0Var, iu30Var);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0("")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(""), function0), idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(282735683, new xgr0((byte) 17, 2, false), x340Var), x340Var, 0, 48, 2044);
                x340Var = x340Var;
                x340Var.r(true);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new myi(y3g0Var, iu30Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void j(r3g0 r3g0Var, boolean z, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        hux huxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-251538590);
        int i2 = i | (b0kVar3.e(r3g0Var.ordinal()) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = r3g0Var.ordinal();
            if (iOrdinal == 0) {
                b0kVar3.i0(1131985033);
                huxVar = orx.c;
                b0kVar3.r(false);
            } else if (iOrdinal == 1) {
                b0kVar3.i0(1132157703);
                huxVar = pox.c;
                b0kVar3.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw p3d1.k(b0kVar3, -1210411123, false);
                }
                b0kVar3.i0(1132338402);
                huxVar = rnx.c;
                b0kVar3.r(false);
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new mj10((byte) 20, z);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            if (ihc1.y0("")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarB, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(""), function0), (gbx) null, apo.r(-860542568, new g70(huxVar, (byte) 8), b0kVar3), (xu30) null, (xu30) null, apo.r(-1472235366, new ac8(3, (byte) 23), b0kVar3), apo.r(1374725083, new epe0((byte) 11, z), b0kVar3), (xu30) null, (xu30) null, apo.r(1325671838, new ac8(3, (byte) 24), b0kVar3), b0kVar2, 100663296, 197040, 26302);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(r3g0Var, z, function0, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:106:0x0201  */
    /* JADX WARN: Code duplicated, block: B:108:0x0206  */
    /* JADX WARN: Code duplicated, block: B:111:0x0213  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x014a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0151  */
    /* JADX WARN: Code duplicated, block: B:93:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x0177  */
    /* JADX WARN: Code duplicated, block: B:97:0x0182  */
    /* JADX WARN: Code duplicated, block: B:99:0x018e  */
    public static final void k(String str, String str2, float f, qim0 qim0Var, u7h u7hVar, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        u7h u7hVar2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        qim0 qim0Var2;
        u7h u7hVar3;
        boolean z4;
        h311 h311VarV;
        qim0 qim0Var3;
        u7h u7hVar4;
        boolean z5;
        boolean z6;
        Object objT;
        String str3;
        qim0 qim0VarQ;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Object objT2;
        ven0 ven0Var;
        boolean zI;
        Object objT3;
        boolean zBooleanValue;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-891763308);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.d(f) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                i3 |= x340Var.i(qim0Var) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    u7hVar2 = u7hVar;
                    if (x340Var.g(u7hVar2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (x340Var.h(z2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((74899 & i3) != 74898) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i3 & 1, z3)) {
                        if (i8 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i4 != 0) {
                            u7hVar4 = null;
                        } else {
                            u7hVar4 = u7hVar2;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if ((i3 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objT = x340Var.T();
                        if (z6 || objT == m4cVar) {
                            if (ihc1.y0(str2)) {
                                objT = null;
                            } else {
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(str2);
                                objT = str2.substring(0, characterInstance.next()).toUpperCase(Locale.ROOT);
                            }
                            x340Var.s0(objT);
                        }
                        str3 = (String) objT;
                        if (u7hVar4 != null) {
                            x340Var.i0(2147320594);
                            qim0 qim0VarQ2 = i1p1.q(u291.r(qim0Var3, f), er31.a);
                            long j = u7hVar4.a;
                            uwr uwrVar = cbx.a;
                            qim0VarQ = i1p1.o(qim0VarQ2, j, cbx.a(x340Var).a.a.a());
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-2147427563);
                            x340Var.r(false);
                            qim0VarQ = i1p1.q(u291.r(qim0Var3, f), er31.a);
                        }
                        gfh0VarC = t1c.c(een.h, false);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarQ);
                        hzj.A.getClass();
                        if (x340Var.a != null) {
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
                        if (z5) {
                            x340Var.i0(-1654036983);
                            x340Var.r(false);
                            zBooleanValue = true;
                        } else {
                            x340Var.i0(-1654016512);
                            objT2 = x340Var.T();
                            if (objT2 == m4cVar) {
                                objT2 = v8r.q(Boolean.FALSE);
                                x340Var.s0(objT2);
                            }
                            ven0Var = (ven0) objT2;
                            zI = x340Var.i(ven0Var);
                            objT3 = x340Var.T();
                            if (zI || objT3 == m4cVar) {
                                objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                                x340Var.s0(objT3);
                            }
                            qxd0.t(rih1.a, x340Var, (vu30) objT3);
                            zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                            x340Var.r(false);
                        }
                        uwr uwrVar2 = cbx.a;
                        fq7.g(zBooleanValue, (qim0) null, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), (ln00) null, (String) null, apo.r(1891258610, new caa1(str, str3, f, (byte) 0), x340Var), x340Var, 196608, 26);
                        x340Var.r(true);
                        qim0Var2 = qim0Var3;
                        u7hVar3 = u7hVar4;
                        z4 = z5;
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                        u7hVar3 = u7hVar2;
                        z4 = z2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new gvb(str, str2, f, qim0Var2, u7hVar3, z4, i, i2);
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    if (i8 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        u7hVar4 = null;
                    } else {
                        u7hVar4 = u7hVar2;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if ((i3 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objT = x340Var.T();
                    if (z6) {
                        if (ihc1.y0(str2)) {
                            objT = null;
                        } else {
                            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                            characterInstance2.setText(str2);
                            objT = str2.substring(0, characterInstance2.next()).toUpperCase(Locale.ROOT);
                        }
                        x340Var.s0(objT);
                    } else {
                        if (ihc1.y0(str2)) {
                            objT = null;
                        } else {
                            BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                            characterInstance3.setText(str2);
                            objT = str2.substring(0, characterInstance3.next()).toUpperCase(Locale.ROOT);
                        }
                        x340Var.s0(objT);
                    }
                    str3 = (String) objT;
                    if (u7hVar4 != null) {
                        x340Var.i0(2147320594);
                        qim0 qim0VarQ3 = i1p1.q(u291.r(qim0Var3, f), er31.a);
                        long j2 = u7hVar4.a;
                        uwr uwrVar3 = cbx.a;
                        qim0VarQ = i1p1.o(qim0VarQ3, j2, cbx.a(x340Var).a.a.a());
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-2147427563);
                        x340Var.r(false);
                        qim0VarQ = i1p1.q(u291.r(qim0Var3, f), er31.a);
                    }
                    gfh0VarC = t1c.c(een.h, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarQ);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
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
                    if (z5) {
                        x340Var.i0(-1654036983);
                        x340Var.r(false);
                        zBooleanValue = true;
                    } else {
                        x340Var.i0(-1654016512);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = v8r.q(Boolean.FALSE);
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        zI = x340Var.i(ven0Var);
                        objT3 = x340Var.T();
                        if (zI) {
                            objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                            x340Var.s0(objT3);
                        }
                        qxd0.t(rih1.a, x340Var, (vu30) objT3);
                        zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                        x340Var.r(false);
                    }
                    uwr uwrVar4 = cbx.a;
                    fq7.g(zBooleanValue, (qim0) null, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), (ln00) null, (String) null, apo.r(1891258610, new caa1(str, str3, f, (byte) 0), x340Var), x340Var, 196608, 26);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                    u7hVar3 = u7hVar4;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    u7hVar3 = u7hVar2;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new gvb(str, str2, f, qim0Var2, u7hVar3, z4, i, i2);
                }
            }
            i3 |= 24576;
            u7hVar2 = u7hVar;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    if (i8 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        u7hVar4 = null;
                    } else {
                        u7hVar4 = u7hVar2;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if ((i3 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objT = x340Var.T();
                    if (z6) {
                        if (ihc1.y0(str2)) {
                            objT = null;
                        } else {
                            BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
                            characterInstance4.setText(str2);
                            objT = str2.substring(0, characterInstance4.next()).toUpperCase(Locale.ROOT);
                        }
                        x340Var.s0(objT);
                    } else {
                        if (ihc1.y0(str2)) {
                            objT = null;
                        } else {
                            BreakIterator characterInstance5 = BreakIterator.getCharacterInstance();
                            characterInstance5.setText(str2);
                            objT = str2.substring(0, characterInstance5.next()).toUpperCase(Locale.ROOT);
                        }
                        x340Var.s0(objT);
                    }
                    str3 = (String) objT;
                    if (u7hVar4 != null) {
                        x340Var.i0(2147320594);
                        qim0 qim0VarQ4 = i1p1.q(u291.r(qim0Var3, f), er31.a);
                        long j3 = u7hVar4.a;
                        uwr uwrVar5 = cbx.a;
                        qim0VarQ = i1p1.o(qim0VarQ4, j3, cbx.a(x340Var).a.a.a());
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-2147427563);
                        x340Var.r(false);
                        qim0VarQ = i1p1.q(u291.r(qim0Var3, f), er31.a);
                    }
                    gfh0VarC = t1c.c(een.h, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarQ);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
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
                    if (z5) {
                        x340Var.i0(-1654036983);
                        x340Var.r(false);
                        zBooleanValue = true;
                    } else {
                        x340Var.i0(-1654016512);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = v8r.q(Boolean.FALSE);
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        zI = x340Var.i(ven0Var);
                        objT3 = x340Var.T();
                        if (zI) {
                            objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                            x340Var.s0(objT3);
                        }
                        qxd0.t(rih1.a, x340Var, (vu30) objT3);
                        zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                        x340Var.r(false);
                    }
                    uwr uwrVar6 = cbx.a;
                    fq7.g(zBooleanValue, (qim0) null, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), (ln00) null, (String) null, apo.r(1891258610, new caa1(str, str3, f, (byte) 0), x340Var), x340Var, 196608, 26);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                    u7hVar3 = u7hVar4;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    u7hVar3 = u7hVar2;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new gvb(str, str2, f, qim0Var2, u7hVar3, z4, i, i2);
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i8 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i4 != 0) {
                    u7hVar4 = null;
                } else {
                    u7hVar4 = u7hVar2;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if ((i3 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT = x340Var.T();
                if (z6) {
                    if (ihc1.y0(str2)) {
                        objT = null;
                    } else {
                        BreakIterator characterInstance6 = BreakIterator.getCharacterInstance();
                        characterInstance6.setText(str2);
                        objT = str2.substring(0, characterInstance6.next()).toUpperCase(Locale.ROOT);
                    }
                    x340Var.s0(objT);
                } else {
                    if (ihc1.y0(str2)) {
                        objT = null;
                    } else {
                        BreakIterator characterInstance7 = BreakIterator.getCharacterInstance();
                        characterInstance7.setText(str2);
                        objT = str2.substring(0, characterInstance7.next()).toUpperCase(Locale.ROOT);
                    }
                    x340Var.s0(objT);
                }
                str3 = (String) objT;
                if (u7hVar4 != null) {
                    x340Var.i0(2147320594);
                    qim0 qim0VarQ5 = i1p1.q(u291.r(qim0Var3, f), er31.a);
                    long j4 = u7hVar4.a;
                    uwr uwrVar7 = cbx.a;
                    qim0VarQ = i1p1.o(qim0VarQ5, j4, cbx.a(x340Var).a.a.a());
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2147427563);
                    x340Var.r(false);
                    qim0VarQ = i1p1.q(u291.r(qim0Var3, f), er31.a);
                }
                gfh0VarC = t1c.c(een.h, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarQ);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                if (z5) {
                    x340Var.i0(-1654036983);
                    x340Var.r(false);
                    zBooleanValue = true;
                } else {
                    x340Var.i0(-1654016512);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    zI = x340Var.i(ven0Var);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT3);
                    zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    x340Var.r(false);
                }
                uwr uwrVar8 = cbx.a;
                fq7.g(zBooleanValue, (qim0) null, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), (ln00) null, (String) null, apo.r(1891258610, new caa1(str, str3, f, (byte) 0), x340Var), x340Var, 196608, 26);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
                u7hVar3 = u7hVar4;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar3 = u7hVar2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gvb(str, str2, f, qim0Var2, u7hVar3, z4, i, i2);
            }
        }
        i3 |= 3072;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                u7hVar2 = u7hVar;
                if (x340Var.g(u7hVar2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    if (i8 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        u7hVar4 = null;
                    } else {
                        u7hVar4 = u7hVar2;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if ((i3 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objT = x340Var.T();
                    if (z6) {
                        if (ihc1.y0(str2)) {
                            objT = null;
                        } else {
                            BreakIterator characterInstance8 = BreakIterator.getCharacterInstance();
                            characterInstance8.setText(str2);
                            objT = str2.substring(0, characterInstance8.next()).toUpperCase(Locale.ROOT);
                        }
                        x340Var.s0(objT);
                    } else {
                        if (ihc1.y0(str2)) {
                            objT = null;
                        } else {
                            BreakIterator characterInstance9 = BreakIterator.getCharacterInstance();
                            characterInstance9.setText(str2);
                            objT = str2.substring(0, characterInstance9.next()).toUpperCase(Locale.ROOT);
                        }
                        x340Var.s0(objT);
                    }
                    str3 = (String) objT;
                    if (u7hVar4 != null) {
                        x340Var.i0(2147320594);
                        qim0 qim0VarQ6 = i1p1.q(u291.r(qim0Var3, f), er31.a);
                        long j5 = u7hVar4.a;
                        uwr uwrVar9 = cbx.a;
                        qim0VarQ = i1p1.o(qim0VarQ6, j5, cbx.a(x340Var).a.a.a());
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-2147427563);
                        x340Var.r(false);
                        qim0VarQ = i1p1.q(u291.r(qim0Var3, f), er31.a);
                    }
                    gfh0VarC = t1c.c(een.h, false);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarQ);
                    hzj.A.getClass();
                    if (x340Var.a != null) {
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
                    if (z5) {
                        x340Var.i0(-1654036983);
                        x340Var.r(false);
                        zBooleanValue = true;
                    } else {
                        x340Var.i0(-1654016512);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = v8r.q(Boolean.FALSE);
                            x340Var.s0(objT2);
                        }
                        ven0Var = (ven0) objT2;
                        zI = x340Var.i(ven0Var);
                        objT3 = x340Var.T();
                        if (zI) {
                            objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                            x340Var.s0(objT3);
                        }
                        qxd0.t(rih1.a, x340Var, (vu30) objT3);
                        zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                        x340Var.r(false);
                    }
                    uwr uwrVar10 = cbx.a;
                    fq7.g(zBooleanValue, (qim0) null, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), (ln00) null, (String) null, apo.r(1891258610, new caa1(str, str3, f, (byte) 0), x340Var), x340Var, 196608, 26);
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                    u7hVar3 = u7hVar4;
                    z4 = z5;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    u7hVar3 = u7hVar2;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new gvb(str, str2, f, qim0Var2, u7hVar3, z4, i, i2);
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i8 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i4 != 0) {
                    u7hVar4 = null;
                } else {
                    u7hVar4 = u7hVar2;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if ((i3 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT = x340Var.T();
                if (z6) {
                    if (ihc1.y0(str2)) {
                        objT = null;
                    } else {
                        BreakIterator characterInstance10 = BreakIterator.getCharacterInstance();
                        characterInstance10.setText(str2);
                        objT = str2.substring(0, characterInstance10.next()).toUpperCase(Locale.ROOT);
                    }
                    x340Var.s0(objT);
                } else {
                    if (ihc1.y0(str2)) {
                        objT = null;
                    } else {
                        BreakIterator characterInstance11 = BreakIterator.getCharacterInstance();
                        characterInstance11.setText(str2);
                        objT = str2.substring(0, characterInstance11.next()).toUpperCase(Locale.ROOT);
                    }
                    x340Var.s0(objT);
                }
                str3 = (String) objT;
                if (u7hVar4 != null) {
                    x340Var.i0(2147320594);
                    qim0 qim0VarQ7 = i1p1.q(u291.r(qim0Var3, f), er31.a);
                    long j6 = u7hVar4.a;
                    uwr uwrVar11 = cbx.a;
                    qim0VarQ = i1p1.o(qim0VarQ7, j6, cbx.a(x340Var).a.a.a());
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2147427563);
                    x340Var.r(false);
                    qim0VarQ = i1p1.q(u291.r(qim0Var3, f), er31.a);
                }
                gfh0VarC = t1c.c(een.h, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarQ);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                if (z5) {
                    x340Var.i0(-1654036983);
                    x340Var.r(false);
                    zBooleanValue = true;
                } else {
                    x340Var.i0(-1654016512);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    zI = x340Var.i(ven0Var);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT3);
                    zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    x340Var.r(false);
                }
                uwr uwrVar12 = cbx.a;
                fq7.g(zBooleanValue, (qim0) null, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), (ln00) null, (String) null, apo.r(1891258610, new caa1(str, str3, f, (byte) 0), x340Var), x340Var, 196608, 26);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
                u7hVar3 = u7hVar4;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar3 = u7hVar2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gvb(str, str2, f, qim0Var2, u7hVar3, z4, i, i2);
            }
        }
        i3 |= 24576;
        u7hVar2 = u7hVar;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i8 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i4 != 0) {
                    u7hVar4 = null;
                } else {
                    u7hVar4 = u7hVar2;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if ((i3 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT = x340Var.T();
                if (z6) {
                    if (ihc1.y0(str2)) {
                        objT = null;
                    } else {
                        BreakIterator characterInstance12 = BreakIterator.getCharacterInstance();
                        characterInstance12.setText(str2);
                        objT = str2.substring(0, characterInstance12.next()).toUpperCase(Locale.ROOT);
                    }
                    x340Var.s0(objT);
                } else {
                    if (ihc1.y0(str2)) {
                        objT = null;
                    } else {
                        BreakIterator characterInstance13 = BreakIterator.getCharacterInstance();
                        characterInstance13.setText(str2);
                        objT = str2.substring(0, characterInstance13.next()).toUpperCase(Locale.ROOT);
                    }
                    x340Var.s0(objT);
                }
                str3 = (String) objT;
                if (u7hVar4 != null) {
                    x340Var.i0(2147320594);
                    qim0 qim0VarQ8 = i1p1.q(u291.r(qim0Var3, f), er31.a);
                    long j7 = u7hVar4.a;
                    uwr uwrVar13 = cbx.a;
                    qim0VarQ = i1p1.o(qim0VarQ8, j7, cbx.a(x340Var).a.a.a());
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2147427563);
                    x340Var.r(false);
                    qim0VarQ = i1p1.q(u291.r(qim0Var3, f), er31.a);
                }
                gfh0VarC = t1c.c(een.h, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarQ);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                if (z5) {
                    x340Var.i0(-1654036983);
                    x340Var.r(false);
                    zBooleanValue = true;
                } else {
                    x340Var.i0(-1654016512);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT2);
                    }
                    ven0Var = (ven0) objT2;
                    zI = x340Var.i(ven0Var);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT3);
                    zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    x340Var.r(false);
                }
                uwr uwrVar14 = cbx.a;
                fq7.g(zBooleanValue, (qim0) null, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), (ln00) null, (String) null, apo.r(1891258610, new caa1(str, str3, f, (byte) 0), x340Var), x340Var, 196608, 26);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
                u7hVar3 = u7hVar4;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar3 = u7hVar2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gvb(str, str2, f, qim0Var2, u7hVar3, z4, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i8 != 0) {
                qim0Var3 = nim0.a;
            } else {
                qim0Var3 = qim0Var;
            }
            if (i4 != 0) {
                u7hVar4 = null;
            } else {
                u7hVar4 = u7hVar2;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if ((i3 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            objT = x340Var.T();
            if (z6) {
                if (ihc1.y0(str2)) {
                    objT = null;
                } else {
                    BreakIterator characterInstance14 = BreakIterator.getCharacterInstance();
                    characterInstance14.setText(str2);
                    objT = str2.substring(0, characterInstance14.next()).toUpperCase(Locale.ROOT);
                }
                x340Var.s0(objT);
            } else {
                if (ihc1.y0(str2)) {
                    objT = null;
                } else {
                    BreakIterator characterInstance15 = BreakIterator.getCharacterInstance();
                    characterInstance15.setText(str2);
                    objT = str2.substring(0, characterInstance15.next()).toUpperCase(Locale.ROOT);
                }
                x340Var.s0(objT);
            }
            str3 = (String) objT;
            if (u7hVar4 != null) {
                x340Var.i0(2147320594);
                qim0 qim0VarQ9 = i1p1.q(u291.r(qim0Var3, f), er31.a);
                long j8 = u7hVar4.a;
                uwr uwrVar15 = cbx.a;
                qim0VarQ = i1p1.o(qim0VarQ9, j8, cbx.a(x340Var).a.a.a());
                x340Var.r(false);
            } else {
                x340Var.i0(-2147427563);
                x340Var.r(false);
                qim0VarQ = i1p1.q(u291.r(qim0Var3, f), er31.a);
            }
            gfh0VarC = t1c.c(een.h, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            if (z5) {
                x340Var.i0(-1654036983);
                x340Var.r(false);
                zBooleanValue = true;
            } else {
                x340Var.i0(-1654016512);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                zI = x340Var.i(ven0Var);
                objT3 = x340Var.T();
                if (zI) {
                    objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new hj6(ven0Var, (lnm) null, (byte) 22);
                    x340Var.s0(objT3);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT3);
                zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                x340Var.r(false);
            }
            uwr uwrVar16 = cbx.a;
            fq7.g(zBooleanValue, (qim0) null, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), (ln00) null, (String) null, apo.r(1891258610, new caa1(str, str3, f, (byte) 0), x340Var), x340Var, 196608, 26);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
            u7hVar3 = u7hVar4;
            z4 = z5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            u7hVar3 = u7hVar2;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gvb(str, str2, f, qim0Var2, u7hVar3, z4, i, i2);
        }
    }

    public static final void l(LockedBadgeView lockedBadgeView, EnhancedBadgeView enhancedBadgeView, ContentRestrictionBadgeView contentRestrictionBadgeView, PremiumBadgeView premiumBadgeView, DownloadBadgeView downloadBadgeView) {
        List listM = p7h.M(new AppCompatImageView[]{lockedBadgeView, enhancedBadgeView, contentRestrictionBadgeView, downloadBadgeView, premiumBadgeView});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((AppCompatImageView) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = o7h.k0(arrayList, 3).iterator();
        while (it.hasNext()) {
            ((AppCompatImageView) it.next()).setVisibility(8);
        }
    }

    public static Handler m() {
        if (a != null) {
            return a;
        }
        synchronized (w2g0.class) {
            try {
                if (a == null) {
                    a = zno1.g(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final List n(int i) {
        int iC = l1d.C(i);
        r3g0 r3g0Var = r3g0.a;
        if (iC == 0) {
            return p7h.M(new r3g0[]{r3g0Var, r3g0.b});
        }
        if (iC == 1) {
            return p7h.M(new r3g0[]{r3g0.c, r3g0Var});
        }
        eg.o();
        return null;
    }

    public static final Next o(oxk oxkVar, dyh1 dyh1Var) {
        lrn lrnVar;
        g1e g1eVar = oxkVar.s;
        g1e g1eVar2 = g1eVar instanceof g1e ? g1eVar : null;
        if (g1eVar2 == null) {
            return Next.j();
        }
        if (dyh1Var instanceof byh1) {
            String str = g1eVar2.a;
            byh1 byh1Var = (byh1) dyh1Var;
            String str2 = byh1Var.a;
            return Next.h(oxk.a(oxkVar, (String) null, (qxk) null, (c380) null, (yxk) null, (sxk) null, s781.a(oxkVar.f, str), (gmc1) null, false, false, false, (nyb) null, byh1Var, str2, false, (mrn) null, new e1e(new f27(str, str2, true)), 0, (sxk) null, (c380) null, (u380) null, (u380) null, false, (c380) null, (String) null, (r591) null, (String) null, 536035295));
        }
        if (!(dyh1Var instanceof zxh1)) {
            return Next.h(oxk.a(oxkVar, (String) null, (qxk) null, (c380) null, (yxk) null, (sxk) null, (s781) null, (gmc1) null, false, false, false, (nyb) null, dyh1Var, (String) null, false, (mrn) null, (h1e) null, 0, (sxk) null, (c380) null, (u380) null, (u380) null, false, (c380) null, (String) null, (r591) null, (String) null, 536854527));
        }
        zxh1 zxh1Var = (zxh1) dyh1Var;
        jk7 jk7Var = zxh1Var.a;
        if (jk7Var instanceof jk7) {
            lrnVar = new lrn(jk7Var.a);
        } else {
            if (!jk7Var.equals(kk7.a)) {
                eg.o();
                return null;
            }
            lrnVar = krn.a;
        }
        return Next.h(oxk.a(oxkVar, (String) null, (qxk) null, (c380) null, (yxk) null, (sxk) null, (s781) null, (gmc1) null, false, false, false, (nyb) null, zxh1Var, (String) null, false, lrnVar, f1e.a, 0, (sxk) null, (c380) null, (u380) null, (u380) null, false, (c380) null, (String) null, (r591) null, (String) null, 536461311));
    }

    public static final View p(ks6 ks6Var, int i) {
        ViewStub viewStub = (ViewStub) ks6Var.b;
        viewStub.setLayoutResource(i);
        return viewStub.inflate();
    }

    public static final void q(ks6 ks6Var, gw70 gw70Var) {
        ConstraintLayout constraintLayout = (ConstraintLayout) ks6Var.a;
        eqq.t(-1, -2, constraintLayout);
        View view = (ArtworkView) ks6Var.d;
        view.setViewContext(new f47(gw70Var));
        ((QuickActionView) ks6Var.Z).setViewContext(new zez0(constraintLayout.getContext(), gw70Var));
        v9w0 v9w0VarQ = b2u.q(constraintLayout);
        Collections.addAll(v9w0VarQ.c, (TextView) ks6Var.R0, (TextView) ks6Var.Q0);
        Collections.addAll(v9w0VarQ.d, view);
        v9w0VarQ.e = false;
        v9w0VarQ.a();
    }

    public static final boolean r(qlf1 qlf1Var) {
        return !qlf1Var.i.equals(gql.b) || qlf1Var.t;
    }

    public static final lvl0 s(urk0 urk0Var, plf1 plf1Var) {
        d8r0 d8r0Var = plf1Var.h;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), plf1Var.i, (byte) 3);
    }

    public static final EventSource t(Observable observable, ObservableFromPublisher observableFromPublisher, PublishSubject publishSubject, Observable observable2) {
        return RxEventSources.a(new ObservableSource[]{observable.map(q9w.a1), observableFromPublisher.distinctUntilChanged(s9w.Z0).map(t9w.Y0), publishSubject.map(mif1.Z0), observable2.map(p9w.Z0)});
    }

    public static int u(bae baeVar, int i, int i2, int i3) {
        dm5.m(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        eth.i(eth.i(i4, i5), 1 << i3);
        if (baeVar.b() < i) {
            return -1;
        }
        int iG = baeVar.g(i);
        if (iG == i4) {
            if (baeVar.b() < i2) {
                return -1;
            }
            int iG2 = baeVar.g(i2);
            iG += iG2;
            if (iG2 == i5) {
                if (baeVar.b() < i3) {
                    return -1;
                }
                return baeVar.g(i3) + iG;
            }
        }
        return iG;
    }

    public static final lee1 v(b0k b0kVar) {
        x340 x340Var;
        uwr uwrVar = cbx.a;
        yfu yfuVar = ajx.a;
        lee1 lee1VarA = cbx.d(b0kVar).a;
        dvx dvxVar = cbx.b(b0kVar).a;
        x340 x340Var2 = (x340) b0kVar;
        boolean zG = x340Var2.g(yfuVar) | x340Var2.g(lee1VarA) | x340Var2.g(dvxVar);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            if (Build.VERSION.SDK_INT < 29) {
                x340Var = x340Var2;
            } else {
                Object obj = yfuVar.b;
                i930 i930VarD = hm5.d(new a930[]{o0c.a(14, (FontWeight) null, new ja30(new ga30[]{u890.I(150.0f), u890.H(((FontWeight) ((bjx) yfuVar.c).f).a)}))});
                x340Var = x340Var2;
                lee1VarA = lee1.a(lee1VarA, 0L, dvxVar.j, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, i930VarD, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777173);
            }
            x340Var.s0(lee1VarA);
            objT = lee1VarA;
        }
        return (lee1) objT;
    }

    public static final void w(ks6 ks6Var, boolean z) {
        ((ArtworkView) ks6Var.d).setEnabled(z);
        ((TextView) ks6Var.R0).setEnabled(z);
        ((TextView) ks6Var.Q0).setEnabled(z);
        ((LockedBadgeView) ks6Var.i).setEnabled(z);
        ((EnhancedBadgeView) ks6Var.f).setEnabled(z);
        ((DownloadBadgeView) ks6Var.e).setEnabled(z);
        ((ContentRestrictionBadgeView) ks6Var.N0).setEnabled(z);
        ((PremiumBadgeView) ks6Var.X).setEnabled(z);
    }

    public static void x(bae baeVar) {
        baeVar.o(3);
        baeVar.o(8);
        boolean zF = baeVar.f();
        boolean zF2 = baeVar.f();
        if (zF) {
            baeVar.o(5);
        }
        if (zF2) {
            baeVar.o(6);
        }
    }

    public static void y(bae baeVar) {
        int iG;
        int iG2 = baeVar.g(2);
        if (iG2 == 0) {
            baeVar.o(6);
            return;
        }
        int iU = u(baeVar, 5, 8, 16) + 1;
        if (iG2 == 1) {
            baeVar.o(iU * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = baeVar.f();
            int i = zF ? 1 : 5;
            int i2 = zF ? 7 : 5;
            int i3 = zF ? 8 : 6;
            int i4 = 0;
            while (i4 < iU) {
                if (baeVar.f()) {
                    baeVar.o(7);
                    iG = 0;
                } else {
                    if (baeVar.g(2) == 3 && baeVar.g(i2) * i != 0) {
                        baeVar.n();
                    }
                    iG = baeVar.g(i3) * i;
                    if (iG != 0 && iG != 180) {
                        baeVar.n();
                    }
                    baeVar.n();
                }
                if (iG != 0 && iG != 180 && baeVar.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
