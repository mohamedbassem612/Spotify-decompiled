package com.spotify.kidsview.v1.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public interface PlanMembershipOrBuilder extends v2j0 {
    AddToPlanAction getAddAction();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getPlanLabel();

    phc getPlanLabelBytes();

    RemoveFromPlanAction getRemoveAction();

    boolean hasAddAction();

    boolean hasRemoveAction();

    /* synthetic */ boolean isInitialized();
}
