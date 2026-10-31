package p;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u7u0 implements mpj1 {
    public static final dzs B = new dzs();
    public int A;
    public final Context a;
    public final dz81 b;
    public final SparseArray c;
    public final boolean d;
    public final a e;
    public final n7u0 f;
    public final rdd1 g;
    public final CopyOnWriteArraySet h;
    public final long i;
    public final xoj1 j;
    public w4c0 k = new w4c0();
    public ie30 l;
    public final m9x0 m;
    public final bg11 n;
    public wdd1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public npj1 f147p;
    public moj1 q;
    public long r;
    public int s;
    public Pair t;
    public int u;
    public byte v;
    public long w;
    public long x;
    public boolean y;
    public int z;

    public u7u0(o7u0 o7u0Var) {
        this.a = o7u0Var.a;
        dz81 dz81Var = o7u0Var.c;
        dz81Var.getClass();
        this.b = dz81Var;
        this.c = new SparseArray();
        w280 w280Var = b380.b;
        this.n = bg11.e;
        this.m = m9x0.W0;
        this.d = o7u0Var.d;
        rdd1 rdd1Var = o7u0Var.e;
        this.g = rdd1Var;
        long j = o7u0Var.g;
        this.i = j != -9223372036854775807L ? -j : -9223372036854775807L;
        xoj1 xoj1Var = o7u0Var.h;
        this.j = xoj1Var;
        this.e = new a(o7u0Var.b, xoj1Var, rdd1Var);
        this.f = new n7u0(this);
        this.h = new CopyOnWriteArraySet();
        this.l = new ie30(new ge30());
        this.r = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -1;
        this.v = (byte) 0;
    }

    @Override // p.mpj1
    public final void a(VideoFrameProcessingException videoFrameProcessingException) {
        for (r7u0 r7u0Var : this.h) {
            r7u0Var.i.execute(new vqh0((Object) r7u0Var, (Object) r7u0Var.h, (Object) videoFrameProcessingException, (byte) 9));
        }
    }

    @Override // p.mpj1
    public final void b(long j, boolean z) {
        if (this.u > 0) {
            return;
        }
        for (r7u0 r7u0Var : this.h) {
            r7u0Var.i.execute(new q7u0(r7u0Var.h, (byte) 0));
        }
        if (z) {
            moj1 moj1Var = this.q;
            if (moj1Var != null) {
                moj1Var.a(j, -9223372036854775807L, this.l, null);
                return;
            }
            return;
        }
        this.w = j;
        t7u0 t7u0Var = (t7u0) this.k.C(j);
        if (t7u0Var != null) {
            this.r = t7u0Var.a;
            this.s = t7u0Var.b;
            h();
        }
        n7u0 n7u0Var = this.f;
        a aVar = this.e;
        aVar.g(j, n7u0Var);
        long j2 = this.x;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        aVar.a();
        this.y = true;
    }

    @Override // p.mpj1
    public final void c(int i, int i2) {
        ge30 ge30VarA = this.l.a();
        ge30VarA.v = i;
        ge30VarA.w = i2;
        this.l = new ie30(ge30VarA);
        h();
    }

    @Override // p.mpj1
    public final void d(long j) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((r7u0) it.next()).getClass();
        }
    }

    @Override // p.mpj1
    public final void e(float f) {
        ge30 ge30VarA = this.l.a();
        ge30VarA.c(f);
        this.l = new ie30(ge30VarA);
        h();
    }

    public final void f(boolean z) {
        w4c0 w4c0Var;
        if (this.v == 1) {
            this.u++;
            this.e.t(z);
            while (true) {
                int iM = this.k.M();
                w4c0Var = this.k;
                if (iM <= 1) {
                    break;
                } else {
                    w4c0Var.B();
                }
            }
            if (w4c0Var.M() == 1) {
                t7u0 t7u0Var = (t7u0) this.k.B();
                t7u0Var.getClass();
                this.r = t7u0Var.a;
                this.s = t7u0Var.b;
                h();
            }
            this.w = -9223372036854775807L;
            if (z) {
                this.x = -9223372036854775807L;
                this.y = false;
            }
            wdd1 wdd1Var = this.o;
            wdd1Var.getClass();
            wdd1Var.f(new gv40(this, (byte) 24));
        }
    }

    public final void g(Surface surface, int i, int i2) {
        npj1 npj1Var = this.f147p;
        if (npj1Var == null) {
            return;
        }
        a aVar = this.e;
        if (surface != null) {
            npj1Var.m(new o3d1(surface, i, i2, 0, false));
            aVar.m(surface, new l291(i, i2));
        } else {
            npj1Var.m(null);
            aVar.s();
        }
    }

    public final void h() {
        ie30 ie30Var = this.l;
        long j = this.r;
        int i = this.s;
        w280 w280Var = b380.b;
        this.e.o(i, j, bg11.e, ie30Var);
    }
}
