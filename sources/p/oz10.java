package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
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
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageListResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oz10 implements iu30 {
    @Override // p.iu30
    public final Object invoke(Object obj) {
        Format formatK;
        Set setJ;
        FetchMessageListResponse fetchMessageListResponse = (FetchMessageListResponse) obj;
        List<InAppMessage> messages = fetchMessageListResponse.getMessages();
        ArrayList arrayList = new ArrayList(q7h.U(messages, 10));
        for (InAppMessage inAppMessage : messages) {
            MessageCreative creative = inAppMessage.getCreative();
            List<Trigger> triggers = inAppMessage.getTriggers();
            if (creative instanceof MessageCreative.FormatCreative) {
                formatK = ((MessageCreative.FormatCreative) creative).getFormat();
            } else {
                if (!(creative instanceof MessageCreative.HtmlCreative)) {
                    eg.o();
                    return null;
                }
                formatK = yhm0.k(((MessageCreative.HtmlCreative) creative).getHtml());
            }
            Format format = formatK;
            String uuid = inAppMessage.getUuid();
            long messageId = inAppMessage.getMessageId();
            long creativeId = creative.getCreativeId();
            long templateId = creative.getTemplateId();
            long campaignId = creative.getCampaignId();
            String creativeVersion = creative.getCreativeVersion();
            FormatType formatTypeL = yhm0.l(format.getTemplate());
            String locale = creative.getLocale();
            MessageSource messageSource = MessageSource.PREFETCHED;
            LoggingData loggingData = new LoggingData(uuid, messageId, creativeId, templateId, campaignId, creativeVersion, formatTypeL, locale, messageSource, false, 512, (DefaultConstructorMarker) null);
            Long endTimestamp = inAppMessage.getEndTimestamp();
            long jLongValue = endTimestamp != null ? endTimestamp.longValue() : Long.MAX_VALUE;
            MessageType messageType = inAppMessage.getMessageType();
            Capping capping = inAppMessage.getCapping();
            if (capping == null || (setJ = yhm0.j(capping)) == null) {
                setJ = w7x.a;
            }
            arrayList.add(new Message.CreativeMessage(triggers, inAppMessage.getUuid(), format, messageSource, loggingData, jLongValue, messageType, setJ, new Pacing(0, PacingTimeUnit.HOURS)));
        }
        ArrayList<Message> arrayListO0 = o7h.O0(new Message.JITMessageStub(fetchMessageListResponse.getTriggers()), arrayList);
        ArrayList<mmr0> arrayList2 = new ArrayList();
        for (Message message : arrayListO0) {
            List<Trigger> triggers2 = message.getTriggers();
            ArrayList arrayList3 = new ArrayList(q7h.U(triggers2, 10));
            for (Trigger trigger : triggers2) {
                arrayList3.add(oqn1.n(trigger.getPattern() + "#" + trigger.getType(), message));
            }
            r7h.W(arrayList3, arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (mmr0 mmr0Var : arrayList2) {
            String str = (String) mmr0Var.a;
            Object objH = linkedHashMap.get(str);
            if (objH == null) {
                objH = cfm0.h(str, linkedHashMap);
            }
            ((List) objH).add((Message) mmr0Var.b);
        }
        return linkedHashMap;
    }
}
