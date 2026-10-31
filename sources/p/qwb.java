package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.Bottomsheet;
import com.spotify.pendragon.v1.proto.Button;
import com.spotify.pendragon.v1.proto.Text;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qwb implements iu30 {
    public final da a;
    public final emv0 b;
    public final ryq c;
    public final da d;
    public final li e;
    public final da f;

    public qwb(da daVar, emv0 emv0Var, ryq ryqVar, da daVar2, li liVar, da daVar3) {
        this.a = daVar;
        this.b = emv0Var;
        this.c = ryqVar;
        this.d = daVar2;
        this.e = liVar;
        this.f = daVar3;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) throws MessageParsingException {
        Disclaimer disclaimer;
        Object next;
        Object next2;
        HeaderContent header;
        AccessoryContent accessoryContent;
        Boolean boolValueOf;
        Bottomsheet bottomsheet = (Bottomsheet) obj;
        Iterator it = bottomsheet.r().iterator();
        do {
            disclaimer = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            boolValueOf = Boolean.valueOf(!((Button) next).o().p().equals("DISMISS"));
            if (bottomsheet.r().size() <= 1) {
                boolValueOf = null;
            }
        } while (!(boolValueOf != null ? boolValueOf.booleanValue() : true));
        Button button = (Button) next;
        Iterator it2 = bottomsheet.r().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((Button) next2) == button);
        Button button2 = (Button) next2;
        int iQ = bottomsheet.q();
        int i = iQ == 0 ? -1 : pwb.a[l1d.C(iQ)];
        da daVar = this.a;
        if (i == 1) {
            return new Format.BottomSheet(new BottomSheetTemplate.BasicBottomSheet(bottomsheet.p().p(), bottomsheet.p().n(), button != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button) : null, button2 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2) : null));
        }
        if (i == 2) {
            return new Format.BottomSheet(new BottomSheetTemplate.RichBottomSheet((Signifier) this.b.invoke(bottomsheet.u().q()), bottomsheet.u().getImageUrl(), bottomsheet.u().p(), bottomsheet.u().n(), button != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button) : null, button2 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2) : null));
        }
        if (i == 3) {
            return new Format.BottomSheet(new BottomSheetTemplate.FullBleedBottomSheet(bottomsheet.t().p(), bottomsheet.t().n(), bottomsheet.t().getImageUrl(), button != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button) : null, button2 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2) : null));
        }
        if (i != 4) {
            throw new MessageParsingException(g4j0.e);
        }
        if (bottomsheet.o().x()) {
            header = new HeaderContent.Header((Header) this.f.invoke(bottomsheet.o().r()));
        } else {
            header = null;
        }
        if (bottomsheet.o().v()) {
            accessoryContent = (AccessoryContent) this.e.invoke(bottomsheet.o().n());
        } else {
            accessoryContent = null;
        }
        Text textS = bottomsheet.o().s();
        ryq ryqVar = this.c;
        MessageText messageText = (MessageText) ryqVar.invoke(textS);
        MessageText messageText2 = (MessageText) ryqVar.invoke(bottomsheet.o().o());
        com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button button3 = bottomsheet.o().y() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(bottomsheet.o().t()) : null;
        com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button button4 = bottomsheet.o().z() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(bottomsheet.o().u()) : null;
        if (bottomsheet.o().w()) {
            disclaimer = (Disclaimer) this.d.invoke(bottomsheet.o().q());
        }
        return new Format.BottomSheet(new BottomSheetTemplate.BaseBottomSheet(header, accessoryContent, messageText, messageText2, button3, button4, disclaimer));
    }
}
