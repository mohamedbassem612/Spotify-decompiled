package p;

import com.spotify.browse.clientnative.mobius.BrowseState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r6c extends hab0 implements vu30 {
    public final /* synthetic */ BrowseState.Content a;
    public final /* synthetic */ p1d0 b;
    public final /* synthetic */ rnc0 c;
    public final /* synthetic */ xpw d;
    public final /* synthetic */ g9c e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6c(BrowseState.Content content, p1d0 p1d0Var, rnc0 rnc0Var, xpw xpwVar, g9c g9cVar, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = content;
        this.b = p1d0Var;
        this.c = rnc0Var;
        this.d = xpwVar;
        this.e = g9cVar;
        this.f = qim0Var;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(32769);
        s6c.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
        return rih1.a;
    }
}
