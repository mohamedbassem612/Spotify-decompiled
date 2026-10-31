package com.spotify.cosmos.util.policy.proto;

import java.util.List;
import p.hz00;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface EpisodeDecorationPolicyOrBuilder extends v2j0 {
    boolean getAvailable();

    boolean getBackgroundable();

    boolean getCovers();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getDescription();

    hz00 getExtension(int i);

    int getExtensionCount();

    List<hz00> getExtensionList();

    int getExtensionValue(int i);

    List<Integer> getExtensionValueList();

    boolean getFreezeFrames();

    boolean getIs19PlusOnly();

    boolean getIsBookChapter();

    boolean getIsCurated();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    boolean getIsPodcastShort();

    boolean getLanguage();

    boolean getLength();

    boolean getLink();

    boolean getManifestId();

    boolean getMediaTypeEnum();

    boolean getName();

    boolean getNumber();

    boolean getPreviewId();

    boolean getPreviewManifestId();

    boolean getPublishDate();

    boolean getType();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
