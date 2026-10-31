package app.p000rive.core;

import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.m231;
import p.mhd;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "throwable", "Lp/rih1;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1 extends hab0 implements iu30 {
    final /* synthetic */ mhd $cont;
    final /* synthetic */ long $requestID;
    final /* synthetic */ CommandQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$suspendNativeResourceRequest$2$failBeforeProvisionalHandle$1(CommandQueue commandQueue, long j, mhd mhdVar) {
        super(1);
        this.this$0 = commandQueue;
        this.$requestID = j;
        this.$cont = mhdVar;
    }

    public final void invoke(Throwable th) {
        this.this$0.pendingContinuations.remove(Long.valueOf(this.$requestID));
        this.this$0.pendingResourceCleanups.remove(Long.valueOf(this.$requestID));
        this.$cont.resumeWith(new m231(th));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return rih1.a;
    }
}
