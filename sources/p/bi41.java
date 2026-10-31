package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.scannables.scannables.view.ScannablesOnboardingActivity;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class bi41 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ bi41(uw0 uw0Var, Context context, byte b) {
        this.a = b;
        this.b = uw0Var;
        this.c = context;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Context context = this.c;
        uw0 uw0Var = this.b;
        th61 th61Var = (th61) obj;
        switch (b) {
            case 0:
                hma1 hma1VarEdit = ((yh41) uw0Var.t).a.b(context, th61Var.a).edit();
                hma1VarEdit.a(yh41.b, true);
                hma1VarEdit.g();
                break;
            default:
                boolean zH = ((yh41) uw0Var.t).a.b(context, th61Var.a).h(yh41.b, false);
                ((bx4) uw0Var.X).getClass();
                boolean z = x74.j(context, "android.permission.CAMERA") == 0;
                ei41 ei41Var = (ei41) ((WeakReference) uw0Var.i).get();
                if (ei41Var != null) {
                    Activity activity = ei41Var.a;
                    if (zH && z) {
                        uw0 uw0Var2 = ei41Var.e;
                        k65 k65Var = new k65(new nt21(), activity, ei41Var.c, (byte) 20);
                        int i = Flowable.a;
                        FlowableCreate flowableCreate = new FlowableCreate(k65Var, BackpressureStrategy.c);
                        ((Disposable) uw0Var2.Y).dispose();
                        Disposable disposableSubscribe = new ObservableFromPublisher(flowableCreate).flatMap(new ci41(uw0Var2, (byte) 1), 4).filter(new f341((byte) 24)).firstOrError().toObservable().map(new f341((byte) 4)).doOnNext(new zh41(uw0Var2, (byte) 1)).flatMap(new ci41(uw0Var2, (byte) 0)).observeOn((Scheduler) uw0Var2.h).subscribe((ai41) uw0Var2.O0, (ai41) uw0Var2.N0);
                        uw0Var2.Y = disposableSubscribe;
                        ((CompositeDisposable) uw0Var2.b).b(disposableSubscribe);
                    } else {
                        int i2 = ScannablesOnboardingActivity.g1;
                        activity.startActivityForResult(new Intent(activity, (Class<?>) ScannablesOnboardingActivity.class), 10001);
                    }
                    break;
                }
                break;
        }
    }
}
