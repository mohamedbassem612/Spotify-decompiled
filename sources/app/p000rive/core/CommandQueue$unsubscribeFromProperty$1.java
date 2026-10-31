package app.p000rive.core;

import app.p000rive.runtime.kotlin.core.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CommandQueue$unsubscribeFromProperty$1 extends hab0 implements Function0 {
    final /* synthetic */ String $propertyPath;
    final /* synthetic */ ViewModel.PropertyDataType $propertyType;
    final /* synthetic */ long $viewModelInstanceHandle;
    final /* synthetic */ CommandQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$unsubscribeFromProperty$1(CommandQueue commandQueue, long j, String str, ViewModel.PropertyDataType propertyDataType) {
        super(0);
        this.this$0 = commandQueue;
        this.$viewModelInstanceHandle = j;
        this.$propertyPath = str;
        this.$propertyType = propertyDataType;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m358invoke() {
        this.this$0.bridge.cppUnsubscribeFromProperty(this.this$0.requireNativePointer(), this.$viewModelInstanceHandle, this.$propertyPath, this.$propertyType.getValue());
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m358invoke();
        return rih1.a;
    }
}
