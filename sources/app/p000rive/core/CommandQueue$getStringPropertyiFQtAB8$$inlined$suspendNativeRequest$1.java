package app.p000rive.core;

import kotlin.Metadata;
import p.a8d1;
import p.aym;
import p.c9n;
import p.d9n;
import p.eg;
import p.hab0;
import p.hm5;
import p.iu30;
import p.lnm;
import p.ohd;
import p.q8r;
import p.rih1;
import p.vu30;
import p.ydh;

/* JADX INFO: renamed from: app.rive.core.CommandQueue$getStringProperty-iFQtAB8$$inlined$suspendNativeRequest$1, reason: invalid class name */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.core.CommandQueue$getStringProperty-iFQtAB8$$inlined$suspendNativeRequest$1", f = "CommandQueue.kt", l = {4376}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0002"}, d2 = {"T", "Lp/c9n;", "app/rive/core/CommandQueue$suspendNativeRequest$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CommandQueue$getStringPropertyiFQtAB8$$inlined$suspendNativeRequest$1 extends a8d1 implements vu30 {
    final /* synthetic */ String $propertyPath$inlined;
    final /* synthetic */ long $viewModelInstanceHandle$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CommandQueue this$0;
    final /* synthetic */ CommandQueue this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandQueue$getStringPropertyiFQtAB8$$inlined$suspendNativeRequest$1(CommandQueue commandQueue, lnm lnmVar, CommandQueue commandQueue2, long j, String str) {
        super(2, lnmVar);
        this.this$0$inline_fun = commandQueue;
        this.this$0 = commandQueue2;
        this.$viewModelInstanceHandle$inlined = j;
        this.$propertyPath$inlined = str;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        return new CommandQueue$getStringPropertyiFQtAB8$$inlined$suspendNativeRequest$1(this.this$0$inline_fun, lnmVar, this.this$0, this.$viewModelInstanceHandle$inlined, this.$propertyPath$inlined);
    }

    public final Object invoke(c9n c9nVar, lnm<? super String> lnmVar) {
        return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            return obj;
        }
        hm5.M(obj);
        CommandQueue commandQueue = this.this$0$inline_fun;
        this.L$0 = commandQueue;
        this.label = 1;
        ohd ohdVar = new ohd(1, aym.t(this));
        long jE = ydh.e(ohdVar, commandQueue);
        commandQueue.pendingContinuations.put(new Long(jE), ohdVar);
        ohdVar.n(new AnonymousClass1(commandQueue, jE));
        try {
            this.this$0.bridge.cppGetStringProperty(this.this$0.requireNativePointer(), jE, this.$viewModelInstanceHandle$inlined, this.$propertyPath$inlined);
            Object objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            return objR == d9nVar ? d9nVar : objR;
        } catch (Throwable th) {
            ydh.j(jE, commandQueue.pendingContinuations);
            throw th;
        }
    }

    /* JADX INFO: renamed from: app.rive.core.CommandQueue$getStringProperty-iFQtAB8$$inlined$suspendNativeRequest$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "it", "Lp/rih1;", "invoke", "(Ljava/lang/Throwable;)V", "app/rive/core/CommandQueue$suspendNativeRequest$2$1$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        final /* synthetic */ long $requestID;
        final /* synthetic */ CommandQueue this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommandQueue commandQueue, long j) {
            super(1);
            this.this$0 = commandQueue;
            this.$requestID = j;
        }

        public final void invoke(Throwable th) {
            this.this$0.pendingContinuations.remove(Long.valueOf(this.$requestID));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return rih1.a;
        }
    }
}
