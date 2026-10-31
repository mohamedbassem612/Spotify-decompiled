package p;

import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimelineRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ur50 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ lc20 c;

    public /* synthetic */ ur50(int i, lc20 lc20Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = lc20Var;
    }

    public final Object apply(Object obj) {
        lqz0 lqz0Var;
        byte b = this.a;
        int i = this.b;
        lc20 lc20Var = this.c;
        switch (b) {
            case 0:
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    n57.e("Failed to load the timeline due to an unauthorized access");
                    Single singleJust = Single.just(new yre1(i, new IllegalAccessException()));
                    singleJust.getClass();
                    return singleJust;
                }
                String strQ = g3p1.q(optional);
                pf60 pf60Var = (pf60) lc20Var.b;
                char c = sr50.a[((gp20) optional.get()).ordinal()] == 1 ? (char) 3 : (char) 2;
                qf60 qf60Var = pf60Var.a;
                sii1 sii1VarN = UserTimelineRequest.n();
                if (c != 2) {
                    lqz0Var = c != 3 ? null : lqz0.MONTH;
                } else {
                    lqz0Var = lqz0.WEEK;
                }
                sii1VarN.q(lqz0Var);
                sii1VarN.n(i);
                sii1VarN.r(upo1.s());
                Single singleFirstOrError = qf60Var.a((UserTimelineRequest) sii1VarN.build()).toObservable().map(new tqt(i, strQ, (byte) 1)).onErrorReturn(new ij81(i, (byte) 15)).firstOrError();
                singleFirstOrError.getClass();
                return singleFirstOrError;
            default:
                if (((Boolean) obj).booleanValue()) {
                    Observable observable = ((of60) lc20Var.d).a().firstOrError().flatMap(new ur50(i, lc20Var, (byte) 0)).toObservable();
                    observable.getClass();
                    return observable;
                }
                Observable observableJust = Observable.just(new vre1(i));
                observableJust.getClass();
                return observableJust;
        }
    }
}
