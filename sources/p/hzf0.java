package p;

import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzf0 extends hab0 implements vu30 {
    public final /* synthetic */ MainLayoutContentContainerView a;
    public final /* synthetic */ gzf0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xpw d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ char f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hzf0(MainLayoutContentContainerView mainLayoutContentContainerView, gzf0 gzf0Var, String str, xpw xpwVar, Object obj, int i) {
        super(2);
        this.a = mainLayoutContentContainerView;
        this.b = gzf0Var;
        this.c = str;
        this.d = xpwVar;
        this.e = obj;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        int iP = czo1.p(this.f | 1);
        int i = MainLayoutContentContainerView.W0;
        this.a.A(this.b, this.c, this.d, this.e, b0kVar, iP);
        return rih1.a;
    }
}
