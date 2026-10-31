package app.p000rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p.adt;
import p.f4i1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lapp/rive/runtime/kotlin/core/SMINumber;", "Lapp/rive/runtime/kotlin/core/SMIInput;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "cppPointer", "", "cppValue", "(J)F", "value", "Lp/rih1;", "cppSetValue", "(JF)V", "", "toString", "()Ljava/lang/String;", "getValue", "()F", "setValue$kotlin_release", "(F)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SMINumber extends SMIInput {
    public static final int $stable = 0;

    public SMINumber(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
    }

    private final native void cppSetValue(long cppPointer, float value);

    private final native float cppValue(long cppPointer);

    public final float getValue() {
        float fCppValue;
        synchronized (getFileLock()) {
            fCppValue = cppValue(getCppPointer());
        }
        return fCppValue;
    }

    public final void setValue$kotlin_release(float f) {
        synchronized (getFileLock()) {
            cppSetValue(getCppPointer(), f);
        }
    }

    @Override // app.p000rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return f4i1.f("SMINumber ", getName(), "\n");
    }
}
