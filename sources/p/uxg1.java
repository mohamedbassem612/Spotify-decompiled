package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate$WrappedTwinContent$GiftCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uxg1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ g7m1 c;
    public final /* synthetic */ SceneTemplate$WrappedTwinContent$GiftCard d;
    public final /* synthetic */ vh6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg1(SceneTemplate$WrappedTwinContent$GiftCard sceneTemplate$WrappedTwinContent$GiftCard, g7m1 g7m1Var, vh6 vh6Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = sceneTemplate$WrappedTwinContent$GiftCard;
        this.c = g7m1Var;
        this.e = vh6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vh6 vh6Var = this.e;
        SceneTemplate$WrappedTwinContent$GiftCard sceneTemplate$WrappedTwinContent$GiftCard = this.d;
        g7m1 g7m1Var = this.c;
        switch (b) {
            case 0:
                return new uxg1(sceneTemplate$WrappedTwinContent$GiftCard, g7m1Var, vh6Var, lnmVar);
            default:
                return new uxg1(g7m1Var, sceneTemplate$WrappedTwinContent$GiftCard, vh6Var, lnmVar);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        vh6 vh6Var = this.e;
        SceneTemplate$WrappedTwinContent$GiftCard sceneTemplate$WrappedTwinContent$GiftCard = this.d;
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
                RiveAnimation riveAnimationN = sceneTemplate$WrappedTwinContent$GiftCard.n();
                ti31 ti31Var = vh6Var.f;
                kj31 kj31Var = vh6Var.g;
                cxc cxcVar = vh6Var.e;
                this.b = true;
                Object objD = u3k.d(riveAnimationN, this.c, ti31Var, kj31Var, cxcVar, null, null, this, 224);
                return objD == d9nVar ? d9nVar : objD;
            default:
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
                bju bjuVar = this.c.b;
                ob01 ob01Var = new ob01(sceneTemplate$WrappedTwinContent$GiftCard, vh6Var, (lnm) null, (byte) 22);
                this.b = true;
                Object objE = bjuVar.e("twinGift", ob01Var, this);
                return objE == d9nVar ? d9nVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxg1(g7m1 g7m1Var, SceneTemplate$WrappedTwinContent$GiftCard sceneTemplate$WrappedTwinContent$GiftCard, vh6 vh6Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = g7m1Var;
        this.d = sceneTemplate$WrappedTwinContent$GiftCard;
        this.e = vh6Var;
    }
}
