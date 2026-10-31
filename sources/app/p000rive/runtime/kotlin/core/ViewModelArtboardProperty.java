package app.p000rive.runtime.kotlin.core;

import app.p000rive.runtime.kotlin.core.errors.RiveException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.adt;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelArtboardProperty;", "Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "Lp/rih1;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "cppPointer", "fileCppPointer", "artboardCppPointer", "cppSetArtboard", "(JJJ)V", "bindableArtboardCppPointer", "boundInstancePointer", "cppSetBindableArtboard", "Lapp/rive/runtime/kotlin/core/Artboard;", "artboard", "set", "(Lapp/rive/runtime/kotlin/core/Artboard;)V", "Lapp/rive/runtime/kotlin/core/BindableArtboard;", "bindableArtboard", "(Lapp/rive/runtime/kotlin/core/BindableArtboard;)V", "pollChanges$kotlin_release", "()V", "pollChanges", "nativeGetValue", "value", "nativeSetValue", "(Lp/rih1;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ViewModelArtboardProperty extends ViewModelProperty<rih1> {
    public static final int $stable = 0;

    public ViewModelArtboardProperty(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native void cppSetArtboard(long cppPointer, long fileCppPointer, long artboardCppPointer);

    private final native void cppSetBindableArtboard(long cppPointer, long bindableArtboardCppPointer, long boundInstancePointer);

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public /* bridge */ /* synthetic */ rih1 nativeGetValue() {
        nativeGetValue2();
        return rih1.a;
    }

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public void pollChanges$kotlin_release() {
        withLock(new ViewModelArtboardProperty$pollChanges$1(this));
    }

    public final void set(BindableArtboard bindableArtboard) {
        ReentrantLock fileLock = getFileLock();
        ViewModelInstance viewModelInstance = bindableArtboard != null ? bindableArtboard.getViewModelInstance() : null;
        if (viewModelInstance != null) {
            viewModelInstance.updateFileLock$kotlin_release(fileLock);
        }
        synchronized (fileLock) {
            try {
                cppSetBindableArtboard(getCppPointer(), bindableArtboard != null ? bindableArtboard.getCppPointer() : 0L, viewModelInstance != null ? viewModelInstance.getCppPointer() : 0L);
                List<RefCount> dependencies = getDependencies();
                ArrayList<BindableArtboard> arrayList = new ArrayList();
                for (Object obj : dependencies) {
                    if (obj instanceof BindableArtboard) {
                        arrayList.add(obj);
                    }
                }
                for (BindableArtboard bindableArtboard2 : arrayList) {
                    bindableArtboard2.release();
                    getDependencies().remove(bindableArtboard2);
                }
                if (bindableArtboard != null) {
                    bindableArtboard.acquire();
                    getDependencies().add(bindableArtboard);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: nativeGetValue, reason: avoid collision after fix types in other method */
    public void nativeGetValue2() {
    }

    @Override // app.p000rive.runtime.kotlin.core.ViewModelProperty
    public void nativeSetValue(rih1 value) {
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelArtboardProperty$set$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ ViewModelArtboardProperty this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Artboard artboard, ViewModelArtboardProperty viewModelArtboardProperty) {
            super(0);
            this.$artboard = artboard;
            this.this$0 = viewModelArtboardProperty;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m517invoke() throws RiveException {
            if (!this.$artboard.getHasCppObject()) {
                throw new RiveException("Cannot set a disposed Artboard to a ViewModelArtboardProperty.");
            }
            if (this.$artboard.getFile() == null) {
                throw new RiveException("Cannot set an Artboard with no File reference to a ViewModelArtboardProperty.");
            }
            File file = this.$artboard.getFile();
            file.getClass();
            if (!file.getHasCppObject()) {
                throw new RiveException("Cannot set an Artboard whose File has been disposed to a ViewModelArtboardProperty.");
            }
            ViewModelArtboardProperty viewModelArtboardProperty = this.this$0;
            long cppPointer = viewModelArtboardProperty.getCppPointer();
            File file2 = this.$artboard.getFile();
            file2.getClass();
            viewModelArtboardProperty.cppSetArtboard(cppPointer, file2.getCppPointer(), this.$artboard.getCppPointer());
        }

        public /* bridge */ /* synthetic */ Object invoke() throws RiveException {
            m517invoke();
            return rih1.a;
        }
    }

    @adt
    public final void set(Artboard artboard) {
        withLock(new AnonymousClass1(artboard, this));
    }
}
