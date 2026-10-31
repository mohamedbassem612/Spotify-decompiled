package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pe80 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ je80 b;
    public final /* synthetic */ se80 c;
    public final /* synthetic */ Consumer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe80(je80 je80Var, se80 se80Var, Consumer consumer, lnm lnmVar) {
        super(2, lnmVar);
        this.b = je80Var;
        this.c = se80Var;
        this.d = consumer;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new pe80(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            ie80 ie80Var = (ie80) this.b;
            Single singleB = pd80.b(this.c.b, ie80Var.a, ie80Var.b, ie80Var.c, 8);
            this.a = true;
            obj = fc11.j(singleB, this);
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
        Object obj2 = ((e331) obj).a;
        this.d.accept(new ke80(e331.a(obj2) == null ? new be80(((MessageResponse.Success) obj2).getToken()) : ce80.c));
        return rih1.a;
    }
}
