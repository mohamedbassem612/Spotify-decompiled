package com.spotify.cosmos.util.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface EpisodeMetadataOrBuilder extends v2j0 {
    boolean getAvailable();

    boolean getBackgroundable();

    ImageGroup getCovers();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getDescription();

    phc getDescriptionBytes();

    EpisodeMetadata.EpisodeType getEpisodeType();

    Extension getExtension(int i);

    int getExtensionCount();

    List<Extension> getExtensionList();

    ImageGroup getFreezeFrames();

    boolean getIs19PlusOnly();

    boolean getIsBookChapter();

    boolean getIsCurated();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    boolean getIsPodcastShort();

    String getLanguage();

    phc getLanguageBytes();

    int getLength();

    String getLink();

    phc getLinkBytes();

    String getManifestId();

    phc getManifestIdBytes();

    EpisodeMetadata.MediaType getMediaTypeEnum();

    String getName();

    phc getNameBytes();

    int getNumber();

    String getPreviewId();

    phc getPreviewIdBytes();

    String getPreviewManifestId();

    phc getPreviewManifestIdBytes();

    long getPublishDate();

    EpisodeShowMetadata getShow();

    boolean hasAvailable();

    boolean hasBackgroundable();

    boolean hasCovers();

    boolean hasDescription();

    boolean hasEpisodeType();

    boolean hasFreezeFrames();

    boolean hasIs19PlusOnly();

    boolean hasIsBookChapter();

    boolean hasIsCurated();

    boolean hasIsExplicit();

    boolean hasIsMusicAndTalk();

    boolean hasIsPodcastShort();

    boolean hasLanguage();

    boolean hasLength();

    boolean hasLink();

    boolean hasManifestId();

    boolean hasMediaTypeEnum();

    boolean hasName();

    boolean hasNumber();

    boolean hasPreviewId();

    boolean hasPreviewManifestId();

    boolean hasPublishDate();

    boolean hasShow();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
