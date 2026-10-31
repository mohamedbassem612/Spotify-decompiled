package p;

import com.spotify.home.evopage.mobius.Effect;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rth1 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ tth1 b;
    public final /* synthetic */ Effect.UpdateOnDemandSet c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rth1(tth1 tth1Var, Effect.UpdateOnDemandSet updateOnDemandSet, lnm lnmVar) {
        super(2, lnmVar);
        this.b = tth1Var;
        this.c = updateOnDemandSet;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new rth1(this.b, this.c, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((rth1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            k3q0 k3q0Var = this.b.a;
            Set<String> onDemandSet = this.c.getOnDemandSet();
            this.a = true;
            Object objA = k3q0Var.a(onDemandSet, this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
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
