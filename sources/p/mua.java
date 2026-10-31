package p;

import com.spotify.pamviewservice.v1.proto.PremiumPlanRow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mua extends onm {
    public PremiumPlanRow a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h50 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mua(h50 h50Var, lnm lnmVar) {
        super(lnmVar);
        this.c = h50Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
