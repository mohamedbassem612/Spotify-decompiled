package com.spotify.dj.interactionmanager.v0;

import java.util.Map;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface ContentElementOrBuilder extends v2j0 {
    boolean containsMetadata(String str);

    /* synthetic */ s2j0 getDefaultInstanceForType();

    @Deprecated
    Map<String, String> getMetadata();

    int getMetadataCount();

    Map<String, String> getMetadataMap();

    String getMetadataOrDefault(String str, String str2);

    String getMetadataOrThrow(String str);

    String getUid();

    phc getUidBytes();

    String getUri();

    phc getUriBytes();

    /* synthetic */ boolean isInitialized();
}
