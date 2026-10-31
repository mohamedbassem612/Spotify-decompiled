package p;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.transformer.ExportException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q561 implements b67, a67 {
    public static final ie30 A;
    public static final ie30 B;
    public final bg11 a;
    public final t380 b;
    public final nt21 c;
    public final y57 d;
    public final ogg1 e;
    public final wdd1 f;
    public final HashMap g;
    public final HashMap h;
    public final v280 i;
    public final AtomicInteger j;
    public final AtomicInteger k;
    public boolean l;
    public int m;
    public b67 n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f117p;
    public boolean q;
    public int r;
    public int s;
    public ie30 t;
    public ie30 u;
    public volatile boolean v;
    public volatile long w;
    public volatile long x;
    public volatile boolean y;
    public volatile boolean z;

    static {
        ge30 ge30Var = new ge30();
        ge30Var.o = asj0.p("audio/mp4a-latm");
        ge30Var.K = 44100;
        ge30Var.I = 2;
        A = new ie30(ge30Var);
        ge30 ge30Var2 = new ge30();
        ge30Var2.v = 16;
        ge30Var2.w = 16;
        ge30Var2.o = asj0.p("image/raw");
        ge30Var2.G = x8h.i;
        B = new ie30(ge30Var2);
    }

    public q561(f4w f4wVar, z57 z57Var, y57 y57Var, ogg1 ogg1Var, Looper looper) {
        t380 t380Var = f4wVar.b;
        this.b = t380Var;
        bg11 bg11VarG = f4wVar.a;
        if (!t380Var.contains(-2)) {
            v280 v280Var = new v280(4);
            w280 w280VarR = bg11VarG.r(0);
            while (w280VarR.hasNext()) {
                e4w e4wVar = (e4w) w280VarR.next();
                if (e4w.d(e4wVar.a)) {
                    v280Var.c(e4wVar);
                } else {
                    d4w d4wVarA = e4wVar.a();
                    d4wVarA.b = e4wVar.b || !t380Var.contains(1);
                    d4wVarA.c = e4wVar.c || !t380Var.contains(2);
                    v280Var.c(new e4w(d4wVarA));
                }
            }
            bg11VarG = v280Var.g();
        }
        this.a = bg11VarG;
        nt21 nt21Var = new nt21(this, z57Var);
        this.c = nt21Var;
        this.d = y57Var;
        this.e = ogg1Var;
        this.f = new wdd1(new Handler(looper, null));
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new v280(4);
        this.j = new AtomicInteger();
        this.k = new AtomicInteger();
        this.l = true;
        this.n = nt21Var.e((e4w) bg11VarG.get(0), looper, this, y57Var);
    }

    public final void a(int i) {
        this.j.set(i);
        this.k.set(i);
    }

    public final void b(ExportException exportException) {
        this.e.b(exportException);
    }

    @Override // p.b67
    public final int c(ij81 ij81Var) {
        int iC = this.n.c(ij81Var);
        int i = this.a.d;
        if (i == 1 || iC == 0) {
            return iC;
        }
        int iB0 = zoi1.b0(this.m, i);
        if (iC == 2) {
            iB0 += ij81Var.b / i;
        }
        ij81Var.b = iB0;
        return 2;
    }

    public final boolean d(int i, ie30 ie30Var) {
        boolean z;
        boolean z2;
        boolean z3 = mue1.G(ie30Var.f66p) == 1;
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        if (z3) {
            this.t = ie30Var;
        } else {
            this.u = ie30Var;
        }
        if (!this.l) {
            boolean z4 = z3 ? this.f117p : this.q;
            if (z4) {
                return z4;
            }
            dm5.m((i & 1) != 0);
            return z4;
        }
        if (this.j.get() == 1) {
            boolean z5 = this.b.contains(1) && !z3;
            if (this.b.contains(2) && z3) {
                z2 = true;
                z = z5;
            } else {
                z2 = false;
                z = z5;
            }
        } else {
            z = false;
            z2 = false;
        }
        if (!this.o) {
            this.e.a(this.j.get() + ((z || z2) ? 1 : 0));
            this.o = true;
        }
        boolean zD = this.e.d(i, ie30Var);
        if (z3) {
            this.f117p = zD;
        } else {
            this.q = zD;
        }
        if (z) {
            this.e.d(2, A);
            this.f117p = true;
        }
        if (z2) {
            this.e.d(2, B);
            this.q = true;
        }
        return zD;
    }

    public final void f(long j) {
        dm5.l("Could not retrieve required duration for EditedMediaItem %s", this.m, j != -9223372036854775807L || j());
        this.x = ((e4w) this.a.get(this.m)).b(j);
        this.w = j;
        if (this.a.d == 1) {
            this.e.getClass();
        }
    }

    @Override // p.b67
    public final j380 g() {
        return this.n.g();
    }

    public final void h() {
        int i = this.r;
        bg11 bg11Var = this.a;
        int i2 = i * bg11Var.d;
        int i3 = this.m;
        if (i2 + i3 >= this.s) {
            j380 j380VarG = this.n.g();
            this.i.c(new ct00(this.w, this.t, this.u, (String) j380VarG.get(1), (String) j380VarG.get(2)));
            this.s++;
        }
    }

    public final void i(Bitmap bitmap) {
        p561 p561Var = (p561) this.g.get(2);
        p561Var.getClass();
        if (p561Var.a.i(bitmap, new rgl(this.w, 30.0f, 0).a()) != 1) {
            this.f.g(new zyh0(this, bitmap, (byte) 27), 10L);
        } else {
            p561Var.g();
        }
    }

    public final boolean j() {
        return this.m == this.a.d - 1;
    }

    public final void k(int i, ie30 ie30Var) {
        p5q0 p5q0Var = (p5q0) this.h.get(Integer.valueOf(i));
        if (p5q0Var == null) {
            return;
        }
        e4w e4wVar = (e4w) this.a.get(this.m);
        long j = this.w;
        if (e4w.d(e4wVar.a) && i == 1) {
            ie30Var = null;
        }
        p5q0Var.a(e4wVar, j, ie30Var, j());
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final p561 e(ie30 ie30Var) {
        p561 p561Var;
        int iG = mue1.G(ie30Var.f66p);
        zoi1.L(iG);
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        if (this.l) {
            if (iG == 2) {
                this.z = true;
            } else {
                this.y = true;
            }
            d541 d541VarE = this.e.e(ie30Var);
            if (d541VarE == null) {
                return null;
            }
            p561Var = new p561(this, d541VarE, iG);
            this.g.put(Integer.valueOf(iG), p561Var);
            if (this.j.get() == 1) {
                if (this.b.contains(1) && iG == 2) {
                    ogg1 ogg1Var = this.e;
                    ge30 ge30VarA = A.a();
                    ge30VarA.o = asj0.p("audio/raw");
                    ge30VarA.L = 2;
                    d541 d541VarE2 = ogg1Var.e(new ie30(ge30VarA));
                    d541VarE2.getClass();
                    this.g.put(1, new p561(this, d541VarE2, 1));
                } else if (this.b.contains(2) && iG == 1) {
                    d541 d541VarE3 = this.e.e(B);
                    d541VarE3.getClass();
                    this.g.put(2, new p561(this, d541VarE3, 2));
                }
            }
        } else {
            String str = iG == 1 ? "The preceding MediaItem does not contain any audio track. If the sequence starts with an item without audio track (like images), followed by items with audio tracks, then EditedMediaItemSequence.Builder.experimentalSetForceAudioTrack() needs to be set to true." : "The preceding MediaItem does not contain any video track. If the sequence starts with an item without video track (audio only), followed by items with video tracks, then EditedMediaItemSequence.Builder.experimentalSetForceVideoTrack() needs to be set to true.";
            p561Var = (p561) this.g.get(Integer.valueOf(iG));
            dm5.s(p561Var, str);
        }
        k(iG, ie30Var);
        if (this.j.get() == 1 && this.g.size() == 2) {
            if (iG == 1) {
                k(2, B);
                this.k.incrementAndGet();
                this.f.f(new v241(this, (byte) 1));
                return p561Var;
            }
            k(1, null);
        }
        return p561Var;
    }

    @Override // p.b67
    public final void release() {
        this.n.release();
        this.v = true;
    }

    @Override // p.b67
    public final void start() {
        this.n.start();
        if (this.a.d <= 1) {
            return;
        }
        this.e.getClass();
    }
}
