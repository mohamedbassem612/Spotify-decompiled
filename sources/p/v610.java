package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class v610 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y610 b;

    public /* synthetic */ v610(y610 y610Var, byte b) {
        this.a = b;
        this.b = y610Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        y610 y610Var = this.b;
        switch (b) {
            case 0:
                y610Var.q = y610Var.x.subscribe(new v610(y610Var, b2), new jld((byte) 4));
                break;
            default:
                iow iowVar = (kow) obj;
                boolean z = iowVar instanceof iow;
                r410 r410Var = y610Var.d;
                if (!z) {
                    r410Var.c.dispose();
                    break;
                } else {
                    iow iowVar2 = iowVar;
                    vgq0 vgq0Var = iowVar2.c;
                    Set set = r410Var.b.d;
                    if (set == null || set.isEmpty()) {
                        Completable completableFlatMapCompletable = r410Var.a.b("type").map(fkj0.T0).take(1L).singleOrError().flatMapCompletable(new w2z(r410Var, vgq0Var, (byte) 9));
                        completableFlatMapCompletable.getClass();
                        r410Var.c = completableFlatMapCompletable.o(Functions.h).subscribe();
                    }
                    q610 q610Var = y610Var.l;
                    ijg ijgVar = iowVar2.d;
                    if (q610Var.a.a()) {
                        rku rkuVar = q610Var.e;
                        k811 k811Var = q610Var.b;
                        rkuVar.b(Single.create(new xaz0(k811Var, (byte) 13)).onErrorReturnItem(q031.a).subscribeOn((Scheduler) k811Var.c).subscribeOn(q610Var.c).doOnSuccess(dxu.S0).flatMap(new t7y(q610Var, ijgVar, (byte) 15)).flatMap(new wb00(q610Var, (byte) 2)).subscribe(new p610(q610Var, (byte) 0), new p610(q610Var, (byte) 1)));
                        break;
                    }
                }
                break;
        }
    }
}
