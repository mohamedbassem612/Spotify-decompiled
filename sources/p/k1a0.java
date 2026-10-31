package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k1a0 implements yt90 {
    public final /* synthetic */ byte a;
    public final c9c0 b;
    public final b0a0 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;

    public k1a0(kg61 kg61Var, kt91 kt91Var, b0a0 b0a0Var, Observable observable, Scheduler scheduler, Flowable flowable, c9c0 c9c0Var, tq90 tq90Var, Context context) {
        this.a = (byte) 0;
        this.d = kg61Var;
        this.e = kt91Var;
        this.c = b0a0Var;
        this.f = observable;
        this.g = scheduler;
        this.h = flowable;
        this.b = c9c0Var;
        this.i = tq90Var;
        this.j = context;
        this.k = new rku();
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (((no4) this.c.a.get()).s()) {
                    kg61 kg61Var = (kg61) obj;
                    ((rku) this.k).b(((Observable) this.f).switchMap(new l1a0(yoi1.i(kg61Var.a.a("social-connect/v2/session_messages", new d061(1, kg61Var, kg61.class, "sessionUserMessage", "sessionUserMessage(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/jam/internal/socialconnect/endpoints/api/SessionUserMessage;", 0, (byte) 2)), o6x.a).map(zi20.f).retry().withLatestFrom(new ObservableFromPublisher((Flowable) this.h).map(aj20.g).distinctUntilChanged(), new wb00(this, (byte) 22)), (byte) 0)).observeOn((Scheduler) this.g).subscribe(new od30(this, (byte) 26), k530.Q0));
                }
                break;
            default:
                l4p1.u((llm) this.j, new fu20(new x880(hu20.e((mr20) obj, new zz90((lnm) null, (Object) this, (byte) 4)), this, (byte) 27), new iyb0(this, (lnm) null, (byte) 2), (byte) 1));
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                ((rku) this.k).a();
                break;
            default:
                op71.q(((llm) this.j).a, (CancellationException) null);
                break;
        }
    }

    public k1a0(mr20 mr20Var, c9c0 c9c0Var, fy91 fy91Var, b0a0 b0a0Var, j6d0 j6d0Var, p4s p4sVar, ox90 ox90Var, yqg yqgVar, q8n q8nVar) {
        this.a = (byte) 1;
        this.d = mr20Var;
        this.b = c9c0Var;
        this.e = fy91Var;
        this.c = b0a0Var;
        this.f = j6d0Var;
        this.g = p4sVar;
        this.h = ox90Var;
        this.i = yqgVar;
        this.j = us71.h(q8nVar);
    }
}
