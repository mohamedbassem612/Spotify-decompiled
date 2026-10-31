package p;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ixl1 {
    public /* bridge */ /* synthetic */ z8d0 a(Context context, String str, WorkerParameters workerParameters) {
        return null;
    }

    public final z8d0 b(Context context, String str, WorkerParameters workerParameters) {
        z8d0 z8d0VarA = a(context, str, workerParameters);
        if (z8d0VarA == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(z8d0.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    z8d0VarA = (z8d0) objNewInstance;
                } catch (Throwable th) {
                    qs10 qs10VarA = qs10.a();
                    int i = jxl1.a;
                    qs10VarA.getClass();
                    throw th;
                }
            } catch (Throwable th2) {
                qs10 qs10VarA2 = qs10.a();
                int i2 = jxl1.a;
                qs10VarA2.getClass();
                throw th2;
            }
        }
        if (!z8d0VarA.d) {
            return z8d0VarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
