package p;

import android.content.Context;
import com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z1s {
    public final Context a;
    public final f2l b;
    public hj70 g;
    public final PublishSubject c = new PublishSubject();
    public final PublishSubject d = new PublishSubject();
    public final PublishSubject e = new PublishSubject();
    public final Object f = new Object();
    public final PublishSubject h = new PublishSubject();
    public final PublishSubject i = new PublishSubject();
    public final rku j = new rku();

    public z1s(Context context, f2l f2lVar) {
        this.a = context;
        this.b = f2lVar;
    }

    public final void a(hj70 hj70Var) {
        int iC = l1d.C(hj70Var.a());
        if (iC == 0) {
            int i = IPLDialogsHostActivity.j1;
            wyo1.n(this.a, hj70Var);
            return;
        }
        if (iC == 1) {
            this.e.onNext(hj70Var);
            return;
        }
        if (iC != 2) {
            eg.o();
            return;
        }
        int iOrdinal = hqq0.l0(this.b.a.a).ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 14) {
            this.e.onNext(hj70Var);
            return;
        }
        synchronized (this.f) {
            try {
                if (this.d.a()) {
                    this.d.onNext(new pj70(hj70Var));
                } else {
                    this.g = hj70Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
