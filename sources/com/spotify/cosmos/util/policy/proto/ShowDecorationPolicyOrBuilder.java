package com.spotify.cosmos.util.policy.proto;

import java.util.List;
import p.hz00;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ShowDecorationPolicyOrBuilder extends v2j0 {
    boolean getConsumptionOrder();

    boolean getCopyrights();

    boolean getCovers();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getDescription();

    hz00 getExtension(int i);

    int getExtensionCount();

    List<hz00> getExtensionList();

    int getExtensionValue(int i);

    List<Integer> getExtensionValueList();

    boolean getFormatListAttributes();

    boolean getIsBook();

    boolean getIsCreatorChannel();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    boolean getLanguage();

    boolean getLink();

    boolean getMediaTypeEnum();

    boolean getName();

    boolean getNumEpisodes();

    boolean getPopularity();

    boolean getPublisher();

    boolean getTrailerUri();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
