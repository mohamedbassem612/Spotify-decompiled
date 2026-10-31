package p;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vi7 implements Executor {
    public final /* synthetic */ byte a;
    public final Handler b;

    public vi7(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Handler handler = this.b;
        switch (b) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            case 2:
                handler.post(runnable);
                return;
            case 3:
                handler.post(runnable);
                return;
            case 4:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                handler.post(runnable);
                return;
        }
    }

    public /* synthetic */ vi7(Handler handler, byte b) {
        this.a = b;
        this.b = handler;
    }
}
