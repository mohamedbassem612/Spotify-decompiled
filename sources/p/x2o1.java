package p;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x2o1 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final Object b;

    public x2o1(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new AtomicInteger(0);
                break;
            default:
                this.b = Executors.defaultThreadFactory();
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(runnable);
                threadNewThread.setName("ScionFrontendApi");
                return threadNewThread;
            case 1:
                Thread threadNewThread2 = ((ThreadFactory) obj).newThread(runnable);
                if (threadNewThread2 != null) {
                    threadNewThread2.setName("punch".concat(String.valueOf(threadNewThread2.getName())));
                    return threadNewThread2;
                }
                bhn0.i("Default ThreadFactory returned null thread");
                return null;
            default:
                Thread thread = new Thread(runnable);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
        }
    }

    public x2o1(u6o1 u6o1Var) {
        this.a = (byte) 0;
        this.b = Executors.defaultThreadFactory();
    }
}
