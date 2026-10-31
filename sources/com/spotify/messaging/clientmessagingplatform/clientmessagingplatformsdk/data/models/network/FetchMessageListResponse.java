package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.List;
import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageListResponse;", "", "messages", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "triggers", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "getTriggers", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final /* data */ class FetchMessageListResponse {
    public static final int $stable = 0;
    private final List<InAppMessage> messages;
    private final List<Trigger> triggers;

    public FetchMessageListResponse(List<InAppMessage> list, List<Trigger> list2) {
        this.messages = list;
        this.triggers = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchMessageListResponse copy$default(FetchMessageListResponse fetchMessageListResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fetchMessageListResponse.messages;
        }
        if ((i & 2) != 0) {
            list2 = fetchMessageListResponse.triggers;
        }
        return fetchMessageListResponse.copy(list, list2);
    }

    public final List<InAppMessage> component1() {
        return this.messages;
    }

    public final List<Trigger> component2() {
        return this.triggers;
    }

    public final FetchMessageListResponse copy(List<InAppMessage> messages, List<Trigger> triggers) {
        return new FetchMessageListResponse(messages, triggers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchMessageListResponse)) {
            return false;
        }
        FetchMessageListResponse fetchMessageListResponse = (FetchMessageListResponse) other;
        return u890.j(this.messages, fetchMessageListResponse.messages) && u890.j(this.triggers, fetchMessageListResponse.triggers);
    }

    public final List<InAppMessage> getMessages() {
        return this.messages;
    }

    public final List<Trigger> getTriggers() {
        return this.triggers;
    }

    public int hashCode() {
        return this.triggers.hashCode() + (this.messages.hashCode() * 31);
    }

    public String toString() {
        return super.toString();
    }
}
