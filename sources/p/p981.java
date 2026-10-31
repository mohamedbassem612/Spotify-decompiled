package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p981 {
    public final uu00 a;

    public p981(uu00 uu00Var) {
        this.a = uu00Var;
    }

    public final Single a(String str) {
        return ((zu00) this.a).b(new oi("aligned_curation", new pg61(str, (byte) 15))).map(new clv(str, (byte) 14)).filter(avw0.f).map(jcx0.Y).timeout(5L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).firstOrError().map(kcx0.Y);
    }

    public final Single b(String str) {
        return a(str).flatMap(new ke71(this, str, (byte) 10)).onErrorReturnItem(pa81.a);
    }
}
