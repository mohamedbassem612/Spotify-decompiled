package p;

import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n5j0 implements zpg0 {
    public final zpg0 a;

    public n5j0(zpg0 zpg0Var) {
        this.a = zpg0Var;
    }

    @Override // p.zpg0
    public final HubsImmutableComponentBundle a(Parcelable parcelable) {
        String str;
        zpg0 zpg0Var;
        MessageResponseToken messageResponseToken = (MessageResponseToken) parcelable;
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        yxo1 yxo1VarJ = hubsImmutableComponentBundle.a.J("messageResponse_requestId", messageResponseToken.getRequestId());
        MessageRequest messageRequest = messageResponseToken.getMessageRequest();
        uc70 uc70Var = hubsImmutableComponentBundle.a;
        yxo1 yxo1VarJ2 = uc70Var.J("messageRequest_triggerPattern", messageRequest.getTriggerPattern()).J("messageRequest_triggerType", messageRequest.getTriggerType().name());
        uy31 rulesConfig = messageRequest.getRulesConfig();
        if (rulesConfig instanceof vks) {
            str = "DEFAULT_RULE_CONFIG";
        } else if (rulesConfig instanceof fh80) {
            str = "INLINE_RULE_CONFIG";
        } else if (rulesConfig instanceof j7a) {
            str = "BANNER_RULE_CONFIG";
        } else {
            if (!(rulesConfig instanceof ysj0)) {
                eg.o();
                return null;
            }
            str = "MINIMUM_RULE_CONFIG";
        }
        yxo1 yxo1VarJ3 = yxo1VarJ2.J("messageRequest_rulesConfig", str).J("messageRequest_pageUri", messageRequest.getPageUri()).G("messageRequest_interactionId", messageRequest.getInteractionLoggingResult()).J("messageRequest_conflictResolutionStrategy", messageRequest.getConflictResolutionStrategy().name());
        DynamicTagsMetadata dynamicTagsMetadata = messageRequest.getDynamicTagsMetadata();
        yxo1 yxo1VarP = yxo1VarJ3.p(dynamicTagsMetadata != null ? uc70Var.J("dynamicTagsMetadata_entityName", dynamicTagsMetadata.getEntityName()).J("dynamicTagsMetadata_creatorName", dynamicTagsMetadata.getCreatorName()).J("dynamicTagsMetadata_entityImageUrl", dynamicTagsMetadata.getEntityImageUrl()).J("dynamicTagsMetadata_pageUri", dynamicTagsMetadata.getEntityUri()).o() : null, "messageRequest_dynamicTagsMetadata");
        List suppliedMessages = messageRequest.getSuppliedMessages();
        ArrayList arrayList = new ArrayList(q7h.U(suppliedMessages, 10));
        Iterator it = suppliedMessages.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zpg0Var = this.a;
            if (!zHasNext) {
                break;
            }
            ClientMessage clientMessage = (ClientMessage) it.next();
            yxo1 yxo1VarP2 = HubsImmutableComponentBundle.b.a.J("clientMessage_messageId", clientMessage.getId()).J("clientMessage_messageUuid", clientMessage.getUuid()).p(zpg0Var.a(clientMessage.getFormat()), "clientMessage_format");
            Set<CappingRule> cappingRules = clientMessage.getCappingRules();
            ArrayList arrayList2 = new ArrayList(q7h.U(cappingRules, 10));
            Iterator<T> it2 = cappingRules.iterator();
            while (it2.hasNext()) {
                arrayList2.add(zd70.g((CappingRule) it2.next()));
            }
            arrayList.add(yxo1VarP2.q("clientMessage_cappingRules", (HubsImmutableComponentBundle[]) arrayList2.toArray(new HubsImmutableComponentBundle[0])).p(zd70.h(clientMessage.getPacing()), "clientMessage_pacing").o());
        }
        yxo1 yxo1VarP3 = yxo1VarJ.p(yxo1VarP.q("messageRequest_suppliedMessages", (HubsImmutableComponentBundle[]) arrayList.toArray(new HubsImmutableComponentBundle[0])).o(), "messageResponse_messageRequest");
        Message.CreativeMessage messageData = messageResponseToken.getMessageData();
        yxo1 yxo1VarJ4 = HubsImmutableComponentBundle.b.a.J("messageData_id", messageData.getId());
        List<Trigger> triggers = messageData.getTriggers();
        ArrayList arrayList3 = new ArrayList(q7h.U(triggers, 10));
        for (Trigger trigger : triggers) {
            arrayList3.add(HubsImmutableComponentBundle.b.a.J("trigger_type", trigger.getType().name()).J("trigger_pattern", trigger.getPattern()).o());
        }
        yxo1 yxo1VarP4 = yxo1VarJ4.q("messageData_triggers", (HubsImmutableComponentBundle[]) arrayList3.toArray(new HubsImmutableComponentBundle[0])).J("messageData_source", messageData.getSource().name()).J("messageData_messageType", messageData.getMessageType().name()).F(messageData.getEndTimestamp(), "messageData_endTimestamp").p(zpg0Var.a(messageData.getFormat()), "messageData_format");
        LoggingData loggingData = messageData.getLoggingData();
        yxo1 yxo1VarP5 = yxo1VarP4.p(HubsImmutableComponentBundle.b.a.J("loggingData_uuid", loggingData.getMessageUuid()).F(loggingData.getMessageId(), "loggingData_messageId").F(loggingData.getCreativeId(), "loggingData_creativeId").F(loggingData.getCreativeTemplateId(), "loggingData_creativeTemplateId").F(loggingData.getCreativeCampaignId(), "loggingData_creativeCampaignId").J("loggingData_creativeVersion", loggingData.getCreativeVersion()).J("loggingData_format", loggingData.getFormatType().name()).J("loggingData_locale", loggingData.getLocale()).J("loggingData_messageSource", loggingData.getMessageSource().name()).m("loggingData_isPreview", loggingData.isPreview()).o(), "messageData_loggingData").p(zd70.h(messageData.getPacing()), "messageData_pacing");
        Set cappingRules2 = messageData.getCappingRules();
        ArrayList arrayList4 = new ArrayList(q7h.U(cappingRules2, 10));
        Iterator it3 = cappingRules2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(zd70.g((CappingRule) it3.next()));
        }
        return yxo1VarP3.p(yxo1VarP5.q("messageData_cappingRules", (HubsImmutableComponentBundle[]) arrayList4.toArray(new HubsImmutableComponentBundle[0])).o(), "messageResponse_messageData").o();
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // p.zpg0
    public final java.lang.Object b(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r44v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
