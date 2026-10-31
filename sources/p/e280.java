package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class e280 implements n8d0 {
    public static final e280 c = new e280(null, 0);
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ e280(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
            j2h1.q("ImmediateFuture");
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final Object get() throws ExecutionException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return obj;
            default:
                throw new ExecutionException((Throwable) obj);
        }
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append("[status=SUCCESS, result=[");
                return td6.l(sb, obj, "]]");
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) obj) + "]]";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
