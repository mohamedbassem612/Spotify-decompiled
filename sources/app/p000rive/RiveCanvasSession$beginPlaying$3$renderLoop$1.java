package app.p000rive;

import android.os.Trace;
import app.p000rive.core.ArtboardHandle;
import app.p000rive.core.FrameTicker;
import app.p000rive.core.StateMachineHandle;
import com.comscore.streaming.ContentDeliverySubscriptionType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.c9n;
import p.d9n;
import p.eg;
import p.fdg1;
import p.gvg;
import p.hab0;
import p.hm5;
import p.iu30;
import p.jfv;
import p.l811;
import p.lnm;
import p.ngv;
import p.o811;
import p.q8r;
import p.rih1;
import p.smo1;
import p.vu30;
import p.w8c0;
import p.x8c0;
import p.ytw0;
import p.z8p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1", f = "RiveCanvasSession.kt", l = {597}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
public final class RiveCanvasSession$beginPlaying$3$renderLoop$1 extends a8d1 implements vu30 {
    final /* synthetic */ x8c0 $lifecycle;
    final /* synthetic */ FrameTicker $ticker;
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$3$renderLoop$1(x8c0 x8c0Var, RiveCanvasSession riveCanvasSession, FrameTicker frameTicker, lnm<? super RiveCanvasSession$beginPlaying$3$renderLoop$1> lnmVar) {
        super(2, lnmVar);
        this.$lifecycle = x8c0Var;
        this.this$0 = riveCanvasSession;
        this.$ticker = frameTicker;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        return new RiveCanvasSession$beginPlaying$3$renderLoop$1(this.$lifecycle, this.this$0, this.$ticker, lnmVar);
    }

    public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
        return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            hm5.M(obj);
            x8c0 x8c0Var = this.$lifecycle;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$ticker, null);
            this.label = 1;
            Object objT = z8p1.t(x8c0Var, w8c0.e, anonymousClass1, this);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
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

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1, reason: invalid class name */
    @q8r(c = "app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1", f = "RiveCanvasSession.kt", l = {ContentDeliverySubscriptionType.PREMIUM}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ FrameTicker $ticker;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ RiveCanvasSession this$0;

        /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00021 extends hab0 implements Function0 {
            final /* synthetic */ RiveCanvasSession this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(RiveCanvasSession riveCanvasSession) {
                super(0);
                this.this$0 = riveCanvasSession;
            }

            public final String invoke() {
                return gvg.h("Starting drawing with ", ArtboardHandle.m183toStringimpl(this.this$0.artboard.getArtboardHandle()), " and ", StateMachineHandle.m439toStringimpl(this.this$0.stateMachine.getStateMachineHandle()));
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass3 extends hab0 implements Function0 {
            final /* synthetic */ RiveCanvasSession this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(RiveCanvasSession riveCanvasSession) {
                super(0);
                this.this$0 = riveCanvasSession;
            }

            public final String invoke() {
                return gvg.h("Ending drawing with ", ArtboardHandle.m183toStringimpl(this.this$0.artboard.getArtboardHandle()), " and ", StateMachineHandle.m439toStringimpl(this.this$0.stateMachine.getStateMachineHandle()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveCanvasSession riveCanvasSession, FrameTicker frameTicker, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.this$0 = riveCanvasSession;
            this.$ticker = frameTicker;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$ticker, lnmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            o811 o811Var;
            l811 l811Var;
            c9n c9nVar;
            int i = this.label;
            if (i == 0) {
                hm5.M(obj);
                c9n c9nVar2 = (c9n) this.L$0;
                RiveLog.INSTANCE.getLogger().d("Rive/CanvasSession", new C00021(this.this$0));
                o811Var = new o811();
                l811Var = new l811();
                c9nVar = c9nVar2;
            } else {
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l811Var = (l811) this.L$2;
                o811Var = (o811) this.L$1;
                c9nVar = (c9n) this.L$0;
                hm5.M(obj);
            }
            while (smo1.u(c9nVar) && !this.this$0.closer.getClosed()) {
                FrameTicker frameTicker = this.$ticker;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, o811Var, l811Var);
                this.L$0 = c9nVar;
                this.L$1 = o811Var;
                this.L$2 = l811Var;
                this.label = 1;
                Object objWithFrame = frameTicker.withFrame(anonymousClass2, this);
                d9n d9nVar = d9n.a;
                if (objWithFrame == d9nVar) {
                    return d9nVar;
                }
            }
            RiveLog.INSTANCE.getLogger().d("Rive/CanvasSession", new AnonymousClass3(this.this$0));
            return rih1.a;
        }

        /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3$renderLoop$1$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTimeNs", "Lp/rih1;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass2 extends hab0 implements iu30 {
            final /* synthetic */ o811 $lastFrameTimeNs;
            final /* synthetic */ l811 $loggedNoBuffer;
            final /* synthetic */ RiveCanvasSession this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RiveCanvasSession riveCanvasSession, o811 o811Var, l811 l811Var) {
                super(1);
                this.this$0 = riveCanvasSession;
                this.$lastFrameTimeNs = o811Var;
                this.$loggedNoBuffer = l811Var;
            }

            public final void invoke(long j) {
                if (this.this$0.closer.getClosed()) {
                    return;
                }
                o811 o811Var = this.$lastFrameTimeNs;
                long j2 = o811Var.a;
                long j3 = j2 != 0 ? j - j2 : 0L;
                o811Var.a = j;
                RiveCanvasSession riveCanvasSession = this.this$0;
                l811 l811Var = this.$loggedNoBuffer;
                Trace.beginSection("Rive/Frame");
                try {
                    HardwareRenderBuffer hardwareRenderBuffer = riveCanvasSession.renderBuffer;
                    if (hardwareRenderBuffer == null) {
                        if (!l811Var.a) {
                            RiveLog.INSTANCE.getLogger().w("Rive/CanvasSession", RiveCanvasSession$beginPlaying$3$renderLoop$1$1$2$1$1.INSTANCE);
                            l811Var.a = true;
                        }
                        Trace.beginSection("Rive/Frame/NoBuffer");
                        Trace.endSection();
                    } else {
                        l811Var.a = false;
                        if (!((Boolean) riveCanvasSession.stateMachine.getSettled().getValue()).booleanValue()) {
                            Trace.beginSection("Rive/Frame/Advance");
                            try {
                                StateMachine stateMachine = riveCanvasSession.stateMachine;
                                ytw0 ytw0Var = jfv.b;
                                stateMachine.m100advanceLRDsOJo(fdg1.l0(j3, ngv.b));
                                Trace.endSection();
                                if (riveCanvasSession.semanticsEnabled) {
                                    Trace.beginSection("Rive/Frame/DrainSemantics");
                                    try {
                                        riveCanvasSession.stateMachine.drainSemanticsDiff(riveCanvasSession.fit, hardwareRenderBuffer.getWidth(), hardwareRenderBuffer.getHeight());
                                        Trace.endSection();
                                    } catch (Throwable th) {
                                        Trace.endSection();
                                        throw th;
                                    }
                                }
                                Trace.beginSection("Rive/Frame/Draw");
                                try {
                                    hardwareRenderBuffer.render(riveCanvasSession.artboard, riveCanvasSession.stateMachine, riveCanvasSession.fit, riveCanvasSession.clearColor);
                                    Trace.endSection();
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return rih1.a;
            }
        }
    }
}
