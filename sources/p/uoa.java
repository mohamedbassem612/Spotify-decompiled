package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uoa implements u2k1 {
    public a0c0 a;
    public w2k1 b;
    public final String c;
    public final boolean d;
    public p3u0 f;
    public int h;
    public float i;
    public final int j;
    public y1k1 k;
    public y1k1 l;
    public float m;
    public hpc1 n;
    public Locale o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f120p;
    public y2g1 q;
    public boolean r;
    public boolean s;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final String g = nhc1.W(UUID.randomUUID().toString(), "-", "");

    public uoa(a0c0 a0c0Var, w2k1 w2k1Var, String str, boolean z) {
        this.a = a0c0Var;
        this.b = w2k1Var;
        this.c = str;
        this.d = z;
        w2k1 w2k1Var2 = this.b;
        if (w2k1Var2 != null) {
            w2k1Var2.c.add(this);
        }
        this.h = 1;
        this.i = 1.0f;
        this.j = Integer.MAX_VALUE;
        this.k = new y1k1(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.l = new y1k1(0, 0);
        this.m = 1.0f;
        this.s = true;
    }

    public static void m(uoa uoaVar, long j) {
        p3u0 p3u0Var = uoaVar.f;
        if (p3u0Var != null) {
            p3u0Var.J0(j, true);
        }
    }

    @Override // p.u2k1
    public final void a(VideoSurfaceView videoSurfaceView) {
        n();
    }

    @Override // p.u2k1
    public final void b() {
        n();
    }

    @Override // p.u2k1
    public final void c(VideoSurfaceView videoSurfaceView) {
        n();
    }

    public final void d(VideoSurfaceView videoSurfaceView) {
        w2k1 w2k1Var = this.b;
        if (w2k1Var != null) {
            w2k1Var.a(videoSurfaceView);
        }
    }

    public final m0u0 e() {
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            return p3u0Var.f0();
        }
        return null;
    }

    public final void f() {
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            p3u0Var.G0();
        }
    }

    public final void g(o2u0 o2u0Var) {
        h(o2u0Var, new oot0(0L, 0L, false, false, null, null, false, 255));
    }

    public final void h(o2u0 o2u0Var, oot0 oot0Var) {
        m0u0 m0u0Var = new m0u0(o2u0Var, this.g, this.c);
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            p3u0Var.a1(2, m0u0Var, jap1.u());
        }
        a0c0 a0c0Var = this.a;
        p3u0 p3u0VarA = a0c0Var != null ? a0c0Var.a(m0u0Var, oot0Var, new z77(this, m0u0Var, (byte) 29)) : null;
        this.f = p3u0VarA;
        if (p3u0VarA != null) {
            p3u0VarA.U0(this.q);
        }
        p3u0 p3u0Var2 = this.f;
        if (p3u0Var2 != null) {
            p3u0Var2.K0(this.h);
        }
        p3u0 p3u0Var3 = this.f;
        if (p3u0Var3 != null) {
            p3u0Var3.M0(this.j);
        }
        p3u0 p3u0Var4 = this.f;
        if (p3u0Var4 != null) {
            p3u0Var4.N0(this.k);
        }
        p3u0 p3u0Var5 = this.f;
        if (p3u0Var5 != null) {
            p3u0Var5.O0(this.l);
        }
        p3u0 p3u0Var6 = this.f;
        if (p3u0Var6 != null) {
            p3u0Var6.P0(this.m);
        }
        p3u0 p3u0Var7 = this.f;
        if (p3u0Var7 != null) {
            p3u0Var7.R0(this.n);
        }
        p3u0 p3u0Var8 = this.f;
        if (p3u0Var8 != null) {
            p3u0Var8.Q0(this.o);
        }
        p3u0 p3u0Var9 = this.f;
        if (p3u0Var9 != null) {
            p3u0Var9.S0(this.f120p);
        }
        p3u0 p3u0Var10 = this.f;
        if (p3u0Var10 != null) {
            p3u0Var10.V0(this.r);
        }
        p3u0 p3u0Var11 = this.f;
        if (p3u0Var11 != null) {
            p3u0Var11.T0(this.s);
        }
        p3u0 p3u0Var12 = this.f;
        if (p3u0Var12 != null) {
            p3u0Var12.X0(this.i);
        }
        p3u0 p3u0Var13 = this.f;
        if (p3u0Var13 != null) {
            p3u0Var13.H0();
        }
        n();
    }

    public final void i() {
        j(jap1.u());
    }

    public final void j(r4t r4tVar) {
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            Trace.beginSection("BetamaxPlayer.ReleaseSessionStop");
            try {
                p3u0Var.a1(6, (m0u0) null, r4tVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        w2k1 w2k1Var = this.b;
        if (w2k1Var != null) {
            Trace.beginSection("BetamaxPlayer.ReleaseSurfaceManager");
            try {
                w2k1Var.c.remove(this);
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        a0c0 a0c0Var = this.a;
        if (a0c0Var != null) {
            Trace.beginSection("BetamaxPlayer.ReleaseSessionFactory");
            try {
                a0c0Var.b();
                Trace.endSection();
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
        this.f = null;
        this.b = null;
        this.a = null;
    }

    public final void k(VideoSurfaceView videoSurfaceView) {
        w2k1 w2k1Var = this.b;
        if (w2k1Var != null) {
            w2k1Var.f(videoSurfaceView);
        }
    }

    public final void l() {
        p3u0 p3u0Var;
        p3u0 p3u0Var2;
        p3u0 p3u0Var3 = this.f;
        if ((p3u0Var3 == null || !p3u0Var3.d0()) && (p3u0Var = this.f) != null) {
            m0u0 m0u0VarF0 = p3u0Var.f0();
            if ((!this.r || m0u0VarF0.e()) && (p3u0Var2 = this.f) != null) {
                p3u0Var2.I0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    public final synchronized void n() {
        Object next;
        VideoSurfaceView videoSurfaceViewB;
        boolean zC;
        try {
            p3u0 p3u0Var = this.f;
            if (p3u0Var != null) {
                m0u0 m0u0VarF0 = p3u0Var.f0();
                p3u0 p3u0Var2 = this.f;
                VideoSurfaceView videoSurfaceViewM0 = p3u0Var2 != null ? p3u0Var2.m0() : null;
                boolean z = this.d;
                w2k1 w2k1Var = this.b;
                boolean z2 = true;
                if (z) {
                    if (w2k1Var != null) {
                        videoSurfaceViewB = w2k1Var.b(m0u0VarF0);
                    } else {
                        videoSurfaceViewB = null;
                    }
                } else if (w2k1Var != null) {
                    Iterator it = w2k1Var.b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) next;
                        boolean z3 = videoSurfaceView.useSurfaceView;
                        if (!(z3 && videoSurfaceView.c == null) && (z3 || videoSurfaceView.a != null)) {
                            gvt0 gvt0Var = videoSurfaceView.h;
                            zC = gvt0Var != null ? gvt0Var.c(m0u0VarF0) : true;
                        } else {
                            zC = false;
                        }
                    } while (!zC);
                    videoSurfaceViewB = (VideoSurfaceView) next;
                } else {
                    videoSurfaceViewB = null;
                }
                if (videoSurfaceViewM0 == null && videoSurfaceViewB == null) {
                    return;
                }
                if (videoSurfaceViewM0 != null && videoSurfaceViewB != null && videoSurfaceViewM0 != videoSurfaceViewB && !videoSurfaceViewB.isLaidOut() && videoSurfaceViewM0.getConfiguration() != null) {
                    t2k1 configuration = videoSurfaceViewM0.getConfiguration();
                    String identifier = configuration != null ? configuration.getIdentifier() : null;
                    t2k1 configuration2 = videoSurfaceViewB.getConfiguration();
                    if (u890.j(identifier, configuration2 != null ? configuration2.getIdentifier() : null)) {
                        return;
                    }
                }
                if (videoSurfaceViewM0 != videoSurfaceViewB && videoSurfaceViewM0 != null) {
                    Runnable toaVar = new toa(videoSurfaceViewM0, (byte) 0);
                    if (u890.j(Looper.getMainLooper(), Looper.myLooper())) {
                        toaVar.run();
                    } else {
                        this.e.post(toaVar);
                    }
                }
                p3u0 p3u0Var3 = this.f;
                if (videoSurfaceViewB != null) {
                    y1k1 y1k1VarL0 = p3u0Var3 != null ? p3u0Var3.l0() : null;
                    if (y1k1VarL0 != null) {
                        videoSurfaceViewB.d(y1k1VarL0.b(), y1k1VarL0.a());
                    }
                    if (videoSurfaceViewM0 != videoSurfaceViewB) {
                        videoSurfaceViewB.c();
                        p3u0 p3u0Var4 = this.f;
                        if ((p3u0Var4 != null ? p3u0Var4.i0() : null) != g5u0.c) {
                            z2 = false;
                        }
                        videoSurfaceViewB.setIsBuffering(z2);
                        p3u0 p3u0Var5 = this.f;
                        if (p3u0Var5 != null) {
                            p3u0Var5.W0(videoSurfaceViewB);
                        }
                    }
                } else if (p3u0Var3 != null) {
                    p3u0Var3.W0((VideoSurfaceView) null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(boolean z) {
        if (z) {
            p(2);
        } else if (this.h == 2) {
            p(1);
        }
    }

    public final void p(int i) {
        this.h = i;
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            p3u0Var.K0(i);
        }
    }

    public final void q(boolean z) {
        this.f120p = z;
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            p3u0Var.S0(z);
        }
    }

    public final void r(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            p3u0Var.T0(z);
        }
    }

    public final void s(y2g1 y2g1Var) {
        this.q = y2g1Var;
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            p3u0Var.U0(y2g1Var);
        }
    }

    public final void t(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            p3u0Var.V0(z);
        }
    }

    public final void u() {
        p3u0 p3u0Var = this.f;
        if (p3u0Var != null) {
            p3u0Var.a1(2, (m0u0) null, jap1.u());
        }
    }
}
