package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class av41 {
    public final Flowable a;
    public final Scheduler b;
    public final Scheduler c;
    public final rku d = new rku();

    public av41(Flowable flowable, Scheduler scheduler, Scheduler scheduler2) {
        this.a = flowable;
        this.b = scheduler;
        this.c = scheduler2;
    }

    public final void a(Function0 function0, Function0 function1) {
        this.d.b(this.a.W(this.c).L(this.b).t(Functions.a).subscribe(new z0u0(function0, function1, (byte) 11)));
    }
}
