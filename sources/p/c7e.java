package p;

import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c7e extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ short b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c7e(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                dio1.j((t6e) obj5, (t9p) obj4, (d0r) obj3, b0kVar, czo1.p(s | 1));
                break;
            case 1:
                ((uu0) obj5).c((ne91) obj4, (cxc0) obj3, b0kVar, czo1.p(s | 1));
                break;
            case 2:
                qro1.g((b7c0) obj5, (lax) obj4, (iu30) obj3, b0kVar, czo1.p(s | 1));
                break;
            case 3:
                int iP = czo1.p(s | 1);
                int i = MainLayoutContentContainerView.W0;
                ((MainLayoutContentContainerView) obj5).B((gzf0) obj4, (bzf0) obj3, b0kVar, iP);
                break;
            default:
                oho1.m((hio0) obj5, (c380) obj4, (hcs) obj3, b0kVar, czo1.p(s | 1));
                break;
        }
        return rih1Var;
    }
}
