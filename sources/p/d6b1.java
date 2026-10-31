package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d6b1 {
    public final m021 a;
    public final Scheduler b;
    public final txh0 c;
    public final k021 d;
    public final y610 e;
    public final h1i0 f;
    public dg90 g;
    public volatile boolean i;
    public volatile boolean j;
    public final rku k = new rku();
    public final tyh0 h = new tyh0();

    public d6b1(m021 m021Var, Scheduler scheduler, k021 k021Var, txh0 txh0Var, y610 y610Var, h1i0 h1i0Var) {
        this.a = m021Var;
        this.b = scheduler;
        this.c = txh0Var;
        this.d = k021Var;
        this.e = y610Var;
        this.f = h1i0Var;
    }

    public final y490 a() {
        return b().e();
    }

    public final dg90 b() {
        if (this.g == null) {
            dg90 dg90VarD = this.a.d();
            this.g = dg90VarD;
            Logger.b("MediaSession has been created %s", new Object[]{dg90VarD.k()});
            this.h.b(this.g);
        }
        return this.g;
    }

    public final void c() {
        dg90 dg90Var;
        Logger.b("MediaSession release if possible. MBS is bound to MS: %s Background scope has entered: %s", new Object[]{Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
        if (this.i || this.j || (dg90Var = this.g) == null) {
            return;
        }
        y490 y490VarE = dg90Var.e();
        y490VarE.release();
        this.f.g = null;
        Logger.b("MediaSession has been released %s", new Object[]{y490VarE.a()});
        this.h.b((dg90) null);
        this.g = null;
    }
}
