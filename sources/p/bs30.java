package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bs30 extends a8d1 implements vu30 {
    public final /* synthetic */ gs30 a;
    public final /* synthetic */ is30 b;
    public final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs30(gs30 gs30Var, is30 is30Var, Throwable th, lnm lnmVar) {
        super(2, lnmVar);
        this.a = gs30Var;
        this.b = is30Var;
        this.c = th;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new bs30(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        bs30 bs30VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        bs30VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        this.a.a(this.b.b.a, new DiscardReason$PresentationFailed(l1d.m("Unable to create Element for FullscreenTemplate: ", this.c.getMessage())));
        return rih1.a;
    }
}
