package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.CappingRule;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.nma0;
import p.r36;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class Message$CreativeMessage$Companion$$childSerializers$5 extends hab0 implements Function0 {
    public static final Message$CreativeMessage$Companion$$childSerializers$5 INSTANCE = new Message$CreativeMessage$Companion$$childSerializers$5();

    public Message$CreativeMessage$Companion$$childSerializers$5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final nma0 invoke() {
        return new r36(CappingRule.INSTANCE.serializer(), (byte) 1);
    }
}
