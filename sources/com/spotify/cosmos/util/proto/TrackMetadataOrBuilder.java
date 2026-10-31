package com.spotify.cosmos.util.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface TrackMetadataOrBuilder extends v2j0 {
    TrackAlbumMetadata getAlbum();

    TrackArtistMetadata getArtist(int i);

    int getArtistCount();

    List<TrackArtistMetadata> getArtistList();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    int getDiscNumber();

    Extension getExtension(int i);

    int getExtensionCount();

    List<Extension> getExtensionList();

    boolean getHasLyrics();

    boolean getIs19PlusOnly();

    boolean getIsCurated();

    boolean getIsExplicit();

    boolean getIsLocal();

    boolean getIsPremiumOnly();

    int getLength();

    String getLink();

    phc getLinkBytes();

    boolean getLocallyPlayable();

    String getName();

    phc getNameBytes();

    boolean getPlayable();

    boolean getPlayableLocalTrack();

    String getPlayableTrackLink();

    phc getPlayableTrackLinkBytes();

    int getPopularity();

    String getPreviewId();

    phc getPreviewIdBytes();

    boolean getToBeObfuscated();

    TrackDescriptor getTrackDescriptors(int i);

    int getTrackDescriptorsCount();

    List<TrackDescriptor> getTrackDescriptorsList();

    int getTrackNumber();

    boolean hasAlbum();

    boolean hasDiscNumber();

    boolean hasHasLyrics();

    boolean hasIs19PlusOnly();

    boolean hasIsCurated();

    boolean hasIsExplicit();

    boolean hasIsLocal();

    boolean hasIsPremiumOnly();

    boolean hasLength();

    boolean hasLink();

    boolean hasLocallyPlayable();

    boolean hasName();

    boolean hasPlayable();

    boolean hasPlayableLocalTrack();

    boolean hasPlayableTrackLink();

    boolean hasPopularity();

    boolean hasPreviewId();

    boolean hasToBeObfuscated();

    boolean hasTrackNumber();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
