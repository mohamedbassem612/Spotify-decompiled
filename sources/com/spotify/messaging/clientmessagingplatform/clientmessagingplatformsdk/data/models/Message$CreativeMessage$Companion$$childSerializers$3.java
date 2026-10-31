package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageSource;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.nma0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class Message$CreativeMessage$Companion$$childSerializers$3 extends hab0 implements Function0 {
    public static final Message$CreativeMessage$Companion$$childSerializers$3 INSTANCE = new Message$CreativeMessage$Companion$$childSerializers$3();

    public Message$CreativeMessage$Companion$$childSerializers$3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final nma0 invoke() {
        return MessageSource.INSTANCE.serializer();
    }
}
