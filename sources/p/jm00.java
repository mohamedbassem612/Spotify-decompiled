package p;

import android.os.Process;
import android.util.Log;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jm00 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jm00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Runnable) obj).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) obj;
                try {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdownNow();
                    return;
                }
                break;
        }
    }
}
