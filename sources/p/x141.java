package p;

import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class x141 implements CompletableOnSubscribe, MaybeOnSubscribe, ObservableOnSubscribe, SingleOnSubscribe {
    public final /* synthetic */ o8n a;
    public final /* synthetic */ vu30 b;

    public /* synthetic */ x141(o8n o8nVar, vu30 vu30Var) {
        this.a = o8nVar;
        this.b = vu30Var;
    }

    public void subscribe(CompletableEmitter completableEmitter) {
        o8n o8nVarL = ulo1.l(o6x.a, this.a, true);
        o8n o8nVar = igu.a;
        if (o8nVarL != o8nVar && o8nVarL.A(wdu0.Y) == null) {
            o8nVarL = o8nVarL.y(o8nVar);
        }
        w141 w141Var = new w141(o8nVarL, completableEmitter);
        completableEmitter.setCancellable(new v141(w141Var));
        w141Var.A0(1, w141Var, this.b);
    }

    public void subscribe(MaybeEmitter maybeEmitter) {
        o8n o8nVarL = ulo1.l(o6x.a, this.a, true);
        o8n o8nVar = igu.a;
        if (o8nVarL != o8nVar && o8nVarL.A(wdu0.Y) == null) {
            o8nVarL = o8nVarL.y(o8nVar);
        }
        l241 l241Var = new l241(o8nVarL, maybeEmitter);
        maybeEmitter.setCancellable(new v141(l241Var));
        l241Var.A0(1, l241Var, this.b);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        o8n o8nVarL = ulo1.l(o6x.a, this.a, true);
        o8n o8nVar = igu.a;
        if (o8nVarL != o8nVar && o8nVarL.A(wdu0.Y) == null) {
            o8nVarL = o8nVarL.y(o8nVar);
        }
        n241 n241Var = new n241(o8nVarL, observableEmitter);
        observableEmitter.setCancellable(new v141(n241Var));
        n241Var.A0(1, n241Var, this.b);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        o8n o8nVarL = ulo1.l(o6x.a, this.a, true);
        o8n o8nVar = igu.a;
        if (o8nVarL != o8nVar && o8nVarL.A(wdu0.Y) == null) {
            o8nVarL = o8nVarL.y(o8nVar);
        }
        z241 z241Var = new z241(o8nVarL, singleEmitter);
        singleEmitter.setCancellable(new v141(z241Var));
        z241Var.A0(1, z241Var, this.b);
    }
}
