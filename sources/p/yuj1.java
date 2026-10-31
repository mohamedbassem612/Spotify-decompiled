package p;

import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yuj1 implements x191 {
    public final q8n a;
    public final v290 b;
    public final iac0 c;
    public final boolean d;
    public final gn10 e;
    public final i8h1 f;
    public final abu0 g;
    public final Function0 h;
    public drj1 i;
    public faa0 j;
    public faa0 k;
    public r091 l;
    public zau0 m;

    public yuj1(q8n q8nVar, v290 v290Var, iac0 iac0Var, boolean z, gn10 gn10Var, i8h1 i8h1Var, v1r0 v1r0Var, Function0 function0) {
        this.a = q8nVar;
        this.b = v290Var;
        this.c = iac0Var;
        this.d = z;
        this.e = gn10Var;
        this.f = i8h1Var;
        this.g = v1r0Var;
        this.h = function0;
    }

    @Override // p.x191
    public final boolean a() {
        return true;
    }

    @Override // p.x191
    public final void b(VideoSurfaceView videoSurfaceView, String str, long j, long j2, String str2, int i, String str3) {
        r6h1 r6h1Var;
        iu30 iu30Var;
        r091 r091Var = this.l;
        if (r091Var == null || ((Boolean) r091Var.d.b().getValue()).booleanValue() || ((Boolean) r091Var.e.a().getValue()).booleanValue()) {
            return;
        }
        r091Var.j();
        r091Var.i(videoSurfaceView);
        ien0 ien0Var = xhk1.a;
        op80 op80VarA = xhk1.a(videoSurfaceView);
        h3h1 h3h1VarC = j0o1.C(op80VarA);
        if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null) {
            r6h1Var = null;
        } else {
            Integer numN = l0o1.n(op80VarA);
            r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(numN != null ? numN.intValue() : 0));
        }
        tv80 tv80VarM = r6h1Var != null ? this.f.m(pdp1.l(r6h1Var).j(str2).i(str2), null) : null;
        ksm0 ksm0Var = new ksm0(this.d ? new gec1("0fd0c9ee3b1647d7959b1276fb58d5d8") : fec1.c, str3 == null ? str2 : str3, (String) null, this.e.a, (String) null, (String) null, 500);
        this.b.getClass();
        r091Var.b(new lsm0(wqn1.n(str), ksm0Var, true, false, new jsm0(Long.valueOf(j), Long.valueOf(j2)), 0L, (ism0) null, "video-preview-carousel", false, i, 1384));
        r091.f(r091Var, tv80VarM, null, lky0.a(), 6);
    }

    @Override // p.x191
    public final void c(String str, sjf1 sjf1Var, sjf1 sjf1Var2) {
        zau0 zau0VarE;
        abu0 abu0Var = this.g;
        if (abu0Var == null || (zau0VarE = abu0Var.e(str, false)) == null) {
            abu0 abu0Var2 = (abu0) this.h.invoke();
            zau0VarE = abu0Var2 != null ? abu0Var2.e(str, false) : null;
        }
        if (zau0VarE != this.m) {
            faa0 faa0Var = this.k;
            if (faa0Var != null) {
                faa0Var.d(null);
            }
            r091 r091Var = this.l;
            if (r091Var != null) {
                r091Var.g();
            }
            this.l = null;
        }
        this.m = zau0VarE;
        if (zau0VarE != null) {
            d(sjf1Var, sjf1Var2);
        }
    }

    @Override // p.x191
    public final void d(Function0 function0, Function0 function1) {
        faa0 faa0Var = this.j;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.j = c921.y(cto1.q(this.c), this.a, 0, new vxg1(this, function1, function0, (lnm) null, (byte) 19), 2);
    }

    @Override // p.x191
    public final void e() {
        faa0 faa0Var = this.j;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        faa0 faa0Var2 = this.k;
        if (faa0Var2 != null) {
            faa0Var2.d(null);
        }
        r091 r091Var = this.l;
        if (r091Var != null) {
            r091Var.g();
        }
    }

    @Override // p.x191
    public final void f(drj1 drj1Var) {
        this.i = drj1Var;
    }

    @Override // p.x191
    public final void g(Function0 function0) {
        zau0 zau0Var = this.m;
        if (zau0Var != null) {
            abu0 abu0Var = this.g;
            if (abu0Var != null) {
                abu0Var.a(zau0Var);
                return;
            }
            abu0 abu0Var2 = (abu0) this.h.invoke();
            if (abu0Var2 != null) {
                abu0Var2.a(zau0Var);
            }
        }
    }

    @Override // p.x191
    public final void stop() {
        r091 r091Var = this.l;
        if (r091Var == null || ((Boolean) r091Var.d.b().getValue()).booleanValue() || ((Boolean) r091Var.e.a().getValue()).booleanValue()) {
            return;
        }
        r091Var.j();
    }
}
