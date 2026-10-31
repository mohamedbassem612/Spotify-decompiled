package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class k8p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, int i2, boolean z, Function0 function0, b0k b0kVar, int i3) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-842413296);
        int i4 = i3 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.e(i2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            String strN0 = cwl1.n0(2131960499, new Object[]{Integer.valueOf(i)}, b0kVar3);
            String strH0 = ihc1.H0(cwl1.U(i2, i, new Object[]{Integer.valueOf(i)}, b0kVar3), strN0);
            ye5 ye5VarO = kk0.o(-2105315111, b0kVar3);
            uwr uwrVar = cbx.a;
            int iO = ye5VarO.o(new zma1(0L, 0L, cbx.d(b0kVar3).k.a.c, (FontStyle) null, (FontSynthesis) null, cbx.d(b0kVar3).k.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65499));
            try {
                ye5VarO.g(strN0);
                ye5VarO.k(iO);
                int iO2 = ye5VarO.o(new zma1(cbx.a(b0kVar3).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5VarO.g(strH0);
                    ye5VarO.k(iO2);
                    af5 af5VarP = ye5VarO.p();
                    b0kVar3.r(false);
                    lee1 lee1Var = cbx.d(b0kVar3).j;
                    cjc0 cjc0Var = new cjc0(1);
                    qim0 qim0VarX = nim0.a;
                    if (z) {
                        qim0VarX = bin.x(qim0VarX, false, null, null, null, function0, 15);
                    }
                    b0kVar2 = b0kVar3;
                    uwo1.f(af5VarP, qim0VarX, lee1Var, null, null, null, 2, false, cjc0Var, 0, null, null, b0kVar2, 1572864, 0, 3768);
                } catch (Throwable th) {
                    ye5VarO.k(iO2);
                    throw th;
                }
            } catch (Throwable th2) {
                ye5VarO.k(iO);
                throw th2;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new snv(i, i2, z, function0, i3, (byte) 1);
        }
    }

    public static final void b(r7x0 r7x0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1283625348);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(r7x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        boolean z2 = false;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            if (r7x0Var.m && r7x0Var.h) {
                z2 = true;
            }
            boolean z3 = z2;
            i8p1.e(384, apo.r(-787090602, new w830(z3, z, j, r7x0Var, iu30Var), x340Var), x340Var, null, z3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x830(r7x0Var, z, iu30Var, i, (byte) 0);
        }
    }

    public static final void c(r7x0 r7x0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1572694103);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(r7x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (r7x0Var.l) {
            x340Var.i0(1668335174);
            int i3 = r7x0Var.j;
            boolean z2 = !z;
            boolean z3 = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new y720(iu30Var, (byte) 26);
                x340Var.s0(objT);
            }
            a(i3, 2131820862, z2, (Function0) objT, x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(1668515501);
            b(r7x0Var, z, iu30Var, x340Var, i2 & 1022);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x830(r7x0Var, z, iu30Var, i, (byte) 1);
        }
    }

    public static final void d(s6j0 s6j0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1301687732);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.g(s6j0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var2).b.c;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(qim0Var3, f);
            mbh mbhVarA = jbh.a(new d36(cbx.b(x340Var2).b.b, true, new um5(false)), een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(s6j0Var.a, null, cbx.d(x340Var2).d, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2026);
            foo1.c(new gbx(z50.c, function0), new idx(8), null, null, null, null, null, null, null, null, apo.r(2135614337, new i4o(s6j0Var, (byte) 19), x340Var2), x340Var2, 0, 48, 2044);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok((Object) s6j0Var, (Object) function0, (Object) qim0Var2, i, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(ay8 ay8Var, onm onmVar) throws ItemUnavailableException, AbortFlowException {
        ql1 ql1Var;
        if (onmVar instanceof ql1) {
            ql1Var = (ql1) onmVar;
            int i = ql1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ql1Var.b = i - Integer.MIN_VALUE;
            } else {
                ql1Var = new ql1(onmVar);
            }
        } else {
            ql1Var = new ql1(onmVar);
        }
        Object objJ = ql1Var.a;
        int i2 = ql1Var.b;
        if (i2 == 0) {
            hm5.M(objJ);
            s4 s4Var = new s4(2, (lnm) null, (byte) 3);
            ql1Var.b = 1;
            objJ = b5p1.j(ay8Var, s4Var, ql1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object objG = u890.G((k1r) objJ);
        if (objG != null) {
            return objG;
        }
        throw new ItemUnavailableException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    public static final int f(kak0 kak0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        lhg1 lhg1Var2 = kak0Var.h;
        boolean z = kak0Var.r1;
        Boolean bool = kak0Var.t1;
        if (lhg1Var.a.a == b8w0.b) {
            return 3;
        }
        if (!lhg1Var.b.O0) {
            if (lhg1Var2 == null) {
                return !u890.j(bool, Boolean.FALSE) ? 3 : 3;
            }
            ruq0 ruq0Var = lhg1Var2.b;
            if (!ruq0Var.O0 || ruq0Var.X <= 0) {
                if (!u890.j(bool, Boolean.FALSE) || !z) {
                }
            }
        }
        return lhg1Var.b.O0 ? 1 : 2;
    }

    public static final er00 g(he81 he81Var) {
        String str = he81Var.e;
        String str2 = he81Var.B;
        if (he81Var.A != null) {
            return new dr00(true, k4m.d, he81Var.y, str2);
        }
        boolean z = he81Var.G == 5;
        ar00 ar00Var = new ar00(z ? 0 : he81Var.s, z ? "" : he81Var.t, (String) null);
        if (z && str2 != null) {
            str = str2;
        }
        u7h u7hVar = he81Var.p;
        return new cr00(false, ar00Var, str, u7hVar != null ? new i8h(String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(z4p1.G(u7h.b(u7hVar.a, 0.5f, 0.0f, 0.0f, 0.0f, 14)))}, 1))) : j8h.c);
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static LocaleList i() {
        return LocaleList.c;
    }

    public static int j(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static final boolean k(b9v0 b9v0Var) {
        return (b9v0Var == null || !b9v0Var.a || b9v0Var.b) ? false : true;
    }

    public static final boolean l(he81 he81Var) {
        return he81Var.A != null;
    }

    public static final g820 m(dk80 dk80Var, int i) {
        return new g820(dk80Var, new adh0(i));
    }

    public static txk0 n() {
        return new txk0((byte) 16);
    }

    public static final void o(View view, View view2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            eg.m("The replaced view must have a non-null ViewGroup parent");
            return;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeViewInLayout(view);
        view2.setId(view.getId());
        viewGroup.addView(view2, iIndexOfChild, view.getLayoutParams());
    }

    public static final void p(ExoPlayer exoPlayer, Object obj) {
        int iP0 = exoPlayer.p0();
        for (int i = 0; i < iP0; i++) {
            jca jcaVarS0 = exoPlayer.s0(i);
            if (jcaVarS0.b == 2) {
                sbu0 sbu0VarG = exoPlayer.G(jcaVarS0);
                sbu0VarG.d(14);
                sbu0VarG.c(obj);
                sbu0VarG.b();
            }
        }
    }

    public static final qim0 q(qim0 qim0Var, boolean z, qim0 qim0Var2) {
        return z ? qim0Var.then(qim0Var2) : qim0Var;
    }

    public static drj0 r(Object obj) {
        return new drj0(obj);
    }
}
