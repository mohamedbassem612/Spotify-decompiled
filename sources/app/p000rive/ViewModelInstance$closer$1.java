package app.p000rive;

import app.p000rive.core.FileHandle;
import app.p000rive.core.ViewModelInstanceHandle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.cy30;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class ViewModelInstance$closer$1 extends hab0 implements Function0 {
    final /* synthetic */ ViewModelInstance this$0;

    /* JADX INFO: renamed from: app.rive.ViewModelInstance$closer$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ ViewModelInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewModelInstance viewModelInstance) {
            super(0);
            this.this$0 = viewModelInstance;
        }

        public final String invoke() {
            return cy30.p("Deleting ", ViewModelInstanceHandle.m455toStringimpl(this.this$0.getInstanceHandle()), " (", FileHandle.m372toStringimpl(this.this$0.fileHandle), ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$closer$1(ViewModelInstance viewModelInstance) {
        super(0);
        this.this$0 = viewModelInstance;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m121invoke() {
        this.this$0.closeFlow.a(rih1.a);
        try {
            this.this$0.propertySubscriptions.closeAll();
        } finally {
            RiveLog.INSTANCE.getLogger().d(ViewModelInstanceKt.VM_INSTANCE_TAG, new AnonymousClass1(this.this$0));
            this.this$0.riveWorker.m230deleteViewModelInstancemBajs_U(this.this$0.getInstanceHandle());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m121invoke();
        return rih1.a;
    }
}
