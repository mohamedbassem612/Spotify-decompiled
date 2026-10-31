package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface zq51 {
    static Completable a(zq51 zq51Var) {
        cr51 cr51Var = (cr51) zq51Var;
        return cr51Var.d.b(0, 80).z().flatMapCompletable(new br51(new al81[]{al81.a}, cr51Var));
    }
}
