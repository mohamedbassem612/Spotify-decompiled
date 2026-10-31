package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface HierarchyMessagingAvailabilityOrBuilder extends v2j0 {
    HierarchyMessagingAllowed getAllowed();

    HierarchyMessagingAvailability.AvailabilityCase getAvailabilityCase();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    HierarchyMessagingDisallowed getDisallowed();

    boolean hasAllowed();

    boolean hasDisallowed();

    /* synthetic */ boolean isInitialized();
}
