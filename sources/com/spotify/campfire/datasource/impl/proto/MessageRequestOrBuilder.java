package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface MessageRequestOrBuilder extends v2j0 {
    AddActivity getAddActivity();

    AddContribution getAddContribution();

    AddContributionForGroup getAddContributionForGroup();

    MessageRequest.CmrCase getCmrCase();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    DeleteActivity getDeleteActivity();

    DeleteContribution getDeleteContribution();

    ModifyContribution getModifyContribution();

    boolean hasAddActivity();

    boolean hasAddContribution();

    boolean hasAddContributionForGroup();

    boolean hasDeleteActivity();

    boolean hasDeleteContribution();

    boolean hasModifyContribution();

    /* synthetic */ boolean isInitialized();
}
