package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

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
import p.z1k;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "Landroid/os/Parcelable;", "", "interval", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PacingTimeUnit;", "timeUnit", "<init>", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PacingTimeUnit;)V", "seen0", "Lp/p661;", "serializationConstructorMarker", "(IILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PacingTimeUnit;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;Lp/z1k;Lp/h661;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PacingTimeUnit;", "copy", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PacingTimeUnit;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getInterval", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/PacingTimeUnit;", "getTimeUnit", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class Pacing implements Parcelable {
    public static final int $stable = 0;
    private final int interval;
    private final PacingTimeUnit timeUnit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Pacing> CREATOR = new Creator();
    private static final znb0[] $childSerializers = {null, dm5.S(2, Pacing$Companion$$childSerializers$1.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Pacing;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return Pacing$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<Pacing> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Pacing createFromParcel(Parcel parcel) {
            return new Pacing(parcel.readInt(), PacingTimeUnit.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Pacing[] newArray(int i) {
            return new Pacing[i];
        }
    }

    public /* synthetic */ Pacing(int i, int i2, PacingTimeUnit pacingTimeUnit, p661 p661Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, Pacing$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.interval = i2;
        this.timeUnit = pacingTimeUnit;
    }

    public static /* synthetic */ Pacing copy$default(Pacing pacing, int i, PacingTimeUnit pacingTimeUnit, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pacing.interval;
        }
        if ((i2 & 2) != 0) {
            pacingTimeUnit = pacing.timeUnit;
        }
        return pacing.copy(i, pacingTimeUnit);
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(Pacing self, z1k output, h661 serialDesc) {
        znb0[] znb0VarArr = $childSerializers;
        output.e(0, self.interval, serialDesc);
        output.k(serialDesc, 1, (nma0) znb0VarArr[1].getValue(), self.timeUnit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PacingTimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public final Pacing copy(int interval, PacingTimeUnit timeUnit) {
        return new Pacing(interval, timeUnit);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pacing)) {
            return false;
        }
        Pacing pacing = (Pacing) other;
        return this.interval == pacing.interval && this.timeUnit == pacing.timeUnit;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final PacingTimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + (Integer.hashCode(this.interval) * 31);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.interval);
        this.timeUnit.writeToParcel(dest, flags);
    }

    public Pacing(int i, PacingTimeUnit pacingTimeUnit) {
        this.interval = i;
        this.timeUnit = pacingTimeUnit;
    }
}
