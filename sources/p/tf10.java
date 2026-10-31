package p;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class tf10 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = wf10.j;
        if (context != null) {
            return context.getCacheDir();
        }
        u890.C("applicationContext");
        throw null;
    }
}
