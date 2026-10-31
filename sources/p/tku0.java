package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tku0 implements sg60 {
    public final /* synthetic */ byte a;
    public final String b;
    public final Scheduler c;
    public final idd1 d;
    public final idd1 e;

    public tku0(Activity activity, ut71 ut71Var, String str, Scheduler scheduler, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = str;
                this.c = scheduler;
                this.d = new idd1(new q2o0(activity, (byte) 5));
                this.e = new idd1(new d4v0(ut71Var, activity, this, (byte) 0));
                break;
            default:
                this.b = str;
                this.c = scheduler;
                this.d = new idd1(new q2o0(activity, (byte) 4));
                this.e = new idd1(new pcp0(ut71Var, activity, this, (byte) 21));
                break;
        }
    }

    @Override // p.sg60
    public final void a(mfu mfuVar) {
        byte b = this.a;
        idd1 idd1Var = this.e;
        switch (b) {
            case 0:
                hma1 hma1VarEdit = ((dma1) idd1Var.getValue()).edit();
                hma1VarEdit.a(t0c0.l, true);
                hma1VarEdit.h();
                break;
            default:
                hma1 hma1VarEdit2 = ((dma1) idd1Var.getValue()).edit();
                hma1VarEdit2.a(t0c0.m, true);
                hma1VarEdit2.h();
                break;
        }
    }

    @Override // p.sg60
    public final Observable b(tg60 tg60Var) {
        byte b = this.a;
        idd1 idd1Var = this.e;
        Scheduler scheduler = this.c;
        switch (b) {
            case 0:
                CompletableSubscribeOn completableSubscribeOnS = tg60Var.a ? new CompletableFromCallable(new sra(this, (byte) 14)).s(scheduler) : CompletableEmpty.a;
                completableSubscribeOnS.getClass();
                return completableSubscribeOnS.d(ha71.D((dma1) idd1Var.getValue(), t0c0.l).map(new tym0(tg60Var, (byte) 25)).map(new qkn0(this, (byte) 23)));
            default:
                CompletableSubscribeOn completableSubscribeOnS2 = tg60Var.a ? new CompletableFromCallable(new sra(this, (byte) 15)).s(scheduler) : CompletableEmpty.a;
                completableSubscribeOnS2.getClass();
                return completableSubscribeOnS2.d(ha71.D((dma1) idd1Var.getValue(), t0c0.m).map(new jkp0(tg60Var, (byte) 18)).map(new vyq0(this, (byte) 8)));
        }
    }
}
