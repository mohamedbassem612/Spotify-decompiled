package com.spotify.kidsview.v1.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface TransitionToManagedAccountRequestOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getMemberId();

    phc getMemberIdBytes();

    String getParentPinHash();

    phc getParentPinHashBytes();

    String getParentalConsentSessionId();

    phc getParentalConsentSessionIdBytes();

    GenAlphaManagedSettings getSettings();

    TransitionToManagedAccountRequest.TransitioningUserIdentifierCase getTransitioningUserIdentifierCase();

    boolean hasMemberId();

    boolean hasParentPinHash();

    boolean hasParentalConsentSessionId();

    boolean hasSettings();

    /* synthetic */ boolean isInitialized();
}
