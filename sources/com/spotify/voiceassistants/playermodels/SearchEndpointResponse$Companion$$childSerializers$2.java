package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.nma0;
import p.r36;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class SearchEndpointResponse$Companion$$childSerializers$2 extends hab0 implements Function0 {
    public static final SearchEndpointResponse$Companion$$childSerializers$2 INSTANCE = new SearchEndpointResponse$Companion$$childSerializers$2();

    public SearchEndpointResponse$Companion$$childSerializers$2() {
        super(0);
    }

    public final nma0 invoke() {
        return new r36(MetadataItem.INSTANCE.serializer(), (byte) 0);
    }
}
