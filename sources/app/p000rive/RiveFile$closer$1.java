package app.p000rive;

import app.p000rive.core.FileHandle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.l1d;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveFile$closer$1 extends hab0 implements Function0 {
    final /* synthetic */ RiveFile this$0;

    /* JADX INFO: renamed from: app.rive.RiveFile$closer$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ RiveFile this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveFile riveFile) {
            super(0);
            this.this$0 = riveFile;
        }

        public final String invoke() {
            return l1d.m("Deleting ", FileHandle.m372toStringimpl(this.this$0.getFileHandle()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$closer$1(RiveFile riveFile) {
        super(0);
        this.this$0 = riveFile;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m55invoke() {
        RiveLog.INSTANCE.getLogger().d("Rive/File", new AnonymousClass1(this.this$0));
        this.this$0.getRiveWorker().m226deleteFiledJ1Evnk(this.this$0.getFileHandle());
        this.this$0.getRiveWorker().release("Rive/File", "RiveFile closed");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m55invoke();
        return rih1.a;
    }
}
