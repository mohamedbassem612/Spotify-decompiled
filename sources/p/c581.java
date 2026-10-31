package p;

import com.spotify.profileprivacy.proto.v1.GetProfilePrivacyRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c581 extends onm {
    public fdx0 a;
    public GetProfilePrivacyRequest.Builder b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e581 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c581(e581 e581Var, onm onmVar) {
        super(onmVar);
        this.d = e581Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
