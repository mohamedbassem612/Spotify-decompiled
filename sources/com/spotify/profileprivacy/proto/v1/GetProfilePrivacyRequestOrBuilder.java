package com.spotify.profileprivacy.proto.v1;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface GetProfilePrivacyRequestOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    GetProfilePrivacyRequest.UserCase getUserCase();

    String getUserId();

    phc getUserIdBytes();

    String getUsername();

    phc getUsernameBytes();

    boolean hasUserId();

    boolean hasUsername();

    /* synthetic */ boolean isInitialized();
}
