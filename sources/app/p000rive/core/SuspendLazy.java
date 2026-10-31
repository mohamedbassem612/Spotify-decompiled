package app.p000rive.core;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p.d9n;
import p.eg;
import p.hm5;
import p.iu30;
import p.lnm;
import p.onm;
import p.os00;
import p.q8r;
import p.u890;
import p.vgn0;
import p.ygn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\b\u0010\tR*\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lapp/rive/core/SuspendLazy;", "T", "", "Lkotlin/Function1;", "Lp/lnm;", "block", "<init>", "(Lp/iu30;)V", "await", "(Lp/lnm;)Ljava/lang/Object;", "Lp/iu30;", "Lapp/rive/core/DeferredResult;", "result", "Lapp/rive/core/DeferredResult;", "Lp/vgn0;", "mutex", "Lp/vgn0;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SuspendLazy<T> {
    public static final int $stable = 8;
    private final iu30 block;
    private volatile DeferredResult<? extends T> result = DeferredResult.Uninitialized.INSTANCE;
    private final vgn0 mutex = ygn0.a();

    /* JADX INFO: renamed from: app.rive.core.SuspendLazy$await$1, reason: invalid class name */
    @q8r(c = "app.rive.core.SuspendLazy", f = "SuspendLazy.kt", l = {62, Maneuver.TYPE_ROUNDABOUT_EXIT_CCW}, m = "await")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends onm {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SuspendLazy<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SuspendLazy<T> suspendLazy, lnm<? super AnonymousClass1> lnmVar) {
            super(lnmVar);
            this.this$0 = suspendLazy;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= os00.INVALID_ID;
            return this.this$0.await(this);
        }
    }

    public SuspendLazy(iu30 iu30Var) {
        this.block = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object await(lnm<? super T> lnmVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        vgn0 vgn0Var;
        SuspendLazy<T> suspendLazy;
        vgn0 vgn0Var2;
        Throwable th;
        Object value;
        if (lnmVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) lnmVar;
            int i = anonymousClass1.label;
            if ((i & os00.INVALID_ID) != 0) {
                anonymousClass1.label = i - os00.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(this, lnmVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, lnmVar);
        }
        Object obj = anonymousClass1.result;
        d9n d9nVar = d9n.a;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                DeferredResult<? extends T> deferredResult = this.result;
                if (deferredResult instanceof DeferredResult.Success) {
                    return ((DeferredResult.Success) deferredResult).getValue();
                }
                if (deferredResult instanceof DeferredResult.Failure) {
                    throw ((DeferredResult.Failure) deferredResult).getError();
                }
                if (!u890.j(deferredResult, DeferredResult.Uninitialized.INSTANCE)) {
                    eg.o();
                    return null;
                }
                vgn0Var = this.mutex;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = vgn0Var;
                anonymousClass1.label = 1;
                if (vgn0Var.a(anonymousClass1) != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = (vgn0) anonymousClass1.L$1;
                suspendLazy = (SuspendLazy) anonymousClass1.L$0;
                try {
                    hm5.M(obj);
                    suspendLazy.result = new DeferredResult.Success(obj);
                    Object obj2 = obj;
                    vgn0Var = vgn0Var2;
                    value = obj2;
                    vgn0Var.c((Object) null);
                    return value;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        suspendLazy.result = new DeferredResult.Failure(th);
                        throw th;
                    } catch (Throwable th3) {
                        vgn0Var = vgn0Var2;
                        th = th3;
                        vgn0Var.c((Object) null);
                        throw th;
                    }
                }
            }
            vgn0 vgn0Var3 = (vgn0) anonymousClass1.L$1;
            SuspendLazy<T> suspendLazy2 = (SuspendLazy) anonymousClass1.L$0;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            this = suspendLazy2;
            DeferredResult<? extends T> deferredResult2 = this.result;
            if (!(deferredResult2 instanceof DeferredResult.Success)) {
                if (deferredResult2 instanceof DeferredResult.Failure) {
                    throw ((DeferredResult.Failure) deferredResult2).getError();
                }
                if (!u890.j(deferredResult2, DeferredResult.Uninitialized.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    iu30 iu30Var = this.block;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = vgn0Var;
                    anonymousClass1.label = 2;
                    Object objInvoke = iu30Var.invoke(anonymousClass1);
                    if (objInvoke != d9nVar) {
                        suspendLazy = this;
                        vgn0Var2 = vgn0Var;
                        obj = objInvoke;
                        suspendLazy.result = new DeferredResult.Success(obj);
                        Object obj3 = obj;
                        vgn0Var = vgn0Var2;
                        value = obj3;
                    }
                    return d9nVar;
                } catch (Throwable th4) {
                    suspendLazy = this;
                    vgn0Var2 = vgn0Var;
                    th = th4;
                    suspendLazy.result = new DeferredResult.Failure(th);
                    throw th;
                }
            }
            value = ((DeferredResult.Success) deferredResult2).getValue();
            vgn0Var.c((Object) null);
            return value;
        } catch (Throwable th5) {
            th = th5;
            vgn0Var.c((Object) null);
            throw th;
        }
    }
}
