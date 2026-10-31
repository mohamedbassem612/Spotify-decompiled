package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class swo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ swo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final vyr0 a(vu30 vu30Var) {
        byte b = this.a;
        blp blpVar = this.b;
        switch (b) {
            case 0:
                qq qqVar = (qq) ((fwo) blpVar).c;
                Flowable flowable = (Flowable) ((mb1) qqVar.a).f.get();
                c8o.l(flowable);
                return new vyr0(flowable, (qxr0) ((fwo) qqVar.j).get(), vu30Var);
            default:
                wj3 wj3Var = (wj3) blpVar.c;
                Flowable flowable2 = (Flowable) ((d7g0) wj3Var.b).g.get();
                c8o.l(flowable2);
                return new vyr0(flowable2, (qxr0) ((blp) wj3Var.X).get(), vu30Var);
        }
    }
}
