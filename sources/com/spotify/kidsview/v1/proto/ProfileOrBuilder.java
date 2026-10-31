package com.spotify.kidsview.v1.proto;

import com.google.protobuf.Int32Value;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public interface ProfileOrBuilder extends v2j0 {
    boolean getAllowedInMusicApp();

    String getAvatar();

    phc getAvatarBytes();

    Int32Value getColor();

    String getDateOfBirth();

    phc getDateOfBirthBytes();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getName();

    phc getNameBytes();

    Avatar getV2Avatar();

    int getV2AvatarValue();

    boolean hasColor();

    boolean hasV2Avatar();

    /* synthetic */ boolean isInitialized();
}
