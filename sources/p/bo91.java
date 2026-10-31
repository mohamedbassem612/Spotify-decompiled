package p;

import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bo91 {
    public final ujm a;
    public final Observable b;
    public final hn91 c;
    public final ip91 d;
    public final jo91 e;
    public final xrc0 f;
    public final iyc0 g;
    public final b7r0 h;
    public final yqg i;
    public final Scheduler j;
    public final q7j0 k;

    public bo91(ujm ujmVar, Observable observable, hn91 hn91Var, ip91 ip91Var, jo91 jo91Var, xrc0 xrc0Var, iyc0 iyc0Var, b7r0 b7r0Var, yqg yqgVar, Scheduler scheduler, q7j0 q7j0Var) {
        this.a = ujmVar;
        this.b = observable;
        this.c = hn91Var;
        this.d = ip91Var;
        this.e = jo91Var;
        this.f = xrc0Var;
        this.g = iyc0Var;
        this.h = b7r0Var;
        this.i = yqgVar;
        this.j = scheduler;
        this.k = q7j0Var;
    }

    public static CompletableOnErrorComplete a(bo91 bo91Var, String str, String str2, String str3, String str4, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, kqz kqzVar, int i) {
        CompletableSource completableSourceO;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            kqzVar = null;
        }
        ip91 ip91Var = bo91Var.d;
        String str5 = str4;
        String str6 = str3;
        Completable completableFlatMapCompletable = bo91Var.c.a(str).doOnSuccess(new jkt0(str, (byte) 8)).flatMapCompletable(new mzr0(bo91Var, str, esPlayOrigin$PlayOrigin, str6, str5, kqzVar, str2));
        jo91 jo91Var = bo91Var.e;
        if (jo91Var.b() || str6 == null || str6.length() == 0) {
            completableSourceO = CompletableEmpty.a;
        } else if (((t35) jo91Var.a.get()).i()) {
            Completable completableIgnoreElement = bo91Var.b.filter(new xot(str, str6, (byte) 6)).firstOrError().ignoreElement();
            Scheduler scheduler = bo91Var.j;
            CompletableError completableErrorJ = Completable.j(new TimeoutException());
            completableIgnoreElement.getClass();
            completableSourceO = completableIgnoreElement.t(5L, TimeUnit.SECONDS, scheduler, completableErrorJ).c(ip91Var.f.a(str).flatMap(new bp91((byte) 2, str6, ip91Var)).flatMapCompletable(new cp91((byte) 1, str6, ip91Var))).o(Functions.h);
        } else {
            completableSourceO = ip91Var.f.a(str).flatMap(new bp91((byte) 2, str6, ip91Var)).flatMapCompletable(new cp91((byte) 1, str6, ip91Var)).o(Functions.h);
        }
        return completableFlatMapCompletable.c(completableSourceO).o(Functions.h);
    }
}
