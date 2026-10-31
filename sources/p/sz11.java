package p;

import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sz11 {
    public final PublishSubject a = new PublishSubject();

    public final PublishSubject a() {
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.o(f4i1.c(hashCode(), "Remote config notifier instance "), new Object[0]);
        return this.a;
    }

    public final void b(b021 b021Var) {
        utw0 utw0Var = ike1.a;
        utw0Var.y("RCS");
        utw0Var.o(f4i1.c(hashCode(), "Remote config notifier instance "), new Object[0]);
        this.a.onNext(b021Var);
    }
}
