package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ila extends a8d1 implements vu30 {
    public Object a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ SceneTemplate.BespokeListeningAgeContent.Card2 d;
    public final /* synthetic */ qla e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ila(SceneTemplate.BespokeListeningAgeContent.Card2 card2, qla qlaVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = card2;
        this.e = qlaVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ila ilaVar = new ila(this.d, this.e, lnmVar);
        ilaVar.c = obj;
        return ilaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ni31 ni31Var = (ni31) this.c;
        byte b = this.b;
        qla qlaVar = this.e;
        SceneTemplate.BespokeListeningAgeContent.Card2 card2 = this.d;
        Serializable serializable = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.a;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        RiveAnimation riveAnimationS = card2.r().s();
        ti31 ti31Var = qlaVar.c;
        kj31 kj31Var = qlaVar.d;
        this.c = ni31Var;
        this.b = (byte) 1;
        obj = mym.m(riveAnimationS, ti31Var, kj31Var, ni31Var, this);
        if (obj != serializable) {
        }
        return serializable;
        RiveAnimation riveAnimationS2 = card2.r().s();
        cxc cxcVar = qlaVar.e;
        this.c = null;
        this.a = obj;
        this.b = (byte) 2;
        Serializable serializableN = mym.n(riveAnimationS2, cxcVar, ni31Var, this);
        if (serializableN != serializable) {
            Object obj3 = obj;
            obj = serializableN;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return serializable;
    }
}
