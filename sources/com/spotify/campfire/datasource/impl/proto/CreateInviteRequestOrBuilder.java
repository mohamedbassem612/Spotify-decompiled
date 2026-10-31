package com.spotify.campfire.datasource.impl.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface CreateInviteRequestOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    InviteOptions getOptions();

    String getUri();

    phc getUriBytes();

    boolean hasOptions();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
