package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pu40 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tu40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu40(tu40 tu40Var, byte b) {
        super(0);
        this.a = b;
        this.b = tu40Var;
    }

    public final Object invoke() {
        byte b = this.a;
        tu40 tu40Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return (MessageResponseToken) tu40Var.e.getValue();
    }
}
