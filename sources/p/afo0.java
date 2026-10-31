package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class afo0 extends t0u0 {
    public static final /* synthetic */ int C1 = 0;
    public final AtomicBoolean A1;
    public final llm B1;
    public final xu0 u1;
    public final yu0 v1;
    public final ao0 w1;
    public final zik1 x1;
    public final bpb1 y1;
    public final bpb1 z1;

    public afo0(xu0 xu0Var, yu0 yu0Var, ao0 ao0Var, zik1 zik1Var, q8n q8nVar) {
        super(yu0Var);
        this.u1 = xu0Var;
        this.v1 = yu0Var;
        this.w1 = ao0Var;
        this.x1 = zik1Var;
        this.y1 = gio1.b(xu0Var.b);
        this.z1 = gio1.b(new pob1(Long.MAX_VALUE, true, 0L, 0L, 0L));
        this.A1 = new AtomicBoolean(false);
        this.B1 = smo1.e(q8nVar);
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        bpb1 bpb1Var;
        Object value;
        pob1 pob1Var;
        long j2;
        long j3;
        super.B(z, z2, f, videoSurfaceView, j);
        do {
            bpb1Var = this.z1;
            value = bpb1Var.getValue();
            pob1Var = (pob1) value;
            j2 = z ? pob1Var.d : 0L;
            j3 = pob1Var.e;
            if (z) {
                j3 += 0 - j2;
            }
        } while (!bpb1Var.k(value, new pob1(pob1Var.a, z, 0L, j2, j3)));
        fn31.T(this.B1, (o8n) null, 0, new uug0(this, (lnm) null, (byte) 26), 3);
    }

    @Override // p.t0u0
    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        smo1.p(this.B1, null);
        bpb1 bpb1Var = this.z1;
        pob1 pob1Var = (pob1) bpb1Var.getValue();
        boolean z = pob1Var.b;
        long j3 = pob1Var.e;
        if (!z) {
            j3 += j - pob1Var.c;
        }
        if (j3 >= ((pob1) bpb1Var.getValue()).a) {
            Y(j);
        }
    }

    public final void Y(long j) {
        if (this.A1.getAndSet(true)) {
            return;
        }
        co0 co0Var = co0.NONCONTINUOUS_VIEWABILITY;
        xu0 xu0Var = this.u1;
        t0u0.X(this, this.w1, co0Var, xu0Var.a, Long.valueOf(j), null, xu0Var.c, 8);
    }

    public final void d(long j, long j2, boolean z) {
        bpb1 bpb1Var;
        Object value;
        pob1 pob1Var;
        long j3;
        long j4;
        super.d(j, j2, z);
        do {
            bpb1Var = this.z1;
            value = bpb1Var.getValue();
            pob1Var = (pob1) value;
            j3 = z ? pob1Var.d : j;
            j4 = pob1Var.e;
            if (z) {
                j4 += j - j3;
            }
        } while (!bpb1Var.k(value, new pob1(pob1Var.a, z, j, j3, j4)));
    }

    public final void k(long j, long j2) {
        super.k(j, j2);
        Long lValueOf = Long.valueOf(j);
        bpb1 bpb1Var = this.y1;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, lValueOf);
    }
}
