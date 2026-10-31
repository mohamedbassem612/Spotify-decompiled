package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r9j0 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ Button a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ hw61 d;
    public final /* synthetic */ MessageTemplate e;
    public final /* synthetic */ gdx f;
    public final /* synthetic */ vzq0 g;
    public final /* synthetic */ qim0 h;
    public final /* synthetic */ byte i;
    public final /* synthetic */ djc0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r9j0(Button button, vu30 vu30Var, vu30 vu30Var2, hw61 hw61Var, MessageTemplate messageTemplate, gdx gdxVar, vzq0 vzq0Var, qim0 qim0Var, int i, djc0 djc0Var, Function0 function0) {
        super(2);
        this.a = button;
        this.b = vu30Var;
        this.c = vu30Var2;
        this.d = hw61Var;
        this.e = messageTemplate;
        this.f = gdxVar;
        this.g = vzq0Var;
        this.h = qim0Var;
        this.i = i;
        this.t = djc0Var;
        this.X = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Button button = this.a;
            long jP = v9p1.P(((u7h) this.b.invoke(x340Var2, 0)).a, button.getStyle().getBackgroundColor());
            String textColor = button.getStyle().getTextColor();
            vu30 vu30Var = this.c;
            long jP2 = v9p1.P(((u7h) vu30Var.invoke(x340Var2, 0)).a, textColor);
            boolean zF = x340Var2.f(jP2);
            Object objT = x340Var2.T();
            if (zF || objT == m4cVar) {
                objT = new q9j0((byte) 0, jP2);
                x340Var2.s0(objT);
            }
            vu30 vu30Var2 = (vu30) objT;
            boolean zF2 = x340Var2.f(jP);
            Object objT2 = x340Var2.T();
            if (zF2 || objT2 == m4cVar) {
                objT2 = new q9j0((byte) 1, jP);
                x340Var2.s0(objT2);
            }
            y9j0.d(this.a, this.e, new hdx(0, vu30Var2, (vu30) objT2, (vu30) null, this.d, 9), this.f, this.g, ((u7h) vu30Var.invoke(x340Var2, 0)).a, this.h, this.i, "messaging_button_primary_tag", this.t, this.X, x340Var2, Button.$stable | 100663296, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
