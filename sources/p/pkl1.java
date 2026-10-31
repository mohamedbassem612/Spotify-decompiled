package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pkl1 extends a8d1 implements vu30 {
    public final /* synthetic */ skl1 a;
    public final /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkl1(skl1 skl1Var, Throwable th, lnm lnmVar) {
        super(2, lnmVar);
        this.a = skl1Var;
        this.b = th;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new pkl1(this.a, this.b, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        pkl1 pkl1VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        pkl1VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        skl1 skl1Var = this.a;
        y4q0 y4q0Var = skl1Var.c;
        dll1 dll1Var = skl1Var.b;
        y4q0Var.a(yhm0.p(dll1Var.a.getMessageRequest(), dll1Var.a.getRequestId()), dll1Var.a.getMessageData(), new DiscardReason$PresentationFailed(l1d.m("Unable to create Element for WebviewTemplate: ", this.b.getMessage())));
        skl1Var.d.a();
        return rih1.a;
    }
}
