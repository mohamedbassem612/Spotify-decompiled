package app.p000rive.core;

import android.view.Choreographer;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Metadata;
import p.a8d1;
import p.aym;
import p.c9n;
import p.d9n;
import p.eg;
import p.fn31;
import p.hab0;
import p.hm5;
import p.idd1;
import p.iu30;
import p.lnm;
import p.ohd;
import p.onm;
import p.os00;
import p.q8r;
import p.rih1;
import p.s110;
import p.ton1;
import p.vu30;
import p.w55;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanosChoreographer", "(Lp/iu30;Lp/lnm;)Ljava/lang/Object;", "Lapp/rive/core/FrameTicker;", "ChoreographerFrameTicker", "Lapp/rive/core/FrameTicker;", "getChoreographerFrameTicker", "()Lapp/rive/core/FrameTicker;", "ComposeFrameTicker", "getComposeFrameTicker", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FrameTickerKt {
    private static final FrameTicker ChoreographerFrameTicker = new FrameTicker() { // from class: app.rive.core.FrameTickerKt$ChoreographerFrameTicker$1
        @Override // app.p000rive.core.FrameTicker
        public final Object withFrame(iu30 iu30Var, lnm<? super rih1> lnmVar) {
            Object objWithFrameNanosChoreographer = FrameTickerKt.withFrameNanosChoreographer(new AnonymousClass1(iu30Var), lnmVar);
            return objWithFrameNanosChoreographer == d9n.a ? objWithFrameNanosChoreographer : rih1.a;
        }

        /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$ChoreographerFrameTicker$1$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTimeNs", "Lp/rih1;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass1 extends hab0 implements iu30 {
            final /* synthetic */ iu30 $onFrame;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(iu30 iu30Var) {
                super(1);
                this.$onFrame = iu30Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return rih1.a;
            }

            public final void invoke(long j) {
                this.$onFrame.invoke(Long.valueOf(j));
            }
        }
    };
    private static final FrameTicker ComposeFrameTicker = new FrameTicker() { // from class: app.rive.core.FrameTickerKt$ComposeFrameTicker$1
        @Override // app.p000rive.core.FrameTicker
        public final Object withFrame(iu30 iu30Var, lnm<? super rih1> lnmVar) {
            idd1 idd1Var = w55.Z;
            Object objY = fn31.Y(ton1.u(), new AnonymousClass1(iu30Var, null), lnmVar);
            return objY == d9n.a ? objY : rih1.a;
        }

        /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1, reason: invalid class name */
        @q8r(c = "app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1", f = "FrameTicker.kt", l = {24}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass1 extends a8d1 implements vu30 {
            final /* synthetic */ iu30 $onFrame;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(iu30 iu30Var, lnm<? super AnonymousClass1> lnmVar) {
                super(2, lnmVar);
                this.$onFrame = iu30Var;
            }

            public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
                return new AnonymousClass1(this.$onFrame, lnmVar);
            }

            public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
                return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
            }

            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    hm5.M(obj);
                    C00261 c00261 = new C00261(this.$onFrame);
                    this.label = 1;
                    Object objD = s110.h(getContext()).D(c00261, this);
                    d9n d9nVar = d9n.a;
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            }

            /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$ComposeFrameTicker$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTimeNs", "Lp/rih1;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class C00261 extends hab0 implements iu30 {
                final /* synthetic */ iu30 $onFrame;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00261(iu30 iu30Var) {
                    super(1);
                    this.$onFrame = iu30Var;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return rih1.a;
                }

                public final void invoke(long j) {
                    this.$onFrame.invoke(Long.valueOf(j));
                }
            }
        }
    };

    /* JADX INFO: renamed from: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$1, reason: invalid class name */
    @q8r(c = "app.rive.core.FrameTickerKt", f = "FrameTicker.kt", l = {Maneuver.TYPE_FERRY_TRAIN_RIGHT}, m = "withFrameNanosChoreographer")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1<R> extends onm {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lnm<? super AnonymousClass1> lnmVar) {
            super(lnmVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= os00.INVALID_ID;
            return FrameTickerKt.withFrameNanosChoreographer(null, this);
        }
    }

    public static final FrameTicker getChoreographerFrameTicker() {
        return ChoreographerFrameTicker;
    }

    public static final FrameTicker getComposeFrameTicker() {
        return ComposeFrameTicker;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <R> Object withFrameNanosChoreographer(iu30 iu30Var, lnm<? super R> lnmVar) {
        AnonymousClass1 anonymousClass1;
        if (lnmVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) lnmVar;
            int i = anonymousClass1.label;
            if ((i & os00.INVALID_ID) != 0) {
                anonymousClass1.label = i - os00.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(lnmVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(lnmVar);
        }
        Object objR = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            hm5.M(objR);
            anonymousClass1.L$0 = iu30Var;
            anonymousClass1.label = 1;
            final ohd ohdVar = new ohd(1, aym.t(anonymousClass1));
            ohdVar.t();
            Choreographer choreographer = Choreographer.getInstance();
            Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: app.rive.core.FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$onFrameCallback$1
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    ohdVar.resumeWith(Long.valueOf(j));
                }
            };
            choreographer.postFrameCallback(frameCallback);
            ohdVar.n(new FrameTickerKt$withFrameNanosChoreographer$frameTimeNs$1$1(choreographer, frameCallback));
            objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iu30Var = (iu30) anonymousClass1.L$0;
            hm5.M(objR);
        }
        return iu30Var.invoke(new Long(((Number) objR).longValue()));
    }
}
