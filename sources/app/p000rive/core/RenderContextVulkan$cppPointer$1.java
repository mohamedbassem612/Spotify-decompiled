package app.p000rive.core;

import app.p000rive.RiveLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.iu30;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "pointer", "Lp/rih1;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RenderContextVulkan$cppPointer$1 extends hab0 implements iu30 {
    final /* synthetic */ RenderContextVulkan this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderContextVulkan$cppPointer$1(RenderContextVulkan renderContextVulkan) {
        super(1);
        this.this$0 = renderContextVulkan;
    }

    public final void invoke(long j) {
        RiveLog.INSTANCE.getLogger().d(RenderContextVulkan.TAG, AnonymousClass1.INSTANCE);
        this.this$0.cppDelete(j);
    }

    /* JADX INFO: renamed from: app.rive.core.RenderContextVulkan$cppPointer$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Deleting RenderContextVulkan native object";
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return rih1.a;
    }
}
