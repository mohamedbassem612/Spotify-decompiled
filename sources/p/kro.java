package p;

import android.os.Process;
import android.os.StrictMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class kro implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kro(Runnable runnable, q7g1 q7g1Var) {
        this.b = runnable;
        this.c = q7g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                lro lroVar = (lro) obj;
                Process.setThreadPriority(lroVar.c);
                StrictMode.ThreadPolicy threadPolicy = lroVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            default:
                q7g1 q7g1Var = (q7g1) obj;
                try {
                    runnable.run();
                    return;
                } finally {
                    q7g1Var.a();
                }
        }
    }

    public /* synthetic */ kro(lro lroVar, Runnable runnable) {
        this.c = lroVar;
        this.b = runnable;
    }
}
