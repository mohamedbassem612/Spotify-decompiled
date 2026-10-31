package com.spotify.cosmos.util.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ShowMetadataOrBuilder extends v2j0 {
    String getConsumptionOrder();

    phc getConsumptionOrderBytes();

    String getCopyright(int i);

    phc getCopyrightBytes(int i);

    int getCopyrightCount();

    List<String> getCopyrightList();

    ImageGroup getCovers();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getDescription();

    phc getDescriptionBytes();

    Extension getExtension(int i);

    int getExtensionCount();

    List<Extension> getExtensionList();

    ShowListAttribute getFormatListAttributes(int i);

    int getFormatListAttributesCount();

    List<ShowListAttribute> getFormatListAttributesList();

    boolean getIsBook();

    boolean getIsCreatorChannel();

    boolean getIsExplicit();

    boolean getIsMusicAndTalk();

    String getLanguage();

    phc getLanguageBytes();

    String getLink();

    phc getLinkBytes();

    int getMediaTypeEnum();

    String getName();

    phc getNameBytes();

    int getNumEpisodes();

    int getPopularity();

    String getPublisher();

    phc getPublisherBytes();

    String getTrailerUri();

    phc getTrailerUriBytes();

    boolean hasConsumptionOrder();

    boolean hasCovers();

    boolean hasDescription();

    boolean hasIsBook();

    boolean hasIsCreatorChannel();

    boolean hasIsExplicit();

    boolean hasIsMusicAndTalk();

    boolean hasLanguage();

    boolean hasLink();

    boolean hasMediaTypeEnum();

    boolean hasName();

    boolean hasNumEpisodes();

    boolean hasPopularity();

    boolean hasPublisher();

    boolean hasTrailerUri();

    /* synthetic */ boolean isInitialized();
}
