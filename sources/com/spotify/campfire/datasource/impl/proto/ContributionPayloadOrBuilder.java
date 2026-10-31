package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ContributionPayloadOrBuilder extends v2j0 {
    ContributionPayload.CcpCase getCcpCase();

    ChatEvent getChatEvent();

    ChatInvite getChatInvite();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    FreeText getFreeText();

    ContributionMetadata getMetadata();

    OffplatformTrackedShare getOpTrackedShare();

    RichMedia getRichMedia();

    TasteMatchCard getTasteMatchCard();

    TrackedShare getTrackedShare();

    boolean hasChatEvent();

    boolean hasChatInvite();

    boolean hasFreeText();

    boolean hasMetadata();

    boolean hasOpTrackedShare();

    boolean hasRichMedia();

    boolean hasTasteMatchCard();

    boolean hasTrackedShare();

    /* synthetic */ boolean isInitialized();
}
