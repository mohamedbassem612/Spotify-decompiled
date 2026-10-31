package p;

import android.os.RemoteException;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dzh0 implements o8u0 {
    public final WeakReference a;
    public final WeakReference b;

    public dzh0(fzh0 fzh0Var, ffu0 ffu0Var) {
        this.a = new WeakReference(fzh0Var);
        this.b = new WeakReference(ffu0Var);
    }

    public final void A(tqh0 tqh0Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        fzh0VarA.s = fzh0VarA.s.g(tqh0Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.s(tqh0Var);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void B(k0g1 k0g1Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.n(k0g1Var);
        fzh0VarA.c.a(true, true);
        fzh0VarA.d(new czh0((byte) 0));
    }

    public final void C(o3g1 o3g1Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.b(o3g1Var);
        fzh0VarA.c.a(true, false);
        fzh0VarA.d(new czh0((byte) 1));
    }

    public final void C0(sqe1 sqe1Var, int i) {
        k0g1 k0g1Var;
        boolean z;
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        ffu0 ffu0Var = (ffu0) this.b.get();
        if (ffu0Var == null) {
            return;
        }
        xg61 xg61VarG1 = ffu0Var.g1();
        if (i == 0 && fzh0VarA.s.j.p()) {
            jbu0 jbu0Var = fzh0VarA.s;
            PlaybackException playbackException = jbu0Var.a;
            int i2 = jbu0Var.b;
            xg61 xg61Var = jbu0Var.c;
            int i3 = jbu0Var.f;
            k2u0 k2u0Var = jbu0Var.g;
            int i4 = jbu0Var.h;
            boolean z2 = jbu0Var.i;
            sqe1 sqe1Var2 = jbu0Var.j;
            int i5 = jbu0Var.k;
            z1k1 z1k1Var = jbu0Var.l;
            tqh0 tqh0Var = jbu0Var.m;
            float f = jbu0Var.n;
            float f2 = jbu0Var.o;
            int i6 = jbu0Var.f78p;
            po7 po7Var = jbu0Var.q;
            qeo qeoVar = jbu0Var.r;
            xqt xqtVar = jbu0Var.s;
            int i7 = jbu0Var.t;
            boolean z3 = jbu0Var.u;
            boolean z4 = jbu0Var.v;
            int i8 = jbu0Var.w;
            boolean z5 = jbu0Var.x;
            boolean z6 = jbu0Var.y;
            int i9 = jbu0Var.z;
            int i10 = jbu0Var.A;
            tqh0 tqh0Var2 = jbu0Var.B;
            long j = jbu0Var.C;
            long j2 = jbu0Var.D;
            long j3 = jbu0Var.E;
            o3g1 o3g1Var = jbu0Var.F;
            k0g1 k0g1Var2 = jbu0Var.G;
            p8u0 p8u0Var = jbu0Var.e;
            p8u0 p8u0Var2 = xg61VarG1.a;
            if (sqe1Var2.p()) {
                k0g1Var = k0g1Var2;
            } else {
                k0g1Var = k0g1Var2;
                if (xg61Var.a.b >= sqe1Var2.o()) {
                    z = false;
                }
                dm5.y(z);
                fzh0VarA.s = new jbu0(playbackException, i2, xg61Var, p8u0Var, p8u0Var2, i3, k2u0Var, i4, z2, z1k1Var, sqe1Var2, i5, tqh0Var, f, f2, po7Var, i6, qeoVar, xqtVar, i7, z3, z4, i8, i9, i10, z5, z6, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
            }
            z = true;
            dm5.y(z);
            fzh0VarA.s = new jbu0(playbackException, i2, xg61Var, p8u0Var, p8u0Var2, i3, k2u0Var, i4, z2, z1k1Var, sqe1Var2, i5, tqh0Var, f, f2, po7Var, i6, qeoVar, xqtVar, i7, z3, z4, i8, i9, i10, z5, z6, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        }
        fzh0VarA.s = fzh0VarA.s.m(sqe1Var, xg61VarG1, i);
        fzh0VarA.c.a(false, true);
        try {
            fzh0VarA.h.f.v(sqe1Var);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void E0(boolean z) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z2 = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z3 = jbu0Var.u;
        boolean z4 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z2, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z3, z4, i7, i8, i9, z, z5, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            e0i0 e0i0Var = fzh0VarA.h.f.e;
            fzh0 fzh0Var = e0i0Var.d;
            fzh0Var.C();
            e0i0Var.n(fzh0Var.t);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
        fzh0VarA.B();
    }

    public final void H(int i) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        ffu0 ffu0Var = (ffu0) this.b.get();
        if (ffu0Var == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.f(i, ffu0Var.L());
        fzh0VarA.c.a(true, true);
        try {
            c0i0 c0i0Var = fzh0VarA.h.f;
            ffu0Var.L();
            e0i0 e0i0Var = c0i0Var.e;
            fzh0 fzh0Var = e0i0Var.d;
            fzh0Var.C();
            e0i0Var.n(fzh0Var.t);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void J(int i, yoh0 yoh0Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.q(yoh0Var);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void K(boolean z) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.k(z);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.u(z);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void O(int i, boolean z) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.c(i, z);
        fzh0VarA.c.a(true, true);
        try {
            yzh0 yzh0Var = fzh0VarA.h.f.e.m;
            if (yzh0Var != null) {
                if (z) {
                    i = 0;
                }
                yzh0Var.setCurrentVolume(i);
            }
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void P(long j) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.getClass();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void R() {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        v1k v1kVar = fzh0VarA.g.m;
        b380 b380VarM = v1kVar.m();
        for (int i = 0; i < b380VarM.size(); i++) {
            ixh0 ixh0Var = (ixh0) b380VarM.get(i);
            v1kVar.J();
            fzh0VarA.c(ixh0Var, new czh0((byte) 2));
        }
    }

    public final void X(int i, int i2) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.d(new ko00((byte) 3, i, i2));
    }

    public final void Y(po7 po7Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.a(po7Var);
        fzh0VarA.c.a(true, true);
        try {
            e0i0 e0i0Var = fzh0VarA.h.f.e;
            fzh0 fzh0Var = e0i0Var.d;
            fzh0Var.C();
            if (fzh0Var.t.y0().a == 0) {
                e0i0Var.j.setPlaybackToLocal(po7Var);
            }
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final fzh0 a() {
        return (fzh0) this.a.get();
    }

    public final void b(z1k1 z1k1Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.getClass();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void e0(boolean z) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z2 = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z3 = jbu0Var.u;
        boolean z4 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z5 = jbu0Var.x;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z2, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z3, z4, i7, i8, i9, z5, z, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.getClass();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
        fzh0VarA.B();
    }

    public final void g0(int i, boolean z) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        fzh0VarA.s = jbu0Var.d(i, jbu0Var.z, z);
        fzh0VarA.c.a(true, true);
        try {
            e0i0 e0i0Var = fzh0VarA.h.f.e;
            fzh0 fzh0Var = e0i0Var.d;
            fzh0Var.C();
            e0i0Var.n(fzh0Var.t);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void h0(float f) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        fzh0VarA.s = fzh0VarA.s.o(f);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.getClass();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void i(int i) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i2 = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i3 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i4 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i5 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i2, xg61Var, p8u0Var, p8u0Var2, i3, k2u0Var, i4, z, z1k1Var, sqe1Var, i5, tqh0Var, f, f2, po7Var, i, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.getClass();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void j0(p8u0 p8u0Var, p8u0 p8u0Var2, int i) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.h(p8u0Var, p8u0Var2, i);
        fzh0VarA.c.a(true, true);
        try {
            e0i0 e0i0Var = fzh0VarA.h.f.e;
            fzh0 fzh0Var = e0i0Var.d;
            fzh0Var.C();
            e0i0Var.n(fzh0Var.t);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void n(PlaybackException playbackException) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            e0i0 e0i0Var = fzh0VarA.h.f.e;
            fzh0 fzh0Var = e0i0Var.d;
            fzh0Var.C();
            e0i0Var.n(fzh0Var.t);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void n0(tqh0 tqh0Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var2 = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var2, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.w();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void o(qeo qeoVar) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
    }

    public final void onRepeatModeChanged(int i) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.i(i);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.t(i);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void p0(m8u0 m8u0Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.l(m8u0Var);
    }

    public final void q0(xqt xqtVar) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.p();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void r0(k2u0 k2u0Var) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        fzh0VarA.s = fzh0VarA.s.e(k2u0Var);
        fzh0VarA.c.a(true, true);
        try {
            e0i0 e0i0Var = fzh0VarA.h.f.e;
            fzh0 fzh0Var = e0i0Var.d;
            fzh0Var.C();
            e0i0Var.n(fzh0Var.t);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void t0(long j) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j2 = jbu0Var.C;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j2, j, j3, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
        try {
            fzh0VarA.h.f.getClass();
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void w(int i) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        fzh0VarA.s = jbu0Var.d(jbu0Var.w, i, jbu0Var.v);
        fzh0VarA.c.a(true, true);
        try {
            e0i0 e0i0Var = fzh0VarA.h.f.e;
            fzh0 fzh0Var = e0i0Var.d;
            fzh0Var.C();
            e0i0Var.n(fzh0Var.t);
        } catch (RemoteException e) {
            oon1.w("Exception in using media1 API", e);
        }
    }

    public final void y0(long j) {
        fzh0 fzh0VarA = a();
        if (fzh0VarA == null) {
            return;
        }
        fzh0VarA.C();
        if (((ffu0) this.b.get()) == null) {
            return;
        }
        jbu0 jbu0Var = fzh0VarA.s;
        PlaybackException playbackException = jbu0Var.a;
        int i = jbu0Var.b;
        xg61 xg61Var = jbu0Var.c;
        p8u0 p8u0Var = jbu0Var.d;
        p8u0 p8u0Var2 = jbu0Var.e;
        int i2 = jbu0Var.f;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z = jbu0Var.i;
        sqe1 sqe1Var = jbu0Var.j;
        int i4 = jbu0Var.k;
        z1k1 z1k1Var = jbu0Var.l;
        tqh0 tqh0Var = jbu0Var.m;
        float f = jbu0Var.n;
        float f2 = jbu0Var.o;
        int i5 = jbu0Var.f78p;
        po7 po7Var = jbu0Var.q;
        qeo qeoVar = jbu0Var.r;
        xqt xqtVar = jbu0Var.s;
        int i6 = jbu0Var.t;
        boolean z2 = jbu0Var.u;
        boolean z3 = jbu0Var.v;
        int i7 = jbu0Var.w;
        boolean z4 = jbu0Var.x;
        boolean z5 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j2 = jbu0Var.C;
        long j3 = jbu0Var.D;
        o3g1 o3g1Var = jbu0Var.F;
        k0g1 k0g1Var = jbu0Var.G;
        dm5.y(sqe1Var.p() || xg61Var.a.b < sqe1Var.o());
        fzh0VarA.s = new jbu0(playbackException, i, xg61Var, p8u0Var, p8u0Var2, i2, k2u0Var, i3, z, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z2, z3, i7, i8, i9, z4, z5, tqh0Var2, j2, j3, j, o3g1Var, k0g1Var);
        fzh0VarA.c.a(true, true);
    }
}
