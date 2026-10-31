package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xa6 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ ya6 b;
    public final /* synthetic */ ab6 c;
    public final /* synthetic */ double d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa6(ya6 ya6Var, ab6 ab6Var, double d, lnm lnmVar) {
        super(2, lnmVar);
        this.b = ya6Var;
        this.c = ab6Var;
        this.d = d;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new xa6(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        ya6 ya6Var = this.b;
        String str = ya6Var.a;
        boolean z = this.a;
        try {
            if (!z) {
                hm5.M(obj);
                itz itzVar = ya6Var.b;
                String str2 = this.c.b;
                double d = this.d;
                this.a = true;
                obj = itzVar.c(str2, d, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            auk1 auk1Var = (auk1) obj;
            if (!(auk1Var instanceof ztk1)) {
                if (!(auk1Var instanceof ytk1)) {
                    throw new NoWhenBranchMatchedException();
                }
                Logger.d("GOS->Artisanal Cast member volume rejected: routeId=" + str + " reason=" + ((ytk1) auk1Var).a, new Object[0]);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, l1d.m("GOS->Artisanal Cast member volume failed: routeId=", str), new Object[0]);
        }
        return rih1.a;
    }
}
