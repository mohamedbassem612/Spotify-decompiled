package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u9j0 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Button b;
    public final /* synthetic */ MessageTemplate c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ gdx f;
    public final /* synthetic */ vzq0 g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ hw61 i;
    public final /* synthetic */ djc0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u9j0(Button button, MessageTemplate messageTemplate, qim0 qim0Var, int i, gdx gdxVar, vzq0 vzq0Var, vu30 vu30Var, hw61 hw61Var, djc0 djc0Var, Function0 function0, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = button;
        this.c = messageTemplate;
        this.d = qim0Var;
        this.e = i;
        this.f = gdxVar;
        this.g = vzq0Var;
        this.h = vu30Var;
        this.i = hw61Var;
        this.t = djc0Var;
        this.X = function0;
        this.Y = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.Y;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                y9j0.p(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                y9j0.p(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
