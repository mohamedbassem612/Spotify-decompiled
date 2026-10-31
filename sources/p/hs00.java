package p;

import com.spotify.home.explicitfeedback.proto.Feedback;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hs00 {
    public final Scheduler a;
    public final Observable b;
    public final bs10 c;
    public String d;
    public final t7y f;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final SerialDisposable g = new SerialDisposable();
    public BehaviorSubject h = BehaviorSubject.g(z6x.a);

    public hs00(Scheduler scheduler, Observable observable, bs10 bs10Var, yqg yqgVar) {
        this.a = scheduler;
        this.b = observable;
        this.c = bs10Var;
        this.f = new t7y(yqgVar);
    }

    public static HashSet e(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Feedback) it.next()).getUri());
        }
        return o7h.j1(arrayList);
    }

    public final CompletableSubscribeOn a(String str) {
        return new CompletableDefer(new gs00(this, str, (byte) 0)).s(this.a);
    }

    public final Set b() {
        List list = (List) this.h.h();
        return list != null ? e(list) : w7x.a;
    }

    public final CompletableSubscribeOn c(String str) {
        return new CompletableDefer(new gs00(this, str, (byte) 1)).s(this.a);
    }

    public final Observable d() {
        return this.h.map(new t2b(this, (byte) 10));
    }
}
