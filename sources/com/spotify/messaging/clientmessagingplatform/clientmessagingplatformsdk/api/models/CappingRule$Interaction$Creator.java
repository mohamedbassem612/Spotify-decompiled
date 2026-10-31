package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class CappingRule$Interaction$Creator implements Parcelable.Creator<CappingRule.Interaction> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final CappingRule.Interaction createFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
        for (int i2 = 0; i2 != i; i2++) {
            linkedHashSet.add(InteractionType.CREATOR.createFromParcel(parcel));
        }
        return new CappingRule.Interaction(linkedHashSet);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final CappingRule.Interaction[] newArray(int i) {
        return new CappingRule.Interaction[i];
    }
}
