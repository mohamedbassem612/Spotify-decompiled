package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.f4i1;
import p.mmr0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R)\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState$ValidationFailed;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "message", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Rule;", "failingRules", "", "Lp/mmr0;", "", "failureDetails", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;Ljava/util/List;Ljava/util/Set;)V", "component1", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "component2", "()Ljava/util/List;", "component3", "()Ljava/util/Set;", "copy", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;Ljava/util/List;Ljava/util/Set;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdkimpl/domain/effecthandlers/SelectMessageEffectHandlerImpl$MessageState$ValidationFailed;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message;", "getMessage", "Ljava/util/List;", "getFailingRules", "Ljava/util/Set;", "getFailureDetails", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdkimpl-clientmessagingplatformsdkimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* data */ class SelectMessageEffectHandlerImpl$MessageState$ValidationFailed extends SelectMessageEffectHandlerImpl.MessageState {
    public static final int $stable = Message.$stable;
    private final List<Rule> failingRules;
    private final Set<mmr0> failureDetails;
    private final Message message;

    public SelectMessageEffectHandlerImpl$MessageState$ValidationFailed(Message message, List<? extends Rule> list, Set<? extends mmr0> set) {
        super((DefaultConstructorMarker) null);
        this.message = message;
        this.failingRules = list;
        this.failureDetails = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectMessageEffectHandlerImpl$MessageState$ValidationFailed copy$default(SelectMessageEffectHandlerImpl$MessageState$ValidationFailed selectMessageEffectHandlerImpl$MessageState$ValidationFailed, Message message, List list, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            message = selectMessageEffectHandlerImpl$MessageState$ValidationFailed.message;
        }
        if ((i & 2) != 0) {
            list = selectMessageEffectHandlerImpl$MessageState$ValidationFailed.failingRules;
        }
        if ((i & 4) != 0) {
            set = selectMessageEffectHandlerImpl$MessageState$ValidationFailed.failureDetails;
        }
        return selectMessageEffectHandlerImpl$MessageState$ValidationFailed.copy(message, list, set);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    public final List<Rule> component2() {
        return this.failingRules;
    }

    public final Set<mmr0> component3() {
        return this.failureDetails;
    }

    public final SelectMessageEffectHandlerImpl$MessageState$ValidationFailed copy(Message message, List<? extends Rule> failingRules, Set<? extends mmr0> failureDetails) {
        return new SelectMessageEffectHandlerImpl$MessageState$ValidationFailed(message, failingRules, failureDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectMessageEffectHandlerImpl$MessageState$ValidationFailed)) {
            return false;
        }
        SelectMessageEffectHandlerImpl$MessageState$ValidationFailed selectMessageEffectHandlerImpl$MessageState$ValidationFailed = (SelectMessageEffectHandlerImpl$MessageState$ValidationFailed) other;
        return u890.j(this.message, selectMessageEffectHandlerImpl$MessageState$ValidationFailed.message) && u890.j(this.failingRules, selectMessageEffectHandlerImpl$MessageState$ValidationFailed.failingRules) && u890.j(this.failureDetails, selectMessageEffectHandlerImpl$MessageState$ValidationFailed.failureDetails);
    }

    public final List<Rule> getFailingRules() {
        return this.failingRules;
    }

    public final Set<mmr0> getFailureDetails() {
        return this.failureDetails;
    }

    public Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.failureDetails.hashCode() + f4i1.b(this.message.hashCode() * 31, 31, this.failingRules);
    }

    public String toString() {
        return super/*java.lang.Object*/.toString();
    }
}
