package p;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
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
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class crn1 {
    public static b180 a;

    public static final void a(tob1 tob1Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(376627328);
        int i2 = (x340Var.g(tob1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ctd1(tob1Var, (byte) 28);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarF, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1((Object) tob1Var, qim0Var2, j2iVar, i, (byte) 3);
        }
    }

    public static final void b(kl50 kl50Var, Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(578630702);
        int i2 = (i & 6) == 0 ? (x340Var.i(kl50Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            List list = kl50Var.c;
            boolean zG = x340Var.g(list);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                List<jl50> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (jl50 jl50Var : list2) {
                    arrayList.add(new phx(2, bro1.q(jl50Var.d), jl50Var.c, (String) null, jl50Var.b));
                }
                objT = mqo1.A(arrayList);
                x340Var.s0(objT);
            }
            c380 c380Var = (c380) objT;
            boolean zG2 = x340Var.g(list);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    yk50 yk50Var = ((jl50) obj).e;
                    if ((yk50Var != null ? yk50Var.c : null) instanceof gl50) {
                        arrayList2.add(obj);
                    }
                }
                objT2 = mqo1.A(arrayList2);
                x340Var.s0(objT2);
            }
            int i4 = i2;
            lgo1.c(apo.r(30387597, new ql50(c380Var, (byte) 0), x340Var), function0, u(kl50Var), nim0Var, 0, apo.r(-330487177, new ql50((c380) objT2, (byte) 1), x340Var), x340Var, (i4 & 112) | 196614 | ((i4 << 3) & 7168), 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(kl50Var, function0, i);
        }
    }

    public static final void c(kl50 kl50Var, jl50 jl50Var, String str, String str2, Function0 function0, b0k b0kVar, int i) {
        boolean z;
        String strN0;
        String strN1;
        List list = kl50Var.c;
        String str3 = jl50Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(956888012);
        int i2 = (i & 6) == 0 ? (x340Var.i(kl50Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(jl50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zG = x340Var.g(list);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                List<jl50> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (jl50 jl50Var2 : list2) {
                    arrayList.add(new phx(2, bro1.q(jl50Var2.d), jl50Var2.c, (String) null, jl50Var2.b));
                }
                objT = mqo1.A(arrayList);
                x340Var.s0(objT);
            }
            c380 c380Var = (c380) objT;
            if (str != null) {
                x340Var.i0(953191276);
                strN0 = cwl1.n0(2131957386, new Object[]{str3, str}, x340Var);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(953361962);
                x340Var.r(false);
                strN0 = str3;
            }
            if (str2 == null) {
                x340Var.i0(953472569);
                x340Var.r(z);
                strN1 = null;
            } else {
                x340Var.i0(953472570);
                strN1 = cwl1.n0(2131957387, new Object[]{str3, str2}, x340Var);
                x340Var.r(z);
            }
            lgo1.c(apo.r(-2138794227, new ql50(c380Var, (byte) 2), x340Var), function0, u(kl50Var), nim0Var, 0, apo.r(1317689315, new xo6(strN1, strN0, (byte) 8), x340Var), x340Var, ((i2 >> 9) & 112) | 196614 | ((i2 >> 6) & 7168), 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq(kl50Var, jl50Var, str, str2, function0, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public static final void d(nl50 nl50Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1118668389);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(nl50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if ((nl50Var instanceof ml50) || (nl50Var instanceof ll50)) {
                x340Var.i0(1298503625);
                x340Var.r(false);
            } else {
                if (!(nl50Var instanceof kl50)) {
                    throw p3d1.k(x340Var, 1298502529, false);
                }
                x340Var.i0(1598957181);
                kl50 kl50Var = (kl50) nl50Var;
                List list = kl50Var.c;
                boolean zG = x340Var.g(list);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = wqn1.A(kl50Var);
                    x340Var.s0(objT);
                }
                jl50 jl50Var = (jl50) objT;
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            yk50 yk50Var = ((jl50) it.next()).e;
                            if ((yk50Var != null ? yk50Var.c : null) instanceof gl50) {
                                x340Var.i0(1298509800);
                                b(kl50Var, function0, x340Var, i3 & 1022);
                                x340Var.r(false);
                            }
                        } else if (jl50Var != null) {
                            x340Var.i0(1298513771);
                            int i4 = i3 & 14;
                            int i5 = i3 << 9;
                            c(kl50Var, jl50Var, kl50Var.d, kl50Var.e, function0, x340Var, i4 | (57344 & i5) | (i5 & 458752));
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1298527497);
                            x340Var.r(false);
                        }
                    }
                } else if (jl50Var != null) {
                    x340Var.i0(1298513771);
                    int i6 = i3 & 14;
                    int i7 = i3 << 9;
                    c(kl50Var, jl50Var, kl50Var.d, kl50Var.e, function0, x340Var, i6 | (57344 & i7) | (i7 & 458752));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1298527497);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(nl50Var, function0, qim0Var2, i, (byte) 21);
        }
    }

    public static final void e(String str, String str2, String str3, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2091093258);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0Var, 0.0f, 8.0f, 0.0f, 16.0f, 5);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
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
            int i3 = i2 >> 6;
            f((i2 & 14) | (i3 & 112), str, x340Var, null, z);
            i((i3 & 896) | ((i2 >> 3) & 126), str2, str3, function0, x340Var, null);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qzj1(str, str2, str3, z, function0, qim0Var, i, (byte) 1);
        }
    }

    public static final void f(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        af5 af5Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1520188493);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                b0kVar3.i0(1800361504);
                ye5 ye5Var = new ye5();
                ye5Var.g(str);
                b0kVar3.i0(1555449381);
                ye5 ye5Var2 = new ye5();
                ye5Var2.g(" • ");
                b0kVar3.i0(1555450650);
                uwr uwrVar = cbx.a;
                int iO = ye5Var2.o(new zma1(cbx.a(b0kVar3).b.g, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var2.g(cwl1.o0(b0kVar3, 2131960984));
                    ye5Var2.k(iO);
                    b0kVar3.r(false);
                    af5 af5VarP = ye5Var2.p();
                    b0kVar3.r(false);
                    ye5Var.h(af5VarP);
                    af5Var = ye5Var.p();
                    b0kVar3.r(false);
                } catch (Throwable th) {
                    ye5Var2.k(iO);
                    throw th;
                }
            } else {
                b0kVar3.i0(1800481102);
                b0kVar3.r(false);
                af5Var = new af5(str);
            }
            uwr uwrVar2 = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).h;
            long j = cbx.a(b0kVar3).b.a;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            uwo1.d(af5Var, j, anm1.N("your-premium-referral-section-header", qim0Var3), lee1Var, null, null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4080);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ryh(str, z, qim0Var2, i, (byte) 7);
        }
    }

    public static final void g(Object obj, c380 c380Var, xtb0 xtb0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-341908120);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(xtb0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(obj))) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(c380Var))) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new n641(c380Var, obj, xtb0Var, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.t(obj, x340Var, (vu30) objT);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(obj, c380Var, xtb0Var, i, (byte) 8);
        }
    }

    public static final void h(fns fnsVar, String str, long j, tob1 tob1Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        long j2;
        tob1 tob1Var2;
        String str2;
        b0k b0kVar2;
        qim0 qim0Var2;
        lee1 lee1Var;
        Object bhVar;
        fns fnsVar2;
        mmr0 mmr0Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-573005623);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(fnsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= b0kVar3.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i & 3072) == 0) {
            tob1Var2 = tob1Var;
            i2 |= b0kVar3.i(tob1Var2) ? 2048 : 1024;
        } else {
            tob1Var2 = tob1Var;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        int i3 = 196608 | i2;
        boolean z2 = true;
        if (!b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            str2 = str;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        } else {
            if (((Number) tob1Var2.getValue()).intValue() == 0) {
                h311 h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    h311VarV.d = new ia5(fnsVar, str, j2, tob1Var2, z, i);
                    return;
                }
                return;
            }
            if (z) {
                b0kVar3.i0(-902580589);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(b0kVar3).c;
            } else {
                b0kVar3.i0(-902579500);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(b0kVar3).d;
            }
            b0kVar3.r(false);
            lee1 lee1Var2 = lee1Var;
            f930 f930Var = (f930) b0kVar3.k(t4k.k);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            int i4 = i3 & 112;
            boolean zE = b0kVar3.e(((Number) tob1Var.getValue()).intValue()) | (i4 == 32);
            Object objT = b0kVar3.T();
            if (zE || objT == m4cVar) {
                objT = vgo1.i(str, lee1Var2, jjl.b(0, ((Number) tob1Var.getValue()).intValue(), 0, 0, 13), watVar, f930Var);
                b0kVar3.s0(objT);
            }
            nw4 nw4Var = (nw4) objT;
            boolean z3 = i4 == 32;
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = v8r.q(dqs0.e);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = b0kVar3.i(fnsVar) | b0kVar3.i(ven0Var) | b0kVar3.i(nw4Var) | (i4 == 32);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                fnsVar2 = fnsVar;
                bhVar = new bh(fnsVar2, ven0Var, nw4Var, str, (lnm) null, (byte) 12);
                str2 = str;
                b0kVar3.s0(bhVar);
            } else {
                bhVar = objT3;
                fnsVar2 = fnsVar;
                str2 = str;
            }
            qxd0.t(str2, b0kVar3, (vu30) bhVar);
            m7 m7Var = (cqs0) ven0Var.getValue();
            int i5 = i4 | ((i3 << 6) & 896);
            b0kVar3.i0(-2094781067);
            int i6 = (i5 & 112) ^ 48;
            boolean z4 = (i6 > 32 && b0kVar3.g(str2)) || (i5 & 48) == 32;
            Object objT4 = b0kVar3.T();
            if (z4 || objT4 == m4cVar) {
                objT4 = v8r.q("");
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            if ((i6 <= 32 || !b0kVar3.g(str2)) && (i5 & 48) != 32) {
                z2 = false;
            }
            Object objT5 = b0kVar3.T();
            if (z2 || objT5 == m4cVar) {
                objT5 = v8r.q("");
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var3 = (ven0) objT5;
            if (m7Var.isEmpty()) {
                mmr0Var = new mmr0(ven0Var2, ven0Var3);
            } else {
                boolean zI2 = b0kVar3.i(fnsVar2) | b0kVar3.g(m7Var) | b0kVar3.i(ven0Var2) | b0kVar3.i(ven0Var3);
                Object objT6 = b0kVar3.T();
                if (zI2 || objT6 == m4cVar) {
                    db dbVar = new db(fnsVar2, m7Var, ven0Var2, ven0Var3, (byte) 12);
                    b0kVar3.s0(dbVar);
                    objT6 = dbVar;
                }
                cso1.k(str2, null, (iu30) objT6, b0kVar3, (i5 >> 3) & 14);
                mmr0Var = new mmr0(ven0Var2, ven0Var3);
            }
            b0kVar3.r(false);
            ven0 ven0Var4 = (ven0) mmr0Var.a;
            ven0 ven0Var5 = (ven0) mmr0Var.b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            Object objT7 = b0kVar3.T();
            if (objT7 == m4cVar) {
                objT7 = k74.Z;
                b0kVar3.s0(objT7);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT7);
            ye5 ye5Var = new ye5();
            int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g((String) ven0Var4.getValue());
                ye5Var.k(iO);
                int iO2 = ye5Var.o(new zma1(u7h.b(j, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g((String) ven0Var5.getValue());
                    ye5Var.k(iO2);
                    b0kVar2 = b0kVar3;
                    uwo1.f(ye5Var.p(), qim0VarB, lee1Var2, null, null, null, 0, false, new cjc0(2), Math.min(nw4Var.d.g, 2), null, null, b0kVar2, 0, 0, 3320);
                    qim0Var2 = qim0Var3;
                } catch (Throwable th) {
                    ye5Var.k(iO2);
                    throw th;
                }
            } catch (Throwable th2) {
                ye5Var.k(iO);
                throw th2;
            }
        }
        h311 h311VarV2 = b0kVar2.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new sc5(fnsVar, str2, j, tob1Var, z, qim0Var2, i);
        }
    }

    public static final void i(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1120215766);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            mgx mgxVar = mgx.e;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(8.0f);
            cvx cvxVar = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, mgxVar, 0, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), (zzq0) null, (tvx) null, cr31VarB, 0, (p3v) null, 437);
            gbx gbxVar = new gbx(z50.c, function0);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(anm1.N("your-premium-referral-row", qim0Var3), 1.0f), uvxVar, null, false, null, null, gbxVar, null, ctj.a, null, null, apo.r(21639694, new dba1(str2, (byte) 17), b0kVar3), null, null, null, apo.r(-1465589230, new dba1(str, (byte) 18), b0kVar3), b0kVar2, 100663360, 196656, 30396);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jmd(str, str2, function0, qim0Var2, i, (byte) 2);
        }
    }

    public static final void j(rtb0 rtb0Var, String str, int i, int i2, ArrayList arrayList, cx0 cx0Var, nu nuVar, j2i j2iVar) {
        rtb0Var.d(str.concat("_heading"), "section_heading", new j2i(2005669544, new ut1((Object) cx0Var, i, (byte) 3), true));
        if (arrayList.isEmpty()) {
            rtb0Var.d(str.concat("_empty"), "empty_section", new j2i(-504552147, new ut1((Object) nuVar, i2, (byte) 4), true));
        } else {
            rtb0Var.e(arrayList.size(), new ry4(arrayList, (byte) 12), new da(arrayList, str, (byte) 13), new j2i(2039820996, new ot(arrayList, j2iVar, (byte) 7), true));
        }
    }

    public static rhg0 k(d0r d0rVar) {
        return new rhg0(d0rVar, (ukj0) null);
    }

    public static CameraUnavailableException l(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        return new CameraUnavailableException(cameraAccessExceptionCompat);
    }

    public static final boolean m(int i, int i2) {
        return i == i2;
    }

    public static long n() {
        return itn0.h;
    }

    public static m210 o() {
        return SpotifyWearableListenerService.T0;
    }

    public static cbr0 p() {
        return cbr0.c;
    }

    public static final int q(View view) {
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    public static String r() {
        return SpotifyWearableListenerService.S0;
    }

    public static final void s(View view) {
        view.animate().alpha(1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(view.getRootView().getResources().getInteger(R.integer.config_mediumAnimTime)).start();
    }

    public static final void t(View view) {
        view.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.0f).setDuration(view.getRootView().getResources().getInteger(R.integer.config_shortAnimTime)).start();
    }

    public static final String u(kl50 kl50Var) {
        String str = kl50Var.a;
        if (ihc1.y0(str)) {
            str = null;
        }
        return str == null ? o7h.y0(kl50Var.c, ", ", (String) null, (String) null, r850.e1, 30) : str;
    }
}
