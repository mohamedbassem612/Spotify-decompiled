package p;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import com.comscore.streaming.ContentMediaFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yo00 extends j9a implements ExoPlayer {
    public final wgz0 A;
    public final short B;
    public final t01 C;
    public final pbq D;
    public final xo00 E;
    public final t7y F;
    public final t7y G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public t380 N;
    public final zu41 O;
    public ef81 P;
    public m8u0 Q;
    public tqh0 R;
    public tqh0 S;
    public ie30 T;
    public ie30 U;
    public Object V;
    public Surface W;
    public SurfaceHolder X;
    public kxa1 Y;
    public boolean Z;
    public TextureView a0;
    public final o0g1 b;
    public int b0;
    public final m8u0 c;
    public l291 c0;
    public final hsk d = new hsk();
    public far d0;
    public final Context e;
    public po7 e0;
    public final r8u0 f;
    public float f0;
    public final jca[] g;
    public float g0;
    public final jca[] h;
    public boolean h0;
    public final exs i;
    public qeo i0;
    public final wdd1 j;
    public final boolean j0;
    public final io00 k;
    public boolean k0;
    public final ip00 l;
    public final int l0;
    public final h9d0 m;
    public boolean m0;
    public final CopyOnWriteArraySet n;
    public final xqt n0;
    public final dqe1 o;
    public z1k1 o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f177p;
    public final short p0;
    public final boolean q;
    public final short q0;
    public final o2i0 r;
    public final short r0;
    public final pfr s;
    public tqh0 s0;
    public final Looper t;
    public o0u0 t0;
    public final o4a u;
    public int u0;
    public final rdd1 v;
    public long v0;
    public final so00 w;
    public final to00 x;
    public final rl1 y;
    public final uqs z;

    static {
        hph0.a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v8, types: [int, short] */
    public yo00(bo00 bo00Var, ww81 ww81Var) {
        xo00 xo00Var;
        try {
            oon1.A("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + zoi1.a + "]");
            Context context = bo00Var.a;
            this.e = context.getApplicationContext();
            cwa cwaVar = bo00Var.h;
            rdd1 rdd1Var = bo00Var.b;
            cwaVar.getClass();
            this.s = new pfr(rdd1Var);
            this.l0 = bo00Var.j;
            this.e0 = bo00Var.k;
            this.b0 = bo00Var.l ? 1 : 0;
            this.h0 = false;
            this.B = bo00Var.u;
            so00 so00Var = new so00(this);
            this.w = so00Var;
            this.x = new to00();
            Handler handler = new Handler(bo00Var.i);
            rd21 rd21Var = (rd21) bo00Var.c.get();
            jca[] jcaVarArrB = rd21Var.b(handler, so00Var, so00Var, so00Var, so00Var);
            this.g = jcaVarArrB;
            dm5.y(jcaVarArrB.length > 0);
            this.h = new jca[jcaVarArrB.length];
            int i = 0;
            while (true) {
                jca[] jcaVarArr = this.h;
                if (i >= jcaVarArr.length) {
                    break;
                }
                rd21Var.a(this.g[i]);
                jcaVarArr[i] = null;
                i++;
            }
            exs exsVar = (exs) bo00Var.e.get();
            this.i = exsVar;
            this.r = (o2i0) bo00Var.d.get();
            o4a o4aVar = (o4a) bo00Var.g.get();
            this.u = o4aVar;
            this.q = bo00Var.m;
            on51 on51Var = bo00Var.n;
            this.p0 = bo00Var.p;
            this.q0 = bo00Var.q;
            this.r0 = bo00Var.r;
            this.O = bo00Var.o;
            Looper looper = bo00Var.i;
            this.t = looper;
            rdd1 rdd1Var2 = bo00Var.b;
            this.v = rdd1Var2;
            r8u0 r8u0Var = ww81Var == null ? this : ww81Var;
            this.f = r8u0Var;
            this.m = new h9d0(looper, rdd1Var2, new n9v(this, (byte) 12));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.n = copyOnWriteArraySet;
            this.f177p = new ArrayList();
            this.P = new ef81();
            jca[] jcaVarArr2 = this.g;
            o0g1 o0g1Var = new o0g1(new ld21[jcaVarArr2.length], new qp00[jcaVarArr2.length], o3g1.b, (Object) null);
            this.b = o0g1Var;
            this.o = new dqe1();
            l8u0 l8u0Var = new l8u0();
            l8u0Var.a.e(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32});
            exsVar.getClass();
            l8u0Var.c(29, true);
            m8u0 m8u0VarD = l8u0Var.d();
            this.c = m8u0VarD;
            l8u0 l8u0Var2 = new l8u0();
            lls0 lls0Var = l8u0Var2.a;
            lls0Var.d(m8u0VarD.a);
            lls0Var.c(4);
            lls0Var.c(10);
            this.Q = l8u0Var2.d();
            this.j = rdd1Var2.a(looper, (Handler.Callback) null);
            io00 io00Var = new io00(this, (byte) 0);
            this.k = io00Var;
            this.t0 = o0u0.k(o0g1Var);
            this.s.c0(r8u0Var, looper);
            dbu0 dbu0Var = new dbu0(bo00Var.B);
            ip00 ip00Var = new ip00(this.e, this.g, this.h, exsVar, o0g1Var, (h6s) bo00Var.f.get(), o4aVar, this.H, this.I, this.s, on51Var, bo00Var.s, bo00Var.t, bo00Var.C, looper, rdd1Var2, io00Var, dbu0Var, this.x, bo00Var.D);
            wdd1 wdd1Var = ip00Var.g;
            this.l = ip00Var;
            Looper looper2 = ip00Var.i;
            this.f0 = 1.0f;
            this.H = 0;
            tqh0 tqh0Var = tqh0.M;
            this.R = tqh0Var;
            this.S = tqh0Var;
            this.s0 = tqh0Var;
            this.u0 = -1;
            this.i0 = qeo.d;
            this.j0 = true;
            J(this.s);
            o4aVar.c(new Handler(looper), this.s);
            copyOnWriteArraySet.add(this.w);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                Context context2 = this.e;
                boolean z = bo00Var.z;
                Looper looper3 = ip00Var.i;
                xo00Var = null;
                rdd1Var2.a(looper3, (Handler.Callback) null).f(new qo00(context2, z, this, dbu0Var));
            } else {
                xo00Var = null;
            }
            t01 t01Var = new t01(0, looper2, looper, rdd1Var2, new io00(this, (byte) 1));
            this.C = t01Var;
            t01Var.E(new fss((Object) this, (byte) 18));
            xo00 xo00Var2 = xo00Var;
            rl1 rl1Var = new rl1(bo00Var.a, looper2, bo00Var.i, this.w, rdd1Var2);
            this.y = rl1Var;
            rl1Var.H();
            boolean z2 = (bo00Var.v == Integer.MAX_VALUE || bo00Var.w == Integer.MAX_VALUE || bo00Var.x == Integer.MAX_VALUE || bo00Var.y == Integer.MAX_VALUE) ? false : true;
            uqs uqsVar = new uqs(context, looper2, rdd1Var2);
            this.z = uqsVar;
            if (uqsVar.a != z2) {
                uqsVar.a = z2;
                uqsVar.l(z2, uqsVar.b);
            }
            this.A = new wgz0(context, looper2, rdd1Var2);
            this.n0 = xqt.e;
            this.o0 = z1k1.d;
            this.c0 = l291.c;
            this.E = i2 >= 34 ? new xo00(this, context) : xo00Var2;
            this.F = new t7y((byte) 9);
            this.G = new t7y((byte) 9);
            this.D = new pbq(this, this.w, rdd1Var2, bo00Var.v, bo00Var.w, bo00Var.x, bo00Var.y);
            wdd1Var.c(38, this.O).b();
            wdd1Var.d(this.e0, 31, 0, 0).b();
            B1(1, 3, this.e0);
            B1(2, 4, Integer.valueOf(this.b0));
            B1(2, 5, 0);
            B1(1, 9, Boolean.valueOf(this.h0));
            B1(6, 8, this.x);
            B1(-1, 16, Integer.valueOf(this.l0));
        } finally {
            this.d.f();
        }
    }

    public static long t1(o0u0 o0u0Var) {
        oqe1 oqe1Var = new oqe1();
        dqe1 dqe1Var = new dqe1();
        o0u0Var.a.g(o0u0Var.b.a, dqe1Var);
        long j = o0u0Var.c;
        return j == -9223372036854775807L ? o0u0Var.a.n(dqe1Var.c, oqe1Var, 0L).l : dqe1Var.e + j;
    }

    public static o0u0 u1(o0u0 o0u0Var, int i) {
        o0u0 o0u0VarH = o0u0Var.h(i);
        return (i == 1 || i == 4) ? o0u0VarH.b(false) : o0u0VarH;
    }

    public final void A() {
        J1();
    }

    public final void A0(int i, int i2) {
        J1();
    }

    public final void A1() {
        kxa1 kxa1Var = this.Y;
        so00 so00Var = this.w;
        if (kxa1Var != null) {
            sbu0 sbu0VarN1 = n1(this.x);
            sbu0VarN1.d(10000);
            sbu0VarN1.c(null);
            sbu0VarN1.b();
            this.Y.a.remove(so00Var);
            this.Y = null;
        }
        TextureView textureView = this.a0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != so00Var) {
                oon1.H("SurfaceTextureListener already unset or replaced.");
            } else {
                this.a0.setSurfaceTextureListener(null);
            }
            this.a0 = null;
        }
        SurfaceHolder surfaceHolder = this.X;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(so00Var);
            this.X = null;
        }
    }

    public final void B(int i) {
        J1();
    }

    public final void B1(int i, int i2, Object obj) {
        for (jca jcaVar : this.g) {
            if (i == -1 || jcaVar.b == i) {
                sbu0 sbu0VarN1 = n1(jcaVar);
                sbu0VarN1.d(i2);
                sbu0VarN1.c(obj);
                sbu0VarN1.b();
            }
        }
        for (jca jcaVar2 : this.h) {
            if (jcaVar2 != null && (i == -1 || jcaVar2.b == i)) {
                sbu0 sbu0VarN2 = n1(jcaVar2);
                sbu0VarN2.d(i2);
                sbu0VarN2.c(obj);
                sbu0VarN2.b();
            }
        }
    }

    public final l291 C() {
        J1();
        return this.c0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void C0(qba qbaVar) {
        J1();
        List listSingletonList = Collections.singletonList(qbaVar);
        J1();
        C1(listSingletonList, -1, -9223372036854775807L, true);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    public final void C1(List list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        o0u0 o0u0VarU1;
        boolean z2;
        int iA = i;
        int iQ1 = q1(this.t0);
        long jV = v();
        this.J++;
        ArrayList arrayList = this.f177p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            f3i0 f3i0Var = new f3i0((qba) list.get(i4), this.q);
            arrayList2.add(f3i0Var);
            arrayList.add(i4, new uo00(f3i0Var.b, f3i0Var.a));
        }
        this.P = this.P.a().b(0, arrayList2.size());
        uwu0 uwu0Var = new uwu0(arrayList, this.P);
        boolean zP = uwu0Var.p();
        int i5 = uwu0Var.g;
        if (!zP && iA >= i5) {
            throw new IllegalSeekPositionException();
        }
        if (!z) {
            if (iA == -1) {
                i2 = iQ1;
                j2 = jV;
            } else {
                j2 = j;
            }
            o0u0 o0u0VarV1 = v1(this.t0, uwu0Var, w1(uwu0Var, i2, j2));
            i3 = o0u0VarV1.e;
            if (i3 == 1) {
                i3 = 1;
            } else if (!uwu0Var.p()) {
                i3 = 4;
            } else if (i2 != -1) {
                if (i2 >= i5) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            o0u0VarU1 = u1(o0u0VarV1, i3);
            this.l.g.c(17, new cp00(arrayList2, this.P, i2, zoi1.W(j2))).b();
            if (!this.t0.b.a.equals(o0u0VarU1.b.a) || this.t0.a.p()) {
                z2 = false;
            } else {
                z2 = true;
            }
            H1(o0u0VarU1, 0, z2, 4, p1(o0u0VarU1), -1, false);
        }
        iA = uwu0Var.a(this.I);
        j2 = -9223372036854775807L;
        i2 = iA;
        o0u0 o0u0VarV2 = v1(this.t0, uwu0Var, w1(uwu0Var, i2, j2));
        i3 = o0u0VarV2.e;
        if (i3 == 1) {
            i3 = 1;
        } else if (!uwu0Var.p()) {
            i3 = 4;
        } else if (i2 != -1) {
            if (i2 >= i5) {
                i3 = 4;
            } else {
                i3 = 2;
            }
        }
        o0u0VarU1 = u1(o0u0VarV2, i3);
        this.l.g.c(17, new cp00(arrayList2, this.P, i2, zoi1.W(j2))).b();
        if (this.t0.b.a.equals(o0u0VarU1.b.a)) {
            z2 = false;
        } else {
            z2 = false;
        }
        H1(o0u0VarU1, 0, z2, 4, p1(o0u0VarU1), -1, false);
    }

    public final void D(int i, int i2, List list) {
        J1();
        dm5.m(i >= 0 && i2 >= i);
        ArrayList arrayList = this.f177p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            int i3 = i;
            while (true) {
                if (i3 >= iMin) {
                    this.J++;
                    this.l.g.d(list, 27, i, iMin).b();
                    for (int i4 = i; i4 < iMin; i4++) {
                        uo00 uo00Var = (uo00) arrayList.get(i4);
                        sqe1 sqe1Var = uo00Var.c;
                        yoh0 yoh0Var = (yoh0) list.get(i4 - i);
                        uo00Var.c = sqe1Var instanceof eve1 ? new eve1(((eve1) sqe1Var).e, yoh0Var) : new eve1(sqe1Var, yoh0Var);
                    }
                    H1(this.t0.j(new uwu0(arrayList, this.P)), 0, false, 4, -9223372036854775807L, -1, false);
                    return;
                }
                if (!((uo00) arrayList.get(i3)).b.X.c((yoh0) list.get(i3 - i))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ArrayList arrayListM1 = m1(list);
        if (!this.t0.a.p()) {
            o0u0 o0u0VarZ1 = z1(j1(this.t0, iMin, arrayListM1), i, iMin);
            H1(o0u0VarZ1, 0, !o0u0VarZ1.b.a.equals(this.t0.b.a), 4, p1(o0u0VarZ1), -1, false);
        } else {
            boolean z = this.u0 == -1;
            J1();
            C1(arrayListM1, -1, -9223372036854775807L, z);
        }
    }

    public final int D0() {
        J1();
        if (o()) {
            return this.t0.b.c;
        }
        return -1;
    }

    public final void D1(Surface surface) {
        Object obj = this.V;
        boolean zC = true;
        boolean z = (obj == null || obj == surface) ? false : true;
        long j = z ? this.B : -9223372036854775807L;
        ip00 ip00Var = this.l;
        if (!ip00Var.j1 && ip00Var.i.getThread().isAlive()) {
            hsk hskVar = new hsk(ip00Var.O0);
            ip00Var.g.c(30, new Pair(surface, hskVar)).b();
            if (j != -9223372036854775807L) {
                zC = hskVar.c(j);
            }
        }
        if (z) {
            Object obj2 = this.V;
            Surface surface2 = this.W;
            if (obj2 == surface2) {
                surface2.release();
                this.W = null;
            }
        }
        this.V = surface;
        if (zC) {
            return;
        }
        E1(new ExoPlaybackException(2, new ExoTimeoutException(3), ContentMediaFormat.FULL_CONTENT_MOVIE));
    }

    public final void E0(k0g1 k0g1Var) {
        k0g1 k0g1VarB;
        J1();
        exs exsVar = this.i;
        exsVar.getClass();
        k0g1 k0g1VarG0 = g0();
        if (this.M) {
            this.N = k0g1Var.I;
            t380 t380Var = this.O.a;
            j0g1 j0g1VarA = k0g1Var.a();
            mjh1 mjh1VarK = t380Var.k();
            while (mjh1VarK.hasNext()) {
                j0g1VarA.i(((Integer) mjh1VarK.next()).intValue(), true);
            }
            k0g1VarB = j0g1VarA.b();
        } else {
            k0g1VarB = k0g1Var;
        }
        if (!k0g1VarB.equals(exsVar.f)) {
            exsVar.p(k0g1VarB);
        }
        if (k0g1VarG0.equals(k0g1Var)) {
            return;
        }
        this.m.h(19, new no00(k0g1Var, (byte) 0));
    }

    public final void E1(ExoPlaybackException exoPlaybackException) {
        o0u0 o0u0Var = this.t0;
        o0u0 o0u0VarC = o0u0Var.c(o0u0Var.b);
        o0u0VarC.q = o0u0VarC.s;
        o0u0VarC.r = 0L;
        o0u0 o0u0VarU1 = u1(o0u0VarC, 1);
        if (exoPlaybackException != null) {
            o0u0VarU1 = o0u0VarU1.f(exoPlaybackException);
        }
        this.J++;
        this.l.g.a(6).b();
        H1(o0u0VarU1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void F1() {
        m8u0 m8u0Var = this.Q;
        String str = zoi1.a;
        r8u0 r8u0Var = this.f;
        boolean zO = r8u0Var.o();
        boolean zO0 = r8u0Var.O0();
        boolean zB0 = r8u0Var.B0();
        boolean zV = r8u0Var.V();
        boolean zE1 = r8u0Var.e1();
        boolean zB1 = r8u0Var.b0();
        boolean zP = r8u0Var.d0().p();
        l8u0 l8u0Var = new l8u0();
        l8u0Var.a.d(this.c.a);
        boolean z = !zO;
        l8u0Var.c(4, z);
        boolean z2 = false;
        l8u0Var.c(5, zO0 && !zO);
        l8u0Var.c(6, zB0 && !zO);
        l8u0Var.c(7, !zP && (zB0 || !zE1 || zO0) && !zO);
        l8u0Var.c(8, zV && !zO);
        l8u0Var.c(9, !zP && (zV || (zE1 && zB1)) && !zO);
        l8u0Var.c(10, z);
        l8u0Var.c(11, zO0 && !zO);
        if (zO0 && !zO) {
            z2 = true;
        }
        l8u0Var.c(12, z2);
        m8u0 m8u0VarD = l8u0Var.d();
        this.Q = m8u0VarD;
        if (m8u0VarD.equals(m8u0Var)) {
            return;
        }
        this.m.c(13, new io00(this, (byte) 2));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final sbu0 G(rbu0 rbu0Var) {
        J1();
        return n1(rbu0Var);
    }

    public final void G0(List list, int i, long j) {
        J1();
        ArrayList arrayListM1 = m1(list);
        J1();
        C1(arrayListM1, i, j, false);
    }

    public final void G1(int i, boolean z) {
        int i2;
        if (this.M) {
            i2 = 4;
        } else {
            i2 = (this.t0.n != 1 || z) ? 0 : 1;
        }
        o0u0 o0u0VarA = this.t0;
        if (o0u0VarA.l == z && o0u0VarA.n == i2 && o0u0VarA.m == i) {
            return;
        }
        this.J++;
        if (o0u0VarA.f105p) {
            o0u0VarA = o0u0VarA.a();
        }
        o0u0 o0u0VarE = o0u0VarA.e(i, i2, z);
        this.l.g.b(1, z ? 1 : 0, i | (i2 << 4)).b();
        H1(o0u0VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void H(int i, int i2) {
        J1();
        dm5.m(i >= 0 && i2 >= i);
        int size = this.f177p.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        o0u0 o0u0VarZ1 = z1(this.t0, i, iMin);
        H1(o0u0VarZ1, 0, !o0u0VarZ1.b.a.equals(this.t0.b.a), 4, p1(o0u0VarZ1), -1, false);
    }

    public final void H1(final o0u0 o0u0Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        yoh0 yoh0Var;
        byte b;
        final byte b2;
        int i5;
        int i6;
        Object obj;
        yoh0 yoh0Var2;
        Object obj2;
        long jT1;
        long jT2;
        Object obj3;
        yoh0 yoh0Var3;
        Object obj4;
        o0u0 o0u0Var2 = this.t0;
        this.t0 = o0u0Var;
        if (!o0u0Var.a.p()) {
            dm5.z(o0u0Var.a.b(o0u0Var.b.a) != -1, String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", o0u0Var.b.a, o0u0Var.a.getClass().getName(), Integer.valueOf(o0u0Var.a.o())));
        }
        boolean zEquals = o0u0Var2.a.equals(o0u0Var.a);
        oqe1 oqe1Var = (oqe1) ((j9a) this).a;
        dqe1 dqe1Var = this.o;
        sqe1 sqe1Var = o0u0Var2.a;
        p2i0 p2i0Var = o0u0Var2.b;
        sqe1 sqe1Var2 = o0u0Var.a;
        p2i0 p2i0Var2 = o0u0Var.b;
        if (sqe1Var2.p() && sqe1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (sqe1Var2.p() != sqe1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!sqe1Var.n(sqe1Var.g(p2i0Var.a, dqe1Var).c, oqe1Var, 0L).a.equals(sqe1Var2.n(sqe1Var2.g(p2i0Var2.a, dqe1Var).c, oqe1Var, 0L).a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    bhn0.w();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && p2i0Var.d < p2i0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            yoh0Var = o0u0Var.a.p() ? null : o0u0Var.a.n(o0u0Var.a.g(o0u0Var.b.a, this.o).c, (oqe1) ((j9a) this).a, 0L).c;
            this.s0 = tqh0.M;
        } else {
            yoh0Var = null;
        }
        if (zBooleanValue || !o0u0Var2.j.equals(o0u0Var.j)) {
            upq upqVarA = this.s0.a();
            List list = o0u0Var.j;
            for (int i7 = 0; i7 < list.size(); i7++) {
                hjj0 hjj0Var = (hjj0) list.get(i7);
                int i8 = 0;
                while (true) {
                    rij0[] rij0VarArr = hjj0Var.a;
                    if (i8 < rij0VarArr.length) {
                        rij0VarArr[i8].b(upqVarA);
                        i8++;
                    }
                }
            }
            this.s0 = new tqh0(upqVarA);
        }
        tqh0 tqh0VarK1 = k1();
        boolean zEquals2 = tqh0VarK1.equals(this.R);
        this.R = tqh0VarK1;
        boolean z3 = o0u0Var2.l != o0u0Var.l;
        boolean z4 = o0u0Var2.e != o0u0Var.e;
        if (z4 || z3) {
            I1();
        }
        boolean z5 = o0u0Var2.g != o0u0Var.g;
        if (!zEquals) {
            this.m.c(0, new s7s(o0u0Var, i));
        }
        if (z) {
            dqe1 dqe1Var2 = new dqe1();
            if (o0u0Var2.a.p()) {
                i5 = i3;
                i6 = i5;
                obj = null;
                yoh0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = o0u0Var2.b.a;
                o0u0Var2.a.g(obj5, dqe1Var2);
                int i9 = dqe1Var2.c;
                int iB = o0u0Var2.a.b(obj5);
                obj = o0u0Var2.a.n(i9, (oqe1) ((j9a) this).a, 0L).a;
                yoh0Var2 = ((oqe1) ((j9a) this).a).c;
                obj2 = obj5;
                i5 = i9;
                i6 = iB;
            }
            p2i0 p2i0Var3 = o0u0Var2.b;
            if (i2 == 0) {
                boolean zC = p2i0Var3.c();
                p2i0 p2i0Var4 = o0u0Var2.b;
                if (zC) {
                    jT1 = dqe1Var2.a(p2i0Var4.b, p2i0Var4.c);
                    jT2 = t1(o0u0Var2);
                } else {
                    jT1 = p2i0Var4.e != -1 ? t1(this.t0) : dqe1Var2.e + dqe1Var2.d;
                    jT2 = jT1;
                }
            } else if (p2i0Var3.c()) {
                jT1 = o0u0Var2.s;
                jT2 = t1(o0u0Var2);
            } else {
                jT1 = dqe1Var2.e + o0u0Var2.s;
                jT2 = jT1;
            }
            long jN0 = zoi1.n0(jT1);
            long jN1 = zoi1.n0(jT2);
            p2i0 p2i0Var5 = o0u0Var2.b;
            p8u0 p8u0Var = new p8u0(obj, i5, yoh0Var2, obj2, i6, jN0, jN1, p2i0Var5.b, p2i0Var5.c);
            oqe1 oqe1Var2 = (oqe1) ((j9a) this).a;
            int iQ0 = Q0();
            int iV0 = v0();
            if (this.t0.a.p()) {
                obj3 = null;
                yoh0Var3 = null;
                obj4 = null;
            } else {
                o0u0 o0u0Var3 = this.t0;
                Object obj6 = o0u0Var3.b.a;
                o0u0Var3.a.g(obj6, this.o);
                iV0 = this.t0.a.b(obj6);
                Object obj7 = this.t0.a.n(iQ0, oqe1Var2, 0L).a;
                yoh0Var3 = oqe1Var2.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i10 = iV0;
            long jN2 = zoi1.n0(j);
            long jN3 = this.t0.b.c() ? zoi1.n0(t1(this.t0)) : jN2;
            p2i0 p2i0Var6 = this.t0.b;
            b = 0;
            this.m.c(11, new oo00(i2, p8u0Var, new p8u0(obj3, iQ0, yoh0Var3, obj4, i10, jN2, jN3, p2i0Var6.b, p2i0Var6.c), (byte) 0));
        } else {
            z3 = z3;
            zEquals2 = zEquals2;
            zBooleanValue = zBooleanValue;
            b = 0;
        }
        if (zBooleanValue) {
            this.m.c(1, new po00(yoh0Var, iIntValue, b));
        }
        if (o0u0Var2.f != o0u0Var.f) {
            final byte b3 = 8;
            this.m.c(10, new e9d0() { // from class: p.go00
                public final void invoke(Object obj8) {
                    byte b4 = b3;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj8;
                    switch (b4) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
            if (o0u0Var.f != null) {
                final byte b4 = 9;
                this.m.c(10, new e9d0() { // from class: p.go00
                    public final void invoke(Object obj8) {
                        byte b5 = b4;
                        o0u0 o0u0Var4 = o0u0Var;
                        o8u0 o8u0Var = (o8u0) obj8;
                        switch (b5) {
                            case 0:
                                o8u0Var.C((o3g1) o0u0Var4.i.e);
                                break;
                            case 1:
                                o8u0Var.x(o0u0Var4.g);
                                o8u0Var.e0(o0u0Var4.g);
                                break;
                            case 2:
                                o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                                break;
                            case 3:
                                o8u0Var.H(o0u0Var4.e);
                                break;
                            case 4:
                                o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                                break;
                            case 5:
                                o8u0Var.w(o0u0Var4.n);
                                break;
                            case 6:
                                o8u0Var.E0(o0u0Var4.m());
                                break;
                            case 7:
                                o8u0Var.r0(o0u0Var4.o);
                                break;
                            case 8:
                                o8u0Var.x0(o0u0Var4.f);
                                break;
                            default:
                                o8u0Var.n(o0u0Var4.f);
                                break;
                        }
                    }
                });
            }
        }
        o0g1 o0g1Var = o0u0Var2.i;
        o0g1 o0g1Var2 = o0u0Var.i;
        if (o0g1Var != o0g1Var2) {
            exs exsVar = this.i;
            Object obj8 = o0g1Var2.f;
            exsVar.getClass();
            exsVar.c = (kqg0) obj8;
            b2 = 0;
            this.m.c(2, new e9d0() { // from class: p.go00
                public final void invoke(Object obj9) {
                    byte b5 = b2;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj9;
                    switch (b5) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
        } else {
            b2 = 0;
        }
        if (!zEquals2) {
            this.m.c(14, new ho00(this.R, b2));
        }
        if (z5) {
            final byte b5 = 1;
            this.m.c(3, new e9d0() { // from class: p.go00
                public final void invoke(Object obj9) {
                    byte b6 = b5;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj9;
                    switch (b6) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final byte b6 = 2;
            this.m.c(-1, new e9d0() { // from class: p.go00
                public final void invoke(Object obj9) {
                    byte b7 = b6;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj9;
                    switch (b7) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
        }
        final byte b7 = 4;
        if (z4) {
            final byte b8 = 3;
            this.m.c(4, new e9d0() { // from class: p.go00
                public final void invoke(Object obj9) {
                    byte b9 = b8;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj9;
                    switch (b9) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
        }
        final byte b9 = 5;
        if (z3 || o0u0Var2.m != o0u0Var.m) {
            this.m.c(5, new e9d0() { // from class: p.go00
                public final void invoke(Object obj9) {
                    byte b10 = b7;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj9;
                    switch (b10) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
        }
        final byte b10 = 6;
        if (o0u0Var2.n != o0u0Var.n) {
            this.m.c(6, new e9d0() { // from class: p.go00
                public final void invoke(Object obj9) {
                    byte b11 = b9;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj9;
                    switch (b11) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
        }
        final byte b11 = 7;
        if (o0u0Var2.m() != o0u0Var.m()) {
            this.m.c(7, new e9d0() { // from class: p.go00
                public final void invoke(Object obj9) {
                    byte b12 = b10;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj9;
                    switch (b12) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
        }
        if (!o0u0Var2.o.equals(o0u0Var.o)) {
            this.m.c(12, new e9d0() { // from class: p.go00
                public final void invoke(Object obj9) {
                    byte b12 = b11;
                    o0u0 o0u0Var4 = o0u0Var;
                    o8u0 o8u0Var = (o8u0) obj9;
                    switch (b12) {
                        case 0:
                            o8u0Var.C((o3g1) o0u0Var4.i.e);
                            break;
                        case 1:
                            o8u0Var.x(o0u0Var4.g);
                            o8u0Var.e0(o0u0Var4.g);
                            break;
                        case 2:
                            o8u0Var.v0(o0u0Var4.e, o0u0Var4.l);
                            break;
                        case 3:
                            o8u0Var.H(o0u0Var4.e);
                            break;
                        case 4:
                            o8u0Var.g0(o0u0Var4.m, o0u0Var4.l);
                            break;
                        case 5:
                            o8u0Var.w(o0u0Var4.n);
                            break;
                        case 6:
                            o8u0Var.E0(o0u0Var4.m());
                            break;
                        case 7:
                            o8u0Var.r0(o0u0Var4.o);
                            break;
                        case 8:
                            o8u0Var.x0(o0u0Var4.f);
                            break;
                        default:
                            o8u0Var.n(o0u0Var4.f);
                            break;
                    }
                }
            });
        }
        F1();
        this.m.b();
        if (o0u0Var2.f105p != o0u0Var.f105p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((so00) it.next()).a.I1();
            }
        }
    }

    public final void I(SurfaceHolder surfaceHolder) {
        J1();
        if (surfaceHolder == null) {
            l1();
            return;
        }
        A1();
        this.Z = true;
        this.X = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            D1(null);
            x1(0, 0);
        } else {
            D1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            x1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final long I0() {
        J1();
        return this.q0;
    }

    public final void I1() {
        int playbackState = getPlaybackState();
        wgz0 wgz0Var = this.A;
        uqs uqsVar = this.z;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                J1();
                boolean z2 = this.t0.f105p;
                if (q() && !z2) {
                    z = true;
                }
                uqsVar.m(z);
                wgz0Var.f(q());
                return;
            }
            if (playbackState != 4) {
                bhn0.w();
                return;
            }
        }
        uqsVar.m(false);
        wgz0Var.f(false);
    }

    public final void J(o8u0 o8u0Var) {
        o8u0Var.getClass();
        this.m.a(o8u0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final far J0() {
        J1();
        return this.d0;
    }

    public final void J1() {
        this.d.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zoi1.a;
            Locale locale = Locale.US;
            String strP = cy30.p("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.j0) {
                eg.m(strP);
            } else {
                oon1.I(strP, this.k0 ? null : new IllegalStateException());
                this.k0 = true;
            }
        }
    }

    public final long K0() {
        J1();
        return o1(this.t0);
    }

    public final PlaybackException L() {
        J1();
        return this.t0.f;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final ie30 L0() {
        J1();
        return this.U;
    }

    public final void M(boolean z) {
        J1();
        G1(1, z);
    }

    public final void M0(int i, List list) {
        J1();
        ArrayList arrayListM1 = m1(list);
        J1();
        dm5.m(i >= 0);
        int iMin = Math.min(i, this.f177p.size());
        if (!this.t0.a.p()) {
            H1(j1(this.t0, iMin, arrayListM1), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.u0 == -1;
        J1();
        C1(arrayListM1, -1, -9223372036854775807L, z);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void N(qba qbaVar, long j) {
        J1();
        List listSingletonList = Collections.singletonList(qbaVar);
        J1();
        C1(listSingletonList, 0, j, false);
    }

    public final long N0() {
        J1();
        if (!o()) {
            return X0();
        }
        o0u0 o0u0Var = this.t0;
        return o0u0Var.k.equals(o0u0Var.b) ? zoi1.n0(this.t0.q) : getDuration();
    }

    public final void O() {
        J1();
        if (this.f0 == 0.0f) {
            float f = this.g0;
            if (f != 0.0f) {
                g(f);
            }
        }
    }

    public final void P(o8u0 o8u0Var) {
        J1();
        o8u0Var.getClass();
        this.m.e(o8u0Var);
    }

    public final tqh0 P0() {
        J1();
        return this.S;
    }

    public final int Q0() {
        J1();
        int iQ1 = q1(this.t0);
        if (iQ1 == -1) {
            return 0;
        }
        return iQ1;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final ie30 S() {
        J1();
        return this.T;
    }

    public final void S0(int i, int i2, int i3) {
        J1();
        dm5.m(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.f177p;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        sqe1 sqe1VarD0 = d0();
        this.J++;
        zoi1.V(i, iMin, iMin2, arrayList);
        ef81 ef81Var = this.P;
        ef81Var.getClass();
        this.P = ef81Var;
        uwu0 uwu0Var = new uwu0(arrayList, this.P);
        o0u0 o0u0Var = this.t0;
        o0u0 o0u0VarV1 = v1(o0u0Var, uwu0Var, r1(sqe1VarD0, uwu0Var, q1(o0u0Var), o1(this.t0)));
        ef81 ef81Var2 = this.P;
        ip00 ip00Var = this.l;
        ip00Var.getClass();
        ip00Var.g.c(19, new dp00(i, iMin, iMin2, ef81Var2)).b();
        H1(o0u0VarV1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void T(int i) {
        J1();
    }

    public final o3g1 U() {
        J1();
        return (o3g1) this.t0.i.e;
    }

    public final boolean U0() {
        J1();
        return false;
    }

    public final boolean V0() {
        J1();
        return this.I;
    }

    public final qeo W() {
        J1();
        return this.i0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void W0(qba qbaVar) {
        J1();
        List listSingletonList = Collections.singletonList(qbaVar);
        J1();
        J1();
        C1(listSingletonList, -1, -9223372036854775807L, true);
    }

    public final int X() {
        J1();
        if (o()) {
            return this.t0.b.b;
        }
        return -1;
    }

    public final long X0() {
        J1();
        if (this.t0.a.p()) {
            return this.v0;
        }
        o0u0 o0u0Var = this.t0;
        if (o0u0Var.k.d != o0u0Var.b.d) {
            return zoi1.n0(o0u0Var.a.n(Q0(), (oqe1) ((j9a) this).a, 0L).m);
        }
        long j = o0u0Var.q;
        if (this.t0.k.c()) {
            o0u0 o0u0Var2 = this.t0;
            dqe1 dqe1VarG = o0u0Var2.a.g(o0u0Var2.k.a, this.o);
            long jD = dqe1VarG.d(this.t0.k.b);
            j = jD == Long.MIN_VALUE ? dqe1VarG.d : jD;
        }
        o0u0 o0u0Var3 = this.t0;
        sqe1 sqe1Var = o0u0Var3.a;
        Object obj = o0u0Var3.k.a;
        dqe1 dqe1Var = this.o;
        sqe1Var.g(obj, dqe1Var);
        return zoi1.n0(j + dqe1Var.e);
    }

    public final void Y0(int i) {
        J1();
    }

    public final void Z(boolean z) {
        J1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void a0(qba qbaVar) {
        J1();
        C0(qbaVar);
        e();
    }

    public final boolean b() {
        J1();
        return this.t0.g;
    }

    public final tqh0 b1() {
        J1();
        return this.R;
    }

    public final float c() {
        J1();
        return this.f0;
    }

    public final int c0() {
        J1();
        return this.t0.n;
    }

    public final void c1(List list) {
        J1();
        ArrayList arrayListM1 = m1(list);
        J1();
        C1(arrayListM1, -1, -9223372036854775807L, true);
    }

    public final void d() {
        J1();
        if (this.f0 != 0.0f) {
            g(0.0f);
        }
    }

    public final sqe1 d0() {
        J1();
        return this.t0.a;
    }

    public final long d1() {
        J1();
        return this.p0;
    }

    public final void e() {
        J1();
        o0u0 o0u0Var = this.t0;
        if (o0u0Var.e != 1) {
            return;
        }
        o0u0 o0u0VarF = o0u0Var.f(null);
        o0u0 o0u0VarU1 = u1(o0u0VarF, o0u0VarF.a.p() ? 4 : 2);
        this.J++;
        this.l.g.a(29).b();
        H1(o0u0VarU1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final Looper e0() {
        return this.t;
    }

    public final void f0() {
        J1();
    }

    public final void g(float f) {
        J1();
        float fI = zoi1.i(f, 0.0f, 1.0f);
        float f2 = this.f0;
        if (f2 == fI) {
            return;
        }
        if (fI != 0.0f) {
            f2 = fI;
        }
        this.g0 = f2;
        this.f0 = fI;
        this.l.g.c(32, Float.valueOf(fI)).b();
        this.m.h(22, new lo00((byte) 0, fI));
    }

    public final k0g1 g0() {
        J1();
        zws zwsVar = this.i.f;
        if (!this.M) {
            return zwsVar;
        }
        zwsVar.getClass();
        yws ywsVar = new yws(zwsVar);
        ywsVar.j(this.N);
        return new zws(ywsVar);
    }

    public final void g1(int i, int i2, long j, boolean z) {
        J1();
        if (i == -1) {
            return;
        }
        dm5.m(i >= 0);
        sqe1 sqe1Var = this.t0.a;
        if (sqe1Var.p() || i < sqe1Var.o()) {
            pfr pfrVar = this.s;
            byte b = 26;
            if (!pfrVar.i) {
                tz3 tz3VarI = pfrVar.I();
                pfrVar.i = true;
                pfrVar.a0(tz3VarI, -1, new n7o((byte) 26));
            }
            this.J++;
            if (o()) {
                oon1.H("seekTo ignored because an ad is playing");
                fp00 fp00Var = new fp00(this.t0, (byte) 0);
                fp00Var.e(1);
                yo00 yo00Var = this.k.b;
                yo00Var.j.f(new e0i(yo00Var, fp00Var, b));
                return;
            }
            o0u0 o0u0VarH = this.t0;
            int i3 = o0u0VarH.e;
            if (i3 == 3 || (i3 == 4 && !sqe1Var.p())) {
                o0u0VarH = this.t0.h(2);
            }
            int iQ0 = Q0();
            o0u0 o0u0VarV1 = v1(o0u0VarH, sqe1Var, w1(sqe1Var, i, j));
            this.l.g.c(3, new hp00(sqe1Var, i, zoi1.W(j))).b();
            H1(o0u0VarV1, 0, true, 1, p1(o0u0VarV1), iQ0, z);
        }
    }

    public final long getDuration() {
        J1();
        if (!o()) {
            return u0();
        }
        o0u0 o0u0Var = this.t0;
        p2i0 p2i0Var = o0u0Var.b;
        sqe1 sqe1Var = o0u0Var.a;
        Object obj = p2i0Var.a;
        dqe1 dqe1Var = this.o;
        sqe1Var.g(obj, dqe1Var);
        return zoi1.n0(dqe1Var.a(p2i0Var.b, p2i0Var.c));
    }

    public final int getPlaybackState() {
        J1();
        return this.t0.e;
    }

    public final int getRepeatMode() {
        J1();
        return this.H;
    }

    public final void i0(tqh0 tqh0Var) {
        J1();
        tqh0Var.getClass();
        if (tqh0Var.equals(this.S)) {
            return;
        }
        this.S = tqh0Var;
        this.m.h(15, new io00(this, (byte) 3));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        J1();
        return this.M;
    }

    public final int j0() {
        J1();
        return 0;
    }

    public final o0u0 j1(o0u0 o0u0Var, int i, ArrayList arrayList) {
        sqe1 sqe1Var = o0u0Var.a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f177p;
            if (i2 >= size) {
                this.P = this.P.b(i, arrayList2.size());
                uwu0 uwu0Var = new uwu0(arrayList3, this.P);
                o0u0 o0u0VarV1 = v1(o0u0Var, uwu0Var, r1(sqe1Var, uwu0Var, q1(o0u0Var), o1(o0u0Var)));
                this.l.g.d(new cp00(arrayList2, this.P, -1, -9223372036854775807L), 18, i, 0).b();
                return o0u0VarV1;
            }
            f3i0 f3i0Var = new f3i0((qba) arrayList.get(i2), this.q);
            arrayList2.add(f3i0Var);
            arrayList3.add(i2 + i, new uo00(f3i0Var.b, f3i0Var.a));
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void k(int i) {
        J1();
        this.b0 = i;
        B1(2, 4, Integer.valueOf(i));
    }

    public final tqh0 k1() {
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            return this.s0;
        }
        yoh0 yoh0Var = sqe1VarD0.n(Q0(), (oqe1) ((j9a) this).a, 0L).c;
        upq upqVarA = this.s0.a();
        upqVarA.b(yoh0Var.d);
        return new tqh0(upqVarA);
    }

    public final k2u0 l() {
        J1();
        return this.t0.o;
    }

    public final void l1() {
        J1();
        A1();
        D1(null);
        x1(0, 0);
    }

    public final void m(k2u0 k2u0Var) {
        J1();
        if (this.t0.o.equals(k2u0Var)) {
            return;
        }
        o0u0 o0u0VarG = this.t0.g(k2u0Var);
        this.J++;
        this.l.g.c(4, k2u0Var).b();
        H1(o0u0VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final ArrayList m1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.b((yoh0) list.get(i)));
        }
        return arrayList;
    }

    public final void n(Surface surface) {
        J1();
        A1();
        D1(surface);
        int i = surface == null ? 0 : -1;
        x1(i, i);
    }

    public final m8u0 n0() {
        J1();
        return this.Q;
    }

    public final sbu0 n1(rbu0 rbu0Var) {
        int iQ1 = q1(this.t0);
        sqe1 sqe1Var = this.t0.a;
        if (iQ1 == -1) {
            iQ1 = 0;
        }
        ip00 ip00Var = this.l;
        return new sbu0(ip00Var, rbu0Var, sqe1Var, iQ1, ip00Var.i);
    }

    public final boolean o() {
        J1();
        return this.t0.b.c();
    }

    public final void o0(boolean z) {
        J1();
        if (this.I != z) {
            this.I = z;
            this.l.g.b(12, z ? 1 : 0, 0).b();
            mo00 mo00Var = new mo00((byte) 0, z);
            h9d0 h9d0Var = this.m;
            h9d0Var.c(9, mo00Var);
            F1();
            h9d0Var.b();
        }
    }

    public final long o1(o0u0 o0u0Var) {
        p2i0 p2i0Var = o0u0Var.b;
        long j = o0u0Var.c;
        sqe1 sqe1Var = o0u0Var.a;
        if (!p2i0Var.c()) {
            return zoi1.n0(p1(o0u0Var));
        }
        Object obj = o0u0Var.b.a;
        dqe1 dqe1Var = this.o;
        sqe1Var.g(obj, dqe1Var);
        if (j == -9223372036854775807L) {
            return zoi1.n0(sqe1Var.n(q1(o0u0Var), (oqe1) ((j9a) this).a, 0L).l);
        }
        return zoi1.n0(j) + zoi1.n0(dqe1Var.e);
    }

    public final long p() {
        J1();
        return zoi1.n0(this.t0.r);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final int p0() {
        J1();
        return this.g.length;
    }

    public final long p1(o0u0 o0u0Var) {
        if (o0u0Var.a.p()) {
            return zoi1.W(this.v0);
        }
        long jL = o0u0Var.f105p ? o0u0Var.l() : o0u0Var.s;
        if (o0u0Var.b.c()) {
            return jL;
        }
        sqe1 sqe1Var = o0u0Var.a;
        Object obj = o0u0Var.b.a;
        dqe1 dqe1Var = this.o;
        sqe1Var.g(obj, dqe1Var);
        return jL + dqe1Var.e;
    }

    public final boolean q() {
        J1();
        return this.t0.l;
    }

    public final long q0() {
        J1();
        return this.r0;
    }

    public final int q1(o0u0 o0u0Var) {
        return o0u0Var.a.p() ? this.u0 : o0u0Var.a.g(o0u0Var.b.a, this.o).c;
    }

    public final void r(po7 po7Var, boolean z) {
        J1();
        if (this.m0) {
            return;
        }
        boolean zEquals = Objects.equals(this.e0, po7Var);
        h9d0 h9d0Var = this.m;
        if (!zEquals) {
            this.e0 = po7Var;
            B1(1, 3, po7Var);
            h9d0Var.c(20, new jo00(po7Var, (byte) 0));
        }
        this.l.g.d(this.e0, 31, z ? 1 : 0, 0).b();
        h9d0Var.b();
    }

    public final Pair r1(sqe1 sqe1Var, uwu0 uwu0Var, int i, long j) {
        oqe1 oqe1Var = (oqe1) ((j9a) this).a;
        if (sqe1Var.p() || uwu0Var.p()) {
            int i2 = -1;
            boolean z = !sqe1Var.p() && uwu0Var.p();
            if (!z) {
                i2 = i;
            }
            return w1(uwu0Var, i2, z ? -9223372036854775807L : j);
        }
        Pair pairI = sqe1Var.i(oqe1Var, this.o, i, zoi1.W(j));
        Object obj = pairI.first;
        if (uwu0Var.b(obj) != -1) {
            return pairI;
        }
        int iX = ip00.X(oqe1Var, this.o, this.H, this.I, obj, sqe1Var, uwu0Var);
        if (iX == -1) {
            return w1(uwu0Var, -1, -9223372036854775807L);
        }
        uwu0Var.n(iX, oqe1Var, 0L);
        return w1(uwu0Var, iX, zoi1.n0(oqe1Var.l));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final jca s0(int i) {
        J1();
        return this.g[i];
    }

    public final int s1(int i) {
        J1();
        return this.g[i].b;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        J1();
        B1(4, 15, imageOutput);
    }

    public final void setRepeatMode(int i) {
        J1();
        if (this.H != i) {
            this.H = i;
            this.l.g.b(11, i, 0).b();
            nfr nfrVar = new nfr(i, (byte) 1);
            h9d0 h9d0Var = this.m;
            h9d0Var.c(8, nfrVar);
            F1();
            h9d0Var.b();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        k0g1 k0g1VarB;
        J1();
        if (z == this.M) {
            return;
        }
        this.M = z;
        zu41 zu41Var = this.O;
        if (!zu41Var.a.isEmpty()) {
            exs exsVar = this.i;
            exsVar.getClass();
            zws zwsVar = exsVar.f;
            if (z) {
                this.N = zwsVar.I;
                t380 t380Var = zu41Var.a;
                j0g1 j0g1VarA = zwsVar.a();
                mjh1 mjh1VarK = t380Var.k();
                while (mjh1VarK.hasNext()) {
                    j0g1VarA.i(((Integer) mjh1VarK.next()).intValue(), true);
                }
                k0g1VarB = j0g1VarA.b();
            } else {
                zwsVar.getClass();
                yws ywsVar = new yws(zwsVar);
                ywsVar.j(this.N);
                zws zwsVar2 = new zws(ywsVar);
                this.N = null;
                k0g1VarB = zwsVar2;
            }
            if (!k0g1VarB.equals(zwsVar)) {
                exsVar.p(k0g1VarB);
            }
        }
        this.l.g.c(36, Boolean.valueOf(z)).b();
        o0u0 o0u0Var = this.t0;
        G1(o0u0Var.m, o0u0Var.l);
    }

    public final void stop() {
        J1();
        E1(null);
        w280 w280Var = b380.b;
        this.i0 = new qeo(this.t0.s, bg11.e);
    }

    public final void t(Surface surface) {
        J1();
        if (surface == null || surface != this.V) {
            return;
        }
        l1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void t0(uz3 uz3Var) {
        J1();
        uz3Var.getClass();
        this.s.f.e(uz3Var);
    }

    public final long v() {
        J1();
        return zoi1.n0(p1(this.t0));
    }

    public final int v0() {
        J1();
        if (!this.t0.a.p()) {
            o0u0 o0u0Var = this.t0;
            return o0u0Var.a.b(o0u0Var.b.a);
        }
        int i = this.u0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final o0u0 v1(o0u0 o0u0Var, sqe1 sqe1Var, Pair pair) {
        bg11 bg11Var;
        dm5.m(sqe1Var.p() || pair != null);
        sqe1 sqe1Var2 = o0u0Var.a;
        long jO1 = o1(o0u0Var);
        o0u0 o0u0VarJ = o0u0Var.j(sqe1Var);
        if (sqe1Var.p()) {
            p2i0 p2i0Var = o0u0.u;
            long jW = zoi1.W(this.v0);
            qnf1 qnf1Var = qnf1.d;
            o0g1 o0g1Var = this.b;
            w280 w280Var = b380.b;
            o0u0 o0u0VarC = o0u0VarJ.d(p2i0Var, jW, jW, jW, 0L, qnf1Var, o0g1Var, bg11.e).c(p2i0Var);
            o0u0VarC.q = o0u0VarC.s;
            return o0u0VarC;
        }
        Object obj = o0u0VarJ.b.a;
        String str = zoi1.a;
        boolean zEquals = obj.equals(pair.first);
        p2i0 p2i0Var2 = !zEquals ? new p2i0(pair.first) : o0u0VarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jW2 = zoi1.W(jO1);
        if (!sqe1Var2.p()) {
            jW2 -= sqe1Var2.g(obj, this.o).e;
            if (zEquals && jW2 - jLongValue == 1 && jW2 == sqe1Var2.g(obj, this.o).d) {
                jW2--;
            }
        }
        if (!zEquals || jLongValue < jW2) {
            p2i0 p2i0Var3 = p2i0Var2;
            dm5.y(!p2i0Var3.c());
            qnf1 qnf1Var2 = !zEquals ? qnf1.d : o0u0VarJ.h;
            o0g1 o0g1Var2 = !zEquals ? this.b : o0u0VarJ.i;
            if (zEquals) {
                bg11Var = o0u0VarJ.j;
            } else {
                w280 w280Var2 = b380.b;
                bg11Var = bg11.e;
            }
            o0u0 o0u0VarC2 = o0u0VarJ.d(p2i0Var3, jLongValue, jLongValue, jLongValue, 0L, qnf1Var2, o0g1Var2, bg11Var).c(p2i0Var3);
            o0u0VarC2.q = jLongValue;
            return o0u0VarC2;
        }
        if (jLongValue != jW2) {
            p2i0 p2i0Var4 = p2i0Var2;
            dm5.y(!p2i0Var4.c());
            long jMax = Math.max(0L, o0u0VarJ.r - (jLongValue - jW2));
            long j = o0u0VarJ.q;
            if (o0u0VarJ.k.equals(o0u0VarJ.b)) {
                j = jLongValue + jMax;
            }
            o0u0 o0u0VarD = o0u0VarJ.d(p2i0Var4, jLongValue, jLongValue, jLongValue, jMax, o0u0VarJ.h, o0u0VarJ.i, o0u0VarJ.j);
            o0u0VarD.q = j;
            return o0u0VarD;
        }
        int iB = sqe1Var.b(o0u0VarJ.k.a);
        if (iB != -1 && sqe1Var.f(iB, this.o, false).c == sqe1Var.g(p2i0Var2.a, this.o).c) {
            return o0u0VarJ;
        }
        sqe1Var.g(p2i0Var2.a, this.o);
        boolean zC = p2i0Var2.c();
        dqe1 dqe1Var = this.o;
        long jA = zC ? dqe1Var.a(p2i0Var2.b, p2i0Var2.c) : dqe1Var.d;
        p2i0 p2i0Var5 = p2i0Var2;
        o0u0 o0u0VarC3 = o0u0VarJ.d(p2i0Var5, o0u0VarJ.s, o0u0VarJ.s, o0u0VarJ.d, jA - o0u0VarJ.s, o0u0VarJ.h, o0u0VarJ.i, o0u0VarJ.j).c(p2i0Var5);
        o0u0VarC3.q = jA;
        return o0u0VarC3;
    }

    public final z1k1 w0() {
        J1();
        return this.o0;
    }

    public final Pair w1(sqe1 sqe1Var, int i, long j) {
        oqe1 oqe1Var = (oqe1) ((j9a) this).a;
        if (sqe1Var.p()) {
            this.u0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.v0 = j;
            return null;
        }
        if (i == -1 || i >= sqe1Var.o()) {
            i = sqe1Var.a(this.I);
            j = zoi1.n0(sqe1Var.n(i, oqe1Var, 0L).l);
        }
        return sqe1Var.i(oqe1Var, this.o, i, zoi1.W(j));
    }

    public final po7 x0() {
        J1();
        return this.e0;
    }

    public final void x1(int i, int i2) {
        l291 l291Var = this.c0;
        if (i == l291Var.a && i2 == l291Var.b) {
            return;
        }
        this.c0 = new l291(i, i2);
        this.m.h(24, new ko00((byte) 0, i, i2));
        B1(2, 14, new l291(i, i2));
    }

    public final xqt y0() {
        J1();
        return this.n0;
    }

    public final void y1() {
        boolean zC;
        oon1.A("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + zoi1.a + "] [" + hph0.b() + "]");
        J1();
        this.y.H();
        this.z.m(false);
        this.A.f(false);
        xo00 xo00Var = this.E;
        if (xo00Var != null && Build.VERSION.SDK_INT >= 34) {
            xo00Var.a();
        }
        pbq pbqVar = this.D;
        ((wdd1) pbqVar.t).h();
        ((yo00) pbqVar.f).P((yjc1) pbqVar.b);
        ip00 ip00Var = this.l;
        if (ip00Var.j1 || !ip00Var.i.getThread().isAlive()) {
            zC = true;
        } else {
            ip00Var.j1 = true;
            hsk hskVar = new hsk(ip00Var.O0);
            ip00Var.g.c(7, hskVar).b();
            zC = hskVar.c(ip00Var.T0);
        }
        if (!zC) {
            this.m.h(10, new n9v((byte) 13));
        }
        this.m.d();
        this.j.h();
        this.u.a(this.s);
        o0u0 o0u0VarA = this.t0;
        if (o0u0VarA.f105p) {
            o0u0VarA = o0u0VarA.a();
            this.t0 = o0u0VarA;
        }
        o0u0 o0u0VarU1 = u1(o0u0VarA, 1);
        this.t0 = o0u0VarU1;
        o0u0 o0u0VarC = o0u0VarU1.c(o0u0VarU1.b);
        this.t0 = o0u0VarC;
        o0u0VarC.q = o0u0VarC.s;
        this.t0.r = 0L;
        pfr pfrVar = this.s;
        wdd1 wdd1Var = pfrVar.h;
        wdd1Var.getClass();
        wdd1Var.f(new fe(pfrVar, (byte) 26));
        A1();
        Surface surface = this.W;
        if (surface != null) {
            surface.release();
            this.W = null;
        }
        this.i0 = qeo.d;
        this.m0 = true;
        if (this.t0.a.p()) {
            return;
        }
        o0u0 o0u0Var = this.t0;
        boolean z = o0u0Var.a.b(o0u0Var.b.a) != -1;
        Locale locale = Locale.US;
        o0u0 o0u0Var2 = this.t0;
        dm5.z(z, String.format(locale, "periodUid %s not found in timeline %s with size %d", o0u0Var2.b.a, o0u0Var2.a.getClass().getName(), Integer.valueOf(this.t0.a.o())));
    }

    public final void z(int i, boolean z) {
        J1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void z0(uz3 uz3Var) {
        pfr pfrVar = this.s;
        pfrVar.getClass();
        pfrVar.f.a(uz3Var);
    }

    public final o0u0 z1(o0u0 o0u0Var, int i, int i2) {
        ArrayList arrayList;
        int iQ1 = q1(o0u0Var);
        long jO1 = o1(o0u0Var);
        sqe1 sqe1Var = o0u0Var.a;
        this.J++;
        int i3 = i2 - 1;
        while (true) {
            arrayList = this.f177p;
            if (i3 < i) {
                break;
            }
            arrayList.remove(i3);
            i3--;
        }
        ef81 ef81Var = this.P;
        int i4 = i2 - i;
        int[] iArr = ef81Var.b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.P = new ef81(iArr2, new Random(ef81Var.a.nextLong()));
        uwu0 uwu0Var = new uwu0(arrayList, this.P);
        o0u0 o0u0VarV1 = v1(o0u0Var, uwu0Var, r1(sqe1Var, uwu0Var, iQ1, jO1));
        int i9 = o0u0VarV1.e;
        if (i9 != 1 && i9 != 4 && iQ1 >= i && iQ1 < i2) {
            if (ip00.X((oqe1) ((j9a) this).a, this.o, this.H, this.I, o0u0Var.b.a, sqe1Var, uwu0Var) == -1) {
                o0u0VarV1 = u1(o0u0VarV1, 4);
            }
        }
        this.l.g.d(this.P, 20, i, i2).b();
        return o0u0VarV1;
    }
}
