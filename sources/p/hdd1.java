package p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hdd1 extends edd1 {
    public final a680 b;
    public final Handler c;
    public final g661 d;
    public final js50 e;
    public hod f;
    public i6b g;
    public pzc h;
    public mzc i;
    public jx30 j;
    public final js50 o;
    public ArrayList q;
    public suc0 r;
    public final yw7 s;
    public final jl00 t;
    public final na30 u;
    public final wgz0 v;
    public final Object a = new Object();
    public List k = null;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f61p = new Object();
    public final AtomicBoolean w = new AtomicBoolean(false);

    public hdd1(g4r g4rVar, g4r g4rVar2, a680 a680Var, g661 g661Var, js50 js50Var, Handler handler) {
        this.b = a680Var;
        this.c = handler;
        this.d = g661Var;
        this.e = js50Var;
        yw7 yw7Var = new yw7();
        yw7Var.a = g4rVar2.l(TextureViewIsClosedQuirk.class);
        yw7Var.b = g4rVar.l(PreviewOrientationIncorrectQuirk.class);
        yw7Var.c = g4rVar.l(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.s = yw7Var;
        this.u = new na30(g4rVar.l(CaptureSessionStuckQuirk.class) || g4rVar.l(IncorrectCaptureStateQuirk.class));
        this.t = new jl00(g4rVar2);
        this.v = new wgz0(g4rVar2);
        this.o = js50Var;
    }

    @Override // p.edd1
    public final void a(hdd1 hdd1Var) {
        Objects.requireNonNull(this.f);
        this.f.a(hdd1Var);
    }

    @Override // p.edd1
    public final void b(hdd1 hdd1Var) {
        Objects.requireNonNull(this.f);
        this.f.b(hdd1Var);
    }

    @Override // p.edd1
    public final void c(hdd1 hdd1Var) {
        pzc pzcVar;
        synchronized (this.f61p) {
            this.s.b(this.q);
        }
        l("onClosed()");
        synchronized (this.a) {
            try {
                if (this.l) {
                    pzcVar = null;
                } else {
                    this.l = true;
                    o0c.p(this.h, "Need to call openCaptureSession before using this API.");
                    pzcVar = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.a) {
            try {
                List list = this.k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((j2t) it.next()).b();
                    }
                    this.k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.u.g();
        if (pzcVar != null) {
            pzcVar.b.b(new fdd1(this, hdd1Var, (byte) 0), n5u.a());
        }
    }

    @Override // p.edd1
    public final void d(hdd1 hdd1Var) {
        hdd1 hdd1Var2;
        Objects.requireNonNull(this.f);
        synchronized (this.a) {
            try {
                List list = this.k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((j2t) it.next()).b();
                    }
                    this.k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.u.g();
        a680 a680Var = this.b;
        Iterator it2 = a680Var.l().iterator();
        while (it2.hasNext() && (hdd1Var2 = (hdd1) it2.next()) != this) {
            synchronized (hdd1Var2.a) {
                try {
                    List list2 = hdd1Var2.k;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((j2t) it3.next()).b();
                        }
                        hdd1Var2.k = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hdd1Var2.u.g();
        }
        synchronized (a680Var.b) {
            ((LinkedHashSet) a680Var.e).remove(this);
        }
        this.f.d(hdd1Var);
    }

    @Override // p.edd1
    public final void e(hdd1 hdd1Var) {
        ArrayList arrayList;
        hdd1 hdd1Var2;
        hdd1 hdd1Var3;
        hdd1 hdd1Var4;
        l("Session onConfigured()");
        jl00 jl00Var = this.t;
        a680 a680Var = this.b;
        synchronized (a680Var.b) {
            arrayList = new ArrayList((LinkedHashSet) a680Var.e);
        }
        ArrayList arrayListI = this.b.i();
        if (((CaptureSessionOnClosedNotCalledQuirk) jl00Var.b) != null) {
            LinkedHashSet<hdd1> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (hdd1Var4 = (hdd1) it.next()) != hdd1Var) {
                linkedHashSet.add(hdd1Var4);
            }
            for (hdd1 hdd1Var5 : linkedHashSet) {
                hdd1Var5.getClass();
                hdd1Var5.d(hdd1Var5);
            }
        }
        Objects.requireNonNull(this.f);
        a680 a680Var2 = this.b;
        synchronized (a680Var2.b) {
            ((LinkedHashSet) a680Var2.c).add(this);
            ((LinkedHashSet) a680Var2.e).remove(this);
        }
        Iterator it2 = a680Var2.l().iterator();
        while (it2.hasNext() && (hdd1Var3 = (hdd1) it2.next()) != this) {
            synchronized (hdd1Var3.a) {
                try {
                    List list = hdd1Var3.k;
                    if (list != null) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((j2t) it3.next()).b();
                        }
                        hdd1Var3.k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hdd1Var3.u.g();
        }
        this.f.e(hdd1Var);
        if (((CaptureSessionOnClosedNotCalledQuirk) jl00Var.b) != null) {
            LinkedHashSet<hdd1> linkedHashSet2 = new LinkedHashSet();
            Iterator it4 = arrayListI.iterator();
            while (it4.hasNext() && (hdd1Var2 = (hdd1) it4.next()) != hdd1Var) {
                linkedHashSet2.add(hdd1Var2);
            }
            for (hdd1 hdd1Var6 : linkedHashSet2) {
                hdd1Var6.getClass();
                hdd1Var6.c(hdd1Var6);
            }
        }
    }

    @Override // p.edd1
    public final void f(hdd1 hdd1Var) {
        Objects.requireNonNull(this.f);
        this.f.f(hdd1Var);
    }

    @Override // p.edd1
    public final void g(hdd1 hdd1Var) {
        byte b;
        pzc pzcVar;
        synchronized (this.a) {
            try {
                b = 1;
                if (this.n) {
                    pzcVar = null;
                } else {
                    this.n = true;
                    o0c.p(this.h, "Need to call openCaptureSession before using this API.");
                    pzcVar = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pzcVar != null) {
            pzcVar.b.b(new fdd1(this, hdd1Var, b), n5u.a());
        }
    }

    @Override // p.edd1
    public final void h(hdd1 hdd1Var, Surface surface) {
        Objects.requireNonNull(this.f);
        this.f.h(hdd1Var, surface);
    }

    public final int i(ArrayList arrayList, b1d b1dVar) {
        CameraCaptureSession.CaptureCallback captureCallbackC = this.u.c(b1dVar);
        o0c.p(this.g, "Need to call openCaptureSession before using this API.");
        return ((q59) this.g.b).b(arrayList, this.d, captureCallbackC);
    }

    public final void j() {
        if (!this.w.compareAndSet(false, true)) {
            l("close() has been called. Skip this invocation.");
            return;
        }
        if (this.v.b) {
            try {
                l("Call abortCaptures() before closing session.");
                o0c.p(this.g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((q59) this.g.b).b).abortCaptures();
            } catch (Exception e) {
                l("Exception when calling abortCaptures()" + e);
            }
        }
        l("Session call close()");
        this.u.e().b(new gdd1(this, (byte) 1), this.d);
    }

    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = new i6b(cameraCaptureSession, this.c);
        }
    }

    public final void l(String str) {
        j2h1.o("SyncCaptureSessionImpl");
    }

    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.h != null;
        }
        return z;
    }

    public final n8d0 n(CameraDevice cameraDevice, jb61 jb61Var, List list) {
        n8d0 n8d0VarF;
        synchronized (this.f61p) {
            try {
                ArrayList<hdd1> arrayListI = this.b.i();
                ArrayList arrayList = new ArrayList();
                for (hdd1 hdd1Var : arrayListI) {
                    final js50 js50Var = hdd1Var.o;
                    final n8d0 n8d0VarE = hdd1Var.u.e();
                    final long j = 1500;
                    arrayList.add(upn1.t(new nzc(n8d0VarE, js50Var, j) { // from class: p.kx30
                        public final /* synthetic */ n8d0 a;
                        public final /* synthetic */ js50 b;
                        public final /* synthetic */ short c;

                        /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
                        {
                            this.c = (int) j;
                        }

                        public final Object attachCompleter(final mzc mzcVar) {
                            final long j2 = this.c;
                            n5u n5uVarA = n5u.a();
                            final n8d0 n8d0Var = this.a;
                            poz0.G(true, n8d0Var, mzcVar, n5uVarA);
                            if (!n8d0Var.isDone()) {
                                n8d0Var.b(new fss((Object) this.b.schedule(new Callable(mzcVar, n8d0Var, j2) { // from class: p.lx30
                                    public final /* synthetic */ mzc a;
                                    public final /* synthetic */ n8d0 b;
                                    public final /* synthetic */ short c;

                                    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
                                    {
                                        this.c = (int) j2;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        return Boolean.valueOf(this.a.c(new TimeoutException("Future[" + this.b + "] is not done within " + this.c + " ms.")));
                                    }
                                }, j2, TimeUnit.MILLISECONDS), (byte) 27), n5u.a());
                            }
                            return "TimeoutFuture[" + n8d0Var + "]";
                        }
                    }));
                }
                suc0 suc0Var = new suc0(new ArrayList(arrayList), false, n5u.a());
                this.r = suc0Var;
                n8d0VarF = poz0.F(poz0.J(jx30.a(suc0Var), new tws(this, cameraDevice, jb61Var, list, (byte) 5), this.d));
            } catch (Throwable th) {
                throw th;
            }
        }
        return n8d0VarF;
    }

    public final int o(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackC = this.u.c(captureCallback);
        o0c.p(this.g, "Need to call openCaptureSession before using this API.");
        return ((q59) this.g.b).t(captureRequest, this.d, captureCallbackC);
    }

    public final n8d0 p(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.m) {
                    return new e280(new CancellationException("Opener is disabled"), (byte) 1);
                }
                dce dceVarJ = poz0.J(jx30.a(x9p1.s(arrayList, this.d, this.e)), new p4u(this, arrayList), this.d);
                this.j = dceVarJ;
                return poz0.F(dceVarJ);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final boolean q() {
        boolean z;
        synchronized (this.f61p) {
            try {
                if (m()) {
                    this.s.b(this.q);
                } else {
                    suc0 suc0Var = this.r;
                    if (suc0Var != null) {
                        suc0Var.cancel(true);
                    }
                }
                ?? r1 = 0;
                r1 = 0;
                r1 = 0;
                r1 = 0;
                try {
                    synchronized (this.a) {
                        try {
                            if (!this.m) {
                                jx30 jx30Var = this.j;
                                jx30 jx30Var2 = jx30Var != null ? jx30Var : null;
                                this.m = true;
                                r1 = jx30Var2;
                            }
                            z = !m();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (r1 != 0) {
                        r1.cancel(true);
                    }
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        r1.cancel(true);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z;
    }

    public final i6b r() {
        this.g.getClass();
        return this.g;
    }
}
