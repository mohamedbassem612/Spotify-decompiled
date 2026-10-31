package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ji91 implements mk90 {
    public final String a;
    public final Scheduler b;
    public final ip91 c;
    public final Flowable d;
    public final jo91 e;
    public final rku f = new rku();
    public final PublishSubject g = new PublishSubject();

    public ji91(String str, Scheduler scheduler, ip91 ip91Var, Flowable flowable, jo91 jo91Var) {
        this.a = str;
        this.b = scheduler;
        this.c = ip91Var;
        this.d = flowable;
        this.e = jo91Var;
    }

    public final void a() {
        this.f.a();
    }

    public final void b() {
        if (this.e.b()) {
            return;
        }
        this.f.b(this.g.switchMapCompletable(new xq81(this, (byte) 1)).s(this.b).subscribe());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum t(ak90 ak90Var, lnm lnmVar) {
        ii91 ii91Var;
        CompletableFromAction completableFromAction;
        if (lnmVar instanceof ii91) {
            ii91Var = (ii91) lnmVar;
            int i = ii91Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ii91Var.c = i - Integer.MIN_VALUE;
            } else {
                ii91Var = new ii91(this, (onm) lnmVar);
            }
        } else {
            ii91Var = new ii91(this, (onm) lnmVar);
        }
        Object obj = ii91Var.a;
        int i2 = ii91Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (ak90Var instanceof xj90) {
                zuc0 zuc0Var = ((xj90) ak90Var).b;
                if (zuc0Var.f.contains(new ll81("tap"))) {
                    completableFromAction = new CompletableFromAction(new tt60(this, zuc0Var, (byte) 26));
                } else {
                    completableFromAction = CompletableEmpty.a;
                    completableFromAction.getClass();
                }
                ii91Var.c = 1;
                Object objI = fc11.i(completableFromAction, ii91Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return lk90.a;
    }
}
