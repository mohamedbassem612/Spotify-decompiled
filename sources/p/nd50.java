package p;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nd50 extends AsyncTask {
    public final od50 a;
    public Exception b;

    public nd50(od50 od50Var) {
        this.a = od50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.ArrayList] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = dhn.a;
        if (!set.contains(this)) {
            try {
                if (!set.contains(this)) {
                    try {
                        try {
                            od50 od50Var = this.a;
                            String str = md50.j;
                            this = cwl1.w(od50Var);
                            return this;
                        } catch (Exception e) {
                            this.b = e;
                            return null;
                        }
                    } catch (Throwable th) {
                        dhn.a(this, th);
                    }
                }
            } catch (Throwable th2) {
                dhn.a(this, th2);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            List list = (List) obj;
            if (!set.contains(this)) {
                try {
                    super.onPostExecute(list);
                    Exception exc = this.b;
                    if (exc != null) {
                        String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                        this = wf10.a;
                    }
                } catch (Throwable th) {
                    dhn.a(this, th);
                }
            }
        } catch (Throwable th2) {
            dhn.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        od50 od50Var = this.a;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            super.onPreExecute();
            wf10 wf10Var = wf10.a;
            if (od50Var.a == null) {
                od50Var.a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final String toString() {
        return "{RequestAsyncTask:  connection: null, requests: " + this.a + "}";
    }
}
