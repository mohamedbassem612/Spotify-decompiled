package p;

import com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d581 extends onm {
    public boolean a;
    public fdx0 b;
    public SetProfilePrivacyRequest.Builder c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e581 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d581(e581 e581Var, onm onmVar) {
        super(onmVar);
        this.e = e581Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(false, this);
    }
}
