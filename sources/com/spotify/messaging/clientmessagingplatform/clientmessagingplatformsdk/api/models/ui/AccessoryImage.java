package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010 ¨\u00060"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryImage;", "Landroid/os/Parcelable;", "", "imageUrl", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ImageStyle;", "imageStyle", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ImageStyle;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ImageStyle;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryImage;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ImageStyle;", "copy", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ImageStyle;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryImage;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/ImageStyle;", "getImageStyle", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class AccessoryImage implements Parcelable {
    public static final int $stable = 0;
    private final ImageStyle imageStyle;
    private final String imageUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AccessoryImage> CREATOR = new Creator();
    private static final znb0[] $childSerializers = {null, dm5.S(2, AccessoryImage$Companion$$childSerializers$1.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryImage$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/AccessoryImage;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return AccessoryImage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<AccessoryImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessoryImage createFromParcel(Parcel parcel) {
            return new AccessoryImage(parcel.readString(), ImageStyle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessoryImage[] newArray(int i) {
            return new AccessoryImage[i];
        }
    }

    public /* synthetic */ AccessoryImage(int i, String str, ImageStyle imageStyle, p661 p661Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, AccessoryImage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.imageUrl = str;
        this.imageStyle = imageStyle;
    }

    public static /* synthetic */ AccessoryImage copy$default(AccessoryImage accessoryImage, String str, ImageStyle imageStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accessoryImage.imageUrl;
        }
        if ((i & 2) != 0) {
            imageStyle = accessoryImage.imageStyle;
        }
        return accessoryImage.copy(str, imageStyle);
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(AccessoryImage self, z1k output, h661 serialDesc) {
        znb0[] znb0VarArr = $childSerializers;
        output.G(serialDesc, 0, self.imageUrl);
        output.k(serialDesc, 1, (nma0) znb0VarArr[1].getValue(), self.imageStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    public final AccessoryImage copy(String imageUrl, ImageStyle imageStyle) {
        return new AccessoryImage(imageUrl, imageStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoryImage)) {
            return false;
        }
        AccessoryImage accessoryImage = (AccessoryImage) other;
        return u890.j(this.imageUrl, accessoryImage.imageUrl) && this.imageStyle == accessoryImage.imageStyle;
    }

    public final ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        return this.imageStyle.hashCode() + (this.imageUrl.hashCode() * 31);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.imageUrl);
        this.imageStyle.writeToParcel(dest, flags);
    }

    public AccessoryImage(String str, ImageStyle imageStyle) {
        this.imageUrl = str;
        this.imageStyle = imageStyle;
    }
}
