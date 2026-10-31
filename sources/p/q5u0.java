package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class q5u0 implements c0u0 {
    public static final /* synthetic */ mma0[] t = {new een0(q5u0.class, "_state", "get_state()Lcom/spotify/betamax/player/events/PlaybackState;", 0)};
    public final m0u0 a;
    public final oot0 b;
    public VideoSurfaceView d;
    public boolean g;
    public boolean h;
    public Boolean i;
    public final ce0 c = new ce0(this, (byte) 19);
    public jgc1 e = jgc1.UNKNOWN;
    public int f = 1;

    public q5u0(m0u0 m0u0Var, oot0 oot0Var) {
        this.a = m0u0Var;
        this.b = oot0Var;
    }

    public void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        String identifier;
        t2k1 configuration;
        this.i = Boolean.valueOf(z2);
        this.h = z;
        VideoSurfaceView videoSurfaceView2 = videoSurfaceView;
        this.d = videoSurfaceView2;
        boolean z3 = !this.b.c;
        if (z) {
            videoSurfaceView2 = null;
        }
        if (videoSurfaceView2 == null || (configuration = videoSurfaceView2.getConfiguration()) == null || (identifier = configuration.getIdentifier()) == null) {
            identifier = "unknown";
        }
        this.c.c(t[0], this, new k5u0(this.a, j, (Long) null, (Long) null, false, f, z3, (Integer) null, (List) null, identifier, this.e, "betamax", this.f, z2, z));
    }

    public void G(float f, long j, long j2) {
        I(new dub(j2, j, f, (byte) 3));
    }

    public void H(VideoSurfaceView videoSurfaceView, long j, long j2) {
        this.d = videoSurfaceView;
        if (this.h) {
            videoSurfaceView = null;
        }
        I(new da5(this, videoSurfaceView, j2, j));
    }

    public final void I(iu30 iu30Var) {
        k5u0 k5u0VarA = a();
        this.c.c(t[0], this, k5u0VarA != null ? (k5u0) iu30Var.invoke(k5u0VarA) : null);
    }

    public void J(long j, long j2) {
        I(new qna((byte) 15, j2, j));
    }

    public void K(long j, long j2) {
        I(new qna((byte) 11, j2, j));
    }

    public void L(BetamaxException betamaxException, long j, long j2) {
        I(new qna((byte) 12, j2, j));
    }

    public final void M(long j, long j2, koj1 koj1Var) {
        I(new qna((byte) 18, j2, j));
    }

    public void N(ev7 ev7Var, long j, long j2) {
        I(new da5((Object) ev7Var, j2, j, (byte) 5));
    }

    public void O(long j, long j2) {
        I(new o5u0(j2, j));
    }

    public void R(r4t r4tVar, int i, long j, long j2) {
        I(new qna((byte) 13, j2, j));
    }

    public final k5u0 a() {
        mma0 mma0Var = t[0];
        return (k5u0) ((sgp0) this.c).a;
    }

    public void d(long j, long j2, boolean z) {
        this.h = z;
        I(new ona(this, z, j2, j));
    }

    public void i(BetamaxException betamaxException, long j, long j2) {
        I(new qna((byte) 14, j2, j));
    }

    public void j(int i, jgc1 jgc1Var, long j) {
        this.f = i;
        this.e = jgc1Var;
        I(new ym(jgc1Var, i, (byte) 20));
    }

    public void k(long j, long j2) {
        I(new ps((byte) 20, j));
    }

    public void m(long j, long j2) {
        this.g = true;
        I(new da5((Object) this.i, j2, j, (byte) 6));
    }

    public void n(long j, long j2, boolean z) {
        this.i = Boolean.valueOf(z);
        if (this.g) {
            I(new p5u0(j2, j, z));
        }
    }

    public void p(long j, long j2, long j3, boolean z) {
        I(new qna((byte) 16, j3, j2));
    }

    public final void r(hpc1 hpc1Var, long j, long j2) {
        I(new qna((byte) 17, j2, j));
    }

    public void v(yhg0 yhg0Var, long j) {
        I(new n5u0(yhg0Var, (byte) 0));
    }

    public void q(k5u0 k5u0Var) {
    }
}
