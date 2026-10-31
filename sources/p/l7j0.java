package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l7j0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ res b;
    public final /* synthetic */ x6j0 c;
    public final /* synthetic */ Consumer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7j0(res resVar, x6j0 x6j0Var, Consumer consumer, lnm lnmVar) {
        super(2, lnmVar);
        this.b = resVar;
        this.c = x6j0Var;
        this.d = consumer;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new l7j0(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            pd80 pd80Var = (pd80) this.b.e;
            String str = ((v6j0) this.c).c;
            Single singleB = pd80.b(pd80Var, str, str, (DynamicTagsMetadata) null, 12);
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
        this.d.accept(new y6j0(e331.a(obj2) == null ? new b7j0(((MessageResponse.Success) obj2).getToken()) : c7j0.a));
        return rih1.a;
    }
}
