package com.spotify.kidsview.v1.proto;

import java.util.List;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public interface GetManagedAccountsViewResponseOrBuilder extends v2j0 {
    CreateNewManagedAccountAction getCreateNewManagedAccountAction();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    ManagedAccount getManagedAccounts(int i);

    int getManagedAccountsCount();

    List<ManagedAccount> getManagedAccountsList();

    int getMaxManagedAccountAge();

    boolean hasCreateNewManagedAccountAction();

    /* synthetic */ boolean isInitialized();
}
