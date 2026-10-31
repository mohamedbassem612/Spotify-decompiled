package p;

import com.spotify.ads.esperanto.proto.TriggerSlotRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class of91 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ pf91 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of91(pf91 pf91Var, onm onmVar) {
        super(onmVar);
        this.b = pf91Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e((TriggerSlotRequest) null, this);
    }
}
