package p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pze1 {
    public static final /* synthetic */ mma0[] d = {new een0(pze1.class, "impressionLogger", "getImpressionLogger()Lkotlin/jvm/functions/Function0;", 0), new een0(pze1.class, "enabled", "getEnabled()Z", 0)};
    public final oze1 a = new oze1(this, (byte) 0);
    public final oze1 b = new oze1(this, (byte) 1);
    public AutoCloseable c;

    public final void a(boolean z) {
        this.b.c(d[1], this, Boolean.valueOf(z));
    }

    public final void b(Function0 function0) {
        this.a.c(d[0], this, function0);
    }

    public final void c() {
        boolean zIsTerminated;
        mma0[] mma0VarArr = d;
        boolean z = false;
        mma0 mma0Var = mma0VarArr[0];
        Function0 function0 = (Function0) ((sgp0) this.a).a;
        if (function0 != null) {
            mma0 mma0Var2 = mma0VarArr[1];
            if (((Boolean) ((sgp0) this.b).a).booleanValue()) {
                if (this.c != null) {
                    return;
                }
                this.c = (AutoCloseable) function0.invoke();
                return;
            }
        }
        AutoCloseable autoCloseable = this.c;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    bhn0.q();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        this.c = null;
    }
}
