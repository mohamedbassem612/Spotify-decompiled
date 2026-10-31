package p;

import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sef0 extends hab0 implements iu30 {
    public final /* synthetic */ eof0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sqs0 c;
    public final /* synthetic */ zwz0 d;
    public final /* synthetic */ Flowable e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Scheduler g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sef0(eof0 eof0Var, boolean z, sqs0 sqs0Var, zwz0 zwz0Var, Flowable flowable, boolean z2, Scheduler scheduler) {
        super(1);
        this.a = eof0Var;
        this.b = z;
        this.c = sqs0Var;
        this.d = zwz0Var;
        this.e = flowable;
        this.f = z2;
        this.g = scheduler;
    }

    public final Object invoke(Object obj) {
        eof0 eof0Var = this.a;
        boolean z = this.b;
        sqs0 sqs0Var = this.c;
        cas casVar = (a7m0) obj;
        casVar.a = new r7e0(eof0Var, z, sqs0Var, (byte) 1);
        smc0 smc0VarN = k4p1.n();
        mr20 mr20VarC = this.d.c();
        o6x o6xVar = o6x.a;
        smc0VarN.add(yoi1.i(mr20VarC, o6xVar).map(u321.d1));
        smc0VarN.add(new ObservableFromPublisher(this.e.x(pzs0.d1).J(qzs0.e1).t(Functions.a)).map(rzs0.e1));
        if (z) {
            smc0VarN.add(yoi1.i(new pd00(sqs0Var.b, this.f, (byte) 0), o6xVar));
        }
        Observable[] observableArr = (Observable[]) k4p1.k(smc0VarN).toArray(new Observable[0]);
        casVar.b = RxEventSources.a((ObservableSource[]) Arrays.copyOf(observableArr, observableArr.length));
        casVar.a(z1f0.h, z1f0.i);
        casVar.d = i0f0.X;
        casVar.e = new mw1(this.g, (byte) 6);
        return rih1.a;
    }
}
