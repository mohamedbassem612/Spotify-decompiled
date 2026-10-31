package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SoftwareRenderBuffer$closer$1 extends hab0 implements Function0 {
    final /* synthetic */ SoftwareRenderBuffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoftwareRenderBuffer$closer$1(SoftwareRenderBuffer softwareRenderBuffer) {
        super(0);
        this.this$0 = softwareRenderBuffer;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m99invoke() {
        this.this$0.getSurface().close();
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m99invoke();
        return rih1.a;
    }
}
