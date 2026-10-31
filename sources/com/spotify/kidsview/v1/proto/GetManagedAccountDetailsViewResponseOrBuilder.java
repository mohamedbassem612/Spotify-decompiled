package com.spotify.kidsview.v1.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public interface GetManagedAccountDetailsViewResponseOrBuilder extends v2j0 {
    AccountType getAccountType();

    int getAccountTypeValue();

    String getChildId();

    phc getChildIdBytes();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    DeleteAction getDeleteAction();

    GraduationBanner getGraduationBanner();

    boolean getHasAudiobooksAvailable();

    ParentalControls getParentalControls();

    int getPendingRequestCount();

    PlanMembership getPlanMembership();

    ManagedAccountProfile getProfile();

    boolean hasDeleteAction();

    boolean hasGraduationBanner();

    boolean hasParentalControls();

    boolean hasPlanMembership();

    boolean hasProfile();

    /* synthetic */ boolean isInitialized();
}
