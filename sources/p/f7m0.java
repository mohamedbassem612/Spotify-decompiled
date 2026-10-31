package p;

import com.spotify.gpb.trackingimpl.events.proto.GpbOperation;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f7m0 implements Connectable {
    public final /* synthetic */ j7m0 a;
    public final /* synthetic */ p811 b;

    public f7m0(j7m0 j7m0Var, p811 p811Var) {
        this.a = j7m0Var;
        this.b = p811Var;
    }

    public final Connection L(Consumer consumer) {
        consumer.getClass();
        final j7m0 j7m0Var = this.a;
        j7m0Var.g = consumer;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        s141 s141Var = j7m0Var.d;
        compositeDisposable.b(s141Var.b.subscribe(new dn(consumer, (byte) 29)));
        final byte b = 4;
        compositeDisposable.b(s141Var.c.subscribe(new io.reactivex.rxjava3.functions.Consumer() { // from class: p.ekg
            public final void accept(Object obj) {
                byte b2 = b;
                v2d1 v2d1Var = v2d1.a;
                j7m0 j7m0Var2 = j7m0Var;
                switch (b2) {
                    case 0:
                        j7m0Var2.i.onNext(((ysa) obj).c);
                        return;
                    case 1:
                        zjb0 zjb0Var = (zjb0) obj;
                        j7m0Var2.k.onNext(new mmr0(zjb0Var.c, zjb0Var.d));
                        return;
                    case 2:
                        j7m0Var2.j.onNext(((zoc1) obj).c);
                        return;
                    case 3:
                        j7m0Var2.h.onNext(((w2d1) obj).c);
                        return;
                    case 4:
                        j7m0Var2.l.onNext((j331) obj);
                        return;
                    case 5:
                        Consumer consumer2 = j7m0Var2.g;
                        if (consumer2 != null) {
                            consumer2.accept(xsa.a);
                            return;
                        } else {
                            u890.C("eventConsumer");
                            throw null;
                        }
                    case 6:
                        Consumer consumer3 = j7m0Var2.g;
                        if (consumer3 != null) {
                            consumer3.accept(v2d1Var);
                            return;
                        } else {
                            u890.C("eventConsumer");
                            throw null;
                        }
                    case 7:
                        Consumer consumer4 = j7m0Var2.g;
                        if (consumer4 != null) {
                            consumer4.accept(v2d1Var);
                            return;
                        } else {
                            u890.C("eventConsumer");
                            throw null;
                        }
                    default:
                        vx40 vx40Var = j7m0Var2.f;
                        e550 e550VarP = GpbOperation.p();
                        e550VarP.t("PREFETCH");
                        vx40.B(e550VarP, (j331) obj, vc40.a1);
                        GpbOperation gpbOperation = (GpbOperation) e550VarP.build();
                        t2j0 t2j0Var = (t2j0) vx40Var.b;
                        gpbOperation.getClass();
                        t2j0Var.a(gpbOperation);
                        return;
                }
            }
        }));
        return new ibn(j7m0Var, this.b, compositeDisposable, (byte) 5);
    }
}
