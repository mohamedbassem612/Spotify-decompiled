package p;

import android.content.res.Resources;
import android.view.View;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a4h {
    public final kt91 a;
    public final eny b;
    public final q8n c;
    public final Scheduler d;
    public final Resources e;

    public a4h(kt91 kt91Var, eny enyVar, q8n q8nVar, Scheduler scheduler, Resources resources) {
        this.a = kt91Var;
        this.b = enyVar;
        this.c = q8nVar;
        this.d = scheduler;
        this.e = resources;
    }

    public final CompletableSubscribeOn a() {
        return g(2131962609);
    }

    public final CompletableSubscribeOn b() {
        return g(2131953994);
    }

    public final CompletableSubscribeOn c() {
        return g(2131963266);
    }

    public final CompletableSubscribeOn d() {
        return g(2131962629);
    }

    public final CompletableSubscribeOn e() {
        return g(2131953995);
    }

    public final Object f(String str, l24 l24Var, cjr cjrVar) {
        p811 p811Var = new p811();
        Set set = s4b1.f;
        Object objI = fc11.i(this.b.a(str, uic.x(str).c).timeout(200L, TimeUnit.MILLISECONDS, Single.error(new TimeoutException())).map(new ps7(this, (byte) 24)).onErrorReturn(new fp8(this, (byte) 22)).flatMapCompletable(new cce(this, p811Var, l24Var, (byte) 19)), cjrVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    public final CompletableSubscribeOn g(int i) {
        return new CompletableFromAction(new bm0(this, new er91((fs91) null, this.e.getString(i), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false), (byte) 17)).s(this.d);
    }
}
