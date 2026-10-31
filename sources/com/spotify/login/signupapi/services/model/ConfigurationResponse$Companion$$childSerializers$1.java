package com.spotify.login.signupapi.services.model;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.nma0;
import p.r36;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ConfigurationResponse$Companion$$childSerializers$1 extends hab0 implements Function0 {
    public static final ConfigurationResponse$Companion$$childSerializers$1 INSTANCE = new ConfigurationResponse$Companion$$childSerializers$1();

    public ConfigurationResponse$Companion$$childSerializers$1() {
        super(0);
    }

    public final nma0 invoke() {
        return new r36(CallingCode$$serializer.INSTANCE, (byte) 0);
    }
}
