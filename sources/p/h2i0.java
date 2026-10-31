package p;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaSessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h2i0 extends jh70 {
    public final WeakReference l;
    public final v1k m;
    public final CopyOnWriteArraySet n;
    public ag11 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public gg11 f58p;
    public int q;
    public l280 r;
    public l280 s;
    public int t;
    public sqe1 u;
    public g2i0 v;
    public f2i0 w;

    public h2i0(fzh0 fzh0Var) {
        attachInterface(this, "androidx.media3.session.IMediaSession");
        this.l = new WeakReference(fzh0Var);
        this.m = new v1k(fzh0Var);
        this.n = new CopyOnWriteArraySet();
        ag11 ag11Var = ag11.i;
        this.o = ag11Var;
        this.f58p = gg11.g;
        this.r = ag11Var;
        this.s = ag11Var;
        this.t = 0;
    }

    public static n8d0 a1(fzh0 fzh0Var, ixh0 ixh0Var, int i, e2i0 e2i0Var, akl aklVar) {
        if (fzh0Var.p()) {
            return f280.b;
        }
        n8d0 n8d0Var = (n8d0) e2i0Var.i(fzh0Var, ixh0Var, i);
        em61 em61Var = new em61();
        n8d0Var.b(new m2d((Object) fzh0Var, (Object) em61Var, (Object) aklVar, (Object) n8d0Var, (byte) 18), l5u.a);
        return em61Var;
    }

    public static void i1(fzh0 fzh0Var, ixh0 ixh0Var, int i, ch61 ch61Var) {
        try {
            hxh0 hxh0Var = ixh0Var.e;
            hxh0Var.getClass();
            hxh0Var.g(i, ch61Var);
            fzh0Var.c.a(true, true);
        } catch (RemoteException e) {
            oon1.I("Failed to send result to controller " + ixh0Var, e);
        }
    }

    public static c8d0 j1(akl aklVar) {
        return new c8d0(new c8d0(aklVar, (byte) 25), (byte) 24);
    }

    @Override // p.kh70
    public final void B(eh70 eh70Var, int i, Surface surface, int i2, int i3) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 27, j1(new ykh0(this, surface, i2, i3, (byte) 2)));
    }

    public final p8u0 B0(p8u0 p8u0Var) {
        Object obj;
        Object obj2 = p8u0Var.a;
        if (obj2 == null) {
            obj2 = null;
            obj = null;
        } else {
            String str = (String) this.r.get(obj2);
            if (str != null) {
                obj2 = str;
            }
            obj = null;
        }
        int i = p8u0Var.b;
        Object obj3 = obj;
        yoh0 yoh0Var = p8u0Var.c;
        Object obj4 = p8u0Var.d;
        if (obj4 != null) {
            Object obj5 = (String) this.s.get(obj4);
            if (obj5 == null) {
                obj5 = obj4;
            }
            obj3 = obj5;
        }
        return new p8u0(obj2, i, yoh0Var, obj3, p8u0Var.e, p8u0Var.f, p8u0Var.g, p8u0Var.h, p8u0Var.i);
    }

    @Override // p.kh70
    public final void C(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        Y0(eh70Var, i, new o1i0(this, (byte) 3));
    }

    @Override // p.kh70
    public final void C0(eh70 eh70Var, int i, int i2, Bundle bundle) {
        if (eh70Var == null || bundle == null || i2 < 0) {
            return;
        }
        X0(eh70Var, i, 20, new w1i0(new x8a0((Object) new vlh0(bundle, (byte) 2), (Object) new n1i0(this, i2, (byte) 1), (byte) 20), (byte) 1));
    }

    @Override // p.kh70
    public final void D(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 26, j1(new czh0((byte) 7)));
    }

    @Override // p.kh70
    public final void E(eh70 eh70Var, int i, int i2, IBinder iBinder) {
        if (eh70Var == null || iBinder == null || i2 < 0) {
            return;
        }
        byte b = 1;
        X0(eh70Var, i, 20, new w1i0(new x8a0((Object) new m1i0(iBinder, b), (Object) new n1i0(this, i2, (byte) 3), (byte) 20), b));
    }

    @Override // p.kh70
    public final void E0(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        Y0(eh70Var, i, new o1i0(this, (byte) 1));
    }

    @Override // p.kh70
    public final void F(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        Y0(eh70Var, i, new o1i0(this, (byte) 0));
    }

    @Override // p.kh70
    public final void F0(eh70 eh70Var, int i, int i2) {
        if (eh70Var == null || i2 < 0) {
            return;
        }
        X0(eh70Var, i, 20, new c8d0(new n1i0(this, i2, (byte) 4), (byte) 24));
    }

    @Override // p.kh70
    public final void G0(eh70 eh70Var, int i, int i2, int i3) {
        if (eh70Var == null || i2 < 0 || i3 < i2) {
            return;
        }
        X0(eh70Var, i, 20, new c8d0(new i1i0(this, i2, i3), (byte) 24));
    }

    @Override // p.kh70
    public final void H0(eh70 eh70Var, int i, IBinder iBinder, boolean z) {
        if (eh70Var == null || iBinder == null) {
            return;
        }
        X0(eh70Var, i, 20, new w1i0(new x8a0((Object) new s7s(iBinder, z, (byte) 7), (Object) new czh0((byte) 22), (byte) 19), (byte) 1));
    }

    @Override // p.kh70
    public final void I(eh70 eh70Var, int i, Bundle bundle) {
        if (eh70Var == null || bundle == null) {
            return;
        }
        X0(eh70Var, i, 19, new w1i0(new vlh0(bundle, (byte) 5), (byte) 1));
    }

    @Override // p.kh70
    public final void J(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        Y0(eh70Var, i, new o1i0(this, (byte) 6));
    }

    @Override // p.kh70
    public final void J0(eh70 eh70Var, int i, boolean z) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 14, j1(new mo00((byte) 5, z)));
    }

    @Override // p.kh70
    public final void K(eh70 eh70Var, int i, Bundle bundle) {
        if (eh70Var == null || bundle == null) {
            return;
        }
        try {
            X0(eh70Var, i, 29, j1(new x8a0((Object) this, (Object) k0g1.b(bundle), (byte) 16)));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    @Override // p.kh70
    public final void K0(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 26, j1(new czh0((byte) 16)));
    }

    @Override // p.kh70
    public final void L0(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 2, j1(new czh0((byte) 19)));
    }

    @Override // p.kh70
    public final void M(eh70 eh70Var, int i, Bundle bundle) {
        if (eh70Var == null || bundle == null) {
            return;
        }
        try {
            X0(eh70Var, i, 13, j1(new clh0(new k2u0(bundle.getFloat(k2u0.e, 1.0f), bundle.getFloat(k2u0.f, 1.0f)), (byte) 2)));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // p.kh70
    public final void M0(eh70 eh70Var, int i, IBinder iBinder, int i2, long j) {
        if (eh70Var == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            X0(eh70Var, i, 20, new w1i0(new x8a0((Object) new mfr(iBinder, i2, j), (Object) new czh0((byte) 22), (byte) 19), (byte) 1));
        }
    }

    @Override // p.kh70
    public final void N(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 8, j1(new czh0((byte) 6)));
    }

    @Override // p.kh70
    public final void O(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 24, j1(new czh0((byte) 18)));
    }

    @Override // p.kh70
    public final void P(eh70 eh70Var, int i, int i2, long j) {
        if (eh70Var == null || i2 < 0) {
            return;
        }
        X0(eh70Var, i, 10, new c8d0(new mfr(this, i2, j), (byte) 24));
    }

    @Override // p.kh70
    public final void P0(eh70 eh70Var, int i, IBinder iBinder) {
        if (eh70Var == null || iBinder == null) {
            return;
        }
        X0(eh70Var, i, 20, new w1i0(new x8a0((Object) new m1i0(iBinder, (byte) 2), (Object) new czh0((byte) 14), (byte) 20), (byte) 1));
    }

    @Override // p.kh70
    public final void R0(final eh70 eh70Var, final int i, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle bundleP = zoi1.p(bundle2);
        if (eh70Var == null || bundle == null || bundleP == null) {
            return;
        }
        try {
            final pa61 pa61VarA = pa61.a(bundle);
            if (!udh.l(pa61VarA.b)) {
                Z0(eh70Var, i, pa61VarA, 0, new w1i0(new x8a0(z, pa61VarA, bundleP), (byte) 1));
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                final fzh0 fzh0Var = (fzh0) this.l.get();
                if (fzh0Var != null && !fzh0Var.p()) {
                    final IBinder iBinderAsBinder = eh70Var.asBinder();
                    d1(new Runnable() { // from class: p.x1i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            pa61 pa61Var = pa61VarA;
                            String str = pa61Var.b;
                            fzh0 fzh0Var2 = fzh0Var;
                            int i2 = i;
                            h2i0 h2i0Var = this.a;
                            v1k v1kVar = h2i0Var.m;
                            ixh0 ixh0VarO = v1kVar.o(iBinderAsBinder);
                            if (ixh0VarO != null && v1kVar.u(ixh0VarO)) {
                                try {
                                    udh udhVarC = udh.c(pa61Var);
                                    Object obj = udhVarC.j;
                                    int i3 = udhVarC.b;
                                    if (!udhVarC.a()) {
                                        oon1.H("Can't execute predefined custom command: " + str);
                                        h2i0.i1(fzh0Var2, ixh0VarO, i2, new ch61(-6));
                                        return;
                                    }
                                    pa61 pa61Var2 = udhVarC.a;
                                    boolean zBooleanValue = false;
                                    if (pa61Var2 != null) {
                                        dm5.y(pa61Var2.a == 40010);
                                        h2i0Var.Z0(eh70Var, i2, null, 40010, new w1i0(new z1i0(udhVarC), (byte) 1));
                                        return;
                                    }
                                    fzh0Var2.C();
                                    ffu0 ffu0Var = fzh0Var2.t;
                                    if (i3 == 1) {
                                        if (obj != null) {
                                            zBooleanValue = ((Boolean) obj).booleanValue();
                                        } else if (!ffu0Var.q()) {
                                            zBooleanValue = true;
                                        }
                                    }
                                    if (zBooleanValue) {
                                        h2i0Var.c1(ixh0VarO, i2);
                                    } else if (i3 == 31) {
                                        obj.getClass();
                                        h2i0Var.e1(ixh0VarO, i2, 31, new w1i0(new x8a0(new c8d0((yoh0) obj, (byte) 26), new czh0((byte) 22), (byte) 19), (byte) 1));
                                    } else {
                                        h2i0Var.e1(ixh0VarO, i2, i3, h2i0.j1(new z1i0(udhVarC)));
                                    }
                                    v1kVar.j(ixh0VarO);
                                } catch (RuntimeException e) {
                                    oon1.I("Failed to convert predefined custom command: " + str, e);
                                    h2i0.i1(fzh0Var2, ixh0VarO, i2, new ch61(-3));
                                }
                            }
                        }
                    });
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // p.kh70
    public final void S0(eh70 eh70Var, int i, float f) {
        if (eh70Var == null || f <= 0.0f) {
            return;
        }
        X0(eh70Var, i, 13, j1(new lo00((byte) 3, f)));
    }

    @Override // p.kh70
    public final void U(eh70 eh70Var, int i, boolean z) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 1, j1(new mo00((byte) 3, z)));
    }

    @Override // p.kh70
    public final void U0(eh70 eh70Var, int i, Bundle bundle) {
        if (eh70Var == null || bundle == null) {
            return;
        }
        try {
            ch61 ch61VarA = ch61.a(bundle);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                fzh0 fzh0Var = (fzh0) this.l.get();
                if (fzh0Var != null && !fzh0Var.p()) {
                    d1(new q1i0(this, eh70Var.asBinder(), i, ch61VarA, (byte) 0));
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // p.kh70
    public final void V0(eh70 eh70Var, int i, long j) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 5, j1(new l58(j)));
    }

    @Override // p.kh70
    public final void X(eh70 eh70Var, int i, int i2) {
        if (eh70Var == null || i2 < 0) {
            return;
        }
        X0(eh70Var, i, 10, new c8d0(new n1i0(this, i2, (byte) 0), (byte) 24));
    }

    public final void X0(eh70 eh70Var, int i, final int i2, final e2i0 e2i0Var) {
        Y0(eh70Var, i, new d2i0() { // from class: p.s1i0
            @Override // p.d2i0
            public final void a(ixh0 ixh0Var, int i3) {
                this.a.e1(ixh0Var, i3, i2, e2i0Var);
            }
        });
    }

    public final void Y0(eh70 eh70Var, int i, d2i0 d2i0Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            fzh0 fzh0Var = (fzh0) this.l.get();
            if (fzh0Var != null && !fzh0Var.p()) {
                d1(new q1i0(this, eh70Var.asBinder(), d2i0Var, i));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void Z0(eh70 eh70Var, final int i, final pa61 pa61Var, final int i2, final e2i0 e2i0Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final fzh0 fzh0Var = (fzh0) this.l.get();
            if (fzh0Var != null && !fzh0Var.p()) {
                final IBinder iBinderAsBinder = eh70Var.asBinder();
                d1(new Runnable() { // from class: p.v1i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        v1k v1kVar = this.a.m;
                        ixh0 ixh0VarO = v1kVar.o(iBinderAsBinder);
                        if (ixh0VarO != null && v1kVar.u(ixh0VarO)) {
                            pa61 pa61Var2 = pa61Var;
                            fzh0 fzh0Var2 = fzh0Var;
                            int i3 = i;
                            if (pa61Var2 != null) {
                                if (!v1kVar.x(ixh0VarO, pa61Var2)) {
                                    h2i0.i1(fzh0Var2, ixh0VarO, i3, new ch61(-4));
                                    return;
                                }
                            } else if (!v1kVar.w(ixh0VarO, i2)) {
                                h2i0.i1(fzh0Var2, ixh0VarO, i3, new ch61(-4));
                                return;
                            }
                            e2i0Var.i(fzh0Var2, ixh0VarO, i3);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // p.kh70
    public final void a0(eh70 eh70Var, int i, int i2, int i3, IBinder iBinder) {
        if (eh70Var == null || iBinder == null || i2 < 0 || i3 < i2) {
            return;
        }
        X0(eh70Var, i, 20, new w1i0(new x8a0((Object) new m1i0(iBinder, (byte) 0), (Object) new i1i0(this, i2, i3), (byte) 20), (byte) 1));
    }

    @Override // p.kh70
    public final void b0(eh70 eh70Var, int i, final int i2, final int i3, final int i4) {
        if (eh70Var == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        X0(eh70Var, i, 20, j1(new akl() { // from class: p.p1i0
            public final void accept(Object obj) {
                ((ffu0) obj).S0(i2, i3, i4);
            }
        }));
    }

    public final int b1(ixh0 ixh0Var, ffu0 ffu0Var, int i) {
        if (ffu0Var.Y(17)) {
            v1k v1kVar = this.m;
            if (!v1kVar.v(ixh0Var, 17) && v1kVar.v(ixh0Var, 16)) {
                return ffu0Var.Q0() + i;
            }
        }
        return i;
    }

    @Override // p.kh70
    public final void c0(eh70 eh70Var, int i, Bundle bundle) {
        fzh0 fzh0Var = (fzh0) this.l.get();
        if (eh70Var == null || bundle == null || fzh0Var == null) {
            iqo1.r(eh70Var);
            return;
        }
        try {
            Context context = fzh0Var.f;
            kal kalVarA = kal.a(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            String str = kalVarA.c;
            if (iqo1.o(callingUid, context, str) == 1) {
                oon1.H("Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                iqo1.r(eh70Var);
                return;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = kalVarA.d;
            }
            try {
                MediaSessionManager.RemoteUserInfo remoteUserInfo = new MediaSessionManager.RemoteUserInfo(str, callingPid, callingUid);
                boolean zIsTrustedForMediaControl = MediaSessionManager.getSessionManager(context).isTrustedForMediaControl(remoteUserInfo);
                int i2 = kalVarA.a;
                int i3 = kalVarA.b;
                s(eh70Var, new ixh0(remoteUserInfo, i2, i3, zIsTrustedForMediaControl, new a2i0(eh70Var, i3), kalVarA.e));
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    public final void c1(ixh0 ixh0Var, int i) {
        e1(ixh0Var, i, 1, j1(new x8a0((Object) this, (Object) ixh0Var, (byte) 17)));
    }

    @Override // p.kh70
    public final void d(eh70 eh70Var, int i, float f) {
        if (eh70Var == null || f < 0.0f || f > 1.0f) {
            return;
        }
        X0(eh70Var, i, 24, j1(new lo00((byte) 4, f)));
    }

    @Override // p.kh70
    public final void d0(eh70 eh70Var, int i, int i2) {
        if (eh70Var == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            X0(eh70Var, i, 15, j1(new nfr(i2, (byte) 8)));
        }
    }

    public final void d1(Runnable runnable) {
        fzh0 fzh0Var = (fzh0) this.l.get();
        if (fzh0Var != null) {
            zoi1.c0(fzh0Var.l, runnable);
        }
    }

    @Override // p.kh70
    public final void e0(eh70 eh70Var, int i, boolean z) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 26, j1(new mo00((byte) 4, z)));
    }

    public final void e1(final ixh0 ixh0Var, final int i, int i2, final e2i0 e2i0Var) {
        WeakReference weakReference = this.l;
        fzh0 fzh0Var = (fzh0) weakReference.get();
        if (fzh0Var != null) {
            dm5.y(Looper.myLooper() == fzh0Var.l.getLooper());
        }
        final fzh0 fzh0Var2 = (fzh0) weakReference.get();
        if (fzh0Var2 == null || fzh0Var2.p()) {
            return;
        }
        v1k v1kVar = this.m;
        if (v1kVar.u(ixh0Var)) {
            if (!v1kVar.v(ixh0Var, i2)) {
                i1(fzh0Var2, ixh0Var, i, new ch61(-4));
                return;
            }
            uph0 uph0Var = fzh0Var2.e;
            fzh0Var2.A(ixh0Var);
            uph0Var.getClass();
            if (i2 != 27) {
                v1kVar.c(ixh0Var, i2, new p8l() { // from class: p.u1i0
                    public final n8d0 run() {
                        return (n8d0) e2i0Var.i(fzh0Var2, ixh0Var, i);
                    }
                });
                return;
            }
            fzh0Var2.x = ixh0Var;
            e2i0Var.i(fzh0Var2, ixh0Var, i);
            fzh0Var2.x = null;
            v1kVar.c(ixh0Var, i2, new t1i0());
        }
    }

    @Override // p.kh70
    public final void f(eh70 eh70Var, int i, Bundle bundle, boolean z) {
        if (eh70Var == null || bundle == null) {
            return;
        }
        try {
            X0(eh70Var, i, 35, j1(new s7s(po7.a(bundle), z, (byte) 6)));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    public final void f1() {
        this.l.clear();
        v1k v1kVar = this.m;
        ((WeakReference) v1kVar.d).clear();
        for (ixh0 ixh0Var : v1kVar.m()) {
            v1kVar.D(ixh0Var);
            hxh0 hxh0Var = ixh0Var.e;
            if (hxh0Var != null) {
                hxh0Var.onDisconnected();
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.n;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            hxh0 hxh0Var2 = ((ixh0) it.next()).e;
            if (hxh0Var2 != null) {
                hxh0Var2.onDisconnected();
            }
        }
        copyOnWriteArraySet.clear();
    }

    @Override // p.kh70
    public final void g(eh70 eh70Var, int i, Bundle bundle, long j) {
        if (eh70Var == null || bundle == null) {
            return;
        }
        X0(eh70Var, i, 31, new w1i0(new x8a0((Object) new t7s(bundle, j, (byte) 3), (Object) new czh0((byte) 22), (byte) 19), (byte) 1));
    }

    @Override // p.kh70
    public final void g0(eh70 eh70Var, int i, int i2) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 34, j1(new nfr(i2, (byte) 6)));
    }

    public final void g1(p8u0 p8u0Var, HashMap map) {
        String str;
        Object obj = p8u0Var.d;
        if (obj == null || map.containsKey(obj) || (str = (String) this.s.get(obj)) == null) {
            return;
        }
        map.put(obj, str);
    }

    @Override // p.kh70
    public final void h(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 20, j1(new czh0((byte) 21)));
    }

    public final void h1(p8u0 p8u0Var, HashMap map) {
        String str;
        Object obj = p8u0Var.a;
        if (obj == null || map.containsKey(obj) || (str = (String) this.r.get(obj)) == null) {
            return;
        }
        map.put(obj, str);
    }

    @Override // p.kh70
    public final void i(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            fzh0 fzh0Var = (fzh0) this.l.get();
            if (fzh0Var != null && !fzh0Var.p()) {
                d1(new l1i0(this, eh70Var.asBinder(), (byte) 0));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // p.kh70
    public final void i0(eh70 eh70Var, int i, Bundle bundle, Bundle bundle2) {
        R0(eh70Var, i, bundle, bundle2, false);
    }

    @Override // p.kh70
    public final void j(eh70 eh70Var, int i, final boolean z, final int i2) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 34, j1(new akl() { // from class: p.r1i0
            public final void accept(Object obj) {
                ((ffu0) obj).z(i2, z);
            }
        }));
    }

    @Override // p.kh70
    public final void j0(eh70 eh70Var, int i, int i2) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 34, j1(new nfr(i2, (byte) 7)));
    }

    @Override // p.kh70
    public final void k(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 4, j1(new czh0((byte) 20)));
    }

    public final jbu0 k1(jbu0 jbu0Var) {
        g2i0 g2i0Var;
        k0g1 k0g1Var;
        boolean z;
        sqe1 sqe1Var = jbu0Var.j;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        xg61 xg61Var = jbu0Var.c;
        if (sqe1Var.p()) {
            return jbu0Var;
        }
        if (!Objects.equals(this.u, sqe1Var) || (g2i0Var = this.v) == null) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            oqe1 oqe1Var = new oqe1();
            for (int i = 0; i < sqe1Var.o(); i++) {
                sqe1Var.m(i, oqe1Var);
                Object obj = oqe1Var.a;
                if (obj != null && !map.containsKey(obj)) {
                    String string = (String) this.r.get(oqe1Var.a);
                    Object obj2 = oqe1Var.a;
                    if (string == null) {
                        int i2 = this.t;
                        this.t = i2 + 1;
                        String str = zoi1.a;
                        string = Integer.toString(i2, 36);
                    }
                    map.put(obj2, string);
                }
            }
            dqe1 dqe1Var = new dqe1();
            for (int i3 = 0; i3 < sqe1Var.h(); i3++) {
                sqe1Var.f(i3, dqe1Var, true);
                Object obj3 = dqe1Var.b;
                if (obj3 != null && !map2.containsKey(obj3)) {
                    String string2 = (String) this.s.get(dqe1Var.b);
                    Object obj4 = dqe1Var.b;
                    if (string2 == null) {
                        int i4 = this.t;
                        this.t = i4 + 1;
                        String str2 = zoi1.a;
                        string2 = Integer.toString(i4, 36);
                    }
                    map2.put(obj4, string2);
                }
                Object obj5 = dqe1Var.a;
                if (obj5 != null && !map2.containsKey(obj5)) {
                    String string3 = (String) this.s.get(dqe1Var.a);
                    Object obj6 = dqe1Var.a;
                    if (string3 == null) {
                        int i5 = this.t;
                        this.t = i5 + 1;
                        String str3 = zoi1.a;
                        string3 = Integer.toString(i5, 36);
                    }
                    map2.put(obj6, string3);
                }
            }
            h1(xg61Var.a, map);
            h1(p8u0Var, map);
            h1(p8u0Var2, map);
            g1(xg61Var.a, map2);
            g1(p8u0Var, map2);
            g1(p8u0Var2, map2);
            this.r = l280.p(map);
            this.s = l280.p(map2);
            this.u = sqe1Var;
            g2i0Var = new g2i0(sqe1Var, this.r, this.s);
            this.v = g2i0Var;
        }
        xg61 xg61Var2 = new xg61(B0(xg61Var.a), xg61Var.b, xg61Var.c, xg61Var.d, xg61Var.e, xg61Var.f, xg61Var.g, xg61Var.h, xg61Var.i, xg61Var.j);
        p8u0 p8u0VarB0 = B0(p8u0Var);
        p8u0 p8u0VarB1 = B0(p8u0Var2);
        PlaybackException playbackException = jbu0Var.a;
        int i6 = jbu0Var.b;
        int i7 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i8 = jbu0Var.h;
        boolean z2 = jbu0Var.i;
        int i9 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i10 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i11 = jbu0Var.t;
        boolean z3 = jbu0Var.u;
        boolean z4 = jbu0Var.v;
        int i12 = jbu0Var.w;
        boolean z5 = jbu0Var.x;
        boolean z6 = jbu0Var.y;
        int i13 = jbu0Var.z;
        int i14 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var2 = jbu0Var.G;
        if (!g2i0Var.p()) {
            k0g1Var = k0g1Var2;
            if (xg61Var2.a.b >= g2i0Var.e.o()) {
                z = false;
            }
            dm5.y(z);
            return new jbu0(playbackException, i6, xg61Var2, p8u0VarB0, p8u0VarB1, i7, k2u0Var, i8, z2, z1k1Var, g2i0Var, i9, tqh0Var, f, f2, po7Var, i10, qeoVar, xqtVar, i11, z3, z4, i12, i13, i14, z5, z6, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        }
        k0g1Var = k0g1Var2;
        z = true;
        dm5.y(z);
        return new jbu0(playbackException, i6, xg61Var2, p8u0VarB0, p8u0VarB1, i7, k2u0Var, i8, z2, z1k1Var, g2i0Var, i9, tqh0Var, f, f2, po7Var, i10, qeoVar, xqtVar, i11, z3, z4, i12, i13, i14, z5, z6, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
    }

    @Override // p.kh70
    public final void l(eh70 eh70Var, int i, int i2, Bundle bundle) {
        if (eh70Var == null || bundle == null || i2 < 0) {
            return;
        }
        X0(eh70Var, i, 20, new w1i0(new x8a0((Object) new vlh0(bundle, (byte) 3), (Object) new n1i0(this, i2, (byte) 2), (byte) 20), (byte) 1));
    }

    public final jbu0 l1(jbu0 jbu0Var) {
        b380 b380Var = jbu0Var.F.a;
        j280 j280Var = new j280(4);
        h380 h380VarA = j380.a();
        for (int i = 0; i < b380Var.size(); i++) {
            pnf1 pnf1Var = ((n3g1) b380Var.get(i)).b;
            String str = pnf1Var.b;
            String string = (String) this.o.get(pnf1Var);
            if (string == null) {
                StringBuilder sb = new StringBuilder();
                int i2 = this.q;
                this.q = i2 + 1;
                String str2 = zoi1.a;
                sb.append(Integer.toString(i2, 36));
                sb.append("-");
                sb.append(str);
                string = sb.toString();
            }
            j280Var.h(pnf1Var, string);
            h380VarA.e(str, string);
        }
        this.o = j280Var.g();
        this.f58p = h380VarA.b(false);
        v280 v280VarM = b380.m();
        for (int i3 = 0; i3 < b380Var.size(); i3++) {
            n3g1 n3g1Var = (n3g1) b380Var.get(i3);
            v280VarM.c(new n3g1(m1(n3g1Var.b), n3g1Var.c, n3g1Var.d, n3g1Var.e));
        }
        jbu0 jbu0VarB = jbu0Var.b(new o3g1(v280VarM.g()));
        k0g1 k0g1Var = jbu0VarB.G;
        if (k0g1Var.H.isEmpty()) {
            return jbu0VarB;
        }
        j0g1 j0g1VarC = k0g1Var.a().c();
        mjh1 mjh1VarK = k0g1Var.H.o().k();
        while (mjh1VarK.hasNext()) {
            h0g1 h0g1Var = (h0g1) mjh1VarK.next();
            j0g1VarC.a(new h0g1(m1(h0g1Var.a), h0g1Var.b));
        }
        return jbu0VarB.n(j0g1VarC.b());
    }

    @Override // p.kh70
    public final void m(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 6, j1(new czh0((byte) 10)));
    }

    public final pnf1 m1(pnf1 pnf1Var) {
        String str = (String) this.o.get(pnf1Var);
        if (str == null) {
            str = pnf1Var.b;
        }
        int i = 0;
        while (true) {
            int i2 = pnf1Var.a;
            ie30[] ie30VarArr = pnf1Var.d;
            if (i >= i2) {
                return new pnf1(str, ie30VarArr);
            }
            if (ie30VarArr[i].n != null) {
                ie30[] ie30VarArr2 = new ie30[i2];
                for (int i3 = 0; i3 < pnf1Var.a; i3++) {
                    ie30 ie30Var = ie30VarArr[i3];
                    String str2 = ie30Var.n;
                    String str3 = str2 != null ? (String) this.f58p.get(str2) : null;
                    if (str3 != null) {
                        ge30 ge30VarA = ie30Var.a();
                        ge30VarA.m = str3;
                        ie30VarArr2[i3] = new ie30(ge30VarA);
                    } else {
                        ie30VarArr2[i3] = ie30Var;
                    }
                }
                return new pnf1(str, ie30VarArr2);
            }
            i++;
        }
    }

    @Override // p.kh70
    public final void n(eh70 eh70Var, int i, int i2) {
        if (eh70Var == null || i2 < 0) {
            return;
        }
        X0(eh70Var, i, 25, j1(new nfr(i2, (byte) 9)));
    }

    @Override // p.kh70
    public final void n0(eh70 eh70Var, int i, int i2, int i3) {
        if (eh70Var == null || i2 < 0) {
            return;
        }
        X0(eh70Var, i, 33, j1(new ko00((byte) 4, i2, i3)));
    }

    @Override // p.kh70
    public final void p(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        Y0(eh70Var, i, new o1i0(this, (byte) 4));
    }

    @Override // p.kh70
    public final void q(eh70 eh70Var, int i, int i2, int i3) {
        if (eh70Var == null || i2 < 0 || i3 < 0) {
            return;
        }
        X0(eh70Var, i, 20, j1(new ko00((byte) 5, i2, i3)));
    }

    @Override // p.kh70
    public final void r(eh70 eh70Var) {
        if (eh70Var == null) {
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            fzh0 fzh0Var = (fzh0) this.l.get();
            if (fzh0Var != null && !fzh0Var.p()) {
                d1(new l1i0(this, eh70Var.asBinder(), (byte) 1));
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void s(eh70 eh70Var, ixh0 ixh0Var) {
        if (eh70Var == null) {
            iqo1.r(eh70Var);
            return;
        }
        fzh0 fzh0Var = (fzh0) this.l.get();
        if (fzh0Var == null || fzh0Var.p()) {
            iqo1.r(eh70Var);
        } else {
            this.n.add(ixh0Var);
            zoi1.c0(fzh0Var.l, new m2d((Object) this, (Object) fzh0Var, (Object) ixh0Var, (Object) eh70Var, (byte) 20));
        }
    }

    @Override // p.kh70
    public final void u0(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        Y0(eh70Var, i, new o1i0(this, (byte) 2));
    }

    @Override // p.kh70
    public final void v(eh70 eh70Var, int i, Bundle bundle, boolean z) {
        if (eh70Var == null || bundle == null) {
            return;
        }
        X0(eh70Var, i, 31, new w1i0(new x8a0((Object) new s7s(bundle, z, (byte) 5), (Object) new czh0((byte) 22), (byte) 19), (byte) 1));
    }

    @Override // p.kh70
    public final void w(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 24, j1(new czh0((byte) 4)));
    }

    @Override // p.kh70
    public final void w0(eh70 eh70Var, int i, Surface surface) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 27, j1(new x8a0((Object) this, (Object) surface, (byte) 18)));
    }

    @Override // p.kh70
    public final void y(eh70 eh70Var, int i) {
        if (eh70Var == null) {
            return;
        }
        Y0(eh70Var, i, new o1i0(this, (byte) 5));
    }

    @Override // p.kh70
    public final void y0(eh70 eh70Var, int i, int i2, int i3) {
        if (eh70Var == null) {
            return;
        }
        X0(eh70Var, i, 27, j1(new i1i0(this, i2, i3)));
    }

    @Override // p.kh70
    public final void z(eh70 eh70Var, int i, Bundle bundle) {
        v(eh70Var, i, bundle, true);
    }
}
