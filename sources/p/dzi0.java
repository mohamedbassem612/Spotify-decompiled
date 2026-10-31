package p;

import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent$Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Text;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dzi0 implements zpg0 {
    @Override // p.zpg0
    public final HubsImmutableComponentBundle a(Parcelable parcelable) {
        Format format = (Format) parcelable;
        MessageTemplate template = format.getTemplate();
        if (template instanceof InlineCardTemplate.StandardInlineCard) {
            return zd70.j(format);
        }
        if (template instanceof InlineCardTemplate.CompactInlineCard) {
            return zd70.j(format);
        }
        if (template instanceof InlineCardTemplate.MicroCompactInlineCard) {
            return zd70.j(format);
        }
        if (template instanceof InlineCardTemplate.BaseInlineCard) {
            return zd70.j(format);
        }
        if (template instanceof InlineCardTemplate.Undefined) {
            return zd70.j(format);
        }
        hhg1.g(format, "Unknown template type: ");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    @Override // p.zpg0
    public final Object b(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        Object obj;
        MessageText messageText;
        HeaderContent.HeaderText headerText;
        HeaderContent.HeaderText headerContent$Header;
        String strB = hubsImmutableComponentBundle.B("format_type");
        strB.getClass();
        switch (strB.hashCode()) {
            case -1705262047:
                obj = null;
                if (strB.equals("templateType_compactInlineCard")) {
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG2 = hubsImmutableComponentBundleG.g("template_signifier");
                    Signifier signifierP = hubsImmutableComponentBundleG2 != null ? zd70.p(hubsImmutableComponentBundleG2) : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG3 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG3.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG4 = hubsImmutableComponentBundleG3.g("template_headline");
                    hubsImmutableComponentBundleG4.getClass();
                    MessageText messageTextO = zd70.o(hubsImmutableComponentBundleG4);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG5 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG5.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG6 = hubsImmutableComponentBundleG5.g("template_body");
                    MessageText messageTextO2 = hubsImmutableComponentBundleG6 != null ? zd70.o(hubsImmutableComponentBundleG6) : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG7 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG7.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG8 = hubsImmutableComponentBundleG7.g("template_backgroundColor");
                    hubsImmutableComponentBundleG8.getClass();
                    BackgroundColor backgroundColorC = zd70.c(hubsImmutableComponentBundleG8);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG9 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG9.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG10 = hubsImmutableComponentBundleG9.g("template_accessoryContent");
                    AccessoryContent accessoryContentB = hubsImmutableComponentBundleG10 != null ? zd70.b(hubsImmutableComponentBundleG10) : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG11 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG11.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG12 = hubsImmutableComponentBundleG11.g("template_cardButton");
                    hubsImmutableComponentBundleG12.getClass();
                    return new Format.InlineCard(new InlineCardTemplate.CompactInlineCard(signifierP, messageTextO, messageTextO2, backgroundColorC, accessoryContentB, zd70.d(hubsImmutableComponentBundleG12)));
                }
                hhg1.n("Unknown template type: ".concat(strB));
                return obj;
            case -829777103:
                obj = null;
                if (strB.equals("templateType_standardInlineCard")) {
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG13 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG13.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG14 = hubsImmutableComponentBundleG13.g("template_signifier");
                    Signifier signifierP2 = hubsImmutableComponentBundleG14 != null ? zd70.p(hubsImmutableComponentBundleG14) : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG15 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG15.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG16 = hubsImmutableComponentBundleG15.g("template_headline");
                    hubsImmutableComponentBundleG16.getClass();
                    MessageText messageTextO3 = zd70.o(hubsImmutableComponentBundleG16);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG17 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG17.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG18 = hubsImmutableComponentBundleG17.g("template_body");
                    hubsImmutableComponentBundleG18.getClass();
                    MessageText messageTextO4 = zd70.o(hubsImmutableComponentBundleG18);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG19 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG19.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG20 = hubsImmutableComponentBundleG19.g("template_backgroundColor");
                    hubsImmutableComponentBundleG20.getClass();
                    BackgroundColor backgroundColorC2 = zd70.c(hubsImmutableComponentBundleG20);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG21 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG21.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG22 = hubsImmutableComponentBundleG21.g("template_accessoryContent");
                    AccessoryContent accessoryContentB2 = hubsImmutableComponentBundleG22 != null ? zd70.b(hubsImmutableComponentBundleG22) : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG23 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG23.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG24 = hubsImmutableComponentBundleG23.g("template_primaryButton");
                    hubsImmutableComponentBundleG24.getClass();
                    Button buttonD = zd70.d(hubsImmutableComponentBundleG24);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG25 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG25.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG26 = hubsImmutableComponentBundleG25.g("template_closeButton");
                    return new Format.InlineCard(new InlineCardTemplate.StandardInlineCard(signifierP2, messageTextO3, messageTextO4, backgroundColorC2, accessoryContentB2, buttonD, hubsImmutableComponentBundleG26 != null ? zd70.d(hubsImmutableComponentBundleG26) : null));
                }
                hhg1.n("Unknown template type: ".concat(strB));
                return obj;
            case 217965989:
                obj = null;
                if (strB.equals("templateType_undefined")) {
                    return new Format.InlineCard(InlineCardTemplate.Undefined.INSTANCE);
                }
                hhg1.n("Unknown template type: ".concat(strB));
                return obj;
            case 1331615685:
                if (strB.equals("templateType_baseInlineCard")) {
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG27 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG27.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG28 = hubsImmutableComponentBundleG27.g("template_headerContent");
                    if (hubsImmutableComponentBundleG28 != null) {
                        String strB2 = hubsImmutableComponentBundleG28.B("headerContent_type");
                        if (strB2 != null) {
                            switch (strB2) {
                                case "headerContentType_header":
                                    HubsImmutableComponentBundle hubsImmutableComponentBundleG29 = hubsImmutableComponentBundleG28.g("header_text");
                                    hubsImmutableComponentBundleG29.getClass();
                                    messageText = null;
                                    String strB3 = hubsImmutableComponentBundleG29.B("messageText_text");
                                    strB3.getClass();
                                    String strB4 = hubsImmutableComponentBundleG29.B("messageText_textColor");
                                    strB4.getClass();
                                    Text text = new Text(strB3, strB4);
                                    HubsImmutableComponentBundle hubsImmutableComponentBundleG30 = hubsImmutableComponentBundleG28.g("header_icon");
                                    headerContent$Header = new HeaderContent$Header(new Header(text, hubsImmutableComponentBundleG30 != null ? zd70.n(hubsImmutableComponentBundleG30) : null));
                                    break;
                                case "headerContentType_notSet":
                                    headerContent$Header = HeaderContent.NotSet.INSTANCE;
                                    messageText = null;
                                    break;
                                case "headerContentType_signifier":
                                    HubsImmutableComponentBundle hubsImmutableComponentBundleG31 = hubsImmutableComponentBundleG28.g("headerContentType_signifier");
                                    hubsImmutableComponentBundleG31.getClass();
                                    Signifier signifierP3 = zd70.p(hubsImmutableComponentBundleG31);
                                    signifierP3.getClass();
                                    headerContent$Header = new HeaderContent.Signifier(signifierP3);
                                    messageText = null;
                                    break;
                                case "headerContentType_headerText":
                                    HubsImmutableComponentBundle hubsImmutableComponentBundleG32 = hubsImmutableComponentBundleG28.g("headerContentType_headerText");
                                    hubsImmutableComponentBundleG32.getClass();
                                    String strB5 = hubsImmutableComponentBundleG32.B("messageText_text");
                                    strB5.getClass();
                                    String strB6 = hubsImmutableComponentBundleG32.B("messageText_textColor");
                                    strB6.getClass();
                                    headerContent$Header = new HeaderContent.HeaderText(new Text(strB5, strB6));
                                    messageText = null;
                                    break;
                                default:
                                    messageText = null;
                                    headerContent$Header = null;
                                    break;
                            }
                        } else {
                            messageText = null;
                            headerContent$Header = null;
                        }
                        headerText = headerContent$Header;
                    } else {
                        messageText = null;
                        headerText = null;
                    }
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG33 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG33.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG34 = hubsImmutableComponentBundleG33.g("template_headline");
                    hubsImmutableComponentBundleG34.getClass();
                    MessageText messageTextO5 = zd70.o(hubsImmutableComponentBundleG34);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG35 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG35.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG36 = hubsImmutableComponentBundleG35.g("template_body");
                    MessageText messageTextO6 = hubsImmutableComponentBundleG36 != null ? zd70.o(hubsImmutableComponentBundleG36) : messageText;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG37 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG37.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG38 = hubsImmutableComponentBundleG37.g("template_backgroundColor");
                    hubsImmutableComponentBundleG38.getClass();
                    BackgroundColor backgroundColorC3 = zd70.c(hubsImmutableComponentBundleG38);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG39 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG39.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG40 = hubsImmutableComponentBundleG39.g("template_accessoryContent");
                    MessageText messageTextB = hubsImmutableComponentBundleG40 != null ? zd70.b(hubsImmutableComponentBundleG40) : messageText;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG41 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG41.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG42 = hubsImmutableComponentBundleG41.g("template_primaryButton");
                    MessageText messageTextD = hubsImmutableComponentBundleG42 != null ? zd70.d(hubsImmutableComponentBundleG42) : messageText;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG43 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG43.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG44 = hubsImmutableComponentBundleG43.g("template_secondaryButton");
                    MessageText messageTextD2 = hubsImmutableComponentBundleG44 != null ? zd70.d(hubsImmutableComponentBundleG44) : messageText;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG45 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG45.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG46 = hubsImmutableComponentBundleG45.g("template_dismissButton");
                    MessageText messageTextD3 = hubsImmutableComponentBundleG46 != null ? zd70.d(hubsImmutableComponentBundleG46) : messageText;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG47 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG47.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG48 = hubsImmutableComponentBundleG47.g("template_cardButton");
                    return new Format.InlineCard(new InlineCardTemplate.BaseInlineCard(messageTextO5, messageTextO6, headerText, backgroundColorC3, messageTextB, messageTextD, messageTextD2, hubsImmutableComponentBundleG48 != null ? zd70.d(hubsImmutableComponentBundleG48) : messageText, messageTextD3));
                }
                obj = null;
                hhg1.n("Unknown template type: ".concat(strB));
                return obj;
            case 1932276787:
                if (strB.equals("templateType_microCompactInlineCard")) {
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG49 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG49.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG50 = hubsImmutableComponentBundleG49.g("template_signifier");
                    Signifier signifierP4 = hubsImmutableComponentBundleG50 != null ? zd70.p(hubsImmutableComponentBundleG50) : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG51 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG51.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG52 = hubsImmutableComponentBundleG51.g("template_headline");
                    hubsImmutableComponentBundleG52.getClass();
                    MessageText messageTextO7 = zd70.o(hubsImmutableComponentBundleG52);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG53 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG53.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG54 = hubsImmutableComponentBundleG53.g("template_backgroundColor");
                    hubsImmutableComponentBundleG54.getClass();
                    BackgroundColor backgroundColorC4 = zd70.c(hubsImmutableComponentBundleG54);
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG55 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG55.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG56 = hubsImmutableComponentBundleG55.g("template_accessoryContent");
                    AccessoryContent accessoryContentB3 = hubsImmutableComponentBundleG56 != null ? zd70.b(hubsImmutableComponentBundleG56) : null;
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG57 = hubsImmutableComponentBundle.g("format_template");
                    hubsImmutableComponentBundleG57.getClass();
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG58 = hubsImmutableComponentBundleG57.g("template_cardButton");
                    hubsImmutableComponentBundleG58.getClass();
                    return new Format.InlineCard(new InlineCardTemplate.MicroCompactInlineCard(signifierP4, messageTextO7, backgroundColorC4, accessoryContentB3, zd70.d(hubsImmutableComponentBundleG58)));
                }
                obj = null;
                hhg1.n("Unknown template type: ".concat(strB));
                return obj;
            default:
                obj = null;
                hhg1.n("Unknown template type: ".concat(strB));
                return obj;
        }
    }
}
