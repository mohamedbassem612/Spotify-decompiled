package p;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.InlineExecutionProhibitedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g960 implements Executor {
    public static volatile g960 c;
    public final /* synthetic */ byte a;
    public final Object b;

    public g960() {
        this.a = (byte) 0;
        this.b = Executors.newSingleThreadExecutor(new t550((byte) 3));
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (g960.class) {
            try {
                if (c == null) {
                    c = new g960();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                return;
            case 1:
                lo9 lo9Var = ((d5n) obj).a.c;
                runnable.getClass();
                lo9Var.post(runnable);
                return;
            case 2:
                ((jim0) obj).post(runnable);
                return;
            case 3:
                uu1 uu1Var = new uu1(runnable, Thread.currentThread());
                ((Executor) obj).execute(uu1Var);
                InlineExecutionProhibitedException inlineExecutionProhibitedException = (InlineExecutionProhibitedException) uu1Var.d;
                if (inlineExecutionProhibitedException != null) {
                    throw inlineExecutionProhibitedException;
                }
                uu1Var.c = null;
                return;
            default:
                ((dwl1) obj).c.post(runnable);
                return;
        }
    }

    public g960(Looper looper) {
        this.a = (byte) 2;
        this.b = new jim0(looper, (byte) 6);
    }

    public /* synthetic */ g960(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
