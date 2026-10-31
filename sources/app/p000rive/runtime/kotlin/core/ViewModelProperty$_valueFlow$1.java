package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class ViewModelProperty$_valueFlow$1 extends hab0 implements Function0 {
    final /* synthetic */ ViewModelProperty<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelProperty$_valueFlow$1(ViewModelProperty<T> viewModelProperty) {
        super(0);
        this.this$0 = viewModelProperty;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public final T invoke() {
        return this.this$0.nativeGetValue();
    }
}
