package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.Alignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BannerTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.Banner;
import com.spotify.pendragon.v1.proto.Button;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r6a implements iu30 {
    public final da a;
    public final li b;
    public final emv0 c;
    public final gy9 d;
    public final da e;
    public final da f;

    public r6a(da daVar, li liVar, emv0 emv0Var, gy9 gy9Var, da daVar2, da daVar3) {
        this.a = daVar;
        this.b = liVar;
        this.c = emv0Var;
        this.d = gy9Var;
        this.e = daVar2;
        this.f = daVar3;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) throws MessageParsingException {
        Object next;
        Object next2;
        Enum r11;
        EncoreFont encoreFont;
        EncoreFont encoreFont2;
        HeaderContent header;
        Disclaimer disclaimer;
        Boolean boolValueOf;
        Banner banner = (Banner) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(banner.r());
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
        } else {
            button = null;
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
        Button button2 = (Button) next2;
        if (button2 != null) {
            arrayList.remove(button2);
        } else {
            button2 = null;
        }
        Button button3 = (Button) o7h.s0(arrayList);
        int iO = banner.o();
        int i = iO == 0 ? -1 : q6a.a[l1d.C(iO)];
        da daVar = this.a;
        if (i == 1) {
            return new Format.Banner(new BannerTemplate.BasicBanner(banner.q().n(), new MessageText(banner.q().s(), banner.q().r(), (EncoreFont) null, 4, (DefaultConstructorMarker) null), new MessageText(banner.q().p(), banner.q().o(), (EncoreFont) null, 4, (DefaultConstructorMarker) null), button2 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2) : null, button != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button) : null, button3 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button3) : null));
        }
        li liVar = this.b;
        if (i == 2) {
            return new Format.Banner(new BannerTemplate.RichBanner(banner.t().o(), new MessageText(banner.t().t(), banner.t().s(), (EncoreFont) null, 4, (DefaultConstructorMarker) null), new MessageText(banner.t().q(), banner.t().p(), (EncoreFont) null, 4, (DefaultConstructorMarker) null), (AccessoryContent) liVar.invoke(banner.t().n()), button2 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2) : null, button != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button) : null, button3 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button3) : null));
        }
        if (i == 3) {
            return new Format.Banner(new BannerTemplate.SignifierBanner(banner.u().n(), new MessageText(banner.u().s(), banner.u().r(), (EncoreFont) null, 4, (DefaultConstructorMarker) null), new MessageText(banner.u().p(), banner.u().o(), (EncoreFont) null, 4, (DefaultConstructorMarker) null), (Signifier) this.c.invoke(banner.u().t()), button2 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button2) : null, button != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button) : null, button3 != null ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(button3) : null));
        }
        if (i != 4) {
            throw new MessageParsingException(g4j0.e);
        }
        String strName = banner.p().o().name();
        Enum r3 = Alignment.CENTER;
        Enum[] enumArrValues = Alignment.values();
        int length = enumArrValues.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                r11 = null;
                break;
            }
            r11 = enumArrValues[i3];
            if (u890.j(r11.name(), strName)) {
                break;
            }
            i3++;
        }
        Enum r13 = r11 == null ? r3 : r11;
        BackgroundColor backgroundColor = (BackgroundColor) this.d.invoke(banner.p().p());
        AccessoryContent accessoryContent = (AccessoryContent) liVar.invoke(banner.p().n());
        String strP = banner.p().w().p();
        String strQ = banner.p().w().q();
        String strName2 = banner.p().w().o().name();
        EncoreFont encoreFont3 = EncoreFont.UNKNOWN_FONT;
        EncoreFont[] encoreFontArrValues = EncoreFont.values();
        int length2 = encoreFontArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                encoreFont = null;
                break;
            }
            encoreFont = encoreFontArrValues[i4];
            if (u890.j(encoreFont.name(), strName2)) {
                break;
            }
            i4++;
        }
        if (encoreFont != null) {
            encoreFont3 = encoreFont;
        }
        MessageText messageText = new MessageText(strP, strQ, encoreFont3);
        String strP2 = banner.p().q().p();
        String strQ2 = banner.p().q().q();
        String strName3 = banner.p().q().o().name();
        EncoreFont encoreFont4 = EncoreFont.UNKNOWN_FONT;
        EncoreFont[] encoreFontArrValues2 = EncoreFont.values();
        int length3 = encoreFontArrValues2.length;
        while (true) {
            if (i2 >= length3) {
                encoreFont2 = null;
                break;
            }
            encoreFont2 = encoreFontArrValues2[i2];
            if (u890.j(encoreFont2.name(), strName3)) {
                break;
            }
            i2++;
        }
        if (encoreFont2 != null) {
            encoreFont4 = encoreFont2;
        }
        MessageText messageText2 = new MessageText(strP2, strQ2, encoreFont4);
        if (banner.p().C()) {
            header = new HeaderContent.Header((Header) this.e.invoke(banner.p().v()));
        } else {
            header = null;
        }
        com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button button4 = banner.p().D() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(banner.p().x()) : null;
        com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button button5 = banner.p().E() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(banner.p().y()) : null;
        com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button button6 = banner.p().B() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(banner.p().u()) : null;
        com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button button7 = banner.p().z() ? (com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button) daVar.invoke(banner.p().r()) : null;
        if (banner.p().A()) {
            disclaimer = (Disclaimer) this.f.invoke(banner.p().t());
        } else {
            disclaimer = null;
        }
        return new Format.Banner(new BannerTemplate.BaseBanner(r13, backgroundColor, accessoryContent, messageText, messageText2, header, button4, button5, button6, button7, disclaimer));
    }
}
