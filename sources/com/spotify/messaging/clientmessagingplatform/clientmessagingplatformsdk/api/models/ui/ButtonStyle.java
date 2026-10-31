package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.chc1;
import p.dm5;
import p.h661;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b/\u00100J`\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010&J\u0010\u00104\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b4\u0010\u001fJ\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u00100¨\u0006H"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle;", "Landroid/os/Parcelable;", "", "text", "backgroundColor", "textColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Icon;", "icon", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonType;", "buttonType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;", "fontOverride", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonIconAlignment;", "buttonIconAlignment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Icon;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonType;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonIconAlignment;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Icon;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonType;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonIconAlignment;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Icon;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonType;", "component6", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonIconAlignment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Icon;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonType;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonIconAlignment;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getBackgroundColor", "getTextColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Icon;", "getIcon", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonType;", "getButtonType", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;", "getFontOverride", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonIconAlignment;", "getButtonIconAlignment", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class ButtonStyle implements Parcelable {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final ButtonIconAlignment buttonIconAlignment;
    private final ButtonType buttonType;
    private final EncoreFont fontOverride;
    private final Icon icon;
    private final String text;
    private final String textColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ButtonStyle> CREATOR = new Creator();
    private static final znb0[] $childSerializers = {null, null, null, null, dm5.S(2, ButtonStyle$Companion$$childSerializers$1.INSTANCE), dm5.S(2, ButtonStyle$Companion$$childSerializers$2.INSTANCE), dm5.S(2, ButtonStyle$Companion$$childSerializers$3.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ButtonStyle;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return ButtonStyle$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<ButtonStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonStyle createFromParcel(Parcel parcel) {
            return new ButtonStyle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ButtonType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EncoreFont.CREATOR.createFromParcel(parcel) : null, ButtonIconAlignment.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonStyle[] newArray(int i) {
            return new ButtonStyle[i];
        }
    }

    public /* synthetic */ ButtonStyle(int i, String str, String str2, String str3, Icon icon, ButtonType buttonType, EncoreFont encoreFont, ButtonIconAlignment buttonIconAlignment, p661 p661Var) {
        if (14 != (i & 14)) {
            o6p1.t(i, 14, ButtonStyle$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = (i & 1) == 0 ? "" : str;
        this.backgroundColor = str2;
        this.textColor = str3;
        this.icon = icon;
        if ((i & 16) == 0) {
            this.buttonType = ButtonType.PRIMARY;
        } else {
            this.buttonType = buttonType;
        }
        if ((i & 32) == 0) {
            this.fontOverride = null;
        } else {
            this.fontOverride = encoreFont;
        }
        if ((i & 64) == 0) {
            this.buttonIconAlignment = ButtonIconAlignment.LEADING;
        } else {
            this.buttonIconAlignment = buttonIconAlignment;
        }
    }

    public static /* synthetic */ ButtonStyle copy$default(ButtonStyle buttonStyle, String str, String str2, String str3, Icon icon, ButtonType buttonType, EncoreFont encoreFont, ButtonIconAlignment buttonIconAlignment, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buttonStyle.text;
        }
        if ((i & 2) != 0) {
            str2 = buttonStyle.backgroundColor;
        }
        if ((i & 4) != 0) {
            str3 = buttonStyle.textColor;
        }
        if ((i & 8) != 0) {
            icon = buttonStyle.icon;
        }
        if ((i & 16) != 0) {
            buttonType = buttonStyle.buttonType;
        }
        if ((i & 32) != 0) {
            encoreFont = buttonStyle.fontOverride;
        }
        if ((i & 64) != 0) {
            buttonIconAlignment = buttonStyle.buttonIconAlignment;
        }
        EncoreFont encoreFont2 = encoreFont;
        ButtonIconAlignment buttonIconAlignment2 = buttonIconAlignment;
        ButtonType buttonType2 = buttonType;
        String str4 = str3;
        return buttonStyle.copy(str, str2, str4, icon, buttonType2, encoreFont2, buttonIconAlignment2);
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(ButtonStyle self, z1k output, h661 serialDesc) {
        znb0[] znb0VarArr = $childSerializers;
        if (output.d0() || !u890.j(self.text, "")) {
            output.G(serialDesc, 0, self.text);
        }
        chc1 chc1Var = chc1.a;
        output.s(serialDesc, 1, chc1Var, self.backgroundColor);
        output.s(serialDesc, 2, chc1Var, self.textColor);
        output.s(serialDesc, 3, Icon$$serializer.INSTANCE, self.icon);
        if (output.d0() || self.buttonType != ButtonType.PRIMARY) {
            output.s(serialDesc, 4, (nma0) znb0VarArr[4].getValue(), self.buttonType);
        }
        if (output.d0() || self.fontOverride != null) {
            output.s(serialDesc, 5, (nma0) znb0VarArr[5].getValue(), self.fontOverride);
        }
        if (!output.d0() && self.buttonIconAlignment == ButtonIconAlignment.LEADING) {
            return;
        }
        output.k(serialDesc, 6, (nma0) znb0VarArr[6].getValue(), self.buttonIconAlignment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ButtonType getButtonType() {
        return this.buttonType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EncoreFont getFontOverride() {
        return this.fontOverride;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ButtonIconAlignment getButtonIconAlignment() {
        return this.buttonIconAlignment;
    }

    public final ButtonStyle copy(String text, String backgroundColor, String textColor, Icon icon, ButtonType buttonType, EncoreFont fontOverride, ButtonIconAlignment buttonIconAlignment) {
        return new ButtonStyle(text, backgroundColor, textColor, icon, buttonType, fontOverride, buttonIconAlignment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStyle)) {
            return false;
        }
        ButtonStyle buttonStyle = (ButtonStyle) other;
        return u890.j(this.text, buttonStyle.text) && u890.j(this.backgroundColor, buttonStyle.backgroundColor) && u890.j(this.textColor, buttonStyle.textColor) && u890.j(this.icon, buttonStyle.icon) && this.buttonType == buttonStyle.buttonType && this.fontOverride == buttonStyle.fontOverride && this.buttonIconAlignment == buttonStyle.buttonIconAlignment;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonIconAlignment getButtonIconAlignment() {
        return this.buttonIconAlignment;
    }

    public final ButtonType getButtonType() {
        return this.buttonType;
    }

    public final EncoreFont getFontOverride() {
        return this.fontOverride;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        ButtonType buttonType = this.buttonType;
        int iHashCode5 = (iHashCode4 + (buttonType == null ? 0 : buttonType.hashCode())) * 31;
        EncoreFont encoreFont = this.fontOverride;
        return this.buttonIconAlignment.hashCode() + ((iHashCode5 + (encoreFont != null ? encoreFont.hashCode() : 0)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.textColor);
        Icon icon = this.icon;
        if (icon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            icon.writeToParcel(dest, flags);
        }
        ButtonType buttonType = this.buttonType;
        if (buttonType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonType.writeToParcel(dest, flags);
        }
        EncoreFont encoreFont = this.fontOverride;
        if (encoreFont == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            encoreFont.writeToParcel(dest, flags);
        }
        this.buttonIconAlignment.writeToParcel(dest, flags);
    }

    public ButtonStyle(String str, String str2, String str3, Icon icon, ButtonType buttonType, EncoreFont encoreFont, ButtonIconAlignment buttonIconAlignment) {
        this.text = str;
        this.backgroundColor = str2;
        this.textColor = str3;
        this.icon = icon;
        this.buttonType = buttonType;
        this.fontOverride = encoreFont;
        this.buttonIconAlignment = buttonIconAlignment;
    }

    public /* synthetic */ ButtonStyle(String str, String str2, String str3, Icon icon, ButtonType buttonType, EncoreFont encoreFont, ButtonIconAlignment buttonIconAlignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, str3, icon, (i & 16) != 0 ? ButtonType.PRIMARY : buttonType, (i & 32) != 0 ? null : encoreFont, (i & 64) != 0 ? ButtonIconAlignment.LEADING : buttonIconAlignment);
    }
}
