package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cf80 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ef80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf80(ef80 ef80Var, byte b) {
        super(0);
        this.a = b;
        this.b = ef80Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ef80 ef80Var = this.b;
        switch (b) {
            case 0:
                ef80Var.c();
                return rih1Var;
            case 1:
                ef80Var.c();
                return rih1Var;
            default:
                mmr0 mmr0Var = ef80Var.f;
                if (mmr0Var == null) {
                    eg.m("Message data must be bound before accessing the view.");
                    return null;
                }
                return new ff80(ef80Var.a, ef80Var.e, new df80(ef80Var), (MessageResponseToken) mmr0Var.a);
        }
    }
}
