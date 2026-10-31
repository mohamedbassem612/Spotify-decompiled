package app.p000rive.runtime.kotlin.core;

import app.p000rive.runtime.kotlin.core.errors.RiveException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelImageProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "Lp/rih1;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "cppPointer", "value", "cppSetValue", "(JJ)V", "Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "image", "set", "(Lapp/rive/runtime/kotlin/core/RiveRenderImage;)V", "nativeGetValue", "()V", "nativeSetValue", "(Lp/rih1;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelImageProperty extends ViewModelProperty<rih1> {
    public static final int $stable = 0;

    public ViewModelImageProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppSetValue(long cppPointer, long value);

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ rih1 nativeGetValue() {
        nativeGetValue2();
        return rih1.a;
    }

    public final void set(RiveRenderImage image) {
        withLock(new AnonymousClass1(image));
    }

    /* JADX INFO: renamed from: nativeGetValue, reason: avoid collision after fix types in other method */
    public void nativeGetValue2() {
    }

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(rih1 value) {
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelImageProperty$set$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ RiveRenderImage $image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveRenderImage riveRenderImage) {
            super(0);
            this.$image = riveRenderImage;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m518invoke() throws RiveException {
            ViewModelImageProperty viewModelImageProperty = ViewModelImageProperty.this;
            long cppPointer = viewModelImageProperty.getCppPointer();
            RiveRenderImage riveRenderImage = this.$image;
            viewModelImageProperty.cppSetValue(cppPointer, riveRenderImage != null ? riveRenderImage.getCppPointer() : 0L);
        }

        public /* bridge */ /* synthetic */ Object invoke() throws RiveException {
            m518invoke();
            return rih1.a;
        }
    }
}
