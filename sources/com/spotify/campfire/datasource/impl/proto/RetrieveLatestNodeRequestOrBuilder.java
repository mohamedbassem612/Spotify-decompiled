package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface RetrieveLatestNodeRequestOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    int getLimit();

    Precondition getPrecondition();

    SortOrder getSortOrder();

    int getSortOrderValue();

    boolean hasLimit();

    boolean hasPrecondition();

    boolean hasSortOrder();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
