package com.spotify.campfire.datasource.impl.proto;

import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class SortOrder$SortOrderVerifier implements z190 {
    static final z190 INSTANCE = new SortOrder$SortOrderVerifier();

    private SortOrder$SortOrderVerifier() {
    }

    public boolean isInRange(int i) {
        return SortOrder.forNumber(i) != null;
    }
}
