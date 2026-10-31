package com.spotify.kidsview.v1.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public interface ManagedAccountOrBuilder extends v2j0 {
    AccountType getAccountType();

    int getAccountTypeValue();

    int getColor();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getImageUrl();

    phc getImageUrlBytes();

    String getManagedAccountId();

    phc getManagedAccountIdBytes();

    String getName();

    phc getNameBytes();

    int getPendingRequestCount();

    boolean hasColor();

    boolean hasImageUrl();

    /* synthetic */ boolean isInitialized();
}
