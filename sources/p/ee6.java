package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ee6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public Object b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ SceneTemplate.ArtistCardsContent.Card3 e;
    public final /* synthetic */ oe6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee6(SceneTemplate.ArtistCardsContent.Card3 card3, oe6 oe6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = card3;
        this.f = oe6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        oe6 oe6Var = this.f;
        SceneTemplate.ArtistCardsContent.Card3 card3 = this.e;
        switch (b) {
            case 0:
                ee6 ee6Var = new ee6(card3, oe6Var, lnmVar, (byte) 0);
                ee6Var.d = obj;
                return ee6Var;
            default:
                ee6 ee6Var2 = new ee6(card3, oe6Var, lnmVar, (byte) 1);
                ee6Var2.d = obj;
                return ee6Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ni31 ni31Var = (ni31) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(ni31Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        byte b = this.a;
        Serializable serializable = d9n.a;
        SceneTemplate.ArtistCardsContent.Card3 card3 = this.e;
        oe6 oe6Var = this.f;
        switch (b) {
            case 0:
                ni31 ni31Var = (ni31) this.d;
                byte b2 = this.c;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.b;
                        hm5.M(obj);
                    }
                    return new mmr0(obj2, obj);
                }
                hm5.M(obj);
                RiveAnimation riveAnimationY = card3.y();
                ti31 ti31Var = oe6Var.e;
                kj31 kj31Var = oe6Var.f;
                this.d = ni31Var;
                this.c = (byte) 1;
                obj = mym.m(riveAnimationY, ti31Var, kj31Var, ni31Var, this);
                if (obj == serializable) {
                    return serializable;
                }
                RiveAnimation riveAnimationY2 = card3.y();
                cxc cxcVar = oe6Var.d;
                this.d = null;
                this.b = obj;
                this.c = (byte) 2;
                Serializable serializableN = mym.n(riveAnimationY2, cxcVar, ni31Var, this);
                if (serializableN == serializable) {
                    return serializable;
                }
                Object obj4 = obj;
                obj = serializableN;
                obj2 = obj4;
                return new mmr0(obj2, obj);
            default:
                ni31 ni31Var2 = (ni31) this.d;
                byte b3 = this.c;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = this.b;
                        hm5.M(obj);
                    }
                    return new mmr0(obj3, obj);
                }
                hm5.M(obj);
                RiveAnimation riveAnimationR = card3.r();
                ti31 ti31Var2 = oe6Var.e;
                kj31 kj31Var2 = oe6Var.f;
                this.d = ni31Var2;
                this.c = (byte) 1;
                obj = mym.m(riveAnimationR, ti31Var2, kj31Var2, ni31Var2, this);
                if (obj == serializable) {
                    return serializable;
                }
                RiveAnimation riveAnimationR2 = card3.r();
                cxc cxcVar2 = oe6Var.d;
                this.d = null;
                this.b = obj;
                this.c = (byte) 2;
                Serializable serializableN2 = mym.n(riveAnimationR2, cxcVar2, ni31Var2, this);
                if (serializableN2 == serializable) {
                    return serializable;
                }
                Object obj5 = obj;
                obj = serializableN2;
                obj3 = obj5;
                return new mmr0(obj3, obj);
        }
    }
}
