package p;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class opi1 {
    public static final ExecutorService a;

    static {
        km00 km00Var = new km00(new AtomicLong(1L), (byte) 0);
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), km00Var, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new jm00(executorServiceUnconfigurableExecutorService, (byte) 1), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        a = executorServiceUnconfigurableExecutorService;
    }

    public static void a(hfp1 hfp1Var) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hfp1Var.o(a, new iyh1(countDownLatch, (byte) 4));
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == looperMyLooper) {
            countDownLatch.await(3000L, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (hfp1Var.j()) {
            hfp1Var.g();
        } else {
            if (hfp1Var.d) {
                throw new CancellationException("Task is already canceled");
            }
            if (!hfp1Var.i()) {
                throw new TimeoutException();
            }
            bhn0.p(hfp1Var.f());
        }
    }
}
