package app.p000rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "cppPointer", "Lp/rih1;", "cppTrigger", "(J)V", "nativeGetValue", "()Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "value", "nativeSetValue", "(Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;)V", "trigger", "()V", "TriggerUnit", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelTriggerProperty extends ViewModelProperty<TriggerUnit> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelTriggerProperty$TriggerUnit;", "", "()V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TriggerUnit {
        public static final int $stable = 0;
    }

    public ViewModelTriggerProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppTrigger(long cppPointer);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public TriggerUnit nativeGetValue() {
        return new TriggerUnit();
    }

    public final void trigger() {
        withLock(new AnonymousClass1());
    }

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(TriggerUnit value) {
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelTriggerProperty$trigger$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m530invoke() {
            ViewModelTriggerProperty viewModelTriggerProperty = ViewModelTriggerProperty.this;
            viewModelTriggerProperty.cppTrigger(viewModelTriggerProperty.getCppPointer());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m530invoke();
            return rih1.a;
        }
    }
}
