package p;

import com.spotify.browse.clientnative.mobius.BrowseState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m6c extends hab0 implements vu30 {
    public final /* synthetic */ BrowseState.Content a;
    public final /* synthetic */ a8c b;
    public final /* synthetic */ xpw c;
    public final /* synthetic */ j3f1 d;
    public final /* synthetic */ g9c e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6c(BrowseState.Content content, a8c a8cVar, xpw xpwVar, j3f1 j3f1Var, g9c g9cVar, qim0 qim0Var, int i) {
        super(2);
        this.a = content;
        this.b = a8cVar;
        this.c = xpwVar;
        this.d = j3f1Var;
        this.e = g9cVar;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(32769);
        o6c.a(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
        return rih1.a;
    }
}
