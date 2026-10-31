package p;

import android.content.Context;
import com.spotify.appauthorization.builtinauth.model.FieldValidator;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeUntilPredicate;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ro5 {
    public final r961 a;
    public final lag b;
    public final ow3 c;
    public final Context d;

    public ro5(r961 r961Var, lag lagVar, nhc nhcVar, ow3 ow3Var, Context context) {
        this.a = r961Var;
        this.b = lagVar;
        this.c = ow3Var;
        this.d = context;
    }

    public final Completable a(fy8 fy8Var) {
        r961 r961Var = this.a;
        FlowableFilter flowableFilterX = Flowable.h((Flowable) r961Var.c, yoi1.i(((b7n) r961Var.d).a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged().toFlowable(BackpressureStrategy.d), new bhn0((byte) 25)).x(new nh61((byte) 29));
        Scheduler scheduler = (Scheduler) r961Var.b;
        return new FlowableTakeUntilPredicate(flowableFilterX.Z(60L, TimeUnit.SECONDS, new FlowableError(Functions.h(new TimeoutException())), scheduler), new uh61((byte) 0)).C(new uh61((byte) 1), false, Integer.MAX_VALUE).z().onErrorResumeNext(new uh61((byte) 2)).flatMapCompletable(new uk4(this, fy8Var, (byte) 2));
    }

    public final void b(fy8 fy8Var) {
        nhc.E(fy8Var.d, "client identity");
        Map map = fy8Var.b;
        nhc.E(map, "extras");
        nhc.D(fy8Var.a, "client-id");
        nhc.D((String) map.get("redirect_uri"), "redirect_uri");
        if (!i1o1.B(fy8Var).contains("app-remote-control")) {
            throw new FieldValidator.ValidationException("\"scopes\" doesn't contain \"app-remote-control\"");
        }
    }
}
