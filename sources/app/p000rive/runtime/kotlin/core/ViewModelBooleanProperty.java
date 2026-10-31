package app.p000rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelBooleanProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "cppPointer", "cppGetValue", "(J)Z", "value", "Lp/rih1;", "cppSetValue", "(JZ)V", "nativeGetValue", "()Ljava/lang/Boolean;", "nativeSetValue", "(Z)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelBooleanProperty extends ViewModelProperty<Boolean> {
    public static final int $stable = 0;

    public ViewModelBooleanProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
    }

    private final native boolean cppGetValue(long cppPointer);

    private final native void cppSetValue(long cppPointer, boolean value);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public Boolean nativeGetValue() {
        return Boolean.valueOf(cppGetValue(getCppPointer()));
    }

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ void nativeSetValue(Boolean bool) {
        nativeSetValue(bool.booleanValue());
    }

    public void nativeSetValue(boolean value) {
        cppSetValue(getCppPointer(), value);
    }
}
