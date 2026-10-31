package p;

import com.spotify.hovercraftasr.v1.AsrStreamRequest;
import com.spotify.hovercraftasr.v1.c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bv81 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ev81 c;
    public final /* synthetic */ ru81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv81(ev81 ev81Var, ru81 ru81Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = ev81Var;
        this.d = ru81Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        bv81 bv81Var = new bv81(this.c, this.d, lnmVar);
        bv81Var.b = obj;
        return bv81Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        AsrStreamRequest.InteractionManagerParams interactionManagerParams;
        vr20 vr20Var = (vr20) this.b;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            ru81 ru81Var = this.d;
            if (ru81Var != null) {
                c cVarN = AsrStreamRequest.InteractionManagerParams.n();
                cVarN.s(ru81Var.a);
                cVarN.r(ru81Var.b);
                cVarN.n(ru81Var.c);
                cVarN.q(ru81Var.d);
                interactionManagerParams = (AsrStreamRequest.InteractionManagerParams) cVarN.build();
            } else {
                interactionManagerParams = null;
            }
            ev81 ev81Var = this.c;
            ev81Var.g = interactionManagerParams;
            lt20 lt20Var = new lt20(new lt20(new m441(new lm61(ev81Var, (lnm) null, (byte) 28)), new af01(ev81Var, (lnm) null, (byte) 23), (byte) 0), new sv2(3, (lnm) null, (byte) 3), (byte) 0);
            this.b = null;
            this.a = true;
            Object objS = l4p1.s(vr20Var, lt20Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
