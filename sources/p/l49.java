package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l49 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m49 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l49(m49 m49Var, byte b) {
        super(1);
        this.a = b;
        this.b = m49Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        byte b = this.a;
        m49 m49Var = this.b;
        switch (b) {
            case 0:
                return ((Completable) ((p5) m49Var.a.c).invoke(((e49) obj).c)).d(Observable.just(w49.a)).doOnComplete(ps4.g).doOnError(nm.a1).onErrorReturn(uwg.Y);
            case 1:
                return ((Observable) ((hgo) m49Var.a.g).invoke()).take(1L).map(m9h.Y).onErrorReturn(p9w.Y);
            case 2:
                c49 c49Var = (c49) obj;
                em0 em0Var = m49Var.a;
                le20 le20Var = c49Var.c;
                bnv0 bnv0Var = c49Var.d;
                ffr ffrVar = (ffr) em0Var.e;
                String str = le20Var.a.a;
                String str2 = le20Var.b.a;
                woa1 woa1Var = le20Var.c;
                return ((Completable) ffrVar.invoke(new me20(str, str2, woa1Var != null ? woa1Var.a : null, le20Var.d.a, woa1Var != null ? woa1Var.e : null, true, woa1Var != null))).d(Observable.just(new s49(le20Var, bnv0Var))).doOnComplete(ps4.f).doOnError(nm.Z0).onErrorReturn(rbc.Y);
            case 3:
                em0 em0Var2 = m49Var.a;
                Scheduler scheduler = (Scheduler) em0Var2.d;
                return (((d49) obj).c ? ((Completable) ((x631) em0Var2.h).invoke("android-puffin-onboarding")).c(new CompletableFromAction(new f72(em0Var2, (byte) 4)).s(scheduler)) : new CompletableFromAction(new f72(em0Var2, (byte) 4)).s(scheduler)).w();
            default:
                i49 i49Var = (i49) obj;
                em0 em0Var3 = m49Var.a;
                le20 le20Var2 = i49Var.c;
                ((cpr) em0Var3.f).b(i49Var.d);
                return Completable.l(p7h.M(new Completable[]{j2h1.D((q8n) em0Var3.X, new k96(em0Var3, le20Var2, (lnm) null, (byte) 19)), ((vqb0) em0Var3.t).invoke()})).d(Observable.just(z49.a));
        }
    }
}
