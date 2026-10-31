package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.Webview;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class djl1 implements iu30 {
    @Override // p.iu30
    public final Object invoke(Object obj) throws MessageParsingException {
        Webview webview = (Webview) obj;
        int iQ = webview.q();
        if ((iQ == 0 ? -1 : cjl1.a[l1d.C(iQ)]) == 1) {
            return new Format.WebView(new WebViewTemplate.BasicWebView(webview.o().p(), webview.o().o()));
        }
        throw new MessageParsingException(g4j0.e);
    }
}
