package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fs30 extends a8d1 implements vu30 {
    public final /* synthetic */ is30 a;
    public final /* synthetic */ MessageResponseToken b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs30(is30 is30Var, MessageResponseToken messageResponseToken, lnm lnmVar) {
        super(2, lnmVar);
        this.a = is30Var;
        this.b = messageResponseToken;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new fs30(this.a, this.b, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        fs30 fs30VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        fs30VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        is30 is30Var = this.a;
        is30Var.e.a(this.b, DismissReason.MessageSwiped.INSTANCE);
        is30Var.h.a();
        return rih1.a;
    }
}
