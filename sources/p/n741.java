package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus$Dismissed;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n741 extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ MessagePresentationStatus$Dismissed b;
    public final /* synthetic */ q741 c;
    public final /* synthetic */ slc0 d;
    public final /* synthetic */ f841 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n741(MessagePresentationStatus$Dismissed messagePresentationStatus$Dismissed, q741 q741Var, slc0 slc0Var, f841 f841Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = messagePresentationStatus$Dismissed;
        this.c = q741Var;
        this.d = slc0Var;
        this.e = f841Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new n741(this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        DismissReason dismissReason = this.b.getDismissReason();
        boolean z = dismissReason instanceof DismissReason.MessageButtonTapped;
        q741 q741Var = this.c;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (z && u890.j(((DismissReason.MessageButtonTapped) dismissReason).getButton().getIdentifier(), "link_account")) {
            this.a = (byte) 1;
            Object objS = smo1.s(new c6h0(q741Var, this.d, this.e, (lnm) null, (byte) 25), this);
            if (objS != d9nVar) {
                objS = rih1Var;
            }
            if (objS == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        this.a = (byte) 2;
        Object objS2 = smo1.s(new p2z0((Object) q741Var, lnmVar, (byte) 25), this);
        if (objS2 != d9nVar) {
            objS2 = rih1Var;
        }
        if (objS2 == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }
}
