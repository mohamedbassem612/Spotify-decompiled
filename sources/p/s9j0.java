package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s9j0 extends hab0 implements vu30 {
    public final /* synthetic */ short X;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Signifier b;
    public final /* synthetic */ MessageTemplate c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;
    public final /* synthetic */ djc0 h;
    public final /* synthetic */ lee1 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s9j0(Signifier signifier, MessageTemplate messageTemplate, qim0 qim0Var, int i, float f, long j, djc0 djc0Var, lee1 lee1Var, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = signifier;
        this.c = messageTemplate;
        this.d = qim0Var;
        this.e = i;
        this.f = f;
        this.g = j;
        this.h = djc0Var;
        this.i = lee1Var;
        this.t = i2;
        this.X = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.X;
                y9j0.o(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.X;
                y9j0.o(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP2, s2);
                break;
        }
        return rih1Var;
    }
}
