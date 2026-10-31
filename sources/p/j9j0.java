package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j9j0 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ djc0 X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Button b;
    public final /* synthetic */ MessageTemplate c;
    public final /* synthetic */ hdx d;
    public final /* synthetic */ gdx e;
    public final /* synthetic */ vzq0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ qim0 h;
    public final /* synthetic */ byte i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j9j0(Button button, MessageTemplate messageTemplate, hdx hdxVar, gdx gdxVar, vzq0 vzq0Var, long j, qim0 qim0Var, int i, String str, djc0 djc0Var, Function0 function0, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = button;
        this.c = messageTemplate;
        this.d = hdxVar;
        this.e = gdxVar;
        this.f = vzq0Var;
        this.g = j;
        this.h = qim0Var;
        this.i = i;
        this.t = str;
        this.X = djc0Var;
        this.Y = function0;
        this.Z = i2;
        this.N0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.N0;
        int i2 = this.Z;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i2 | 1);
                int iP2 = czo1.p(i);
                y9j0.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i2 | 1);
                int iP4 = czo1.p(i);
                y9j0.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP3, iP4);
                break;
        }
        return rih1Var;
    }
}
