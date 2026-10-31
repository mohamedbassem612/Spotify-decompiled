package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface AddContributionForGroupOrBuilder extends v2j0 {
    CreateGroupOptions getCreateGroupOptions();

    @Deprecated
    boolean getCreateNewHierarchy();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    GroupDetail getGroupDetail();

    ContributionPayload getPayload();

    boolean hasCreateGroupOptions();

    boolean hasGroupDetail();

    boolean hasPayload();

    /* synthetic */ boolean isInitialized();
}
