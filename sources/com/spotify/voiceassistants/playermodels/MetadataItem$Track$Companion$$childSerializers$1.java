package com.spotify.voiceassistants.playermodels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.nma0;
import p.r36;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class MetadataItem$Track$Companion$$childSerializers$1 extends hab0 implements Function0 {
    public static final MetadataItem$Track$Companion$$childSerializers$1 INSTANCE = new MetadataItem$Track$Companion$$childSerializers$1();

    public MetadataItem$Track$Companion$$childSerializers$1() {
        super(0);
    }

    public final nma0 invoke() {
        return new r36(Image$$serializer.INSTANCE, (byte) 0);
    }
}
