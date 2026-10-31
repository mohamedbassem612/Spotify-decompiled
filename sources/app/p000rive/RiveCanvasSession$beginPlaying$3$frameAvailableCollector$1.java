package app.p000rive;

import android.graphics.Bitmap;
import android.os.Trace;
import kotlin.Metadata;
import p.a8d1;
import p.at71;
import p.c9n;
import p.d9n;
import p.eg;
import p.hm5;
import p.jah;
import p.l4p1;
import p.lnm;
import p.q8r;
import p.rih1;
import p.vr20;
import p.vu30;
import p.wen0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1", f = "RiveCanvasSession.kt", l = {576}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
public final class RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1 extends a8d1 implements vu30 {
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1$1, reason: invalid class name */
    @q8r(c = "app.rive.RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1$1", f = "RiveCanvasSession.kt", l = {578}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/HardwareRenderBuffer;", "activeBuffer", "Lp/rih1;", "<anonymous>", "(Lapp/rive/HardwareRenderBuffer;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RiveCanvasSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveCanvasSession riveCanvasSession, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.this$0 = riveCanvasSession;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, lnmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(HardwareRenderBuffer hardwareRenderBuffer, lnm<? super rih1> lnmVar) {
            return create(hardwareRenderBuffer, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                hm5.M(obj);
                final HardwareRenderBuffer hardwareRenderBuffer = (HardwareRenderBuffer) this.L$0;
                if (hardwareRenderBuffer == null) {
                    return rih1.a;
                }
                at71 frameAvailable = hardwareRenderBuffer.getFrameAvailable();
                final RiveCanvasSession riveCanvasSession = this.this$0;
                vr20 vr20Var = new vr20() { // from class: app.rive.RiveCanvasSession.beginPlaying.3.frameAvailableCollector.1.1.1
                    public final Object emit(rih1 rih1Var, lnm<? super rih1> lnmVar) {
                        RiveCanvasSession riveCanvasSession2 = riveCanvasSession;
                        HardwareRenderBuffer hardwareRenderBuffer2 = hardwareRenderBuffer;
                        Trace.beginSection("Rive/CanvasSession/PublishLatestBitmap");
                        try {
                            Trace.beginSection("Rive/CanvasSession/ToBitmap");
                            try {
                                Bitmap bitmapConsumeLatestBitmap = hardwareRenderBuffer2.consumeLatestBitmap();
                                Trace.endSection();
                                rih1 rih1Var2 = rih1.a;
                                if (bitmapConsumeLatestBitmap != null && riveCanvasSession2.latestBitmap != bitmapConsumeLatestBitmap) {
                                    riveCanvasSession2.latestBitmap = bitmapConsumeLatestBitmap;
                                    riveCanvasSession2._frameAvailable.a(rih1Var2);
                                }
                                return rih1Var2;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }

                    public /* bridge */ /* synthetic */ Object emit(Object obj2, lnm lnmVar) {
                        return emit((rih1) obj2, (lnm<? super rih1>) lnmVar);
                    }
                };
                this.label = 1;
                Object objCollect = frameAvailable.collect(vr20Var, this);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            jah.d();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1(RiveCanvasSession riveCanvasSession, lnm<? super RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1> lnmVar) {
        super(2, lnmVar);
        this.this$0 = riveCanvasSession;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        return new RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1(this.this$0, lnmVar);
    }

    public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
        return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            hm5.M(obj);
            wen0 wen0Var = this.this$0.renderBufferState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            Object objQ = l4p1.q(wen0Var, anonymousClass1, this);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
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
}
