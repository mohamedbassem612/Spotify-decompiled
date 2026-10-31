package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ms30 implements r4j0 {
    public final dg30 a;
    public final ldj0 b;
    public final y4q0 c;
    public MessageResponseToken d;

    public ms30(dg30 dg30Var, ldj0 ldj0Var, y4q0 y4q0Var) {
        this.a = dg30Var;
        this.b = ldj0Var;
        this.c = y4q0Var;
    }

    @Override // p.r4j0
    public final void a(MessageResponseToken messageResponseToken, iu30 iu30Var) {
        this.d = messageResponseToken;
    }

    @Override // p.r4j0
    public final void b(Function0 function0) {
        MessageResponseToken messageResponseToken = this.d;
        if (messageResponseToken != null) {
            fn31.T(cto1.q(this.a), (o8n) null, 0, new ls30(this, messageResponseToken.getMessageData().getLoggingData().getMessageId(), messageResponseToken.getMessageRequest().getInteractionLoggingResult(), messageResponseToken.getMessageRequest().getOrchestrationMetadata().a, messageResponseToken.getMessageRequest().getOrchestrationMetadata().b, messageResponseToken, null), 3);
        }
    }

    @Override // p.r4j0
    public final void dismiss() {
        this.b.b(blc0.R7);
    }
}
