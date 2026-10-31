package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.BaseFullscreen;
import com.spotify.pendragon.v1.proto.Button;
import com.spotify.pendragon.v1.proto.Fullscreen;
import com.spotify.pendragon.v1.proto.Text;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class as30 implements iu30 {
    public final da a;
    public final li b;
    public final gy9 c;
    public final ryq d;
    public final da e;
    public final j141 f;
    public final j141 g;

    public as30(da daVar, li liVar, gy9 gy9Var, ryq ryqVar, da daVar2, j141 j141Var, j141 j141Var2) {
        this.a = daVar;
        this.b = liVar;
        this.c = gy9Var;
        this.d = ryqVar;
        this.e = daVar2;
        this.f = j141Var;
        this.g = j141Var2;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) throws MessageParsingException {
        Fullscreen fullscreen = (Fullscreen) obj;
        int iR = fullscreen.r();
        if ((iR == 0 ? -1 : zr30.a[l1d.C(iR)]) != 1) {
            throw new MessageParsingException(g4j0.e);
        }
        BaseFullscreen baseFullscreenO = fullscreen.o();
        if (!baseFullscreenO.z()) {
            throw new MessageParsingException(g4j0.d);
        }
        BackgroundColor backgroundColor = (BackgroundColor) this.c.invoke(baseFullscreenO.p());
        AccessoryContent accessoryContent = baseFullscreenO.x() ? (AccessoryContent) this.b.invoke(baseFullscreenO.n()) : null;
        Text textU = baseFullscreenO.u();
        ryq ryqVar = this.d;
        MessageText messageText = (MessageText) ryqVar.invoke(textU);
        MessageText messageText2 = (MessageText) ryqVar.invoke(baseFullscreenO.q());
        Button buttonV = baseFullscreenO.v();
        da daVar = this.a;
        return new Format.Fullscreen(new FullscreenTemplate.BaseFullscreen(backgroundColor, accessoryContent, messageText, messageText2, (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(buttonV), baseFullscreenO.A() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(baseFullscreenO.w()) : null, baseFullscreenO.y() ? (Disclaimer) this.e.invoke(baseFullscreenO.t()) : null, (AccessoryContentSize) this.g.invoke(baseFullscreenO.o()), (ContentAlignment) this.f.invoke(baseFullscreenO.r())));
    }
}
