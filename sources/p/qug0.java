package p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qug0 implements dwo {
    public final q8n a;
    public final be91 b;
    public final np61 c;
    public final MobiusLoop.Builder d;
    public final rku e;
    public MobiusLoop f;
    public boolean g;

    public qug0(Scheduler scheduler, Scheduler scheduler2, q8n q8nVar, boolean z, be91 be91Var, np61 np61Var, MobiusLoop.Builder builder) {
        this.a = q8nVar;
        this.b = be91Var;
        this.c = np61Var;
        this.d = builder;
        rku rkuVar = new rku();
        this.e = rkuVar;
        rkuVar.b(Observable.just(Boolean.valueOf(z)).filter(fkj0.Y0).switchMapSingle(new upa0(this, (byte) 18)).subscribeOn(scheduler).filter(cj20.N0).flatMapSingle(new eea0(this, (byte) 17)).observeOn(scheduler2).subscribe(new rwa0(this, (byte) 23), p.T0));
        this.g = true;
    }

    @Override // p.dwo
    public final void shutdown() {
        if (this.g) {
            this.e.a();
            MobiusLoop mobiusLoop = this.f;
            if (mobiusLoop != null) {
                mobiusLoop.dispose();
            }
            this.f = null;
            this.g = false;
        }
    }
}
