package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gv0 extends q5u0 {
    public static final /* synthetic */ int P0 = 0;
    public final llm N0;
    public xab1 O0;
    public final yqg X;
    public final bpb1 Y;
    public final bpb1 Z;

    public gv0(yqg yqgVar, bpb1 bpb1Var, bpb1 bpb1Var2, q8n q8nVar, m0u0 m0u0Var, oot0 oot0Var) {
        super(m0u0Var, oot0Var);
        this.X = yqgVar;
        this.Y = bpb1Var;
        this.Z = bpb1Var2;
        this.N0 = smo1.e(q8nVar);
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        super.B(z, z2, f, videoSurfaceView, j);
        dv0 dv0Var = new dv0(true, true, false, 0, null);
        bpb1 bpb1Var = this.Y;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, dv0Var);
    }

    public final void J(long j, long j2) {
        super.J(j, j2);
        bpb1 bpb1Var = this.Y;
        dv0 dv0Var = (dv0) bpb1Var.getValue();
        bpb1Var.l(dv0Var != null ? dv0.a(dv0Var, false, false, 0, null, 11) : null);
        T();
    }

    public final void K(long j, long j2) {
        super.K(j, j2);
        bpb1 bpb1Var = this.Y;
        dv0 dv0Var = (dv0) bpb1Var.getValue();
        bpb1Var.l(dv0Var != null ? dv0.a(dv0Var, true, false, 0, null, 30) : null);
        U();
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        super.L(betamaxException, j, j2);
        bpb1 bpb1Var = this.Y;
        dv0 dv0Var = (dv0) bpb1Var.getValue();
        bpb1Var.l(dv0Var != null ? dv0.a(dv0Var, false, false, 0, betamaxException, 15) : null);
        U();
    }

    public final void O(long j, long j2) {
        super.O(j, j2);
        bpb1 bpb1Var = this.Y;
        dv0 dv0Var = (dv0) bpb1Var.getValue();
        bpb1Var.l(dv0Var != null ? dv0.a(dv0Var, false, true, 0, null, 27) : null);
        U();
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        bpb1 bpb1Var = this.Y;
        dv0 dv0Var = (dv0) bpb1Var.getValue();
        bpb1Var.l(dv0Var != null ? dv0.a(dv0Var, false, false, i, null, 21) : null);
        U();
    }

    public final void S(long j, long j2) {
        bpb1 bpb1Var = this.Y;
        dv0 dv0Var = (dv0) bpb1Var.getValue();
        bpb1Var.l(dv0Var != null ? dv0.a(dv0Var, false, false, 0, null, 15) : null);
    }

    public final void T() {
        xab1 xab1Var = this.O0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.O0 = fn31.T(this.N0, (o8n) null, 0, new q4(this, (lnm) null, (byte) 15), 3);
    }

    public final void U() {
        xab1 xab1Var = this.O0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    public final void d(long j, long j2, boolean z) {
        super.d(j, j2, z);
        if (z) {
            U();
        } else {
            T();
        }
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        super.i(betamaxException, j, j2);
        bpb1 bpb1Var = this.Y;
        dv0 dv0Var = (dv0) bpb1Var.getValue();
        bpb1Var.l(dv0Var != null ? dv0.a(dv0Var, false, false, 0, betamaxException, 15) : null);
        U();
    }

    public final void m(long j, long j2) {
        super.m(j, j2);
        bpb1 bpb1Var = this.Y;
        dv0 dv0Var = (dv0) bpb1Var.getValue();
        bpb1Var.l(dv0Var != null ? dv0.a(dv0Var, false, false, 0, null, 30) : null);
        T();
    }
}
