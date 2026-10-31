package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class il91 implements jl91, iac0 {
    public final CompletableOnErrorComplete Y;
    public final idd1 Z;
    public final jo91 a;
    public final ynb0 b;
    public final ynb0 c;
    public final jj91 d;
    public final Scheduler e;
    public final Scheduler f;
    public final Scheduler g;
    public final nn61 h;
    public final tac0 i = new tac0(this, true);
    public final Subject t = new PublishSubject().c();
    public final rku X = new rku();

    public il91(jo91 jo91Var, ynb0 ynb0Var, ynb0 ynb0Var2, jj91 jj91Var, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, nn61 nn61Var) {
        this.a = jo91Var;
        this.b = ynb0Var;
        this.c = ynb0Var2;
        this.d = jj91Var;
        this.e = scheduler;
        this.f = scheduler2;
        this.g = scheduler3;
        this.h = nn61Var;
        Completable completableIgnoreElement = nn61Var.f().filter(mgx0.Z).firstOrError().ignoreElement();
        CompletableError completableErrorJ = Completable.j(new TimeoutException());
        completableIgnoreElement.getClass();
        this.Y = completableIgnoreElement.t(15L, TimeUnit.SECONDS, Schedulers.b, completableErrorJ).o(Functions.h);
        scheduler3.c(new g54(this, (byte) 15));
        Logger.b(gvg.e(hashCode(), "SmartShuffleCore ", " created"), new Object[0]);
        this.Z = new idd1(new fe81(this, (byte) 18));
    }

    public final x8c0 getLifecycle() {
        return this.i;
    }
}
