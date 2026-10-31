package p;

import android.content.Context;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yh2 {
    public final o241 a;
    public final Context b;
    public final ynb0 c;
    public final zeu d;
    public final Scheduler e;
    public final CompositeDisposable f = new CompositeDisposable();

    public yh2(o241 o241Var, Context context, ynb0 ynb0Var, zeu zeuVar, Scheduler scheduler) {
        this.a = o241Var;
        this.b = context;
        this.c = ynb0Var;
        this.d = zeuVar;
        this.e = scheduler;
    }

    public final Observable a() {
        return ((p241) this.a).a.map(new njx0(this)).distinctUntilChanged();
    }

    public final void b(String str, String str2) {
        Single singleT;
        if (str2 == null || (singleT = Single.just(str2)) == null) {
            singleT = this.d.t(str);
        }
        this.f.b(singleT.timeout(2L, TimeUnit.SECONDS, this.e, Single.error(new TimeoutException())).observeOn(this.e).onErrorResumeNext(xbp1.e).doFinally(new f72(this, (byte) 1)).subscribe(new xh2(this, str, (byte) 0), new xh2(this, str, (byte) 1)));
    }

    public final void c(String str, String str2) {
        bi0 bi0Var = (bi0) this.c.get();
        int i = AgeVerificationDialogActivity.n1;
        bi0Var.a(tx9.l(this.b, str, str2));
    }
}
