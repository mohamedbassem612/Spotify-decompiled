package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qzl1 implements dwo {
    public final y4m1 a;
    public final xyl1 b;
    public final xam0 c;
    public final llm d;
    public final Object e = new Object();
    public vam0 f;
    public volatile PlayerState g;

    public qzl1(Flowable flowable, y4m1 y4m1Var, xyl1 xyl1Var, ytw0 ytw0Var, xam0 xam0Var, llm llmVar) {
        this.a = y4m1Var;
        this.b = xyl1Var;
        this.c = xam0Var;
        this.d = llmVar;
        n811 n811Var = new n811();
        vbm[] vbmVarArr = q601.a;
        l4p1.u(llmVar, x4p1.q(1, f5p1.q(hu20.e(rqt0.t(new iib(f5p1.q(new kge(flowable), new t6j1(this, (lnm) null, (byte) 26)), this, (byte) 15), z691.Z), new afb1((lnm) null, this, (byte) 16)), new os20(this, n811Var, (lnm) null, (byte) 3)), new k53(n811Var, (lnm) null, (byte) 29)));
    }

    public final void a(li20 li20Var) {
        try {
            vam0 vam0Var = this.f;
            if (vam0Var != null) {
                vam0Var.d(li20Var);
            }
        } catch (Exception e) {
            Logger.e(e, "Failed to stop active workout session", new Object[0]);
        }
        this.f = null;
    }

    @Override // p.dwo
    public final void shutdown() {
        synchronized (this.e) {
            a(li20.INTERRUPTED);
        }
        this.c.b.y();
        smo1.q(this.d);
    }
}
