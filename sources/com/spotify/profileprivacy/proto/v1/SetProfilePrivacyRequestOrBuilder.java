package com.spotify.profileprivacy.proto.v1;

import com.google.protobuf.FieldMask;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface SetProfilePrivacyRequestOrBuilder extends v2j0 {
    boolean getAllowFollows();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    FieldMask getMask();

    boolean getShowFollows();

    boolean getShowPublishedPlaylists();

    SetProfilePrivacyRequest.UserCase getUserCase();

    String getUserId();

    phc getUserIdBytes();

    String getUsername();

    phc getUsernameBytes();

    boolean hasAllowFollows();

    boolean hasMask();

    boolean hasShowFollows();

    boolean hasShowPublishedPlaylists();

    boolean hasUserId();

    boolean hasUsername();

    /* synthetic */ boolean isInitialized();
}
