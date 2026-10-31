package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PacingTimeUnit;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Capping;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qz10 implements iu30 {
    @Override // p.iu30
    public final Object invoke(Object obj) {
        xj61 xj61VarJ;
        xj61 xj61VarJ2;
        InAppMessage message = ((FetchMessageResponse) obj).getMessage();
        if (message == null) {
            hhg1.n("FetchMessageResponse has null message");
            return null;
        }
        MessageCreative creative = message.getCreative();
        boolean z = creative instanceof MessageCreative.HtmlCreative;
        w7x w7xVar = w7x.a;
        if (z) {
            List<Trigger> triggers = message.getTriggers();
            String uuid = message.getUuid();
            MessageCreative.HtmlCreative htmlCreative = (MessageCreative.HtmlCreative) creative;
            Format formatK = yhm0.k(htmlCreative.getHtml());
            MessageSource messageSource = MessageSource.JIT;
            LoggingData loggingData = new LoggingData(message.getUuid(), message.getMessageId(), htmlCreative.getCreativeId(), htmlCreative.getTemplateId(), htmlCreative.getCampaignId(), htmlCreative.getCreativeVersion(), yhm0.l(htmlCreative.getHtml().getTemplate()), htmlCreative.getLocale(), messageSource, false, 512, (DefaultConstructorMarker) null);
            Long endTimestamp = message.getEndTimestamp();
            long jLongValue = endTimestamp != null ? endTimestamp.longValue() : Long.MAX_VALUE;
            MessageType messageType = message.getMessageType();
            Capping capping = message.getCapping();
            return new Message.CreativeMessage(triggers, uuid, formatK, messageSource, loggingData, jLongValue, messageType, (capping == null || (xj61VarJ2 = yhm0.j(capping)) == null) ? w7xVar : xj61VarJ2, new Pacing(0, PacingTimeUnit.HOURS));
        }
        if (!(creative instanceof MessageCreative.FormatCreative)) {
            eg.o();
            return null;
        }
        List<Trigger> triggers2 = message.getTriggers();
        String uuid2 = message.getUuid();
        MessageCreative.FormatCreative formatCreative = (MessageCreative.FormatCreative) creative;
        Format format = formatCreative.getFormat();
        MessageSource messageSource2 = MessageSource.JIT;
        LoggingData loggingData2 = new LoggingData(message.getUuid(), message.getMessageId(), formatCreative.getCreativeId(), formatCreative.getTemplateId(), formatCreative.getCampaignId(), formatCreative.getCreativeVersion(), yhm0.l(formatCreative.getFormat().getTemplate()), formatCreative.getLocale(), messageSource2, false, 512, (DefaultConstructorMarker) null);
        Long endTimestamp2 = message.getEndTimestamp();
        long jLongValue2 = endTimestamp2 != null ? endTimestamp2.longValue() : Long.MAX_VALUE;
        MessageType messageType2 = message.getMessageType();
        Capping capping2 = message.getCapping();
        return new Message.CreativeMessage(triggers2, uuid2, format, messageSource2, loggingData2, jLongValue2, messageType2, (capping2 == null || (xj61VarJ = yhm0.j(capping2)) == null) ? w7xVar : xj61VarJ, new Pacing(0, PacingTimeUnit.HOURS));
    }
}
