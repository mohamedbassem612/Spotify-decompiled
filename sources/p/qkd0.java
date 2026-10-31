package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qkd0 implements Supplier {
    public final /* synthetic */ rkd0 a;
    public final /* synthetic */ y6b1 b;
    public final /* synthetic */ long c;

    public qkd0(rkd0 rkd0Var, y6b1 y6b1Var, long j) {
        this.a = rkd0Var;
        this.b = y6b1Var;
        this.c = j;
    }

    public final Object get() {
        rkd0 rkd0Var = this.a;
        zip0 zip0Var = rkd0Var.a;
        y6b1 y6b1Var = this.b;
        Observable observableBuffer = zip0Var.a(y6b1Var).flatMap(new v6a0(rkd0Var, y6b1Var, (byte) 22)).buffer(Observable.interval(rkd0Var.e, rkd0Var.f, TimeUnit.MILLISECONDS));
        long j = this.c;
        return observableBuffer.flatMapIterable(new n4t((byte) 3, j)).distinctUntilChanged(bk20.i).compose(new m4t(j, rkd0Var.g));
    }
}
