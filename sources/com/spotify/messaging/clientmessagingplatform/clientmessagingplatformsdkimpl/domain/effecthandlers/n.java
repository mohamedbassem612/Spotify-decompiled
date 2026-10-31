package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformDismissEvent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformDisplayStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformInteractionEvent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformRequestEvent;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Locale;
import p.ckc;
import p.dkc;
import p.eg;
import p.ekc;
import p.f4i1;
import p.fkc;
import p.gjc;
import p.gkc;
import p.hkc;
import p.ikc;
import p.njg;
import p.ojg;
import p.pih1;
import p.rjg;
import p.t2j0;
import p.zjg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n {
    public final gjc a;

    public n(gjc gjcVar) {
        this.a = gjcVar;
    }

    public final Consumer a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LogEventEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(ikc ikcVar) {
                String strF;
                if (ikcVar instanceof ckc) {
                    ckc ckcVar = (ckc) ikcVar;
                    this.this$0.a.a(ckcVar.b, ckcVar.c, ckcVar.d);
                    return;
                }
                if (ikcVar instanceof hkc) {
                    hkc hkcVar = (hkc) ikcVar;
                    this.this$0.a.b(hkcVar.b, hkcVar.c);
                    return;
                }
                if (ikcVar instanceof dkc) {
                    gjc gjcVar = this.this$0.a;
                    dkc dkcVar = (dkc) ikcVar;
                    pih1 pih1Var = dkcVar.b;
                    LoggingData loggingData = dkcVar.c;
                    DismissReason.MessageButtonTapped messageButtonTapped = dkcVar.d;
                    if (loggingData.isPreview()) {
                        return;
                    }
                    t2j0 t2j0Var = gjcVar.a;
                    njg njgVarN = ClientMessagingPlatformDismissEvent.n();
                    njgVarN.B(pih1Var.a.toLowerCase(Locale.ROOT));
                    njgVarN.C(pih1Var.b);
                    njgVarN.s(pih1Var.e);
                    njgVarN.z(loggingData.getMessageId());
                    njgVarN.A(loggingData.getMessageUuid());
                    njgVarN.y(loggingData.getFormatType().name());
                    njgVarN.q(loggingData.getMessageSource().name());
                    if (messageButtonTapped instanceof DismissReason.BackgroundViewTapped) {
                        strF = "background_view_tapped";
                    } else if (messageButtonTapped instanceof DismissReason.FooterTapped) {
                        strF = "footer_tapped";
                    } else if (messageButtonTapped instanceof DismissReason.MessageButtonTapped) {
                        strF = f4i1.f("message_", messageButtonTapped.getButton().getIdentifier(), "_button_tapped");
                    } else if (messageButtonTapped instanceof DismissReason.MessageSwiped) {
                        strF = "message_swiped";
                    } else if (messageButtonTapped instanceof DismissReason.ProgrammaticDismissal) {
                        strF = "programmatic_dismissal";
                    } else if (messageButtonTapped instanceof DismissReason.WebViewMessageNavigatedToCloseUrl) {
                        strF = "webview_message_navigated_to_close_url";
                    } else if (messageButtonTapped instanceof DismissReason.ContextChanged) {
                        strF = "context_changed";
                    } else if (messageButtonTapped instanceof DismissReason.MessageContentTapped) {
                        strF = "message_content_view_tapped";
                    } else if (messageButtonTapped instanceof DismissReason.BackButtonTapped) {
                        strF = "back_button_tapped";
                    } else if (messageButtonTapped instanceof DismissReason.AutoDismissingMessageTimerElapsed) {
                        strF = "auto_dismissing_message_timer_elapsed";
                    } else if (messageButtonTapped instanceof DismissReason.WebViewCloseBarButtonItemTapped) {
                        strF = "webview_message_close_bar_button_item_tapped";
                    } else if (messageButtonTapped instanceof DismissReason.SurfaceOvertakenOrBackgrounded) {
                        strF = "surface_overtaken_or_backgrounded";
                    } else if (messageButtonTapped instanceof DismissReason.SessionEnded) {
                        strF = "session_ended";
                    } else if (messageButtonTapped instanceof DismissReason.MessageCleanup) {
                        strF = "message_cleanup";
                    } else {
                        if (!(messageButtonTapped instanceof DismissReason.UserLoggingOut)) {
                            eg.o();
                            return;
                        }
                        strF = "user_logging_out";
                    }
                    njgVarN.r(strF);
                    njgVarN.t(loggingData.getLocale());
                    njgVarN.v(loggingData.getCreativeId());
                    njgVarN.x(loggingData.getCreativeVersion());
                    njgVarN.w(loggingData.getCreativeTemplateId());
                    njgVarN.u(loggingData.getCreativeCampaignId());
                    if (messageButtonTapped instanceof DismissReason.MessageButtonTapped) {
                        njgVarN.n(messageButtonTapped.getButton().getIdentifier());
                    }
                    t2j0Var.a(njgVarN.build());
                    return;
                }
                if (ikcVar instanceof ekc) {
                    gjc gjcVar2 = this.this$0.a;
                    ekc ekcVar = (ekc) ikcVar;
                    pih1 pih1Var2 = ekcVar.b;
                    LoggingData loggingData2 = ekcVar.c;
                    if (loggingData2.isPreview()) {
                        return;
                    }
                    t2j0 t2j0Var2 = gjcVar2.a;
                    ojg ojgVarN = ClientMessagingPlatformDisplayStatus.n();
                    ojgVarN.B(pih1Var2.a.toLowerCase(Locale.ROOT));
                    ojgVarN.D(pih1Var2.b);
                    ojgVarN.s(pih1Var2.e);
                    ojgVarN.z(loggingData2.getMessageId());
                    ojgVarN.A(loggingData2.getMessageUuid());
                    ojgVarN.y(loggingData2.getFormatType().name());
                    ojgVarN.n(loggingData2.getMessageSource().name());
                    ojgVarN.C(true);
                    ojgVarN.q("");
                    ojgVarN.r("");
                    ojgVarN.t(loggingData2.getLocale());
                    ojgVarN.v(loggingData2.getCreativeId());
                    ojgVarN.x(loggingData2.getCreativeVersion());
                    ojgVarN.w(loggingData2.getCreativeTemplateId());
                    ojgVarN.u(loggingData2.getCreativeCampaignId());
                    t2j0Var2.a(ojgVarN.build());
                    return;
                }
                if (!(ikcVar instanceof fkc)) {
                    if (!(ikcVar instanceof gkc)) {
                        eg.o();
                        return;
                    }
                    gjc gjcVar3 = this.this$0.a;
                    gkc gkcVar = (gkc) ikcVar;
                    String str = gkcVar.b;
                    String str2 = gkcVar.c;
                    t2j0 t2j0Var3 = gjcVar3.a;
                    zjg zjgVarN = ClientMessagingPlatformRequestEvent.n();
                    zjgVarN.n(str);
                    zjgVarN.q(str2);
                    t2j0Var3.a(zjgVarN.build());
                    return;
                }
                gjc gjcVar4 = this.this$0.a;
                fkc fkcVar = (fkc) ikcVar;
                pih1 pih1Var3 = fkcVar.b;
                LoggingData loggingData3 = fkcVar.c;
                Button button = fkcVar.d;
                if (loggingData3.isPreview()) {
                    return;
                }
                t2j0 t2j0Var4 = gjcVar4.a;
                rjg rjgVarN = ClientMessagingPlatformInteractionEvent.n();
                rjgVarN.D(pih1Var3.a.toLowerCase(Locale.ROOT));
                rjgVarN.E(pih1Var3.b);
                rjgVarN.t(pih1Var3.e);
                rjgVarN.B(loggingData3.getMessageId());
                rjgVarN.C(loggingData3.getMessageUuid());
                rjgVarN.A(loggingData3.getFormatType().name());
                rjgVarN.q(loggingData3.getMessageSource().name());
                rjgVarN.u("message_" + button.getIdentifier() + "_tapped");
                rjgVarN.n(button.getIdentifier());
                rjgVarN.r(button.getClickAction().getClickActionIdentifier());
                String actionUrl = button.getClickAction().getActionUrl();
                rjgVarN.s(actionUrl != null ? actionUrl : "");
                rjgVarN.v(loggingData3.getLocale());
                rjgVarN.x(loggingData3.getCreativeId());
                rjgVarN.z(loggingData3.getCreativeVersion());
                rjgVarN.y(loggingData3.getCreativeTemplateId());
                rjgVarN.w(loggingData3.getCreativeCampaignId());
                t2j0Var4.a(rjgVarN.build());
            }
        };
    }
}
