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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J2\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\"¨\u00063"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "Landroid/os/Parcelable;", "", "text", "textColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;", "fontOverride", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getTextColor", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/EncoreFont;", "getFontOverride", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class MessageText implements Parcelable {
    public static final int $stable = 0;
    private final EncoreFont fontOverride;
    private final String text;
    private final String textColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MessageText> CREATOR = new Creator();
    private static final znb0[] $childSerializers = {null, null, dm5.S(2, MessageText$Companion$$childSerializers$1.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/MessageText;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return MessageText$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<MessageText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageText createFromParcel(Parcel parcel) {
            return new MessageText(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EncoreFont.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageText[] newArray(int i) {
            return new MessageText[i];
        }
    }

    public /* synthetic */ MessageText(int i, String str, String str2, EncoreFont encoreFont, p661 p661Var) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, MessageText$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str2;
        }
        if ((i & 4) == 0) {
            this.fontOverride = null;
        } else {
            this.fontOverride = encoreFont;
        }
    }

    public static /* synthetic */ MessageText copy$default(MessageText messageText, String str, String str2, EncoreFont encoreFont, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageText.text;
        }
        if ((i & 2) != 0) {
            str2 = messageText.textColor;
        }
        if ((i & 4) != 0) {
            encoreFont = messageText.fontOverride;
        }
        return messageText.copy(str, str2, encoreFont);
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(MessageText self, z1k output, h661 serialDesc) {
        znb0[] znb0VarArr = $childSerializers;
        output.G(serialDesc, 0, self.text);
        if (output.d0() || self.textColor != null) {
            output.s(serialDesc, 1, chc1.a, self.textColor);
        }
        if (!output.d0() && self.fontOverride == null) {
            return;
        }
        output.s(serialDesc, 2, (nma0) znb0VarArr[2].getValue(), self.fontOverride);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EncoreFont getFontOverride() {
        return this.fontOverride;
    }

    public final MessageText copy(String text, String textColor, EncoreFont fontOverride) {
        return new MessageText(text, textColor, fontOverride);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageText)) {
            return false;
        }
        MessageText messageText = (MessageText) other;
        return u890.j(this.text, messageText.text) && u890.j(this.textColor, messageText.textColor) && this.fontOverride == messageText.fontOverride;
    }

    public final EncoreFont getFontOverride() {
        return this.fontOverride;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.textColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EncoreFont encoreFont = this.fontOverride;
        return iHashCode2 + (encoreFont != null ? encoreFont.hashCode() : 0);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeString(this.textColor);
        EncoreFont encoreFont = this.fontOverride;
        if (encoreFont == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            encoreFont.writeToParcel(dest, flags);
        }
    }

    public MessageText(String str, String str2, EncoreFont encoreFont) {
        this.text = str;
        this.textColor = str2;
        this.fontOverride = encoreFont;
    }

    public /* synthetic */ MessageText(String str, String str2, EncoreFont encoreFont, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : encoreFont);
    }
}
