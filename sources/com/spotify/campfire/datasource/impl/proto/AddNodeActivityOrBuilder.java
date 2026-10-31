package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface AddNodeActivityOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getNodePathId(int i);

    phc getNodePathIdBytes(int i);

    int getNodePathIdCount();

    List<String> getNodePathIdList();

    ActivityRequest getRequest();

    boolean hasRequest();

    /* synthetic */ boolean isInitialized();
}
