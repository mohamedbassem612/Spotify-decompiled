package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface z2n {
    public static final y2n C = y2n.a;

    static Completable a(rm5 rm5Var, String str, String str2) {
        return ((Single) rm5Var.b).observeOn((Scheduler) rm5Var.a).flatMapCompletable(new yy8(".spotify.com", str, str2));
    }
}
