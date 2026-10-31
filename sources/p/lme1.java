package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lme1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ SceneTemplate.TimeMachineContent.Card2 d;
    public final /* synthetic */ qme1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lme1(SceneTemplate.TimeMachineContent.Card2 card2, qme1 qme1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = card2;
        this.e = qme1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        qme1 qme1Var = this.e;
        SceneTemplate.TimeMachineContent.Card2 card2 = this.d;
        switch (b) {
            case 0:
                lme1 lme1Var = new lme1(card2, qme1Var, lnmVar, (byte) 0);
                lme1Var.c = obj;
                return lme1Var;
            default:
                lme1 lme1Var2 = new lme1(card2, qme1Var, lnmVar, (byte) 1);
                lme1Var2.c = obj;
                return lme1Var2;
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
        byte b = this.a;
        qme1 qme1Var = this.e;
        SceneTemplate.TimeMachineContent.Card2 card2 = this.d;
        Serializable serializable = d9n.a;
        switch (b) {
            case 0:
                ni31 ni31Var = (ni31) this.c;
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
                RiveAnimation riveAnimationQ = card2.q();
                ti31 ti31Var = qme1Var.d;
                kj31 kj31Var = qme1Var.e;
                this.c = null;
                this.b = true;
                Object objM = mym.m(riveAnimationQ, ti31Var, kj31Var, ni31Var, this);
                return objM == serializable ? serializable : objM;
            default:
                ni31 ni31Var2 = (ni31) this.c;
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
                RiveAnimation riveAnimationQ2 = card2.q();
                cxc cxcVar = qme1Var.c;
                this.c = null;
                this.b = true;
                Serializable serializableN = mym.n(riveAnimationQ2, cxcVar, ni31Var2, this);
                return serializableN == serializable ? serializable : serializableN;
        }
    }
}
