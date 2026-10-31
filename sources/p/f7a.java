package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f7a extends a8d1 implements iu30 {
    public final /* synthetic */ g7a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7a(g7a g7aVar, lnm lnmVar) {
        super(1, lnmVar);
        this.a = g7aVar;
    }

    public final lnm create(lnm lnmVar) {
        return new f7a(this.a, lnmVar);
    }

    public final Object invoke(Object obj) {
        f7a f7aVarCreate = create((lnm) obj);
        rih1 rih1Var = rih1.a;
        f7aVarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        MessageResponseToken messageResponseToken;
        hm5.M(obj);
        g7a g7aVar = this.a;
        mmr0 mmr0Var = g7aVar.h;
        if (mmr0Var != null && (messageResponseToken = (MessageResponseToken) mmr0Var.a) != null) {
            g7aVar.e.a(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), new DiscardReason$PresentationFailed("Banner dismissed before presentation"));
        }
        Iterator it = g7aVar.j.iterator();
        while (it.hasNext()) {
            ((faa0) it.next()).d((CancellationException) null);
        }
        return rih1.a;
    }
}
