package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kmh1 extends hab0 implements iu30 {
    public final /* synthetic */ psy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmh1(psy psyVar) {
        super(1);
        this.a = psyVar;
    }

    public final Object invoke(Object obj) {
        psy psyVar = this.a;
        cas casVar = (a7m0) obj;
        casVar.d = new hmh1(psyVar, (byte) 0);
        casVar.e = new hmh1(psyVar, (byte) 1);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = (q8n) psyVar.c;
        mr20 mr20VarG = yoi1.g(Observable.combineLatest(new ObservableFromPublisher(((tuz) psyVar.e).c), ((o241) psyVar.i).a, yz10.X0).distinctUntilChanged().cast(z8z0.class));
        sks0 sks0Var = (sks0) psyVar.g;
        mr20[] mr20VarArr = {mr20VarG, yoi1.g(((waz0) sks0Var.b).c().map(new l7c(sks0Var, (byte) 21)).distinctUntilChanged().cast(z8z0.class)), new jha1(rqt0.u(new jha1((mr20) psyVar.h, (byte) 24)), (byte) 25)};
        companion.getClass();
        casVar.b = new b(q8nVar, mr20VarArr);
        return rih1.a;
    }
}
