package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sna implements c0u0 {
    public final /* synthetic */ cv7 a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ l811 c;

    public sna(cv7 cv7Var, p811 p811Var, l811 l811Var) {
        this.a = cv7Var;
        this.b = p811Var;
        this.c = l811Var;
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        this.a.c(new jc5((byte) 7, f));
    }

    public final void G(float f, long j, long j2) {
        this.a.c(new ca5(j, f, j2, this.b, (byte) 1));
    }

    public final void J(long j, long j2) {
        this.c.a = true;
        this.a.c(new pna(j, j2, this.b, (byte) 5));
    }

    public final void K(long j, long j2) {
        this.a.c(new pna(j, j2, this.b, (byte) 0));
    }

    public final void M(long j, long j2, koj1 koj1Var) {
        int i;
        int i2 = koj1Var.c;
        this.a.c(new rna(j, j2, (i2 <= 0 || (i = koj1Var.d) <= 0) ? null : new y1k1(i2, i), this.b));
    }

    public final void O(long j, long j2) {
        this.c.a = false;
        this.a.c(new pna(j, j2, this.b, (byte) 1));
    }

    public final void Q(long j, long j2, boolean z) {
        this.a.c(new ona(z, j, j2, this.b));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    public final void R(r4t r4tVar, int i, long j, long j2) {
        cv7 cv7Var = this.a;
        bpb1 bpb1Var = (bpb1) cv7Var.b;
        this.b.a = null;
        int iC = l1d.C(i);
        if (iC == 0) {
            bpb1Var.m((Object) null, z590.a((z590) bpb1Var.getValue(), null, false, new k091(e091.a), false, 0L, 0L, 0.0f, 0L, null, 507));
        } else if (iC == 1) {
            bpb1Var.m((Object) null, z590.a((z590) bpb1Var.getValue(), null, false, new k091(f091.a), false, 0L, 0L, 0.0f, 0L, null, 507));
        } else if (iC == 2) {
            bpb1Var.m((Object) null, z590.a((z590) bpb1Var.getValue(), null, false, new k091(d091.a), false, 0L, 0L, 0.0f, 0L, null, 507));
        } else if (iC == 3) {
            bpb1Var.m((Object) null, z590.a((z590) bpb1Var.getValue(), null, false, new k091(g091.a), false, 0L, 0L, 0.0f, 0L, null, 507));
        } else if (iC != 4) {
            if (iC != 5) {
                eg.o();
                return;
            }
            bpb1Var.m((Object) null, z590.a((z590) bpb1Var.getValue(), null, false, new k091(f091.a), false, 0L, 0L, 0.0f, 0L, null, 507));
        } else {
            bpb1Var.m((Object) null, z590.a((z590) bpb1Var.getValue(), null, false, new k091(d091.a), false, 0L, 0L, 0.0f, 0L, null, 507));
        }
        cv7Var.c(new qna((byte) 1, j, j2));
    }

    public final void S(long j, long j2) {
        this.a.c(new pna(j, j2, this.b, (byte) 2));
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        this.b.a = null;
        xjz xjzVar = betamaxException.a;
        xjz xjzVar2 = xjz.R0;
        cv7 cv7Var = this.a;
        if (xjzVar == xjzVar2 || xjzVar == xjz.P0) {
            cv7Var.c(new qna((byte) 2, j, j2));
        } else {
            cv7Var.c(new qna((byte) 3, j, j2));
        }
    }

    public final void k(long j, long j2) {
        this.a.c(new qna((byte) 0, j, j2));
    }

    public final void l(long j, long j2, long j3, boolean z) {
        this.b.a = null;
        this.a.c(new qna((byte) 4, j2, j3));
    }

    public final void m(long j, long j2) {
        boolean z = this.c.a;
        cv7 cv7Var = this.a;
        p811 p811Var = this.b;
        if (z) {
            cv7Var.c(new pna(j, j2, p811Var, (byte) 3));
        } else {
            cv7Var.c(new pna(j, j2, p811Var, (byte) 4));
        }
    }

    public final void p(long j, long j2, long j3, boolean z) {
        this.b.a = Long.valueOf(j2);
        this.a.c(new qna((byte) 5, j2, j3));
    }
}
