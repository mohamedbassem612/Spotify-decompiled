package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage$;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.h661;
import p.nma0;
import p.o661;
import p.p661;
import p.u890;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse;", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "message", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;Lp/p661;)V", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse;Lp/z1k;Lp/h661;)V", "write$Self", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "getMessage", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class FetchMessageResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final InAppMessage message;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageResponse;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return FetchMessageResponse$.serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FetchMessageResponse(int i, InAppMessage inAppMessage, p661 p661Var) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = inAppMessage;
        }
    }

    public static /* synthetic */ FetchMessageResponse copy$default(FetchMessageResponse fetchMessageResponse, InAppMessage inAppMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            inAppMessage = fetchMessageResponse.message;
        }
        return fetchMessageResponse.copy(inAppMessage);
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk(FetchMessageResponse self, z1k output, h661 serialDesc) {
        if (!output.d0() && self.message == null) {
            return;
        }
        output.s(serialDesc, 0, InAppMessage$.serializer.INSTANCE, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InAppMessage getMessage() {
        return this.message;
    }

    public final FetchMessageResponse copy(InAppMessage message) {
        return new FetchMessageResponse(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FetchMessageResponse) && u890.j(this.message, ((FetchMessageResponse) other).message);
    }

    public final InAppMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        InAppMessage inAppMessage = this.message;
        if (inAppMessage == null) {
            return 0;
        }
        return inAppMessage.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchMessageResponse() {
        this((InAppMessage) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public FetchMessageResponse(InAppMessage inAppMessage) {
        this.message = inAppMessage;
    }

    public /* synthetic */ FetchMessageResponse(InAppMessage inAppMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : inAppMessage);
    }
}
