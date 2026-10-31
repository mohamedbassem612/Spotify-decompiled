package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.Button;
import com.spotify.pendragon.v1.proto.Snackbar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wq91 implements iu30 {
    public final li a;
    public final da b;
    public final da c;
    public final ryq d;

    public wq91(da daVar, da daVar2, li liVar, ryq ryqVar) {
        this.a = liVar;
        this.b = daVar;
        this.c = daVar2;
        this.d = ryqVar;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) throws MessageParsingException {
        Header header;
        AccessoryContent accessoryContent;
        Snackbar snackbar = (Snackbar) obj;
        int iS = snackbar.s();
        if ((iS == 0 ? -1 : vq91.a[l1d.C(iS)]) != 1) {
            throw new MessageParsingException(g4j0.e);
        }
        if (snackbar.p().r().q()) {
            header = (Header) this.c.invoke(snackbar.p().r());
        } else {
            header = null;
        }
        MessageText messageText = (MessageText) this.d.invoke(snackbar.p().o());
        if (snackbar.p().t()) {
            accessoryContent = (AccessoryContent) this.a.invoke(snackbar.p().n());
        } else {
            accessoryContent = null;
        }
        Button buttonS = snackbar.p().s();
        boolean zV = buttonS.r().v();
        da daVar = this.b;
        com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button button = (zV || buttonS.r().w()) ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(snackbar.p().s()) : null;
        Button buttonQ = snackbar.p().q();
        return new Format.SnackBar(new SnackBarTemplate.BaseSnackBar(header, messageText, accessoryContent, button, (buttonQ.r().v() || buttonQ.r().w()) ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(snackbar.p().q()) : null), snackbar.o());
    }
}
