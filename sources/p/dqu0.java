package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dqu0 extends x7e0 {
    public final wmy d;
    public final q8n e;
    public xab1 f;
    public final llm g;
    public final bpb1 h = gio1.b((Object) null);

    public dqu0(wmy wmyVar, q8n q8nVar, q8n q8nVar2) {
        this.d = wmyVar;
        this.e = q8nVar;
        this.g = smo1.e(q8nVar2);
    }

    public final void e() {
        if (this.h.getValue() != null) {
            i();
        } else {
            j();
        }
        wmy wmyVar = this.d;
        bpu0 bpu0Var = (bpu0) wmyVar.d;
        rsc0 rsc0Var = bpu0Var.a;
        String str = (String) wmyVar.a;
        lnm lnmVar = null;
        byte b = 1;
        jge jgeVarE = hu20.e(hu20.c(rsc0Var.o(str), new zio0(2, (lnm) null, (byte) 12)), new apu0(lnmVar, bpu0Var, str, b));
        o6x o6xVar = o6x.a;
        Observable observableI = yoi1.i(jgeVarE, o6xVar);
        Flowable flowable = (Flowable) wmyVar.b;
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(flowable);
        kbd kbdVar = (kbd) wmyVar.c;
        Observable observableI2 = yoi1.i(kbdVar.b(), o6xVar);
        tf2 tf2Var = new tf2(hu20.e(hu20.c(rsc0Var.o(str), new zio0(2, (lnm) null, (byte) 12)), new apu0(lnmVar, bpu0Var, str, b)), (byte) 23);
        mr20 mr20VarB = kbdVar.b();
        vbm[] vbmVarArr = q601.a;
        this.f = l4p1.u(this.g, new lt20(new fu20(o4p1.r(yoi1.g(Observable.combineLatest(observableI, observableFromPublisher, observableI2, yoi1.i(h5p1.s(tf2Var, mr20VarB, new kge(flowable), new aqu0(wmyVar, null)), o6xVar), yb10.b1)), this.e), new cqu0(this, null, (byte) 0), (byte) 1), new lok0(this, (lnm) null, (byte) 14), (byte) 0));
    }

    public final void f() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
