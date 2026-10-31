package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mem0 extends a8d1 implements vu30 {
    public final /* synthetic */ sem0 a;
    public final /* synthetic */ uem0 b;
    public final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mem0(sem0 sem0Var, uem0 uem0Var, Throwable th, lnm lnmVar) {
        super(2, lnmVar);
        this.a = sem0Var;
        this.b = uem0Var;
        this.c = th;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new mem0(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        mem0 mem0VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        mem0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        this.a.a(this.b.b.a, new DiscardReason$PresentationFailed(l1d.m("Unable to create Element for ModalTemplate: ", this.c.getMessage())));
        return rih1.a;
    }
}
