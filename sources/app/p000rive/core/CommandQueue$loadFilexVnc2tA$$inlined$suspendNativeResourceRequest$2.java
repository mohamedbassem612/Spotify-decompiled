package app.p000rive.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.iu30;
import p.mhd;
import p.p811;
import p.rih1;

/* JADX INFO: renamed from: app.rive.core.CommandQueue$loadFile-xVnc2tA$$inlined$suspendNativeResourceRequest$2, reason: invalid class name */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "T", "Lp/rih1;", "invoke", "()V", "app/rive/core/CommandQueue$suspendNativeResourceRequest$2$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CommandQueue$loadFilexVnc2tA$$inlined$suspendNativeResourceRequest$2 extends hab0 implements Function0 {
    final /* synthetic */ byte[] $bytes$inlined;
    final /* synthetic */ iu30 $cleanupOnce;
    final /* synthetic */ mhd $cont;
    final /* synthetic */ p811 $provisionalResource;
    final /* synthetic */ long $requestID;
    final /* synthetic */ CommandQueue this$0;
    final /* synthetic */ CommandQueue this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$loadFilexVnc2tA$$inlined$suspendNativeResourceRequest$2(mhd mhdVar, CommandQueue commandQueue, long j, iu30 iu30Var, p811 p811Var, CommandQueue commandQueue2, byte[] bArr) {
        super(0);
        this.$cont = mhdVar;
        this.this$0$inline_fun = commandQueue;
        this.$requestID = j;
        this.$cleanupOnce = iu30Var;
        this.$provisionalResource = p811Var;
        this.this$0 = commandQueue2;
        this.$bytes$inlined = bArr;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m345invoke() {
        if (this.$cont.isCancelled()) {
            return;
        }
        this.this$0$inline_fun.pendingContinuations.put(Long.valueOf(this.$requestID), this.$cont);
        this.this$0$inline_fun.pendingResourceCleanups.put(Long.valueOf(this.$requestID), this.$cleanupOnce);
        this.$provisionalResource.a = FileHandle.m367boximpl(FileHandle.m368constructorimpl(this.this$0.bridge.cppLoadFile(this.this$0.requireNativePointer(), this.$requestID, this.$bytes$inlined)));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m345invoke();
        return rih1.a;
    }
}
