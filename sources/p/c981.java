package p;

import com.spotify.profileprivacy.proto.v1.SetProfilePrivacyRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c981 extends onm {
    public boolean a;
    public fdx0 b;
    public SetProfilePrivacyRequest.Builder c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d981 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c981(d981 d981Var, onm onmVar) {
        super(onmVar);
        this.e = d981Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(false, this);
    }
}
