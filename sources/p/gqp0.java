package p;

import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gqp0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ hqp0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqp0(hqp0 hqp0Var, int i, int i2, boolean z, int i3, lnm lnmVar) {
        super(2, lnmVar);
        this.b = hqp0Var;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new gqp0(this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (!this.b.h) {
                hqp0 hqp0Var = this.b;
                hqp0Var.f = this.c;
                hqp0Var.g = this.d;
                yna ynaVar = hqp0Var.a;
                this.a = true;
                if (ynaVar.c(this) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (!this.b.h) {
            hqp0 hqp0Var2 = this.b;
            hqp0Var2.a.c.b.add(hqp0Var2);
            hna hnaVar = this.b.b;
            hnaVar.j.a(Completable.u(10L, TimeUnit.SECONDS, Schedulers.b).n(hnaVar.i).subscribe(new gna(hnaVar, this.f)));
            hqp0 hqp0Var3 = this.b;
            kl1 kl1Var = hqp0Var3.c;
            boolean z2 = this.e;
            Disposable disposable = (Disposable) kl1Var.e;
            if (disposable == null || disposable.isDisposed()) {
                kl1Var.f = hqp0Var3;
                kl1Var.a = z2;
                kup0 kup0VarO = OfflinePlugin.PluginInit.o();
                kup0VarO.q();
                kup0VarO.n();
                kup0VarO.r();
                OfflinePlugin.PluginInit pluginInitBuild = kup0VarO.build();
                oup0 oup0Var = (oup0) kl1Var.b;
                pluginInitBuild.getClass();
                kl1Var.e = oup0Var.a(pluginInitBuild).flatMapSingle(new e5l0(kl1Var, (byte) 14)).observeOn((Scheduler) kl1Var.d).subscribe(new lrj0(kl1Var, (byte) 27));
                return rih1Var;
            }
        }
        return rih1Var;
    }
}
