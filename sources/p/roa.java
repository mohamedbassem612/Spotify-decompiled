package p;

import android.view.Display;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class roa implements c0u0 {
    public boolean N0;
    public hpc1 O0;
    public t2k1 R0;
    public Long S0;
    public Long T0;
    public boolean U0;
    public boolean V0;
    public VideoSurfaceView W0;
    public long X0;
    public long Y;
    public long Y0;
    public boolean Z;
    public Long Z0;
    public final m0u0 a;
    public boolean a1;
    public int b1;
    public boolean c;
    public int c1;
    public boolean d;
    public long e;
    public Long e1;
    public Long f;
    public Long f1;
    public pac g;
    public Long g1;
    public kqz0 h;
    public njp0 i;
    public int n1;
    public njp0 t;
    public final ArrayList b = new ArrayList();
    public int m1 = 1;
    public boolean X = true;
    public int P0 = -1;
    public float Q0 = 1.0f;
    public int o1 = 1;
    public long d1 = -1;
    public final ArrayList h1 = new ArrayList();
    public final ArrayList i1 = new ArrayList();
    public final ArrayList j1 = new ArrayList();
    public final ArrayList k1 = new ArrayList();
    public final ArrayList l1 = new ArrayList();

    public roa(m0u0 m0u0Var, oot0 oot0Var) {
        this.a = m0u0Var;
        this.a1 = oot0Var.c;
    }

    public void A(long j, long j2) {
        this.X0 += j;
    }

    public void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        Display display;
        boolean z3 = false;
        int i = -1;
        if (videoSurfaceView != null && (display = videoSurfaceView.getDisplay()) != null) {
            int rotation = display.getRotation();
            i = (rotation == 0 || rotation == 2) ? 0 : 1;
        }
        this.P0 = i;
        if (videoSurfaceView != null && videoSurfaceView.a1) {
            z3 = true;
        }
        this.d = z3;
        this.R0 = videoSurfaceView != null ? videoSurfaceView.getConfiguration() : null;
        this.W0 = videoSurfaceView;
        this.c = z;
        this.U0 = z2;
        this.Q0 = f;
        this.Y = j;
    }

    public void C(int i, long j) {
        if (this.g1 == null) {
            this.g1 = Long.valueOf(j - this.e);
        }
        this.n1 = i;
    }

    public void E(y2g1 y2g1Var) {
        if (this.T0 != null || y2g1Var == null) {
            return;
        }
        long j = y2g1Var.a;
        Long l = this.S0;
        if (l == null || j <= l.longValue()) {
            this.T0 = Long.valueOf(j);
        }
    }

    public void F(long j) {
        this.e = j;
    }

    public void G(float f, long j, long j2) {
        this.Q0 = f;
        I(j, j);
    }

    public void H(VideoSurfaceView videoSurfaceView, long j, long j2) {
        Display display;
        boolean z = false;
        int i = -1;
        if (videoSurfaceView != null && (display = videoSurfaceView.getDisplay()) != null) {
            int rotation = display.getRotation();
            i = (rotation == 0 || rotation == 2) ? 0 : 1;
        }
        this.P0 = i;
        if (videoSurfaceView != null && videoSurfaceView.a1) {
            z = true;
        }
        this.d = z;
        this.R0 = videoSurfaceView != null ? videoSurfaceView.getConfiguration() : null;
        I(j, j);
        u890.j(videoSurfaceView, this.W0);
        this.W0 = videoSurfaceView;
    }

    public final void I(long j, long j2) {
        int i;
        String str;
        kqz0 kqz0Var = this.h;
        if (kqz0Var != null) {
            this.h1.add(new kqz0(kqz0Var.a, kqz0Var.b, kqz0Var.c, kqz0Var.d, kqz0Var.e, j, kqz0Var.g));
            float f = this.Q0;
            int i2 = 2;
            boolean z = this.U0 || this.m1 == 2;
            boolean z2 = this.c;
            boolean z3 = this.d;
            int i3 = this.P0;
            if (z2 && z) {
                i = 1;
            } else {
                if (!z2) {
                    if (z) {
                        i2 = 3;
                    } else if (z3 && i3 == 0) {
                        i2 = 7;
                    } else if (z3 && i3 == 1) {
                        i2 = 8;
                    } else if (!z3 && i3 == 0) {
                        i2 = 4;
                    } else if (z3 || i3 != 1) {
                        i2 = z3 ? 9 : 6;
                    } else {
                        i2 = 5;
                    }
                }
                i = i2;
            }
            t2k1 t2k1Var = this.R0;
            hpc1 hpc1Var = this.O0;
            if (hpc1Var == null || (str = hpc1Var.h) == null) {
                str = "";
            }
            this.h = new kqz0(f, i, t2k1Var, str, j2, this.V0);
        }
    }

    public void K(long j, long j2) {
        boolean z = this.Z;
        if (!z && this.g == null) {
            this.g = new pac(1, j2);
            return;
        }
        if (z) {
            T(j2);
            int i = 2;
            if (this.X) {
                i = (this.U0 || this.m1 == 2) ? 4 : 3;
            }
            this.g = new pac(i, j2);
        }
    }

    public void M(long j, long j2, koj1 koj1Var) {
        a(j, j, koj1Var);
    }

    public void N(ev7 ev7Var, long j, long j2) {
        long j3;
        njp0 njp0Var = this.t;
        if (njp0Var != null) {
            j3 = j;
            this.l1.add(new njp0(njp0Var.a, njp0Var.b, j3));
        } else {
            j3 = j;
        }
        this.t = new njp0(j3, ev7Var);
    }

    public void O(long j, long j2) {
        if (this.Z0 == null && this.T0 != null) {
            this.N0 = true;
        }
        I(j, j);
    }

    public void P(int i, long j) {
        this.c1 += i;
    }

    public void R(r4t r4tVar, int i, long j, long j2) {
        kqz0 kqz0Var = this.h;
        if (kqz0Var != null) {
            this.h1.add(new kqz0(kqz0Var.a, kqz0Var.b, kqz0Var.c, kqz0Var.d, kqz0Var.e, j, kqz0Var.g));
            this.h = null;
        }
        njp0 njp0Var = this.t;
        if (njp0Var != null) {
            this.l1.add(new njp0(njp0Var.a, njp0Var.b, j));
            this.t = null;
        }
        njp0 njp0Var2 = this.i;
        if (njp0Var2 != null) {
            this.k1.add(new njp0(njp0Var2.a, njp0Var2.b, j));
            this.i = null;
        }
        T(j2);
    }

    public void S(long j, long j2) {
        if (this.S0 == null) {
            this.Z = true;
            this.S0 = Long.valueOf(j2);
        }
    }

    public final void T(long j) {
        pac pacVar = this.g;
        if (pacVar != null) {
            this.i1.add(new pac(pacVar.a, pacVar.b, j));
            this.g = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.koj1] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    public final void a(long j, long j2, koj1 koj1Var) {
        Object obj;
        njp0 njp0Var = this.i;
        if (njp0Var != null) {
            obj = njp0Var.a;
            this.k1.add(new njp0(obj, njp0Var.b, j));
        } else {
            obj = null;
        }
        if (koj1Var == 0) {
            koj1Var = obj;
        }
        this.i = new njp0(j2, koj1Var);
    }

    public final void b(long j) {
        if (this.f == null) {
            this.f = Long.valueOf(j);
        }
    }

    public void d(long j, long j2, boolean z) {
        this.c = z;
        I(j, j);
    }

    public final void g(long j) {
        this.Y0 += j;
    }

    public void j(int i, jgc1 jgc1Var, long j) {
        this.m1 = i;
    }

    public void k(long j, long j2) {
        this.e1 = Long.valueOf(j);
    }

    public void l(long j, long j2, long j3, boolean z) {
        this.X = true;
    }

    public void m(long j, long j2) {
        String str;
        if (this.Z0 == null) {
            this.Z0 = Long.valueOf(j2 - this.Y);
        }
        if (this.h == null) {
            float f = this.Q0;
            int i = 2;
            boolean z = this.U0 || this.m1 == 2;
            boolean z2 = this.c;
            boolean z3 = this.d;
            int i2 = this.P0;
            if (z2 && z) {
                i = 1;
            } else if (!z2) {
                if (z) {
                    i = 3;
                } else if (z3 && i2 == 0) {
                    i = 7;
                } else if (z3 && i2 == 1) {
                    i = 8;
                } else if (!z3 && i2 == 0) {
                    i = 4;
                } else if (z3 || i2 != 1) {
                    i = z3 ? 9 : 6;
                } else {
                    i = 5;
                }
            }
            t2k1 t2k1Var = this.R0;
            hpc1 hpc1Var = this.O0;
            if (hpc1Var == null || (str = hpc1Var.h) == null) {
                str = "";
            }
            this.h = new kqz0(f, i, t2k1Var, str, j, this.V0);
        }
        T(j2);
        this.X = true;
    }

    public void n(long j, long j2, boolean z) {
        this.U0 = z;
        I(j, j);
    }

    public void o(int i, long j, long j2) {
        this.V0 = i != 1;
        I(j, j);
    }

    public void p(long j, long j2, long j3, boolean z) {
        I(j, j2);
        a(j, j2, null);
        this.j1.add(new km51(j, j2));
        this.X = false;
    }

    public void r(hpc1 hpc1Var, long j, long j2) {
        this.O0 = hpc1Var;
        I(j, j);
    }

    public void v(yhg0 yhg0Var, long j) {
        Long l = this.f;
        if (l == null || this.Z0 != null) {
            return;
        }
        this.f1 = Long.valueOf(j - l.longValue());
    }

    public void z(long j, long j2) {
        this.b.add(new mjp0(j, j2));
    }
}
