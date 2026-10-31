package app.p000rive.core;

import app.p000rive.RiveLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.bhn0;
import p.hab0;
import p.iu30;
import p.l1d;
import p.l811;
import p.mhd;
import p.rih1;

/* JADX INFO: renamed from: app.rive.core.CommandQueue$decodeFont-sOckvAc$$inlined$suspendNativeResourceRequest$1, reason: invalid class name */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "value", "Lp/rih1;", "invoke", "(Ljava/lang/Object;)V", "app/rive/core/CommandQueue$suspendNativeResourceRequest$2$cleanupOnce$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CommandQueue$decodeFontsOckvAc$$inlined$suspendNativeResourceRequest$1 extends hab0 implements iu30 {
    final /* synthetic */ l811 $cleanupScheduled;
    final /* synthetic */ mhd $cont;
    final /* synthetic */ CommandQueue $receiver$inlined;
    final /* synthetic */ long $requestID;
    final /* synthetic */ CommandQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$decodeFontsOckvAc$$inlined$suspendNativeResourceRequest$1(CommandQueue commandQueue, mhd mhdVar, long j, l811 l811Var, CommandQueue commandQueue2) {
        super(1);
        this.this$0 = commandQueue;
        this.$cont = mhdVar;
        this.$requestID = j;
        this.$cleanupScheduled = l811Var;
        this.$receiver$inlined = commandQueue2;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m326invoke(Object obj) {
        this.this$0.runOrDispatchOnMain(this.$cont.getContext(), new AnonymousClass1(this.$requestID), new AnonymousClass2(this.$cleanupScheduled, obj, this.$receiver$inlined));
    }

    /* JADX INFO: renamed from: app.rive.core.CommandQueue$decodeFont-sOckvAc$$inlined$suspendNativeResourceRequest$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "t", "Lp/rih1;", "invoke", "(Ljava/lang/Throwable;)V", "app/rive/core/CommandQueue$suspendNativeResourceRequest$2$cleanupOnce$1$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ long $requestID;

        /* JADX INFO: renamed from: app.rive.core.CommandQueue$decodeFont-sOckvAc$$inlined$suspendNativeResourceRequest$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "", "invoke", "app/rive/core/CommandQueue$suspendNativeResourceRequest$2$cleanupOnce$1$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00211 extends hab0 implements Function0 {
            final /* synthetic */ long $requestID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00211(long j) {
                super(0);
                this.$requestID = j;
            }

            public final String invoke() {
                return l1d.l(this.$requestID, "Failed to clean up resource for cancelled request ");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(1);
            this.$requestID = j;
        }

        public final void invoke(Throwable th) {
            RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new C00211(this.$requestID));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return rih1.a;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m326invoke(obj);
        return rih1.a;
    }

    /* JADX INFO: renamed from: app.rive.core.CommandQueue$decodeFont-sOckvAc$$inlined$suspendNativeResourceRequest$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "T", "Lp/rih1;", "invoke", "()V", "app/rive/core/CommandQueue$suspendNativeResourceRequest$2$cleanupOnce$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        final /* synthetic */ l811 $cleanupScheduled;
        final /* synthetic */ CommandQueue $receiver$inlined;
        final /* synthetic */ Object $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l811 l811Var, Object obj, CommandQueue commandQueue) {
            super(0);
            this.$cleanupScheduled = l811Var;
            this.$value = obj;
            this.$receiver$inlined = commandQueue;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m328invoke() {
            l811 l811Var = this.$cleanupScheduled;
            if (l811Var.a) {
                return;
            }
            l811Var.a = true;
            Object obj = this.$value;
            if (obj == null) {
                bhn0.i("null cannot be cast to non-null type app.rive.core.FontHandle");
            } else {
                this.$receiver$inlined.m227deleteFontwK5q9OY(((FontHandle) obj).m388unboximpl());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m328invoke();
            return rih1.a;
        }
    }
}
