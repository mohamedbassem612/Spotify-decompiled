package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q1n0 {
    public final Single a;
    public final Observable b;
    public final boolean c;

    public q1n0(Single single, Observable observable, Activity activity, q3n0 q3n0Var) {
        this.a = single;
        this.b = observable;
        this.c = q3n0Var.b() || (activity instanceof bax);
    }

    public final k241 a(q6e0 q6e0Var) {
        return b(q6e0Var, new v7r0());
    }

    public final k241 b(q6e0 q6e0Var, v7r0 v7r0Var) {
        boolean zB = v7r0Var.b();
        Observable observableCompose = q6e0Var.b().compose(new oay()).compose(new ltw0((byte) 1)).compose(new cx8(this.b));
        Single single = this.a;
        return new k241(observableCompose.compose(new ax8(single, (byte) 8)).compose(new dsp0(zB, single)), this.c, v7r0Var.a());
    }
}
