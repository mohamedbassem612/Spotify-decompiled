package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ModerationStatusOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    DeletedForAll getDeletedForAll();

    DeletedForUser getDeletedForUser();

    Hidden getHidden();

    Removed getRemoved();

    Reported getReported();

    ModerationStatus.StatusCase getStatusCase();

    boolean hasDeletedForAll();

    boolean hasDeletedForUser();

    boolean hasHidden();

    boolean hasRemoved();

    boolean hasReported();

    /* synthetic */ boolean isInitialized();
}
