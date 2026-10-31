package p;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jhp0 implements BiConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ jhp0(byte b, long j) {
        this.a = b;
        this.b = j;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                aom aomVar = (aom) obj2;
                long j = this.b;
                ReentrantLock reentrantLock = aomVar.f;
                reentrantLock.lock();
                try {
                    r7h.a0(aomVar.g, new ps((byte) 7, j));
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                new ArrayList();
                throw null;
        }
    }
}
