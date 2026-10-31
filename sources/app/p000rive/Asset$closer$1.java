package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"H", "Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class Asset$closer$1 extends hab0 implements Function0 {
    final /* synthetic */ Asset<H> this$0;

    /* JADX INFO: renamed from: app.rive.Asset$closer$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "H", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ Asset<H> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Asset<H> asset) {
            super(0);
            this.this$0 = asset;
        }

        public final String invoke() {
            return "Deleting " + ((Asset) this.this$0).ops.getLabel() + " with handle: " + this.this$0.getHandle();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset$closer$1(Asset<H> asset) {
        super(0);
        this.this$0 = asset;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m14invoke() {
        RiveLog.INSTANCE.getLogger().d(((Asset) this.this$0).ops.getTag(), new AnonymousClass1(this.this$0));
        ((Asset) this.this$0).ops.delete(this.this$0.getRiveWorker(), this.this$0.getHandle());
        this.this$0.getRiveWorker().release(((Asset) this.this$0).ops.getTag(), "Asset closed");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m14invoke();
        return rih1.a;
    }
}
