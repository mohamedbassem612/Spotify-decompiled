package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ViewRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qjg implements ljg {
    public final c5j0 a;
    public final tek1 b;
    public final emc c;
    public final Scheduler d;

    public qjg(c5j0 c5j0Var, tek1 tek1Var, emc emcVar, Scheduler scheduler) {
        this.a = c5j0Var;
        this.b = tek1Var;
        this.c = emcVar;
        this.d = scheduler;
    }

    @Override // p.ljg
    public final Single a(String str, TriggerType triggerType, List list, tv80 tv80Var, String str2, uy31 uy31Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, d3j0 d3j0Var) {
        i5j0 i5j0Var = (i5j0) this.a;
        return Single.defer(new d5j0(list, new MessageRequest(str, triggerType, list, tv80Var, str2, uy31Var, dynamicTagsMetadata, conflictResolutionStrategy, d3j0Var), ulc.p(), i5j0Var));
    }

    @Override // p.ljg
    public final void b(String str, DismissReason dismissReason) {
        ((fjc) ((uek1) this.b).d).a.onNext(new ofu(str, dismissReason));
    }

    @Override // p.ljg
    public final Observable d(ViewRequest viewRequest) {
        o6w0 o6w0Var;
        Context context = viewRequest.getContext();
        iac0 lifecycleOwner = viewRequest.getLifecycleOwner();
        MessageResponseToken token = viewRequest.getToken();
        DynamicTagsMetadata dynamicTagsMetadata = viewRequest.getDynamicTagsMetadata();
        viewRequest.getUiLifecycle();
        uy31 displayRulesConfig = viewRequest.getDisplayRulesConfig();
        d3j0 orchestrationMetadata = viewRequest.getOrchestrationMetadata();
        uek1 uek1Var = (uek1) this.b;
        uek1Var.getClass();
        ReplaySubject replaySubjectG = ReplaySubject.g(1);
        vz21 vz21Var = new vz21(new WeakReference(lifecycleOwner), replaySubjectG);
        ojc ojcVar = uek1Var.c;
        p6w0 p6w0Var = uek1Var.b;
        MessageTemplate template = token.getMessageData().getFormat().getTemplate();
        p6w0Var.getClass();
        if (template instanceof BannerTemplate) {
            BannerTemplate bannerTemplate = (BannerTemplate) template;
            ynb0 ynb0Var = p6w0Var.a;
            if (!(bannerTemplate instanceof BannerTemplate.BasicBanner) && !(bannerTemplate instanceof BannerTemplate.JitBanner) && !(bannerTemplate instanceof BannerTemplate.RichBanner) && !(bannerTemplate instanceof BannerTemplate.SignifierBanner) && !(bannerTemplate instanceof BannerTemplate.CustomBanner) && !(bannerTemplate instanceof BannerTemplate.BaseBanner)) {
                if (bannerTemplate instanceof BannerTemplate.Undefined) {
                    hhg1.n("Undefined banner template");
                    return null;
                }
                eg.o();
                return null;
            }
            o6w0Var = (o6w0) ynb0Var.get();
        } else if (template instanceof ModalTemplate) {
            ModalTemplate modalTemplate = (ModalTemplate) template;
            ynb0 ynb0Var2 = p6w0Var.b;
            if (!(modalTemplate instanceof ModalTemplate.BaseModal) && !(modalTemplate instanceof ModalTemplate.BasicModal) && !(modalTemplate instanceof ModalTemplate.JitModal)) {
                if (modalTemplate instanceof ModalTemplate.Undefined) {
                    hhg1.n("Undefined modal template");
                    return null;
                }
                eg.o();
                return null;
            }
            o6w0Var = (o6w0) ynb0Var2.get();
        } else if (template instanceof FullscreenTemplate) {
            FullscreenTemplate fullscreenTemplate = (FullscreenTemplate) template;
            ynb0 ynb0Var3 = p6w0Var.c;
            if (!(fullscreenTemplate instanceof FullscreenTemplate.BaseFullscreen) && !(fullscreenTemplate instanceof FullscreenTemplate.JitFullscreen)) {
                if (fullscreenTemplate instanceof FullscreenTemplate.Undefined) {
                    hhg1.n("Undefined fullscreen template");
                    return null;
                }
                eg.o();
                return null;
            }
            o6w0Var = (o6w0) ynb0Var3.get();
        } else if (template instanceof SnackBarTemplate) {
            SnackBarTemplate snackBarTemplate = (SnackBarTemplate) template;
            ynb0 ynb0Var4 = p6w0Var.h;
            if (!(snackBarTemplate instanceof SnackBarTemplate.JitSnackBar) && !(snackBarTemplate instanceof SnackBarTemplate.BaseSnackBar) && !(snackBarTemplate instanceof SnackBarTemplate.CustomSnackbar)) {
                if (snackBarTemplate instanceof SnackBarTemplate.Undefined) {
                    hhg1.n("Undefined snackbar template");
                    return null;
                }
                eg.o();
                return null;
            }
            o6w0Var = (o6w0) ynb0Var4.get();
        } else if (template instanceof BottomSheetTemplate) {
            BottomSheetTemplate bottomSheetTemplate = (BottomSheetTemplate) template;
            ynb0 ynb0Var5 = p6w0Var.d;
            if (!(bottomSheetTemplate instanceof BottomSheetTemplate.BasicBottomSheet) && !(bottomSheetTemplate instanceof BottomSheetTemplate.RichBottomSheet) && !(bottomSheetTemplate instanceof BottomSheetTemplate.FullBleedBottomSheet) && !(bottomSheetTemplate instanceof BottomSheetTemplate.CustomBottomSheet) && !(bottomSheetTemplate instanceof BottomSheetTemplate.BaseBottomSheet)) {
                if (bottomSheetTemplate instanceof BottomSheetTemplate.Undefined) {
                    hhg1.n("Undefined bottomsheet template");
                    return null;
                }
                eg.o();
                return null;
            }
            o6w0Var = (o6w0) ynb0Var5.get();
        } else if (template instanceof TooltipTemplate) {
            TooltipTemplate tooltipTemplate = (TooltipTemplate) template;
            ynb0 ynb0Var6 = p6w0Var.e;
            if (!(tooltipTemplate instanceof TooltipTemplate.BaseTooltip) && !(tooltipTemplate instanceof TooltipTemplate.CustomTooltip)) {
                if (tooltipTemplate instanceof TooltipTemplate.Undefined) {
                    hhg1.n("Undefined tooltip template");
                    return null;
                }
                eg.o();
                return null;
            }
            o6w0Var = (o6w0) ynb0Var6.get();
        } else if (template instanceof InlineCardTemplate) {
            InlineCardTemplate inlineCardTemplate = (InlineCardTemplate) template;
            ynb0 ynb0Var7 = p6w0Var.f;
            if (!(inlineCardTemplate instanceof InlineCardTemplate.StandardInlineCard) && !(inlineCardTemplate instanceof InlineCardTemplate.CompactInlineCard) && !(inlineCardTemplate instanceof InlineCardTemplate.MicroCompactInlineCard) && !(inlineCardTemplate instanceof InlineCardTemplate.BaseInlineCard)) {
                if (inlineCardTemplate instanceof InlineCardTemplate.Undefined) {
                    hhg1.n("Undefined inline card template");
                    return null;
                }
                eg.o();
                return null;
            }
            o6w0Var = (o6w0) ynb0Var7.get();
        } else {
            if (!(template instanceof WebViewTemplate)) {
                hhg1.n("Unsupported format metadata");
                return null;
            }
            WebViewTemplate webViewTemplate = (WebViewTemplate) template;
            if (!(webViewTemplate instanceof WebViewTemplate.BasicWebView)) {
                if (webViewTemplate instanceof WebViewTemplate.Undefined) {
                    hhg1.n("Undefined webview template");
                    return null;
                }
                eg.o();
                return null;
            }
            o6w0Var = (o6w0) p6w0Var.g.get();
        }
        ((pjc) ojcVar).a.onNext(new o6j0(context, token, o6w0Var, dynamicTagsMetadata, displayRulesConfig, orchestrationMetadata, lifecycleOwner));
        hmc hmcVar = uek1Var.a;
        hmcVar.a.put(token.getRequestId(), vz21Var);
        lifecycleOwner.getLifecycle().a(new zw3(uek1Var, token, replaySubjectG, (byte) 5));
        return replaySubjectG.subscribeOn(this.d);
    }

    @Override // p.ljg
    public final emc e() {
        return this.c;
    }
}
