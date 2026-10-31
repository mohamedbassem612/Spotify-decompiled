package p;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iod {
    public hdd1 d;
    public hdd1 e;
    public bb61 f;
    public int i;
    public pzc j;
    public mzc k;
    public final na30 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oiv f69p;
    public final ju8 q;
    public final boolean r;
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final HashMap g = new HashMap();
    public List h = Collections.EMPTY_LIST;
    public HashMap l = new HashMap();
    public final wgz0 m = new wgz0((byte) 8);
    public final wgz0 n = new wgz0((byte) 10);
    public final hod c = new hod(this);

    public iod(oiv oivVar, g4r g4rVar, boolean z) {
        this.i = 1;
        this.i = 2;
        this.f69p = oivVar;
        this.o = new na30(g4rVar.l(CaptureNoResponseQuirk.class));
        this.q = new ju8(g4rVar, (byte) 3);
        this.r = z;
    }

    public static t1d b(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback t1dVar;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d2d d2dVar = (d2d) it.next();
            if (d2dVar == null) {
                t1dVar = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                p2o1.H(d2dVar, arrayList2);
                t1dVar = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new t1d(arrayList2);
            }
            arrayList.add(t1dVar);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new t1d(arrayList);
    }

    public static HashMap c(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) map.get(num)).iterator();
            if (it.hasNext()) {
                SurfaceUtil.a((Surface) map2.get(((b29) it.next()).a));
                lb4.d();
                throw null;
            }
            arrayList.size();
            j2h1.p("CaptureSession");
        }
        return map3;
    }

    public static HashMap f(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b29 b29Var = (b29) it.next();
            int i = b29Var.d;
            if (i > 0 && b29Var.b.isEmpty()) {
                List arrayList2 = (List) map.get(Integer.valueOf(i));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(i), arrayList2);
                }
                arrayList2.add(b29Var);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                int iC = l1d.C(this.i);
                if (iC == 0) {
                    throw new IllegalStateException("close() should not be possible in state: ".concat(l1d.G(this.i)));
                }
                if (iC == 1) {
                    this.i = 8;
                } else if (iC == 2) {
                    o0c.p(this.d, "The Opener shouldn't null in state:".concat(l1d.G(this.i)));
                    this.d.q();
                    this.i = 8;
                } else if (iC == 3 || iC == 4) {
                    o0c.p(this.d, "The Opener shouldn't null in state:".concat(l1d.G(this.i)));
                    this.d.q();
                    this.i = 6;
                    this.o.g();
                    this.f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.i == 8) {
            j2h1.o("CaptureSession");
            return;
        }
        this.i = 8;
        this.e = null;
        mzc mzcVar = this.k;
        if (mzcVar != null) {
            mzcVar.b((Object) null);
            this.k = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    public final utq0 e(b29 b29Var, HashMap map, String str) {
        long jLongValue;
        j2t j2tVar = b29Var.a;
        List list = b29Var.b;
        Surface surface = (Surface) map.get(j2tVar);
        o0c.p(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        utq0 utq0Var = new utq0(b29Var.d, surface);
        wtq0 wtq0Var = utq0Var.a;
        if (str != null) {
            wtq0Var.h(str);
        } else {
            wtq0Var.h(null);
        }
        int i = b29Var.c;
        if (i == 0) {
            wtq0Var.g(1);
        } else if (i == 1) {
            wtq0Var.g(2);
        }
        if (!list.isEmpty()) {
            wtq0Var.b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get((j2t) it.next());
                o0c.p(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                wtq0Var.a(surface2);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            oiv oivVar = this.f69p;
            oivVar.getClass();
            o0c.q("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", i2 >= 33);
            DynamicRangeProfiles dynamicRangeProfilesA = ((niv) oivVar.a).a();
            if (dynamicRangeProfilesA == null) {
                jLongValue = 1;
            } else {
                liv livVar = b29Var.e;
                Long lA = miv.a(livVar, dynamicRangeProfilesA);
                if (lA == null) {
                    Objects.toString(livVar);
                    j2h1.p("CaptureSession");
                    jLongValue = 1;
                } else {
                    jLongValue = lA.longValue();
                }
            }
        } else {
            jLongValue = 1;
        }
        wtq0Var.f(jLongValue);
        return utq0Var;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            int i = this.i;
            z = i == 5 || i == 4;
        }
        return z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(ArrayList arrayList) {
        j2d j2dVar;
        synchronized (this.a) {
            try {
                if (this.i != 5) {
                    j2h1.o("CaptureSession");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    b1d b1dVar = new b1d((byte) 1);
                    ArrayList arrayList2 = new ArrayList();
                    j2h1.o("CaptureSession");
                    Iterator it = arrayList.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        wnd wndVar = (wnd) it.next();
                        if (!Collections.unmodifiableList(wndVar.a).isEmpty()) {
                            Iterator it2 = Collections.unmodifiableList(wndVar.a).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    if (wndVar.c == 2) {
                                        z = true;
                                    }
                                    vnd vndVar = new vnd(wndVar);
                                    if (wndVar.c == 5 && (j2dVar = wndVar.g) != null) {
                                        vndVar.g = j2dVar;
                                    }
                                    bb61 bb61Var = this.f;
                                    if (bb61Var != null) {
                                        vndVar.i(bb61Var.g.b);
                                    }
                                    vndVar.i(wndVar.b);
                                    wnd wndVarJ = vndVar.j();
                                    hdd1 hdd1Var = this.e;
                                    hdd1Var.g.getClass();
                                    CaptureRequest captureRequestN = eqn1.n(wndVarJ, ((CameraCaptureSession) ((q59) hdd1Var.g.b).b).getDevice(), this.g, false, this.q);
                                    if (captureRequestN != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it3 = wndVar.d.iterator();
                                        while (it3.hasNext()) {
                                            p2o1.H((d2d) it3.next(), arrayList3);
                                        }
                                        b1dVar.a(captureRequestN, arrayList3);
                                        arrayList2.add(captureRequestN);
                                        break;
                                    }
                                    j2h1.o("CaptureSession");
                                    return;
                                }
                                j2t j2tVar = (j2t) it2.next();
                                if (!this.g.containsKey(j2tVar)) {
                                    Objects.toString(j2tVar);
                                    j2h1.o("CaptureSession");
                                    break;
                                }
                            }
                        } else {
                            j2h1.o("CaptureSession");
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        j2h1.o("CaptureSession");
                        return;
                    }
                    if (this.m.i(arrayList2, z)) {
                        hdd1 hdd1Var2 = this.e;
                        o0c.p(hdd1Var2.g, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((q59) hdd1Var2.g.b).b).stopRepeating();
                        b1dVar.c = new god(this);
                    }
                    if (this.n.e(arrayList2, z)) {
                        b1dVar.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new t1d(this)));
                    }
                    this.e.i(arrayList2, b1dVar);
                } catch (CameraAccessException e) {
                    e.getMessage();
                    j2h1.p("CaptureSession");
                    Thread.dumpStack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(List list) {
        synchronized (this.a) {
            try {
                switch (l1d.C(this.i)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: ".concat(l1d.G(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.b.addAll(list);
                        break;
                    case 4:
                        this.b.addAll(list);
                        this.o.e().b(new fe(this, (byte) 19), n5u.a());
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(bb61 bb61Var) {
        synchronized (this.a) {
            try {
                if (bb61Var == null) {
                    j2h1.o("CaptureSession");
                    return;
                }
                if (this.i != 5) {
                    j2h1.o("CaptureSession");
                    return;
                }
                wnd wndVar = bb61Var.g;
                if (Collections.unmodifiableList(wndVar.a).isEmpty()) {
                    j2h1.o("CaptureSession");
                    try {
                        hdd1 hdd1Var = this.e;
                        o0c.p(hdd1Var.g, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((q59) hdd1Var.g.b).b).stopRepeating();
                    } catch (CameraAccessException e) {
                        e.getMessage();
                        j2h1.p("CaptureSession");
                        Thread.dumpStack();
                    }
                    return;
                }
                try {
                    j2h1.o("CaptureSession");
                    hdd1 hdd1Var2 = this.e;
                    hdd1Var2.g.getClass();
                    CaptureRequest captureRequestN = eqn1.n(wndVar, ((CameraCaptureSession) ((q59) hdd1Var2.g.b).b).getDevice(), this.g, true, this.q);
                    if (captureRequestN == null) {
                        j2h1.o("CaptureSession");
                        return;
                    } else {
                        this.e.o(captureRequestN, this.o.c(b(wndVar.d, new CameraCaptureSession.CaptureCallback[0])));
                        return;
                    }
                } catch (CameraAccessException e2) {
                    e2.getMessage();
                    j2h1.p("CaptureSession");
                    Thread.dumpStack();
                    return;
                }
                throw th;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n8d0 k(bb61 bb61Var, CameraDevice cameraDevice, hdd1 hdd1Var) {
        n8d0 n8d0VarP;
        synchronized (this.a) {
            try {
                if (l1d.C(this.i) != 1) {
                    j2h1.p("CaptureSession");
                    return new e280(new IllegalStateException("open() should not allow the state: ".concat(l1d.G(this.i))), (byte) 1);
                }
                byte b = 3;
                this.i = 3;
                ArrayList arrayList = new ArrayList(bb61Var.b());
                this.h = arrayList;
                this.d = hdd1Var;
                synchronized (hdd1Var.f61p) {
                    hdd1Var.q = arrayList;
                    n8d0VarP = hdd1Var.p(arrayList);
                }
                dce dceVarJ = poz0.J(jx30.a(n8d0VarP), new k65(this, bb61Var, cameraDevice, b), this.d.d);
                fna fnaVar = new fna(this, (byte) 8);
                dceVarJ.b(new nx30((Object) dceVarJ, (Object) fnaVar, (byte) 0), this.d.d);
                return poz0.F(dceVarJ);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final n8d0 l() {
        synchronized (this.a) {
            try {
                switch (l1d.C(this.i)) {
                    case 0:
                        throw new IllegalStateException("release() should not be possible in state: ".concat(l1d.G(this.i)));
                    case 2:
                        o0c.p(this.d, "The Opener shouldn't null in state:".concat(l1d.G(this.i)));
                        this.d.q();
                    case 1:
                        this.i = 8;
                        return e280.c;
                    case 4:
                    case 5:
                        hdd1 hdd1Var = this.e;
                        if (hdd1Var != null) {
                            hdd1Var.j();
                            break;
                        }
                    case 3:
                        this.i = 7;
                        this.o.g();
                        o0c.p(this.d, "The Opener shouldn't null in state:".concat(l1d.G(this.i)));
                        if (this.d.q()) {
                            d();
                            return e280.c;
                        }
                    case 6:
                        pzc pzcVarT = this.j;
                        if (pzcVarT == null) {
                            pzcVarT = upn1.t(new god(this));
                            this.j = pzcVarT;
                        }
                        return pzcVarT;
                    default:
                        return e280.c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(bb61 bb61Var) {
        synchronized (this.a) {
            try {
                switch (l1d.C(this.i)) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: ".concat(l1d.G(this.i)));
                    case 1:
                    case 2:
                    case 3:
                        this.f = bb61Var;
                        break;
                    case 4:
                        this.f = bb61Var;
                        if (bb61Var == null) {
                            return;
                        }
                        if (!this.g.keySet().containsAll(bb61Var.b())) {
                            j2h1.p("CaptureSession");
                            return;
                        } else {
                            j2h1.o("CaptureSession");
                            j(this.f);
                        }
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
