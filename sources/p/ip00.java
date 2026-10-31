package p;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import com.comscore.streaming.ContentMediaFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ip00 implements Handler.Callback, zqh0, n0g1, moj1 {
    public static final long G1 = zoi1.n0(10000);
    public ExoPlaybackException A1;
    public long B1;
    public co00 C1;
    public long D1;
    public boolean E1;
    public float F1;
    public final ArrayList N0;
    public final rdd1 O0;
    public final io00 P0;
    public final drh0 Q0;
    public final g3i0 R0;
    public final a6s S0;
    public final short T0;
    public final dbu0 U0;
    public final boolean V0;
    public final pfr W0;
    public final dqe1 X;
    public final wdd1 X0;
    public final long Y;
    public final boolean Y0;
    public final j7s Z;
    public final vu7 Z0;
    public final qd21[] a;
    public boolean a1;
    public final jca[] b;
    public on51 b1;
    public final boolean[] c;
    public zu41 c1;
    public final exs d;
    public boolean d1;
    public final o0g1 e;
    public boolean e1;
    public final h6s f;
    public hp00 f1;
    public final wdd1 g;
    public int g1;
    public final b8p1 h;
    public o0u0 h1;
    public final Looper i;
    public fp00 i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public long n1;
    public boolean o1;
    public int p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public final oqe1 t;
    public boolean t1;
    public int u1;
    public hp00 v1;
    public long w1;
    public long x1;
    public int y1;
    public boolean z1;

    /* JADX WARN: Type inference failed for: r9v5, types: [int, short] */
    public ip00(Context context, jca[] jcaVarArr, jca[] jcaVarArr2, exs exsVar, o0g1 o0g1Var, h6s h6sVar, o4a o4aVar, int i, boolean z, pfr pfrVar, on51 on51Var, a6s a6sVar, long j, boolean z2, Looper looper, rdd1 rdd1Var, io00 io00Var, dbu0 dbu0Var, final moj1 moj1Var, boolean z3) {
        Looper looper2;
        co00 co00Var = co00.a;
        this.D1 = -9223372036854775807L;
        this.P0 = io00Var;
        this.d = exsVar;
        this.e = o0g1Var;
        this.f = h6sVar;
        this.p1 = i;
        this.q1 = z;
        this.b1 = on51Var;
        this.S0 = a6sVar;
        this.T0 = (int) j;
        boolean z4 = false;
        this.k1 = false;
        this.V0 = z2;
        this.O0 = rdd1Var;
        this.U0 = dbu0Var;
        this.C1 = co00Var;
        this.W0 = pfrVar;
        this.F1 = 1.0f;
        this.c1 = zu41.g;
        this.a1 = z3;
        this.B1 = -9223372036854775807L;
        this.n1 = -9223372036854775807L;
        this.Y = h6sVar.o;
        cqe1 cqe1Var = sqe1.a;
        o0u0 o0u0VarK = o0u0.k(o0g1Var);
        this.h1 = o0u0VarK;
        this.i1 = new fp00(o0u0VarK, (byte) 0);
        this.b = new jca[jcaVarArr.length];
        this.c = new boolean[jcaVarArr.length];
        exsVar.getClass();
        this.a = new qd21[jcaVarArr.length];
        boolean z5 = false;
        for (int i2 = 0; i2 < jcaVarArr.length; i2++) {
            jcaVarArr[i2].r(i2, dbu0Var, rdd1Var);
            jca[] jcaVarArr3 = this.b;
            jca jcaVar = jcaVarArr[i2];
            jcaVar.getClass();
            jcaVarArr3[i2] = jcaVar;
            jca jcaVar2 = this.b[i2];
            synchronized (jcaVar2.a) {
                jcaVar2.S0 = exsVar;
            }
            jca jcaVar3 = jcaVarArr2[i2];
            if (jcaVar3 != null) {
                jcaVar3.r(i2, dbu0Var, rdd1Var);
                z5 = true;
            }
            this.a[i2] = new qd21(jcaVarArr[i2], jcaVarArr2[i2], i2);
        }
        this.Y0 = z5;
        j7s j7sVar = new j7s();
        j7sVar.d = this;
        j7sVar.c = new zab1(rdd1Var);
        j7sVar.a = true;
        this.Z = j7sVar;
        this.N0 = new ArrayList();
        this.t = new oqe1();
        this.X = new dqe1();
        dm5.y(exsVar.a == null);
        exsVar.a = this;
        exsVar.b = o4aVar;
        exsVar.g = exsVar.f;
        this.z1 = true;
        wdd1 wdd1VarA = rdd1Var.a(looper, (Handler.Callback) null);
        this.X0 = wdd1VarA;
        this.Q0 = new drh0(pfrVar, wdd1VarA, new nay(this, (byte) 10), jcaVarArr.length);
        this.R0 = new g3i0(this, pfrVar, wdd1VarA, dbu0Var, o4aVar);
        b8p1 b8p1Var = new b8p1((byte) 16);
        this.h = b8p1Var;
        synchronized (b8p1Var.c) {
            try {
                looper2 = (Looper) b8p1Var.d;
                if (looper2 == null) {
                    if (b8p1Var.b == 0 && ((HandlerThread) b8p1Var.e) == null) {
                        z4 = true;
                    }
                    dm5.y(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    b8p1Var.e = handlerThread;
                    handlerThread.start();
                    looper2 = ((HandlerThread) b8p1Var.e).getLooper();
                    b8p1Var.d = looper2;
                }
                b8p1Var.b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = looper2;
        wdd1 wdd1VarA2 = rdd1Var.a(looper2, this);
        this.g = wdd1VarA2;
        this.Z0 = new vu7(context, looper2, this);
        wdd1VarA2.c(35, new moj1() { // from class: p.ap00
            @Override // p.moj1
            public final void a(long j2, long j3, ie30 ie30Var, MediaFormat mediaFormat) {
                moj1Var.a(j2, j3, ie30Var, mediaFormat);
                this.a.a(j2, j3, ie30Var, mediaFormat);
            }
        }).b();
        wdd1VarA2.c(39, new bp00(this)).b();
    }

    public static boolean A(brh0 brh0Var) {
        if (brh0Var != null) {
            try {
                d8h0 d8h0Var = brh0Var.a;
                if (brh0Var.e) {
                    for (p641 p641Var : brh0Var.c) {
                        if (p641Var != null) {
                            p641Var.e();
                        }
                    }
                } else {
                    d8h0Var.q();
                }
                if ((!brh0Var.e ? 0L : d8h0Var.a()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static void T(sqe1 sqe1Var, ep00 ep00Var, oqe1 oqe1Var, dqe1 dqe1Var) {
        int i = sqe1Var.n(sqe1Var.g(ep00Var.d, dqe1Var).c, oqe1Var, 0L).o;
        Object obj = sqe1Var.f(i, dqe1Var, true).b;
        long j = dqe1Var.d;
        long j2 = j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE;
        ep00Var.b = i;
        ep00Var.c = j2;
        ep00Var.d = obj;
    }

    public static boolean U(ep00 ep00Var, sqe1 sqe1Var, sqe1 sqe1Var2, int i, boolean z, oqe1 oqe1Var, dqe1 dqe1Var) {
        Object obj = ep00Var.d;
        sbu0 sbu0Var = ep00Var.a;
        if (obj == null) {
            long j = sbu0Var.h;
            Pair pairW = W(sqe1Var, new hp00(sbu0Var.c, sbu0Var.g, j == Long.MIN_VALUE ? -9223372036854775807L : zoi1.W(j)), false, i, z, oqe1Var, dqe1Var);
            if (pairW == null) {
                return false;
            }
            int iB = sqe1Var.b(pairW.first);
            long jLongValue = ((Long) pairW.second).longValue();
            Object obj2 = pairW.first;
            ep00Var.b = iB;
            ep00Var.c = jLongValue;
            ep00Var.d = obj2;
            if (sbu0Var.h == Long.MIN_VALUE) {
                T(sqe1Var, ep00Var, oqe1Var, dqe1Var);
                return true;
            }
        } else {
            int iB2 = sqe1Var.b(obj);
            if (iB2 == -1) {
                return false;
            }
            if (sbu0Var.h == Long.MIN_VALUE) {
                T(sqe1Var, ep00Var, oqe1Var, dqe1Var);
                return true;
            }
            ep00Var.b = iB2;
            sqe1Var2.g(ep00Var.d, dqe1Var);
            if (dqe1Var.f && sqe1Var2.n(dqe1Var.c, oqe1Var, 0L).n == sqe1Var2.b(ep00Var.d)) {
                Pair pairI = sqe1Var.i(oqe1Var, dqe1Var, sqe1Var.g(ep00Var.d, dqe1Var).c, ep00Var.c + dqe1Var.e);
                int iB3 = sqe1Var.b(pairI.first);
                long jLongValue2 = ((Long) pairI.second).longValue();
                Object obj3 = pairI.first;
                ep00Var.b = iB3;
                ep00Var.c = jLongValue2;
                ep00Var.d = obj3;
            }
        }
        return true;
    }

    public static Pair W(sqe1 sqe1Var, hp00 hp00Var, boolean z, int i, boolean z2, oqe1 oqe1Var, dqe1 dqe1Var) {
        int iX;
        sqe1 sqe1Var2 = hp00Var.a;
        if (sqe1Var.p()) {
            return null;
        }
        sqe1 sqe1Var3 = sqe1Var2.p() ? sqe1Var : sqe1Var2;
        try {
            Pair pairI = sqe1Var3.i(oqe1Var, dqe1Var, hp00Var.b, hp00Var.c);
            if (!sqe1Var.equals(sqe1Var3)) {
                if (sqe1Var.b(pairI.first) == -1) {
                    if (!z || (iX = X(oqe1Var, dqe1Var, i, z2, pairI.first, sqe1Var3, sqe1Var)) == -1) {
                        return null;
                    }
                    return sqe1Var.i(oqe1Var, dqe1Var, iX, -9223372036854775807L);
                }
                if (sqe1Var3.g(pairI.first, dqe1Var).f && sqe1Var3.n(dqe1Var.c, oqe1Var, 0L).n == sqe1Var3.b(pairI.first)) {
                    return sqe1Var.i(oqe1Var, dqe1Var, sqe1Var.g(pairI.first, dqe1Var).c, hp00Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int X(oqe1 oqe1Var, dqe1 dqe1Var, int i, boolean z, Object obj, sqe1 sqe1Var, sqe1 sqe1Var2) {
        sqe1 sqe1Var3 = sqe1Var;
        Object obj2 = sqe1Var3.n(sqe1Var3.g(obj, dqe1Var).c, oqe1Var, 0L).a;
        for (int i2 = 0; i2 < sqe1Var2.o(); i2++) {
            if (sqe1Var2.n(i2, oqe1Var, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = sqe1Var3.b(obj);
        int iH = sqe1Var3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            sqe1 sqe1Var4 = sqe1Var3;
            int iD = sqe1Var4.d(iB, dqe1Var, oqe1Var, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = sqe1Var2.b(sqe1Var4.l(iD));
            i3++;
            sqe1Var3 = sqe1Var4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return sqe1Var2.f(iB2, dqe1Var, false).c;
    }

    public static void g(sbu0 sbu0Var) {
        boolean z;
        synchronized (sbu0Var) {
            z = sbu0Var.k;
        }
        if (z) {
            return;
        }
        try {
            sbu0Var.a.b(sbu0Var.d, sbu0Var.e);
        } finally {
            sbu0Var.a(true);
        }
    }

    public final void A0(boolean z, boolean z2) {
        Q(z || !this.r1, false, true, false);
        this.i1.e(z2 ? 1 : 0);
        this.f.f(this.U0);
        this.Z0.c(1, this.h1.l);
        t0(1);
    }

    public final boolean B() {
        for (int i = 0; i < this.a.length; i++) {
            drh0 drh0Var = this.Q0;
            if (drh0Var.i != drh0Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void B0() {
        j7s j7sVar = this.Z;
        j7sVar.b = false;
        zab1 zab1Var = (zab1) j7sVar.c;
        if (zab1Var.b) {
            zab1Var.a(zab1Var.p());
            zab1Var.b = false;
        }
        for (qd21 qd21Var : this.a) {
            jca jcaVar = qd21Var.c;
            jca jcaVar2 = qd21Var.a;
            if (qd21.j(jcaVar2) && jcaVar2.k() == 2) {
                jcaVar2.Q();
            }
            if (jcaVar != null && qd21.j(jcaVar) && jcaVar.k() == 2) {
                jcaVar.Q();
            }
        }
    }

    public final boolean C(int i, p2i0 p2i0Var) {
        drh0 drh0Var = this.Q0;
        brh0 brh0Var = drh0Var.k[i];
        if (brh0Var == null || !brh0Var.g.a.equals(p2i0Var)) {
            return false;
        }
        return this.a[i].g(drh0Var.k[i]);
    }

    public final void C0() {
        brh0 brh0Var = this.Q0.l;
        boolean z = this.o1 || (brh0Var != null && brh0Var.a.b());
        o0u0 o0u0Var = this.h1;
        if (z != o0u0Var.g) {
            this.h1 = o0u0Var.b(z);
        }
    }

    public final boolean D() {
        brh0 brh0Var = this.Q0.i;
        long j = brh0Var.g.e;
        if (brh0Var.e) {
            return j == -9223372036854775807L || this.h1.s < j || !x0();
        }
        return false;
    }

    public final void D0(p2i0 p2i0Var, qnf1 qnf1Var, o0g1 o0g1Var) {
        drh0 drh0Var = this.Q0;
        brh0 brh0Var = drh0Var.l;
        brh0Var.getClass();
        brh0 brh0Var2 = drh0Var.i;
        long j = this.w1;
        long j2 = brh0Var.f17p;
        if (brh0Var != brh0Var2) {
            j -= j2;
            j2 = brh0Var.g.b;
        }
        long j3 = j - j2;
        long jQ = q(brh0Var.d());
        long j4 = y0(this.h1.a, brh0Var.g.a) ? this.S0.h : -9223372036854775807L;
        sqe1 sqe1Var = this.h1.a;
        float f = this.Z.l().a;
        boolean z = this.h1.l;
        this.f.g(new x1e0(this.U0, sqe1Var, p2i0Var, j3, jQ, f, this.m1, j4), qnf1Var, (qp00[]) o0g1Var.d);
    }

    public final void E() {
        boolean zI;
        if (A(this.Q0.l)) {
            brh0 brh0Var = this.Q0.l;
            long jQ = q(!brh0Var.e ? 0L : brh0Var.a.a());
            brh0 brh0Var2 = this.Q0.i;
            long j = this.w1;
            long j2 = brh0Var.f17p;
            if (brh0Var != brh0Var2) {
                j -= j2;
                j2 = brh0Var.g.b;
            }
            long j3 = j - j2;
            long j4 = y0(this.h1.a, brh0Var.g.a) ? this.S0.h : -9223372036854775807L;
            dbu0 dbu0Var = this.U0;
            sqe1 sqe1Var = this.h1.a;
            p2i0 p2i0Var = brh0Var.g.a;
            float f = this.Z.l().a;
            boolean z = this.h1.l;
            x1e0 x1e0Var = new x1e0(dbu0Var, sqe1Var, p2i0Var, j3, jQ, f, this.m1, j4);
            zI = this.f.i(x1e0Var);
            brh0 brh0Var3 = this.Q0.i;
            if (!zI && brh0Var3.e && jQ < 500000 && this.Y > 0) {
                brh0Var3.a.r(this.h1.s);
                zI = this.f.i(x1e0Var);
            }
        } else {
            zI = false;
        }
        this.o1 = zI;
        if (zI) {
            brh0 brh0Var4 = this.Q0.l;
            brh0Var4.getClass();
            gae0 gae0Var = new gae0();
            gae0Var.a = this.w1 - brh0Var4.f17p;
            float f2 = this.Z.l().a;
            dm5.m(f2 > 0.0f || f2 == -3.4028235E38f);
            gae0Var.b = f2;
            long j5 = this.n1;
            dm5.m(j5 >= 0 || j5 == -9223372036854775807L);
            gae0Var.c = j5;
            hae0 hae0Var = new hae0(gae0Var);
            dm5.y(brh0Var4.m == null);
            brh0Var4.a.i(hae0Var);
        }
        C0();
    }

    public final void E0(int i, int i2, List list) throws Throwable {
        this.i1.e(1);
        g3i0 g3i0Var = this.R0;
        g3i0Var.getClass();
        ArrayList arrayList = g3i0Var.c;
        dm5.m(i >= 0 && i <= i2 && i2 <= arrayList.size());
        dm5.m(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((f3i0) arrayList.get(i3)).a.z((yoh0) list.get(i3 - i));
        }
        w(g3i0Var.b(), false);
    }

    public final void F() {
        drh0 drh0Var = this.Q0;
        drh0Var.q();
        brh0 brh0Var = drh0Var.m;
        if (brh0Var != null) {
            d8h0 d8h0Var = brh0Var.a;
            if ((!brh0Var.d || brh0Var.e) && !d8h0Var.b()) {
                sqe1 sqe1Var = this.h1.a;
                if (brh0Var.e) {
                    d8h0Var.x();
                }
                Iterator it = this.f.q.values().iterator();
                while (it.hasNext()) {
                    if (((g6s) it.next()).b) {
                        return;
                    }
                }
                if (!brh0Var.d) {
                    long j = brh0Var.g.b;
                    brh0Var.d = true;
                    d8h0Var.v(this, j);
                    return;
                }
                gae0 gae0Var = new gae0();
                gae0Var.a = this.w1 - brh0Var.f17p;
                float f = this.Z.l().a;
                dm5.m(f > 0.0f || f == -3.4028235E38f);
                gae0Var.b = f;
                long j2 = this.n1;
                dm5.m(j2 >= 0 || j2 == -9223372036854775807L);
                gae0Var.c = j2;
                hae0 hae0Var = new hae0(gae0Var);
                dm5.y(brh0Var.m == null);
                d8h0Var.i(hae0Var);
            }
        }
    }

    public final void F0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.d1;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        o0u0 o0u0Var = this.h1;
        if (o0u0Var.l == z2 && o0u0Var.n == i2 && o0u0Var.m == i3) {
            return;
        }
        this.h1 = o0u0Var.e(i3, i2, z2);
        I0(false, false);
        drh0 drh0Var = this.Q0;
        for (brh0 brh0Var = drh0Var.i; brh0Var != null; brh0Var = brh0Var.m) {
            for (qp00 qp00Var : (qp00[]) brh0Var.o.d) {
                if (qp00Var != null) {
                    qp00Var.o(z2);
                }
            }
        }
        if (!x0()) {
            B0();
            G0();
            o0u0 o0u0Var2 = this.h1;
            if (o0u0Var2.f105p) {
                this.h1 = o0u0Var2.i(false);
            }
            drh0Var.s(this.w1);
            return;
        }
        int i4 = this.h1.e;
        wdd1 wdd1Var = this.g;
        if (i4 != 3) {
            if (i4 == 2) {
                wdd1Var.j(2);
            }
        } else {
            j7s j7sVar = this.Z;
            j7sVar.b = true;
            ((zab1) j7sVar.c).b();
            z0();
            wdd1Var.j(2);
        }
    }

    public final void G(int i) {
        fp00 fp00Var = this.i1;
        o0u0 o0u0Var = this.h1;
        boolean z = fp00Var.d | (((o0u0) fp00Var.f) != o0u0Var);
        fp00Var.d = z;
        fp00Var.f = o0u0Var;
        if (z) {
            if (!o0u0Var.a.p()) {
                o0u0 o0u0Var2 = this.h1;
                boolean z2 = o0u0Var2.a.b(o0u0Var2.b.a) != -1;
                Locale locale = Locale.US;
                o0u0 o0u0Var3 = this.h1;
                dm5.z(z2, String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", o0u0Var3.b.a, o0u0Var3.a.getClass().getName(), Integer.valueOf(this.h1.a.o()), Integer.valueOf(i)));
            }
            fp00 fp00Var2 = this.i1;
            yo00 yo00Var = this.P0.b;
            yo00Var.j.f(new e0i((Object) yo00Var, (Object) fp00Var2, (byte) 26));
            this.i1 = new fp00(this.h1, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    public final void G0() {
        long j;
        boolean z;
        k2u0 k2u0VarL;
        long j2;
        float f;
        long jK;
        brh0 brh0Var = this.Q0.i;
        if (brh0Var == null) {
            return;
        }
        long j3 = -9223372036854775807L;
        long jG = brh0Var.e ? brh0Var.a.g() : -9223372036854775807L;
        if (jG != -9223372036854775807L) {
            if (!brh0Var.i()) {
                this.Q0.t(brh0Var);
                h();
                v(false);
                E();
            }
            S(jG, true);
            if (jG != this.h1.s) {
                o0u0 o0u0Var = this.h1;
                this.h1 = z(o0u0Var.b, jG, o0u0Var.c, jG, true, 5);
            }
            j = -9223372036854775807L;
        } else {
            j7s j7sVar = this.Z;
            boolean zB = B();
            zab1 zab1Var = (zab1) j7sVar.c;
            jca jcaVar = (jca) j7sVar.e;
            if (jcaVar == null || jcaVar.t() || ((zB && ((jca) j7sVar.e).h != 2) || (!((jca) j7sVar.e).v() && (zB || ((jca) j7sVar.e).q())))) {
                j7sVar.a = true;
                if (j7sVar.b) {
                    zab1Var.b();
                }
            } else {
                wjh0 wjh0Var = (wjh0) j7sVar.f;
                wjh0Var.getClass();
                long jP = wjh0Var.p();
                if (!j7sVar.a) {
                    zab1Var.a(jP);
                    k2u0VarL = wjh0Var.l();
                    if (!k2u0VarL.equals(zab1Var.e)) {
                        zab1Var.m(k2u0VarL);
                        ((ip00) j7sVar.d).g.c(16, k2u0VarL).b();
                    }
                } else if (jP >= zab1Var.p()) {
                    j7sVar.a = false;
                    if (j7sVar.b) {
                        zab1Var.b();
                    }
                    zab1Var.a(jP);
                    k2u0VarL = wjh0Var.l();
                    if (!k2u0VarL.equals(zab1Var.e)) {
                        zab1Var.m(k2u0VarL);
                        ((ip00) j7sVar.d).g.c(16, k2u0VarL).b();
                    }
                } else if (zab1Var.b) {
                    zab1Var.a(zab1Var.p());
                    zab1Var.b = false;
                }
            }
            long jP2 = j7sVar.p();
            this.w1 = jP2;
            long j4 = jP2 - brh0Var.f17p;
            long j5 = this.h1.s;
            ArrayList arrayList = this.N0;
            if (arrayList.isEmpty() || this.h1.b.c()) {
                j = -9223372036854775807L;
            } else {
                if (this.z1) {
                    j5--;
                    this.z1 = false;
                }
                o0u0 o0u0Var2 = this.h1;
                int iB = o0u0Var2.a.b(o0u0Var2.b.a);
                int iMin = Math.min(this.y1, arrayList.size());
                ep00 ep00Var = iMin > 0 ? (ep00) arrayList.get(iMin - 1) : null;
                while (ep00Var != null) {
                    int i = ep00Var.b;
                    if (i <= iB && (i != iB || ep00Var.c <= j5)) {
                        break;
                    }
                    int i2 = iMin - 1;
                    ep00Var = i2 > 0 ? (ep00) arrayList.get(iMin - 2) : null;
                    iMin = i2;
                }
                ep00 ep00Var2 = iMin < arrayList.size() ? (ep00) arrayList.get(iMin) : null;
                while (true) {
                    if (ep00Var2 != null && ep00Var2.d != null) {
                        int i3 = ep00Var2.b;
                        if (i3 < iB) {
                            j = j3;
                        } else if (i3 == iB) {
                            j = j3;
                            if (ep00Var2.c > j5) {
                                break;
                            }
                        }
                        iMin++;
                        ep00Var2 = iMin < arrayList.size() ? (ep00) arrayList.get(iMin) : null;
                        j3 = j;
                    }
                    j = j3;
                    break;
                }
                while (ep00Var2 != null) {
                    sbu0 sbu0Var = ep00Var2.a;
                    if (ep00Var2.d == null || ep00Var2.b != iB) {
                        break;
                    }
                    long j6 = ep00Var2.c;
                    if (j6 <= j5 || j6 > j4) {
                        break;
                    }
                    try {
                        d0(sbu0Var);
                        if (sbu0Var.i) {
                            arrayList.remove(iMin);
                        } else {
                            synchronized (sbu0Var) {
                                z = sbu0Var.k;
                            }
                            if (z) {
                                arrayList.remove(iMin);
                            } else {
                                iMin++;
                            }
                        }
                        ep00Var2 = iMin < arrayList.size() ? (ep00) arrayList.get(iMin) : null;
                    } catch (Throwable th) {
                        if (sbu0Var.i) {
                            arrayList.remove(iMin);
                        } else {
                            synchronized (sbu0Var) {
                                if (sbu0Var.k) {
                                    arrayList.remove(iMin);
                                }
                            }
                        }
                        throw th;
                    }
                }
                this.y1 = iMin;
            }
            if (this.Z.n()) {
                boolean z2 = !this.i1.e;
                o0u0 o0u0Var3 = this.h1;
                this.h1 = z(o0u0Var3.b, j4, o0u0Var3.c, j4, z2, 6);
            } else {
                o0u0 o0u0Var4 = this.h1;
                o0u0Var4.s = j4;
                o0u0Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.h1.q = this.Q0.l.d();
        o0u0 o0u0Var5 = this.h1;
        o0u0Var5.r = q(o0u0Var5.q);
        o0u0 o0u0Var6 = this.h1;
        if (o0u0Var6.l && o0u0Var6.e == 3 && y0(o0u0Var6.a, o0u0Var6.b)) {
            o0u0 o0u0Var7 = this.h1;
            float fI = 1.0f;
            if (o0u0Var7.o.a == 1.0f) {
                a6s a6sVar = this.S0;
                long jN = n(o0u0Var7.a, o0u0Var7.b.a, o0u0Var7.s);
                long j7 = this.h1.r;
                if (a6sVar.c != j) {
                    long j8 = jN - j7;
                    long j9 = a6sVar.m;
                    if (j9 == j) {
                        a6sVar.m = j8;
                        a6sVar.n = 0L;
                    } else {
                        long jMax = Math.max(j8, (long) ((j8 * 9.999871E-4f) + (j9 * 0.999f)));
                        a6sVar.m = jMax;
                        a6sVar.n = (long) ((9.999871E-4f * Math.abs(j8 - jMax)) + (a6sVar.n * 0.999f));
                    }
                    if (a6sVar.l != j) {
                        j2 = 1000;
                        if (SystemClock.elapsedRealtime() - a6sVar.l < 1000) {
                            fI = a6sVar.k;
                        }
                    } else {
                        j2 = 1000;
                    }
                    a6sVar.l = SystemClock.elapsedRealtime();
                    long j10 = (a6sVar.n * 3) + a6sVar.m;
                    if (a6sVar.h > j10) {
                        float fW = zoi1.W(j2);
                        f = 1.0E-7f;
                        long[] jArr = {j10, a6sVar.e, a6sVar.h - (((long) ((a6sVar.k - 1.0f) * fW)) + ((long) ((a6sVar.i - 1.0f) * fW)))};
                        jK = jArr[0];
                        for (int i4 = 1; i4 < 3; i4++) {
                            long j11 = jArr[i4];
                            if (j11 > jK) {
                                jK = j11;
                            }
                        }
                        a6sVar.h = jK;
                    } else {
                        f = 1.0E-7f;
                        jK = zoi1.k(jN - ((long) (Math.max(0.0f, a6sVar.k - 1.0f) / 1.0E-7f)), a6sVar.h, j10);
                        a6sVar.h = jK;
                        long j12 = a6sVar.g;
                        if (j12 != j && jK > j12) {
                            a6sVar.h = j12;
                            jK = j12;
                        }
                    }
                    long j13 = jN - jK;
                    if (Math.abs(j13) < a6sVar.a) {
                        a6sVar.k = 1.0f;
                    } else {
                        fI = zoi1.i((f * j13) + 1.0f, a6sVar.j, a6sVar.i);
                        a6sVar.k = fI;
                    }
                }
                if (this.Z.l().a != fI) {
                    k2u0 k2u0VarB = this.h1.o.b(fI);
                    this.g.i(16);
                    this.Z.m(k2u0VarB);
                    y(this.h1.o, this.Z.l().a, false, false);
                }
            }
        }
    }

    public final void H(int i) {
        qd21 qd21Var = this.a[i];
        try {
            brh0 brh0Var = this.Q0.i;
            brh0Var.getClass();
            jca jcaVarC = qd21Var.c(brh0Var);
            jcaVarC.getClass();
            jcaVarC.w();
        } catch (IOException | RuntimeException e) {
            byte b = qd21Var.a.b;
            if (b != 3 && b != 5) {
                throw e;
            }
            o0g1 o0g1Var = this.Q0.i.o;
            oon1.w("Disabling track due to error: ".concat(ie30.e(((qp00[]) o0g1Var.d)[i].s())), e);
            o0g1 o0g1Var2 = new o0g1((ld21[]) ((ld21[]) o0g1Var.c).clone(), (qp00[]) ((qp00[]) o0g1Var.d).clone(), (o3g1) o0g1Var.e, o0g1Var.f);
            ((ld21[]) o0g1Var2.c)[i] = null;
            ((qp00[]) o0g1Var2.d)[i] = null;
            i(i);
            brh0 brh0Var2 = this.Q0.i;
            brh0Var2.a(o0g1Var2, this.h1.s, false, new boolean[brh0Var2.j.length]);
        }
    }

    public final void H0(sqe1 sqe1Var, p2i0 p2i0Var, sqe1 sqe1Var2, p2i0 p2i0Var2, long j, boolean z) {
        boolean zY0 = y0(sqe1Var, p2i0Var);
        Object obj = p2i0Var.a;
        if (!zY0) {
            k2u0 k2u0Var = p2i0Var.c() ? k2u0.d : this.h1.o;
            j7s j7sVar = this.Z;
            if (j7sVar.l().equals(k2u0Var)) {
                return;
            }
            this.g.i(16);
            j7sVar.m(k2u0Var);
            y(this.h1.o, k2u0Var.a, false, false);
            return;
        }
        dqe1 dqe1Var = this.X;
        int i = sqe1Var.g(obj, dqe1Var).c;
        oqe1 oqe1Var = this.t;
        sqe1Var.m(i, oqe1Var);
        roh0 roh0Var = oqe1Var.j;
        String str = zoi1.a;
        a6s a6sVar = this.S0;
        a6sVar.getClass();
        a6sVar.c = zoi1.W(roh0Var.a);
        a6sVar.f = zoi1.W(roh0Var.b);
        a6sVar.g = zoi1.W(roh0Var.c);
        float f = roh0Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        a6sVar.j = f;
        float f2 = roh0Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        a6sVar.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            a6sVar.c = -9223372036854775807L;
        }
        a6sVar.a();
        if (j != -9223372036854775807L) {
            a6sVar.d = n(sqe1Var, obj, j);
            a6sVar.a();
            return;
        }
        if (!Objects.equals(!sqe1Var2.p() ? sqe1Var2.n(sqe1Var2.g(p2i0Var2.a, dqe1Var).c, oqe1Var, 0L).a : null, oqe1Var.a) || z) {
            a6sVar.d = -9223372036854775807L;
            a6sVar.a();
        }
    }

    public final void I(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.X0.f(new xu7(this, i, z));
        }
    }

    public final void I0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.m1 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.O0.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.n1 = jElapsedRealtime;
    }

    public final void J() throws Throwable {
        w(this.R0.b(), true);
    }

    public final void K(dp00 dp00Var) throws Throwable {
        sqe1 sqe1VarB;
        this.i1.e(1);
        int i = dp00Var.a;
        int i2 = dp00Var.b;
        int i3 = dp00Var.c;
        ef81 ef81Var = dp00Var.d;
        g3i0 g3i0Var = this.R0;
        ArrayList arrayList = g3i0Var.c;
        dm5.m(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        g3i0Var.k = ef81Var;
        if (i == i2 || i == i3) {
            sqe1VarB = g3i0Var.b();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iO = ((f3i0) arrayList.get(iMin)).d;
            zoi1.V(i, i2, i3, arrayList);
            while (iMin <= iMax) {
                f3i0 f3i0Var = (f3i0) arrayList.get(iMin);
                f3i0Var.d = iO;
                iO += f3i0Var.a.O0.e.o();
                iMin++;
            }
            sqe1VarB = g3i0Var.b();
        }
        w(sqe1VarB, false);
    }

    public final void L() {
        this.i1.e(1);
        Q(false, false, false, true);
        this.f.d(this.U0);
        t0(this.h1.a.p() ? 4 : 2);
        o0u0 o0u0Var = this.h1;
        boolean z = o0u0Var.l;
        F0(this.Z0.c(o0u0Var.e, z), o0u0Var.n, o0u0Var.m, z);
        g3i0 g3i0Var = this.R0;
        ArrayList arrayList = g3i0Var.c;
        dm5.y(!g3i0Var.l);
        for (int i = 0; i < arrayList.size(); i++) {
            f3i0 f3i0Var = (f3i0) arrayList.get(i);
            g3i0Var.e(f3i0Var);
            g3i0Var.h.add(f3i0Var);
        }
        g3i0Var.l = true;
        this.g.j(2);
    }

    public final void M(hsk hskVar) {
        b8p1 b8p1Var = this.h;
        wdd1 wdd1Var = this.g;
        try {
            Q(true, false, true, false);
            N();
            this.f.e(this.U0);
            vu7 vu7Var = this.Z0;
            vu7Var.c = null;
            vu7Var.a();
            vu7Var.b(0);
            this.d.k();
            t0(1);
        } finally {
            wdd1Var.h();
            b8p1Var.v();
            hskVar.f();
        }
    }

    public final void N() {
        for (int i = 0; i < this.a.length; i++) {
            jca jcaVar = this.b[i];
            synchronized (jcaVar.a) {
                jcaVar.S0 = null;
            }
            qd21 qd21Var = this.a[i];
            qd21Var.a.H();
            qd21Var.e = false;
            jca jcaVar2 = qd21Var.c;
            if (jcaVar2 != null) {
                jcaVar2.H();
                qd21Var.f = false;
            }
        }
    }

    public final void O(int i, int i2, ef81 ef81Var) throws Throwable {
        this.i1.e(1);
        g3i0 g3i0Var = this.R0;
        g3i0Var.getClass();
        dm5.m(i >= 0 && i <= i2 && i2 <= g3i0Var.c.size());
        g3i0Var.k = ef81Var;
        g3i0Var.f(i, i2);
        w(g3i0Var.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[ORIG_RETURN, RETURN] */
    public final void P() {
        int i;
        int i2;
        float f = this.Z.l().a;
        drh0 drh0Var = this.Q0;
        brh0 brh0Var = drh0Var.i;
        brh0 brh0VarG = drh0Var.g();
        o0g1 o0g1Var = null;
        brh0 brh0Var2 = brh0Var;
        boolean z = true;
        while (brh0Var2 != null && brh0Var2.e) {
            o0u0 o0u0Var = this.h1;
            o0g1 o0g1VarL = brh0Var2.l(f, o0u0Var.a, o0u0Var.l);
            o0g1 o0g1Var2 = brh0Var2 == this.Q0.i ? o0g1VarL : o0g1Var;
            o0g1 o0g1Var3 = brh0Var2.o;
            qp00[] qp00VarArr = (qp00[]) o0g1VarL.d;
            boolean z2 = false;
            if (((qp00[]) o0g1Var3.d).length == qp00VarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= qp00VarArr.length) {
                        o0g1 o0g1Var4 = o0g1Var2;
                        if (brh0Var2 == brh0VarG) {
                            z = false;
                        }
                        brh0Var2 = brh0Var2.m;
                        o0g1Var = o0g1Var4;
                    } else if (o0g1VarL.n(o0g1Var3, i3)) {
                        i3++;
                        o0g1Var2 = o0g1Var2;
                        o0g1VarL = o0g1VarL;
                    }
                }
            }
            drh0 drh0Var2 = this.Q0;
            if (!z) {
                i = 4;
                drh0Var2.t(brh0Var2);
                if (brh0Var2.e) {
                    long jMax = Math.max(brh0Var2.g.b, this.w1 - brh0Var2.f17p);
                    if (this.Y0) {
                        int i4 = 0;
                        while (true) {
                            qd21[] qd21VarArr = this.a;
                            if (i4 >= qd21VarArr.length) {
                                break;
                            }
                            if (this.Q0.k[i4] == brh0Var2 && qd21VarArr[i4].g(brh0Var2)) {
                                h();
                                break;
                            }
                            i4++;
                        }
                    }
                    i2 = 4;
                    brh0Var2.a(o0g1VarL, jMax, false, new boolean[brh0Var2.j.length]);
                }
                v(true);
                if (this.h1.e != i2) {
                    E();
                    G0();
                    this.g.j(2);
                    return;
                }
                return;
            }
            brh0 brh0Var3 = drh0Var2.i;
            boolean z3 = (drh0Var2.t(brh0Var3) & 1) != 0;
            boolean[] zArr = new boolean[this.a.length];
            o0g1Var2.getClass();
            long jA = brh0Var3.a(o0g1Var2, this.h1.s, z3, zArr);
            o0u0 o0u0Var2 = this.h1;
            if (o0u0Var2.e != 4 && jA != o0u0Var2.s) {
                z2 = true;
            }
            o0u0 o0u0Var3 = this.h1;
            i = 4;
            this.h1 = z(o0u0Var3.b, jA, o0u0Var3.c, o0u0Var3.d, z2, 5);
            if (z2) {
                S(jA, true);
            }
            h();
            boolean[] zArr2 = new boolean[this.a.length];
            int i5 = 0;
            while (true) {
                qd21[] qd21VarArr2 = this.a;
                if (i5 >= qd21VarArr2.length) {
                    break;
                }
                int iB = qd21VarArr2[i5].b();
                zArr2[i5] = this.a[i5].i();
                qd21 qd21Var = this.a[i5];
                p641 p641Var = brh0Var3.c[i5];
                j7s j7sVar = this.Z;
                long j = this.w1;
                boolean z4 = zArr[i5];
                jca jcaVar = qd21Var.a;
                if (qd21.j(jcaVar)) {
                    if (p641Var != jcaVar.o()) {
                        qd21Var.a(jcaVar, j7sVar);
                    } else if (z4) {
                        jcaVar.L(j, true);
                    }
                }
                jca jcaVar2 = qd21Var.c;
                if (jcaVar2 != null && qd21.j(jcaVar2)) {
                    if (p641Var != jcaVar2.o()) {
                        qd21Var.a(jcaVar2, j7sVar);
                    } else if (z4) {
                        jcaVar2.L(j, true);
                    }
                }
                if (iB - this.a[i5].b() > 0) {
                    I(i5, false);
                }
                this.u1 -= iB - this.a[i5].b();
                i5++;
            }
            m(this.w1, zArr2);
            f0(brh0Var3);
            i2 = i;
            v(true);
            if (this.h1.e != i2) {
                E();
                G0();
                this.g.j(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    public final void Q(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        sqe1 uwu0Var;
        bg11 bg11Var;
        this.g.i(2);
        this.e1 = false;
        if (this.f1 != null) {
            this.i1.e(1);
            this.f1 = null;
        }
        this.A1 = null;
        I0(false, true);
        j7s j7sVar = this.Z;
        j7sVar.b = false;
        zab1 zab1Var = (zab1) j7sVar.c;
        if (zab1Var.b) {
            zab1Var.a(zab1Var.p());
            zab1Var.b = false;
        }
        this.w1 = 1000000000000L;
        for (int i = 0; i < this.a.length; i++) {
            try {
                i(i);
            } catch (ExoPlaybackException e) {
                e = e;
                oon1.w("Disable failed.", e);
            } catch (RuntimeException e2) {
                e = e2;
                oon1.w("Disable failed.", e);
            }
        }
        this.D1 = -9223372036854775807L;
        if (z) {
            for (qd21 qd21Var : this.a) {
                try {
                    qd21Var.m();
                } catch (RuntimeException e3) {
                    oon1.w("Reset failed.", e3);
                }
            }
        }
        this.u1 = 0;
        o0u0 o0u0Var = this.h1;
        p2i0 p2i0Var = o0u0Var.b;
        long j4 = o0u0Var.s;
        if (this.h1.b.c()) {
            j = this.h1.c;
        } else {
            o0u0 o0u0Var2 = this.h1;
            dqe1 dqe1Var = this.X;
            p2i0 p2i0Var2 = o0u0Var2.b;
            sqe1 sqe1Var = o0u0Var2.a;
            if (sqe1Var.p() || sqe1Var.g(p2i0Var2.a, dqe1Var).f) {
                j = this.h1.c;
            } else {
                j = this.h1.s;
            }
        }
        if (z2) {
            this.v1 = null;
            Pair pairO = o(this.h1.a);
            p2i0Var = (p2i0) pairO.first;
            long jLongValue = ((Long) pairO.second).longValue();
            z5 = p2i0Var.equals(this.h1.b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            long j5 = j;
            j2 = j4;
            j3 = j5;
            z5 = false;
        }
        this.Q0.b();
        this.o1 = false;
        sqe1 sqe1Var2 = this.h1.a;
        if (z3 && (sqe1Var2 instanceof uwu0)) {
            uwu0 uwu0Var2 = (uwu0) sqe1Var2;
            ef81 ef81Var = this.R0.k;
            sqe1[] sqe1VarArr = uwu0Var2.k;
            sqe1[] sqe1VarArr2 = new sqe1[sqe1VarArr.length];
            for (int i2 = 0; i2 < sqe1VarArr.length; i2++) {
                sqe1VarArr2[i2] = new twu0(sqe1VarArr[i2]);
            }
            uwu0Var = new uwu0(sqe1VarArr2, uwu0Var2.l, ef81Var);
            if (p2i0Var.b != -1) {
                uwu0Var.g(p2i0Var.a, this.X);
                int i3 = this.X.c;
                oqe1 oqe1Var = this.t;
                uwu0Var.n(i3, oqe1Var, 0L);
                if (oqe1Var.c()) {
                    p2i0Var = new p2i0(p2i0Var.d, p2i0Var.a);
                }
            }
        } else {
            uwu0Var = sqe1Var2;
        }
        o0u0 o0u0Var3 = this.h1;
        int i4 = o0u0Var3.e;
        ExoPlaybackException exoPlaybackException = z4 ? null : o0u0Var3.f;
        qnf1 qnf1Var = z5 ? qnf1.d : o0u0Var3.h;
        o0g1 o0g1Var = z5 ? this.e : o0u0Var3.i;
        if (z5) {
            w280 w280Var = b380.b;
            bg11Var = bg11.e;
        } else {
            bg11Var = o0u0Var3.j;
        }
        this.h1 = new o0u0(uwu0Var, p2i0Var, j3, j2, i4, exoPlaybackException, false, qnf1Var, o0g1Var, bg11Var, p2i0Var, o0u0Var3.l, o0u0Var3.m, o0u0Var3.n, o0u0Var3.o, j2, 0L, j2, 0L, false);
        if (z3) {
            drh0 drh0Var = this.Q0;
            if (!drh0Var.q.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < drh0Var.q.size(); i5++) {
                    ((brh0) drh0Var.q.get(i5)).k();
                }
                drh0Var.q = arrayList;
                drh0Var.m = null;
                drh0Var.q();
            }
            g3i0 g3i0Var = this.R0;
            HashMap map = g3i0Var.g;
            for (e3i0 e3i0Var : map.values()) {
                try {
                    e3i0Var.a.u(e3i0Var.b);
                } catch (RuntimeException e4) {
                    oon1.w("Failed to release child source.", e4);
                }
                qba qbaVar = e3i0Var.a;
                d3i0 d3i0Var = e3i0Var.c;
                qbaVar.y(d3i0Var);
                e3i0Var.a.x(d3i0Var);
            }
            map.clear();
            g3i0Var.h.clear();
            g3i0Var.l = false;
        }
    }

    public final void R() {
        brh0 brh0Var = this.Q0.i;
        this.l1 = brh0Var != null && brh0Var.g.h && this.k1;
    }

    public final void S(long j, boolean z) {
        brh0 brh0Var = this.Q0.i;
        long j2 = j + (brh0Var == null ? 1000000000000L : brh0Var.f17p);
        this.w1 = j2;
        ((zab1) this.Z.c).a(j2);
        for (qd21 qd21Var : this.a) {
            long j3 = this.w1;
            jca jcaVarC = qd21Var.c(brh0Var);
            if (jcaVarC != null) {
                jcaVarC.L(j3, z);
            }
        }
        for (brh0 brh0Var2 = r0.i; brh0Var2 != null; brh0Var2 = brh0Var2.m) {
            for (qp00 qp00Var : (qp00[]) brh0Var2.o.d) {
                if (qp00Var != null) {
                    qp00Var.k();
                }
            }
        }
    }

    public final void V(sqe1 sqe1Var, sqe1 sqe1Var2) {
        if (sqe1Var.p() && sqe1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.N0;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            sqe1 sqe1Var3 = sqe1Var;
            sqe1 sqe1Var4 = sqe1Var2;
            if (!U((ep00) arrayList.get(size), sqe1Var3, sqe1Var4, this.p1, this.q1, this.t, this.X)) {
                ((ep00) arrayList.get(size)).a.a(false);
                arrayList.remove(size);
            }
            size--;
            sqe1Var = sqe1Var3;
            sqe1Var2 = sqe1Var4;
        }
        Collections.sort(arrayList);
    }

    public final void Y(long j) {
        boolean z = this.V0 || (this.d1 && this.c1.d);
        o0u0 o0u0Var = this.h1;
        long jMin = 1000;
        long j2 = G1;
        if (z) {
            jMin = o0u0Var.e != 3 ? j2 : 1000L;
            for (qd21 qd21Var : this.a) {
                long j3 = this.w1;
                long j4 = this.x1;
                jca jcaVar = qd21Var.c;
                jca jcaVar2 = qd21Var.a;
                long jG = qd21.j(jcaVar2) ? jcaVar2.g(j3, j4) : Long.MAX_VALUE;
                if (jcaVar != null && qd21.j(jcaVar)) {
                    jG = Math.min(jG, jcaVar.g(j3, j4));
                }
                jMin = Math.min(jMin, zoi1.n0(jG));
            }
            if (this.h1.m()) {
                brh0 brh0Var = this.Q0.i;
                brh0 brh0Var2 = brh0Var != null ? brh0Var.m : null;
                if (brh0Var2 != null) {
                    if ((zoi1.W(jMin) * this.h1.o.a) + this.w1 >= brh0Var2.g()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (o0u0Var.e != 3 || x0()) {
            jMin = j2;
        }
        this.g.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void Z(boolean z) {
        p2i0 p2i0Var = this.Q0.i.g.a;
        long jB0 = b0(p2i0Var, this.h1.s, true, false);
        if (jB0 != this.h1.s) {
            o0u0 o0u0Var = this.h1;
            this.h1 = z(p2i0Var, jB0, o0u0Var.c, o0u0Var.d, z, 5);
        }
    }

    @Override // p.moj1
    public final void a(long j, long j2, ie30 ie30Var, MediaFormat mediaFormat) {
        if (this.e1) {
            this.g.a(37).b();
        }
    }

    public final void a0(hp00 hp00Var) throws Throwable {
        p2i0 p2i0VarV;
        long j;
        long j2;
        boolean z;
        long jLongValue;
        boolean z2;
        long j3;
        long jT;
        o0u0 o0u0Var;
        int i;
        long j4;
        p2i0 p2i0Var;
        long j5;
        int i2;
        long j6;
        ip00 ip00Var = this;
        if (ip00Var.e1) {
            if (ip00Var.f1 != null) {
                ip00Var.g1++;
                ip00Var.i1.e(1);
            }
            ip00Var.f1 = hp00Var;
            return;
        }
        ip00Var.i1.e(1);
        Pair pairW = W(ip00Var.h1.a, hp00Var, true, ip00Var.p1, ip00Var.q1, ip00Var.t, ip00Var.X);
        long j7 = -9223372036854775807L;
        if (pairW == null) {
            Pair pairO = ip00Var.o(ip00Var.h1.a);
            p2i0VarV = (p2i0) pairO.first;
            jLongValue = ((Long) pairO.second).longValue();
            z = !ip00Var.h1.a.p();
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = pairW.first;
            long jLongValue2 = ((Long) pairW.second).longValue();
            long j8 = hp00Var.c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            drh0 drh0Var = ip00Var.Q0;
            o0u0 o0u0Var2 = ip00Var.h1;
            p2i0VarV = drh0Var.v(o0u0Var2, o0u0Var2.a, obj, jLongValue2, true, false);
            if (p2i0VarV.c()) {
                ip00Var.h1.a.g(p2i0VarV.a, ip00Var.X);
                long j9 = ip00Var.X.f(p2i0VarV.b) == p2i0VarV.c ? ip00Var.X.g.b : 0L;
                bv0 bv0VarA = ip00Var.X.g.a(p2i0VarV.b);
                j2 = 0;
                j = -9223372036854775807L;
                long jMax = Math.max(j8, bv0VarA.a + bv0VarA.j);
                z = true;
                j7 = jMax;
                jLongValue = j9;
            } else {
                j = -9223372036854775807L;
                j2 = 0;
                z = hp00Var.c == -9223372036854775807L;
                j7 = j8;
                jLongValue = jLongValue2;
            }
        }
        try {
            try {
                if (!ip00Var.h1.a.p()) {
                    o0u0 o0u0Var3 = ip00Var.h1;
                    if (pairW == null) {
                        if (o0u0Var3.e != 1) {
                            ip00Var.t0(4);
                        }
                        ip00Var.Q(false, true, false, true);
                    } else {
                        if (p2i0VarV.equals(o0u0Var3.b)) {
                            try {
                                brh0 brh0Var = ip00Var.Q0.i;
                                if (brh0Var == null || !brh0Var.e || jLongValue == j2) {
                                    jT = jLongValue;
                                } else {
                                    d8h0 d8h0Var = brh0Var.a;
                                    long j10 = ip00Var.t.m;
                                    if (ip00Var.d1 && j10 != j) {
                                        ip00Var.c1.getClass();
                                    }
                                    jT = d8h0Var.t(jLongValue, ip00Var.b1);
                                }
                                if (zoi1.n0(jT) == zoi1.n0(ip00Var.h1.s) && ((i = (o0u0Var = ip00Var.h1).e) == 2 || i == 3)) {
                                    j4 = o0u0Var.s;
                                    z2 = z;
                                    p2i0Var = p2i0VarV;
                                    j5 = j7;
                                    i2 = 2;
                                    j6 = j4;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z2 = z;
                                j3 = jLongValue;
                                ip00Var.h1 = ip00Var.z(p2i0VarV, j3, j7, j3, z2, 2);
                                throw th;
                            }
                        } else {
                            jT = jLongValue;
                        }
                        try {
                            try {
                                long jB0 = ip00Var.b0(p2i0VarV, jT, ip00Var.B(), ip00Var.h1.e == 4);
                                z2 = (jLongValue != jB0) | z;
                                try {
                                    o0u0 o0u0Var4 = ip00Var.h1;
                                    p2i0 p2i0Var2 = p2i0VarV;
                                    try {
                                        sqe1 sqe1Var = o0u0Var4.a;
                                        long j11 = j7;
                                        try {
                                            ip00Var.H0(sqe1Var, p2i0Var2, sqe1Var, o0u0Var4.b, j11, true);
                                            p2i0Var = p2i0Var2;
                                            j5 = j11;
                                            j4 = jB0;
                                            i2 = 2;
                                            j6 = j4;
                                            ip00Var = this;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            p2i0VarV = p2i0Var2;
                                            j7 = j11;
                                            j3 = jB0;
                                            ip00Var.h1 = ip00Var.z(p2i0VarV, j3, j7, j3, z2, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        p2i0VarV = p2i0Var2;
                                        j7 = j7;
                                        j3 = jB0;
                                        ip00Var.h1 = ip00Var.z(p2i0VarV, j3, j7, j3, z2, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z2 = z;
                                j3 = jLongValue;
                                ip00Var.h1 = ip00Var.z(p2i0VarV, j3, j7, j3, z2, 2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    ip00Var.h1 = ip00Var.z(p2i0Var, j4, j5, j6, z2, i2);
                }
                ip00Var.v1 = hp00Var;
                z2 = z;
                p2i0Var = p2i0VarV;
                j5 = j7;
                j4 = jLongValue;
                i2 = 2;
                j6 = j4;
                ip00Var = this;
                ip00Var.h1 = ip00Var.z(p2i0Var, j4, j5, j6, z2, i2);
            } catch (Throwable th7) {
                th = th7;
                z2 = z;
            }
        } catch (Throwable th8) {
            th = th8;
            z = z;
            p2i0VarV = p2i0VarV;
        }
    }

    public final void b(cp00 cp00Var, int i) throws Throwable {
        this.i1.e(1);
        g3i0 g3i0Var = this.R0;
        if (i == -1) {
            i = g3i0Var.c.size();
        }
        w(g3i0Var.a(i, cp00Var.a, cp00Var.b), false);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    public final long b0(p2i0 p2i0Var, long j, boolean z, boolean z2) {
        drh0 drh0Var;
        B0();
        boolean z3 = true;
        I0(false, true);
        if (z2 || this.h1.e == 3) {
            t0(2);
        }
        brh0 brh0Var = this.Q0.i;
        brh0 brh0Var2 = brh0Var;
        while (brh0Var2 != null && !p2i0Var.equals(brh0Var2.g.a)) {
            brh0Var2 = brh0Var2.m;
        }
        if (z || brh0Var != brh0Var2 || (brh0Var2 != null && brh0Var2.f17p + j < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                i(i);
            }
            this.D1 = -9223372036854775807L;
            if (brh0Var2 != null) {
                while (true) {
                    drh0Var = this.Q0;
                    if (drh0Var.i == brh0Var2) {
                        break;
                    }
                    drh0Var.a();
                }
                drh0Var.t(brh0Var2);
                brh0Var2.f17p = 1000000000000L;
                dm5.y(!B());
                m(this.Q0.d().g(), new boolean[this.a.length]);
                f0(brh0Var2);
            }
        }
        h();
        if (this.d1) {
            for (qd21 qd21Var : this.a) {
                if (qd21Var.i()) {
                    jca jcaVar = qd21Var.a;
                    if (jcaVar.b == 2 || jcaVar.b == 4) {
                        this.e1 = true;
                        break;
                    }
                }
            }
        }
        drh0 drh0Var2 = this.Q0;
        if (brh0Var2 != null) {
            drh0Var2.t(brh0Var2);
            if (!brh0Var2.e) {
                brh0Var2.g = brh0Var2.g.b(j, -9223372036854775807L);
            } else if (brh0Var2.f) {
                if (this.d1 && this.c1.f && !this.h1.a.p() && brh0Var2.g.a.equals(this.h1.b)) {
                    long j2 = brh0Var2.f17p + j;
                    boolean z4 = true;
                    for (qd21 qd21Var2 : this.a) {
                        if (qd21Var2.i()) {
                            jca jcaVarC = qd21Var2.c(brh0Var2);
                            z4 &= jcaVarC != null && jcaVarC.T(j2);
                        }
                    }
                    if (z4) {
                        d8h0 d8h0Var = brh0Var2.a;
                        long j3 = this.h1.s;
                        on51 on51Var = on51.c;
                        if (d8h0Var.t(j3, on51Var) == brh0Var2.a.t(j, on51Var)) {
                            z3 = false;
                        } else {
                            j = brh0Var2.a.d(j);
                            brh0Var2.a.r(j - this.Y);
                        }
                    } else {
                        j = brh0Var2.a.d(j);
                        brh0Var2.a.r(j - this.Y);
                    }
                } else {
                    j = brh0Var2.a.d(j);
                    brh0Var2.a.r(j - this.Y);
                }
            }
            S(j, z3);
            E();
        } else {
            drh0Var2.b();
            S(j, true);
        }
        v(false);
        this.g.j(2);
        return j;
    }

    public final void c(v561 v561Var) {
        this.g.c(9, (arh0) v561Var).b();
    }

    public final void c0(sbu0 sbu0Var) {
        if (sbu0Var.h == -9223372036854775807L) {
            d0(sbu0Var);
            return;
        }
        boolean zP = this.h1.a.p();
        ArrayList arrayList = this.N0;
        if (zP) {
            arrayList.add(new ep00(sbu0Var));
            return;
        }
        ep00 ep00Var = new ep00(sbu0Var);
        sqe1 sqe1Var = this.h1.a;
        if (!U(ep00Var, sqe1Var, sqe1Var, this.p1, this.q1, this.t, this.X)) {
            sbu0Var.a(false);
        } else {
            arrayList.add(ep00Var);
            Collections.sort(arrayList);
        }
    }

    public final void d() {
        for (qd21 qd21Var : this.a) {
            zu41 zu41Var = this.d1 ? this.c1 : null;
            qd21Var.a.b(18, zu41Var);
            jca jcaVar = qd21Var.c;
            if (jcaVar != null) {
                jcaVar.b(18, zu41Var);
            }
        }
    }

    public final void d0(sbu0 sbu0Var) {
        Looper looper = sbu0Var.f;
        Looper looper2 = this.i;
        wdd1 wdd1Var = this.g;
        if (looper != looper2) {
            wdd1Var.c(15, sbu0Var).b();
            return;
        }
        g(sbu0Var);
        int i = this.h1.e;
        if (i == 3 || i == 2) {
            wdd1Var.j(2);
        }
    }

    @Override // p.n0g1
    public final void e(k0g1 k0g1Var) {
        this.g.c(10, k0g1Var).b();
    }

    public final void e0(sbu0 sbu0Var) {
        Looper looper = sbu0Var.f;
        if (looper.getThread().isAlive()) {
            this.O0.a(looper, (Handler.Callback) null).f(new fss(this, sbu0Var, (byte) 20));
        } else {
            oon1.H("Trying to send message on a dead thread.");
            sbu0Var.a(false);
        }
    }

    public final boolean f() {
        if (!this.Y0) {
            return false;
        }
        for (qd21 qd21Var : this.a) {
            if (qd21Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(brh0 brh0Var) {
        for (int i = 0; i < this.a.length; i++) {
            brh0Var.h[i] = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    public final void g0(po7 po7Var, boolean z) {
        int i;
        pna1 pna1Var;
        n0g1 n0g1Var;
        exs exsVar = this.d;
        if (!exsVar.j.equals(po7Var)) {
            exsVar.j = po7Var;
            if (exsVar.g.A0 && Build.VERSION.SDK_INT >= 32 && (pna1Var = exsVar.i) != null && pna1Var.b && (n0g1Var = exsVar.a) != null) {
                n0g1Var.e(null);
            }
        }
        if (!z) {
            po7Var = null;
        }
        vu7 vu7Var = this.Z0;
        if (!Objects.equals(vu7Var.d, po7Var)) {
            vu7Var.d = po7Var;
            if (po7Var != null) {
                int i2 = po7Var.c;
                i = 3;
                switch (i2) {
                    case 0:
                        oon1.H("Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i = 1;
                        break;
                    case 1:
                    case 14:
                        i = 1;
                        break;
                    case 2:
                    case 4:
                        i = 2;
                        break;
                    case 3:
                        i = 0;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        if (po7Var.a == 1) {
                            i = 2;
                        }
                        break;
                    case 15:
                    default:
                        td6.p(i2, "Unidentified audio usage: ");
                        i = 0;
                        break;
                    case 16:
                        i = 4;
                        break;
                }
            } else {
                i = 0;
            }
            vu7Var.f = i;
            dm5.n(i == 1 || i == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        o0u0 o0u0Var = this.h1;
        boolean z2 = o0u0Var.l;
        F0(vu7Var.c(o0u0Var.e, z2), o0u0Var.n, o0u0Var.m, z2);
    }

    public final void h() {
        jca jcaVar;
        if (this.Y0 && f()) {
            for (qd21 qd21Var : this.a) {
                int iB = qd21Var.b();
                j7s j7sVar = this.Z;
                if (qd21Var.f()) {
                    int i = qd21Var.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            jcaVar = qd21Var.a;
                        } catch (RuntimeException e) {
                            oon1.w("Disable prewarming failed.", e);
                        }
                    } else {
                        jcaVar = qd21Var.c;
                        jcaVar.getClass();
                    }
                    qd21Var.a(jcaVar, j7sVar);
                    try {
                        qd21Var.k(z);
                    } catch (RuntimeException e2) {
                        oon1.w("Reset prewarming failed.", e2);
                    }
                    qd21Var.d = i2;
                }
                this.u1 -= iB - qd21Var.b();
            }
            this.D1 = -9223372036854775807L;
        }
    }

    public final void h0(int i) {
        for (qd21 qd21Var : this.a) {
            jca jcaVar = qd21Var.a;
            byte b = jcaVar.b;
            if (b == 1 || b == 2) {
                jcaVar.b(10, Integer.valueOf(i));
                jca jcaVar2 = qd21Var.c;
                if (jcaVar2 != null) {
                    jcaVar2.b(10, Integer.valueOf(i));
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        int i2;
        brh0 brh0Var;
        p2i0 p2i0Var;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.i1.e(1);
                    F0(this.Z0.c(this.h1.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    a0((hp00) message.obj);
                    break;
                case 4:
                    m0((k2u0) message.obj);
                    break;
                case 5:
                    this.b1 = (on51) message.obj;
                    break;
                case 6:
                    A0(false, true);
                    break;
                case 7:
                    M((hsk) message.obj);
                    return true;
                case 8:
                    x((arh0) message.obj);
                    break;
                case 9:
                    t((arh0) message.obj);
                    break;
                case 10:
                    this.d.j((k0g1) message.obj);
                    P();
                    break;
                case 11:
                    o0(message.arg1);
                    break;
                case 12:
                    r0(message.arg1 != 0);
                    break;
                case 13:
                    i0(message.arg1 != 0, (hsk) message.obj);
                    break;
                case 14:
                    c0((sbu0) message.obj);
                    break;
                case 15:
                    e0((sbu0) message.obj);
                    break;
                case 16:
                    k2u0 k2u0Var = (k2u0) message.obj;
                    y(k2u0Var, k2u0Var.a, true, false);
                    break;
                case 17:
                    k0((cp00) message.obj);
                    break;
                case 18:
                    b((cp00) message.obj, message.arg1);
                    break;
                case 19:
                    K((dp00) message.obj);
                    break;
                case 20:
                    O(message.arg1, message.arg2, (ef81) message.obj);
                    break;
                case 21:
                    s0((ef81) message.obj);
                    break;
                case 22:
                    J();
                    break;
                case 23:
                    l0(message.arg1 != 0);
                    break;
                case 24:
                    this.a1 = message.arg1 != 0;
                    break;
                case 25:
                    P();
                    Z(true);
                    break;
                case 26:
                    P();
                    Z(true);
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    E0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    n0((co00) message.obj);
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    L();
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    Pair pair = (Pair) message.obj;
                    v0(pair.first, (hsk) pair.second);
                    break;
                case 31:
                    g0((po7) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    w0(((Float) message.obj).floatValue());
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    r(message.arg1);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    s();
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    u0((moj1) message.obj);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    p0(((Boolean) message.obj).booleanValue());
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    this.e1 = false;
                    hp00 hp00Var = this.f1;
                    if (hp00Var != null) {
                        a0(hp00Var);
                        this.f1 = null;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    q0((zu41) message.obj);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    j0((bp00) message.obj);
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    h0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (IOException e) {
            u(2000, e);
        } catch (ExoPlaybackException e2) {
            e = e2;
            byte b = e.t;
            drh0 drh0Var = this.Q0;
            if (b == 1 && e.O0 == null) {
                qd21 qd21Var = this.a[e.Y];
                brh0 brh0VarD = drh0Var.i;
                while (brh0VarD != null && !qd21Var.h(brh0VarD)) {
                    brh0VarD = brh0VarD.m;
                }
                if (brh0VarD == null) {
                    brh0VarD = drh0Var.d();
                }
                if (brh0VarD != null) {
                    e = e.c(brh0VarD.g.a);
                }
            }
            int i5 = e.Y;
            byte b2 = e.t;
            wdd1 wdd1Var = this.g;
            if (b2 == 1 && (p2i0Var = e.O0) != null && C(i5, p2i0Var)) {
                this.E1 = true;
                h();
                brh0 brh0VarL = drh0Var.l(i5);
                brh0 brh0Var2 = drh0Var.i;
                if (brh0Var2 != brh0VarL) {
                    while (brh0Var2 != null) {
                        brh0 brh0Var3 = brh0Var2.m;
                        if (brh0Var3 == brh0VarL) {
                            break;
                        }
                        brh0Var2 = brh0Var3;
                    }
                }
                drh0Var.t(brh0Var2);
                if (this.h1.e != 4) {
                    E();
                    wdd1Var.j(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.A1;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.A1;
                }
                if (e.t == 1 && drh0Var.i != drh0Var.g()) {
                    brh0 brh0VarD2 = drh0Var.i;
                    while (brh0VarD2 != null && !brh0VarD2.g.a.equals(e.O0)) {
                        brh0VarD2 = brh0VarD2.m;
                    }
                    if (brh0VarD2 == null) {
                        brh0VarD2 = drh0Var.d();
                    }
                    while (true) {
                        brh0Var = drh0Var.i;
                        if (brh0Var == brh0VarD2) {
                            break;
                        }
                        drh0Var.a();
                    }
                    dm5.r(brh0Var);
                    G(message.what);
                    crh0 crh0Var = brh0Var.g;
                    p2i0 p2i0Var2 = crh0Var.a;
                    long j = crh0Var.b;
                    this.h1 = z(p2i0Var2, j, crh0Var.d, j, true, 0);
                }
                if (e.P0 && (this.A1 == null || (i2 = ((PlaybackException) e).a) == 5004 || i2 == 5003)) {
                    oon1.I("Recoverable renderer error", e);
                    if (this.A1 == null) {
                        this.A1 = e;
                    }
                    vdd1 vdd1VarC = wdd1Var.c(25, e);
                    Handler handler = wdd1Var.a;
                    Message message2 = vdd1VarC.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    vdd1VarC.a();
                } else {
                    oon1.w("Playback error", e);
                    A0(true, false);
                    this.h1 = this.h1.f(e);
                }
            }
        } catch (DataSourceException e3) {
            u(e3.a, e3);
        } catch (ParserException e4) {
            boolean z2 = e4.a;
            byte b3 = e4.b;
            if (b3 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (b3 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                u(i3, e4);
            }
            i3 = i;
            u(i3, e4);
        } catch (BehindLiveWindowException e5) {
            u(ContentMediaFormat.FULL_CONTENT_EPISODE, e5);
        } catch (DrmSession.DrmSessionException e6) {
            u(e6.a, e6);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? ContentMediaFormat.PARTIAL_CONTENT_GENERIC : 1000);
            oon1.w("Playback error", exoPlaybackException2);
            A0(true, false);
            this.h1 = this.h1.f(exoPlaybackException2);
        }
        G(message.what);
        return true;
    }

    public final void i(int i) {
        qd21[] qd21VarArr = this.a;
        int iB = qd21VarArr[i].b();
        qd21 qd21Var = qd21VarArr[i];
        jca jcaVar = qd21Var.a;
        j7s j7sVar = this.Z;
        qd21Var.a(jcaVar, j7sVar);
        jca jcaVar2 = qd21Var.c;
        if (jcaVar2 != null) {
            boolean z = qd21.j(jcaVar2) && qd21Var.d != 3;
            qd21Var.a(jcaVar2, j7sVar);
            qd21Var.k(false);
            if (z) {
                jca jcaVar3 = qd21Var.a;
                jcaVar2.getClass();
                jcaVar2.b(17, jcaVar3);
            }
        }
        qd21Var.d = 0;
        I(i, false);
        this.u1 -= iB;
    }

    public final void i0(boolean z, hsk hskVar) {
        if (this.r1 != z) {
            this.r1 = z;
            if (!z) {
                for (qd21 qd21Var : this.a) {
                    qd21Var.m();
                }
            }
        }
        if (hskVar != null) {
            hskVar.f();
        }
    }

    @Override // p.zqh0
    public final void j(arh0 arh0Var) {
        this.g.c(8, arh0Var).b();
    }

    public final void j0(bp00 bp00Var) {
        for (qd21 qd21Var : this.a) {
            jca jcaVar = qd21Var.a;
            if (jcaVar.b == 4) {
                jcaVar.b(23, bp00Var);
                jca jcaVar2 = qd21Var.c;
                if (jcaVar2 != null) {
                    jcaVar2.b(23, bp00Var);
                }
            }
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r25v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r25v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v36 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v34 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v35 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v36 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v30 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v39 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v39 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v40 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v44 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v11 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 2434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ip00.k():void");
    }

    public final void k0(cp00 cp00Var) throws Throwable {
        this.i1.e(1);
        int i = cp00Var.c;
        ef81 ef81Var = cp00Var.b;
        ArrayList arrayList = cp00Var.a;
        if (i != -1) {
            this.v1 = new hp00(new uwu0(arrayList, ef81Var), cp00Var.c, cp00Var.d);
        }
        g3i0 g3i0Var = this.R0;
        ArrayList arrayList2 = g3i0Var.c;
        g3i0Var.f(0, arrayList2.size());
        w(g3i0Var.a(arrayList2.size(), arrayList, ef81Var), false);
    }

    public final void l(brh0 brh0Var, int i, boolean z, long j) {
        qd21 qd21Var = this.a[i];
        if (qd21Var.i()) {
            return;
        }
        boolean z2 = brh0Var == this.Q0.i;
        o0g1 o0g1Var = brh0Var.o;
        ld21 ld21Var = ((ld21[]) o0g1Var.c)[i];
        qp00 qp00Var = ((qp00[]) o0g1Var.d)[i];
        boolean z3 = x0() && this.h1.e == 3;
        boolean z4 = !z && z3;
        this.u1++;
        p641 p641Var = brh0Var.c[i];
        long j2 = brh0Var.f17p;
        p2i0 p2i0Var = brh0Var.g.a;
        jca jcaVar = qd21Var.a;
        jca jcaVar2 = qd21Var.c;
        int length = qp00Var != null ? qp00Var.length() : 0;
        ie30[] ie30VarArr = new ie30[length];
        for (int i2 = 0; i2 < length; i2++) {
            qp00Var.getClass();
            ie30VarArr[i2] = qp00Var.e(i2);
        }
        int i3 = qd21Var.d;
        j7s j7sVar = this.Z;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            qd21Var.e = true;
            jcaVar.e(ld21Var, ie30VarArr, p641Var, z4, z2, j, j2, p2i0Var);
            j7sVar.f(jcaVar);
        } else {
            qd21Var.f = true;
            jcaVar2.getClass();
            jcaVar2.e(ld21Var, ie30VarArr, p641Var, z4, z2, j, j2, p2i0Var);
            j7sVar.f(jcaVar2);
        }
        zo00 zo00Var = new zo00(this);
        jca jcaVarC = qd21Var.c(brh0Var);
        jcaVarC.getClass();
        jcaVarC.b(11, zo00Var);
        if (z3 && z2) {
            qd21Var.o();
        }
    }

    public final void l0(boolean z) {
        this.k1 = z;
        R();
        if (this.l1 && B()) {
            Z(true);
            v(false);
        }
    }

    public final void m(long j, boolean[] zArr) {
        qd21[] qd21VarArr;
        ip00 ip00Var;
        long j2;
        dm5.y(!B());
        brh0 brh0VarD = this.Q0.d();
        o0g1 o0g1Var = brh0VarD.o;
        int i = 0;
        while (true) {
            qd21VarArr = this.a;
            if (i >= qd21VarArr.length) {
                break;
            }
            if (!o0g1Var.o(i)) {
                qd21VarArr[i].m();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < qd21VarArr.length) {
            if (!o0g1Var.o(i2) || qd21VarArr[i2].h(brh0VarD)) {
                ip00Var = this;
                j2 = j;
            } else {
                ip00Var = this;
                j2 = j;
                ip00Var.l(brh0VarD, i2, zArr[i2], j2);
            }
            i2++;
            this = ip00Var;
            j = j2;
        }
    }

    public final void m0(k2u0 k2u0Var) {
        this.g.i(16);
        j7s j7sVar = this.Z;
        j7sVar.m(k2u0Var);
        k2u0 k2u0VarL = j7sVar.l();
        y(k2u0VarL, k2u0VarL.a, true, true);
    }

    public final long n(sqe1 sqe1Var, Object obj, long j) {
        dqe1 dqe1Var = this.X;
        int i = sqe1Var.g(obj, dqe1Var).c;
        oqe1 oqe1Var = this.t;
        sqe1Var.m(i, oqe1Var);
        if (oqe1Var.f == -9223372036854775807L || !oqe1Var.c() || !oqe1Var.i) {
            return -9223372036854775807L;
        }
        long j2 = oqe1Var.g;
        return zoi1.W((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - oqe1Var.f) - (j + dqe1Var.e);
    }

    public final void n0(co00 co00Var) {
        this.C1 = co00Var;
        sqe1 sqe1Var = this.h1.a;
        drh0 drh0Var = this.Q0;
        drh0Var.getClass();
        co00Var.getClass();
        if (drh0Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < drh0Var.q.size(); i++) {
            ((brh0) drh0Var.q.get(i)).k();
        }
        drh0Var.q = arrayList;
        drh0Var.m = null;
        drh0Var.q();
    }

    public final Pair o(sqe1 sqe1Var) {
        if (sqe1Var.p()) {
            return Pair.create(o0u0.u, 0L);
        }
        Pair pairI = sqe1Var.i(this.t, this.X, sqe1Var.a(this.q1), -9223372036854775807L);
        p2i0 p2i0VarV = this.Q0.v(this.h1, sqe1Var, pairI.first, 0L, true, false);
        long jLongValue = ((Long) pairI.second).longValue();
        if (p2i0VarV.c()) {
            Object obj = p2i0VarV.a;
            dqe1 dqe1Var = this.X;
            sqe1Var.g(obj, dqe1Var);
            jLongValue = p2i0VarV.c == dqe1Var.f(p2i0VarV.b) ? dqe1Var.g.b : 0L;
        }
        return Pair.create(p2i0VarV, Long.valueOf(jLongValue));
    }

    public final void o0(int i) {
        this.p1 = i;
        sqe1 sqe1Var = this.h1.a;
        drh0 drh0Var = this.Q0;
        drh0Var.g = i;
        int iX = drh0Var.x(sqe1Var);
        if ((iX & 1) != 0) {
            Z(true);
        } else if ((iX & 2) != 0) {
            h();
        }
        v(false);
    }

    public final long p(brh0 brh0Var, int i) {
        if (brh0Var == null) {
            return 0L;
        }
        if (brh0Var.e) {
            qd21[] qd21VarArr = this.a;
            if (qd21VarArr[i].h(brh0Var)) {
                jca jcaVarC = qd21VarArr[i].c(brh0Var);
                Objects.requireNonNull(jcaVarC);
                return jcaVarC.Z;
            }
        }
        return brh0Var.f17p;
    }

    public final void p0(boolean z) throws Throwable {
        if (!z) {
            hp00 hp00Var = this.f1;
            wdd1 wdd1Var = this.g;
            if (hp00Var != null && this.e1 && !wdd1Var.a.hasMessages(37)) {
                this.g1++;
            }
            int i = this.g1;
            if (i > 0) {
                this.X0.f(new fss(this, i));
            }
            this.g1 = 0;
            this.e1 = false;
            wdd1Var.i(37);
            hp00 hp00Var2 = this.f1;
            if (hp00Var2 != null) {
                a0(hp00Var2);
                this.f1 = null;
                this.e1 = false;
            }
        }
        this.d1 = z;
        d();
    }

    public final long q(long j) {
        brh0 brh0Var = this.Q0.l;
        if (brh0Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.w1 - brh0Var.f17p));
    }

    public final void q0(zu41 zu41Var) {
        this.c1 = zu41Var;
        d();
    }

    public final void r(int i) {
        o0u0 o0u0Var = this.h1;
        F0(i, o0u0Var.n, o0u0Var.m, o0u0Var.l);
    }

    public final void r0(boolean z) {
        this.q1 = z;
        sqe1 sqe1Var = this.h1.a;
        drh0 drh0Var = this.Q0;
        drh0Var.h = z;
        int iX = drh0Var.x(sqe1Var);
        if ((iX & 1) != 0) {
            Z(true);
        } else if ((iX & 2) != 0) {
            h();
        }
        v(false);
    }

    public final void s() {
        w0(this.F1);
    }

    public final void s0(ef81 ef81Var) throws Throwable {
        this.i1.e(1);
        g3i0 g3i0Var = this.R0;
        int size = g3i0Var.c.size();
        if (ef81Var.b.length != size) {
            ef81Var = ef81Var.a().b(0, size);
        }
        g3i0Var.k = ef81Var;
        w(g3i0Var.b(), false);
    }

    public final void t(arh0 arh0Var) {
        drh0 drh0Var = this.Q0;
        brh0 brh0Var = drh0Var.l;
        if (brh0Var != null && brh0Var.a == arh0Var) {
            drh0Var.s(this.w1);
            E();
            return;
        }
        brh0 brh0Var2 = drh0Var.m;
        if (brh0Var2 == null || brh0Var2.a != arh0Var) {
            return;
        }
        F();
    }

    public final void t0(int i) {
        o0u0 o0u0VarI = this.h1;
        if (o0u0VarI.e != i) {
            if (i != 2) {
                this.B1 = -9223372036854775807L;
            }
            if (i != 3 && o0u0VarI.f105p) {
                o0u0VarI = o0u0VarI.i(false);
                this.h1 = o0u0VarI;
            }
            this.h1 = o0u0VarI.h(i);
        }
    }

    public final void u(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        brh0 brh0Var = this.Q0.i;
        if (brh0Var != null) {
            exoPlaybackException = exoPlaybackException.c(brh0Var.g.a);
        }
        oon1.w("Playback error", exoPlaybackException);
        A0(false, false);
        this.h1 = this.h1.f(exoPlaybackException);
    }

    public final void u0(moj1 moj1Var) {
        for (qd21 qd21Var : this.a) {
            jca jcaVar = qd21Var.a;
            byte b = jcaVar.b;
            if (b == 2 || b == 4) {
                jcaVar.b(7, moj1Var);
                jca jcaVar2 = qd21Var.c;
                if (jcaVar2 != null) {
                    jcaVar2.b(7, moj1Var);
                }
            }
        }
    }

    public final void v(boolean z) {
        brh0 brh0Var = this.Q0.l;
        p2i0 p2i0Var = brh0Var == null ? this.h1.b : brh0Var.g.a;
        boolean zEquals = this.h1.k.equals(p2i0Var);
        if (!zEquals) {
            this.h1 = this.h1.c(p2i0Var);
        }
        o0u0 o0u0Var = this.h1;
        o0u0Var.q = brh0Var == null ? o0u0Var.s : brh0Var.d();
        o0u0 o0u0Var2 = this.h1;
        o0u0Var2.r = q(o0u0Var2.q);
        if ((!zEquals || z) && brh0Var != null && brh0Var.e) {
            D0(brh0Var.g.a, brh0Var.n, brh0Var.o);
        }
    }

    public final void v0(Object obj, hsk hskVar) {
        for (qd21 qd21Var : this.a) {
            jca jcaVar = qd21Var.a;
            if (jcaVar.b == 2) {
                int i = qd21Var.d;
                if (i == 4 || i == 1) {
                    jca jcaVar2 = qd21Var.c;
                    jcaVar2.getClass();
                    jcaVar2.b(1, obj);
                } else {
                    jcaVar.b(1, obj);
                }
            }
        }
        int i2 = this.h1.e;
        if (i2 == 3 || i2 == 2) {
            this.g.j(2);
        }
        if (hskVar != null) {
            hskVar.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x025f  */
    /* JADX WARN: Code duplicated, block: B:142:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:157:0x0307  */
    /* JADX WARN: Code duplicated, block: B:160:0x0314  */
    /* JADX WARN: Code duplicated, block: B:161:0x0316  */
    /* JADX WARN: Code duplicated, block: B:164:0x0323  */
    /* JADX WARN: Code duplicated, block: B:171:0x0344 A[PHI: r7
      0x0344: PHI (r7v15 ??) = (r7v38 ??), (r7v39 ??), (r7v40 ??) binds: [B:163:0x0321, B:165:0x0325, B:169:0x033f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:173:0x0348 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0363  */
    /* JADX WARN: Code duplicated, block: B:245:0x043e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0440  */
    /* JADX WARN: Code duplicated, block: B:251:0x0459  */
    /* JADX WARN: Code duplicated, block: B:253:0x045f  */
    /* JADX WARN: Code duplicated, block: B:254:0x0462  */
    /* JADX WARN: Code duplicated, block: B:258:0x0489  */
    /* JADX WARN: Code duplicated, block: B:263:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:264:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:267:0x04af  */
    /* JADX WARN: Code duplicated, block: B:269:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:271:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:272:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:276:0x04eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [p.sqe1] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [p.sqe1] */
    /* JADX WARN: Type inference failed for: r2v22, types: [p.o0u0] */
    /* JADX WARN: Type inference failed for: r44v0, types: [p.ip00] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
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
    public final void w(sqe1 sqe1Var, boolean z) throws Throwable {
        p2i0 p2i0Var;
        long j;
        sqe1 sqe1Var2;
        oqe1 oqe1Var;
        Object obj;
        int i;
        int iA;
        long jK;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA2;
        boolean z5;
        Object obj2;
        long jLongValue;
        int i2;
        sqe1 sqe1Var3;
        boolean z6;
        int i3;
        int i4;
        long jMin;
        long j2;
        boolean z7;
        int i5;
        Object obj3;
        boolean zEquals;
        ?? r7;
        int i6;
        ?? r8;
        boolean z8;
        gp00 gp00Var;
        int i7;
        int i8;
        long jLongValue2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r13;
        p2i0 p2i0Var2;
        ?? r14;
        long j3;
        p2i0 p2i0Var3;
        boolean z13;
        long j4;
        qd21[] qd21VarArr;
        drh0 drh0Var;
        long j5;
        p2i0 p2i0Var4;
        boolean z14;
        long j6;
        long j7;
        o0u0 o0u0Var = this.h1;
        hp00 hp00Var = this.v1;
        drh0 drh0Var2 = this.Q0;
        int i9 = this.p1;
        boolean z15 = this.q1;
        oqe1 oqe1Var2 = this.t;
        dqe1 dqe1Var = this.X;
        boolean z16 = this.a1;
        if (sqe1Var.p()) {
            p2i0 p2i0Var5 = o0u0.u;
            boolean z17 = (p2i0Var5.equals(o0u0Var.b) && o0u0Var.s == 0) ? false : true;
            sqe1Var3 = sqe1Var;
            gp00Var = new gp00(p2i0Var5, 0L, -9223372036854775807L, false, true, false, z17, z17 && z && !o0u0Var.a.p() && !o0u0Var.a.g(o0u0Var.b.a, dqe1Var).f, 4);
        } else {
            p2i0 p2i0Var6 = o0u0Var.b;
            Object obj4 = p2i0Var6.a;
            sqe1 sqe1Var4 = o0u0Var.a;
            boolean z18 = sqe1Var4.p() || sqe1Var4.g(p2i0Var6.a, dqe1Var).f;
            long j8 = (o0u0Var.b.c() || z18) ? o0u0Var.c : o0u0Var.s;
            if (hp00Var != null) {
                p2i0Var = p2i0Var6;
                j = 1;
                sqe1Var2 = sqe1Var;
                Pair pairW = W(sqe1Var2, hp00Var, true, i9, z15, oqe1Var2, dqe1Var);
                if (pairW == null) {
                    iA = sqe1Var2.a(z15);
                    jLongValue2 = j8;
                    z12 = true;
                    z11 = false;
                    z10 = false;
                } else {
                    long j9 = hp00Var.c;
                    Object obj5 = pairW.first;
                    if (j9 == -9223372036854775807L) {
                        iA = sqe1Var2.g(obj5, dqe1Var).c;
                        jLongValue2 = j8;
                        z9 = false;
                    } else {
                        jLongValue2 = ((Long) pairW.second).longValue();
                        obj4 = obj5;
                        iA = -1;
                        z9 = true;
                    }
                    z10 = o0u0Var.e == 4;
                    z11 = z9;
                    z12 = false;
                }
                j8 = jLongValue2;
                z3 = z12;
                oqe1Var = oqe1Var2;
                z4 = z11;
                obj = obj4;
                z2 = z10;
                i = -1;
            } else {
                p2i0Var = p2i0Var6;
                j = 1;
                sqe1Var2 = sqe1Var;
                if (o0u0Var.a.p()) {
                    iA = sqe1Var2.a(z15);
                    oqe1Var = oqe1Var2;
                    obj = obj4;
                } else if (sqe1Var2.b(obj4) == -1) {
                    obj = obj4;
                    int iX = X(oqe1Var2, dqe1Var, i9, z15, obj, o0u0Var.a, sqe1Var2);
                    oqe1Var = oqe1Var2;
                    if (iX == -1) {
                        sqe1Var2 = sqe1Var2;
                        dqe1Var = dqe1Var;
                        iA2 = sqe1Var2.a(z15);
                        z5 = true;
                    } else {
                        sqe1Var2 = sqe1Var2;
                        dqe1Var = dqe1Var;
                        iA2 = iX;
                        z5 = false;
                    }
                    z3 = z5;
                    iA = iA2;
                    j8 = j8;
                    i = -1;
                    z2 = false;
                    z4 = false;
                } else {
                    oqe1Var = oqe1Var2;
                    obj = obj4;
                    if (j8 == -9223372036854775807L) {
                        iA = sqe1Var2.g(obj, dqe1Var).c;
                    } else if (z18) {
                        o0u0Var.a.g(p2i0Var.a, dqe1Var);
                        if (o0u0Var.a.n(dqe1Var.c, oqe1Var, 0L).n == o0u0Var.a.b(p2i0Var.a)) {
                            Pair pairI = sqe1Var2.i(oqe1Var, dqe1Var, sqe1Var2.g(obj, dqe1Var).c, j8 + dqe1Var.e);
                            obj = pairI.first;
                            jK = ((Long) pairI.second).longValue();
                        } else {
                            jK = sqe1Var2.g(obj, dqe1Var).d != -9223372036854775807L ? zoi1.k(j8, 0L, dqe1Var.d - 1) : j8;
                        }
                        j8 = jK;
                        i = -1;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        i = -1;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                i = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (iA != i) {
                Pair pairI2 = sqe1Var2.i(oqe1Var, dqe1Var, iA, -9223372036854775807L);
                obj2 = pairI2.first;
                i2 = i;
                jLongValue = ((Long) pairI2.second).longValue();
                j8 = -9223372036854775807L;
            } else {
                obj2 = obj;
                jLongValue = j8;
                i2 = i;
            }
            p2i0 p2i0VarV = drh0Var2.v(o0u0Var, sqe1Var, obj2, jLongValue, z16, z18);
            sqe1Var3 = sqe1Var;
            long j10 = jLongValue;
            Object obj6 = obj2;
            int i10 = p2i0VarV.e;
            boolean z19 = i10 == i2 || ((i8 = p2i0Var.e) != i2 && i10 >= i8);
            boolean zEquals2 = p2i0Var.a.equals(obj6);
            boolean z20 = zEquals2 && !p2i0Var.c() && !p2i0VarV.c() && z19;
            dqe1 dqe1VarG = sqe1Var3.g(obj6, dqe1Var);
            if (z18 || j8 != j8) {
                z6 = false;
            } else {
                Object obj7 = p2i0Var.a;
                int i11 = p2i0Var.c;
                int i12 = p2i0Var.b;
                if (obj7.equals(p2i0VarV.a) && (!(p2i0Var.c() && dqe1VarG.h(i12)) ? p2i0VarV.c() && dqe1VarG.h(p2i0VarV.b) : !(dqe1VarG.e(i12, i11) == 4 || dqe1VarG.e(i12, i11) == 2))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (z20 || z6) {
                p2i0VarV = p2i0Var;
            }
            if (p2i0VarV.c()) {
                if (p2i0VarV.equals(p2i0Var)) {
                    j10 = o0u0Var.s;
                } else {
                    sqe1Var3.g(p2i0VarV.a, dqe1Var);
                    jMin = p2i0VarV.c == dqe1Var.f(p2i0VarV.b) ? dqe1Var.g.b : 0L;
                }
                j2 = j8;
                if (p2i0VarV.equals(o0u0Var.b) || jMin != o0u0Var.s) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (sqe1Var3.b(o0u0Var.b.a) == -1) {
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                Object obj8 = p2i0VarV.a;
                obj3 = o0u0Var.b.a;
                zEquals = obj8.equals(obj3);
                r7 = obj3;
                if (zEquals || p2i0VarV.b == -1) {
                    r7 = obj3;
                    r7 = i7;
                    r7 = obj3;
                    i6 = i5;
                    r8 = r7;
                } else {
                    bv0 bv0VarA = sqe1Var3.g(p2i0VarV.a, dqe1Var).g.a(p2i0VarV.b);
                    i7 = p2i0VarV.c;
                    int[] iArr = bv0VarA.f;
                    if (i7 >= iArr.length || iArr[i7] != 2) {
                        r7 = obj3;
                        r7 = i7;
                        r7 = obj3;
                        i6 = 0;
                        r8 = i7;
                    } else {
                        r7 = obj3;
                        r7 = i7;
                        r7 = obj3;
                        i6 = i5;
                        r8 = r7;
                    }
                }
                if (z7 || !z || o0u0Var.a.p() || o0u0Var.a.g(o0u0Var.b.a, dqe1Var).f) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                gp00Var = new gp00(p2i0VarV, jMin, j2, z2, z3, z4, z7, z8, i6);
            } else if (zEquals2 && p2i0Var.c()) {
                bv0 bv0VarA2 = sqe1Var3.g(obj6, dqe1Var).g.a(p2i0Var.b);
                long j11 = bv0VarA2.j;
                long j12 = o0u0Var.c;
                if (j12 != -9223372036854775807L) {
                    long j13 = bv0VarA2.a;
                    if (j13 == Long.MIN_VALUE || j13 + j11 > j12) {
                        i3 = bv0VarA2.b;
                        i4 = p2i0Var.c;
                        if (i3 <= i4 && bv0VarA2.f[i4] == 2) {
                            long j14 = sqe1Var3.g(obj6, dqe1Var).d;
                            jMin = j14 != -9223372036854775807L ? Math.min(j14 - j, j10 + j11) : j10 + j11;
                            j2 = jMin;
                        }
                    }
                } else {
                    i3 = bv0VarA2.b;
                    i4 = p2i0Var.c;
                    if (i3 <= i4) {
                    }
                }
                if (p2i0VarV.equals(o0u0Var.b)) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (sqe1Var3.b(o0u0Var.b.a) == -1) {
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                Object obj9 = p2i0VarV.a;
                obj3 = o0u0Var.b.a;
                zEquals = obj9.equals(obj3);
                r7 = obj3;
                if (zEquals) {
                    r7 = obj3;
                    r7 = i7;
                    r7 = obj3;
                    i6 = i5;
                    r8 = r7;
                } else {
                    r7 = obj3;
                    r7 = i7;
                    r7 = obj3;
                    i6 = i5;
                    r8 = r7;
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                gp00Var = new gp00(p2i0VarV, jMin, j2, z2, z3, z4, z7, z8, i6);
            }
            jMin = j10;
            j2 = j8;
            if (p2i0VarV.equals(o0u0Var.b)) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (sqe1Var3.b(o0u0Var.b.a) == -1) {
                i5 = 4;
            } else {
                i5 = 3;
            }
            Object obj10 = p2i0VarV.a;
            obj3 = o0u0Var.b.a;
            zEquals = obj10.equals(obj3);
            r7 = obj3;
            if (zEquals) {
                r7 = obj3;
                r7 = i7;
                r7 = obj3;
                i6 = i5;
                r8 = r7;
            } else {
                r7 = obj3;
                r7 = i7;
                r7 = obj3;
                i6 = i5;
                r8 = r7;
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            gp00Var = new gp00(p2i0VarV, jMin, j2, z2, z3, z4, z7, z8, i6);
        }
        p2i0 p2i0Var7 = gp00Var.a;
        long jB0 = gp00Var.b;
        try {
            if (gp00Var.e) {
                if (this.h1.e != 1) {
                    t0(4);
                }
                Q(false, false, false, true);
            }
            for (qd21 qd21Var : this.a) {
                qd21Var.a.O(sqe1Var3);
                jca jcaVar = qd21Var.c;
                if (jcaVar != null) {
                    jcaVar.O(sqe1Var3);
                }
            }
            try {
                if (gp00Var.g) {
                    sqe1 sqe1Var5 = sqe1Var3;
                    if (!sqe1Var5.p()) {
                        try {
                            for (brh0 brh0Var = this.Q0.i; brh0Var != null; brh0Var = brh0Var.m) {
                                if (brh0Var.g.a.equals(p2i0Var7)) {
                                    brh0Var.g = this.Q0.m(sqe1Var5, brh0Var.g);
                                }
                            }
                            p2i0Var2 = p2i0Var7;
                            try {
                                jB0 = b0(p2i0Var2, jB0, B(), gp00Var.d);
                            } catch (Throwable th) {
                                th = th;
                                jB0 = jB0;
                                r14 = sqe1Var5;
                                o0u0 o0u0Var2 = this.h1;
                                sqe1 sqe1Var6 = o0u0Var2.a;
                                p2i0 p2i0Var8 = o0u0Var2.b;
                                if (gp00Var.f) {
                                    j3 = jB0;
                                } else {
                                    j3 = -9223372036854775807L;
                                }
                                p2i0Var3 = p2i0Var2;
                                H0(r14, p2i0Var3, sqe1Var6, p2i0Var8, j3, false);
                                if (gp00Var.g) {
                                    long j15 = gp00Var.c;
                                    z13 = gp00Var.h;
                                    if (z13) {
                                        j4 = jB0;
                                    } else {
                                        j4 = this.h1.d;
                                    }
                                    this.h1 = z(p2i0Var3, jB0, j15, j4, z13, gp00Var.i);
                                } else {
                                    long j16 = gp00Var.c;
                                    z13 = gp00Var.h;
                                    if (z13) {
                                        j4 = jB0;
                                    } else {
                                        j4 = this.h1.d;
                                    }
                                    this.h1 = z(p2i0Var3, jB0, j16, j4, z13, gp00Var.i);
                                }
                                R();
                                V(r14, this.h1.a);
                                this.h1 = this.h1.j(r14);
                                if (!r14.p()) {
                                    this.v1 = null;
                                }
                                v(false);
                                this.g.j(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            p2i0Var2 = p2i0Var7;
                        }
                    }
                    o0u0 o0u0Var3 = this.h1;
                    sqe1 sqe1Var7 = o0u0Var3.a;
                    p2i0 p2i0Var9 = o0u0Var3.b;
                    if (gp00Var.f) {
                        j5 = jB0;
                    } else {
                        j5 = -9223372036854775807L;
                    }
                    p2i0Var4 = p2i0Var2;
                    H0(sqe1Var, p2i0Var4, sqe1Var7, p2i0Var9, j5, false);
                    if (gp00Var.g || gp00Var.c != this.h1.c) {
                        long j17 = gp00Var.c;
                        z14 = gp00Var.h;
                        if (z14) {
                            j7 = jB0;
                            j6 = j7;
                        } else {
                            j6 = this.h1.d;
                            j7 = jB0;
                        }
                        this.h1 = z(p2i0Var4, j7, j17, j6, z14, gp00Var.i);
                    }
                    R();
                    V(sqe1Var, this.h1.a);
                    this.h1 = this.h1.j(sqe1Var);
                    if (!sqe1Var.p()) {
                        this.v1 = null;
                    }
                    v(false);
                    this.g.j(2);
                }
                try {
                    long[] jArr = new long[this.a.length];
                    int i13 = 0;
                    while (true) {
                        qd21VarArr = this.a;
                        if (i13 >= qd21VarArr.length) {
                            break;
                        }
                        jArr[i13] = p(this.Q0.j[i13], i13);
                        i13++;
                    }
                    long[] jArr2 = new long[qd21VarArr.length];
                    int i14 = 0;
                    while (true) {
                        int length = this.a.length;
                        drh0Var = this.Q0;
                        if (i14 >= length) {
                            break;
                        }
                        jArr2[i14] = p(drh0Var.k[i14], i14);
                        i14++;
                        p2i0Var2 = p2i0Var7;
                        r14 = r13;
                        o0u0 o0u0Var4 = this.h1;
                        sqe1 sqe1Var8 = o0u0Var4.a;
                        p2i0 p2i0Var10 = o0u0Var4.b;
                        if (gp00Var.f) {
                            j3 = jB0;
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        p2i0Var3 = p2i0Var2;
                        H0(r14, p2i0Var3, sqe1Var8, p2i0Var10, j3, false);
                        if (gp00Var.g || gp00Var.c != this.h1.c) {
                            long j18 = gp00Var.c;
                            z13 = gp00Var.h;
                            if (z13) {
                                j4 = jB0;
                            } else {
                                j4 = this.h1.d;
                            }
                            this.h1 = z(p2i0Var3, jB0, j18, j4, z13, gp00Var.i);
                        }
                        R();
                        V(r14, this.h1.a);
                        this.h1 = this.h1.j(r14);
                        if (!r14.p()) {
                            this.v1 = null;
                        }
                        v(false);
                        this.g.j(2);
                        throw th;
                    }
                    int iY = drh0Var.y(sqe1Var3, this.w1, jArr, jArr2);
                    if ((iY & 1) != 0) {
                        Z(false);
                    } else if ((iY & 2) != 0) {
                        h();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r8 = sqe1Var3;
                    r13 = r8;
                    p2i0Var2 = p2i0Var7;
                    r14 = r13;
                    o0u0 o0u0Var5 = this.h1;
                    sqe1 sqe1Var9 = o0u0Var5.a;
                    p2i0 p2i0Var11 = o0u0Var5.b;
                    if (gp00Var.f) {
                        j3 = jB0;
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    p2i0Var3 = p2i0Var2;
                    H0(r14, p2i0Var3, sqe1Var9, p2i0Var11, j3, false);
                    if (gp00Var.g) {
                        long j19 = gp00Var.c;
                        z13 = gp00Var.h;
                        if (z13) {
                            j4 = jB0;
                        } else {
                            j4 = this.h1.d;
                        }
                        this.h1 = z(p2i0Var3, jB0, j19, j4, z13, gp00Var.i);
                    } else {
                        long j110 = gp00Var.c;
                        z13 = gp00Var.h;
                        if (z13) {
                            j4 = jB0;
                        } else {
                            j4 = this.h1.d;
                        }
                        this.h1 = z(p2i0Var3, jB0, j110, j4, z13, gp00Var.i);
                    }
                    R();
                    V(r14, this.h1.a);
                    this.h1 = this.h1.j(r14);
                    if (!r14.p()) {
                        this.v1 = null;
                    }
                    v(false);
                    this.g.j(2);
                    throw th;
                }
                p2i0Var2 = p2i0Var7;
                o0u0 o0u0Var6 = this.h1;
                sqe1 sqe1Var10 = o0u0Var6.a;
                p2i0 p2i0Var12 = o0u0Var6.b;
                if (gp00Var.f) {
                    j5 = jB0;
                } else {
                    j5 = -9223372036854775807L;
                }
                p2i0Var4 = p2i0Var2;
                H0(sqe1Var, p2i0Var4, sqe1Var10, p2i0Var12, j5, false);
                if (gp00Var.g) {
                    long j111 = gp00Var.c;
                    z14 = gp00Var.h;
                    if (z14) {
                        j7 = jB0;
                        j6 = j7;
                    } else {
                        j6 = this.h1.d;
                        j7 = jB0;
                    }
                    this.h1 = z(p2i0Var4, j7, j111, j6, z14, gp00Var.i);
                } else {
                    long j112 = gp00Var.c;
                    z14 = gp00Var.h;
                    if (z14) {
                        j7 = jB0;
                        j6 = j7;
                    } else {
                        j6 = this.h1.d;
                        j7 = jB0;
                    }
                    this.h1 = z(p2i0Var4, j7, j112, j6, z14, gp00Var.i);
                }
                R();
                V(sqe1Var, this.h1.a);
                this.h1 = this.h1.j(sqe1Var);
                if (!sqe1Var.p()) {
                    this.v1 = null;
                }
                v(false);
                this.g.j(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            r13 = sqe1Var3;
        }
    }

    public final void w0(float f) {
        this.F1 = f;
        float f2 = f * this.Z0.g;
        for (qd21 qd21Var : this.a) {
            jca jcaVar = qd21Var.a;
            if (jcaVar.b == 1) {
                jcaVar.b(2, Float.valueOf(f2));
                jca jcaVar2 = qd21Var.c;
                if (jcaVar2 != null) {
                    jcaVar2.b(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void x(arh0 arh0Var) {
        brh0 brh0Var;
        ip00 ip00Var;
        drh0 drh0Var = this.Q0;
        brh0 brh0Var2 = drh0Var.l;
        j7s j7sVar = this.Z;
        if (brh0Var2 == null || brh0Var2.a != arh0Var) {
            int i = 0;
            while (true) {
                if (i >= drh0Var.q.size()) {
                    brh0Var = null;
                    break;
                }
                brh0Var = (brh0) drh0Var.q.get(i);
                if (brh0Var.a == arh0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (brh0Var != null) {
                dm5.y(!brh0Var.e);
                float f = j7sVar.l().a;
                o0u0 o0u0Var = this.h1;
                brh0Var.h(f, o0u0Var.a, o0u0Var.l);
                brh0 brh0Var3 = drh0Var.m;
                if (brh0Var3 == null || brh0Var3.a != arh0Var) {
                    return;
                }
                F();
                return;
            }
            return;
        }
        brh0Var2.getClass();
        if (!brh0Var2.e) {
            float f2 = j7sVar.l().a;
            o0u0 o0u0Var2 = this.h1;
            brh0Var2.h(f2, o0u0Var2.a, o0u0Var2.l);
        }
        D0(brh0Var2.g.a, brh0Var2.n, brh0Var2.o);
        if (brh0Var2 == drh0Var.i) {
            S(brh0Var2.g.b, true);
            dm5.y(!B());
            m(drh0Var.d().g(), new boolean[this.a.length]);
            f0(brh0Var2);
            o0u0 o0u0Var3 = this.h1;
            p2i0 p2i0Var = o0u0Var3.b;
            long j = brh0Var2.g.b;
            ip00Var = this;
            ip00Var.h1 = z(p2i0Var, j, o0u0Var3.c, j, false, 5);
        } else {
            ip00Var = this;
        }
        ip00Var.E();
    }

    public final boolean x0() {
        o0u0 o0u0Var = this.h1;
        return o0u0Var.l && o0u0Var.n == 0;
    }

    public final void y(k2u0 k2u0Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.i1.e(1);
            }
            this.h1 = this.h1.g(k2u0Var);
        }
        float f2 = k2u0Var.a;
        brh0 brh0Var = this.Q0.i;
        while (true) {
            i = 0;
            if (brh0Var == null) {
                break;
            }
            qp00[] qp00VarArr = (qp00[]) brh0Var.o.d;
            int length = qp00VarArr.length;
            while (i < length) {
                qp00 qp00Var = qp00VarArr[i];
                if (qp00Var != null) {
                    qp00Var.i(f2);
                }
                i++;
            }
            brh0Var = brh0Var.m;
        }
        qd21[] qd21VarArr = this.a;
        int length2 = qd21VarArr.length;
        while (i < length2) {
            qd21 qd21Var = qd21VarArr[i];
            float f3 = k2u0Var.a;
            qd21Var.a.N(f, f3);
            jca jcaVar = qd21Var.c;
            if (jcaVar != null) {
                jcaVar.N(f, f3);
            }
            i++;
        }
    }

    public final boolean y0(sqe1 sqe1Var, p2i0 p2i0Var) {
        if (p2i0Var.c() || sqe1Var.p()) {
            return false;
        }
        int i = sqe1Var.g(p2i0Var.a, this.X).c;
        oqe1 oqe1Var = this.t;
        sqe1Var.m(i, oqe1Var);
        return oqe1Var.c() && oqe1Var.i && oqe1Var.f != -9223372036854775807L;
    }

    public final o0u0 z(p2i0 p2i0Var, long j, long j2, long j3, boolean z, int i) {
        bg11 bg11VarG;
        brh0 brh0Var;
        boolean z2;
        this.z1 = (!this.z1 && j == this.h1.s && p2i0Var.equals(this.h1.b)) ? false : true;
        R();
        o0u0 o0u0Var = this.h1;
        qnf1 qnf1Var = o0u0Var.h;
        o0g1 o0g1Var = o0u0Var.i;
        bg11 bg11Var = o0u0Var.j;
        if (this.R0.l) {
            brh0 brh0Var2 = this.Q0.i;
            qnf1Var = brh0Var2 == null ? qnf1.d : brh0Var2.n;
            o0g1Var = brh0Var2 == null ? this.e : brh0Var2.o;
            qp00[] qp00VarArr = (qp00[]) o0g1Var.d;
            v280 v280Var = new v280(4);
            boolean z3 = false;
            for (qp00 qp00Var : qp00VarArr) {
                if (qp00Var != null) {
                    hjj0 hjj0Var = qp00Var.e(0).m;
                    if (hjj0Var == null) {
                        v280Var.c(new hjj0(new rij0[0]));
                    } else {
                        v280Var.c(hjj0Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                bg11VarG = v280Var.g();
            } else {
                w280 w280Var = b380.b;
                bg11VarG = bg11.e;
            }
            bg11Var = bg11VarG;
            if (brh0Var2 != null) {
                crh0 crh0Var = brh0Var2.g;
                if (crh0Var.d != j2) {
                    brh0Var2.g = crh0Var.a(j2);
                }
            }
            qd21[] qd21VarArr = this.a;
            if (!B() && (brh0Var = this.Q0.i) != null) {
                o0g1 o0g1Var2 = brh0Var.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= qd21VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (o0g1Var2.o(i2)) {
                        if (qd21VarArr[i2].a.b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((ld21[]) o0g1Var2.c)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.t1) {
                    this.t1 = z5;
                    if (!z5 && this.h1.f105p) {
                        this.g.j(2);
                    }
                }
            }
        } else if (!p2i0Var.equals(o0u0Var.b)) {
            qnf1Var = qnf1.d;
            o0g1Var = this.e;
            w280 w280Var2 = b380.b;
            bg11Var = bg11.e;
        }
        o0g1 o0g1Var3 = o0g1Var;
        bg11 bg11Var2 = bg11Var;
        qnf1 qnf1Var2 = qnf1Var;
        if (z) {
            fp00 fp00Var = this.i1;
            if (!fp00Var.e || fp00Var.c == 5) {
                fp00Var.d = true;
                fp00Var.e = true;
                fp00Var.c = i;
            } else {
                dm5.m(i == 5);
            }
        }
        o0u0 o0u0Var2 = this.h1;
        return o0u0Var2.d(p2i0Var, j, j2, j3, q(o0u0Var2.q), qnf1Var2, o0g1Var3, bg11Var2);
    }

    public final void z0() {
        brh0 brh0Var = this.Q0.i;
        if (brh0Var == null) {
            return;
        }
        o0g1 o0g1Var = brh0Var.o;
        int i = 0;
        while (true) {
            qd21[] qd21VarArr = this.a;
            if (i >= qd21VarArr.length) {
                return;
            }
            if (o0g1Var.o(i)) {
                qd21VarArr[i].o();
            }
            i++;
        }
    }
}
