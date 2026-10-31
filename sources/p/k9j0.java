package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k9j0 extends hab0 implements vu30 {
    public final /* synthetic */ String X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ short Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Disclaimer b;
    public final /* synthetic */ MessageTemplate c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ lee1 e;
    public final /* synthetic */ djc0 f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ int h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k9j0(Disclaimer disclaimer, MessageTemplate messageTemplate, qim0 qim0Var, lee1 lee1Var, djc0 djc0Var, int i, int i2, iu30 iu30Var, Function0 function0, String str, int i3, int i4, byte b) {
        super(2);
        this.a = b;
        this.b = disclaimer;
        this.c = messageTemplate;
        this.d = qim0Var;
        this.e = lee1Var;
        this.f = djc0Var;
        this.g = i;
        this.h = i2;
        this.i = iu30Var;
        this.t = function0;
        this.X = str;
        this.Y = i3;
        this.Z = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.Y;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.Z;
                y9j0.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.Z;
                y9j0.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP2, s2);
                break;
        }
        return rih1Var;
    }
}
