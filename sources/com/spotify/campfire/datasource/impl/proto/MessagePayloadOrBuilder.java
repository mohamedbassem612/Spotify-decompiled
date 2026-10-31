package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface MessagePayloadOrBuilder extends v2j0 {
    ActivityPayload getActivityPayload();

    MessagePayload.CmpCase getCmpCase();

    ContributionPayload getContributionPayload();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean hasActivityPayload();

    boolean hasContributionPayload();

    /* synthetic */ boolean isInitialized();
}
