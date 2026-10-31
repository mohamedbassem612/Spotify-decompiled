package p;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.recyclerview.widget.a;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.player.model.ContextTrack;
import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import com.spotify.recents.recentsdatasourceimpl.Share;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class prn1 {
    public static b180 a;

    public static ie5 a(int i, float f, float f2) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new ie5(rno1.a, Float.valueOf(f), new ke5(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(e6d e6dVar, pt ptVar, int i, kly0 kly0Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        pt ptVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(775262319);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(e6dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ptVar2 = ptVar;
            i3 |= x340Var.i(ptVar2) ? 32 : 16;
        } else {
            ptVar2 = ptVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(kly0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            c460 c460Var = (c460) kly0Var.get();
            float fM0 = ((wat) x340Var.k(t4k.h)).M0(i);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            qim0 qim0VarZ = uyn1.z(fM0, 0.0f, 2, nim0.a);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = jpc.V0;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI = x340Var.i(c460Var) | x340Var.i(e6dVar);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ztb(c460Var, e6dVar, (byte) 11);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var, qim0VarZ, (iu30) objT2, x340Var, 6, 0);
            lrn1.e(mqo1.A(e6dVar.a), ptVar2, fM0, (qim0) null, x340Var, i3 & ContentType.LONG_FORM_ON_DEMAND);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(e6dVar, ptVar, i, kly0Var, qim0Var, i2, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(dhz dhzVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        qim0 qim0VarF;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1418948876);
        int i2 = i | (x340Var.g(dhzVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ygz ygzVarJ = dhzVar.j();
            boolean zJ = u890.j(ygzVarJ, wgz.a);
            qim0 qim0Var3 = nim0.a;
            if (zJ) {
                x340Var.i0(-2105229776);
                x340Var.r(false);
                qim0VarF = u291.d(qim0Var3, 1.0f);
            } else {
                if (!u890.j(ygzVarJ, xgz.a)) {
                    throw p3d1.k(x340Var, -2105231838, false);
                }
                x340Var.i0(-2105227101);
                uwr uwrVar = cbx.a;
                qim0VarF = u291.f(uyn1.B(qim0Var3, 0.0f, cbx.b(x340Var).b.c, 0.0f, 0.0f, 13), 1.0f);
                x340Var.r(false);
            }
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
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
            String strO0 = cwl1.o0(x340Var, dhzVar.a());
            uwr uwrVar2 = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).d, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1786);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 8.0f));
            uwo1.e(cwl1.o0(x340Var, dhzVar.b()), (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(4), 0, (qx8) null, x340Var, 0, 0, 1778);
            if (dhzVar.h()) {
                x340Var.i0(-852343912);
                op71.g(x340Var, u291.h(qim0Var3, 40.0f));
                nyx.a(3, (wux) null, apo.r(-1146432880, new bvk(function0, (byte) 28), x340Var), x340Var, 3078, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(-851871100);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w((Object) dhzVar, (Object) function0, (Object) qim0Var2, i, (byte) 25);
        }
    }

    public static final void d(int i, Function0 function0, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1372288855);
        if ((i & 6) == 0) {
            function1 = function0;
            i2 = (b0kVar3.i(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(j2iVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            vy71 vy71VarF = dem0.f(6, 2, b0kVar3, (iu30) null, true);
            uwr uwrVar = cbx.a;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            dem0.a(function1, qim0Var3, vy71VarF, 0.0f, false, (hw61) null, cbx.a(b0kVar3).a.a.a(), 0L, 0.0f, 0L, (vu30) null, (vu30) null, (eem0) null, apo.r(277354425, new rv71(j2iVar, (byte) 18), b0kVar3), b0kVar2, i3 & 126, 3072, 8120);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pv50(function0, qim0Var2, j2iVar, i, (byte) 2);
        }
    }

    public static final Set e(l3n1 l3n1Var) {
        Set setSingleton = Collections.singleton(new zap0(l3n1Var, (byte) 4));
        ArrayList arrayList = new ArrayList(q7h.U(setSingleton, 10));
        Iterator it = setSingleton.iterator();
        while (it.hasNext()) {
            arrayList.add(((Function0) it.next()).invoke());
        }
        return Collections.singleton(arrayList);
    }

    public static final frx0 f(eux0 eux0Var, Function0 function0) {
        boolean z = eux0Var.c;
        if (!z || !eux0Var.v.isEmpty()) {
            if (z) {
                return null;
            }
            return (frx0) function0.invoke();
        }
        String str = eux0Var.h;
        List list = eux0Var.u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof j8f) {
                arrayList.add(obj);
            }
        }
        return new eqx0(((j8f) o7h.A0(arrayList)).s(), str);
    }

    public static int g(s611 s611Var, dyb0 dyb0Var, View view, View view2, a aVar, boolean z) {
        if (aVar.I() == 0 || s611Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(a.V(view) - a.V(view2)) + 1;
        }
        return Math.min(dyb0Var.n(), dyb0Var.d(view2) - dyb0Var.g(view));
    }

    public static int h(s611 s611Var, dyb0 dyb0Var, View view, View view2, a aVar, boolean z, boolean z2) {
        if (aVar.I() == 0 || s611Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (s611Var.b() - Math.max(a.V(view), a.V(view2))) - 1) : Math.max(0, Math.min(a.V(view), a.V(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(dyb0Var.d(view2) - dyb0Var.g(view)) / (Math.abs(a.V(view) - a.V(view2)) + 1))) + (dyb0Var.m() - dyb0Var.g(view)));
        }
        return iMax;
    }

    public static int i(s611 s611Var, dyb0 dyb0Var, View view, View view2, a aVar, boolean z) {
        if (aVar.I() == 0 || s611Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return s611Var.b();
        }
        return (int) (((dyb0Var.d(view2) - dyb0Var.g(view)) / (Math.abs(a.V(view) - a.V(view2)) + 1)) * s611Var.b());
    }

    public static final int j(ContextTrack contextTrack) {
        if (l4o1.G(contextTrack)) {
            return 3;
        }
        if (l4o1.P(contextTrack)) {
            return 2;
        }
        return l4o1.O(contextTrack) ? 5 : 1;
    }

    public static ie5 k(ie5 ie5Var) {
        return new ie5(ie5Var.a, ie5Var.b.getValue(), rrn1.y(ie5Var.c), ie5Var.d, Long.MIN_VALUE, ie5Var.f);
    }

    public static ie5 l(ie5 ie5Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ie5Var.b.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ie5Var.c.a;
        }
        return new ie5(ie5Var.a, Float.valueOf(f), new ke5(f2), ie5Var.d, ie5Var.e, ie5Var.f);
    }

    public static wvn0 m(Parcel parcel) {
        String string = parcel.readString();
        if (string == null) {
            eg.m("Required value was null.");
            return null;
        }
        int i = 0;
        if (string == null) {
            bhn0.i("Name is null");
        } else if (string.equals("NAVIGATION_INTERRUPTED_BY_NEW_ACTION")) {
            i = 1;
        } else if (string.equals("LOCATION_CHANGING_WITHOUT_REQUEST")) {
            i = 2;
        } else if (string.equals("LOCATION_CHANGE_IS_MISSING_ACTION")) {
            i = 3;
        } else if (string.equals("MISSING_LOCATION_CHANGING")) {
            i = 4;
        } else if (string.equals("LOCATION_CHANGING_MORE_THAN_ONCE")) {
            i = 5;
        } else if (string.equals("PRESENTATION_PATH_NOT_RECEIVED_BEFORE_NAVIGATION")) {
            i = 6;
        } else if (string.equals("INITIAL_PRESENTATION_INTERRUPTED_BY_PRESENTATION_CHANGE")) {
            i = 7;
        } else if (string.equals("PRESENTATION_CHANGE_INTERRUPTED_BY_NEW_ACTION")) {
            i = 8;
        } else if (string.equals("PRESENTATION_CHANGE_INTERRUPTED_BY_NAVIGATION")) {
            i = 9;
        } else {
            hhg1.n("No enum constant com.spotify.ubi.navigationloggerimpl.mobius.NavigationInstrumentationErrorParceler.ErrorEnum.".concat(string));
        }
        switch (l1d.C(i)) {
            case 0:
                String string2 = parcel.readString();
                if (string2 != null) {
                    return new tvn0(cfm0.v(string2), qqn1.g(parcel));
                }
                eg.m("Required value was null.");
                return null;
            case 1:
                return qvn0.b;
            case 2:
                return qvn0.a;
            case 3:
                return svn0.a;
            case 4:
                return new rvn0(qqn1.g(parcel));
            case 5:
                return qvn0.c;
            case 6:
                return new pvn0(qqn1.g(parcel));
            case 7:
                return new vvn0(qqn1.g(parcel));
            case 8:
                return new uvn0(qqn1.g(parcel));
            default:
                eg.o();
                return null;
        }
    }

    public static final oe5 n(tzg1 tzg1Var, Object obj) {
        oe5 oe5Var = (oe5) tzg1Var.a.invoke(obj);
        oe5Var.d();
        return oe5Var;
    }

    public static final float o(float f, float f2) {
        float f3 = 0.0f;
        if (f >= 0.0f) {
            return f;
        }
        float f4 = -f;
        if (f2 > 0.0f) {
            float fExp = (1.0f - ((float) Math.exp((-Math.abs(f4)) / f2))) * f2;
            f3 = f4 < 0.0f ? -fExp : fExp;
        }
        return -f3;
    }

    public static final boolean p(String str, Share share, GroupMetadata groupMetadata) {
        if (str.equals(share.o())) {
            return false;
        }
        z6x z6xVarR = groupMetadata.r();
        if (z6xVarR == null) {
            z6xVarR = z6x.a;
        }
        return !((Collection) z6xVarR).isEmpty();
    }

    public static final String q(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return "MUSIC";
        }
        if (iC == 1) {
            return "PODCAST";
        }
        if (iC == 2) {
            return "AUDIOBOOK";
        }
        if (iC == 3) {
            return "PODCAST";
        }
        if (iC == 4) {
            return "NARRATION";
        }
        eg.o();
        return null;
    }

    public static final bab1 r(Object obj, b0k b0kVar, int i) {
        df41 df41Var = j2h1.b;
        m4c m4cVar = fkj0.X;
        Object[] objArr = new Object[0];
        x340 x340Var = (x340) b0kVar;
        boolean zI = x340Var.i(df41Var);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new qd81(1, (byte) 9);
            x340Var.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        boolean z = (((i & 14) ^ 6) > 4 && x340Var.i(obj)) || (i & 6) == 4;
        Object objT2 = x340Var.T();
        if (z || objT2 == m4cVar) {
            objT2 = new sa5(obj, (byte) 5);
            x340Var.s0(objT2);
        }
        return xfo1.n(objArr, iu30Var, (iu30) objT2, x340Var, 0, 4);
    }

    public static final ArrayList s(Iterable iterable, Object obj, Object obj2) {
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        for (Object obj3 : iterable) {
            if (u890.j(obj3, obj)) {
                obj3 = obj2;
            }
            arrayList.add(obj3);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public static final e0h1 t(e0h1 e0h1Var, fg5 fg5Var) {
        fg5 fg5Var2;
        e0h1 e0h1VarD;
        ij81 ij81Var = jg5.b;
        mma0[] mma0VarArr = jg5.a;
        ig5 ig5Var = (ig5) ij81Var.p(e0h1Var, mma0VarArr[0]);
        if (ig5Var == null || (fg5Var2 = ig5Var.a) == null) {
            fg5Var2 = rzs0.g;
        }
        if (fg5Var2 == fg5Var) {
            return e0h1Var;
        }
        ig5 ig5Var2 = (ig5) ij81Var.p(e0h1Var, mma0VarArr[0]);
        if (ig5Var2 != null) {
            if (e0h1Var.isEmpty()) {
                e0h1VarD = e0h1Var;
            } else {
                x36 x36Var = e0h1Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : x36Var) {
                    if (!u890.j((ig5) obj, ig5Var2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == e0h1Var.a.b()) {
                    e0h1VarD = e0h1Var;
                } else {
                    e0h1.b.getClass();
                    e0h1VarD = ffe1.d(arrayList);
                }
            }
            if (e0h1VarD != null) {
                e0h1Var = e0h1VarD;
            }
        }
        if (fg5Var.iterator().hasNext() || !fg5Var.isEmpty()) {
            ig5 ig5Var3 = new ig5(fg5Var);
            ffe1 ffe1Var = e0h1.b;
            tka0 tka0VarB = rc11.a.b(ig5.class);
            ffe1Var.getClass();
            String strO = tka0VarB.o();
            strO.getClass();
            if (e0h1Var.a.get(ffe1Var.f(strO)) == null) {
                return e0h1Var.isEmpty() ? new e0h1(Collections.singletonList(ig5Var3)) : ffe1.d(o7h.O0(ig5Var3, o7h.l1(e0h1Var)));
            }
        }
        return e0h1Var;
    }

    public static final g8f u(cwi0 cwi0Var) {
        String str = cwi0Var.b;
        bwi0 bwi0Var = cwi0Var.f;
        ArrayList arrayList = bwi0Var != null ? bwi0Var.c : null;
        if (arrayList == null || arrayList.isEmpty()) {
            return new c8f(cwi0Var.c, cwi0Var.d, cwi0Var.a, str);
        }
        return new e8f(cwi0Var.c, cwi0Var.d, cwi0Var.a, str);
    }

    public static final b9f v(gwi0 gwi0Var) {
        if (gwi0Var instanceof wvi0) {
            wvi0 wvi0Var = (wvi0) gwi0Var;
            return new x8f(wvi0Var.b, wvi0Var.a, wvi0Var.c);
        }
        if (gwi0Var instanceof dwi0) {
            dwi0 dwi0Var = (dwi0) gwi0Var;
            return new i8f(dwi0Var.c, dwi0Var.d, dwi0Var.a, dwi0Var.b);
        }
        if (gwi0Var instanceof cwi0) {
            return u((cwi0) gwi0Var);
        }
        if (!(gwi0Var instanceof xvi0)) {
            eg.o();
            return null;
        }
        xvi0 xvi0Var = (xvi0) gwi0Var;
        return new b8f(xvi0Var.c, xvi0Var.d, xvi0Var.a, xvi0Var.b);
    }

    public static final e0h1 w(fg5 fg5Var) {
        if (fg5Var.isEmpty()) {
            e0h1.b.getClass();
            return e0h1.c;
        }
        ffe1 ffe1Var = e0h1.b;
        List listSingletonList = Collections.singletonList(new ig5(fg5Var));
        ffe1Var.getClass();
        return ffe1.d(listSingletonList);
    }

    public static final List x(List list, Set set, LinkedHashSet linkedHashSet) {
        eqf1 gqf1Var;
        if (list == null) {
            return z6x.a;
        }
        ArrayList<awi0> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(((awi0) obj).a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (awi0 awi0Var : arrayList) {
            boolean z = (linkedHashSet == null || linkedHashSet.isEmpty() || !linkedHashSet.contains(awi0Var.a())) ? false : true;
            if (awi0Var instanceof yvi0) {
                yvi0 yvi0Var = (yvi0) awi0Var;
                gqf1Var = new eqf1(yvi0Var.a, yvi0Var.b, z, yvi0Var.c, yvi0Var.d, new cqf1(yvi0Var.e), yvi0Var.f, !z);
            } else {
                if (!(awi0Var instanceof zvi0)) {
                    eg.o();
                    return null;
                }
                gqf1Var = new gqf1(((zvi0) awi0Var).a);
            }
            arrayList2.add(gqf1Var);
        }
        return arrayList2;
    }

    public static final void y(EditorInfo editorInfo, CharSequence charSequence, long j, x180 x180Var) {
        int i;
        int i2;
        boolean z;
        int i3 = x180Var.e;
        int i4 = x180Var.d;
        boolean z2 = x180Var.a;
        if (i3 == 1) {
            i = z2 ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                eg.m("invalid ImeAction");
                return;
            }
        }
        editorInfo.imeOptions = i;
        LocaleList localeList = x180Var.f;
        if (u890.j(localeList, LocaleList.c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(q7h.U(localeList, 10));
            Iterator it = localeList.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((ehe0) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= os00.INVALID_ID;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else if (i4 == 8) {
                    i2 = 18;
                } else if (i4 == 9) {
                    i2 = 8194;
                } else if (i4 == 10) {
                    i2 = 145;
                } else if (i4 == 11) {
                    i2 = ContentType.LIVE;
                } else if (i4 == 12) {
                    i2 = 97;
                } else if (i4 == 13) {
                    i2 = 49;
                } else if (i4 == 14) {
                    i2 = 65;
                } else if (i4 == 15) {
                    i2 = 81;
                } else if (i4 == 16) {
                    i2 = 177;
                } else if (i4 == 17) {
                    i2 = 193;
                } else if (i4 == 18) {
                    i2 = 4;
                } else {
                    i2 = 20;
                    if (i4 != 19) {
                        if (i4 == 20) {
                            i2 = 36;
                        } else if (i4 == 21) {
                            i2 = 4098;
                        } else if (i4 == 22) {
                            i2 = 12290;
                        } else if (i4 == 23) {
                            i2 = 8210;
                        } else if (i4 == 24) {
                            i2 = 4114;
                        } else {
                            if (i4 != 25) {
                                eg.m("Invalid Keyboard Type");
                                return;
                            }
                            i2 = 12306;
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z2 && (i2 & 15) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (x180Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 15) == 1) {
            int i5 = x180Var.b;
            if (i5 == 1) {
                i2 |= SemanticState.Obscured;
                editorInfo.inputType = i2;
            } else if (i5 == 2) {
                i2 |= SemanticState.Multiline;
                editorInfo.inputType = i2;
            } else if (i5 == 3) {
                i2 |= TlsSocketProvider.READ_BUFFER_SIZE;
                editorInfo.inputType = i2;
            }
            if (x180Var.c) {
                i2 |= 32768;
                editorInfo.inputType = i2;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                editorInfo.inputType = 2097152 | i2;
            }
        }
        int i6 = nbe1.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        w5w.d(editorInfo, charSequence);
        editorInfo.imeOptions |= 33554432;
        if (rkc1.a && i4 != 7 && i4 != 10 && i4 != 8 && i4 != 23 && i4 != 24 && i4 != 25) {
            if (Build.VERSION.SDK_INT >= 35) {
                v5w.d(editorInfo, true);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            sf.N(editorInfo);
            return;
        }
        if (Build.VERSION.SDK_INT >= 35) {
            z = false;
            v5w.d(editorInfo, false);
        } else {
            z = false;
        }
        Bundle bundle2 = editorInfo.extras;
        if (bundle2 == null) {
            bundle2 = new Bundle();
            editorInfo.extras = bundle2;
        }
        bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void z(wvn0 wvn0Var, Parcel parcel) {
        if (wvn0Var instanceof tvn0) {
            parcel.writeString("NAVIGATION_INTERRUPTED_BY_NEW_ACTION");
            tvn0 tvn0Var = (tvn0) wvn0Var;
            parcel.writeString(cfm0.q(tvn0Var.a));
            qqn1.a0(tvn0Var.b, parcel);
            return;
        }
        if (wvn0Var.equals(qvn0.b)) {
            parcel.writeString("LOCATION_CHANGING_WITHOUT_REQUEST");
            return;
        }
        if (wvn0Var.equals(qvn0.a)) {
            parcel.writeString("LOCATION_CHANGE_IS_MISSING_ACTION");
            return;
        }
        if (wvn0Var.equals(svn0.a)) {
            parcel.writeString("MISSING_LOCATION_CHANGING");
            return;
        }
        if (wvn0Var instanceof rvn0) {
            parcel.writeString("LOCATION_CHANGING_MORE_THAN_ONCE");
            qqn1.a0(((rvn0) wvn0Var).a, parcel);
            return;
        }
        if (wvn0Var.equals(qvn0.c)) {
            parcel.writeString("PRESENTATION_PATH_NOT_RECEIVED_BEFORE_NAVIGATION");
            return;
        }
        if (wvn0Var instanceof pvn0) {
            parcel.writeString("INITIAL_PRESENTATION_INTERRUPTED_BY_PRESENTATION_CHANGE");
            qqn1.a0(((pvn0) wvn0Var).a, parcel);
        } else if (wvn0Var instanceof vvn0) {
            parcel.writeString("PRESENTATION_CHANGE_INTERRUPTED_BY_NEW_ACTION");
            qqn1.a0(((vvn0) wvn0Var).a, parcel);
        } else if (!(wvn0Var instanceof uvn0)) {
            eg.o();
        } else {
            parcel.writeString("PRESENTATION_CHANGE_INTERRUPTED_BY_NAVIGATION");
            qqn1.a0(((uvn0) wvn0Var).a, parcel);
        }
    }
}
