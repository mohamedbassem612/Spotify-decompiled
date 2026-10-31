package com.spotify.campfire.datasource.impl.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface RetrieveNodeRequestOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    RetrieveNodeRequest.Filter getFilter();

    String getHierarchyId();

    phc getHierarchyIdBytes();

    int getNextLimit();

    String getNodePathId();

    phc getNodePathIdBytes();

    int getPageSize();

    String getPageToken();

    phc getPageTokenBytes();

    Precondition getPrecondition();

    int getPrevLimit();

    String getShareMessageUri();

    phc getShareMessageUriBytes();

    SortOrder getSortOrder();

    int getSortOrderValue();

    boolean hasFilter();

    boolean hasPrecondition();

    boolean hasShareMessageUri();

    boolean hasSortOrder();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
