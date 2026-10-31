package p;

import app.rive.ImageAsset;
import app.rive.ViewModelInstance;
import com.spotify.wrapped.v1.proto.ClassicContent;
import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dfw0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfw0(String str, kkz0 kkz0Var, rk41 rk41Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = str;
        this.c = kkz0Var;
        this.d = rk41Var;
        this.e = ven0Var;
        this.f = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                dfw0 dfw0Var = new dfw0((sbw0) obj5, (gfw0) obj4, (String) obj2, (r091) obj3, lnmVar);
                dfw0Var.c = obj;
                return dfw0Var;
            case 1:
                return new dfw0((String) obj2, (kkz0) this.c, (rk41) obj5, (ven0) obj4, (ven0) obj3, lnmVar);
            case 2:
                return new dfw0((ViewModelInstance) this.c, (ik31) obj5, (ImageAsset) obj4, (jk31) obj2, (ven0) obj3, lnmVar);
            default:
                dfw0 dfw0Var2 = new dfw0((p811) obj5, (vi11) obj4, (p811) obj3, (String) obj2, lnmVar);
                dfw0Var2.c = obj;
                return dfw0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    public final Object invokeSuspend(Object obj) {
        StoryCard storyCard;
        ClassicContent classicContentR;
        ClassicContent classicContentR2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        Object obj2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                r091 r091Var = (r091) obj3;
                gfw0 gfw0Var = (gfw0) obj4;
                q8n q8nVar = gfw0Var.e;
                c9n c9nVar = (c9n) this.c;
                hm5.M(obj);
                boolean z2 = ((sbw0) obj5).f;
                String str = (String) obj2;
                if (z2) {
                    c6h0 c6h0Var = new c6h0(gfw0Var, str, r091Var, (lnm) null, (byte) 12);
                    gfw0Var = gfw0Var;
                    r091Var = r091Var;
                    str = str;
                    fn31.T(c9nVar, q8nVar, 0, c6h0Var, 2);
                }
                return fn31.T(c9nVar, q8nVar, 0, new glu0((Object) r091Var, (Object) gfw0Var, str, (lnm) null, (byte) 10), 2);
            case 1:
                Object obj6 = ((rk41) obj5).c;
                ven0 ven0Var = (ven0) obj4;
                ven0 ven0Var2 = (ven0) obj3;
                hm5.M(obj);
                if (((String) obj2) == null) {
                    storyCard = ((wgm1) ven0Var.getValue()).a;
                    if (storyCard != null && (classicContentR = storyCard.r()) != null && classicContentR.G()) {
                        z = true;
                    }
                    if (z) {
                        ((xgm1) obj6).a(new lgm1(((rhz0) ven0Var2.getValue()).j.a, ((rhz0) ven0Var2.getValue()).j.b, (sju) null));
                    }
                } else {
                    StoryCard storyCard2 = ((wgm1) ven0Var.getValue()).a;
                    if ((storyCard2 == null || (classicContentR2 = storyCard2.r()) == null || !classicContentR2.G()) ? false : true) {
                        ((xgm1) obj6).a(new lgm1(((rhz0) ven0Var2.getValue()).i.a, ((rhz0) ven0Var2.getValue()).i.b, (sju) null));
                    } else {
                        storyCard = ((wgm1) ven0Var.getValue()).a;
                        if (storyCard != null) {
                            z = true;
                        }
                        if (z) {
                            ((xgm1) obj6).a(new lgm1(((rhz0) ven0Var2.getValue()).j.a, ((rhz0) ven0Var2.getValue()).j.b, (sju) null));
                        }
                    }
                }
                return rih1Var;
            case 2:
                hm5.M(obj);
                try {
                    ((ViewModelInstance) this.c).setImage(((ik31) obj5).a, (ImageAsset) obj4);
                    ((ven0) obj3).setValue(Boolean.TRUE);
                    break;
                } catch (Exception e) {
                    ok31.f(e, xi31.e, (jk31) obj2);
                }
                return rih1Var;
            default:
                c9n c9nVar2 = (c9n) this.c;
                hm5.M(obj);
                vi11 vi11Var = (vi11) obj4;
                fn31.T(c9nVar2, (o8n) null, 0, new nsf1((p811) obj5, vi11Var, (lnm) null, (byte) 19), 3);
                return fn31.T(c9nVar2, (o8n) null, 0, new nsf1((p811) obj3, vi11Var, (String) obj2, (lnm) null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfw0(ViewModelInstance viewModelInstance, ik31 ik31Var, ImageAsset imageAsset, jk31 jk31Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = viewModelInstance;
        this.d = ik31Var;
        this.e = imageAsset;
        this.b = jk31Var;
        this.f = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfw0(sbw0 sbw0Var, gfw0 gfw0Var, String str, r091 r091Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = sbw0Var;
        this.e = gfw0Var;
        this.b = str;
        this.f = r091Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfw0(p811 p811Var, vi11 vi11Var, p811 p811Var2, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.d = p811Var;
        this.e = vi11Var;
        this.f = p811Var2;
        this.b = str;
    }
}
