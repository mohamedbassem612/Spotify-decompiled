package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ViewModelListProperty$size$1 extends hab0 implements Function0 {
    final /* synthetic */ ViewModelListProperty this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelListProperty$size$1(ViewModelListProperty viewModelListProperty) {
        super(0);
        this.this$0 = viewModelListProperty;
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Integer m524invoke() {
        ViewModelListProperty viewModelListProperty = this.this$0;
        return Integer.valueOf(viewModelListProperty.cppSize(viewModelListProperty.getCppPointer()));
    }
}
