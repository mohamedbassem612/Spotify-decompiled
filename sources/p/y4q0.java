package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y4q0 {
    public final mmc a;

    public y4q0(mmc mmcVar) {
        this.a = mmcVar;
    }

    public final void a(pih1 pih1Var, Message message, DiscardReason discardReason) {
        ((nmc) this.a).a.accept(new oak1(pih1Var, message, discardReason));
    }
}
