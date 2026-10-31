package p;

import android.content.Intent;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class coa1 implements dyf0, o5s {
    public final yrs a;

    public coa1(iac0 iac0Var, yrs yrsVar) {
        this.a = yrsVar;
        iac0Var.getLifecycle().a(this);
    }

    public final void a(Intent intent) {
        String stringExtra = intent.getStringExtra("DEVICE_ID");
        if (stringExtra != null) {
            yrs yrsVar = this.a;
            vku vkuVar = yrsVar.e;
            Flowable flowable = yrsVar.a;
            vkuVar.a(Observable.combineLatest(x0d.j(flowable, flowable), ((inr) yrsVar.b).j().filter(fmv.Y0).flatMap(new yjp1(stringExtra, (byte) 4)), v560.X0).take(1L).doOnNext(fcc.V0).filter(qz70.X0).map(b6j0.W0).singleElement().d(fcc.W0).subscribe(new cfs(yrsVar, (byte) 4)));
        }
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        yrs yrsVar = this.a;
        yrsVar.d.a = true;
        yrsVar.e.c();
    }
}
