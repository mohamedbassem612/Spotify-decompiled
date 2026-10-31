package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dza1 implements yw0 {
    public final Flowable a;
    public final be91 b;
    public final fza1 c;
    public final kly0 d;
    public final kly0 e;
    public final llm f;

    public dza1(Flowable flowable, be91 be91Var, fza1 fza1Var, fwo fwoVar, jly0 jly0Var, q8n q8nVar) {
        this.a = flowable;
        this.b = be91Var;
        this.c = fza1Var;
        this.d = fwoVar;
        this.e = jly0Var;
        this.f = smo1.e(q8nVar);
    }

    public final mr20 a() {
        vbm[] vbmVarArr = q601.a;
        mr20 mr20VarU = rqt0.u(new h801(new kge(this.a), (byte) 13));
        return !((o44) this.d.get()).b() ? mr20VarU : new x010(new ht20(this.c.m, new egv0(2, (lnm) null, (byte) 22)), mr20VarU, new a89(3, (lnm) null, (byte) 1), (byte) 1);
    }

    public final void start() {
        ipr iprVar = new ipr("", a(), new af01(this, (lnm) null, (byte) 27), (byte) 16);
        llm llmVar = this.f;
        l4p1.u(llmVar, iprVar);
        if (((o44) this.d.get()).a()) {
            l4p1.u(llmVar, new fu20(new zo51(new x010(new nev0(((ay0) this.e.get()).i, (byte) 9), a(), aza1.h, (byte) 1), this, (byte) 27), new xba1(this, null, (byte) 3), (byte) 1));
        }
    }

    public final void stop() {
        smo1.p(this.f, (CancellationException) null);
    }
}
