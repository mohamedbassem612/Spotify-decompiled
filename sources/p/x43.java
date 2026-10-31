package p;

import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class x43 extends v7s {
    public final rm5 k;
    public final fnh0 l;

    public x43(x610 x610Var, PlayOrigin playOrigin, oyr oyrVar, g510 g510Var, d8q d8qVar, rm5 rm5Var, fnh0 fnh0Var, r8l r8lVar, b791 b791Var, u210 u210Var, phl1 phl1Var, e8q e8qVar, uic uicVar) {
        super(x610Var, playOrigin, 1, oyrVar, g510Var, d8qVar, r8lVar, b791Var, u210Var, phl1Var, e8qVar, uicVar);
        this.k = rm5Var;
        this.l = fnh0Var;
    }

    public final Completable e(String str) {
        rm5 rm5Var = this.k;
        FlowableTake flowableTake = new FlowableTake(((Flowable) rm5Var.a).J(new c9r((byte) 8)));
        Scheduler scheduler = (Scheduler) rm5Var.b;
        return flowableTake.Z(200L, TimeUnit.MILLISECONDS, new FlowableError(Functions.h(new TimeoutException())), scheduler).z().onErrorReturnItem(Boolean.FALSE).flatMapCompletable(new g21(this, (byte) 12)).c(super.e(str));
    }
}
