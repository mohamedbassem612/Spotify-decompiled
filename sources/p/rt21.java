package p;

import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rt21 extends onm {
    public ResolveIntentRequest a;
    public q1m b;
    public t45 c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kdy0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt21(kdy0 kdy0Var, onm onmVar) {
        super(onmVar);
        this.f = kdy0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object objI = this.f.i((ResolveIntentRequest) null, (String) null, (q1m) null, this);
        return objI == d9n.a ? objI : new e331(objI);
    }
}
