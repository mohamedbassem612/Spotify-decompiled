package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r5z implements Connectable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public r5z(Flowable flowable, xrn0 xrn0Var, cf50 cf50Var, Scheduler scheduler) {
        this.a = (byte) 1;
        this.b = flowable;
        this.c = xrn0Var;
        this.d = cf50Var;
        this.e = scheduler;
        this.f = new vku();
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case 0:
                this.d = consumer;
                return new rp(this, (byte) 26);
            default:
                ((vku) this.f).a(((Flowable) this.b).J(new ekb(this, (byte) 12)).t(Functions.a).L((Scheduler) this.e).subscribe(new dn(consumer, (byte) 24)));
                return new rp(this, (byte) 29);
        }
    }

    public r5z(u800 u800Var, i5z i5zVar) {
        this.a = (byte) 0;
        this.b = u800Var;
        this.c = i5zVar;
    }
}
