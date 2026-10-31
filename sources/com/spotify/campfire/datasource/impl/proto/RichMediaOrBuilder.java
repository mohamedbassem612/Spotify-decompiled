package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface RichMediaOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    GiphyGif getGiphyGif();

    RichMedia.MediaTypeCase getMediaTypeCase();

    Sticker getSticker();

    UGC getUgc();

    boolean hasGiphyGif();

    boolean hasSticker();

    boolean hasUgc();

    /* synthetic */ boolean isInitialized();
}
