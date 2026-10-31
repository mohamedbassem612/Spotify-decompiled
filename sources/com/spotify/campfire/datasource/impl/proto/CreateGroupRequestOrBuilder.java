package com.spotify.campfire.datasource.impl.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface CreateGroupRequestOrBuilder extends v2j0 {
    CreateGroupOptions getCreateGroupOptions();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getMemberUsername(int i);

    phc getMemberUsernameBytes(int i);

    int getMemberUsernameCount();

    List<String> getMemberUsernameList();

    String getName();

    phc getNameBytes();

    boolean hasCreateGroupOptions();

    boolean hasName();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
