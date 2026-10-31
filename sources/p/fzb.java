package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fzb extends a8d1 implements vu30 {
    public final /* synthetic */ izb a;
    public final /* synthetic */ i0c b;
    public final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzb(izb izbVar, i0c i0cVar, Throwable th, lnm lnmVar) {
        super(2, lnmVar);
        this.a = izbVar;
        this.b = i0cVar;
        this.c = th;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new fzb(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        fzb fzbVarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        fzbVarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        this.a.a(this.b.a, new DiscardReason$PresentationFailed(l1d.m("Unable to create Element for BottomSheetTemplate: ", this.c.getMessage())));
        return rih1.a;
    }
}
