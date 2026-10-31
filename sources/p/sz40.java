package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus$Dismissed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sz40 extends a8d1 implements vu30 {
    public final /* synthetic */ MessagePresentationStatus$Dismissed a;
    public final /* synthetic */ wz40 b;
    public final /* synthetic */ slc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz40(MessagePresentationStatus$Dismissed messagePresentationStatus$Dismissed, wz40 wz40Var, slc0 slc0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = messagePresentationStatus$Dismissed;
        this.b = wz40Var;
        this.c = slc0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new sz40(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        sz40 sz40VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        sz40VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        wz40 wz40Var = this.b;
        ynb0 ynb0Var = wz40Var.d;
        hm5.M(obj);
        DismissReason dismissReason = this.a.getDismissReason();
        if ((dismissReason instanceof DismissReason.MessageButtonTapped) && u890.j(((DismissReason.MessageButtonTapped) dismissReason).getButton().getIdentifier(), "link_account")) {
            z0s0 z0s0Var = (z0s0) ynb0Var.get();
            slc0 slc0Var = this.c;
            z0s0Var.a(slc0Var);
            ((j0s) wz40Var.e.get()).a(slc0Var);
        } else {
            ((z0s0) ynb0Var.get()).b();
        }
        return rih1.a;
    }
}
