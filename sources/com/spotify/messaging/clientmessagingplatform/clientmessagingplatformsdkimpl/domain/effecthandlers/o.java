package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import p.b80;
import p.c80;
import p.d3j0;
import p.d80;
import p.dlc;
import p.eg;
import p.gmc;
import p.hxo1;
import p.ij01;
import p.jkc;
import p.jlc;
import p.lh10;
import p.lxv0;
import p.mmr0;
import p.mxv0;
import p.o7h;
import p.p3d1;
import p.r4j0;
import p.si1;
import p.vri1;
import p.xri1;
import p.yhm0;
import p.zc80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o {
    public final ij01 a;
    public final zc80 b;
    public final Scheduler c;

    public o(ij01 ij01Var, zc80 zc80Var, Scheduler scheduler) {
        this.a = ij01Var;
        this.b = zc80Var;
        this.c = scheduler;
    }

    public final ObservableTransformer a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.PrepareMessageViewEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<jlc> apply(Observable<jkc> observable) {
                Observable<jkc> observableObserveOn = observable.observeOn(this.this$0.c);
                final o oVar = this.this$0;
                return observableObserveOn.map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.PrepareMessageViewEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    public final jlc apply(jkc jkcVar) {
                        T next;
                        lxv0 lxv0Var;
                        Context context = jkcVar.b;
                        MessageResponseToken messageResponseToken = jkcVar.d;
                        hxo1 hxo1VarJ = oVar.a.j(messageResponseToken.getMessageData(), jkcVar.f.getRules(), yhm0.o(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), jkcVar.g);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        DynamicTagsMetadata dynamicTagsMetadata = jkcVar.e;
                        if (dynamicTagsMetadata == null) {
                            dynamicTagsMetadata = messageResponseToken.getMessageRequest().getDynamicTagsMetadata();
                        }
                        d3j0 orchestrationMetadata = jkcVar.h;
                        if (orchestrationMetadata == null) {
                            orchestrationMetadata = messageResponseToken.getMessageRequest().getOrchestrationMetadata();
                        }
                        MessageTemplate messageTemplateR = dynamicTagsMetadata != null ? si1.r(messageResponseToken.getMessageData().getFormat().getTemplate(), dynamicTagsMetadata, linkedHashSet) : p3d1.i(messageResponseToken);
                        Format format = messageResponseToken.getMessageData().getFormat();
                        try {
                            if (format instanceof Format.Banner) {
                                format = ((Format.Banner) format).copy((BannerTemplate) messageTemplateR);
                            } else if (format instanceof Format.BottomSheet) {
                                format = ((Format.BottomSheet) format).copy((BottomSheetTemplate) messageTemplateR);
                            } else if (format instanceof Format.Fullscreen) {
                                format = ((Format.Fullscreen) format).copy((FullscreenTemplate) messageTemplateR);
                            } else if (format instanceof Format.InlineCard) {
                                format = ((Format.InlineCard) format).copy((InlineCardTemplate) messageTemplateR);
                            } else if (format instanceof Format.Modal) {
                                format = ((Format.Modal) format).copy((ModalTemplate) messageTemplateR);
                            } else if (format instanceof Format.SnackBar) {
                                format = Format.SnackBar.copy$default((Format.SnackBar) format, (SnackBarTemplate) messageTemplateR, false, 2, null);
                            } else if (format instanceof Format.Tooltip) {
                                format = Format.Tooltip.copy$default((Format.Tooltip) format, (TooltipTemplate) messageTemplateR, null, null, 0L, 14, null);
                            } else if (format instanceof Format.WebView) {
                                format = ((Format.WebView) format).copy((WebViewTemplate) messageTemplateR);
                            } else if (!(format instanceof Format.UndefinedFormat)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } catch (ClassCastException unused) {
                        }
                        Format format2 = format;
                        if (hxo1VarJ instanceof xri1) {
                            if (linkedHashSet.isEmpty()) {
                                d80 d80VarF = oVar.b.f(context, jkcVar.i, messageTemplateR);
                                if (d80VarF.equals(c80.a)) {
                                    r4j0 r4j0VarA = jkcVar.c.a(context);
                                    gmc gmcVarA = gmc.a(yhm0.o(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), null, orchestrationMetadata, 511);
                                    r4j0VarA.a(MessageResponseToken.copy$default(jkcVar.d, (String) null, (MessageRequest) null, Message.CreativeMessage.copy$default(messageResponseToken.getMessageData(), null, null, format2, null, null, 0L, null, null, null, 507, null), 3, (Object) null), new 1.1(messageTemplateR));
                                    lxv0Var = new mxv0(gmcVarA, messageResponseToken.getMessageData(), r4j0VarA, yhm0.l(messageResponseToken.getMessageData().getFormat().getTemplate()));
                                } else if (d80VarF instanceof d80) {
                                    lxv0Var = new lxv0(gmc.a(yhm0.o(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), null, orchestrationMetadata, 511), messageResponseToken.getMessageData(), new DiscardReason.InvalidClickActionIdentifier("Unsupported click action(s): ".concat(o7h.y0(d80VarF.a(), null, null, null, null, 63))));
                                } else {
                                    if (!d80VarF.equals(b80.a)) {
                                        eg.o();
                                        return null;
                                    }
                                    lxv0Var = new lxv0(gmc.a(yhm0.o(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), null, orchestrationMetadata, 511), messageResponseToken.getMessageData(), new DiscardReason.PresentationFailed("Action handler registry unavailable for message with actions"));
                                }
                            } else {
                                lxv0Var = new lxv0(gmc.a(yhm0.o(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), null, orchestrationMetadata, 511), messageResponseToken.getMessageData(), new DiscardReason.DynamicTagResolutionFailed("Failed to resolve dynamic tags due to missing fields: " + linkedHashSet));
                            }
                        } else {
                            if (!(hxo1VarJ instanceof vri1)) {
                                eg.o();
                                return null;
                            }
                            vri1 vri1Var = (vri1) hxo1VarJ;
                            ArrayList arrayList = vri1Var.c;
                            Iterator<T> it = vri1Var.d.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                            } while (arrayList.get(0) != ((mmr0) next).a);
                            mmr0 mmr0Var = next;
                            lxv0Var = new lxv0(gmc.a(yhm0.o(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), null, orchestrationMetadata, 511), messageResponseToken.getMessageData(), lh10.a((Rule) arrayList.get(0), mmr0Var != null ? (String) mmr0Var.b : null));
                        }
                        return new dlc(lxv0Var);
                    }
                });
            }
        };
    }
}
