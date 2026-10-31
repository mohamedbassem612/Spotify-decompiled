package com.spotify.campfire.datasource.impl.proto;

import java.util.Map;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface CanMessageUsersResponseOrBuilder extends v2j0 {
    boolean containsResults(String str);

    boolean containsSharedHierarchies(String str);

    /* synthetic */ s2j0 getDefaultInstanceForType();

    @Deprecated
    Map<String, Boolean> getResults();

    int getResultsCount();

    Map<String, Boolean> getResultsMap();

    boolean getResultsOrDefault(String str, boolean z);

    boolean getResultsOrThrow(String str);

    @Deprecated
    Map<String, SharedHierarchies> getSharedHierarchies();

    int getSharedHierarchiesCount();

    Map<String, SharedHierarchies> getSharedHierarchiesMap();

    SharedHierarchies getSharedHierarchiesOrDefault(String str, SharedHierarchies sharedHierarchies);

    SharedHierarchies getSharedHierarchiesOrThrow(String str);

    /* synthetic */ boolean isInitialized();
}
