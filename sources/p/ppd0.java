package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ppd0 implements Connectable {
    public final /* synthetic */ byte a;
    public final Flowable b;
    public final Flowable c;
    public final Scheduler d;
    public final Scheduler e;
    public final skd0 f;
    public final vku g;
    public iu30 h;
    public qpd0 i;

    public ppd0(Flowable flowable, Flowable flowable2, Scheduler scheduler, Scheduler scheduler2, skd0 skd0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = flowable;
                this.c = flowable2;
                this.d = scheduler;
                this.e = scheduler2;
                this.f = skd0Var;
                this.g = new vku();
                this.h = god0.i;
                this.i = new qpd0();
                break;
            default:
                this.b = flowable;
                this.c = flowable2;
                this.d = scheduler;
                this.e = scheduler2;
                this.f = skd0Var;
                this.g = new vku();
                this.h = god0.h;
                this.i = new qpd0();
                break;
        }
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Scheduler scheduler = this.d;
        byte b2 = 3;
        Flowable flowable = this.b;
        vku vkuVar = this.g;
        switch (b) {
            case 0:
                lbc0 lbc0Var = new lbc0(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 2);
                this.h = lbc0Var;
                lbc0Var.invoke(this.i);
                vbm[] vbmVarArr = q601.a;
                vkuVar.a(yoi1.h(h4p1.g(new p18(this.i.a, new kge(flowable), new kge(this.c), this.f, (lnm) null, (byte) 4)), w0h1.h(this.e)).L(scheduler).subscribe(new rwa0(this, (byte) 6)));
                return new n1b0(this, b2);
            default:
                lbc0 lbc0Var2 = new lbc0(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 3);
                this.h = lbc0Var2;
                lbc0Var2.invoke(this.i);
                Function function = Functions.a;
                vkuVar.a(flowable.t(function).J(new yfc0(this, (byte) 3)).L(scheduler).subscribe(new opd0(this, (byte) 0)));
                vkuVar.a(flowable.t(function).X(new upa0(this, (byte) 8)).L(scheduler).subscribe(new opd0(this, (byte) 1)));
                return new n1b0(this, (byte) 4);
        }
    }
}
