package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromCallable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fkp0 implements sg60 {
    public final yqg a;
    public final String b;
    public final Scheduler c;
    public final idd1 d;
    public final idd1 e;

    public fkp0(Activity activity, yqg yqgVar, ut71 ut71Var, String str, Scheduler scheduler) {
        this.a = yqgVar;
        this.b = str;
        this.c = scheduler;
        this.d = new idd1(new q2o0(activity, (byte) 2));
        this.e = new idd1(new pcp0(ut71Var, activity, this, (byte) 10));
    }

    @Override // p.sg60
    public final void a(mfu mfuVar) {
        hma1 hma1VarEdit = ((dma1) this.e.getValue()).edit();
        hma1VarEdit.a(t0c0.o, mfuVar.equals(efu.a));
        hma1VarEdit.h();
    }

    @Override // p.sg60
    public final Observable b(tg60 tg60Var) {
        CompletableSubscribeOn completableSubscribeOnS = tg60Var.a ? new CompletableFromCallable(new sra(this, (byte) 10)).s(this.c) : CompletableEmpty.a;
        completableSubscribeOnS.getClass();
        return completableSubscribeOnS.d(ha71.D((dma1) this.e.getValue(), t0c0.o).map(new m4e0(tg60Var, (byte) 21)).map(new ruc0(this, (byte) 27)));
    }
}
