package app.p000rive.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RenderContext$closer$1 extends hab0 implements Function0 {
    final /* synthetic */ RenderContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderContext$closer$1(RenderContext renderContext) {
        super(0);
        this.this$0 = renderContext;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m402invoke();
        return rih1.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m402invoke() {
        this.this$0.dispose();
    }
}
