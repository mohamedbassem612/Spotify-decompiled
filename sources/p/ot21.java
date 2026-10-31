package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent$Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ImageStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Text;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class ot21 {
    public static final String a(String str, String str2, String str3, Set set) {
        if (ihc1.h0(str, str2, false)) {
            if (str3 != null && str3.length() != 0) {
                return nhc1.W(str, str2, str3);
            }
            set.add(str2);
        }
        return str;
    }

    public static final AccessoryContent b(AccessoryContent accessoryContent, DynamicTagsMetadata dynamicTagsMetadata, Set set) {
        if ((accessoryContent instanceof AccessoryContent.Empty) || (accessoryContent instanceof AccessoryContent.Icon)) {
            return accessoryContent;
        }
        if (accessoryContent instanceof AccessoryContent.Image) {
            AccessoryContent.Image image = (AccessoryContent.Image) accessoryContent;
            return image.copy(AccessoryImage.copy$default(image.getAccessoryImage(), g(image.getAccessoryImage().getImageUrl(), dynamicTagsMetadata, set), (ImageStyle) null, 2, (Object) null));
        }
        if (accessoryContent instanceof AccessoryContent.NotSet) {
            return accessoryContent;
        }
        eg.o();
        return null;
    }

    public static final Button c(Button button, DynamicTagsMetadata dynamicTagsMetadata, Set set) {
        return Button.copy$default(button, (String) null, ButtonStyle.copy$default(button.getStyle(), g(button.getStyle().getText(), dynamicTagsMetadata, set), (String) null, (String) null, (Icon) null, (ButtonType) null, (EncoreFont) null, (ButtonIconAlignment) null, 126, (Object) null), (ClickAction) null, 5, (Object) null);
    }

    public static final HeaderContent d(HeaderContent headerContent, DynamicTagsMetadata dynamicTagsMetadata, LinkedHashSet linkedHashSet) {
        if (headerContent instanceof HeaderContent.HeaderText) {
            HeaderContent.HeaderText headerText = (HeaderContent.HeaderText) headerContent;
            Text text = headerText.getText();
            return headerText.copy(Text.copy$default(text, g(text.getText(), dynamicTagsMetadata, linkedHashSet), (String) null, 2, (Object) null));
        }
        if (headerContent instanceof HeaderContent.NotSet) {
            return headerContent;
        }
        if (headerContent instanceof HeaderContent.Signifier) {
            HeaderContent.Signifier signifier = (HeaderContent.Signifier) headerContent;
            return signifier.copy(f(signifier.getSignifier(), dynamicTagsMetadata, linkedHashSet));
        }
        if (!(headerContent instanceof HeaderContent$Header)) {
            eg.o();
            return null;
        }
        HeaderContent$Header headerContent$Header = (HeaderContent$Header) headerContent;
        Header header = headerContent$Header.getHeader();
        Text text2 = header.getText();
        return headerContent$Header.copy(Header.copy$default(header, Text.copy$default(text2, g(text2.getText(), dynamicTagsMetadata, linkedHashSet), (String) null, 2, (Object) null), null, 2, null));
    }

    public static final MessageText e(MessageText messageText, DynamicTagsMetadata dynamicTagsMetadata, Set set) {
        return MessageText.copy$default(messageText, g(messageText.getText(), dynamicTagsMetadata, set), (String) null, (EncoreFont) null, 6, (Object) null);
    }

    public static final Signifier f(Signifier signifier, DynamicTagsMetadata dynamicTagsMetadata, LinkedHashSet linkedHashSet) {
        return Signifier.copy$default(signifier, (Icon) null, g(signifier.getText(), dynamicTagsMetadata, linkedHashSet), (String) null, 5, (Object) null);
    }

    public static final String g(String str, DynamicTagsMetadata dynamicTagsMetadata, Set set) {
        return a(a(a(a(str, "{creator_name}", dynamicTagsMetadata.getCreatorName(), set), "{entity_name}", dynamicTagsMetadata.getEntityName(), set), "{entity_uri}", dynamicTagsMetadata.getEntityUri(), set), "{entity_imageUrl}", dynamicTagsMetadata.getEntityImageUrl(), set);
    }
}
