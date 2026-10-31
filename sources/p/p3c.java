package p;

import android.os.AsyncTask;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class p3c extends AsyncTask {
    public final void a(Object... objArr) {
        try {
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
        } catch (Exception e) {
            i1k0.C("Caught Exception in AsyncTask: " + e.getMessage());
            execute(objArr);
        }
    }
}
