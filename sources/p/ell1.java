package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ell1 implements acr0 {
    public final Set a = Collections.singleton(blc0.INAPPMESSAGEWEBVIEW_SPECIFIC);

    @Override // p.acr0
    public final Set a() {
        return this.a;
    }

    @Override // p.acr0
    public final Class b() {
        return skl1.class;
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Bundle extras = intent.getExtras();
        MessageResponseToken messageResponseToken = extras != null ? (MessageResponseToken) extras.getParcelable("token") : null;
        messageResponseToken.getClass();
        MessageTemplate template = messageResponseToken.getMessageData().getFormat().getTemplate();
        if (template instanceof WebViewTemplate.BasicWebView) {
            WebViewTemplate.BasicWebView basicWebView = (WebViewTemplate.BasicWebView) template;
            return new dll1(messageResponseToken, new iwq(basicWebView.getWebModalUri(), basicWebView.getDismissUriSuffix()), gg.l(intent));
        }
        hhg1.n(cy30.j(template.getClass(), "Unsupported template type: "));
        return null;
    }

    @Override // p.acr0
    public final e6w0 d() {
        return new c6w0(1, false, (hd5) null, 14);
    }

    @Override // p.acr0
    public final String getDescription() {
        return "A webview message that is shown via the messaging platform";
    }
}
