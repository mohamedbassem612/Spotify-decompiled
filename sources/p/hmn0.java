package p;

import com.spotify.contentdelivery.mediaprocessing.CreateProcessorResult;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory;
import com.spotify.contentdelivery.mediaprocessing.ProcessingMode;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hmn0 implements NativeMediaProcessorFactory {
    public NativeMediaProcessorFactory a;
    public final ReentrantLock b = new ReentrantLock();

    public hmn0(kly0 kly0Var) {
        sam0 sam0Var = (xm41) kly0Var.get();
        sam0 sam0Var2 = sam0Var;
        sam0Var2.e(new zem0(this, (byte) 27), new xkm0(this, (byte) 20));
    }

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory
    public final CreateProcessorResult createProcessor(int i, ProcessingMode processingMode) {
        CreateProcessorResult fail;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            NativeMediaProcessorFactory nativeMediaProcessorFactory = this.a;
            if (nativeMediaProcessorFactory == null || (fail = nativeMediaProcessorFactory.createProcessor(i, processingMode)) == null) {
                fail = new CreateProcessorResult.Fail(0);
            }
            return fail;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory
    public final long getNThis() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            NativeMediaProcessorFactory nativeMediaProcessorFactory = this.a;
            return nativeMediaProcessorFactory != null ? nativeMediaProcessorFactory.getNThis() : 0L;
        } finally {
            reentrantLock.unlock();
        }
    }
}
