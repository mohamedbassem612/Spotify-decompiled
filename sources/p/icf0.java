package p;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class icf0 implements Callable {
    public final /* synthetic */ WeakReference a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ icf0(WeakReference weakReference, Context context, int i, String str) {
        this.a = weakReference;
        this.b = context;
        this.c = i;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = (Context) this.a.get();
        if (context == null) {
            context = this.b;
        }
        return kcf0.f(this.c, context, this.d);
    }
}
