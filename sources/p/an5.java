package p;

import android.content.Context;
import android.os.Build;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class an5 implements dwo {
    public static final AtomicInteger e = new AtomicInteger(0);
    public final Context a;
    public final ynb0 b;
    public final ynb0 c;
    public final rku d;

    public an5(Context context, ynb0 ynb0Var, ynb0 ynb0Var2, fwo fwoVar) {
        this.a = context;
        this.b = ynb0Var;
        this.c = ynb0Var2;
        rku rkuVar = new rku();
        this.d = rkuVar;
        if (Build.VERSION.SDK_INT < 30 || !e.compareAndSet(0, 1)) {
            return;
        }
        CompletablePeek completablePeekH = new CompletableFromAction(new ym5(this)).s((Scheduler) fwoVar.get()).g(zm5.b).h(nm.N0);
        ps4 ps4Var = ps4.c;
        Consumer consumer = Functions.d;
        Action action = Functions.c;
        rkuVar.b(completablePeekH.i(consumer, consumer, action, action, action, ps4Var).o(Functions.h).subscribe());
    }

    public final void shutdown() {
        this.d.a();
    }
}
