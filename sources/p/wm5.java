package p;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.ContentType;
import com.comscore.streaming.WindowState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.mobius.Next;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class wm5 implements cb91 {
    public static final z9 a = new z9((byte) 5);
    public static final e9r b = new e9r(new r5x0((byte) 28));
    public static b180 c;
    public static b180 d;

    public static final boolean A(Map map) {
        int i;
        Set<String> setKeySet = map.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (String str : setKeySet) {
                if (nhc1.Y(str, "blend.userinfo-", false) && nhc1.R(str, ".username", false) && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        return i == 2;
    }

    public static boolean B(tdy0 tdy0Var) {
        if (tdy0Var == null) {
            c(0);
            throw null;
        }
        if (tdy0Var.getKind() != 2) {
            beg begVarK = tdy0Var.k();
            if (begVarK == null) {
                c(1);
                throw null;
            }
            if (iht.k(begVarK)) {
                n9r n9rVarK = begVarK.k();
                if (iht.l(n9rVarK, 1) || iht.l(n9rVarK, 3)) {
                    beg begVar = begVarK;
                    LinkedHashSet linkedHashSet = hxh.a;
                    if (iht.k(begVar)) {
                        LinkedHashSet linkedHashSet2 = hxh.a;
                        heg hegVarF = kht.f(begVar);
                        if (o7h.i0(linkedHashSet2, hegVarF != null ? hegVarF.e() : null)) {
                        }
                    }
                    return true;
                }
            }
            if (iht.k(tdy0Var.k())) {
                v120 v120VarF0 = tdy0Var.f0();
                if ((v120VarF0 == null || !v120VarF0.getAnnotations().d0(dia0.a)) ? tdy0Var.getAnnotations().d0(dia0.a) : true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean C(rx00 rx00Var) {
        boolean z = rx00Var.l;
        List list = rx00Var.k;
        if (z) {
            return list.contains(ell.b) || list.contains(ell.d);
        }
        return false;
    }

    public static final ox00 D(rx00 rx00Var) {
        kx00 kx00Var = rx00Var.e;
        return kx00Var instanceof kx00 ? new mx00(kx00Var.a) : kx00Var;
    }

    public static void E(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            x74.f0(theme);
            return;
        }
        synchronized (o4o1.a) {
            if (!o4o1.c) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    o4o1.b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                o4o1.c = true;
            }
            Method method = o4o1.b;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    o4o1.b = null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object F(Function0 function0, vu30 vu30Var, onm onmVar) {
        q14 q14Var;
        if (onmVar instanceof q14) {
            q14Var = (q14) onmVar;
            int i = q14Var.b;
            if ((i & os00.INVALID_ID) != 0) {
                q14Var.b = i - os00.INVALID_ID;
            } else {
                q14Var = new q14(onmVar);
            }
        } else {
            q14Var = new q14(onmVar);
        }
        Object obj = q14Var.a;
        int i2 = q14Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                w14 w14Var = new w14(function0, vu30Var, null, (byte) 2);
                q14Var.b = 1;
                Object objS = smo1.s(w14Var, q14Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return rih1.a;
    }

    public static final void G(View view, j2i j2iVar) {
        view.setTag(2131428150, new stj(j2iVar));
        L(view, j2iVar);
    }

    public static final void H() {
        if (dhn.a.contains(wm5.class)) {
            return;
        }
        try {
            g120.e.add(new vm5());
            g120.d();
        } catch (Throwable th) {
            dhn.a(wm5.class, th);
        }
    }

    public static final gfe I(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (lowerCase.equals("email")) {
            return gfe.a;
        }
        return lowerCase.equals("push") ? gfe.b : gfe.c;
    }

    public static final mmq0 J(String str) {
        Object next;
        d7 d7Var = new d7(mmq0.i, (byte) 0);
        while (d7Var.hasNext()) {
            next = d7Var.next();
            if (((mmq0) next).a.equals(str)) {
                return (mmq0) next;
            }
        }
        next = null;
        return (mmq0) next;
    }

    public static Next K(kak0 kak0Var, u1k0 u1k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        q6w0 q6w0Var = lhg1Var.a;
        ha20 ha20Var = u1k0Var.c;
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, q6w0.a(q6w0Var, (buk1) null, (hez) null, ha20Var != null ? new fa20(ha20Var) : null, (px30) null, (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, u1k0Var.a, u1k0Var.b, (ox30) null, (ox30) null, (x6b) null, 59383), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 3);
    }

    public static final void L(View view, j2i j2iVar) {
        Object tag = view.getTag(2131428151);
        ven0 ven0Var = tag instanceof ven0 ? (ven0) tag : null;
        if (ven0Var != null) {
            ven0Var.setValue(j2iVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                L(viewGroup.getChildAt(i), j2iVar);
            }
        }
    }

    public static /* synthetic */ void c(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final t24 d(jad1 jad1Var, iu30 iu30Var, g14 g14Var, pxg1 pxg1Var, e9r e9rVar, iu30 iu30Var2) {
        t24 t24Var = new t24(iu30Var2, jad1Var);
        t24Var.b = iu30Var;
        t24Var.c = g14Var;
        t24Var.d = pxg1Var;
        t24Var.e = e9rVar;
        return t24Var;
    }

    public static t24 e(Object obj, wvr wvrVar, iu30 iu30Var, Function0 function0, ni20 ni20Var, e9r e9rVar) {
        t24 t24Var = new t24(new z9((byte) 4), obj);
        t24Var.m.setValue(wvrVar);
        t24Var.i(obj);
        t24Var.b = iu30Var;
        t24Var.c = function0;
        t24Var.d = ni20Var;
        t24Var.e = e9rVar;
        return t24Var;
    }

    public static final wvr f(iu30 iu30Var) {
        z5v z5vVar = new z5v();
        iu30Var.invoke(z5vVar);
        float[] fArr = z5vVar.b;
        ArrayList arrayList = z5vVar.a;
        int size = arrayList.size();
        zno1.f(size, fArr.length);
        return new wvr(arrayList, Arrays.copyOfRange(fArr, 0, size));
    }

    public static final void g(ap30 ap30Var, b0k b0kVar, int i) {
        ap30 ap30Var2;
        int i2;
        qim0 qim0VarX;
        vu30 vu30Var;
        h2c h2cVar;
        vu30 vu30Var2;
        m4c m4cVar;
        ven0 ven0Var;
        llj lljVar;
        qim0 qim0Var;
        boolean z;
        vu30 vu30Var3;
        Function0 function0;
        String str = ap30Var.a;
        gra graVar = een.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1205954610);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(ap30Var) ? 4 : 2);
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            boolean zY0 = ihc1.y0(str);
            boolean z2 = !zY0;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = bc30.h;
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            boolean zH = x340Var.h(z2) | ((i3 & 14) == 4) | x340Var.i(ven0Var2);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar2) {
                objT2 = new c30(z2, ap30Var, ven0Var2, (byte) 17);
                x340Var.s0(objT2);
            }
            qim0 qim0VarF2 = dug.f(i1p1.q(s161.a(qim0VarF, (iu30) objT2), cr31VarB), cbx.a(x340Var).d.b, cr31VarB);
            if (zY0) {
                i2 = 0;
                x340Var.i0(718812758);
                x340Var.r(false);
                qim0VarX = qim0Var2;
            } else {
                x340Var.i0(718811318);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0VarX = uyn1.x(qim0Var2, 16.0f);
                i2 = 0;
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarF2.then(qim0VarX);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, i2);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z3) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            vu30 vu30Var4 = y580.O0;
            nko1.H(mbhVarA, x340Var, vu30Var4);
            vu30 vu30Var5 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar2);
            nko1.F(x340Var);
            vu30 vu30Var6 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var6);
            h2c h2cVar2 = h2c.a;
            if (zY0) {
                vu30Var = vu30Var4;
                h2cVar = h2cVar2;
                vu30Var2 = vu30Var6;
                m4cVar = m4cVar2;
                ven0Var = ven0Var2;
                lljVar = lljVar2;
                qim0Var = qim0Var2;
                z = false;
                vu30Var3 = vu30Var5;
                function0 = function1;
                x340Var.i0(322439114);
                x340Var.r(false);
            } else {
                x340Var.i0(321665509);
                qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, vu30Var4);
                nko1.H(xos0VarM2, x340Var, vu30Var5);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var6);
                lee1 lee1Var = cbx.d(x340Var).h;
                long j = cbx.a(x340Var).b.a;
                mta mtaVar = cbx.b(x340Var).d;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0Var = qim0Var2;
                h2cVar = h2cVar2;
                uwo1.e(str, uyn1.B(qim0Var2, 0.0f, 0.0f, 40.0f, 0.0f, 11), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                qim0 qim0VarB = h2cVar.b(qim0Var);
                gfh0 gfh0VarC2 = t1c.c(een.i, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function1;
                    x340Var.l(function0);
                } else {
                    function0 = function1;
                    x340Var.v0();
                }
                vu30Var = vu30Var4;
                nko1.H(gfh0VarC2, x340Var, vu30Var);
                vu30Var3 = vu30Var5;
                nko1.H(xos0VarM3, x340Var, vu30Var3);
                lljVar = lljVar2;
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                vu30Var2 = vu30Var6;
                nko1.H(qim0VarE3, x340Var, vu30Var2);
                ven0Var = ven0Var2;
                boolean zI = x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI) {
                    m4cVar = m4cVar2;
                } else {
                    m4cVar = m4cVar2;
                    if (objT3 == m4cVar) {
                    }
                    z = false;
                    i(0, 2, (Function0) objT3, x340Var, null);
                    x340Var.r(true);
                    x340Var.r(true);
                    x0d.s(qim0Var, cbx.b(x340Var).b.c, x340Var, false);
                }
                objT3 = new iwr(ven0Var, (byte) 22);
                x340Var.s0(objT3);
                z = false;
                i(0, 2, (Function0) objT3, x340Var, null);
                x340Var.r(true);
                x340Var.r(true);
                x0d.s(qim0Var, cbx.b(x340Var).b.c, x340Var, false);
            }
            qim0 qim0VarF4 = u291.f(qim0Var, 1.0f);
            gfh0 gfh0VarC3 = t1c.c(graVar, z);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, vu30Var);
            nko1.H(xos0VarM4, x340Var, vu30Var3);
            x0d.q(iHashCode4, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE4, x340Var, vu30Var2);
            Uri uri = Uri.parse(ap30Var.b);
            qim0 qim0VarF5 = u291.f(qim0Var, 1.0f);
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarF5, er31.b(8.0f));
            boolean zI2 = x340Var.i(ven0Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new iwr(ven0Var, (byte) 23);
                x340Var.s0(objT4);
            }
            m4c m4cVar3 = m4cVar;
            eso1.e(uri, isl.a, bin.x(qim0VarQ, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 199728, 0, 4048);
            x340Var = x340Var;
            if (zY0) {
                x340Var.i0(294306835);
                boolean zI3 = x340Var.i(ven0Var);
                Object objT5 = x340Var.T();
                if (zI3 || objT5 == m4cVar3) {
                    objT5 = new iwr(ven0Var, (byte) 24);
                    x340Var.s0(objT5);
                }
                qim0 qim0VarA = h2cVar.a(qim0Var, een.f);
                cvx cvxVar3 = cbx.b(x340Var).b;
                i(0, 0, (Function0) objT5, x340Var, uyn1.x(qim0VarA, 8.0f));
                x340Var.r(false);
            } else {
                x340Var.i0(294488464);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(809839456);
                boolean zI4 = x340Var.i(ven0Var);
                Object objT6 = x340Var.T();
                if (zI4 || objT6 == m4cVar3) {
                    objT6 = new iwr(ven0Var, (byte) 25);
                    x340Var.s0(objT6);
                }
                ap30Var2 = ap30Var;
                anm1.a((Function0) objT6, new i3u(3, false, false, false), apo.r(2136419548, new xh00(ap30Var2, ven0Var, (byte) 19), x340Var), x340Var, 384, 0);
                x340Var.r(false);
            } else {
                ap30Var2 = ap30Var;
                x340Var.i0(810135444);
                x340Var.r(false);
            }
        } else {
            ap30Var2 = ap30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cp30(ap30Var2, i);
        }
    }

    public static final void h(ven0 ven0Var, boolean z) {
        ven0Var.setValue(Boolean.valueOf(z));
    }

    public static final void i(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1079320094);
        int i4 = i | (x340Var.i(function0) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = i5 != 0 ? nim0.a : qim0Var2;
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarN = anm1.N("fry_card_fullscreen_button", u291.m(qim0Var3, 32.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            wro1.h(new gbx(z50.c, function0), new idx(18), (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, rpi.a, x340Var, 0, 6, 988);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyu(i, i2, function0, qim0Var2);
        }
    }

    public static final void j(int i, String str, String str2, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1281315994);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w2g0.c(u291.d(nim0.a, 1.0f), (tl3) null, apo.r(-931739644, new dp30(str, str2, function0, (byte) 0), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tq6(str, str2, function0, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0144  */
    /* JADX WARN: Code duplicated, block: B:65:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:70:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x021a  */
    /* JADX WARN: Code duplicated, block: B:81:0x02db  */
    public static final void k(String str, String str2, Function0 function0, long j, long j2, b0k b0kVar, int i) {
        m4c m4cVar;
        tob1 tob1Var;
        final xu30 xu30Var;
        boolean zG;
        Object objT;
        ven0 ven0VarS;
        Object objT2;
        vxs vxsVar;
        nim0 nim0Var;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean zBooleanValue;
        h2c h2cVar;
        float f;
        h2c h2cVar2;
        boolean zI;
        Object objT3;
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1573380991);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function1) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.f(j) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.f(j2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT4 = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT4 == m4cVar2) {
                objT4 = us71.i(1.0f, x340Var);
            }
            drr0 drr0Var = (drr0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar2) {
                objT5 = kaa0.h(0L, x340Var);
            }
            tob1 tob1Var2 = (ven0) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar2) {
                objT6 = v8r.q(Boolean.TRUE);
                x340Var.s0(objT6);
            }
            ven0 ven0Var = (ven0) objT6;
            Uri uri = Uri.parse(str);
            h6m h6mVar = mif1.Q0;
            boolean zI2 = x340Var.i(ven0Var);
            Object objT7 = x340Var.T();
            if (zI2 || objT7 == m4cVar2) {
                objT7 = new i030(ven0Var, (byte) 3);
                x340Var.s0(objT7);
            }
            iu30 iu30Var = (iu30) objT7;
            boolean zI3 = x340Var.i(ven0Var);
            Object objT8 = x340Var.T();
            if (zI3 || objT8 == m4cVar2) {
                objT8 = new i030(ven0Var, (byte) 4);
                x340Var.s0(objT8);
            }
            ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, h6mVar, iu30Var, (iu30) objT8, (iu30) null, j2, x340Var, 0, (i2 << 3) & 458752, 83966);
            boolean zI4 = ((i2 & 7168) == 2048) | x340Var.i(drr0Var) | x340Var.i(tob1Var2) | x340Var.i(ni7VarA);
            Object objT9 = x340Var.T();
            if (zI4) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT9 != m4cVar) {
                    tob1Var = tob1Var2;
                }
                xu30Var = (xu30) objT9;
                zG = x340Var.g(xu30Var);
                objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    final byte b2 = 1;
                    objT = new zu30() { // from class: p.itb0
                        public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
                            byte b3 = b2;
                            rih1 rih1Var = rih1.a;
                            xu30 xu30Var2 = xu30Var;
                            switch (b3) {
                                case 0:
                                    aqb0 aqb0Var = (aqb0) obj;
                                    ((Integer) obj2).intValue();
                                    x340 x340Var2 = (b0k) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= x340Var2.g(aqb0Var) ? 4 : 2;
                                    }
                                    x340 x340Var3 = x340Var2;
                                    if (!x340Var3.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                                        x340Var3.b0();
                                    } else {
                                        xu30Var2.invoke(aqb0Var, x340Var3, Integer.valueOf(iIntValue & 14));
                                    }
                                    break;
                                default:
                                    Float f2 = (Float) obj2;
                                    f2.floatValue();
                                    Float f3 = (Float) obj4;
                                    f3.floatValue();
                                    xu30Var2.invoke(f2, (Offset) obj3, f3);
                                    break;
                            }
                            return rih1Var;
                        }
                    };
                    x340Var.s0(objT);
                }
                ven0VarS = v8r.s((zu30) objT, x340Var);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    vxs vxsVar2 = new vxs(new qw4(ven0VarS, (byte) 2));
                    x340Var.s0(vxsVar2);
                    objT2 = vxsVar2;
                }
                vxsVar = (vxs) objT2;
                nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarD);
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
                zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                h2cVar = h2c.a;
                if (zBooleanValue) {
                    x340Var.i0(-1990445300);
                    h2cVar2 = h2cVar;
                    f = 1.0f;
                    xto1.e(h2cVar.a(nim0Var, een.h), 0, 0L, 0L, x340Var, 0, 14);
                    x340Var.r(false);
                } else {
                    f = 1.0f;
                    h2cVar2 = h2cVar;
                    x340Var.i0(-1990369381);
                    x340Var.r(false);
                }
                jsl jslVar = new jsl(str2);
                qim0 qim0VarD2 = u291.d(nim0Var, f);
                zI = x340Var.i(drr0Var) | x340Var.i(tob1Var);
                objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new ep30(drr0Var, tob1Var, (byte) 0);
                    x340Var.s0(objT3);
                }
                eso1.h(ni7VarA, jslVar, i541.D(f8d1.b(qim0VarD2, rih1.a, (PointerInputEventHandler) objT3).then(new qfg1(vxsVar, new p5e1((byte) 18))), drr0Var.s(), drr0Var.s(), 0.0f, Float.intBitsToFloat((int) (((Offset) tob1Var.getValue()).a >> 32)), Float.intBitsToFloat((int) (((Offset) tob1Var.getValue()).a & 4294967295L)), 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048548), (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, x340Var, 199680, WindowState.NORMAL);
                function1 = function0;
                gbx gbxVar = new gbx(z50.c, function1);
                idx idxVar = new idx(3);
                qim0 qim0VarA = h2cVar2.a(nim0Var, een.f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarY = too1.y(qim0VarA, lhc.g(x340Var).l);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                wro1.h(gbxVar, idxVar, uyn1.x(qim0VarY, 16.0f), (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, rpi.b, x340Var, 0, 6, 984);
                x340Var = x340Var;
                x340Var.r(true);
            }
            tob1Var = tob1Var2;
            nhg nhgVar = new nhg(drr0Var, tob1Var, ni7VarA, j);
            x340Var.s0(nhgVar);
            objT9 = nhgVar;
            xu30Var = (xu30) objT9;
            zG = x340Var.g(xu30Var);
            objT = x340Var.T();
            if (zG) {
                final byte b3 = 1;
                objT = new zu30() { // from class: p.itb0
                    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
                        byte b4 = b3;
                        rih1 rih1Var = rih1.a;
                        xu30 xu30Var2 = xu30Var;
                        switch (b4) {
                            case 0:
                                aqb0 aqb0Var = (aqb0) obj;
                                ((Integer) obj2).intValue();
                                x340 x340Var2 = (b0k) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= x340Var2.g(aqb0Var) ? 4 : 2;
                                }
                                x340 x340Var3 = x340Var2;
                                if (!x340Var3.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                                    x340Var3.b0();
                                } else {
                                    xu30Var2.invoke(aqb0Var, x340Var3, Integer.valueOf(iIntValue & 14));
                                }
                                break;
                            default:
                                Float f2 = (Float) obj2;
                                f2.floatValue();
                                Float f3 = (Float) obj4;
                                f3.floatValue();
                                xu30Var2.invoke(f2, (Offset) obj3, f3);
                                break;
                        }
                        return rih1Var;
                    }
                };
                x340Var.s0(objT);
            } else {
                final byte b4 = 1;
                objT = new zu30() { // from class: p.itb0
                    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
                        byte b5 = b4;
                        rih1 rih1Var = rih1.a;
                        xu30 xu30Var2 = xu30Var;
                        switch (b5) {
                            case 0:
                                aqb0 aqb0Var = (aqb0) obj;
                                ((Integer) obj2).intValue();
                                x340 x340Var2 = (b0k) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= x340Var2.g(aqb0Var) ? 4 : 2;
                                }
                                x340 x340Var3 = x340Var2;
                                if (!x340Var3.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                                    x340Var3.b0();
                                } else {
                                    xu30Var2.invoke(aqb0Var, x340Var3, Integer.valueOf(iIntValue & 14));
                                }
                                break;
                            default:
                                Float f2 = (Float) obj2;
                                f2.floatValue();
                                Float f3 = (Float) obj4;
                                f3.floatValue();
                                xu30Var2.invoke(f2, (Offset) obj3, f3);
                                break;
                        }
                        return rih1Var;
                    }
                };
                x340Var.s0(objT);
            }
            ven0VarS = v8r.s((zu30) objT, x340Var);
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                vxs vxsVar3 = new vxs(new qw4(ven0VarS, (byte) 2));
                x340Var.s0(vxsVar3);
                objT2 = vxsVar3;
            }
            vxsVar = (vxs) objT2;
            nim0Var = nim0.a;
            qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarD3);
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
            zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            h2cVar = h2c.a;
            if (zBooleanValue) {
                x340Var.i0(-1990445300);
                h2cVar2 = h2cVar;
                f = 1.0f;
                xto1.e(h2cVar.a(nim0Var, een.h), 0, 0L, 0L, x340Var, 0, 14);
                x340Var.r(false);
            } else {
                f = 1.0f;
                h2cVar2 = h2cVar;
                x340Var.i0(-1990369381);
                x340Var.r(false);
            }
            jsl jslVar2 = new jsl(str2);
            qim0 qim0VarD4 = u291.d(nim0Var, f);
            zI = x340Var.i(drr0Var) | x340Var.i(tob1Var);
            objT3 = x340Var.T();
            if (zI) {
                objT3 = new ep30(drr0Var, tob1Var, (byte) 0);
                x340Var.s0(objT3);
            } else {
                objT3 = new ep30(drr0Var, tob1Var, (byte) 0);
                x340Var.s0(objT3);
            }
            eso1.h(ni7VarA, jslVar2, i541.D(f8d1.b(qim0VarD4, rih1.a, (PointerInputEventHandler) objT3).then(new qfg1(vxsVar, new p5e1((byte) 18))), drr0Var.s(), drr0Var.s(), 0.0f, Float.intBitsToFloat((int) (((Offset) tob1Var.getValue()).a >> 32)), Float.intBitsToFloat((int) (((Offset) tob1Var.getValue()).a & 4294967295L)), 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048548), (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, x340Var, 199680, WindowState.NORMAL);
            function1 = function0;
            gbx gbxVar2 = new gbx(z50.c, function1);
            idx idxVar2 = new idx(3);
            qim0 qim0VarA2 = h2cVar2.a(nim0Var, een.f);
            WeakHashMap weakHashMap2 = osl1.x;
            qim0 qim0VarY2 = too1.y(qim0VarA2, lhc.g(x340Var).l);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            wro1.h(gbxVar2, idxVar2, uyn1.x(qim0VarY2, 16.0f), (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, rpi.b, x340Var, 0, 6, 984);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fp30(str, str2, function1, j, j2, i);
        }
    }

    public static final void l(kwk1 kwk1Var, nwk1 nwk1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(987721899);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kwk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(nwk1Var) : x340Var.i(nwk1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).e.b;
            float f2 = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0Var, f, 0.0f, f2, 8.0f, 2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(nim0.a, jA, er31.b(16.0f));
            float f3 = cbx.b(x340Var).e.b;
            float f4 = cbx.b(x340Var).e.b;
            float f5 = cbx.b(x340Var).e.b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, f3, f4, f5, 8.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            m(kwk1Var, x340Var, i2 & 14);
            c97.f(nwk1Var.b, iu30Var, (qim0) null, x340Var, (i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, kwk1Var, nwk1Var, iu30Var, qim0Var, (byte) 0);
        }
    }

    public static final void m(kwk1 kwk1Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-997582685);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = i | (b0kVar2.g(kwk1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        boolean z = false;
        if (b0kVar2.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(z)), fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            rox roxVar = rox.c;
            long j = cbx.a(b0kVar2).b.c;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            w0h1.a(roxVar, isl.a, u291.r(nim0Var, 32.0f), j, 0L, false, b0kVar2, rox.d | 48, 48);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, nim0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            if (kwk1Var.a.length() > 0) {
                b0kVar2.i0(-574459419);
                String str = kwk1Var.a;
                long j2 = cbx.a(b0kVar2).b.b;
                lee1 lee1Var = cbx.d(b0kVar2).m;
                b0kVar2 = b0kVar2;
                uwo1.e(str, (qim0) null, lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar2;
                b0kVar2.i0(-574309255);
                b0kVar2.r(false);
            }
            uwo1.e(kwk1Var.b, (qim0) null, cbx.d(b0kVar2).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2042);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(kwk1Var, i, (byte) 9);
        }
    }

    public static final void n(lwk1 lwk1Var, nwk1 nwk1Var, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        j2i j2iVar2 = j2iVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(921622928);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lwk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(nwk1Var) : x340Var.i(nwk1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).e.b;
            float f2 = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0Var, f, 0.0f, f2, 8.0f, 2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(nim0Var, jA, cr31VarB);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            float f3 = cbx.b(x340Var).e.b;
            float f4 = cbx.b(x340Var).e.b;
            float f5 = cbx.b(x340Var).e.b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(nim0Var, f3, f4, f5, 8.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA);
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
            o(lwk1Var, x340Var, i2 & 14);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            iu30Var2 = iu30Var;
            c97.f(nwk1Var.b, iu30Var2, (qim0) null, x340Var, (i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND);
            x340Var.r(true);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            j2iVar2 = j2iVar;
            k4s0.i((i2 >> 9) & 14, j2iVar2, x340Var, true, true);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(lwk1Var, nwk1Var, iu30Var2, j2iVar2, qim0Var, i, (byte) 20);
        }
    }

    public static final void o(lwk1 lwk1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1801078157);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(lwk1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            String str = lwk1Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            uwo1.e(lwk1Var.b, (qim0) null, cbx.d(x340Var).h, 0L, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2026);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 6.0f));
            uwo1.e(lwk1Var.c, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(lwk1Var, i, (byte) 10);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void p(nwk1 nwk1Var, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        nwk1 nwk1Var2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1699787092);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(nwk1Var) : x340Var.i(nwk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mwk1 mwk1Var = nwk1Var.a;
            if (mwk1Var instanceof lwk1) {
                x340Var.i0(-1407813957);
                nwk1Var2 = nwk1Var;
                iu30Var2 = iu30Var;
                n((lwk1) mwk1Var, nwk1Var2, iu30Var2, j2iVar, qim0Var, x340Var, (i2 << 3) & 65520);
                j2iVar2 = j2iVar;
                qim0Var2 = qim0Var;
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                nwk1Var2 = nwk1Var;
                iu30Var2 = iu30Var;
                qim0Var2 = qim0Var;
                j2iVar2 = j2iVar;
                if (!(mwk1Var instanceof kwk1)) {
                    throw p3d1.k(x340Var, -1407816220, false);
                }
                x340Var.i0(-1407810396);
                l((kwk1) mwk1Var, nwk1Var2, iu30Var2, qim0Var2, x340Var, ((i2 << 3) & ContentMediaFormat.PREVIEW_EPISODE) | (i2 & 7168));
                x340Var.r(false);
            }
        } else {
            nwk1Var2 = nwk1Var;
            iu30Var2 = iu30Var;
            qim0Var2 = qim0Var;
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(nwk1Var2, iu30Var2, j2iVar2, qim0Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[RETURN] */
    public static final Object q(wvr wvrVar, float f, float f2, iu30 iu30Var, Function0 function0) {
        if (Float.isNaN(f)) {
            hhg1.n("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            Object objA = wvrVar.a(f);
            objA.getClass();
            return objA;
        }
        if (Math.abs(f2) >= Math.abs(((Number) function0.invoke()).floatValue())) {
            Object objB = wvrVar.b(f, z2);
            objB.getClass();
            return objB;
        }
        Object objB2 = wvrVar.b(f, false);
        objB2.getClass();
        float f3 = wvrVar.f(objB2);
        Object objB3 = wvrVar.b(f, true);
        objB3.getClass();
        float f4 = wvrVar.f(objB3);
        float fAbs = Math.abs(((Number) iu30Var.invoke(Float.valueOf(Math.abs(f3 - f4)))).floatValue());
        if (!z2) {
            f3 = f4;
        }
        boolean z3 = Math.abs(f3 - f) >= fAbs;
        if (z3) {
            if (z2) {
                return objB3;
            }
            return objB2;
        }
        if (z3) {
            eg.o();
            return null;
        }
        if (z2) {
            return objB2;
        }
        return objB3;
    }

    public static final wvr r() {
        return new wvr(z6x.a, new float[0]);
    }

    public static qim0 s(qim0 qim0Var, t24 t24Var, qqq0 qqq0Var, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return qim0Var.then(new e14(t24Var, qqq0Var, z, null));
    }

    public static final Object t(t24 t24Var, float f, o24 o24Var, wvr wvrVar, Object obj, fe5 fe5Var, a8d1 a8d1Var) {
        Object objR;
        float f2 = wvrVar.f(obj);
        m811 m811Var = new m811();
        m811Var.a = Float.isNaN(t24Var.j.s()) ? 0.0f : t24Var.j.s();
        if (!Float.isNaN(f2)) {
            float f3 = m811Var.a;
            if (f3 != f2 && (objR = wwo1.r(f3, f2, f, fe5Var, new f14((Object) o24Var, (Object) m811Var, (byte) 0), a8d1Var)) == d9n.a) {
                return objR;
            }
        }
        return rih1.a;
    }

    public static Object u(t24 t24Var, hxn hxnVar) {
        fe5 fe5Var;
        if (t24Var.d()) {
            fe5Var = t24Var.d;
            if (fe5Var == null) {
                u890.C("snapAnimationSpec");
                throw null;
            }
        } else {
            fe5Var = d14.a;
        }
        Object objA = t24Var.a(w3v.b, hfn0.a, new l14(t24Var, fe5Var, (lnm) null, (byte) 0), hxnVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(t24 t24Var, Object obj, float f, fe5 fe5Var, e9r e9rVar, onm onmVar) {
        m14 m14Var;
        float f2;
        m811 m811Var;
        if (onmVar instanceof m14) {
            m14Var = (m14) onmVar;
            int i = m14Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                m14Var.d = i - os00.INVALID_ID;
            } else {
                m14Var = new m14(onmVar);
            }
        } else {
            m14Var = new m14(onmVar);
        }
        Object obj2 = m14Var.c;
        int i2 = m14Var.d;
        if (i2 == 0) {
            hm5.M(obj2);
            m811 m811Var2 = new m811();
            m811Var2.a = f;
            n14 n14Var = new n14(t24Var, f, fe5Var, m811Var2, e9rVar, null);
            m14Var.b = m811Var2;
            m14Var.a = f;
            m14Var.d = 1;
            Object objA = t24Var.a(obj, hfn0.a, n14Var, m14Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            f2 = f;
            m811Var = m811Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = m14Var.a;
            m811Var = m14Var.b;
            hm5.M(obj2);
        }
        return new Float(f2 - m811Var.a);
    }

    public static Object w(t24 t24Var, Object obj, float f, onm onmVar) {
        fe5 fe5Var;
        e9r e9rVar;
        if (t24Var.d()) {
            fe5Var = t24Var.d;
            if (fe5Var == null) {
                u890.C("snapAnimationSpec");
                throw null;
            }
        } else {
            fe5Var = d14.a;
        }
        fe5 fe5Var2 = fe5Var;
        if (t24Var.d()) {
            e9rVar = t24Var.e;
            if (e9rVar == null) {
                u890.C("decayAnimationSpec");
                throw null;
            }
        } else {
            e9rVar = d14.c;
        }
        return v(t24Var, obj, f, fe5Var2, e9rVar, onmVar);
    }

    public static zc80 x(r6h1 r6h1Var) {
        return new zc80(r6h1Var, (byte) 28);
    }

    public static final String y(double d2) {
        int i = (int) d2;
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
        return i2 > 0 ? String.format(localeForLanguageTag, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, 3)) : String.format(localeForLanguageTag, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, 2));
    }

    public static lik1 z() {
        return li2.b;
    }

    @Override // p.cb91
    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }
}
