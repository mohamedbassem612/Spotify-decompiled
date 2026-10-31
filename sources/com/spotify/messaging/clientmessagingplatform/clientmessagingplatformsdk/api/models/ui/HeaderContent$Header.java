package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.h661;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent$Header;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "header", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent$Header;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent$Header;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Header;", "getHeader", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
@o661
public final /* data */ class HeaderContent$Header extends HeaderContent {
    public static final int $stable = 0;
    private final Header header;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<HeaderContent$Header> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent$Header$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/HeaderContent$Header;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return HeaderContent$Header$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<HeaderContent$Header> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeaderContent$Header createFromParcel(Parcel parcel) {
            return new HeaderContent$Header(Header.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeaderContent$Header[] newArray(int i) {
            return new HeaderContent$Header[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeaderContent$Header(int i, Header header, p661 p661Var) {
        super(i, p661Var);
        if (1 != (i & 1)) {
            o6p1.t(i, 1, HeaderContent$Header$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.header = header;
    }

    public static /* synthetic */ HeaderContent$Header copy$default(HeaderContent$Header headerContent$Header, Header header, int i, Object obj) {
        if ((i & 1) != 0) {
            header = headerContent$Header.header;
        }
        return headerContent$Header.copy(header);
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(HeaderContent$Header self, z1k output, h661 serialDesc) {
        HeaderContent.write$Self(self, output, serialDesc);
        output.k(serialDesc, 0, Header$$serializer.INSTANCE, self.header);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    public final HeaderContent$Header copy(Header header) {
        return new HeaderContent$Header(header);
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HeaderContent$Header) && u890.j(this.header, ((HeaderContent$Header) other).header);
    }

    public final Header getHeader() {
        return this.header;
    }

    public int hashCode() {
        return this.header.hashCode();
    }

    public String toString() {
        return super/*java.lang.Object*/.toString();
    }

    public final void writeToParcel(Parcel dest, int flags) {
        this.header.writeToParcel(dest, flags);
    }

    public HeaderContent$Header(Header header) {
        super((DefaultConstructorMarker) null);
        this.header = header;
    }
}
