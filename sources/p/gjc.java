package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformDisplayStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformRequestErrorEvent;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gjc {
    public final t2j0 a;

    public gjc(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public final void a(pih1 pih1Var, LoggingData loggingData, DiscardReason discardReason) {
        if (loggingData.isPreview()) {
            return;
        }
        ojg ojgVarN = ClientMessagingPlatformDisplayStatus.n();
        ojgVarN.B(pih1Var.a.toLowerCase(Locale.ROOT));
        ojgVarN.D(pih1Var.b);
        ojgVarN.s(pih1Var.e);
        ojgVarN.z(loggingData.getMessageId());
        ojgVarN.A(loggingData.getMessageUuid());
        ojgVarN.y(loggingData.getFormatType().name());
        ojgVarN.n(loggingData.getMessageSource().name());
        ojgVarN.C(false);
        ojgVarN.q(yhm0.c(discardReason));
        ojgVarN.r(yhm0.f(discardReason));
        ojgVarN.t(loggingData.getLocale());
        ojgVarN.v(loggingData.getCreativeId());
        ojgVarN.x(loggingData.getCreativeVersion());
        ojgVarN.w(loggingData.getCreativeTemplateId());
        ojgVarN.u(loggingData.getCreativeCampaignId());
        this.a.a(ojgVarN.build());
    }

    public final void b(pih1 pih1Var, DiscardReason discardReason) {
        yjg yjgVarN = ClientMessagingPlatformRequestErrorEvent.n();
        yjgVarN.r(pih1Var.a.toLowerCase(Locale.ROOT));
        yjgVarN.s(pih1Var.b);
        yjgVarN.q(yhm0.f(discardReason));
        yjgVarN.n(yhm0.c(discardReason));
        this.a.a(yjgVarN.build());
    }
}
