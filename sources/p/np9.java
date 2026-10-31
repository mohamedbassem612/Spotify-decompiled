package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class np9 {
    public final osm0 a;
    public final w2k1 b;
    public final ic9 c;
    public fdc d;
    public final llm e;
    public final bpb1 f;
    public final bpb1 g;
    public String h;
    public final xe01 i;
    public final xe01 j;

    public np9(osm0 osm0Var, q8n q8nVar, w2k1 w2k1Var, ic9 ic9Var) {
        this.a = osm0Var;
        this.b = w2k1Var;
        this.c = ic9Var;
        this.e = i3a.k(q8nVar);
        bpb1 bpb1VarB = gio1.b(kp9.a);
        this.f = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(Float.valueOf(1.0f));
        this.g = bpb1VarB2;
        this.i = d5p1.h(bpb1VarB);
        this.j = d5p1.h(bpb1VarB2);
    }

    public static jp9 c(i091 i091Var, int i) {
        long j = i091Var.d;
        long j2 = i091Var.e;
        Long lValueOf = Long.valueOf(j2);
        if (j2 <= 0) {
            lValueOf = null;
        }
        return new jp9(j, lValueOf, i, i091Var.c, i091Var.f);
    }

    public final void a() {
        fdc fdcVar = this.d;
        if (fdcVar == null || fdcVar.b) {
            return;
        }
        ((w590) fdcVar.d).o();
    }

    public final void b() {
        op71.q(this.e.a, (CancellationException) null);
        fdc fdcVar = this.d;
        if (fdcVar != null) {
            bpb1 bpb1Var = (bpb1) fdcVar.f;
            w590 w590Var = (w590) fdcVar.d;
            if (!fdcVar.b) {
                fdcVar.b = true;
                smo1.p((llm) fdcVar.e, (CancellationException) null);
                w590Var.u((VideoSurfaceView) null);
                w590Var.v();
                w590Var.n();
                w590Var.q();
                i091 i091Var = (i091) bpb1Var.getValue();
                long jB = ((yqg) fdcVar.c).b();
                o091 k091Var = ((i091) bpb1Var.getValue()).h instanceof k091 ? ((i091) bpb1Var.getValue()).h : new k091(f091.a);
                i091Var.getClass();
                bpb1Var.m((Object) null, new i091((lsm0) null, 0, jB, 0L, 0L, 0.0f, true, k091Var, (p091) null));
            }
        }
        this.d = null;
        this.h = null;
        this.f.m((Object) null, kp9.a);
        this.g.m((Object) null, Float.valueOf(1.0f));
    }
}
