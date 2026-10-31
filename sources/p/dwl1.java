package p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dwl1 {
    public final qj5 a;
    public final q8n b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final g960 d = new g960(this, (byte) 4);

    public dwl1(ExecutorService executorService) {
        qj5 qj5Var = new qj5(executorService);
        this.a = qj5Var;
        this.b = qgo1.q(qj5Var);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
