package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bv7 implements c0u0 {
    public final sf0 a;
    public final m0u0 b;
    public final oot0 c;
    public boolean d;

    public bv7(sf0 sf0Var, m0u0 m0u0Var, oot0 oot0Var) {
        this.a = sf0Var;
        this.b = m0u0Var;
        this.c = oot0Var;
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        a(this.c.c);
    }

    public final void J(long j, long j2) {
        a(true);
    }

    public final void O(long j, long j2) {
        a(false);
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        a(false);
    }

    public final void S(long j, long j2) {
        a(true);
    }

    public final void a(boolean z) {
        if (z != this.d) {
            this.d = z;
            m0u0 m0u0Var = this.b;
            sf0 sf0Var = this.a;
            if (z) {
                sf0Var.a.add(m0u0Var);
                sf0Var.a();
            } else {
                sf0Var.a.remove(m0u0Var);
                sf0Var.a();
            }
        }
    }
}
