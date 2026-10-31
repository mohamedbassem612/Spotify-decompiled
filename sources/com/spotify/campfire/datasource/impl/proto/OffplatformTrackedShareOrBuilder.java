package com.spotify.campfire.datasource.impl.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface OffplatformTrackedShareOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getDestination();

    phc getDestinationBytes();

    OffplatformShareSource getOffplatformShareSource();

    int getOffplatformShareSourceValue();

    String getOpShareId();

    phc getOpShareIdBytes();

    String getOpeningUserId();

    phc getOpeningUserIdBytes();

    String getSharingUserId();

    phc getSharingUserIdBytes();

    String getUri();

    phc getUriBytes();

    boolean hasOffplatformShareSource();

    /* synthetic */ boolean isInitialized();
}
