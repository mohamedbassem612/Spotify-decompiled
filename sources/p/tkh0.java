package p;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.car.app.model.Alert;
import androidx.media3.common.PlaybackException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tkh0 implements r8u0 {
    public final oqe1 a;
    public boolean b;
    public final rlh0 c;
    public final skh0 d;
    public final Handler e;
    public final long f;
    public boolean g;
    public final xkh0 h;

    public tkh0(Context context, hi61 hi61Var, Bundle bundle, skh0 skh0Var, Looper looper, xkh0 xkh0Var) {
        kh70 kh70Var;
        dm5.s(context, "context must not be null");
        dm5.s(hi61Var, "token must not be null");
        oon1.A("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + zoi1.a + "]");
        this.a = new oqe1();
        this.f = -9223372036854775807L;
        this.d = skh0Var;
        this.e = new Handler(looper);
        this.h = xkh0Var;
        rlh0 rlh0Var = new rlh0(context, this, hi61Var, bundle, looper);
        this.c = rlh0Var;
        IBinder iBinder = rlh0Var.e.a.f;
        iBinder.getClass();
        IBinder iBinder2 = iBinder;
        int i = jh70.a;
        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof kh70)) {
            hh70 hh70Var = new hh70();
            hh70Var.a = iBinder2;
            kh70Var = hh70Var;
        } else {
            kh70Var = (kh70) iInterfaceQueryLocalInterface;
        }
        int iD = rlh0Var.b.d();
        String packageName = rlh0Var.d.getPackageName();
        int iMyPid = Process.myPid();
        tkh0 tkh0Var = rlh0Var.a;
        tkh0Var.getClass();
        try {
            kh70Var.c0(rlh0Var.c, iD, new kal(1011000300, 10, packageName, iMyPid, new Bundle(rlh0Var.f), 0).b());
        } catch (RemoteException e) {
            oon1.I("Failed to call connection request.", e);
            Objects.requireNonNull(tkh0Var);
            tkh0Var.g1(new gv40(tkh0Var, (byte) 16));
        }
    }

    public final void A() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring decreaseDeviceVolume().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(26)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 13));
            jbu0 jbu0Var = rlh0Var.f128p;
            int i = jbu0Var.t - 1;
            if (i >= jbu0Var.s.b) {
                rlh0Var.f128p = jbu0Var.c(i, jbu0Var.u);
                h9d0Var.c(30, new ilh0(rlh0Var, i, (byte) 7));
                h9d0Var.b();
            }
        }
    }

    public final void A0(int i, int i2) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setDeviceVolume().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(33)) {
            byte b = 0;
            rlh0Var.f(new hlh0(rlh0Var, i, i2, b));
            jbu0 jbu0Var = rlh0Var.f128p;
            xqt xqtVar = jbu0Var.s;
            if (jbu0Var.t == i || xqtVar.b > i) {
                return;
            }
            int i3 = xqtVar.c;
            if (i3 == 0 || i <= i3) {
                rlh0Var.f128p = jbu0Var.c(i, jbu0Var.u);
                h9d0Var.c(30, new ilh0(rlh0Var, i, b));
                h9d0Var.b();
            }
        }
    }

    public final void B(int i) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring increaseDeviceVolume().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(34)) {
            rlh0Var.f(new ilh0(rlh0Var, i, (byte) 2));
            jbu0 jbu0Var = rlh0Var.f128p;
            int i2 = jbu0Var.t + 1;
            int i3 = jbu0Var.s.c;
            if (i3 == 0 || i2 <= i3) {
                rlh0Var.f128p = jbu0Var.c(i2, jbu0Var.u);
                h9d0Var.c(30, new ilh0(rlh0Var, i2, (byte) 3));
                h9d0Var.b();
            }
        }
    }

    public final boolean B0() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() && rlh0Var.n() != -1;
    }

    public final void D(int i, int i2, List list) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring replaceMediaItems().");
        } else if (rlh0Var.q(20)) {
            dm5.m(i >= 0 && i <= i2);
            rlh0Var.f(new ykh0(rlh0Var, list, i, i2, (byte) 0));
            rlh0Var.C(i, i2, list);
        }
    }

    public final int D0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.a.i;
        }
        return -1;
    }

    public final boolean E() {
        return false;
    }

    public final void E0(k0g1 k0g1Var) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(29)) {
            rlh0Var.f(new x8a0((Object) rlh0Var, (Object) k0g1Var, (byte) 7));
            jbu0 jbu0Var = rlh0Var.f128p;
            if (k0g1Var != jbu0Var.G) {
                rlh0Var.f128p = jbu0Var.n(k0g1Var);
                h9d0Var.c(19, new no00(k0g1Var, (byte) 1));
                h9d0Var.b();
            }
        }
    }

    public final void F(int i) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring removeMediaItem().");
        } else if (rlh0Var.q(20)) {
            dm5.m(i >= 0);
            rlh0Var.f(new ilh0(rlh0Var, i, (byte) 10));
            rlh0Var.B(i, i + 1);
        }
    }

    public final void F0(yoh0 yoh0Var) {
        h1();
        dm5.s(yoh0Var, "mediaItems must not be null");
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setMediaItems().");
        } else if (rlh0Var.q(31)) {
            rlh0Var.f(new blh0(rlh0Var, yoh0Var, (byte) 0));
            rlh0Var.I(Collections.singletonList(yoh0Var), -1, -9223372036854775807L, true);
        }
    }

    public final void G0(final List list, final int i, final long j) {
        h1();
        dm5.s(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            dm5.l("items must not contain null, index=%s", i2, list.get(i2) != null);
        }
        final rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setMediaItems().");
        } else if (rlh0Var.q(20)) {
            rlh0Var.f(new plh0() { // from class: p.zkh0
                public final void f(kh70 kh70Var, int i3) {
                    rlh0 rlh0Var2 = rlh0Var;
                    xlh0 xlh0Var = rlh0Var2.c;
                    v280 v280VarM = b380.m();
                    int i4 = 0;
                    while (true) {
                        List list2 = list;
                        if (i4 >= list2.size()) {
                            kh70Var.M0(xlh0Var, i3, new occ(v280VarM.g()), i, j);
                            return;
                        } else {
                            v280VarM.c(((yoh0) list2.get(i4)).e(rlh0Var2.o(), true));
                            i4++;
                        }
                    }
                }
            });
            rlh0Var.I(list, i, j, false);
        }
    }

    public final void H(int i, int i2) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring removeMediaItems().");
        } else if (rlh0Var.q(20)) {
            dm5.m(i >= 0 && i2 >= i);
            rlh0Var.f(new hlh0(rlh0Var, i, i2, (byte) 2));
            rlh0Var.B(i, i2);
        }
    }

    public final void H0(int i) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekTo().");
        } else if (rlh0Var.q(10)) {
            dm5.m(i >= 0);
            rlh0Var.f(new ilh0(rlh0Var, i, (byte) 8));
            rlh0Var.F(i, -9223372036854775807L);
        }
    }

    public final void I(SurfaceHolder surfaceHolder) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setVideoSurfaceHolder().");
            return;
        }
        if (rlh0Var.q(27)) {
            if (surfaceHolder == null) {
                if (rlh0Var.q(27)) {
                    rlh0Var.b();
                    rlh0Var.K(null, 0, 0);
                    rlh0Var.y(0, 0);
                    return;
                }
                return;
            }
            if (rlh0Var.A == surfaceHolder) {
                return;
            }
            rlh0Var.b();
            rlh0Var.A = surfaceHolder;
            surfaceHolder.addCallback(rlh0Var.h);
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                rlh0Var.z = null;
                rlh0Var.K(null, 0, 0);
                rlh0Var.y(0, 0);
            } else {
                rlh0Var.z = surface;
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                rlh0Var.K(surface, surfaceFrame.width(), surfaceFrame.height());
                rlh0Var.y(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    public final long I0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.D;
        }
        return 0L;
    }

    public final void J(o8u0 o8u0Var) {
        this.c.i.a(o8u0Var);
    }

    public final void K() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekToPrevious().");
            return;
        }
        if (rlh0Var.q(7)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 2));
            sqe1 sqe1Var = rlh0Var.f128p.j;
            if (sqe1Var.p() || rlh0Var.f128p.c.b) {
                return;
            }
            boolean z = rlh0Var.n() != -1;
            oqe1 oqe1VarN = sqe1Var.n(rlh0.j(rlh0Var.f128p), new oqe1(), 0L);
            if (oqe1VarN.i && oqe1VarN.c()) {
                if (z) {
                    rlh0Var.F(rlh0Var.n(), -9223372036854775807L);
                }
            } else if (!z || rlh0Var.k() > rlh0Var.f128p.E) {
                rlh0Var.F(rlh0.j(rlh0Var.f128p), 0L);
            } else {
                rlh0Var.F(rlh0Var.n(), -9223372036854775807L);
            }
        }
    }

    public final long K0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.i();
        }
        return 0L;
    }

    public final PlaybackException L() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.a;
        }
        return null;
    }

    public final void M(boolean z) {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            if (rlh0Var.q(1)) {
                rlh0Var.f(new nlh0(rlh0Var, z, (byte) 2));
                rlh0Var.J(z);
            } else if (z) {
                oon1.H("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
            }
        }
    }

    public final void M0(int i, List list) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring addMediaItems().");
        } else if (rlh0Var.q(20)) {
            dm5.m(i >= 0);
            rlh0Var.f(new o8d0(rlh0Var, i, list, (byte) 1));
            rlh0Var.a(i, list);
        }
    }

    public final long N0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.e;
        }
        return 0L;
    }

    public final void O() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring unmute().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(24)) {
            float f = rlh0Var.f128p.o;
            byte b = 2;
            rlh0Var.f(new jlh0(rlh0Var, f, b));
            jbu0 jbu0Var = rlh0Var.f128p;
            float f2 = jbu0Var.n;
            if (f2 == jbu0Var.o || f2 != 0.0f) {
                return;
            }
            rlh0Var.f128p = jbu0Var.o(f);
            h9d0Var.c(22, new lo00(b, f));
            h9d0Var.b();
        }
    }

    public final boolean O0() {
        h1();
        sqe1 sqe1VarD0 = d0();
        return !sqe1VarD0.p() && sqe1VarD0.n(Q0(), this.a, 0L).h;
    }

    public final void P(o8u0 o8u0Var) {
        h1();
        dm5.s(o8u0Var, "listener must not be null");
        this.c.i.e(o8u0Var);
    }

    public final tqh0 P0() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() ? rlh0Var.f128p.m : tqh0.M;
    }

    public final void Q(yoh0 yoh0Var) {
        h1();
        dm5.s(yoh0Var, "mediaItems must not be null");
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setMediaItem().");
        } else if (rlh0Var.q(31)) {
            rlh0Var.f(new blh0(rlh0Var, yoh0Var, (byte) 1));
            rlh0Var.I(Collections.singletonList(yoh0Var), -1, -9223372036854775807L, true);
        }
    }

    public final int Q0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0.j(rlh0Var.f128p);
        }
        return -1;
    }

    public final void R() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekToNextMediaItem().");
        } else if (rlh0Var.q(8)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 12));
            if (rlh0Var.l() != -1) {
                rlh0Var.F(rlh0Var.l(), -9223372036854775807L);
            }
        }
    }

    public final void R0(int i, int i2) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring moveMediaItem().");
        } else if (rlh0Var.q(20)) {
            byte b = 1;
            dm5.m(i >= 0 && i2 >= 0);
            rlh0Var.f(new hlh0(rlh0Var, i, i2, b));
            rlh0Var.v(i, i + 1, i2);
        }
    }

    public final void S0(final int i, final int i2, final int i3) {
        h1();
        final rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring moveMediaItems().");
        } else if (rlh0Var.q(20)) {
            dm5.m(i >= 0 && i <= i2 && i3 >= 0);
            rlh0Var.f(new plh0() { // from class: p.olh0
                public final void f(kh70 kh70Var, int i4) {
                    kh70Var.b0(rlh0Var.c, i4, i, i2, i3);
                }
            });
            rlh0Var.v(i, i2, i3);
        }
    }

    public final void T(int i) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring decreaseDeviceVolume().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(34)) {
            rlh0Var.f(new ilh0(rlh0Var, i, (byte) 9));
            jbu0 jbu0Var = rlh0Var.f128p;
            int i2 = jbu0Var.t - 1;
            if (i2 >= jbu0Var.s.b) {
                rlh0Var.f128p = jbu0Var.c(i2, jbu0Var.u);
                h9d0Var.c(30, new ilh0(rlh0Var, i2, (byte) 11));
                h9d0Var.b();
            }
        }
    }

    public final void T0(List list) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring addMediaItems().");
        } else if (rlh0Var.q(20)) {
            rlh0Var.f(new alh0(rlh0Var, list, (byte) 1));
            rlh0Var.a(rlh0Var.f128p.j.o(), list);
        }
    }

    public final o3g1 U() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() ? rlh0Var.f128p.F : o3g1.b;
    }

    public final boolean U0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.u;
        }
        return false;
    }

    public final boolean V() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() && rlh0Var.l() != -1;
    }

    public final boolean V0() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() && rlh0Var.f128p.i;
    }

    public final qeo W() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() ? rlh0Var.f128p.r : qeo.d;
    }

    public final int X() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.a.h;
        }
        return -1;
    }

    public final long X0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.j;
        }
        return 0L;
    }

    public final boolean Y(int i) {
        return n0().a(i);
    }

    public final void Y0(int i) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setDeviceVolume().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(25)) {
            rlh0Var.f(new ilh0(rlh0Var, i, (byte) 5));
            jbu0 jbu0Var = rlh0Var.f128p;
            xqt xqtVar = jbu0Var.s;
            if (jbu0Var.t == i || xqtVar.b > i) {
                return;
            }
            int i2 = xqtVar.c;
            if (i2 == 0 || i <= i2) {
                rlh0Var.f128p = jbu0Var.c(i, jbu0Var.u);
                h9d0Var.c(30, new ilh0(rlh0Var, i, (byte) 6));
                h9d0Var.b();
            }
        }
    }

    public final void Z(boolean z) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setDeviceMuted().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(26)) {
            rlh0Var.f(new nlh0(rlh0Var, z, (byte) 3));
            jbu0 jbu0Var = rlh0Var.f128p;
            if (jbu0Var.u != z) {
                rlh0Var.f128p = jbu0Var.c(jbu0Var.t, z);
                h9d0Var.c(30, new nlh0(rlh0Var, z, (byte) 4));
                h9d0Var.b();
            }
        }
    }

    public final void Z0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekForward().");
        } else if (rlh0Var.q(12)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 0));
            rlh0Var.G(rlh0Var.f128p.D);
        }
    }

    public final void a() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring pause().");
        } else if (rlh0Var.q(1)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 5));
            rlh0Var.J(false);
        }
    }

    public final void a1() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekBack().");
        } else if (rlh0Var.q(11)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 4));
            rlh0Var.G(-rlh0Var.f128p.C);
        }
    }

    public final boolean b() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() && rlh0Var.f128p.y;
    }

    public final boolean b0() {
        h1();
        sqe1 sqe1VarD0 = d0();
        return !sqe1VarD0.p() && sqe1VarD0.n(Q0(), this.a, 0L).i;
    }

    public final tqh0 b1() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() ? rlh0Var.f128p.B : tqh0.M;
    }

    public final float c() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.n;
        }
        return 1.0f;
    }

    public final int c0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.z;
        }
        return 0;
    }

    public final void c1(List list) {
        h1();
        dm5.s(list, "mediaItems must not be null");
        byte b = 0;
        for (int i = 0; i < list.size(); i++) {
            dm5.l("items must not contain null, index=%s", i, list.get(i) != null);
        }
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setMediaItems().");
        } else if (rlh0Var.q(20)) {
            rlh0Var.f(new alh0(rlh0Var, list, b));
            rlh0Var.I(list, -1, -9223372036854775807L, true);
        }
    }

    public final void d() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring mute().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(24)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 10));
            jbu0 jbu0Var = rlh0Var.f128p;
            if (jbu0Var.n != 0.0f) {
                rlh0Var.f128p = jbu0Var.o(0.0f);
                h9d0Var.c(22, new swg0((byte) 7));
                h9d0Var.b();
            }
        }
    }

    public final sqe1 d0() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() ? rlh0Var.f128p.j : sqe1.a;
    }

    public final long d1() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.C;
        }
        return 0L;
    }

    public final void e() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring prepare().");
            return;
        }
        if (rlh0Var.q(2)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 8));
            jbu0 jbu0Var = rlh0Var.f128p;
            if (jbu0Var.A == 1) {
                rlh0Var.L(jbu0Var.f(jbu0Var.j.p() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    public final Looper e0() {
        return this.e.getLooper();
    }

    public final boolean e1() {
        h1();
        sqe1 sqe1VarD0 = d0();
        return !sqe1VarD0.p() && sqe1VarD0.n(Q0(), this.a, 0L).c();
    }

    public final void f(long j) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekTo().");
        } else if (rlh0Var.q(5)) {
            rlh0Var.f(new t7s(rlh0Var, j, (byte) 1));
            rlh0Var.F(rlh0.j(rlh0Var.f128p), j);
        }
    }

    public final void f0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring increaseDeviceVolume().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(26)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 6));
            jbu0 jbu0Var = rlh0Var.f128p;
            byte b = 1;
            int i = jbu0Var.t + 1;
            int i2 = jbu0Var.s.c;
            if (i2 == 0 || i <= i2) {
                rlh0Var.f128p = jbu0Var.c(i, jbu0Var.u);
                h9d0Var.c(30, new ilh0(rlh0Var, i, b));
                h9d0Var.b();
            }
        }
    }

    public final void f1() {
        h1();
        if (this.b) {
            return;
        }
        oon1.A("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + zoi1.a + "] [" + hph0.b() + "]");
        this.b = true;
        Handler handler = this.e;
        handler.removeCallbacksAndMessages(null);
        try {
            this.c.A();
        } catch (Exception e) {
            oon1.t("Exception while releasing impl", e);
        }
        if (this.g) {
            dm5.y(Looper.myLooper() == handler.getLooper());
            this.d.onDisconnected();
        } else {
            this.g = true;
            xkh0 xkh0Var = this.h;
            xkh0Var.getClass();
            xkh0Var.v(new SecurityException("Session rejected the connection request."));
        }
    }

    public final void g(float f) {
        h1();
        byte b = 1;
        dm5.n(f >= 0.0f && f <= 1.0f, "volume must be between 0 and 1");
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setVolume().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(24)) {
            rlh0Var.f(new jlh0(rlh0Var, f, b));
            jbu0 jbu0Var = rlh0Var.f128p;
            if (jbu0Var.n != f) {
                rlh0Var.f128p = jbu0Var.o(f);
                h9d0Var.c(22, new lo00(b, f));
                h9d0Var.b();
            }
        }
    }

    public final k0g1 g0() {
        h1();
        rlh0 rlh0Var = this.c;
        return !rlh0Var.p() ? k0g1.J : rlh0Var.f128p.G;
    }

    public final void g1(Runnable runnable) {
        zoi1.c0(this.e, runnable);
    }

    public final long getDuration() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.d;
        }
        return -9223372036854775807L;
    }

    public final int getPlaybackState() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.A;
        }
        return 1;
    }

    public final int getRepeatMode() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.h;
        }
        return 0;
    }

    public final void h(float f) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setPlaybackSpeed().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(13)) {
            rlh0Var.f(new jlh0(rlh0Var, f, (byte) 0));
            k2u0 k2u0Var = rlh0Var.f128p.g;
            if (k2u0Var.a != f) {
                k2u0 k2u0VarB = k2u0Var.b(f);
                rlh0Var.f128p = rlh0Var.f128p.e(k2u0VarB);
                h9d0Var.c(12, new clh0(k2u0VarB, (byte) 1));
                h9d0Var.b();
            }
        }
    }

    public final void h0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekToNext().");
            return;
        }
        if (rlh0Var.q(9)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 11));
            sqe1 sqe1Var = rlh0Var.f128p.j;
            if (sqe1Var.p() || rlh0Var.f128p.c.b) {
                return;
            }
            if (rlh0Var.l() != -1) {
                rlh0Var.F(rlh0Var.l(), -9223372036854775807L);
                return;
            }
            oqe1 oqe1VarN = sqe1Var.n(rlh0.j(rlh0Var.f128p), new oqe1(), 0L);
            if (oqe1VarN.i && oqe1VarN.c()) {
                rlh0Var.F(rlh0.j(rlh0Var.f128p), -9223372036854775807L);
            }
        }
    }

    public final void h1() {
        dm5.z(Looper.myLooper() == this.e.getLooper(), "MediaController method is called from a wrong thread. See javadoc of MediaController for details.");
    }

    public final boolean i() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() && rlh0Var.f128p.x;
    }

    public final void i0(tqh0 tqh0Var) {
        h1();
        dm5.s(tqh0Var, "playlistMetadata must not be null");
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setPlaylistMetadata().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(19)) {
            rlh0Var.f(new x8a0((Object) rlh0Var, (Object) tqh0Var, (byte) 8));
            if (rlh0Var.f128p.m.equals(tqh0Var)) {
                return;
            }
            rlh0Var.f128p = rlh0Var.f128p.g(tqh0Var);
            h9d0Var.c(15, new ho00(tqh0Var, (byte) 1));
            h9d0Var.b();
        }
    }

    public final void j() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring play().");
        } else if (!rlh0Var.q(1)) {
            oon1.H("Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 14));
            rlh0Var.J(true);
        }
    }

    public final int j0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.t;
        }
        return 0;
    }

    public final void k0(yoh0 yoh0Var, long j) {
        h1();
        dm5.s(yoh0Var, "mediaItems must not be null");
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setMediaItem().");
        } else if (rlh0Var.q(31)) {
            rlh0Var.f(new uhn(rlh0Var, j, yoh0Var));
            rlh0Var.I(Collections.singletonList(yoh0Var), -1, j, false);
        }
    }

    public final k2u0 l() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() ? rlh0Var.f128p.g : k2u0.d;
    }

    public final long l0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.h;
        }
        return -9223372036854775807L;
    }

    public final void m(k2u0 k2u0Var) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setPlaybackParameters().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(13)) {
            rlh0Var.f(new x8a0((Object) rlh0Var, (Object) k2u0Var, (byte) 4));
            if (rlh0Var.f128p.g.equals(k2u0Var)) {
                return;
            }
            rlh0Var.f128p = rlh0Var.f128p.e(k2u0Var);
            h9d0Var.c(12, new clh0(k2u0Var, (byte) 0));
            h9d0Var.b();
        }
    }

    public final void m0(int i, long j) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekTo().");
        } else if (rlh0Var.q(10)) {
            dm5.m(i >= 0);
            rlh0Var.f(new mfr(rlh0Var, i, j));
            rlh0Var.F(i, j);
        }
    }

    public final void n(Surface surface) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setVideoSurface().");
            return;
        }
        if (rlh0Var.q(27)) {
            rlh0Var.b();
            rlh0Var.z = surface;
            int i = surface == null ? 0 : -1;
            rlh0Var.K(surface, i, i);
            rlh0Var.y(i, i);
        }
    }

    public final m8u0 n0() {
        h1();
        rlh0 rlh0Var = this.c;
        return !rlh0Var.p() ? m8u0.b : rlh0Var.y;
    }

    public final boolean o() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() && rlh0Var.f128p.c.b;
    }

    public final void o0(boolean z) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setShuffleMode().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(14)) {
            rlh0Var.f(new nlh0(rlh0Var, z, (byte) 1));
            jbu0 jbu0Var = rlh0Var.f128p;
            if (jbu0Var.i != z) {
                rlh0Var.f128p = jbu0Var.k(z);
                h9d0Var.c(9, new mo00((byte) 2, z));
                h9d0Var.b();
            }
        }
    }

    public final long p() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.g;
        }
        return 0L;
    }

    public final boolean q() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() && rlh0Var.f128p.v;
    }

    public final long q0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.E;
        }
        return 0L;
    }

    public final void r(po7 po7Var, boolean z) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setAudioAttributes().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(35)) {
            rlh0Var.f(new rrd(rlh0Var, po7Var, z));
            if (rlh0Var.f128p.q.equals(po7Var)) {
                return;
            }
            rlh0Var.f128p = rlh0Var.f128p.a(po7Var);
            h9d0Var.c(20, new jo00(po7Var, (byte) 1));
            h9d0Var.b();
        }
    }

    public final void r0(int i, yoh0 yoh0Var) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring replaceMediaItem().");
        } else if (rlh0Var.q(20)) {
            dm5.m(i >= 0);
            rlh0Var.f(new o8d0(rlh0Var, i, yoh0Var, (byte) 2));
            rlh0Var.C(i, i + 1, b380.t(yoh0Var));
        }
    }

    public final void s() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring clearMediaItems().");
        } else if (rlh0Var.q(20)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 3));
            rlh0Var.B(0, Alert.DURATION_SHOW_INDEFINITELY);
        }
    }

    public final void setRepeatMode(int i) {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setRepeatMode().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(15)) {
            byte b = 4;
            rlh0Var.f(new ilh0(rlh0Var, i, b));
            jbu0 jbu0Var = rlh0Var.f128p;
            if (jbu0Var.h != i) {
                rlh0Var.f128p = jbu0Var.i(i);
                h9d0Var.c(8, new nfr(i, b));
                h9d0Var.b();
            }
        }
    }

    public final void stop() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring stop().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(3)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 7));
            jbu0 jbu0Var = rlh0Var.f128p;
            xg61 xg61Var = rlh0Var.f128p.c;
            p8u0 p8u0Var = xg61Var.a;
            boolean z = xg61Var.b;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            xg61 xg61Var2 = rlh0Var.f128p.c;
            long j = xg61Var2.d;
            long j2 = xg61Var2.a.f;
            int iB = bai0.b(j2, j);
            xg61 xg61Var3 = rlh0Var.f128p.c;
            jbu0 jbu0VarJ = jbu0Var.j(new xg61(p8u0Var, z, jElapsedRealtime, j, j2, iB, 0L, xg61Var3.h, xg61Var3.i, xg61Var3.a.f));
            rlh0Var.f128p = jbu0VarJ;
            if (jbu0VarJ.A != 1) {
                rlh0Var.f128p = jbu0VarJ.f(1, jbu0VarJ.a);
                h9d0Var.c(4, new swg0((byte) 6));
                h9d0Var.b();
            }
        }
    }

    public final yoh0 u() {
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            return null;
        }
        return sqe1VarD0.n(Q0(), this.a, 0L).c;
    }

    public final long u0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.i;
        }
        return -9223372036854775807L;
    }

    public final long v() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.k();
        }
        return 0L;
    }

    public final int v0() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.a.e;
        }
        return -1;
    }

    public final int w() {
        h1();
        rlh0 rlh0Var = this.c;
        if (rlh0Var.p()) {
            return rlh0Var.f128p.c.f;
        }
        return 0;
    }

    public final z1k1 w0() {
        h1();
        rlh0 rlh0Var = this.c;
        return rlh0Var.p() ? rlh0Var.f128p.l : z1k1.d;
    }

    public final void x() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekToPreviousMediaItem().");
        } else if (rlh0Var.q(6)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 9));
            if (rlh0Var.n() != -1) {
                rlh0Var.F(rlh0Var.n(), -9223372036854775807L);
            }
        }
    }

    public final po7 x0() {
        h1();
        rlh0 rlh0Var = this.c;
        return !rlh0Var.p() ? po7.i : rlh0Var.f128p.q;
    }

    public final void y() {
        h1();
        rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring seekTo().");
        } else if (rlh0Var.q(4)) {
            rlh0Var.f(new dlh0(rlh0Var, (byte) 1));
            rlh0Var.F(rlh0.j(rlh0Var.f128p), -9223372036854775807L);
        }
    }

    public final xqt y0() {
        h1();
        rlh0 rlh0Var = this.c;
        return !rlh0Var.p() ? xqt.e : rlh0Var.f128p.s;
    }

    public final void z(final int i, final boolean z) {
        h1();
        final rlh0 rlh0Var = this.c;
        if (!rlh0Var.p()) {
            oon1.H("The controller is not connected. Ignoring setDeviceMuted().");
            return;
        }
        h9d0 h9d0Var = rlh0Var.i;
        if (rlh0Var.q(34)) {
            rlh0Var.f(new plh0() { // from class: p.mlh0
                public final void f(kh70 kh70Var, int i2) {
                    kh70Var.j(rlh0Var.c, i2, z, i);
                }
            });
            jbu0 jbu0Var = rlh0Var.f128p;
            if (jbu0Var.u != z) {
                rlh0Var.f128p = jbu0Var.c(jbu0Var.t, z);
                h9d0Var.c(30, new nlh0(rlh0Var, z, (byte) 0));
                h9d0Var.b();
            }
        }
    }
}
