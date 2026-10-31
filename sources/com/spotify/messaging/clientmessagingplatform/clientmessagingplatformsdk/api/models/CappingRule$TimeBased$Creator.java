package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class CappingRule$TimeBased$Creator implements Parcelable.Creator<CappingRule.TimeBased> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final CappingRule.TimeBased createFromParcel(Parcel parcel) {
        return new CappingRule.TimeBased(parcel.readLong());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final CappingRule.TimeBased[] newArray(int i) {
        return new CappingRule.TimeBased[i];
    }
}
