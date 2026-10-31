package com.spotify.kidsview.v1.proto;

import com.google.protobuf.StringValue;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public interface ChildOrBuilder extends v2j0 {
    String getChildId();

    phc getChildIdBytes();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    StringValue getImageUri();

    boolean getIsFree();

    Profile getProfile();

    boolean hasImageUri();

    boolean hasProfile();

    /* synthetic */ boolean isInitialized();
}
