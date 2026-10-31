package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class km00 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ km00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new jm00(runnable, (byte) 0));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return threadNewThread;
            default:
                return ((ThreadFactory) obj).newThread(new r7a0(runnable, (byte) 6));
        }
    }
}
