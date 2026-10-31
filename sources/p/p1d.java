package p;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p1d implements n3d {
    public int N0;
    public final j1d O0;
    public final fdc P0;
    public final w4d Q0;
    public final boolean R0;
    public final boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public toj0 W0;
    public int X;
    public final a680 X0;
    public iod Y;
    public final wmy Y0;
    public final LinkedHashMap Z;
    public final HashSet Z0;
    public final owf1 a;
    public x2d a1;
    public final d4d b;
    public final Object b1;
    public final g661 c;
    public boolean c1;
    public final js50 d;
    public final oju d1;
    public final ye90 e;
    public final oiv e1;
    public final it8 f;
    public final a3d1 f1;
    public final d1d g;
    public final it8 g1;
    public final o1d h;
    public volatile int h1 = 3;
    public final s1d i;
    public CameraDevice t;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.core.CameraUnavailableException */
    public p1d(Context context, d4d d4dVar, String str, s1d s1dVar, fdc fdcVar, w4d w4dVar, Executor executor, Handler handler, oju ojuVar, long j) throws CameraUnavailableException {
        ye90 ye90Var = new ye90();
        this.e = ye90Var;
        this.X = 0;
        new AtomicInteger(0);
        this.Z = new LinkedHashMap();
        this.N0 = 0;
        this.T0 = false;
        this.U0 = false;
        this.V0 = true;
        this.Z0 = new HashSet();
        this.a1 = a3d.a;
        this.b1 = new Object();
        this.c1 = false;
        this.g1 = new it8(this);
        this.b = d4dVar;
        this.P0 = fdcVar;
        this.Q0 = w4dVar;
        js50 js50Var = new js50(handler);
        this.d = js50Var;
        g661 g661Var = new g661(executor);
        this.c = g661Var;
        this.h = new o1d(this, g661Var, js50Var, j);
        this.a = new owf1(str);
        ((kdn0) ye90Var.b).j(new bnd0(m3d.CLOSED));
        it8 it8Var = new it8(w4dVar);
        this.f = it8Var;
        a680 a680Var = new a680();
        a680Var.b = new Object();
        a680Var.c = new LinkedHashSet();
        a680Var.d = new LinkedHashSet();
        a680Var.e = new LinkedHashSet();
        a680Var.f = new h3d(a680Var);
        a680Var.a = g661Var;
        this.X0 = a680Var;
        this.d1 = ojuVar;
        try {
            w2d w2dVarB = d4dVar.b(str);
            d1d d1dVar = new d1d(w2dVarB, js50Var, g661Var, new kba(this, (byte) 7), s1dVar.h);
            this.g = d1dVar;
            this.i = s1dVar;
            s1dVar.k(d1dVar);
            s1dVar.f.o((kdn0) it8Var.c);
            this.e1 = oiv.d(w2dVarB);
            this.Y = z();
            this.Y0 = new wmy(g661Var, js50Var, handler, a680Var, s1dVar.h, vvt.a);
            this.R0 = s1dVar.h.l(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.S0 = s1dVar.h.l(LegacyCameraSurfaceCleanupQuirk.class);
            j1d j1dVar = new j1d(this, str);
            this.O0 = j1dVar;
            lo9 lo9Var = new lo9(this, (byte) 9);
            synchronized (w4dVar.b) {
                o0c.q("Camera is already registered: " + this, !w4dVar.e.containsKey(this));
                w4dVar.e.put(this, new v4d(g661Var, lo9Var, j1dVar));
            }
            d4dVar.a.p(g661Var, j1dVar);
            this.f1 = new a3d1(context, str, d4dVar, new ypa((byte) 1, false));
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static String v(int i) {
        if (i == 0) {
            return "ERROR_NONE";
        }
        if (i == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i != 4) {
            return i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    public static String w(toj0 toj0Var) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        toj0Var.getClass();
        sb.append(toj0Var.hashCode());
        return sb.toString();
    }

    public static String x(e4i1 e4i1Var) {
        return e4i1Var.f() + e4i1Var.hashCode();
    }

    public final void A(boolean z) {
        if (!z) {
            this.h.e.b = -1L;
        }
        this.h.a();
        this.g1.h();
        t("Opening camera.");
        F(8);
        try {
            this.b.a.l(this.i.a, this.c, s());
        } catch (SecurityException e) {
            t("Unable to open camera due to " + e.getMessage());
            F(7);
            this.h.b();
        } catch (CameraAccessExceptionCompat e2) {
            t("Unable to open camera due to " + e2.getMessage());
            if (e2.a == 10001) {
                E(3, new ky8(7, e2), true);
                return;
            }
            it8 it8Var = this.g1;
            int i = ((p1d) it8Var.c).h1;
            p1d p1dVar = (p1d) it8Var.c;
            if (i != 8) {
                p1dVar.t("Don't need the onError timeout handler.");
                return;
            }
            p1dVar.t("Camera waiting for onError.");
            it8Var.h();
            it8Var.b = new cab(it8Var);
        }
    }

    public final void B() {
        byte b = 0;
        o0c.q((String) null, this.h1 == 9);
        za61 za61VarQ = this.a.q();
        if (!za61VarQ.k || !za61VarQ.j) {
            t("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.Q0.e(this.t.getId(), this.P0.S(this.t.getId()))) {
            t("Unable to create capture session in camera operating mode = " + (this.P0.b ? 1 : 0));
            return;
        }
        HashMap map = new HashMap();
        Collection<bb61> collectionR = this.a.r();
        Collection collectionS = this.a.s();
        sy8 sy8Var = hfc1.a;
        ArrayList arrayList = new ArrayList(collectionS);
        for (bb61 bb61Var : collectionR) {
            if (bb61Var.g.b.a.containsKey(sy8Var) && bb61Var.b().size() != 1) {
                String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(bb61Var.b().size()));
                j2h1.p("StreamUseCaseUtil");
                break;
            }
            if (bb61Var.g.b.a.containsKey(sy8Var)) {
                int i = 0;
                for (bb61 bb61Var2 : collectionR) {
                    if (((i4i1) arrayList.get(i)).x() == k4i1.f) {
                        o0c.q("MeteringRepeating should contain a surface", !bb61Var2.b().isEmpty());
                        map.put((j2t) bb61Var2.b().get(0), 1L);
                    } else if (bb61Var2.g.b.a.containsKey(sy8Var) && !bb61Var2.b().isEmpty()) {
                        map.put((j2t) bb61Var2.b().get(0), (Long) bb61Var2.g.b.e(sy8Var));
                    }
                    i++;
                }
                break;
            }
        }
        iod iodVar = this.Y;
        synchronized (iodVar.a) {
            iodVar.l = map;
        }
        iod iodVar2 = this.Y;
        bb61 bb61VarB = za61VarQ.b();
        CameraDevice cameraDevice = this.t;
        cameraDevice.getClass();
        wmy wmyVar = this.Y0;
        n8d0 n8d0VarK = iodVar2.k(bb61VarB, cameraDevice, new hdd1((g4r) wmyVar.e, (g4r) wmyVar.f, (a680) wmyVar.d, (g661) wmyVar.a, (js50) wmyVar.b, (Handler) wmyVar.c));
        n8d0VarK.b(new nx30(n8d0VarK, new q59(this, iodVar2), b), this.c);
    }

    public final void C() {
        if (this.W0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.W0.getClass();
            sb.append(this.W0.hashCode());
            String string = sb.toString();
            owf1 owf1Var = this.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) owf1Var.b;
            if (linkedHashMap.containsKey(string)) {
                g4i1 g4i1Var = (g4i1) linkedHashMap.get(string);
                g4i1Var.e = false;
                if (!g4i1Var.f) {
                    linkedHashMap.remove(string);
                }
            }
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.W0.getClass();
            sb2.append(this.W0.hashCode());
            String string2 = sb2.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) owf1Var.b;
            if (linkedHashMap2.containsKey(string2)) {
                g4i1 g4i1Var2 = (g4i1) linkedHashMap2.get(string2);
                g4i1Var2.f = false;
                if (!g4i1Var2.e) {
                    linkedHashMap2.remove(string2);
                }
            }
            toj0 toj0Var = this.W0;
            toj0Var.getClass();
            j2h1.o("MeteringRepeating");
            g280 g280Var = (g280) toj0Var.b;
            if (g280Var != null) {
                g280Var.a();
            }
            toj0Var.b = null;
            this.W0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        bb61 bb61Var;
        List listUnmodifiableList;
        boolean z = false;
        Object[] objArr = 0;
        o0c.q((String) null, this.Y != null);
        t("Resetting Capture Session");
        iod iodVar = this.Y;
        synchronized (iodVar.a) {
            bb61Var = iodVar.f;
        }
        synchronized (iodVar.a) {
            listUnmodifiableList = Collections.unmodifiableList(iodVar.b);
        }
        iod iodVarZ = z();
        this.Y = iodVarZ;
        iodVarZ.m(bb61Var);
        this.Y.i(listUnmodifiableList);
        if (l1d.C(this.h1) != 8) {
            t("Skipping Capture Session state check due to current camera state: " + z5c.u(this.h1) + " and previous session status: " + iodVar.g());
        } else if (this.R0 && iodVar.g()) {
            t("Close camera before creating new session");
            F(6);
        }
        if (this.S0 && iodVar.g()) {
            t("ConfigAndClose is required when close the camera.");
            this.T0 = true;
        }
        iodVar.a();
        n8d0 n8d0VarL = iodVar.l();
        t("Releasing session in state ".concat(z5c.q(this.h1)));
        this.Z.put(iodVar, n8d0VarL);
        n8d0VarL.b(new nx30((Object) n8d0VarL, (Object) new ic9(this, iodVar, z, (byte) 23), (byte) (objArr == true ? 1 : 0)), n5u.a());
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void E(int i, ky8 ky8Var, boolean z) {
        m3d m3dVar;
        m3d m3dVar2;
        v4d v4dVarA;
        HashMap map;
        jy8 jy8Var;
        t("Transitioning camera internal state: " + z5c.u(this.h1) + " --> " + z5c.u(i));
        if (mif1.g()) {
            mif1.h(l1d.C(i), "CX:C2State[" + this + "]");
            if (ky8Var != null) {
                this.N0++;
            }
            if (this.N0 > 0) {
                mif1.h(ky8Var != null ? ky8Var.a : 0, "CX:C2StateErrorCode[" + this + "]");
            }
        }
        this.h1 = i;
        switch (l1d.C(i)) {
            case 0:
                m3dVar = m3d.RELEASED;
                break;
            case 1:
                m3dVar = m3d.RELEASING;
                break;
            case 2:
                m3dVar = m3d.CLOSED;
                break;
            case 3:
                m3dVar = m3d.PENDING_OPEN;
                break;
            case 4:
            case 5:
                m3dVar = m3d.CLOSING;
                break;
            case 6:
            case 7:
                m3dVar = m3d.OPENING;
                break;
            case 8:
                m3dVar = m3d.OPEN;
                break;
            case 9:
                m3dVar = m3d.CONFIGURED;
                break;
            default:
                eg.m("Unknown state: ".concat(z5c.u(i)));
                return;
        }
        w4d w4dVar = this.Q0;
        synchronized (w4dVar.b) {
            try {
                int i2 = w4dVar.f;
                m3d m3dVar3 = m3d.RELEASED;
                HashMap map2 = w4dVar.e;
                if (m3dVar == m3dVar3) {
                    v4d v4dVar = (v4d) map2.remove(this);
                    if (v4dVar != null) {
                        w4dVar.b();
                        m3dVar2 = v4dVar.a;
                    } else {
                        m3dVar2 = null;
                    }
                } else {
                    v4d v4dVar2 = (v4d) map2.get(this);
                    o0c.p(v4dVar2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    m3d m3dVar4 = v4dVar2.a;
                    v4dVar2.a = m3dVar;
                    m3d m3dVar5 = m3d.OPENING;
                    if (m3dVar == m3dVar5) {
                        o0c.q("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", m3dVar.a || m3dVar4 == m3dVar5);
                    }
                    if (m3dVar4 != m3dVar) {
                        w4d.c(this, m3dVar);
                        w4dVar.b();
                    }
                    m3dVar2 = m3dVar4;
                }
                if (m3dVar2 != m3dVar) {
                    if (w4dVar.d.b == 2 && m3dVar == m3d.CONFIGURED) {
                        String strS = w4dVar.d.S(g().b());
                        if (strS != null) {
                            v4dVarA = w4dVar.a(strS);
                        } else {
                            v4dVarA = null;
                        }
                    } else {
                        v4dVarA = null;
                    }
                    if (i2 < 1 && w4dVar.f > 0) {
                        map = new HashMap();
                        for (Map.Entry entry : w4dVar.e.entrySet()) {
                            if (((v4d) entry.getValue()).a == m3d.PENDING_OPEN) {
                                map.put((c2d) entry.getKey(), (v4d) entry.getValue());
                            }
                        }
                    } else if (m3dVar != m3d.PENDING_OPEN || w4dVar.f <= 0) {
                        map = null;
                    } else {
                        map = new HashMap();
                        map.put(this, (v4d) w4dVar.e.get(this));
                    }
                    if (map != null && !z) {
                        map.remove(this);
                    }
                    if (map != null) {
                        for (v4d v4dVar3 : map.values()) {
                            v4dVar3.getClass();
                            try {
                                v4dVar3.b.execute(new fe(v4dVar3.d, (byte) 16));
                            } catch (RejectedExecutionException unused) {
                                j2h1.q("CameraStateRegistry");
                            }
                        }
                    }
                    if (v4dVarA != null) {
                        try {
                            v4dVarA.b.execute(new fe(v4dVarA.c, (byte) 17));
                        } catch (RejectedExecutionException unused2) {
                            j2h1.q("CameraStateRegistry");
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((kdn0) this.e.b).j(new bnd0(m3dVar));
        it8 it8Var = this.f;
        it8Var.getClass();
        switch (m3dVar.ordinal()) {
            case 0:
            case 2:
                jy8Var = new jy8(5, ky8Var);
                break;
            case 1:
            case 4:
                jy8Var = new jy8(4, ky8Var);
                break;
            case 3:
                w4d w4dVar2 = (w4d) it8Var.b;
                synchronized (w4dVar2.b) {
                    Iterator it = w4dVar2.e.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jy8Var = new jy8(1, null);
                        } else if (((v4d) ((Map.Entry) it.next()).getValue()).a == m3d.CLOSING) {
                            jy8Var = new jy8(2, null);
                        }
                    }
                }
                break;
            case 5:
                jy8Var = new jy8(2, ky8Var);
                break;
            case 6:
            case 7:
                jy8Var = new jy8(3, ky8Var);
                break;
            default:
                bhn0.A(m3dVar, "Unknown internal camera state: ");
                return;
        }
        jy8Var.toString();
        m3dVar.toString();
        Objects.toString(ky8Var);
        j2h1.o("CameraStateMachine");
        if (Objects.equals((jy8) ((kdn0) it8Var.c).e(), jy8Var)) {
            return;
        }
        jy8Var.toString();
        j2h1.o("CameraStateMachine");
        ((kdn0) it8Var.c).j(jy8Var);
    }

    public final void F(int i) {
        E(i, null, true);
    }

    public final ArrayList G(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e4i1 e4i1Var = (e4i1) it.next();
            boolean z = this.V0;
            String strX = x(e4i1Var);
            Class<?> cls = e4i1Var.getClass();
            bb61 bb61Var = z ? e4i1Var.m : e4i1Var.n;
            i4i1 i4i1Var = e4i1Var.f;
            i29 i29Var = e4i1Var.g;
            arrayList2.add(new iy8(strX, cls, bb61Var, i4i1Var, i29Var != null ? i29Var.a : null, i29Var, e4i1Var.b() != null ? cfc1.F(e4i1Var) : null));
        }
        return arrayList2;
    }

    public final void H(ArrayList arrayList) {
        Size size;
        boolean zIsEmpty = this.a.r().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            iy8 iy8Var = (iy8) it.next();
            if (!this.a.t(iy8Var.a)) {
                owf1 owf1Var = this.a;
                String str = iy8Var.a;
                bb61 bb61Var = iy8Var.c;
                i4i1 i4i1Var = iy8Var.d;
                i29 i29Var = iy8Var.f;
                List list = iy8Var.g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) owf1Var.b;
                g4i1 g4i1Var = (g4i1) linkedHashMap.get(str);
                if (g4i1Var == null) {
                    g4i1Var = new g4i1(bb61Var, i4i1Var, i29Var, list);
                    linkedHashMap.put(str, g4i1Var);
                }
                g4i1Var.e = true;
                owf1Var.u(str, bb61Var, i4i1Var, i29Var, list);
                arrayList2.add(iy8Var.a);
                if (iy8Var.b == law0.class && (size = iy8Var.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        t("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED");
        if (zIsEmpty) {
            this.g.m(true);
            d1d d1dVar = this.g;
            synchronized (d1dVar.d) {
                d1dVar.f31p++;
            }
        }
        p();
        L();
        K();
        D();
        if (this.h1 == 9) {
            B();
        } else {
            int iC = l1d.C(this.h1);
            if (iC == 2 || iC == 3) {
                I(false);
            } else if (iC != 4) {
                t("open() ignored due to being in state: ".concat(z5c.u(this.h1)));
            } else {
                F(7);
                if (!this.Z.isEmpty() && !this.U0 && this.X == 0) {
                    o0c.q("Camera Device should be open if session close is not complete", this.t != null);
                    F(9);
                    B();
                }
            }
        }
        if (rational != null) {
            this.g.h.getClass();
        }
    }

    public final void I(boolean z) {
        t("Attempting to force open the camera.");
        if (this.Q0.d(this)) {
            A(z);
        } else {
            t("No cameras available. Waiting for available camera before opening camera.");
            F(4);
        }
    }

    public final void J(boolean z) {
        t("Attempting to open the camera.");
        if (this.O0.b && this.Q0.d(this)) {
            A(z);
        } else {
            t("No cameras available. Waiting for available camera before opening camera.");
            F(4);
        }
    }

    public final void K() {
        owf1 owf1Var = this.a;
        owf1Var.getClass();
        za61 za61Var = new za61();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) owf1Var.b).entrySet()) {
            g4i1 g4i1Var = (g4i1) entry.getValue();
            if (g4i1Var.f && g4i1Var.e) {
                String str = (String) entry.getKey();
                za61Var.a(g4i1Var.a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        j2h1.o("UseCaseAttachState");
        boolean z = za61Var.k;
        d1d d1dVar = this.g;
        if (!z || !za61Var.j) {
            d1dVar.v = 1;
            d1dVar.h.c = 1;
            d1dVar.n.getClass();
            this.Y.m(d1dVar.j());
            return;
        }
        int i = za61Var.b().g.c;
        d1dVar.v = i;
        d1dVar.h.c = i;
        d1dVar.n.getClass();
        za61Var.a(d1dVar.j());
        this.Y.m(za61Var.b());
    }

    public final void L() {
        Iterator it = this.a.s().iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            zBooleanValue |= ((Boolean) ((i4i1) it.next()).h(i4i1.G0, Boolean.FALSE)).booleanValue();
        }
        this.g.l.a = zBooleanValue;
    }

    @Override // p.d4i1
    public final void b(e4i1 e4i1Var) {
        this.c.execute(new ny2((Object) this, (Object) x(e4i1Var), (byte) 23));
    }

    @Override // p.n3d
    public final c3d c() {
        return this.g;
    }

    @Override // p.n3d
    public final x2d d() {
        return this.a1;
    }

    @Override // p.d4i1
    public final void e(e4i1 e4i1Var) {
        this.c.execute(new g1d(this, x(e4i1Var), this.V0 ? e4i1Var.m : e4i1Var.n, e4i1Var.f, e4i1Var.g, e4i1Var.b() == null ? null : cfc1.F(e4i1Var), (byte) 0));
    }

    @Override // p.n3d
    public final void f(boolean z) {
        this.c.execute(new s38((Object) this, z, (byte) 2));
    }

    @Override // p.n3d
    public final l3d g() {
        return this.i;
    }

    @Override // p.n3d
    public final void h(z2d z2dVar) {
        z2dVar.q();
        this.a1 = z2dVar;
        synchronized (this.b1) {
        }
    }

    @Override // p.d4i1
    public final void i(e4i1 e4i1Var) {
        this.c.execute(new g1d(this, x(e4i1Var), this.V0 ? e4i1Var.m : e4i1Var.n, e4i1Var.f, e4i1Var.g, e4i1Var.b() == null ? null : cfc1.F(e4i1Var), (byte) 2));
    }

    @Override // p.d4i1
    public final void j(e4i1 e4i1Var) {
        this.c.execute(new g1d(this, x(e4i1Var), this.V0 ? e4i1Var.m : e4i1Var.n, e4i1Var.f, e4i1Var.g, e4i1Var.b() == null ? null : cfc1.F(e4i1Var), (byte) 1));
    }

    @Override // p.n3d
    public final yfp0 k() {
        return this.e;
    }

    @Override // p.n3d
    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(G(arrayList2));
        for (e4i1 e4i1Var : new ArrayList(arrayList2)) {
            String strX = x(e4i1Var);
            HashSet hashSet = this.Z0;
            if (hashSet.contains(strX)) {
                e4i1Var.t();
                hashSet.remove(strX);
            }
        }
        this.c.execute(new f1d(this, arrayList3, (byte) 0));
    }

    @Override // p.n3d
    public final void m(ArrayList arrayList) {
        byte b;
        d1d d1dVar = this.g;
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        synchronized (d1dVar.d) {
            b = 1;
            d1dVar.f31p++;
        }
        ArrayList<e4i1> arrayList3 = new ArrayList(arrayList2);
        HashSet hashSet = this.Z0;
        for (e4i1 e4i1Var : arrayList3) {
            String strX = x(e4i1Var);
            if (!hashSet.contains(strX)) {
                hashSet.add(strX);
                e4i1Var.s();
                e4i1Var.q();
            }
        }
        try {
            this.c.execute(new f1d(this, new ArrayList(G(arrayList2)), b));
        } catch (RejectedExecutionException unused) {
            t("Unable to attach use cases.");
            d1dVar.i();
        }
    }

    @Override // p.n3d
    public final void o(boolean z) {
        this.V0 = z;
    }

    public final void p() {
        owf1 owf1Var = this.a;
        bb61 bb61VarB = owf1Var.q().b();
        ArrayList arrayList = bb61VarB.g.a;
        int size = Collections.unmodifiableList(arrayList).size();
        int size2 = bb61VarB.b().size();
        if (bb61VarB.b().isEmpty()) {
            return;
        }
        byte b = 1;
        if (!Collections.unmodifiableList(arrayList).isEmpty()) {
            if (size2 == 1 && size == 1) {
                C();
                return;
            }
            if (size >= 2) {
                C();
                return;
            } else if (this.W0 == null || y()) {
                j2h1.o("Camera2CameraImpl");
                return;
            } else {
                C();
                return;
            }
        }
        if (this.W0 == null) {
            this.W0 = new toj0(this.i.b, this.d1, new h1d(this, b));
        }
        if (!y()) {
            j2h1.p("Camera2CameraImpl");
            return;
        }
        toj0 toj0Var = this.W0;
        if (toj0Var != null) {
            String strW = w(toj0Var);
            toj0 toj0Var2 = this.W0;
            bb61 bb61Var = (bb61) toj0Var2.c;
            soj0 soj0Var = (soj0) toj0Var2.d;
            k4i1 k4i1Var = k4i1.f;
            List listSingletonList = Collections.singletonList(k4i1Var);
            LinkedHashMap linkedHashMap = (LinkedHashMap) owf1Var.b;
            g4i1 g4i1Var = (g4i1) linkedHashMap.get(strW);
            if (g4i1Var == null) {
                g4i1Var = new g4i1(bb61Var, soj0Var, null, listSingletonList);
                linkedHashMap.put(strW, g4i1Var);
            }
            g4i1Var.e = true;
            owf1Var.u(strW, bb61Var, soj0Var, (i29) null, listSingletonList);
            toj0 toj0Var3 = this.W0;
            bb61 bb61Var2 = (bb61) toj0Var3.c;
            soj0 soj0Var2 = (soj0) toj0Var3.d;
            List listSingletonList2 = Collections.singletonList(k4i1Var);
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) owf1Var.b;
            g4i1 g4i1Var2 = (g4i1) linkedHashMap2.get(strW);
            if (g4i1Var2 == null) {
                g4i1Var2 = new g4i1(bb61Var2, soj0Var2, null, listSingletonList2);
                linkedHashMap2.put(strW, g4i1Var2);
            }
            g4i1Var2.f = true;
        }
    }

    public final void q() {
        ArrayList<wnd> arrayList;
        o0c.q("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + z5c.u(this.h1) + " (error: " + v(this.X) + ")", this.h1 == 5 || this.h1 == 2 || (this.h1 == 7 && this.X != 0));
        D();
        iod iodVar = this.Y;
        synchronized (iodVar.a) {
            try {
                if (iodVar.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(iodVar.b);
                    iodVar.b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (wnd wndVar : arrayList) {
                for (d2d d2dVar : wndVar.d) {
                    Object obj = wndVar.f.a.get("CAPTURE_CONFIG_ID_KEY");
                    d2dVar.a(obj == null ? -1 : ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void r() {
        byte b = 0;
        o0c.q((String) null, this.h1 == 2 || this.h1 == 5);
        o0c.q((String) null, this.Z.isEmpty());
        if (!this.T0) {
            u();
            return;
        }
        if (this.U0) {
            t("Ignored since configAndClose is processing");
            return;
        }
        if (!this.O0.b) {
            this.T0 = false;
            u();
            t("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            t("Open camera to configAndClose");
            pzc pzcVarT = upn1.t(new h1d(this, b));
            this.U0 = true;
            pzcVarT.b.b(new fe(this, (byte) 12), this.c);
        }
    }

    public final CameraDevice.StateCallback s() {
        ArrayList arrayList = new ArrayList(this.a.q().b().c);
        arrayList.add((h3d) this.X0.f);
        arrayList.add(this.h);
        return kqn1.o(arrayList);
    }

    public final void t(String str) {
        toString();
        j2h1.z(3, j2h1.J("Camera2CameraImpl"));
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.i.a);
    }

    public final void u() {
        o0c.q((String) null, this.h1 == 2 || this.h1 == 5);
        o0c.q((String) null, this.Z.isEmpty());
        this.t = null;
        if (this.h1 == 5) {
            F(3);
            return;
        }
        this.b.a.r(this.O0);
        F(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.b1) {
            try {
                i = this.P0.b == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        owf1 owf1Var = this.a;
        owf1Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) owf1Var.b).entrySet()) {
            if (((g4i1) entry.getValue()).e) {
                arrayList2.add((g4i1) entry.getValue());
            }
        }
        for (g4i1 g4i1Var : Collections.unmodifiableCollection(arrayList2)) {
            List list = g4i1Var.d;
            if (list == null || list.get(0) != k4i1.f) {
                if (g4i1Var.c == null || g4i1Var.d == null) {
                    g4i1Var.toString();
                    j2h1.M("Camera2CameraImpl");
                    return false;
                }
                bb61 bb61Var = g4i1Var.a;
                i4i1 i4i1Var = g4i1Var.b;
                for (j2t j2tVar : bb61Var.b()) {
                    a3d1 a3d1Var = this.f1;
                    int iM = i4i1Var.m();
                    k29 k29VarB = k29.b(i, iM, j2tVar.h, a3d1Var.i(iM));
                    int iM2 = i4i1Var.m();
                    Size size = j2tVar.h;
                    i29 i29Var = g4i1Var.c;
                    arrayList.add(new ey8(k29VarB, iM2, size, i29Var.b, g4i1Var.d, i29Var.d, (Range) i4i1Var.h(i4i1.F0, (Object) null)));
                }
            }
        }
        this.W0.getClass();
        HashMap map = new HashMap();
        toj0 toj0Var = this.W0;
        map.put((soj0) toj0Var.d, Collections.singletonList((Size) toj0Var.e));
        try {
            this.f1.g(i, arrayList, map, false, false);
            t("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException unused) {
            t("Surface combination with metering repeating  not supported!");
            return false;
        }
    }

    public final iod z() {
        iod iodVar;
        synchronized (this.b1) {
            iodVar = new iod(this.e1, this.i.h, false);
        }
        return iodVar;
    }
}
