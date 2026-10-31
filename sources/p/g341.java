package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g341 {
    public final yze1 a;
    public final Scheduler b;
    public final o241 c;

    public g341(yze1 yze1Var, Scheduler scheduler, o241 o241Var) {
        this.a = yze1Var;
        this.b = scheduler;
        this.c = o241Var;
    }

    public final Single a() {
        return ((p241) this.c).a("parental-pin-required", "0").map(new f341((byte) 1)).take(1L).single(Boolean.FALSE);
    }

    public final Single b(Uri uri) {
        return this.a.b(Uri.encode(uri.toString())).map(new jf11(uri, (byte) 7)).timeout(3L, TimeUnit.SECONDS, this.b, Single.just(uri));
    }

    public final Single c(Uri uri) {
        return a().flatMap(new e341(this, uri, (byte) 1));
    }
}
