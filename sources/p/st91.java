package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$PresentationFailed;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class st91 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ tt91 b;
    public final /* synthetic */ mmr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st91(tt91 tt91Var, mmr0 mmr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = tt91Var;
        this.c = mmr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        st91 st91Var = new st91(this.b, this.c, lnmVar);
        st91Var.a = obj;
        return st91Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        st91 st91VarCreate = create((wox0) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        st91VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        tt91 tt91Var = this.b;
        a5q0 a5q0Var = tt91Var.d;
        wox0 wox0Var = (wox0) this.a;
        hm5.M(obj);
        int iOrdinal = wox0Var.ordinal();
        mmr0 mmr0Var = this.c;
        switch (iOrdinal) {
            case 0:
                break;
            case 1:
                bpb1 bpb1Var = tt91Var.f78p;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                break;
            case 2:
                a5q0Var.a((MessageResponseToken) mmr0Var.a, DismissReason.AutoDismissingMessageTimerElapsed.INSTANCE);
                tt91Var.d();
                break;
            case 3:
                a5q0Var.a((MessageResponseToken) mmr0Var.a, DismissReason.ContextChanged.INSTANCE);
                tt91Var.d();
                break;
            case 4:
                a5q0Var.a((MessageResponseToken) mmr0Var.a, DismissReason.SurfaceOvertakenOrBackgrounded.INSTANCE);
                tt91Var.d();
                break;
            case 5:
                a5q0Var.a((MessageResponseToken) mmr0Var.a, DismissReason.MessageSwiped.INSTANCE);
                tt91Var.d();
                break;
            case 6:
                y4q0 y4q0Var = tt91Var.f;
                Object obj2 = mmr0Var.a;
                Object obj3 = mmr0Var.a;
                y4q0Var.a(yhm0.p(((MessageResponseToken) obj2).getMessageRequest(), ((MessageResponseToken) obj3).getRequestId()), ((MessageResponseToken) obj3).getMessageData(), new DiscardReason$PresentationFailed("PromobarManager could not present promobar"));
                tt91Var.d();
                break;
            default:
                eg.o();
                return null;
        }
        return rih1.a;
    }
}
