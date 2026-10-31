package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.BaseModal;
import com.spotify.pendragon.v1.proto.Button;
import com.spotify.pendragon.v1.proto.Modal;
import com.spotify.pendragon.v1.proto.Text;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kem0 implements iu30 {
    public final da a;
    public final li b;
    public final gy9 c;
    public final ryq d;
    public final da e;
    public final j141 f;
    public final j141 g;

    public kem0(da daVar, li liVar, gy9 gy9Var, ryq ryqVar, da daVar2, j141 j141Var, j141 j141Var2) {
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
        Object next;
        Object next2;
        Boolean boolValueOf;
        Modal modal = (Modal) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(modal.q());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((Button) next).q(), "dismissCta"));
        Button button = (Button) next;
        if (button != null) {
            arrayList.remove(button);
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            boolValueOf = Boolean.valueOf(!((Button) next2).o().p().equals("DISMISS"));
            if (arrayList.size() <= 1) {
                boolValueOf = null;
            }
        } while (u890.j(boolValueOf, Boolean.FALSE));
        Button button2 = (Button) next2;
        if (button2 != null) {
            arrayList.remove(button2);
        } else {
            button2 = null;
        }
        int iS = modal.s();
        int i = iS == 0 ? -1 : jem0.a[l1d.C(iS)];
        li liVar = this.b;
        da daVar = this.a;
        if (i == 1) {
            return new Format.Modal(new ModalTemplate.BasicModal((BackgroundColor) null, new MessageText(modal.p().q(), (String) null, (EncoreFont) null, 6, (DefaultConstructorMarker) null), new MessageText(modal.p().o(), (String) null, (EncoreFont) null, 6, (DefaultConstructorMarker) null), (AccessoryContent) liVar.invoke(modal.p().n()), (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) (button2 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2) : null), (AccessoryContentSize) null, (ContentAlignment) null, 96, (DefaultConstructorMarker) null));
        }
        if (i != 2) {
            throw new MessageParsingException(g4j0.e);
        }
        BaseModal baseModalO = modal.o();
        if (!baseModalO.z()) {
            throw new MessageParsingException(g4j0.d);
        }
        BackgroundColor backgroundColor = (BackgroundColor) this.c.invoke(baseModalO.p());
        AccessoryContent accessoryContent = baseModalO.x() ? (AccessoryContent) liVar.invoke(baseModalO.n()) : null;
        Text textU = baseModalO.u();
        ryq ryqVar = this.d;
        return new Format.Modal(new ModalTemplate.BaseModal(backgroundColor, accessoryContent, (MessageText) ryqVar.invoke(textU), (MessageText) ryqVar.invoke(baseModalO.q()), (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(baseModalO.v()), baseModalO.A() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(baseModalO.w()) : null, baseModalO.y() ? (Disclaimer) this.e.invoke(baseModalO.t()) : null, (AccessoryContentSize) this.f.invoke(baseModalO.o()), (ContentAlignment) this.g.invoke(baseModalO.r())));
    }
}
