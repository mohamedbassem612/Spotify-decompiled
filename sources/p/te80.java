package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class te80 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gbj0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te80(gbj0 gbj0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = gbj0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        gbj0 gbj0Var = this.b;
        switch (b) {
            case 0:
                Button button = gbj0Var.i;
                if (button != null) {
                    iu30Var.invoke(new hbj0(button));
                }
                break;
            default:
                Button button2 = gbj0Var.i;
                if (button2 != null) {
                    iu30Var.invoke(new hbj0(button2));
                }
                break;
        }
        return rih1Var;
    }
}
