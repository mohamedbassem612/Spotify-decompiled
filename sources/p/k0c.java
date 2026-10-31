package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$ConflictingMessagePresenting;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k0c extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ l0c b;
    public final /* synthetic */ long c;
    public final /* synthetic */ tv80 d;
    public final /* synthetic */ c3j0 e;
    public final /* synthetic */ y2j0 f;
    public final /* synthetic */ MessageResponseToken g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0c(l0c l0cVar, long j, tv80 tv80Var, c3j0 c3j0Var, y2j0 y2j0Var, MessageResponseToken messageResponseToken, lnm lnmVar) {
        super(2, lnmVar);
        this.b = l0cVar;
        this.c = j;
        this.d = tv80Var;
        this.e = c3j0Var;
        this.f = y2j0Var;
        this.g = messageResponseToken;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new k0c(this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        l0c l0cVar = this.b;
        MessageResponseToken messageResponseToken = this.g;
        if (!z) {
            hm5.M(obj);
            ldj0 ldj0Var = l0cVar.b;
            String strL = l1d.l(this.c, "spotify:messaging:bottomsheet:");
            Bundle bundle = new Bundle();
            bundle.putParcelable("token", messageResponseToken);
            kdj0 kdj0Var = new kdj0(2, this.e, this.f);
            this.a = true;
            obj = ldj0Var.c(strL, this.d, bundle, kdj0Var, this);
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
        if (!((Boolean) obj).booleanValue()) {
            l0cVar.c.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), new DiscardReason$ConflictingMessagePresenting("Orchestrator denied"));
        }
        return rih1.a;
    }
}
