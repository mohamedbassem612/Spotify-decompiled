package p;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ve90 implements Executor {
    public static volatile ve90 c;
    public final /* synthetic */ byte a;
    public final Object b;

    public ve90(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new van1(Looper.getMainLooper());
                break;
            default:
                this.b = Executors.newFixedThreadPool(2, new bus((byte) 1));
                break;
        }
    }

    public static Executor a() {
        if (c != null) {
            return c;
        }
        synchronized (ve90.class) {
            try {
                if (c == null) {
                    c = new ve90((byte) 0);
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
                break;
            case 1:
                ((Executor) obj).execute(new r7a0(runnable, (byte) 1));
                break;
            default:
                ((van1) obj).post(runnable);
                break;
        }
    }

    public ve90(ExecutorService executorService) {
        this.a = (byte) 1;
        this.b = executorService;
    }
}
