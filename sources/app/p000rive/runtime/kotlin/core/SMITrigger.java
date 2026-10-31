package app.p000rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p.adt;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/rive/runtime/kotlin/core/SMITrigger;", "Lapp/rive/runtime/kotlin/core/SMIInput;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "cppPointer", "Lp/rih1;", "cppFire", "(J)V", "fire$kotlin_release", "()V", "fire", "", "toString", "()Ljava/lang/String;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SMITrigger extends SMIInput {
    public static final int $stable = 0;

    public SMITrigger(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
    }

    private final native void cppFire(long cppPointer);

    public final void fire$kotlin_release() {
        synchronized (getFileLock()) {
            cppFire(getCppPointer());
        }
    }

    @Override // app.p000rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return f4i1.f("SMITrigger ", getName(), "\n");
    }
}
