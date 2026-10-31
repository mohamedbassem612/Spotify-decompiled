package p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r091 {
    public final yqg a;
    public final ign0 b;
    public final j0f1 c;
    public final cbu0 d;
    public final g0f1 e;
    public final llm f;
    public final bpb1 g;
    public boolean h;

    public r091(yqg yqgVar, fz3 fz3Var, g0f1 g0f1Var, j0f1 j0f1Var, cbu0 cbu0Var) {
        this.a = yqgVar;
        this.b = fz3Var;
        this.c = j0f1Var;
        this.d = cbu0Var;
        this.e = j0f1Var.c(g0f1Var, true);
        llm llmVarE = smo1.e(ha71.A(op71.f(), igu.b));
        this.f = llmVarE;
        this.g = gio1.b(new i091(null, 0, yqgVar.b(), 0L, 0L, 0.0f, true, l091.a, null));
        w590 w590VarA = cbu0Var.a();
        if (w590VarA != null) {
            w590VarA.n();
        }
        c921.y(llmVarE, (o8n) null, 0, new bz30(this, (lnm) null, (byte) 2), 3);
        c921.y(llmVarE, (o8n) null, 0, new bz30(this, (lnm) null, (byte) 3), 3);
        c921.y(llmVarE, (o8n) null, 0, new bz30(this, (lnm) null, (byte) 4), 3);
        c921.y(llmVarE, (o8n) null, 0, new bz30(this, (lnm) null, (byte) 5), 3);
    }

    public static /* synthetic */ void f(r091 r091Var, tv80 tv80Var, Long l, yjp1 yjp1Var, int i) {
        if ((i & 1) != 0) {
            tv80Var = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        r091Var.e(tv80Var, l, null, yjp1Var);
    }

    public final w590 a() {
        cbu0 cbu0Var = this.d;
        if (((Boolean) cbu0Var.b().getValue()).booleanValue() || ((Boolean) this.e.a().getValue()).booleanValue()) {
            return null;
        }
        return cbu0Var.a();
    }

    public final void b(lsm0 lsm0Var) {
        w590 w590VarA = a();
        if (w590VarA != null) {
            w590VarA.k(lsm0Var);
        }
    }

    public final void c() {
        this.b.d();
        w590 w590VarA = a();
        if (w590VarA != null) {
            w590VarA.n();
        }
    }

    public final void d() {
        w590 w590VarA = a();
        if (w590VarA != null) {
            w590VarA.o();
        }
    }

    public final void e(tv80 tv80Var, Long l, String str, yjp1 yjp1Var) {
        w590 w590VarA = a();
        if (w590VarA != null) {
            lsm0 lsm0VarB = ((z590) w590VarA.j().getValue()).b();
            if (lsm0VarB != null) {
                w590VarA.p(lsm0VarB, tv80Var, l, str, yjp1Var);
            } else {
                eg.m("must call load first");
            }
        }
    }

    public final void g() {
        smo1.q(this.f);
        cbu0 cbu0Var = this.d;
        w590 w590VarA = cbu0Var.a();
        if (w590VarA != null) {
            w590VarA.u((VideoSurfaceView) null);
        }
        w590 w590VarA2 = cbu0Var.a();
        if (w590VarA2 != null) {
            w590VarA2.v();
        }
        w590 w590VarA3 = cbu0Var.a();
        if (w590VarA3 != null) {
            w590VarA3.n();
        }
        cbu0Var.c();
        long jB = this.a.b();
        bpb1 bpb1Var = this.g;
        i091 i091Var = new i091(null, 0, jB, 0L, 0L, 0.0f, true, ((i091) bpb1Var.getValue()).h instanceof k091 ? ((i091) bpb1Var.getValue()).h : new k091(f091.a), null);
        bpb1Var.getClass();
        bpb1Var.m(null, i091Var);
        this.c.b(this.e);
    }

    public final void h(long j) {
        w590 w590VarA = a();
        if (w590VarA != null) {
            w590VarA.s(j);
        }
    }

    public final void i(VideoSurfaceView videoSurfaceView) {
        w590 w590VarA = a();
        if (w590VarA != null) {
            w590VarA.u(videoSurfaceView);
        }
    }

    public final void j() {
        w590 w590VarA = a();
        if (w590VarA != null) {
            w590VarA.v();
        }
    }

    public final void k() {
        w590 w590VarA;
        if (!this.b.f() || (w590VarA = a()) == null) {
            return;
        }
        w590VarA.w();
    }
}
