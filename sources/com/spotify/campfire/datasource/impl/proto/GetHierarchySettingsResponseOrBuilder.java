package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface GetHierarchySettingsResponseOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    ReceiptType getDisabledReceiptTypes(int i);

    int getDisabledReceiptTypesCount();

    List<ReceiptType> getDisabledReceiptTypesList();

    int getDisabledReceiptTypesValue(int i);

    List<Integer> getDisabledReceiptTypesValueList();

    boolean getMutedForCurrentUser();

    /* synthetic */ boolean isInitialized();
}
