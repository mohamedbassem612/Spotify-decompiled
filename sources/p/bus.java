package p;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bus implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final AtomicInteger b;

    public bus(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new AtomicInteger(0);
                break;
            case 2:
                this.b = new AtomicInteger(1);
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(atomicInteger.getAndIncrement())));
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale = Locale.US;
                thread2.setName("CameraX-camerax_io_" + atomicInteger.getAndIncrement());
                return thread2;
            default:
                return new Thread(runnable, "ModernAsyncTask #" + atomicInteger.getAndIncrement());
        }
    }
}
