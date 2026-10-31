package p;

import com.spotify.player.model.PlayerState;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g64 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ kl1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g64(lnm lnmVar, kl1 kl1Var, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = kl1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kl1 kl1Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                g64 g64Var = new g64(lnmVar, kl1Var, (byte) 0);
                g64Var.c = vr20Var;
                g64Var.d = obj2;
                return g64Var.invokeSuspend(rih1Var);
            default:
                g64 g64Var2 = new g64(lnmVar, kl1Var, (byte) 1);
                g64Var2.c = vr20Var;
                g64Var2.d = obj2;
                return g64Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kl1 kl1Var = this.e;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    String str = (String) obj2;
                    Set set = s4b1.f;
                    String strZ = uic.v("podcast-chapters", str).z();
                    if (strZ != null) {
                        mr20 mr20VarU = rqt0.u(new x010(hu20.e(kl1Var.w(w3p1.o(new l4r(hvm.c, 1, dt3.S0, new j4r(dt3.U0), dt3.T0), dt3.V0), strZ), new qd0((byte) 1, kl1Var, str, (lnm) null)), hu20.e((mr20) kl1Var.c, new g64(lnmVar, kl1Var, b2)), new l2(3, (lnm) null, (byte) 7), (byte) 1));
                        this.c = null;
                        this.d = null;
                        this.b = true;
                        return l4p1.s(vr20Var, mr20VarU, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    hhg1.n("Invalid episode URI: ".concat(str));
                } else {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
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
                nx2 nx2Var = new nx2(kl1Var, playerState, (byte) 10);
                m441 huzVar = (!playerState.isPlaying() || playerState.isPaused()) ? new huz(nx2Var.invoke(), (byte) 10) : new m441(new wt(nx2Var, (lnm) null, (byte) 7));
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
