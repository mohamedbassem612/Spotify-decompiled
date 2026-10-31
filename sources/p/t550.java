package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t550 implements ThreadFactory {
    public static final t550 b = new t550(0);
    public static final t550 c = new t550(1);
    public static final t550 d = new t550(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ t550(byte b2) {
        this.a = b2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new Thread(runnable, "RiveVideoGpuRenderer");
            case 1:
                return new Thread(runnable, f4i1.c(ym41.c.incrementAndGet(), "scope-worker-"));
            case 2:
                return x8p1.t(20, f4i1.c(xch1.a.getAndIncrement(), "UiBehavior-"), new dch1(runnable, (byte) 3));
            case 3:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 4:
                return Executors.defaultThreadFactory().newThread(new r7a0(runnable, (byte) 0));
            default:
                return new oo21(runnable, "fonts-androidx");
        }
    }
}
