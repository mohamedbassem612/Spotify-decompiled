package com.spotify.cosmos.util.policy.proto;

import java.util.List;
import p.hz00;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface TrackDecorationPolicyOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getDiscNumber();

    hz00 getExtension(int i);

    int getExtensionCount();

    List<hz00> getExtensionList();

    int getExtensionValue(int i);

    List<Integer> getExtensionValueList();

    boolean getHasLyrics();

    boolean getIs19PlusOnly();

    boolean getIsAvailableInMetadataCatalogue();

    boolean getIsCurated();

    boolean getIsExplicit();

    boolean getIsLocal();

    boolean getIsPremiumOnly();

    boolean getLength();

    boolean getLink();

    boolean getLocallyPlayable();

    boolean getName();

    boolean getPlayable();

    boolean getPlayableLocalTrack();

    boolean getPlayableTrackLink();

    boolean getPopularity();

    boolean getPreviewId();

    boolean getToBeObfuscated();

    boolean getTrackDescriptors();

    boolean getTrackNumber();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
