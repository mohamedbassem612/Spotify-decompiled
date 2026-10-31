package app.p000rive.core;

import app.p000rive.RiveLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.iu30;
import p.l1d;
import p.mhd;
import p.p811;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "Lp/rih1;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CommandQueue$suspendNativeResourceRequest$2$1 extends hab0 implements iu30 {
    final /* synthetic */ iu30 $cleanupOnce;
    final /* synthetic */ mhd $cont;
    final /* synthetic */ p811 $provisionalResource;
    final /* synthetic */ long $requestID;
    final /* synthetic */ CommandQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$suspendNativeResourceRequest$2$1(CommandQueue commandQueue, mhd mhdVar, long j, p811 p811Var, iu30 iu30Var) {
        super(1);
        this.this$0 = commandQueue;
        this.$cont = mhdVar;
        this.$requestID = j;
        this.$provisionalResource = p811Var;
        this.$cleanupOnce = iu30Var;
    }

    public final void invoke(Throwable th) {
        this.this$0.runOrDispatchOnMain(this.$cont.getContext(), new AnonymousClass1(this.$requestID), new AnonymousClass2(this.this$0, this.$requestID, this.$provisionalResource, this.$cleanupOnce));
    }

    /* JADX INFO: renamed from: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "t", "Lp/rih1;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ long $requestID;

        /* JADX INFO: renamed from: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00241 extends hab0 implements Function0 {
            final /* synthetic */ long $requestID;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00241(long j) {
                super(0);
                this.$requestID = j;
            }

            public final String invoke() {
                return l1d.l(this.$requestID, "Failed to process cancellation for resource request ");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(1);
            this.$requestID = j;
        }

        public final void invoke(Throwable th) {
            RiveLog.INSTANCE.getLogger().e(CommandQueueKt.COMMAND_QUEUE_TAG, th, new C00241(this.$requestID));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return rih1.a;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return rih1.a;
    }

    /* JADX INFO: renamed from: app.rive.core.CommandQueue$suspendNativeResourceRequest$2$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        final /* synthetic */ iu30 $cleanupOnce;
        final /* synthetic */ p811 $provisionalResource;
        final /* synthetic */ long $requestID;
        final /* synthetic */ CommandQueue this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandQueue commandQueue, long j, p811 p811Var, iu30 iu30Var) {
            super(0);
            this.this$0 = commandQueue;
            this.$requestID = j;
            this.$provisionalResource = p811Var;
            this.$cleanupOnce = iu30Var;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m353invoke() {
            this.this$0.pendingContinuations.remove(Long.valueOf(this.$requestID));
            this.this$0.pendingResourceCleanups.remove(Long.valueOf(this.$requestID));
            Object obj = this.$provisionalResource.a;
            if (obj != null) {
                this.$cleanupOnce.invoke(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m353invoke();
            return rih1.a;
        }
    }
}
