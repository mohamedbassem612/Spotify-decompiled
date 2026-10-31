package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.Button;
import com.spotify.pendragon.v1.proto.Html;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b170 implements iu30 {
    public final da a;

    public b170(da daVar) {
        this.a = daVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p.iu30
    public final Object invoke(Object obj) throws MessageParsingException {
        Html html = (Html) obj;
        String strY = cy30.y(html.r());
        int iHashCode = strY.hashCode();
        da daVar = this.a;
        switch (iHashCode) {
            case 73532045:
                if (strY.equals("MODAL")) {
                    String strP = html.p();
                    h290<Button> h290VarQ = html.t().q();
                    ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
                    for (Button button : h290VarQ) {
                        button.getClass();
                        arrayList.add((com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button));
                    }
                    return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html.Modal(new ModalTemplate.JitModal(strP, arrayList));
                }
                break;
            case 595158971:
                if (strY.equals("FULLSCREEN")) {
                    String strP2 = html.p();
                    h290<Button> h290VarP = html.s().p();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
                    for (Button button2 : h290VarP) {
                        button2.getClass();
                        arrayList2.add((com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2));
                    }
                    return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html.Fullscreen(new FullscreenTemplate.JitFullscreen(strP2, arrayList2));
                }
                break;
            case 1055250693:
                if (strY.equals("SNACKBAR")) {
                    String strP3 = html.p();
                    h290<Button> h290VarQ2 = html.u().q();
                    ArrayList arrayList3 = new ArrayList(q7h.U(h290VarQ2, 10));
                    for (Button button3 : h290VarQ2) {
                        button3.getClass();
                        arrayList3.add((com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button3));
                    }
                    return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html.SnackBar(new SnackBarTemplate.JitSnackBar(strP3, arrayList3));
                }
                break;
            case 1951953708:
                if (strY.equals("BANNER")) {
                    String strP4 = html.p();
                    h290<Button> h290VarR = html.o().r();
                    ArrayList arrayList4 = new ArrayList(q7h.U(h290VarR, 10));
                    for (Button button4 : h290VarR) {
                        button4.getClass();
                        arrayList4.add((com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button4));
                    }
                    return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Html.Banner(new BannerTemplate.JitBanner(strP4, arrayList4));
                }
                break;
        }
        throw new MessageParsingException(g4j0.f);
    }
}
