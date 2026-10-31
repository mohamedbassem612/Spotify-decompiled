package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h9j0 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ MessageText b;
    public final /* synthetic */ MessageTemplate c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ djc0 e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h9j0(MessageText messageText, MessageTemplate messageTemplate, qim0 qim0Var, djc0 djc0Var, lee1 lee1Var, int i, int i2, iu30 iu30Var, String str, int i3, int i4, byte b) {
        super(2);
        this.a = b;
        this.b = messageText;
        this.c = messageTemplate;
        this.d = qim0Var;
        this.e = djc0Var;
        this.f = lee1Var;
        this.g = i;
        this.h = i2;
        this.i = iu30Var;
        this.t = str;
        this.X = i3;
        this.Y = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.X;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.Y;
                y9j0.b(this.g, this.h, iP, s, this.c, this.b, this.t, (b0k) obj, this.i, this.e, this.d, this.f);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.Y;
                y9j0.b(this.g, this.h, iP2, s2, this.c, this.b, this.t, (b0k) obj, this.i, this.e, this.d, this.f);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                short s3 = this.Y;
                y9j0.i(this.g, this.h, iP3, s3, this.c, this.b, this.t, (b0k) obj, this.i, this.e, this.d, this.f);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                short s4 = this.Y;
                y9j0.i(this.g, this.h, iP4, s4, this.c, this.b, this.t, (b0k) obj, this.i, this.e, this.d, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h9j0(MessageText messageText, MessageTemplate messageTemplate, qim0 qim0Var, lee1 lee1Var, djc0 djc0Var, int i, int i2, String str, iu30 iu30Var, int i3, int i4, byte b) {
        super(2);
        this.a = b;
        this.b = messageText;
        this.c = messageTemplate;
        this.d = qim0Var;
        this.f = lee1Var;
        this.e = djc0Var;
        this.g = i;
        this.h = i2;
        this.t = str;
        this.i = iu30Var;
        this.X = i3;
        this.Y = i4;
    }
}
