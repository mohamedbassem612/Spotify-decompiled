package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kyg1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public Object b;
    public byte c;
    public /* synthetic */ Object d;
    public final /* synthetic */ SceneTemplate.WrappedTwinContent.SearchingCard e;
    public final /* synthetic */ vh6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyg1(SceneTemplate.WrappedTwinContent.SearchingCard searchingCard, vh6 vh6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = searchingCard;
        this.f = vh6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vh6 vh6Var = this.f;
        SceneTemplate.WrappedTwinContent.SearchingCard searchingCard = this.e;
        switch (b) {
            case 0:
                kyg1 kyg1Var = new kyg1(searchingCard, vh6Var, lnmVar, (byte) 0);
                kyg1Var.d = obj;
                return kyg1Var;
            default:
                kyg1 kyg1Var2 = new kyg1(searchingCard, vh6Var, lnmVar, (byte) 1);
                kyg1Var2.d = obj;
                return kyg1Var2;
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
        SceneTemplate.WrappedTwinContent.SearchingCard searchingCard = this.e;
        vh6 vh6Var = this.f;
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
                RiveAnimation riveAnimationP = searchingCard.p();
                ti31 ti31Var = vh6Var.f;
                kj31 kj31Var = vh6Var.g;
                this.d = ni31Var;
                this.c = (byte) 1;
                obj = mym.m(riveAnimationP, ti31Var, kj31Var, ni31Var, this);
                if (obj == serializable) {
                    return serializable;
                }
                RiveAnimation riveAnimationP2 = searchingCard.p();
                cxc cxcVar = vh6Var.e;
                this.d = null;
                this.b = obj;
                this.c = (byte) 2;
                Serializable serializableN = mym.n(riveAnimationP2, cxcVar, ni31Var, this);
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
                RiveAnimation riveAnimationN = searchingCard.n();
                ti31 ti31Var2 = vh6Var.f;
                kj31 kj31Var2 = vh6Var.g;
                this.d = ni31Var2;
                this.c = (byte) 1;
                obj = mym.m(riveAnimationN, ti31Var2, kj31Var2, ni31Var2, this);
                if (obj == serializable) {
                    return serializable;
                }
                RiveAnimation riveAnimationN2 = searchingCard.n();
                cxc cxcVar2 = vh6Var.e;
                this.d = null;
                this.b = obj;
                this.c = (byte) 2;
                Serializable serializableN2 = mym.n(riveAnimationN2, cxcVar2, ni31Var2, this);
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
