package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import p.cy30;
import p.gvg;
import p.k4s0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010\u0010J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001f¨\u00062"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ClientMessage;", "Landroid/os/Parcelable;", "", "id", "uuid", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "format", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/CappingRule;", "cappingRules", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "pacing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;Ljava/util/Set;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/rih1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "component4", "()Ljava/util/Set;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;Ljava/util/Set;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ClientMessage;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getUuid", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "getFormat", "Ljava/util/Set;", "getCappingRules", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "getPacing", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* data */ class ClientMessage implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ClientMessage> CREATOR = new Creator();
    private final Set<CappingRule> cappingRules;
    private final Format format;
    private final String id;
    private final Pacing pacing;
    private final String uuid;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<ClientMessage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientMessage createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Format parcelable = parcel.readParcelable(ClientMessage.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(parcel.readParcelable(ClientMessage.class.getClassLoader()));
            }
            return new ClientMessage(string, string2, parcelable, linkedHashSet, (Pacing) Pacing.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClientMessage[] newArray(int i) {
            return new ClientMessage[i];
        }
    }

    public ClientMessage(String str, String str2, Format format, Set<? extends CappingRule> set, Pacing pacing) {
        this.id = str;
        this.uuid = str2;
        this.format = format;
        this.cappingRules = set;
        this.pacing = pacing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClientMessage copy$default(ClientMessage clientMessage, String str, String str2, Format format, Set set, Pacing pacing, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientMessage.id;
        }
        if ((i & 2) != 0) {
            str2 = clientMessage.uuid;
        }
        if ((i & 4) != 0) {
            format = clientMessage.format;
        }
        if ((i & 8) != 0) {
            set = clientMessage.cappingRules;
        }
        if ((i & 16) != 0) {
            pacing = clientMessage.pacing;
        }
        Pacing pacing2 = pacing;
        Format format2 = format;
        return clientMessage.copy(str, str2, format2, set, pacing2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Format getFormat() {
        return this.format;
    }

    public final Set<CappingRule> component4() {
        return this.cappingRules;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Pacing getPacing() {
        return this.pacing;
    }

    public final ClientMessage copy(String id, String uuid, Format format, Set<? extends CappingRule> cappingRules, Pacing pacing) {
        return new ClientMessage(id, uuid, format, cappingRules, pacing);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientMessage)) {
            return false;
        }
        ClientMessage clientMessage = (ClientMessage) other;
        return u890.j(this.id, clientMessage.id) && u890.j(this.uuid, clientMessage.uuid) && u890.j(this.format, clientMessage.format) && u890.j(this.cappingRules, clientMessage.cappingRules) && u890.j(this.pacing, clientMessage.pacing);
    }

    public final Set<CappingRule> getCappingRules() {
        return this.cappingRules;
    }

    public final Format getFormat() {
        return this.format;
    }

    public final String getId() {
        return this.id;
    }

    public final Pacing getPacing() {
        return this.pacing;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.pacing.hashCode() + gvg.c((this.format.hashCode() + cy30.d(this.id.hashCode() * 31, 31, this.uuid)) * 31, 31, this.cappingRules);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.uuid);
        dest.writeParcelable(this.format, flags);
        Iterator itH = k4s0.h(this.cappingRules, dest);
        while (itH.hasNext()) {
            dest.writeParcelable((Parcelable) itH.next(), flags);
        }
        this.pacing.writeToParcel(dest, flags);
    }
}
