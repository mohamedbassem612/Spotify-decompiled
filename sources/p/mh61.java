package p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class mh61 implements Function, BiFunction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oh61 b;

    public /* synthetic */ mh61(oh61 oh61Var, byte b) {
        this.a = b;
        this.b = oh61Var;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        oh61 oh61Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                g510 g510Var = oh61Var.k;
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    return g510Var.h(oh61Var.z).ignoreElement().e(oh61Var.v.k(1));
                }
                if (iIntValue == 1) {
                    return g510Var.i(oh61Var.z).ignoreElement().e(oh61Var.v.k(3));
                }
                if (iIntValue == 2) {
                    return g510Var.g(oh61Var.z).ignoreElement().e(oh61Var.v.k(2));
                }
                n57.m("Unexpected repeat " + num);
                return Single.just(new beh(""));
            case 1:
                jr5 jr5Var = (jr5) obj;
                if (jr5Var != null) {
                    String str = jr5Var.b;
                    if (!jhc1.F(str)) {
                        return Observable.just(str);
                    }
                }
                return new ObservableFromPublisher(new FlowableTake(oh61Var.h.J(new nh61((byte) 26)).x(new f341((byte) 24)).J(new nh61((byte) 27)).J(new nh61((byte) 28))));
            case 2:
                String str2 = (String) obj;
                g510 g510Var2 = oh61Var.k;
                Completable completableIgnoreElement = g510.q(g510Var2, oh61Var.z, g510Var2.h.i(str2)).ignoreElement();
                k710 k710Var = oh61Var.w;
                return completableIgnoreElement.e(k710Var.b.a(str2).singleOrError().observeOn(k710Var.a));
            case 3:
            default:
                return oh61Var.k((zs5) obj);
            case 4:
                return oh61Var.l((rt5) obj);
            case 5:
                return oh61Var.v.c(spq0.d((LoggingParams) obj));
            case 6:
                ps5 ps5Var = qs5.Companion;
                yqg yqgVar = oh61Var.i;
                ps5Var.getClass();
                return ps5.a((PlayerState) obj, yqgVar);
            case 7:
                return oh61Var.m.c(1).c(new CompletableFromAction(new qo5(oh61Var, ((ou80) obj).a, (byte) 1)));
            case 8:
                return new mu5((PlayerState) obj, oh61Var.i);
            case 9:
                return oh61Var.v.h((LoggingParams) obj).ignoreElement();
            case 10:
                return oh61Var.v.d((spq0) obj).ignoreElement();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new lt5((th61) obj, ((Boolean) obj2).booleanValue(), this.b.A.b());
    }
}
