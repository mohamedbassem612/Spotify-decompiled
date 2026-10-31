package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rh6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ g7m1 c;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.Card2 d;
    public final /* synthetic */ vh6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh6(SceneTemplate.ArtistCardsContent.Card2 card2, vh6 vh6Var, g7m1 g7m1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = card2;
        this.e = vh6Var;
        this.c = g7m1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new rh6(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new rh6(this.c, this.d, this.e, lnmVar, (byte) 1);
            case 2:
                return new rh6(this.c, this.d, this.e, lnmVar, (byte) 2);
            case 3:
                return new rh6(this.d, this.e, this.c, lnmVar, (byte) 3);
            case 4:
                return new rh6(this.d, this.e, this.c, lnmVar, (byte) 4);
            default:
                return new rh6(this.d, this.e, this.c, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        g7m1 g7m1Var = this.c;
        vh6 vh6Var = this.e;
        d9n d9nVar = d9n.a;
        SceneTemplate.ArtistCardsContent.Card2 card2 = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar = g7m1Var.b;
                qh6 qh6Var = new qh6(card2, vh6Var, null, (byte) 0);
                this.b = true;
                Object objE = bjuVar.e("border", qh6Var, this);
                return objE == d9nVar ? d9nVar : objE;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar2 = g7m1Var.b;
                qh6 qh6Var2 = new qh6(card2, vh6Var, null, (byte) 1);
                this.b = true;
                Object objE2 = bjuVar2.e("wrapped_logo", qh6Var2, this);
                return objE2 == d9nVar ? d9nVar : objE2;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar3 = g7m1Var.b;
                qh6 qh6Var3 = new qh6(card2, vh6Var, null, (byte) 2);
                this.b = true;
                Object objE3 = bjuVar3.e("artist_cards_noise", qh6Var3, this);
                return objE3 == d9nVar ? d9nVar : objE3;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return (yj41) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                h290 h290VarN = card2.n();
                if (!h290VarN.isEmpty()) {
                    Iterator it = h290VarN.iterator();
                    while (it.hasNext()) {
                        if (((SceneTemplate.ArtistCardsContent.TradingCard) it.next()).C()) {
                            if (card2.M() && card2.E().getUrl().length() > 0) {
                                Image imageE = card2.E();
                                gw70 gw70Var = (gw70) vh6Var.d;
                                bju bjuVar4 = g7m1Var.b;
                                this.b = true;
                                obj = u3k.a.l(imageE, gw70Var, bjuVar4, "artist_cards_sparkle", this);
                                if (obj == d9nVar) {
                                    return d9nVar;
                                }
                                return (yj41) obj;
                            }
                        }
                    }
                }
                return null;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return (yj41) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (card2.J()) {
                    Image imageA = card2.A();
                    gw70 gw70Var2 = (gw70) vh6Var.d;
                    bju bjuVar5 = g7m1Var.b;
                    this.b = true;
                    obj = u3k.a.l(imageA, gw70Var2, bjuVar5, "pack_opening_light", this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    return (yj41) obj;
                }
                return null;
            default:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                SceneTemplate.ArtistCardsContent.Wrapper wrapperB = card2.B();
                Image imageH = card2.H();
                gw70 gw70Var3 = (gw70) vh6Var.d;
                bju bjuVar6 = g7m1Var.b;
                this.b = true;
                Object objS = smo1.s(new czq0(wrapperB, bjuVar6, gw70Var3, imageH, null), this);
                return objS == d9nVar ? d9nVar : objS;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh6(g7m1 g7m1Var, SceneTemplate.ArtistCardsContent.Card2 card2, vh6 vh6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g7m1Var;
        this.d = card2;
        this.e = vh6Var;
    }
}
