package p;

import spotify.your_library.proto.SetFilterOrder$SetFilterOrderRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pwm1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ vwm1 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwm1(vwm1 vwm1Var, onm onmVar) {
        super(onmVar);
        this.b = vwm1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c((SetFilterOrder$SetFilterOrderRequest) null, this);
    }
}
