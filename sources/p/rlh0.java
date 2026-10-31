package p;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class rlh0 {
    public SurfaceHolder A;
    public kh70 C;
    public MediaController D;
    public long E;
    public long F;
    public jbu0 G;
    public Bundle H;
    public final tkh0 a;
    public final xen0 b;
    public final xlh0 c;
    public final Context d;
    public final hi61 e;
    public final Bundle f;
    public final llh0 g;
    public final qlh0 h;
    public final h9d0 i;
    public final j2e0 j;
    public final d46 k;
    public final SparseArray l;
    public final Handler m;
    public hi61 n;
    public boolean o;
    public PendingIntent q;
    public b380 r;
    public b380 s;
    public bg11 t;
    public bg11 u;
    public m8u0 w;
    public m8u0 x;
    public m8u0 y;
    public Surface z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public jbu0 f128p = jbu0.H;
    public l291 B = l291.c;
    public qa61 v = qa61.b;

    /* JADX WARN: Type inference failed for: r4v4, types: [p.llh0] */
    public rlh0(Context context, tkh0 tkh0Var, hi61 hi61Var, Bundle bundle, Looper looper) {
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        this.r = bg11Var;
        this.s = bg11Var;
        this.t = bg11Var;
        this.u = bg11Var;
        m8u0 m8u0Var = m8u0.b;
        this.w = m8u0Var;
        this.x = m8u0Var;
        this.y = c(m8u0Var, m8u0Var);
        this.i = new h9d0(looper, rdd1.a, new swg0(this));
        this.m = new Handler(looper);
        this.a = tkh0Var;
        dm5.s(context, "context must not be null");
        dm5.s(hi61Var, "token must not be null");
        this.d = context;
        this.b = new xen0();
        this.c = new xlh0(this);
        final byte b = 0;
        this.k = new d46(0);
        this.e = hi61Var;
        this.f = bundle;
        this.g = new IBinder.DeathRecipient() { // from class: p.llh0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                byte b2 = b;
                Object obj = this;
                switch (b2) {
                    case 0:
                        tkh0 tkh0Var2 = ((rlh0) obj).a;
                        Objects.requireNonNull(tkh0Var2);
                        tkh0Var2.g1(new gv40(tkh0Var2, (byte) 16));
                        break;
                    default:
                        ((g2z) obj).z();
                        break;
                }
            }
        };
        this.h = new qlh0(this);
        this.H = Bundle.EMPTY;
        this.j = new j2e0(this, looper);
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.l = new SparseArray();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public static bg11 D(List list, List list2, Bundle bundle, qa61 qa61Var, m8u0 m8u0Var, int i) {
        boolean z;
        if (!list2.isEmpty()) {
            return udh.f(list2, qa61Var, m8u0Var);
        }
        boolean z2 = false;
        if (bundle.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV)) {
            z = false;
        } else {
            if (m8u0Var.a.a(6, 7)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!bundle.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT)) {
            if (!m8u0Var.a.a(8, 9)) {
                z2 = true;
            }
        }
        return udh.i(i, list, z, z2);
    }

    public static bg11 E(List list, List list2, qa61 qa61Var, m8u0 m8u0Var, Bundle bundle) {
        if (list.isEmpty()) {
            String str = udh.k;
            if (list2.isEmpty()) {
                w280 w280Var = b380.b;
                list = bg11.e;
            } else {
                boolean zA = m8u0Var.a.a(7, 6);
                boolean zA2 = m8u0Var.a.a(9, 8);
                boolean z = bundle.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV, false);
                boolean z2 = bundle.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT, false);
                int i = (zA || z) ? -1 : 0;
                int i2 = (zA2 || z2) ? -1 : i == 0 ? 1 : 0;
                v280 v280VarM = b380.m();
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    udh udhVar = (udh) list2.get(i3);
                    if (i3 == i) {
                        if (i2 == -1) {
                            v280VarM.c(udhVar.e(u280.c(2, 6)));
                        } else {
                            v280VarM.c(udhVar.e(new u280(3, new int[]{2, 3, 6})));
                        }
                    } else if (i3 == i2) {
                        v280VarM.c(udhVar.e(u280.c(3, 6)));
                    } else {
                        v280VarM.c(udhVar.e(new u280(1, new int[]{6})));
                    }
                }
                list = v280VarM.g();
            }
        }
        return udh.f(list, qa61Var, m8u0Var);
    }

    public static eqe1 d(ArrayList arrayList, ArrayList arrayList2) {
        v280 v280Var = new v280(4);
        v280Var.e(arrayList);
        bg11 bg11VarG = v280Var.g();
        v280 v280Var2 = new v280(4);
        v280Var2.e(arrayList2);
        bg11 bg11VarG2 = v280Var2.g();
        int size = arrayList.size();
        MediaBrowserServiceCompat.BrowserRoot browserRoot = bai0.a;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new eqe1(bg11VarG, bg11VarG2, iArr);
    }

    public static int j(jbu0 jbu0Var) {
        return jbu0Var.c.a.b;
    }

    public static jbu0 r(jbu0 jbu0Var, int i, List list, long j, long j2) {
        int size;
        sqe1 sqe1Var = jbu0Var.j;
        xg61 xg61Var = jbu0Var.c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i2 = 0; i2 < sqe1Var.o(); i2++) {
            arrayList.add(sqe1Var.n(i2, new oqe1(), 0L));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            yoh0 yoh0Var = (yoh0) list.get(i3);
            oqe1 oqe1Var = new oqe1();
            oqe1Var.d(0, yoh0Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i3 + i, oqe1Var);
        }
        z(sqe1Var, arrayList, arrayList2);
        eqe1 eqe1VarD = d(arrayList, arrayList2);
        if (jbu0Var.j.p()) {
            size = 0;
        } else {
            int i4 = xg61Var.a.b;
            size2 = i4 >= i ? list.size() + i4 : i4;
            int i5 = xg61Var.a.e;
            size = i5 >= i ? list.size() + i5 : i5;
        }
        return t(jbu0Var, eqe1VarD, size2, size, j, j2, 5);
    }

    public static jbu0 s(jbu0 jbu0Var, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int iA;
        int i4;
        jbu0 jbu0VarT;
        sqe1 sqe1Var = jbu0Var.j;
        boolean z2 = jbu0Var.i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        for (int i6 = 0; i6 < sqe1Var.o(); i6++) {
            if (i6 < i || i6 >= i2) {
                arrayList.add(sqe1Var.n(i6, new oqe1(), 0L));
            }
        }
        z(sqe1Var, arrayList, arrayList2);
        eqe1 eqe1VarD = d(arrayList, arrayList2);
        p8u0 p8u0Var = jbu0Var.c.a;
        int i7 = p8u0Var.b;
        int i8 = p8u0Var.e;
        oqe1 oqe1Var = new oqe1();
        boolean z3 = i7 >= i && i7 < i2;
        if (eqe1VarD.p()) {
            i8 = 0;
            iA = -1;
            i3 = 1;
        } else {
            if (z3) {
                int i9 = jbu0Var.h;
                int iO = sqe1Var.o();
                iA = i7;
                i3 = 1;
                while (true) {
                    if (i5 < iO) {
                        iA = sqe1Var.e(iA, i9, z2);
                        if (iA != -1) {
                            if (iA < i || iA >= i2) {
                                break;
                            }
                            i5++;
                        }
                    }
                    iA = -1;
                    break;
                }
                if (iA == -1) {
                    iA = eqe1VarD.a(z2);
                } else if (iA >= i2) {
                    iA -= i2 - i;
                }
                eqe1VarD.n(iA, oqe1Var, 0L);
                i4 = oqe1Var.n;
            } else {
                i3 = 1;
                if (i7 >= i2) {
                    iA = i7 - (i2 - i);
                    if (i8 != -1) {
                        for (int i10 = i; i10 < i2; i10++) {
                            oqe1 oqe1Var2 = new oqe1();
                            sqe1Var.m(i10, oqe1Var2);
                            i8 -= (oqe1Var2.o - oqe1Var2.n) + 1;
                        }
                    }
                    i4 = i8;
                } else {
                    iA = i7;
                }
            }
            i8 = i4;
        }
        if (!z3) {
            jbu0VarT = t(jbu0Var, eqe1VarD, iA, i8, j, j2, 4);
        } else if (iA == -1) {
            jbu0VarT = u(jbu0Var, eqe1VarD, xg61.k, xg61.l, 4);
        } else if (z) {
            jbu0VarT = t(jbu0Var, eqe1VarD, iA, i8, j, j2, 4);
        } else {
            int i11 = iA;
            oqe1 oqe1Var3 = new oqe1();
            eqe1VarD.n(i11, oqe1Var3, 0L);
            long jN0 = zoi1.n0(oqe1Var3.l);
            long jN1 = zoi1.n0(oqe1Var3.m);
            p8u0 p8u0Var2 = new p8u0(null, i11, oqe1Var3.c, null, i8, jN0, jN0, -1, -1);
            jbu0VarT = u(jbu0Var, eqe1VarD, p8u0Var2, new xg61(p8u0Var2, false, SystemClock.elapsedRealtime(), jN1, jN0, bai0.b(jN0, jN1), 0L, -9223372036854775807L, jN1, jN0), 4);
        }
        int i12 = jbu0VarT.A;
        return (i12 == i3 || i12 == 4 || i >= i2 || i2 != sqe1Var.o() || i7 < i) ? jbu0VarT : jbu0VarT.f(4, null);
    }

    public static jbu0 t(jbu0 jbu0Var, eqe1 eqe1Var, int i, int i2, long j, long j2, int i3) {
        oqe1 oqe1Var = new oqe1();
        eqe1Var.n(i, oqe1Var, 0L);
        yoh0 yoh0Var = oqe1Var.c;
        p8u0 p8u0Var = jbu0Var.c.a;
        p8u0 p8u0Var2 = new p8u0(null, i, yoh0Var, null, i2, j, j2, p8u0Var.h, p8u0Var.i);
        xg61 xg61Var = jbu0Var.c;
        return u(jbu0Var, eqe1Var, p8u0Var2, new xg61(p8u0Var2, xg61Var.b, SystemClock.elapsedRealtime(), xg61Var.d, xg61Var.e, xg61Var.f, xg61Var.g, xg61Var.h, xg61Var.i, xg61Var.j), i3);
    }

    public static jbu0 u(jbu0 jbu0Var, sqe1 sqe1Var, p8u0 p8u0Var, xg61 xg61Var, int i) {
        xg61 xg61Var2;
        k0g1 k0g1Var;
        o3g1 o3g1Var;
        boolean z;
        PlaybackException playbackException = jbu0Var.a;
        int i2 = jbu0Var.b;
        xg61 xg61Var3 = jbu0Var.c;
        k2u0 k2u0Var = jbu0Var.g;
        int i3 = jbu0Var.h;
        boolean z2 = jbu0Var.i;
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
        boolean z6 = jbu0Var.y;
        int i8 = jbu0Var.z;
        int i9 = jbu0Var.A;
        tqh0 tqh0Var2 = jbu0Var.B;
        long j = jbu0Var.C;
        long j2 = jbu0Var.D;
        long j3 = jbu0Var.E;
        o3g1 o3g1Var2 = jbu0Var.F;
        k0g1 k0g1Var2 = jbu0Var.G;
        p8u0 p8u0Var2 = xg61Var3.a;
        if (!sqe1Var.p()) {
            xg61Var2 = xg61Var;
            k0g1Var = k0g1Var2;
            o3g1Var = o3g1Var2;
            if (xg61Var2.a.b >= sqe1Var.o()) {
                z = false;
            }
            dm5.y(z);
            return new jbu0(playbackException, i2, xg61Var2, p8u0Var2, p8u0Var, i, k2u0Var, i3, z2, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z3, z4, i7, i8, i9, z5, z6, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
        }
        xg61Var2 = xg61Var;
        k0g1Var = k0g1Var2;
        o3g1Var = o3g1Var2;
        z = true;
        dm5.y(z);
        return new jbu0(playbackException, i2, xg61Var2, p8u0Var2, p8u0Var, i, k2u0Var, i3, z2, z1k1Var, sqe1Var, i4, tqh0Var, f, f2, po7Var, i5, qeoVar, xqtVar, i6, z3, z4, i7, i8, i9, z5, z6, tqh0Var2, j, j2, j3, o3g1Var, k0g1Var);
    }

    public static void z(sqe1 sqe1Var, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            oqe1 oqe1Var = (oqe1) arrayList.get(i);
            int i2 = oqe1Var.n;
            int i3 = oqe1Var.o;
            if (i2 == -1 || i3 == -1) {
                oqe1Var.n = arrayList2.size();
                oqe1Var.o = arrayList2.size();
                dqe1 dqe1Var = new dqe1();
                dqe1Var.i(null, null, i, -9223372036854775807L, 0L, ev0.f, true);
                arrayList2.add(dqe1Var);
            } else {
                oqe1Var.n = arrayList2.size();
                oqe1Var.o = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    dqe1 dqe1Var2 = new dqe1();
                    sqe1Var.f(i2, dqe1Var2, false);
                    dqe1Var2.c = i;
                    arrayList2.add(dqe1Var2);
                    i2++;
                }
            }
        }
    }

    public final void A() {
        kh70 kh70Var = this.C;
        if (this.o) {
            return;
        }
        this.o = true;
        this.n = null;
        this.m.removeCallbacksAndMessages(null);
        b();
        j2e0 j2e0Var = this.j;
        Handler handler = (Handler) j2e0Var.b;
        if (handler.hasMessages(1)) {
            j2e0Var.d();
        }
        handler.removeCallbacksAndMessages(null);
        this.C = null;
        byte b = 0;
        if (kh70Var != null && kh70Var.asBinder().isBinderAlive()) {
            int iD = this.b.d();
            try {
                kh70Var.asBinder().unlinkToDeath(this.g, 0);
                kh70Var.i(this.c, iD);
            } catch (RemoteException unused) {
            }
        }
        this.i.d();
        xen0 xen0Var = this.b;
        klh0 klh0Var = new klh0(this, b);
        synchronized (xen0Var.c) {
            try {
                Handler handlerR = zoi1.r((lkh0) null);
                xen0Var.f = handlerR;
                xen0Var.e = klh0Var;
                if (((y36) xen0Var.d).isEmpty()) {
                    xen0Var.e();
                } else {
                    handlerR.postDelayed(new v241(xen0Var, (byte) 4), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(int i, int i2) {
        int iO = this.f128p.j.o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin || iO == 0) {
            return;
        }
        boolean z = j(this.f128p) >= i && j(this.f128p) < iMin;
        jbu0 jbu0VarS = s(this.f128p, i, iMin, false, k(), i());
        int i3 = this.f128p.c.a.b;
        L(jbu0VarS, 0, null, z ? 4 : null, i3 >= i && i3 < iMin ? 3 : null);
    }

    public final void C(int i, int i2, List list) {
        int iO = this.f128p.j.o();
        if (i > iO) {
            return;
        }
        if (this.f128p.j.p()) {
            I(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i2, iO);
        jbu0 jbu0VarS = s(r(this.f128p, iMin, list, k(), i()), i, iMin, true, k(), i());
        int i3 = this.f128p.c.a.b;
        boolean z = i3 >= i && i3 < iMin;
        L(jbu0VarS, 0, null, z ? 4 : null, z ? 3 : null);
    }

    public final void F(int i, long j) {
        int i2;
        int i3;
        jbu0 jbu0VarU;
        sqe1 sqe1Var = this.f128p.j;
        if (sqe1Var.p() || i < sqe1Var.o()) {
            jbu0 jbu0Var = this.f128p;
            if (jbu0Var.c.b) {
                return;
            }
            jbu0 jbu0VarF = jbu0Var.f(jbu0Var.A == 1 ? 1 : 2, jbu0Var.a);
            o4t o4tVarM = m(sqe1Var, i, j);
            if (o4tVarM == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                p8u0 p8u0Var = new p8u0(null, i, null, null, i, j3, j2, -1, -1);
                jbu0 jbu0Var2 = this.f128p;
                sqe1 sqe1Var2 = jbu0Var2.j;
                boolean z = this.f128p.c.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                xg61 xg61Var = this.f128p.c;
                jbu0VarU = u(jbu0Var2, sqe1Var2, p8u0Var, new xg61(p8u0Var, z, jElapsedRealtime, xg61Var.d, j == -9223372036854775807L ? 0L : j, 0, 0L, xg61Var.h, xg61Var.i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                xg61 xg61Var2 = jbu0VarF.c;
                p8u0 p8u0Var2 = xg61Var2.a;
                p8u0 p8u0Var3 = xg61Var2.a;
                int i4 = p8u0Var2.e;
                int i5 = o4tVarM.a;
                dqe1 dqe1Var = new dqe1();
                sqe1Var.f(i4, dqe1Var, false);
                dqe1 dqe1Var2 = new dqe1();
                sqe1Var.f(i5, dqe1Var2, false);
                boolean z2 = i4 != i5;
                long j4 = o4tVarM.b;
                long jW = zoi1.W(k()) - dqe1Var.e;
                if (z2 || j4 != jW) {
                    dm5.y(p8u0Var3.h == -1);
                    p8u0 p8u0Var4 = new p8u0(null, dqe1Var.c, p8u0Var3.c, null, i4, zoi1.n0(dqe1Var.e + jW), zoi1.n0(dqe1Var.e + jW), -1, -1);
                    sqe1Var.f(i5, dqe1Var2, false);
                    oqe1 oqe1Var = new oqe1();
                    sqe1Var.m(dqe1Var2.c, oqe1Var);
                    long jN0 = zoi1.n0(dqe1Var2.e + j4);
                    p8u0 p8u0Var5 = new p8u0(null, dqe1Var2.c, oqe1Var.c, null, i5, jN0, jN0, -1, -1);
                    jbu0 jbu0VarH = jbu0VarF.h(p8u0Var4, p8u0Var5, 1);
                    if (z2 || j4 < jW) {
                        jbu0VarF = jbu0VarH.j(new xg61(p8u0Var5, false, SystemClock.elapsedRealtime(), zoi1.n0(oqe1Var.m), jN0, bai0.b(jN0, zoi1.n0(oqe1Var.m)), 0L, -9223372036854775807L, -9223372036854775807L, jN0));
                    } else {
                        long jMax = Math.max(0L, zoi1.W(jbu0VarH.c.g) - (j4 - jW));
                        long jN1 = zoi1.n0(dqe1Var2.e + j4 + jMax);
                        jbu0VarF = jbu0VarH.j(new xg61(p8u0Var5, false, SystemClock.elapsedRealtime(), zoi1.n0(oqe1Var.m), jN1, bai0.b(jN1, zoi1.n0(oqe1Var.m)), zoi1.n0(jMax), -9223372036854775807L, -9223372036854775807L, jN1));
                    }
                }
                jbu0VarU = jbu0VarF;
            }
            xg61 xg61Var3 = jbu0VarU.c;
            int i6 = (this.f128p.j.p() || xg61Var3.a.b == this.f128p.c.a.b) ? 0 : i2;
            if (i6 == 0 && xg61Var3.a.f == this.f128p.c.a.f) {
                return;
            }
            L(jbu0VarU, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    public final void G(long j) {
        long jK = k() + j;
        long j2 = this.f128p.c.d;
        if (j2 != -9223372036854775807L) {
            jK = Math.min(jK, j2);
        }
        F(j(this.f128p), Math.max(jK, 0L));
    }

    public final n8d0 H(final pa61 pa61Var, final Bundle bundle) {
        if (o() < 7) {
            final byte b = 0;
            return h(pa61Var, new plh0(this) { // from class: p.glh0
                public final /* synthetic */ rlh0 b;

                {
                    this.b = this;
                }

                public final void f(kh70 kh70Var, int i) {
                    byte b2 = b;
                    pa61 pa61Var2 = pa61Var;
                    rlh0 rlh0Var = this.b;
                    switch (b2) {
                        case 0:
                            kh70Var.i0(rlh0Var.c, i, pa61Var2.b(), bundle);
                            break;
                        default:
                            kh70Var.R0(rlh0Var.c, i, pa61Var2.b(), bundle, false);
                            break;
                    }
                }
            });
        }
        if (o() < 7) {
            return H(pa61Var, bundle);
        }
        final byte b2 = 1;
        return h(pa61Var, new plh0(this) { // from class: p.glh0
            public final /* synthetic */ rlh0 b;

            {
                this.b = this;
            }

            public final void f(kh70 kh70Var, int i) {
                byte b3 = b2;
                pa61 pa61Var2 = pa61Var;
                rlh0 rlh0Var = this.b;
                switch (b3) {
                    case 0:
                        kh70Var.i0(rlh0Var.c, i, pa61Var2.b(), bundle);
                        break;
                    default:
                        kh70Var.R0(rlh0Var.c, i, pa61Var2.b(), bundle, false);
                        break;
                }
            }
        });
    }

    public final void I(List list, int i, long j, boolean z) {
        int iA;
        boolean z2;
        long j2;
        p8u0 p8u0Var;
        xg61 xg61Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            yoh0 yoh0Var = (yoh0) list.get(i2);
            int i3 = yzb0.a;
            oqe1 oqe1Var = new oqe1();
            int i4 = i2;
            oqe1Var.d(0, yoh0Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i4, i4, 0L);
            arrayList.add(oqe1Var);
            dqe1 dqe1Var = new dqe1();
            dqe1Var.i(null, null, i4, -9223372036854775807L, 0L, ev0.f, true);
            arrayList2.add(dqe1Var);
            i2 = i4 + 1;
        }
        eqe1 eqe1VarD = d(arrayList, arrayList2);
        bg11 bg11Var = eqe1VarD.e;
        if (!eqe1VarD.p() && i >= bg11Var.d) {
            throw new IllegalSeekPositionException();
        }
        if (z) {
            iA = eqe1VarD.p() ? 0 : eqe1VarD.a(this.f128p.i);
            z2 = false;
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            p8u0 p8u0Var2 = this.f128p.c.a;
            int i5 = p8u0Var2.b;
            long j3 = p8u0Var2.f;
            if (eqe1VarD.p() || i5 < bg11Var.d) {
                z2 = false;
                j2 = j3;
                iA = i5;
            } else {
                iA = eqe1VarD.a(this.f128p.i);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            iA = i;
            z2 = false;
            j2 = j;
        }
        o4t o4tVarM = m(eqe1VarD, iA, j2);
        if (o4tVarM == null) {
            p8u0Var = new p8u0(null, iA, null, null, iA, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            xg61Var = new xg61(p8u0Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = o4tVarM.b;
            p8u0Var = new p8u0(null, iA, (yoh0) list.get(iA), null, o4tVarM.a, zoi1.n0(j4), zoi1.n0(j4), -1, -1);
            xg61Var = new xg61(p8u0Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, zoi1.n0(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, zoi1.n0(j4));
        }
        jbu0 jbu0VarU = u(this.f128p, eqe1VarD, p8u0Var, xg61Var, 4);
        int i6 = jbu0VarU.A;
        if (iA != -1 && i6 != 1) {
            i6 = (eqe1VarD.p() || z2) ? 4 : 2;
        }
        jbu0 jbu0VarF = jbu0VarU.f(i6, this.f128p.a);
        L(jbu0VarF, 0, null, !this.f128p.j.p() ? 4 : null, (this.f128p.j.p() && jbu0VarF.j.p()) ? null : 3);
    }

    public final void J(boolean z) {
        jbu0 jbu0Var = this.f128p;
        int i = jbu0Var.z;
        int i2 = i == 1 ? 0 : i;
        if (jbu0Var.v == z && i == i2) {
            return;
        }
        this.E = bai0.c(jbu0Var, this.E, this.F, this.a.f);
        this.F = SystemClock.elapsedRealtime();
        L(this.f128p.d(1, i2, z), null, 1, null, null);
    }

    public final void K(Surface surface, int i, int i2) {
        if (p()) {
            if (o() >= 8) {
                g(new ykh0(this, surface, i, i2, (byte) 1));
            } else {
                g(new x8a0((Object) this, (Object) surface, (byte) 5));
            }
        }
    }

    public final void L(jbu0 jbu0Var, Integer num, Integer num2, Integer num3, Integer num4) {
        jbu0 jbu0Var2 = this.f128p;
        this.f128p = jbu0Var;
        w(jbu0Var2, jbu0Var, num, num2, num3, num4);
    }

    public final void a(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f128p.j.p()) {
            I(list, -1, -9223372036854775807L, false);
        } else {
            L(r(this.f128p, Math.min(i, this.f128p.j.o()), list, k(), i()), 0, null, null, this.f128p.j.p() ? 3 : null);
        }
    }

    public final void b() {
        SurfaceHolder surfaceHolder = this.A;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.h);
            this.A = null;
        }
        if (this.z != null) {
            this.z = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r7.a.a(25, 33, 26, 34) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p.m8u0 c(p.m8u0 r7, p.m8u0 r8) {
        /*
            r6 = this;
            p.m8u0 r7 = p.bai0.d(r7, r8)
            p.jbu0 r6 = r6.f128p
            p.xqt r6 = r6.s
            int r6 = r6.a
            if (r6 != 0) goto Le
            r6 = 1
            goto Lf
        Le:
            r6 = 0
        Lf:
            r8 = 32
            boolean r0 = r7.a(r8)
            r1 = 34
            r2 = 26
            r3 = 33
            r4 = 25
            if (r0 == 0) goto L2e
            if (r6 == 0) goto L2d
            int[] r0 = new int[]{r4, r3, r2, r1}
            p.ko20 r5 = r7.a
            boolean r0 = r5.a(r0)
            if (r0 != 0) goto L2e
        L2d:
            return r7
        L2e:
            p.l8u0 r0 = new p.l8u0
            r0.<init>(r7)
            p.lls0 r7 = r0.a
            r7.c(r8)
            r0.e(r4, r6)
            r0.e(r3, r6)
            r0.e(r2, r6)
            r0.e(r1, r6)
            p.m8u0 r6 = r0.d()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rlh0.c(p.m8u0, p.m8u0):p.m8u0");
    }

    public final n8d0 e(kh70 kh70Var, plh0 plh0Var, boolean z) {
        MediaController mediaController;
        if (kh70Var == null) {
            return fc11.J(new ch61(-4));
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.D) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        ch61 ch61Var = new ch61(1);
        xen0 xen0Var = this.b;
        w561 w561VarC = xen0Var.c(ch61Var);
        int i = w561VarC.e;
        d46 d46Var = this.k;
        if (z) {
            if (d46Var.isEmpty()) {
                this.G = this.f128p;
            }
            d46Var.add(Integer.valueOf(i));
        }
        try {
            plh0Var.f(kh70Var, i);
            return w561VarC;
        } catch (RemoteException e) {
            oon1.I("Cannot connect to the service or the session is gone", e);
            d46Var.remove(Integer.valueOf(i));
            xen0Var.i(i, new ch61(-100));
            return w561VarC;
        }
    }

    public final void f(plh0 plh0Var) {
        j2e0 j2e0Var = this.j;
        Handler handler = (Handler) j2e0Var.b;
        if (((rlh0) j2e0Var.c).C != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        e(this.C, plh0Var, true);
    }

    public final void g(plh0 plh0Var) {
        j2e0 j2e0Var = this.j;
        Handler handler = (Handler) j2e0Var.b;
        if (((rlh0) j2e0Var.c).C != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        n8d0 n8d0VarE = e(this.C, plh0Var, true);
        try {
            yzb0.i(n8d0VarE);
        } catch (ExecutionException e) {
            bhn0.p(e);
        } catch (TimeoutException e2) {
            if (n8d0VarE instanceof w561) {
                int i = ((w561) n8d0VarE).e;
                this.k.remove(Integer.valueOf(i));
                this.b.i(i, new ch61(-1));
            }
            oon1.I("Synchronous command takes too long on the session side.", e2);
        }
    }

    public final n8d0 h(pa61 pa61Var, plh0 plh0Var) {
        kh70 kh70Var;
        int i = pa61Var.a;
        String str = pa61Var.b;
        dm5.m(i == 0);
        if (this.v.a.contains(pa61Var) || udh.l(str)) {
            kh70Var = this.C;
        } else {
            oon1.H("Controller isn't allowed to call custom session command:".concat(str));
            kh70Var = null;
        }
        return e(kh70Var, plh0Var, false);
    }

    public final long i() {
        xg61 xg61Var = this.f128p.c;
        return !xg61Var.b ? k() : xg61Var.a.g;
    }

    public final long k() {
        long jC = bai0.c(this.f128p, this.E, this.F, this.a.f);
        this.E = jC;
        return jC;
    }

    public final int l() {
        if (this.f128p.j.p()) {
            return -1;
        }
        jbu0 jbu0Var = this.f128p;
        sqe1 sqe1Var = jbu0Var.j;
        int iJ = j(jbu0Var);
        jbu0 jbu0Var2 = this.f128p;
        int i = jbu0Var2.h;
        if (i == 1) {
            i = 0;
        }
        return sqe1Var.e(iJ, i, jbu0Var2.i);
    }

    public final o4t m(sqe1 sqe1Var, int i, long j) {
        if (sqe1Var.p()) {
            return null;
        }
        oqe1 oqe1Var = new oqe1();
        dqe1 dqe1Var = new dqe1();
        if (i == -1 || i >= sqe1Var.o()) {
            i = sqe1Var.a(this.f128p.i);
            j = zoi1.n0(sqe1Var.n(i, oqe1Var, 0L).l);
        }
        long jW = zoi1.W(j);
        dm5.q(i, sqe1Var.o());
        sqe1Var.m(i, oqe1Var);
        if (jW == -9223372036854775807L) {
            jW = oqe1Var.l;
            if (jW == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = oqe1Var.n;
        sqe1Var.f(i2, dqe1Var, false);
        while (i2 < oqe1Var.o && dqe1Var.e != jW) {
            int i3 = i2 + 1;
            if (sqe1Var.f(i3, dqe1Var, false).e > jW) {
                break;
            }
            i2 = i3;
        }
        sqe1Var.f(i2, dqe1Var, false);
        return new o4t(i2, jW - dqe1Var.e);
    }

    public final int n() {
        if (this.f128p.j.p()) {
            return -1;
        }
        jbu0 jbu0Var = this.f128p;
        sqe1 sqe1Var = jbu0Var.j;
        int iJ = j(jbu0Var);
        jbu0 jbu0Var2 = this.f128p;
        int i = jbu0Var2.h;
        if (i == 1) {
            i = 0;
        }
        return sqe1Var.k(iJ, i, jbu0Var2.i);
    }

    public final int o() {
        hi61 hi61Var = this.n;
        hi61Var.getClass();
        return hi61Var.a.c;
    }

    public final boolean p() {
        return this.C != null;
    }

    public final boolean q(int i) {
        if (this.y.a(i)) {
            return true;
        }
        td6.p(i, "Controller isn't allowed to call command= ");
        return false;
    }

    public final void v(int i, int i2, int i3) {
        int i4;
        int i5;
        sqe1 sqe1Var = this.f128p.j;
        int iO = sqe1Var.o();
        int iMin = Math.min(i2, iO);
        int i6 = iMin - i;
        int iMin2 = Math.min(i3, iO - i6);
        if (i >= iO || i == iMin || i == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < iO; i7++) {
            arrayList.add(sqe1Var.n(i7, new oqe1(), 0L));
        }
        zoi1.V(i, iMin, iMin2, arrayList);
        z(sqe1Var, arrayList, arrayList2);
        eqe1 eqe1VarD = d(arrayList, arrayList2);
        if (eqe1VarD.p()) {
            return;
        }
        int iJ = j(this.f128p);
        if (iJ >= i && iJ < iMin) {
            i5 = (iJ - i) + iMin2;
        } else {
            if (iMin > iJ || iMin2 <= iJ) {
                if (iMin <= iJ || iMin2 > iJ) {
                    i4 = iJ;
                } else {
                    i5 = iJ + i6;
                }
                oqe1 oqe1Var = new oqe1();
                int i8 = this.f128p.c.a.e - sqe1Var.n(iJ, oqe1Var, 0L).n;
                eqe1VarD.n(i4, oqe1Var, 0L);
                L(t(this.f128p, eqe1VarD, i4, oqe1Var.n + i8, k(), i(), 5), 0, null, null, null);
            }
            i5 = iJ - i6;
        }
        i4 = i5;
        oqe1 oqe1Var2 = new oqe1();
        int i9 = this.f128p.c.a.e - sqe1Var.n(iJ, oqe1Var2, 0L).n;
        eqe1VarD.n(i4, oqe1Var2, 0L);
        L(t(this.f128p, eqe1VarD, i4, oqe1Var2.n + i9, k(), i(), 5), 0, null, null, null);
    }

    public final void w(jbu0 jbu0Var, final jbu0 jbu0Var2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        final byte b = 0;
        h9d0 h9d0Var = this.i;
        if (num != null) {
            h9d0Var.c(0, new e9d0() { // from class: p.elh0
                public final void invoke(Object obj) {
                    byte b2 = b;
                    Integer num5 = num;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b2) {
                        case 0:
                            o8u0Var.C0(jbu0Var3.j, num5.intValue());
                            break;
                        case 1:
                            o8u0Var.j0(jbu0Var3.d, jbu0Var3.e, num5.intValue());
                            break;
                        default:
                            o8u0Var.g0(num5.intValue(), jbu0Var3.v);
                            break;
                    }
                }
            });
        }
        final byte b2 = 11;
        final byte b3 = 1;
        if (num3 != null) {
            h9d0Var.c(11, new e9d0() { // from class: p.elh0
                public final void invoke(Object obj) {
                    byte b4 = b3;
                    Integer num5 = num3;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b4) {
                        case 0:
                            o8u0Var.C0(jbu0Var3.j, num5.intValue());
                            break;
                        case 1:
                            o8u0Var.j0(jbu0Var3.d, jbu0Var3.e, num5.intValue());
                            break;
                        default:
                            o8u0Var.g0(num5.intValue(), jbu0Var3.v);
                            break;
                    }
                }
            });
        }
        yoh0 yoh0VarR = jbu0Var2.r();
        final byte b4 = 6;
        if (num4 != null) {
            h9d0Var.c(1, new x8a0(yoh0VarR, num4, b4));
        }
        PlaybackException playbackException = jbu0Var.a;
        PlaybackException playbackException2 = jbu0Var2.a;
        final byte b5 = 2;
        final byte b6 = 10;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.a(playbackException2))) {
            h9d0Var.c(10, new jfr(playbackException2, b3));
            if (playbackException2 != null) {
                h9d0Var.c(10, new jfr(playbackException2, b5));
            }
        }
        final byte b7 = 18;
        if (!jbu0Var.F.equals(jbu0Var2.F)) {
            h9d0Var.c(2, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b8 = b7;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b8) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b8 = 19;
        if (!jbu0Var.B.equals(jbu0Var2.B)) {
            h9d0Var.c(14, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b9 = b8;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b9) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b9 = 20;
        final byte b10 = 3;
        if (jbu0Var.y != jbu0Var2.y) {
            h9d0Var.c(3, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b11 = b9;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b11) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b11 = 21;
        final byte b12 = 4;
        if (jbu0Var.A != jbu0Var2.A) {
            h9d0Var.c(4, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b13 = b11;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b13) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b13 = 5;
        if (num2 != null) {
            h9d0Var.c(5, new e9d0() { // from class: p.elh0
                public final void invoke(Object obj) {
                    byte b14 = b5;
                    Integer num5 = num2;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b14) {
                        case 0:
                            o8u0Var.C0(jbu0Var3.j, num5.intValue());
                            break;
                        case 1:
                            o8u0Var.j0(jbu0Var3.d, jbu0Var3.e, num5.intValue());
                            break;
                        default:
                            o8u0Var.g0(num5.intValue(), jbu0Var3.v);
                            break;
                    }
                }
            });
        }
        if (jbu0Var.z != jbu0Var2.z) {
            h9d0Var.c(6, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b14 = b;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b14) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b14 = 7;
        if (jbu0Var.x != jbu0Var2.x) {
            h9d0Var.c(7, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b15 = b3;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b15) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b15 = 12;
        if (!jbu0Var.g.equals(jbu0Var2.g)) {
            h9d0Var.c(12, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b16 = b5;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b16) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b16 = 8;
        if (jbu0Var.h != jbu0Var2.h) {
            h9d0Var.c(8, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b17 = b10;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b17) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b17 = 9;
        if (jbu0Var.i != jbu0Var2.i) {
            h9d0Var.c(9, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b18 = b12;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b18) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b18 = 15;
        if (!jbu0Var.m.equals(jbu0Var2.m)) {
            h9d0Var.c(15, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b19 = b13;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b19) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        if (jbu0Var.n != jbu0Var2.n) {
            h9d0Var.c(22, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b19 = b4;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b19) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        if (!jbu0Var.q.equals(jbu0Var2.q)) {
            h9d0Var.c(20, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b19 = b14;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b19) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        if (jbu0Var.f78p != jbu0Var2.f78p) {
            h9d0Var.c(21, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b19 = b16;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b19) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        bg11 bg11Var = jbu0Var.r.a;
        bg11 bg11Var2 = jbu0Var2.r.a;
        bg11Var.getClass();
        if (!z1p1.j(bg11Var, bg11Var2)) {
            h9d0Var.c(27, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b19 = b17;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b19) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
            h9d0Var.c(27, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b19 = b6;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b19) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        if (!jbu0Var.s.equals(jbu0Var2.s)) {
            h9d0Var.c(29, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b19 = b2;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b19) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        if (jbu0Var.t != jbu0Var2.t || jbu0Var.u != jbu0Var2.u) {
            h9d0Var.c(30, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b19 = b15;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b19) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        if (!jbu0Var.l.equals(jbu0Var2.l)) {
            final byte b19 = 13;
            h9d0Var.c(25, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b110 = b19;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b110) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b20 = 16;
        if (jbu0Var.C != jbu0Var2.C) {
            final byte b21 = 14;
            h9d0Var.c(16, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b110 = b21;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b110) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        final byte b22 = 17;
        if (jbu0Var.D != jbu0Var2.D) {
            h9d0Var.c(17, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b110 = b18;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b110) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        if (jbu0Var.E != jbu0Var2.E) {
            h9d0Var.c(18, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b110 = b20;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b110) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        if (!jbu0Var.G.equals(jbu0Var2.G)) {
            h9d0Var.c(19, new e9d0() { // from class: p.flh0
                public final void invoke(Object obj) {
                    byte b110 = b22;
                    jbu0 jbu0Var3 = jbu0Var2;
                    o8u0 o8u0Var = (o8u0) obj;
                    switch (b110) {
                        case 0:
                            o8u0Var.w(jbu0Var3.z);
                            break;
                        case 1:
                            o8u0Var.E0(jbu0Var3.x);
                            break;
                        case 2:
                            o8u0Var.r0(jbu0Var3.g);
                            break;
                        case 3:
                            o8u0Var.onRepeatModeChanged(jbu0Var3.h);
                            break;
                        case 4:
                            o8u0Var.K(jbu0Var3.i);
                            break;
                        case 5:
                            o8u0Var.A(jbu0Var3.m);
                            break;
                        case 6:
                            o8u0Var.h0(jbu0Var3.n);
                            break;
                        case 7:
                            o8u0Var.Y(jbu0Var3.q);
                            break;
                        case 8:
                            o8u0Var.i(jbu0Var3.f78p);
                            break;
                        case 9:
                            o8u0Var.l(jbu0Var3.r.a);
                            break;
                        case 10:
                            o8u0Var.o(jbu0Var3.r);
                            break;
                        case 11:
                            o8u0Var.q0(jbu0Var3.s);
                            break;
                        case 12:
                            o8u0Var.O(jbu0Var3.t, jbu0Var3.u);
                            break;
                        case 13:
                            o8u0Var.b(jbu0Var3.l);
                            break;
                        case 14:
                            o8u0Var.P(jbu0Var3.C);
                            break;
                        case 15:
                            o8u0Var.t0(jbu0Var3.D);
                            break;
                        case 16:
                            o8u0Var.y0(jbu0Var3.E);
                            break;
                        case 17:
                            o8u0Var.B(jbu0Var3.G);
                            break;
                        case 18:
                            o8u0Var.C(jbu0Var3.F);
                            break;
                        case 19:
                            o8u0Var.n0(jbu0Var3.B);
                            break;
                        case 20:
                            o8u0Var.e0(jbu0Var3.y);
                            break;
                        default:
                            o8u0Var.H(jbu0Var3.A);
                            break;
                    }
                }
            });
        }
        h9d0Var.b();
    }

    public final void x(jbu0 jbu0Var, ebu0 ebu0Var) {
        jbu0 jbu0Var2;
        ebu0 ebu0Var2;
        if (p()) {
            boolean z = o() < 6;
            jbu0 jbu0Var3 = this.G;
            if (jbu0Var3 != null) {
                m8u0 m8u0Var = this.y;
                hi61 hi61Var = this.n;
                hi61Var.getClass();
                this.G = bai0.e(jbu0Var3, jbu0Var, ebu0Var, m8u0Var, z, hi61Var);
                if (!this.k.isEmpty()) {
                    return;
                }
                jbu0 jbu0Var4 = this.G;
                ebu0 ebu0Var3 = ebu0.c;
                this.G = null;
                jbu0Var2 = jbu0Var4;
                ebu0Var2 = ebu0Var3;
            } else {
                jbu0Var2 = jbu0Var;
                ebu0Var2 = ebu0Var;
            }
            jbu0 jbu0Var5 = this.f128p;
            m8u0 m8u0Var2 = this.y;
            hi61 hi61Var2 = this.n;
            hi61Var2.getClass();
            jbu0 jbu0VarE = bai0.e(jbu0Var5, jbu0Var2, ebu0Var2, m8u0Var2, z, hi61Var2);
            this.f128p = jbu0VarE;
            int i = jbu0VarE.f;
            sqe1 sqe1Var = jbu0VarE.j;
            p8u0 p8u0Var = jbu0VarE.e;
            Integer numValueOf = ((i == 1 || !(jbu0Var5.j.p() || sqe1Var.p())) && !(jbu0Var5.d.equals(jbu0VarE.d) && jbu0Var5.e.equals(p8u0Var))) ? Integer.valueOf(jbu0VarE.f) : null;
            boolean zEquals = Objects.equals(jbu0Var5.r(), jbu0VarE.r());
            Integer numValueOf2 = !zEquals ? Integer.valueOf(jbu0VarE.b) : null;
            if (zEquals && numValueOf != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 1)) {
                if (jbu0Var5.e.b != p8u0Var.b) {
                    numValueOf2 = Integer.valueOf(numValueOf.intValue() != 0 ? 2 : 1);
                } else if (jbu0Var5.h != 0 && numValueOf.intValue() == 0 && jbu0Var5.d.h == -1 && p8u0Var.h == -1) {
                    numValueOf2 = 0;
                }
            }
            Integer numValueOf3 = !jbu0Var5.j.equals(sqe1Var) ? Integer.valueOf(jbu0VarE.k) : null;
            int i2 = jbu0Var5.w;
            int i3 = jbu0VarE.w;
            w(jbu0Var5, jbu0VarE, numValueOf3, (i2 == i3 && jbu0Var5.v == jbu0VarE.v) ? null : Integer.valueOf(i3), numValueOf, numValueOf2);
        }
    }

    public final void y(int i, int i2) {
        l291 l291Var = this.B;
        if (l291Var.a == i && l291Var.b == i2) {
            return;
        }
        this.B = new l291(i, i2);
        this.i.h(24, new ko00((byte) 1, i, i2));
    }
}
