package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dom extends t0u0 {
    public static final /* synthetic */ int B1 = 0;
    public final llm A1;
    public final xu0 u1;
    public final yu0 v1;
    public final ao0 w1;
    public final q8n x1;
    public final bpb1 y1;
    public final AtomicBoolean z1;

    public dom(xu0 xu0Var, yu0 yu0Var, ao0 ao0Var, q8n q8nVar, q8n q8nVar2) {
        super(yu0Var);
        this.u1 = xu0Var;
        this.v1 = yu0Var;
        this.w1 = ao0Var;
        this.x1 = q8nVar;
        this.y1 = gio1.b(new bom(false, false, false, 0L));
        this.z1 = new AtomicBoolean(false);
        this.A1 = smo1.e(q8nVar2);
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        super.B(z, z2, f, videoSurfaceView, j);
        while (true) {
            bpb1 bpb1Var = this.y1;
            Object value = bpb1Var.getValue();
            boolean z3 = z;
            if (bpb1Var.k(value, bom.a((bom) value, z3, false, false, 0L, 6))) {
                l4p1.u(this.A1, new fu20(new lt20(new any(hu20.c(new qbk(bpb1Var, this, (byte) 16), new cuk(this, (lnm) null, (byte) 18)), (byte) 18), new jk(3, (lnm) null, (byte) 21), (byte) 0), new u98(2, this, dom.class, "recordImpression", "recordImpression(J)V", 4, (byte) 5), (byte) 1));
                return;
            }
            z = z3;
        }
    }

    @Override // p.t0u0
    public final void J(long j, long j2) {
        super.J(j, j2);
        while (true) {
            bpb1 bpb1Var = this.y1;
            Object value = bpb1Var.getValue();
            long j3 = j;
            if (bpb1Var.k(value, bom.a((bom) value, false, true, false, j3, 5))) {
                return;
            } else {
                j = j3;
            }
        }
    }

    @Override // p.t0u0
    public final void O(long j, long j2) {
        super.O(j, j2);
        while (true) {
            bpb1 bpb1Var = this.y1;
            Object value = bpb1Var.getValue();
            long j3 = j;
            if (bpb1Var.k(value, bom.a((bom) value, false, false, false, j3, 5))) {
                return;
            } else {
                j = j3;
            }
        }
    }

    @Override // p.t0u0
    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        smo1.p(this.A1, null);
    }

    public final void S(long j, long j2) {
        super.S(j, j2);
        while (true) {
            bpb1 bpb1Var = this.y1;
            Object value = bpb1Var.getValue();
            long j3 = j;
            if (bpb1Var.k(value, bom.a((bom) value, false, true, false, j3, 5))) {
                return;
            } else {
                j = j3;
            }
        }
    }

    public final void d(long j, long j2, boolean z) {
        super.d(j, j2, z);
        while (true) {
            bpb1 bpb1Var = this.y1;
            Object value = bpb1Var.getValue();
            long j3 = j;
            if (bpb1Var.k(value, bom.a((bom) value, z, false, false, j3, 6))) {
                return;
            } else {
                j = j3;
            }
        }
    }

    public final void l(long j, long j2, long j3, boolean z) {
        ((roa) this).X = true;
        while (true) {
            bpb1 bpb1Var = this.y1;
            Object value = bpb1Var.getValue();
            long j4 = j2;
            if (bpb1Var.k(value, bom.a((bom) value, false, false, false, j4, 3))) {
                return;
            } else {
                j2 = j4;
            }
        }
    }

    public final void p(long j, long j2, long j3, boolean z) {
        bpb1 bpb1Var;
        Object value;
        long j4;
        super.p(j, j2, j3, z);
        do {
            bpb1Var = this.y1;
            value = bpb1Var.getValue();
            j4 = j2;
            j2 = j4;
        } while (!bpb1Var.k(value, bom.a((bom) value, false, false, true, j4, 3)));
    }
}
