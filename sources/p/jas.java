package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jas extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nas b;
    public final /* synthetic */ MessageResponseToken c;
    public final /* synthetic */ cdj0 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jas(nas nasVar, MessageResponseToken messageResponseToken, cdj0 cdj0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = nasVar;
        this.c = messageResponseToken;
        this.d = cdj0Var;
        this.e = iu30Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.a(this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.b(this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
