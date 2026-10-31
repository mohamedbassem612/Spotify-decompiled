package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m2o0 implements yt90 {
    public final Observable a;
    public final fy91 b;
    public final b0a0 c;
    public final v4o0 d;
    public final Context e;
    public final llm f;

    public m2o0(Observable observable, fy91 fy91Var, b0a0 b0a0Var, v4o0 v4o0Var, Context context, q8n q8nVar) {
        this.a = observable;
        this.b = fy91Var;
        this.c = b0a0Var;
        this.d = v4o0Var;
        this.e = context;
        this.f = l1d.x(q8nVar);
    }

    @Override // p.yt90
    public final void start() {
        if (((no4) this.c.a.get()).j()) {
            l4p1.u(this.f, f5p1.q(hu20.e(rqt0.u(yoi1.g(this.a)), new zz90((lnm) null, this, (byte) 28)), new vse0(this, (lnm) null, (byte) 4)));
        }
    }

    @Override // p.yt90
    public final void stop() {
        op71.r(this.f.a);
    }
}
