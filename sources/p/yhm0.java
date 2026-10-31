package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.InteractionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Capping;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.EventType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class yhm0 {
    public static final String a(Message message) {
        if (message instanceof Message.CreativeMessage) {
            Message.CreativeMessage creativeMessage = (Message.CreativeMessage) message;
            return creativeMessage.getSource() == MessageSource.LOCAL ? CappingKey.Companion.local-xlX4SSM(creativeMessage.getId()) : CappingKey.Companion.remote-xlX4SSM(creativeMessage.getLoggingData().getMessageId());
        }
        if (message instanceof Message.JITMessageStub) {
            return null;
        }
        eg.o();
        return null;
    }

    public static final FormatType b(Message message) {
        if (message instanceof Message.CreativeMessage) {
            return e(((Message.CreativeMessage) message).getFormat());
        }
        if (message instanceof Message.JITMessageStub) {
            return FormatType.FORMAT_UNKNOWN;
        }
        eg.o();
        return null;
    }

    public static final String c(DiscardReason discardReason) {
        if (discardReason instanceof DiscardReason.ClientMessagingPlatformNotEnabled) {
            return "CMP feature is not enabled";
        }
        if (discardReason instanceof DiscardReason.ContextSwitched) {
            return "The original context from which the message was requested changed";
        }
        if (discardReason instanceof DiscardReason.DataMalformed) {
            return ((DiscardReason.DataMalformed) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.InvalidClickActionIdentifier) {
            return ((DiscardReason.InvalidClickActionIdentifier) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.DynamicTagResolutionFailed) {
            return ((DiscardReason.DynamicTagResolutionFailed) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.MessageExpired) {
            return "Message expiration date has passed";
        }
        if (discardReason instanceof DiscardReason.ParsingFailed) {
            return "Message could not be parsed correctly";
        }
        if (discardReason instanceof DiscardReason.PresentationFailed) {
            return ((DiscardReason.PresentationFailed) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.RequestTimedOut) {
            return "Message not loaded within 500 milliseconds";
        }
        if (discardReason instanceof DiscardReason.MessageNotFound) {
            return "Message not found";
        }
        if (discardReason instanceof DiscardReason.AdStartedPlaying) {
            return "Ad started playing";
        }
        if (discardReason instanceof DiscardReason.AppBackgrounded) {
            return "The application is in the background";
        }
        if (discardReason instanceof DiscardReason.ServiceStopped) {
            return "The CMP quasar service has stopped";
        }
        if (discardReason instanceof DiscardReason.AppIsOffline) {
            return "Unable to present this message as it requires the app to be online and the app is currently offline";
        }
        if (discardReason instanceof DiscardReason.BackendError) {
            return ((DiscardReason.BackendError) discardReason).getErrorDetails();
        }
        if (discardReason instanceof DiscardReason.CarConnected) {
            return "Car mode is enabled";
        }
        if (discardReason instanceof DiscardReason.ConflictingMessagePresenting) {
            String failureDetails = ((DiscardReason.ConflictingMessagePresenting) discardReason).getFailureDetails();
            return failureDetails == null ? "Conflicting message presenting but there are no details recorded" : failureDetails;
        }
        if (discardReason instanceof DiscardReason.UserLoggingOut) {
            return "The user is logging out of the app";
        }
        if (discardReason instanceof DiscardReason.InlineCardIncorrectTriggerType) {
            return "Inline cards should always use a client event trigger type";
        }
        if (discardReason instanceof DiscardReason.NowPlayingViewPresenting) {
            return "The now-playing-view is showing";
        }
        if (discardReason instanceof DiscardReason.NoContainerFound) {
            DiscardReason.NoContainerFound noContainerFound = (DiscardReason.NoContainerFound) discardReason;
            return gvg.h("We failed to obtain the container for the ", noContainerFound.getFormat(), " message on ", noContainerFound.getActivityName());
        }
        if (discardReason instanceof DiscardReason.NoTooltipAnchorViewFound) {
            DiscardReason.NoTooltipAnchorViewFound noTooltipAnchorViewFound = (DiscardReason.NoTooltipAnchorViewFound) discardReason;
            return gvg.h("We failed to obtain the source view (anchor) ", noTooltipAnchorViewFound.getAnchorView(), " for the tooltip message on ", noTooltipAnchorViewFound.getActivityName());
        }
        if (discardReason instanceof DiscardReason.RequestDismissedConflictingPresentedMessage) {
            return f4i1.f("We discarded this message because a new request with opportunityId ", ((DiscardReason.RequestDismissedConflictingPresentedMessage) discardReason).getRequestId(), " dismissed currently presenting conflicting messages");
        }
        if (discardReason instanceof DiscardReason.RequestAlreadyProcessing) {
            return "Request is already being processed";
        }
        eg.o();
        return null;
    }

    public static final FormatType d(MessagePresentationStatus messagePresentationStatus) {
        if (messagePresentationStatus instanceof MessagePresentationStatus.Presented) {
            return ((MessagePresentationStatus.Presented) messagePresentationStatus).getFormatType();
        }
        if (messagePresentationStatus instanceof MessagePresentationStatus.PendingPresentation) {
            return ((MessagePresentationStatus.PendingPresentation) messagePresentationStatus).getFormatType();
        }
        if (messagePresentationStatus instanceof MessagePresentationStatus.Discarded) {
            return ((MessagePresentationStatus.Discarded) messagePresentationStatus).getFormatType();
        }
        if (messagePresentationStatus instanceof MessagePresentationStatus.Dismissed) {
            return ((MessagePresentationStatus.Dismissed) messagePresentationStatus).getFormatType();
        }
        if (messagePresentationStatus instanceof MessagePresentationStatus.Processing) {
            return null;
        }
        eg.o();
        return null;
    }

    public static final FormatType e(Format format) {
        if (format instanceof Format.Banner) {
            return FormatType.BANNER;
        }
        if (format instanceof Format.BottomSheet) {
            return FormatType.BOTTOMSHEET;
        }
        if (format instanceof Format.Fullscreen) {
            return FormatType.FULLSCREEN;
        }
        if (format instanceof Format.InlineCard) {
            return FormatType.INLINE_CARD;
        }
        if (format instanceof Format.Modal) {
            return FormatType.MODAL;
        }
        if (format instanceof Format.SnackBar) {
            return FormatType.SNACKBAR;
        }
        if (format instanceof Format.Tooltip) {
            return FormatType.TOOLTIP;
        }
        if (format instanceof Format.WebView) {
            return FormatType.WEB_VIEW;
        }
        if (format instanceof Format.UndefinedFormat) {
            return FormatType.FORMAT_UNKNOWN;
        }
        eg.o();
        return null;
    }

    public static final String f(DiscardReason discardReason) {
        if (discardReason instanceof DiscardReason.ContextSwitched) {
            return "CONTEXT_SWITCHED";
        }
        if (discardReason instanceof DiscardReason.DataMalformed) {
            return "DATA_MALFORMED";
        }
        if (discardReason instanceof DiscardReason.InvalidClickActionIdentifier) {
            return "INVALID_CLICK_ACTION_IDENTIFIER";
        }
        if (discardReason instanceof DiscardReason.DynamicTagResolutionFailed) {
            return "DYNAMIC_TAGS_RESOLVING_FAILED";
        }
        if (discardReason instanceof DiscardReason.PresentationFailed) {
            return "MESSAGE_PRESENTATION_FAILED";
        }
        if (discardReason instanceof DiscardReason.ClientMessagingPlatformNotEnabled) {
            return "CMP_NOT_ENABLED";
        }
        if (discardReason instanceof DiscardReason.MessageExpired) {
            return "EXPIRED_MESSAGE";
        }
        if (discardReason instanceof DiscardReason.ParsingFailed) {
            return "PARSING_FAILED";
        }
        if (discardReason instanceof DiscardReason.RequestTimedOut) {
            return "REQUEST_TIMED_OUT";
        }
        if (discardReason instanceof DiscardReason.MessageNotFound) {
            return "MESSAGE_NOT_FOUND";
        }
        if (discardReason instanceof DiscardReason.AppBackgrounded) {
            return "APP_IS_BACKGROUNDED";
        }
        if (discardReason instanceof DiscardReason.BackendError) {
            return "BACKEND_ERROR";
        }
        if (discardReason instanceof DiscardReason.UserLoggingOut) {
            return "USER_WILL_LOG_OUT";
        }
        if (discardReason instanceof DiscardReason.CarConnected) {
            return "CAR_CONNECTED";
        }
        if (discardReason instanceof DiscardReason.AdStartedPlaying) {
            return "AD_STARTED_PLAYING";
        }
        if (discardReason instanceof DiscardReason.ConflictingMessagePresenting) {
            return "CONFLICTING_MESSAGE_PRESENTING";
        }
        if (discardReason instanceof DiscardReason.AppIsOffline) {
            return "APP_IS_OFFLINE";
        }
        if (discardReason instanceof DiscardReason.InlineCardIncorrectTriggerType) {
            return "INLINE_CARD_INCORRECT_TRIGGER_TYPE";
        }
        if (discardReason instanceof DiscardReason.NowPlayingViewPresenting) {
            return "NOW_PLAYING_VIEW_SHOWING";
        }
        if (discardReason instanceof DiscardReason.NoContainerFound) {
            return "NO_HTML_CONTAINER_FOUND";
        }
        if (discardReason instanceof DiscardReason.NoTooltipAnchorViewFound) {
            return "NO_TOOLTIP_ANCHOR_VIEW_FOUND";
        }
        if (discardReason instanceof DiscardReason.ServiceStopped) {
            return "SERVICE_STOPPED";
        }
        if (discardReason instanceof DiscardReason.RequestDismissedConflictingPresentedMessage) {
            return "REQUEST_DISMISSED_CONFLICTING_PRESENTED_MESSAGE";
        }
        if (discardReason instanceof DiscardReason.RequestAlreadyProcessing) {
            return "REQUEST_ALREADY_PROCESSING";
        }
        eg.o();
        return null;
    }

    public static final boolean g(Message message, CappingState cappingState) {
        if (!(message instanceof Message.CreativeMessage)) {
            if (message instanceof Message.JITMessageStub) {
                return false;
            }
            eg.o();
            return false;
        }
        int impressionCount = cappingState.getImpressionCount();
        Set<CappingRule> cappingRules = ((Message.CreativeMessage) message).getCappingRules();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cappingRules) {
            if (obj instanceof CappingRule.Impression) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((CappingRule.Impression) it.next()).getMaxImpressions()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((Number) obj2).intValue() > 0) {
                arrayList3.add(obj2);
            }
        }
        Integer num = (Integer) o7h.G0(arrayList3);
        return impressionCount >= (num != null ? num.intValue() : Integer.MAX_VALUE);
    }

    public static final boolean h(Message message, CappingState cappingState) {
        EventType eventType;
        if (message instanceof Message.CreativeMessage) {
            Set capturedInteractions = cappingState.getCapturedInteractions();
            Set<CappingRule> cappingRules = ((Message.CreativeMessage) message).getCappingRules();
            ArrayList arrayList = new ArrayList();
            for (Object obj : cappingRules) {
                if (obj instanceof CappingRule.Interaction) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Set<InteractionType> interactionsToCap = ((CappingRule.Interaction) it.next()).getInteractionsToCap();
                ArrayList arrayList3 = new ArrayList(q7h.U(interactionsToCap, 10));
                Iterator<T> it2 = interactionsToCap.iterator();
                while (it2.hasNext()) {
                    int i = xhm0.b[((InteractionType) it2.next()).ordinal()];
                    if (i == 1) {
                        eventType = EventType.CLICK;
                    } else {
                        if (i != 2) {
                            eg.o();
                            return false;
                        }
                        eventType = EventType.DISMISS;
                    }
                    arrayList3.add(eventType);
                }
                r7h.W(arrayList3, arrayList2);
            }
            if (!o7h.v0(capturedInteractions, arrayList2).isEmpty()) {
                return true;
            }
        } else if (!(message instanceof Message.JITMessageStub)) {
            eg.o();
            return false;
        }
        return false;
    }

    public static final LoggingData i(Message message) {
        if (message instanceof Message.CreativeMessage) {
            return ((Message.CreativeMessage) message).getLoggingData();
        }
        if (message instanceof Message.JITMessageStub) {
            return null;
        }
        eg.o();
        return null;
    }

    public static final xj61 j(Capping capping) {
        xj61 xj61Var = new xj61();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = capping.getEventsToCap().iterator();
        while (it.hasNext()) {
            int i = xhm0.c[((EventType) it.next()).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    linkedHashSet.add(InteractionType.DISMISS);
                } else if (i == 3) {
                    xj61Var.add(new CappingRule.Impression(1));
                } else {
                    if (i != 4) {
                        eg.o();
                        return null;
                    }
                    linkedHashSet.add(InteractionType.CLICK);
                }
            }
        }
        if (!linkedHashSet.isEmpty()) {
            xj61Var.add(new CappingRule.Interaction(linkedHashSet));
        }
        return cwl1.j(xj61Var);
    }

    public static final Format k(Html html) {
        if (html instanceof Html.Banner) {
            return new Format.Banner(((Html.Banner) html).getTemplate());
        }
        if (html instanceof Html.Fullscreen) {
            return new Format.Fullscreen(((Html.Fullscreen) html).getTemplate());
        }
        if (html instanceof Html.Modal) {
            return new Format.Modal(((Html.Modal) html).getTemplate());
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (html instanceof Html.SnackBar) {
            return new Format.SnackBar((SnackBarTemplate) ((Html.SnackBar) html).getTemplate(), false, 2, defaultConstructorMarker);
        }
        if (html instanceof Html.UnknownFormat) {
            return Format.UndefinedFormat.INSTANCE;
        }
        eg.o();
        return null;
    }

    public static final FormatType l(MessageTemplate messageTemplate) {
        if (messageTemplate instanceof BannerTemplate) {
            return FormatType.BANNER;
        }
        if (messageTemplate instanceof ModalTemplate) {
            return FormatType.MODAL;
        }
        if (messageTemplate instanceof FullscreenTemplate) {
            return FormatType.FULLSCREEN;
        }
        if (messageTemplate instanceof SnackBarTemplate) {
            return FormatType.SNACKBAR;
        }
        if (messageTemplate instanceof BottomSheetTemplate) {
            return FormatType.BOTTOMSHEET;
        }
        if (messageTemplate instanceof TooltipTemplate) {
            return FormatType.TOOLTIP;
        }
        if (messageTemplate instanceof InlineCardTemplate) {
            return FormatType.INLINE_CARD;
        }
        return messageTemplate instanceof WebViewTemplate ? FormatType.WEB_VIEW : FormatType.FORMAT_UNKNOWN;
    }

    public static final MessagePresentationStatus m(a5j0 a5j0Var) {
        FormatType formatType;
        FormatType formatType2;
        FormatType formatType3;
        FormatType formatType4;
        if ((a5j0Var instanceof t4j0) || (a5j0Var instanceof u4j0) || (a5j0Var instanceof z4j0)) {
            return new MessagePresentationStatus.Processing(a5j0Var.a().b, a5j0Var.a().c);
        }
        if (a5j0Var instanceof v4j0) {
            v4j0 v4j0Var = (v4j0) a5j0Var;
            pih1 pih1Var = v4j0Var.a;
            String str = pih1Var.b;
            TriggerType triggerType = pih1Var.c;
            DiscardReason discardReason = v4j0Var.c;
            LoggingData loggingDataB = a5j0Var.b();
            if (loggingDataB == null || (formatType4 = loggingDataB.getFormatType()) == null) {
                formatType4 = FormatType.FORMAT_UNKNOWN;
            }
            return new MessagePresentationStatus.Discarded(str, triggerType, formatType4, discardReason);
        }
        if (a5j0Var instanceof w4j0) {
            w4j0 w4j0Var = (w4j0) a5j0Var;
            pih1 pih1Var2 = w4j0Var.a;
            String str2 = pih1Var2.b;
            TriggerType triggerType2 = pih1Var2.c;
            DismissReason dismissReason = w4j0Var.c;
            LoggingData loggingDataB2 = a5j0Var.b();
            if (loggingDataB2 == null || (formatType3 = loggingDataB2.getFormatType()) == null) {
                formatType3 = FormatType.FORMAT_UNKNOWN;
            }
            return new MessagePresentationStatus.Dismissed(str2, triggerType2, formatType3, dismissReason);
        }
        if (a5j0Var instanceof x4j0) {
            x4j0 x4j0Var = (x4j0) a5j0Var;
            String str3 = x4j0Var.a().b;
            TriggerType triggerType3 = x4j0Var.a().c;
            LoggingData loggingDataB3 = a5j0Var.b();
            if (loggingDataB3 == null || (formatType2 = loggingDataB3.getFormatType()) == null) {
                formatType2 = FormatType.FORMAT_UNKNOWN;
            }
            return new MessagePresentationStatus.Presented(str3, triggerType3, formatType2);
        }
        if (!(a5j0Var instanceof y4j0)) {
            eg.o();
            return null;
        }
        pih1 pih1Var3 = ((y4j0) a5j0Var).a;
        String str4 = pih1Var3.b;
        TriggerType triggerType4 = pih1Var3.c;
        LoggingData loggingDataB4 = a5j0Var.b();
        if (loggingDataB4 == null || (formatType = loggingDataB4.getFormatType()) == null) {
            formatType = FormatType.FORMAT_UNKNOWN;
        }
        return new MessagePresentationStatus.PendingPresentation(str4, triggerType4, formatType);
    }

    public static final MessageRequest n(gmc gmcVar) {
        return new MessageRequest(gmcVar.b, gmcVar.c, null, gmcVar.f, gmcVar.d, gmcVar.g, gmcVar.h, null, gmcVar.j, 132, null);
    }

    public static final gmc o(MessageRequest messageRequest, String str) {
        return new gmc(str, messageRequest.getTriggerPattern(), messageRequest.getTriggerType(), messageRequest.getPageUri(), messageRequest.getInteractionLoggingResult(), messageRequest.getRulesConfig(), messageRequest.getDynamicTagsMetadata(), messageRequest.getOrchestrationMetadata(), 272);
    }

    public static final pih1 p(MessageRequest messageRequest, String str) {
        String entityUri;
        String triggerPattern = messageRequest.getTriggerPattern();
        TriggerType triggerType = messageRequest.getTriggerType();
        String pageUri = messageRequest.getPageUri();
        DynamicTagsMetadata dynamicTagsMetadata = messageRequest.getDynamicTagsMetadata();
        if (dynamicTagsMetadata == null || (entityUri = dynamicTagsMetadata.getEntityUri()) == null) {
            entityUri = "";
        }
        return new pih1(str, triggerPattern, triggerType, pageUri, entityUri);
    }

    public static final pih1 q(gmc gmcVar) {
        String entityUri;
        String str = gmcVar.a;
        String str2 = gmcVar.b;
        TriggerType triggerType = gmcVar.c;
        String str3 = gmcVar.d;
        DynamicTagsMetadata dynamicTagsMetadata = gmcVar.h;
        if (dynamicTagsMetadata == null || (entityUri = dynamicTagsMetadata.getEntityUri()) == null) {
            entityUri = "";
        }
        return new pih1(str, str2, triggerType, str3, entityUri);
    }
}
