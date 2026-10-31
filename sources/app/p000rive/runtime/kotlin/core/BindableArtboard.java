package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/core/BindableArtboard;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "viewModelInstance", "<init>", "(JLapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "", "cppName", "(J)Ljava/lang/String;", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "getViewModelInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "getName", "()Ljava/lang/String;", "name", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BindableArtboard extends NativeObject {
    public static final int $stable = 8;
    private final ViewModelInstance viewModelInstance;

    public BindableArtboard(long j, ViewModelInstance viewModelInstance) {
        super(j);
        this.viewModelInstance = viewModelInstance;
        acquire();
        if (viewModelInstance != null) {
            if (!viewModelInstance.getHasCppObject()) {
                hhg1.n("Cannot bind a disposed ViewModelInstance to a BindableArtboard.");
                throw null;
            }
            viewModelInstance.acquire();
            getDependencies().add(viewModelInstance);
        }
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public final native String cppName(long pointer);

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public /* synthetic */ BindableArtboard(long j, ViewModelInstance viewModelInstance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : viewModelInstance);
    }
}
