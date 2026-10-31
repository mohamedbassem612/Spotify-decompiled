package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconName;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.Button;
import com.spotify.pendragon.v1.proto.InlineCard;
import com.spotify.pendragon.v1.proto.Text;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vd80 implements iu30 {
    public final emv0 a;
    public final li b;
    public final ryq c;
    public final da d;
    public final rw9 e;
    public final gy9 f;
    public final da g;

    public vd80(emv0 emv0Var, li liVar, ryq ryqVar, da daVar, rw9 rw9Var, gy9 gy9Var, da daVar2) {
        this.a = emv0Var;
        this.b = liVar;
        this.c = ryqVar;
        this.d = daVar;
        this.e = rw9Var;
        this.f = gy9Var;
        this.g = daVar2;
    }

    public static Signifier a(Signifier signifier) {
        IconName iconName = signifier.getIcon().getIconName();
        if (iconName == IconName.ICON_UNKNOWN || iconName == IconName.UNRECOGNIZED) {
            return null;
        }
        return signifier;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) throws MessageParsingException {
        Object next;
        Object next2;
        Boolean boolValueOf;
        HeaderContent header;
        InlineCard inlineCard = (InlineCard) obj;
        int iS = inlineCard.s();
        int i = iS == 0 ? -1 : ud80.a[l1d.C(iS)];
        rw9 rw9Var = this.e;
        emv0 emv0Var = this.a;
        li liVar = this.b;
        da daVar = this.d;
        if (i != 1) {
            if (i == 2) {
                Signifier signifierA = a((Signifier) emv0Var.invoke(inlineCard.q().v()));
                MessageText messageText = new MessageText(inlineCard.q().t(), inlineCard.q().u(), (EncoreFont) null, 4, (DefaultConstructorMarker) null);
                MessageText messageText2 = inlineCard.q().w() ? new MessageText(inlineCard.q().q(), inlineCard.q().r(), (EncoreFont) null, 4, (DefaultConstructorMarker) null) : null;
                BackgroundColor backgroundColor = (BackgroundColor) rw9Var.invoke(inlineCard.q().p());
                AccessoryContent accessoryContent = (AccessoryContent) liVar.invoke(inlineCard.q().o());
                Button button = (Button) o7h.s0(inlineCard.p());
                if (button != null) {
                    return new Format.InlineCard(new InlineCardTemplate.CompactInlineCard(signifierA, messageText, messageText2, backgroundColor, accessoryContent, (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button)));
                }
                throw new MessageParsingException(g4j0.d);
            }
            if (i == 3) {
                Signifier signifierA2 = a((Signifier) emv0Var.invoke(inlineCard.t().t()));
                MessageText messageText3 = new MessageText(inlineCard.t().r(), inlineCard.t().s(), (EncoreFont) null, 4, (DefaultConstructorMarker) null);
                BackgroundColor backgroundColor2 = (BackgroundColor) rw9Var.invoke(inlineCard.t().p());
                AccessoryContent accessoryContent2 = (AccessoryContent) liVar.invoke(inlineCard.t().o());
                Button button2 = (Button) o7h.s0(inlineCard.p());
                if (button2 != null) {
                    return new Format.InlineCard(new InlineCardTemplate.MicroCompactInlineCard(signifierA2, messageText3, backgroundColor2, accessoryContent2, (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2)));
                }
                throw new MessageParsingException(g4j0.d);
            }
            if (i != 4) {
                throw new MessageParsingException(g4j0.e);
            }
            BackgroundColor backgroundColor3 = (BackgroundColor) this.f.invoke(inlineCard.o().p());
            Text textV = inlineCard.o().v();
            ryq ryqVar = this.c;
            MessageText messageText4 = (MessageText) ryqVar.invoke(textV);
            MessageText messageText5 = inlineCard.o().z() ? (MessageText) ryqVar.invoke(inlineCard.o().q()) : null;
            if (inlineCard.o().C()) {
                header = new HeaderContent.Header((Header) this.g.invoke(inlineCard.o().u()));
            } else {
                header = null;
            }
            return new Format.InlineCard(new InlineCardTemplate.BaseInlineCard(messageText4, messageText5, header, backgroundColor3, inlineCard.o().y() ? (AccessoryContent) liVar.invoke(inlineCard.o().o()) : null, inlineCard.o().D() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(inlineCard.o().w()) : null, inlineCard.o().E() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(inlineCard.o().x()) : null, inlineCard.o().A() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(inlineCard.o().r()) : null, inlineCard.o().B() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(inlineCard.o().t()) : null));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(inlineCard.p());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((Button) next).q(), "dismissCta"));
        Button button3 = (Button) next;
        if (button3 != null) {
            arrayList.remove(button3);
        } else {
            button3 = null;
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
        } while (!(boolValueOf != null ? boolValueOf.booleanValue() : true));
        Button button4 = (Button) next2;
        if (button4 != null) {
            arrayList.remove(button4);
        } else {
            button4 = null;
        }
        Signifier signifierA3 = a((Signifier) emv0Var.invoke(inlineCard.u().v()));
        MessageText messageText6 = new MessageText(inlineCard.u().t(), inlineCard.u().u(), (EncoreFont) null, 4, (DefaultConstructorMarker) null);
        MessageText messageText7 = new MessageText(inlineCard.u().q(), inlineCard.u().r(), (EncoreFont) null, 4, (DefaultConstructorMarker) null);
        BackgroundColor backgroundColor4 = (BackgroundColor) rw9Var.invoke(inlineCard.u().p());
        AccessoryContent accessoryContent3 = (AccessoryContent) liVar.invoke(inlineCard.u().o());
        if (button4 != null) {
            return new Format.InlineCard(new InlineCardTemplate.StandardInlineCard(signifierA3, messageText6, messageText7, backgroundColor4, accessoryContent3, (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button4), button3 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button3) : null));
        }
        throw new MessageParsingException(g4j0.d);
    }
}
