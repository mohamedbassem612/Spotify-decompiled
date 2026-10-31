package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sz80 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zq51 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz80(lnm lnmVar, zq51 zq51Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = zq51Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zq51 zq51Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                sz80 sz80Var = new sz80(lnmVar, zq51Var, (byte) 0);
                sz80Var.c = vr20Var;
                sz80Var.d = obj2;
                return sz80Var.invokeSuspend(rih1Var);
            default:
                sz80 sz80Var2 = new sz80(lnmVar, zq51Var, (byte) 1);
                sz80Var2.c = vr20Var;
                sz80Var2.d = obj2;
                return sz80Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        kx80 huzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cr51 cr51Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kl81[] kl81VarArr = (kl81[]) obj2;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedE = cr51Var.e((kl81[]) Arrays.copyOf(kl81VarArr, kl81VarArr.length));
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowableDistinctUntilChangedE);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var, kgeVar, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                PlayerState playerState = (PlayerState) obj3;
                playerState.getClass();
                if (o4p1.t(playerState)) {
                    FlowableDistinctUntilChanged flowableDistinctUntilChangedE2 = cr51Var.e(new kl81[]{al81.a});
                    vbm[] vbmVarArr2 = q601.a;
                    huzVar = new kx80(new kge(flowableDistinctUntilChangedE2), playerState, (byte) 1);
                } else {
                    huzVar = new huz(Boolean.TRUE, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
