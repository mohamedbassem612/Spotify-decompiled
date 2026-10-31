package app.p000rive;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.a8d1;
import p.ayh;
import p.c9n;
import p.d9n;
import p.eg;
import p.faa0;
import p.hm5;
import p.lnm;
import p.q8r;
import p.rih1;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.RiveCanvasSession$beginPlaying$3$closeWatcher$1", f = "RiveCanvasSession.kt", l = {669}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
public final class RiveCanvasSession$beginPlaying$3$closeWatcher$1 extends a8d1 implements vu30 {
    final /* synthetic */ faa0 $renderLoop;
    int label;
    final /* synthetic */ RiveCanvasSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveCanvasSession$beginPlaying$3$closeWatcher$1(RiveCanvasSession riveCanvasSession, faa0 faa0Var, lnm<? super RiveCanvasSession$beginPlaying$3$closeWatcher$1> lnmVar) {
        super(2, lnmVar);
        this.this$0 = riveCanvasSession;
        this.$renderLoop = faa0Var;
    }

    public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
        return new RiveCanvasSession$beginPlaying$3$closeWatcher$1(this.this$0, this.$renderLoop, lnmVar);
    }

    public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
        return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            hm5.M(obj);
            ayh ayhVar = this.this$0.closeSignal;
            this.label = 1;
            Object objQ = ayhVar.Q(this);
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
        this.$renderLoop.d((CancellationException) null);
        return rih1.a;
    }
}
