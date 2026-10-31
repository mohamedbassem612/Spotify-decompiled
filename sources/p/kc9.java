package p;

import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kc9 extends v7s {
    public final x610 k;
    public final Flowable l;
    public final g510 m;
    public final r8l n;
    public final g0l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Scheduler f39p;

    public kc9(x610 x610Var, PlayOrigin playOrigin, int i, Flowable flowable, oyr oyrVar, g510 g510Var, d8q d8qVar, r8l r8lVar, b791 b791Var, g0l g0lVar, u210 u210Var, Scheduler scheduler, phl1 phl1Var, e8q e8qVar, uic uicVar) {
        super(x610Var, playOrigin, i, oyrVar, g510Var, d8qVar, r8lVar, b791Var, u210Var, phl1Var, e8qVar, uicVar);
        this.k = x610Var;
        this.l = flowable;
        this.m = g510Var;
        this.n = r8lVar;
        this.o = g0lVar;
        this.f39p = scheduler;
    }

    @Override // p.v7s
    public final Completable c(String str) {
        return this.l.z().map(new icx0(this, (byte) 29)).flatMap(new jc9(this, (byte) 0)).ignoreElement().q(this.m.o(this.n.a(str)).ignoreElement());
    }

    @Override // p.v7s
    public final Completable e(String str) {
        Completable completableFlatMapCompletable = this.o.d().filter(pzs0.Y).firstOrError().timeout(1L, TimeUnit.SECONDS, this.f39p, Single.error(new TimeoutException())).flatMapCompletable(new ic9(this, str, (byte) 0));
        completableFlatMapCompletable.getClass();
        return completableFlatMapCompletable.o(Functions.h);
    }

    @Override // p.v7s
    public final Completable k(String str) {
        return this.l.z().map(new hcx0(this, (byte) 29)).flatMap(new t4d1(this, (byte) 25)).ignoreElement().q(this.m.n(this.n.a(str)).ignoreElement());
    }

    @Override // p.v7s
    public final Completable l(String str, y0i0 y0i0Var) {
        return this.l.z().map(new fp8(this, y0i0Var, (byte) 2)).flatMapCompletable(new q59(this, str, (byte) 2));
    }
}
