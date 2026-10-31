package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b5f1 extends hab0 implements iu30 {
    public final /* synthetic */ h5f1 a;
    public final /* synthetic */ mmr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5f1(mmr0 mmr0Var, h5f1 h5f1Var) {
        super(1);
        this.a = h5f1Var;
        this.b = mmr0Var;
    }

    public final Object invoke(Object obj) {
        h5f1 h5f1Var = this.a;
        h5f1Var.d.a((MessageResponseToken) this.b.a, DismissReason.MessageSwiped.INSTANCE);
        h5f1Var.d();
        return rih1.a;
    }
}
