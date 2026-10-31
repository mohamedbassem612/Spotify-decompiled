package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c5f1 extends hab0 implements Function0 {
    public final /* synthetic */ h5f1 a;
    public final /* synthetic */ mmr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5f1(mmr0 mmr0Var, h5f1 h5f1Var) {
        super(0);
        this.a = h5f1Var;
        this.b = mmr0Var;
    }

    public final Object invoke() {
        h5f1 h5f1Var = this.a;
        h5f1Var.d.a((MessageResponseToken) this.b.a, DismissReason.BackgroundViewTapped.INSTANCE);
        h5f1Var.d();
        return rih1.a;
    }
}
