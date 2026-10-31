package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i9j0 extends hab0 implements vu30 {
    public final /* synthetic */ String X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MessageTemplate c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ djc0 g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ int i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i9j0(String str, MessageTemplate messageTemplate, qim0 qim0Var, long j, lee1 lee1Var, djc0 djc0Var, int i, int i2, String str2, iu30 iu30Var, int i3, int i4, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = messageTemplate;
        this.d = qim0Var;
        this.e = j;
        this.f = lee1Var;
        this.g = djc0Var;
        this.h = i;
        this.i = i2;
        this.X = str2;
        this.t = iu30Var;
        this.Y = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                short s = this.Y;
                y9j0.c(this.h, this.i, iP, s, this.e, this.c, this.b, this.X, (b0k) obj, this.t, this.g, this.d, this.f);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                short s2 = this.Y;
                y9j0.c(this.h, this.i, iP2, s2, this.e, this.c, this.b, this.X, (b0k) obj, this.t, this.g, this.d, this.f);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                short s3 = this.Y;
                y9j0.j(this.h, this.i, iP3, s3, this.e, this.c, this.b, this.X, (b0k) obj, this.t, this.g, this.d, this.f);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(1);
                short s4 = this.Y;
                y9j0.j(this.h, this.i, iP4, s4, this.e, this.c, this.b, this.X, (b0k) obj, this.t, this.g, this.d, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i9j0(String str, MessageTemplate messageTemplate, qim0 qim0Var, long j, lee1 lee1Var, djc0 djc0Var, int i, int i2, iu30 iu30Var, String str2, int i3, int i4, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = messageTemplate;
        this.d = qim0Var;
        this.e = j;
        this.f = lee1Var;
        this.g = djc0Var;
        this.h = i;
        this.i = i2;
        this.t = iu30Var;
        this.X = str2;
        this.Y = i4;
    }
}
