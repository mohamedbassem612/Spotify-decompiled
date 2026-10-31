package p;

import com.spotify.wrapped.v1.proto.Image;
import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bb90 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ SceneTemplate.IntroTrackContent.Card1 c;
    public final /* synthetic */ hb90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb90(SceneTemplate.IntroTrackContent.Card1 card1, hb90 hb90Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = card1;
        this.d = hb90Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        hb90 hb90Var = this.d;
        SceneTemplate.IntroTrackContent.Card1 card1 = this.c;
        switch (b) {
            case 0:
                return new bb90(card1, hb90Var, lnmVar, (byte) 0);
            case 1:
                return new bb90(card1, hb90Var, lnmVar, (byte) 1);
            default:
                return new bb90(card1, hb90Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        hb90 hb90Var = this.d;
        SceneTemplate.IntroTrackContent.Card1 card1 = this.c;
        u3k u3kVar = u3k.a;
        d9n d9nVar = d9n.a;
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
                Image imageN = card1.n();
                gw70 gw70Var = hb90Var.a;
                this.b = true;
                Object objK = u3kVar.k(imageN, gw70Var, this);
                return objK == d9nVar ? d9nVar : objK;
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
                String strO = card1.o().o();
                gw70 gw70Var2 = hb90Var.a;
                this.b = true;
                Object objG = u3kVar.g(strO, gw70Var2, false, this);
                return objG == d9nVar ? d9nVar : objG;
            default:
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
                String url = card1.n().getUrl();
                gw70 gw70Var3 = hb90Var.a;
                this.b = true;
                Object objG2 = u3kVar.g(url, gw70Var3, false, this);
                return objG2 == d9nVar ? d9nVar : objG2;
        }
    }
}
