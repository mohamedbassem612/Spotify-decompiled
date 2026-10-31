package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.content.Context;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.d3j0;
import p.iac0;
import p.lmc;
import p.u890;
import p.uy31;
import p.vks;
import p.x2j0;
import p.z2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJX\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010\u001f¨\u0006:"}, d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ViewRequest;", "", "Landroid/content/Context;", "context", "Lp/iac0;", "lifecycleOwner", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "token", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;", "dynamicTagsMetadata", "Lp/lmc;", "uiLifecycle", "Lp/uy31;", "displayRulesConfig", "Lp/d3j0;", "orchestrationMetadata", "<init>", "(Landroid/content/Context;Lp/iac0;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;Lp/lmc;Lp/uy31;Lp/d3j0;)V", "component1", "()Landroid/content/Context;", "component2", "()Lp/iac0;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;", "component5", "()Lp/lmc;", "component6", "()Lp/uy31;", "component7", "()Lp/d3j0;", "copy", "(Landroid/content/Context;Lp/iac0;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;Lp/lmc;Lp/uy31;Lp/d3j0;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ViewRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "Lp/iac0;", "getLifecycleOwner", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "getToken", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;", "getDynamicTagsMetadata", "Lp/lmc;", "getUiLifecycle", "Lp/uy31;", "getDisplayRulesConfig", "Lp/d3j0;", "getOrchestrationMetadata", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final /* data */ class ViewRequest {
    public static final int $stable = 8;
    private final Context context;
    private final uy31 displayRulesConfig;
    private final DynamicTagsMetadata dynamicTagsMetadata;
    private final iac0 lifecycleOwner;
    private final d3j0 orchestrationMetadata;
    private final MessageResponseToken token;
    private final lmc uiLifecycle;

    public /* synthetic */ ViewRequest(Context context, iac0 iac0Var, MessageResponseToken messageResponseToken, DynamicTagsMetadata dynamicTagsMetadata, lmc lmcVar, uy31 uy31Var, d3j0 d3j0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iac0Var, messageResponseToken, (i & 8) != 0 ? null : dynamicTagsMetadata, (i & 16) != 0 ? lmc.b : lmcVar, (i & 32) != 0 ? vks.a : uy31Var, (i & 64) != 0 ? new d3j0(new z2j0(false), x2j0.a) : d3j0Var);
    }

    public static /* synthetic */ ViewRequest copy$default(ViewRequest viewRequest, Context context, iac0 iac0Var, MessageResponseToken messageResponseToken, DynamicTagsMetadata dynamicTagsMetadata, lmc lmcVar, uy31 uy31Var, d3j0 d3j0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            context = viewRequest.context;
        }
        if ((i & 2) != 0) {
            iac0Var = viewRequest.lifecycleOwner;
        }
        if ((i & 4) != 0) {
            messageResponseToken = viewRequest.token;
        }
        if ((i & 8) != 0) {
            dynamicTagsMetadata = viewRequest.dynamicTagsMetadata;
        }
        if ((i & 16) != 0) {
            lmcVar = viewRequest.uiLifecycle;
        }
        if ((i & 32) != 0) {
            uy31Var = viewRequest.displayRulesConfig;
        }
        if ((i & 64) != 0) {
            d3j0Var = viewRequest.orchestrationMetadata;
        }
        uy31 uy31Var2 = uy31Var;
        d3j0 d3j0Var2 = d3j0Var;
        lmc lmcVar2 = lmcVar;
        MessageResponseToken messageResponseToken2 = messageResponseToken;
        return viewRequest.copy(context, iac0Var, messageResponseToken2, dynamicTagsMetadata, lmcVar2, uy31Var2, d3j0Var2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final iac0 getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageResponseToken getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DynamicTagsMetadata getDynamicTagsMetadata() {
        return this.dynamicTagsMetadata;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final lmc getUiLifecycle() {
        return this.uiLifecycle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final uy31 getDisplayRulesConfig() {
        return this.displayRulesConfig;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final d3j0 getOrchestrationMetadata() {
        return this.orchestrationMetadata;
    }

    public final ViewRequest copy(Context context, iac0 lifecycleOwner, MessageResponseToken token, DynamicTagsMetadata dynamicTagsMetadata, lmc uiLifecycle, uy31 displayRulesConfig, d3j0 orchestrationMetadata) {
        return new ViewRequest(context, lifecycleOwner, token, dynamicTagsMetadata, uiLifecycle, displayRulesConfig, orchestrationMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewRequest)) {
            return false;
        }
        ViewRequest viewRequest = (ViewRequest) other;
        return u890.j(this.context, viewRequest.context) && u890.j(this.lifecycleOwner, viewRequest.lifecycleOwner) && u890.j(this.token, viewRequest.token) && u890.j(this.dynamicTagsMetadata, viewRequest.dynamicTagsMetadata) && this.uiLifecycle == viewRequest.uiLifecycle && u890.j(this.displayRulesConfig, viewRequest.displayRulesConfig) && u890.j(this.orchestrationMetadata, viewRequest.orchestrationMetadata);
    }

    public final Context getContext() {
        return this.context;
    }

    public final uy31 getDisplayRulesConfig() {
        return this.displayRulesConfig;
    }

    public final DynamicTagsMetadata getDynamicTagsMetadata() {
        return this.dynamicTagsMetadata;
    }

    public final iac0 getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final d3j0 getOrchestrationMetadata() {
        return this.orchestrationMetadata;
    }

    public final MessageResponseToken getToken() {
        return this.token;
    }

    public final lmc getUiLifecycle() {
        return this.uiLifecycle;
    }

    public int hashCode() {
        int iHashCode = (this.token.hashCode() + ((this.lifecycleOwner.hashCode() + (this.context.hashCode() * 31)) * 31)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.dynamicTagsMetadata;
        return this.orchestrationMetadata.hashCode() + ((this.displayRulesConfig.hashCode() + ((this.uiLifecycle.hashCode() + ((iHashCode + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode())) * 31)) * 31)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public ViewRequest(Context context, iac0 iac0Var, MessageResponseToken messageResponseToken, DynamicTagsMetadata dynamicTagsMetadata, lmc lmcVar, uy31 uy31Var, d3j0 d3j0Var) {
        this.context = context;
        this.lifecycleOwner = iac0Var;
        this.token = messageResponseToken;
        this.dynamicTagsMetadata = dynamicTagsMetadata;
        this.uiLifecycle = lmcVar;
        this.displayRulesConfig = uy31Var;
        this.orchestrationMetadata = d3j0Var;
    }
}
