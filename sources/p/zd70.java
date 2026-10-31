package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.InteractionType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent$Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconName;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ImageStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Text;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.InlineCardTemplate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class zd70 {
    public static final String a(InlineCardTemplate inlineCardTemplate) {
        if (inlineCardTemplate instanceof InlineCardTemplate.Undefined) {
            return "templateType_undefined";
        }
        if (inlineCardTemplate instanceof InlineCardTemplate.StandardInlineCard) {
            return "templateType_standardInlineCard";
        }
        if (inlineCardTemplate instanceof InlineCardTemplate.CompactInlineCard) {
            return "templateType_compactInlineCard";
        }
        if (inlineCardTemplate instanceof InlineCardTemplate.MicroCompactInlineCard) {
            return "templateType_microCompactInlineCard";
        }
        if (inlineCardTemplate instanceof InlineCardTemplate.BaseInlineCard) {
            return "templateType_baseInlineCard";
        }
        hhg1.g(inlineCardTemplate, "Unknown template type: ");
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final AccessoryContent b(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        String strB = hubsImmutableComponentBundle.B("accessoryContent_type");
        strB.getClass();
        switch (strB.hashCode()) {
            case -2050561937:
                if (strB.equals("accessoryContentType_empty")) {
                    return AccessoryContent.Empty.INSTANCE;
                }
                break;
            case -2046882691:
                if (strB.equals("accessoryContentType_image")) {
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG = hubsImmutableComponentBundle.g("accessoryContentType_image");
                    hubsImmutableComponentBundleG.getClass();
                    String strB2 = hubsImmutableComponentBundleG.B("accessoryImage_imageUrl");
                    strB2.getClass();
                    String strB3 = hubsImmutableComponentBundleG.B("accessoryImage_imageStyle");
                    strB3.getClass();
                    return new AccessoryContent.Image(new AccessoryImage(strB2, ImageStyle.valueOf(strB3)));
                }
                break;
            case 1116685741:
                if (strB.equals("accessoryContentType_notSet")) {
                    return AccessoryContent.NotSet.INSTANCE;
                }
                break;
            case 1180888343:
                if (strB.equals("accessoryContentType_icon")) {
                    HubsImmutableComponentBundle hubsImmutableComponentBundleG2 = hubsImmutableComponentBundle.g("accessoryContentType_icon");
                    hubsImmutableComponentBundleG2.getClass();
                    return new AccessoryContent.Icon(n(hubsImmutableComponentBundleG2));
                }
                break;
        }
        hhg1.n(l1d.m("Unknown accessory content type: ", hubsImmutableComponentBundle.B("accessoryContent_type")));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final BackgroundColor c(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        String strB = hubsImmutableComponentBundle.B("background_type");
        strB.getClass();
        switch (strB.hashCode()) {
            case -1242673145:
                if (strB.equals("backgroundType_gradient")) {
                    String strB2 = hubsImmutableComponentBundle.B("gradientBackgroundColor_startColor");
                    strB2.getClass();
                    String strB3 = hubsImmutableComponentBundle.B("gradientBackgroundColor_endColor");
                    strB3.getClass();
                    Double d = (Double) hubsImmutableComponentBundle.k("gradientBackgroundColor_degrees", vc70.a);
                    d.getClass();
                    return new BackgroundColor.GradientBackgroundColor(strB2, strB3, d.doubleValue());
                }
                break;
            case -1192503324:
                if (strB.equals("backgroundType_image")) {
                    String strB4 = hubsImmutableComponentBundle.B("imageUrlBackgroundColor_imageUrl");
                    strB4.getClass();
                    return new BackgroundColor.ImageUrl(strB4);
                }
                break;
            case -1183197900:
                if (strB.equals("backgroundType_solid")) {
                    String strB5 = hubsImmutableComponentBundle.B("solidBackgroundColor_color");
                    strB5.getClass();
                    return new BackgroundColor.SolidBackgroundColor(strB5);
                }
                break;
            case 1832642342:
                if (strB.equals("backgroundType_notSet")) {
                    return BackgroundColor.NotSet.INSTANCE;
                }
                break;
        }
        hhg1.n(l1d.m("Unknown background color type: ", hubsImmutableComponentBundle.B("background_type")));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    public static final Button d(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        ButtonIconAlignment buttonIconAlignmentValueOf;
        String strB = hubsImmutableComponentBundle.B("button_identifier");
        strB.getClass();
        HubsImmutableComponentBundle hubsImmutableComponentBundleG = hubsImmutableComponentBundle.g("button_style");
        hubsImmutableComponentBundleG.getClass();
        String strF = hubsImmutableComponentBundleG.F("buttonStyle_text", "");
        String strB2 = hubsImmutableComponentBundleG.B("buttonStyle_textColor");
        HubsImmutableComponentBundle hubsImmutableComponentBundleG2 = hubsImmutableComponentBundleG.g("buttonStyle_icon");
        Map mapT = null;
        Icon iconN = hubsImmutableComponentBundleG2 != null ? n(hubsImmutableComponentBundleG2) : null;
        String strB3 = hubsImmutableComponentBundleG.B("buttonStyle_backgroundColor");
        String strB4 = hubsImmutableComponentBundleG.B("buttonStyle_buttonType");
        ButtonType buttonTypeValueOf = strB4 != null ? ButtonType.valueOf(strB4) : null;
        String strB5 = hubsImmutableComponentBundleG.B("buttonStyle_buttonIconAlignment");
        if (strB5 != null) {
            try {
                buttonIconAlignmentValueOf = ButtonIconAlignment.valueOf(strB5);
            } catch (IllegalArgumentException unused) {
                buttonIconAlignmentValueOf = ButtonIconAlignment.LEADING;
            }
            if (buttonIconAlignmentValueOf == null) {
                buttonIconAlignmentValueOf = ButtonIconAlignment.LEADING;
            }
        } else {
            buttonIconAlignmentValueOf = ButtonIconAlignment.LEADING;
        }
        ButtonStyle buttonStyle = new ButtonStyle(strF, strB3, strB2, iconN, buttonTypeValueOf, (EncoreFont) null, buttonIconAlignmentValueOf, 32, (DefaultConstructorMarker) null);
        HubsImmutableComponentBundle hubsImmutableComponentBundleG3 = hubsImmutableComponentBundle.g("button_clickAction");
        hubsImmutableComponentBundleG3.getClass();
        String strB6 = hubsImmutableComponentBundleG3.B("clickAction_clickActionIdentifier");
        strB6.getClass();
        String strB7 = hubsImmutableComponentBundleG3.B("clickAction_actionUrl");
        String[] strArrH = hubsImmutableComponentBundleG3.H("clickAction_metadata_keys");
        String[] strArrH2 = hubsImmutableComponentBundleG3.H("clickAction_metadata_values");
        if (strArrH != null && strArrH2 != null) {
            mapT = sqg0.T(f46.W0(strArrH, strArrH2));
        }
        return new Button(strB, buttonStyle, new ClickAction(strB6, strB7, mapT));
    }

    public static final CappingRule e(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        String strB = hubsImmutableComponentBundle.B("capping_eventType");
        strB.getClass();
        int iHashCode = strB.hashCode();
        if (iHashCode != -789438312) {
            if (iHashCode != -598011549) {
                if (iHashCode == 1781083255 && strB.equals("cappingEventType_timeBased")) {
                    Long lX = hubsImmutableComponentBundle.x("capping_impressionTimeInterval");
                    lX.getClass();
                    return new CappingRule.TimeBased(lX.longValue());
                }
            } else if (strB.equals("cappingEventType_interaction")) {
                String[] strArrH = hubsImmutableComponentBundle.H("capping_interactionsToCap");
                strArrH.getClass();
                ArrayList arrayList = new ArrayList(strArrH.length);
                for (String str : strArrH) {
                    arrayList.add(InteractionType.valueOf(str));
                }
                return new CappingRule.Interaction(o7h.p1(arrayList));
            }
        } else if (strB.equals("cappingEventType_impression")) {
            Integer numR = hubsImmutableComponentBundle.r("capping_maxImpressions");
            numR.getClass();
            return new CappingRule.Impression(numR.intValue());
        }
        hhg1.n(l1d.m("Unknown capping rule type: ", hubsImmutableComponentBundle.B("capping_eventType")));
        return null;
    }

    public static final String f(CappingRule cappingRule) {
        if (cappingRule instanceof CappingRule.Impression) {
            return "cappingEventType_impression";
        }
        if (cappingRule instanceof CappingRule.Interaction) {
            return "cappingEventType_interaction";
        }
        if (cappingRule instanceof CappingRule.TimeBased) {
            return "cappingEventType_timeBased";
        }
        eg.o();
        return null;
    }

    public static final HubsImmutableComponentBundle g(CappingRule cappingRule) {
        String str;
        if (cappingRule instanceof CappingRule.Impression) {
            return HubsImmutableComponentBundle.b.a.J("capping_eventType", f(cappingRule)).A(((CappingRule.Impression) cappingRule).getMaxImpressions(), "capping_maxImpressions").o();
        }
        if (!(cappingRule instanceof CappingRule.Interaction)) {
            if (cappingRule instanceof CappingRule.TimeBased) {
                return HubsImmutableComponentBundle.b.a.J("capping_eventType", f(cappingRule)).F(((CappingRule.TimeBased) cappingRule).getImpressionTimeInterval(), "capping_impressionTimeInterval").o();
            }
            eg.o();
            return null;
        }
        yxo1 yxo1VarJ = HubsImmutableComponentBundle.b.a.J("capping_eventType", f(cappingRule));
        Set interactionsToCap = ((CappingRule.Interaction) cappingRule).getInteractionsToCap();
        ArrayList arrayList = new ArrayList(q7h.U(interactionsToCap, 10));
        Iterator it = interactionsToCap.iterator();
        while (it.hasNext()) {
            int i = yd70.a[((InteractionType) it.next()).ordinal()];
            if (i == 1) {
                str = "cappingInteractionType_dismiss";
            } else {
                if (i != 2) {
                    eg.o();
                    return null;
                }
                str = "cappingInteractionType_click";
            }
            arrayList.add(str);
        }
        return yxo1VarJ.K("capping_interactionsToCap", (String[]) arrayList.toArray(new String[0])).o();
    }

    public static final HubsImmutableComponentBundle h(Pacing pacing) {
        return HubsImmutableComponentBundle.b.a.A(pacing.getInterval(), "pacing_interval").J("pacing_timeUnit", pacing.getTimeUnit().name()).o();
    }

    public static final HubsImmutableComponentBundle i(Button button) {
        Collection collectionValues;
        Set setKeySet;
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        yxo1 yxo1VarJ = hubsImmutableComponentBundle.a.J("button_identifier", button.getIdentifier());
        ButtonStyle style = button.getStyle();
        uc70 uc70Var = hubsImmutableComponentBundle.a;
        yxo1 yxo1VarJ2 = uc70Var.J("buttonStyle_text", style.getText()).J("buttonStyle_textColor", style.getTextColor());
        Icon icon = style.getIcon();
        String[] strArr = null;
        yxo1 yxo1VarJ3 = yxo1VarJ2.p(icon != null ? k(icon) : null, "buttonStyle_icon").J("buttonStyle_backgroundColor", style.getBackgroundColor());
        ButtonType buttonType = style.getButtonType();
        yxo1 yxo1VarP = yxo1VarJ.p(yxo1VarJ3.J("buttonStyle_buttonType", buttonType != null ? buttonType.name() : null).J("buttonStyle_buttonIconAlignment", style.getButtonIconAlignment().name()).o(), "button_style");
        ClickAction clickAction = button.getClickAction();
        yxo1 yxo1VarJ4 = uc70Var.J("clickAction_clickActionIdentifier", clickAction.getClickActionIdentifier()).J("clickAction_actionUrl", clickAction.getActionUrl());
        Map metadata = clickAction.getMetadata();
        tc70 tc70VarK = yxo1VarJ4.K("clickAction_metadata_keys", (metadata == null || (setKeySet = metadata.keySet()) == null) ? null : (String[]) setKeySet.toArray(new String[0]));
        Map metadata2 = clickAction.getMetadata();
        if (metadata2 != null && (collectionValues = metadata2.values()) != null) {
            strArr = (String[]) collectionValues.toArray(new String[0]);
        }
        tc70VarK.c.putStringArray("clickAction_metadata_values", strArr);
        return yxo1VarP.p(tc70VarK.o(), "button_clickAction").o();
    }

    public static final HubsImmutableComponentBundle j(Format format) {
        MessageText body;
        MessageText headline;
        BackgroundColor backgroundColor;
        HubsImmutableComponentBundle hubsImmutableComponentBundleO;
        Signifier signifier;
        HeaderContent headerContent;
        HubsImmutableComponentBundle hubsImmutableComponentBundleO2;
        AccessoryContent accessoryContent;
        HubsImmutableComponentBundle hubsImmutableComponentBundleO3;
        Button primaryButton;
        Button secondaryButton;
        Button dismissButton;
        Button closeButton;
        Button cardButton;
        if (!(format instanceof Format.InlineCard)) {
            hhg1.g(format, "Unknown format type: ");
            return null;
        }
        HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
        Format.InlineCard inlineCard = (Format.InlineCard) format;
        yxo1 yxo1VarJ = hubsImmutableComponentBundle.a.J("format_type", a(inlineCard.getTemplate()));
        InlineCardTemplate.StandardInlineCard template = inlineCard.getTemplate();
        uc70 uc70Var = hubsImmutableComponentBundle.a;
        yxo1 yxo1VarJ2 = uc70Var.J("template_type", a(template));
        boolean z = template instanceof InlineCardTemplate.StandardInlineCard;
        if (z) {
            body = template.getBody();
        } else if (template instanceof InlineCardTemplate.CompactInlineCard) {
            body = ((InlineCardTemplate.CompactInlineCard) template).getBody();
        } else if ((template instanceof InlineCardTemplate.MicroCompactInlineCard) || (template instanceof InlineCardTemplate.Undefined)) {
            body = null;
        } else {
            if (!(template instanceof InlineCardTemplate.BaseInlineCard)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            body = ((InlineCardTemplate.BaseInlineCard) template).getBody();
        }
        yxo1 yxo1VarP = yxo1VarJ2.p(body != null ? l(body) : null, "template_body");
        if (z) {
            headline = template.getHeadline();
        } else if (template instanceof InlineCardTemplate.CompactInlineCard) {
            headline = ((InlineCardTemplate.CompactInlineCard) template).getHeadline();
        } else if (template instanceof InlineCardTemplate.MicroCompactInlineCard) {
            headline = ((InlineCardTemplate.MicroCompactInlineCard) template).getHeadline();
        } else if (template instanceof InlineCardTemplate.BaseInlineCard) {
            headline = ((InlineCardTemplate.BaseInlineCard) template).getHeadline();
        } else {
            if (!(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            headline = null;
        }
        yxo1 yxo1VarP2 = yxo1VarP.p(headline != null ? l(headline) : null, "template_headline");
        if (z) {
            backgroundColor = template.getBackgroundColor();
        } else if (template instanceof InlineCardTemplate.CompactInlineCard) {
            backgroundColor = ((InlineCardTemplate.CompactInlineCard) template).getBackgroundColor();
        } else if (template instanceof InlineCardTemplate.MicroCompactInlineCard) {
            backgroundColor = ((InlineCardTemplate.MicroCompactInlineCard) template).getBackgroundColor();
        } else if (template instanceof InlineCardTemplate.BaseInlineCard) {
            backgroundColor = ((InlineCardTemplate.BaseInlineCard) template).getBackgroundColor();
        } else {
            if (!(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            backgroundColor = null;
        }
        if (backgroundColor == null) {
            hubsImmutableComponentBundleO = null;
        } else if (backgroundColor instanceof BackgroundColor.SolidBackgroundColor) {
            hubsImmutableComponentBundleO = uc70Var.J("background_type", "backgroundType_solid").J("solidBackgroundColor_color", ((BackgroundColor.SolidBackgroundColor) backgroundColor).getSolidBackgroundColor()).o();
        } else if (backgroundColor instanceof BackgroundColor.GradientBackgroundColor) {
            BackgroundColor.GradientBackgroundColor gradientBackgroundColor = (BackgroundColor.GradientBackgroundColor) backgroundColor;
            hubsImmutableComponentBundleO = uc70Var.J("background_type", "backgroundType_gradient").J("gradientBackgroundColor_startColor", gradientBackgroundColor.getStartColor()).J("gradientBackgroundColor_endColor", gradientBackgroundColor.getEndColor()).w("gradientBackgroundColor_degrees", gradientBackgroundColor.getDegrees()).o();
        } else if (backgroundColor instanceof BackgroundColor.NotSet) {
            hubsImmutableComponentBundleO = uc70Var.J("background_type", "backgroundType_notSet").o();
        } else {
            if (!(backgroundColor instanceof BackgroundColor.ImageUrl)) {
                eg.o();
                return null;
            }
            hubsImmutableComponentBundleO = uc70Var.J("background_type", "backgroundType_image").J("imageUrlBackgroundColor_imageUrl", ((BackgroundColor.ImageUrl) backgroundColor).getImageUrl()).o();
        }
        yxo1 yxo1VarP3 = yxo1VarP2.p(hubsImmutableComponentBundleO, "template_backgroundColor");
        if (z) {
            signifier = template.getSignifier();
        } else if (template instanceof InlineCardTemplate.CompactInlineCard) {
            signifier = ((InlineCardTemplate.CompactInlineCard) template).getSignifier();
        } else if (template instanceof InlineCardTemplate.MicroCompactInlineCard) {
            signifier = ((InlineCardTemplate.MicroCompactInlineCard) template).getSignifier();
        } else {
            if (!(template instanceof InlineCardTemplate.BaseInlineCard) && !(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            signifier = null;
        }
        yxo1 yxo1VarP4 = yxo1VarP3.p(signifier != null ? m(signifier) : null, "template_signifier");
        if (z || (template instanceof InlineCardTemplate.CompactInlineCard) || (template instanceof InlineCardTemplate.MicroCompactInlineCard)) {
            headerContent = null;
        } else if (template instanceof InlineCardTemplate.BaseInlineCard) {
            headerContent = ((InlineCardTemplate.BaseInlineCard) template).getHeaderContent();
        } else {
            if (!(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            headerContent = null;
        }
        if (headerContent == null) {
            hubsImmutableComponentBundleO2 = null;
        } else if (headerContent instanceof HeaderContent.HeaderText) {
            yxo1 yxo1VarJ3 = uc70Var.J("headerContent_type", "headerContentType_headerText");
            Text text = ((HeaderContent.HeaderText) headerContent).getText();
            hubsImmutableComponentBundleO2 = yxo1VarJ3.p(hubsImmutableComponentBundle.a.J("messageText_text", text.getText()).J("messageText_textColor", text.getTextColor()).o(), "headerContentType_headerText").o();
        } else if (headerContent instanceof HeaderContent.Signifier) {
            hubsImmutableComponentBundleO2 = uc70Var.J("headerContent_type", "headerContentType_signifier").p(m(((HeaderContent.Signifier) headerContent).getSignifier()), "headerContentType_signifier").o();
        } else if (headerContent instanceof HeaderContent$Header) {
            yxo1 yxo1VarJ4 = uc70Var.J("headerContent_type", "headerContentType_header");
            HeaderContent$Header headerContent$Header = (HeaderContent$Header) headerContent;
            Text text2 = headerContent$Header.getHeader().getText();
            yxo1 yxo1VarP5 = yxo1VarJ4.p(hubsImmutableComponentBundle.a.J("messageText_text", text2.getText()).J("messageText_textColor", text2.getTextColor()).o(), "header_text");
            Icon icon = headerContent$Header.getHeader().getIcon();
            hubsImmutableComponentBundleO2 = yxo1VarP5.p(icon != null ? k(icon) : null, "header_icon").o();
        } else {
            if (!(headerContent instanceof HeaderContent.NotSet)) {
                eg.o();
                return null;
            }
            hubsImmutableComponentBundleO2 = uc70Var.J("headerContent_type", "headerContentType_notSet").o();
        }
        yxo1 yxo1VarP6 = yxo1VarP4.p(hubsImmutableComponentBundleO2, "template_headerContent");
        if (z) {
            accessoryContent = template.getAccessoryContent();
        } else if (template instanceof InlineCardTemplate.CompactInlineCard) {
            accessoryContent = ((InlineCardTemplate.CompactInlineCard) template).getAccessoryContent();
        } else if (template instanceof InlineCardTemplate.MicroCompactInlineCard) {
            accessoryContent = ((InlineCardTemplate.MicroCompactInlineCard) template).getAccessoryContent();
        } else if (template instanceof InlineCardTemplate.BaseInlineCard) {
            accessoryContent = ((InlineCardTemplate.BaseInlineCard) template).getAccessoryContent();
        } else {
            if (!(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            accessoryContent = null;
        }
        if (accessoryContent == null) {
            hubsImmutableComponentBundleO3 = null;
        } else if (accessoryContent instanceof AccessoryContent.Icon) {
            hubsImmutableComponentBundleO3 = uc70Var.J("accessoryContent_type", "accessoryContentType_icon").p(k(((AccessoryContent.Icon) accessoryContent).getIcon()), "accessoryContentType_icon").o();
        } else if (accessoryContent instanceof AccessoryContent.Image) {
            yxo1 yxo1VarJ5 = uc70Var.J("accessoryContent_type", "accessoryContentType_image");
            AccessoryImage accessoryImage = ((AccessoryContent.Image) accessoryContent).getAccessoryImage();
            hubsImmutableComponentBundleO3 = yxo1VarJ5.p(uc70Var.J("accessoryImage_imageUrl", accessoryImage.getImageUrl()).J("accessoryImage_imageStyle", accessoryImage.getImageStyle().name()).o(), "accessoryContentType_image").o();
        } else if (accessoryContent instanceof AccessoryContent.Empty) {
            hubsImmutableComponentBundleO3 = uc70Var.J("accessoryContent_type", "accessoryContentType_empty").o();
        } else {
            if (!(accessoryContent instanceof AccessoryContent.NotSet)) {
                eg.o();
                return null;
            }
            hubsImmutableComponentBundleO3 = uc70Var.J("accessoryContent_type", "accessoryContentType_notSet").o();
        }
        yxo1 yxo1VarP7 = yxo1VarP6.p(hubsImmutableComponentBundleO3, "template_accessoryContent");
        if (z) {
            primaryButton = template.getPrimaryButton();
        } else if ((template instanceof InlineCardTemplate.CompactInlineCard) || (template instanceof InlineCardTemplate.MicroCompactInlineCard)) {
            primaryButton = null;
        } else if (template instanceof InlineCardTemplate.BaseInlineCard) {
            primaryButton = ((InlineCardTemplate.BaseInlineCard) template).getPrimaryButton();
        } else {
            if (!(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            primaryButton = null;
        }
        yxo1 yxo1VarP8 = yxo1VarP7.p(primaryButton != null ? i(primaryButton) : null, "template_primaryButton");
        if (z || (template instanceof InlineCardTemplate.CompactInlineCard) || (template instanceof InlineCardTemplate.MicroCompactInlineCard)) {
            secondaryButton = null;
        } else if (template instanceof InlineCardTemplate.BaseInlineCard) {
            secondaryButton = ((InlineCardTemplate.BaseInlineCard) template).getSecondaryButton();
        } else {
            if (!(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            secondaryButton = null;
        }
        yxo1 yxo1VarP9 = yxo1VarP8.p(secondaryButton != null ? i(secondaryButton) : null, "template_secondaryButton");
        if (z || (template instanceof InlineCardTemplate.CompactInlineCard) || (template instanceof InlineCardTemplate.MicroCompactInlineCard)) {
            dismissButton = null;
        } else if (template instanceof InlineCardTemplate.BaseInlineCard) {
            dismissButton = ((InlineCardTemplate.BaseInlineCard) template).getDismissButton();
        } else {
            if (!(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            dismissButton = null;
        }
        yxo1 yxo1VarP10 = yxo1VarP9.p(dismissButton != null ? i(dismissButton) : null, "template_dismissButton");
        if (z) {
            closeButton = template.getCloseButton();
        } else {
            if (!(template instanceof InlineCardTemplate.CompactInlineCard) && !(template instanceof InlineCardTemplate.MicroCompactInlineCard) && !(template instanceof InlineCardTemplate.BaseInlineCard) && !(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            closeButton = null;
        }
        yxo1 yxo1VarP11 = yxo1VarP10.p(closeButton != null ? i(closeButton) : null, "template_closeButton");
        if (z) {
            cardButton = null;
        } else if (template instanceof InlineCardTemplate.CompactInlineCard) {
            cardButton = ((InlineCardTemplate.CompactInlineCard) template).getCardButton();
        } else if (template instanceof InlineCardTemplate.MicroCompactInlineCard) {
            cardButton = ((InlineCardTemplate.MicroCompactInlineCard) template).getCardButton();
        } else if (template instanceof InlineCardTemplate.BaseInlineCard) {
            cardButton = ((InlineCardTemplate.BaseInlineCard) template).getCardButton();
        } else {
            if (!(template instanceof InlineCardTemplate.Undefined)) {
                hhg1.g(template, "Unknown template type: ");
                return null;
            }
            cardButton = null;
        }
        return yxo1VarJ.p(yxo1VarP11.p(cardButton != null ? i(cardButton) : null, "template_cardButton").o(), "format_template").o();
    }

    public static final HubsImmutableComponentBundle k(Icon icon) {
        return HubsImmutableComponentBundle.b.a.J("icon_name", icon.getIconName().name()).J("icon_color", icon.getColor()).o();
    }

    public static final HubsImmutableComponentBundle l(MessageText messageText) {
        yxo1 yxo1VarJ = HubsImmutableComponentBundle.b.a.J("messageText_text", messageText.getText()).J("messageText_textColor", messageText.getTextColor());
        EncoreFont fontOverride = messageText.getFontOverride();
        return yxo1VarJ.J("messageText_fontOverride", fontOverride != null ? fontOverride.name() : null).o();
    }

    public static final HubsImmutableComponentBundle m(Signifier signifier) {
        return HubsImmutableComponentBundle.b.a.p(k(signifier.getIcon()), "signifier_icon").J("signifier_text", signifier.getText()).J("signifier_textColor", signifier.getTextColor()).o();
    }

    public static final Icon n(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        String strB = hubsImmutableComponentBundle.B("icon_name");
        strB.getClass();
        IconName iconNameValueOf = IconName.valueOf(strB);
        String strB2 = hubsImmutableComponentBundle.B("icon_color");
        strB2.getClass();
        return new Icon(iconNameValueOf, strB2);
    }

    public static final MessageText o(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        String strB = hubsImmutableComponentBundle.B("messageText_text");
        strB.getClass();
        String strB2 = hubsImmutableComponentBundle.B("messageText_textColor");
        String strB3 = hubsImmutableComponentBundle.B("messageText_fontOverride");
        return new MessageText(strB, strB2, strB3 != null ? EncoreFont.valueOf(strB3) : null);
    }

    public static final Signifier p(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        if (hubsImmutableComponentBundle.g("signifier_icon") == null) {
            return null;
        }
        HubsImmutableComponentBundle hubsImmutableComponentBundleG = hubsImmutableComponentBundle.g("signifier_icon");
        hubsImmutableComponentBundleG.getClass();
        Icon iconN = n(hubsImmutableComponentBundleG);
        String strB = hubsImmutableComponentBundle.B("signifier_text");
        strB.getClass();
        String strB2 = hubsImmutableComponentBundle.B("signifier_textColor");
        strB2.getClass();
        return new Signifier(iconN, strB, strB2);
    }
}
