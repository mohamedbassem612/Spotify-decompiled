package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qem0 extends a8d1 implements vu30 {
    public final /* synthetic */ uem0 a;
    public final /* synthetic */ MessageResponseToken b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qem0(uem0 uem0Var, MessageResponseToken messageResponseToken, lnm lnmVar) {
        super(2, lnmVar);
        this.a = uem0Var;
        this.b = messageResponseToken;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new qem0(this.a, this.b, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        qem0 qem0VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        qem0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        uem0 uem0Var = this.a;
        uem0Var.e.a(this.b, DismissReason.FooterTapped.INSTANCE);
        uem0Var.h.a();
        return rih1.a;
    }
}
