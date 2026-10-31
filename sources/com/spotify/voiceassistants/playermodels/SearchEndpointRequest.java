package com.spotify.voiceassistants.playermodels;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.chc1;
import p.cy30;
import p.h661;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014JX\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010.\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u0014R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u0017R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u0017R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010\u001aR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010\u0014R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b@\u00102\u001a\u0004\b?\u0010\u0014¨\u0006C"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/SearchEndpointRequest;", "", "", "textQuery", "textQueryLanguage", "Lcom/spotify/voiceassistants/playermodels/SourceDevice;", "sourceDevice", "targetDevice", "Lcom/spotify/voiceassistants/playermodels/ParsedQuery;", "parsedQuery", "voiceFeatureName", "interactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/SourceDevice;Lcom/spotify/voiceassistants/playermodels/SourceDevice;Lcom/spotify/voiceassistants/playermodels/ParsedQuery;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/SourceDevice;Lcom/spotify/voiceassistants/playermodels/SourceDevice;Lcom/spotify/voiceassistants/playermodels/ParsedQuery;Ljava/lang/String;Ljava/lang/String;Lp/p661;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/spotify/voiceassistants/playermodels/SourceDevice;", "component4", "component5", "()Lcom/spotify/voiceassistants/playermodels/ParsedQuery;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/SourceDevice;Lcom/spotify/voiceassistants/playermodels/SourceDevice;Lcom/spotify/voiceassistants/playermodels/ParsedQuery;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/voiceassistants/playermodels/SearchEndpointRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/SearchEndpointRequest;Lp/z1k;Lp/h661;)V", "write$Self", "Ljava/lang/String;", "getTextQuery", "getTextQuery$annotations", "()V", "getTextQueryLanguage", "getTextQueryLanguage$annotations", "Lcom/spotify/voiceassistants/playermodels/SourceDevice;", "getSourceDevice", "getSourceDevice$annotations", "getTargetDevice", "getTargetDevice$annotations", "Lcom/spotify/voiceassistants/playermodels/ParsedQuery;", "getParsedQuery", "getParsedQuery$annotations", "getVoiceFeatureName", "getVoiceFeatureName$annotations", "getInteractionId", "getInteractionId$annotations", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
@o661
public final /* data */ class SearchEndpointRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String interactionId;
    private final ParsedQuery parsedQuery;
    private final SourceDevice sourceDevice;
    private final SourceDevice targetDevice;
    private final String textQuery;
    private final String textQueryLanguage;
    private final String voiceFeatureName;

    public /* synthetic */ SearchEndpointRequest(int i, String str, String str2, SourceDevice sourceDevice, SourceDevice sourceDevice2, ParsedQuery parsedQuery, String str3, String str4, p661 p661Var) {
        if (55 != (i & 55)) {
            o6p1.t(i, 55, SearchEndpointRequest$.serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.textQuery = str;
        this.textQueryLanguage = str2;
        this.sourceDevice = sourceDevice;
        if ((i & 8) == 0) {
            this.targetDevice = sourceDevice;
        } else {
            this.targetDevice = sourceDevice2;
        }
        this.parsedQuery = parsedQuery;
        this.voiceFeatureName = str3;
        if ((i & 64) == 0) {
            this.interactionId = null;
        } else {
            this.interactionId = str4;
        }
    }

    public static /* synthetic */ SearchEndpointRequest copy$default(SearchEndpointRequest searchEndpointRequest, String str, String str2, SourceDevice sourceDevice, SourceDevice sourceDevice2, ParsedQuery parsedQuery, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchEndpointRequest.textQuery;
        }
        if ((i & 2) != 0) {
            str2 = searchEndpointRequest.textQueryLanguage;
        }
        if ((i & 4) != 0) {
            sourceDevice = searchEndpointRequest.sourceDevice;
        }
        if ((i & 8) != 0) {
            sourceDevice2 = searchEndpointRequest.targetDevice;
        }
        if ((i & 16) != 0) {
            parsedQuery = searchEndpointRequest.parsedQuery;
        }
        if ((i & 32) != 0) {
            str3 = searchEndpointRequest.voiceFeatureName;
        }
        if ((i & 64) != 0) {
            str4 = searchEndpointRequest.interactionId;
        }
        String str5 = str3;
        String str6 = str4;
        ParsedQuery parsedQuery2 = parsedQuery;
        SourceDevice sourceDevice3 = sourceDevice;
        return searchEndpointRequest.copy(str, str2, sourceDevice3, sourceDevice2, parsedQuery2, str5, str6);
    }

    public static /* synthetic */ void getInteractionId$annotations() {
    }

    public static /* synthetic */ void getParsedQuery$annotations() {
    }

    public static /* synthetic */ void getSourceDevice$annotations() {
    }

    public static /* synthetic */ void getTargetDevice$annotations() {
    }

    public static /* synthetic */ void getTextQuery$annotations() {
    }

    public static /* synthetic */ void getTextQueryLanguage$annotations() {
    }

    public static /* synthetic */ void getVoiceFeatureName$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels(SearchEndpointRequest self, z1k output, h661 serialDesc) {
        output.G(serialDesc, 0, self.textQuery);
        output.G(serialDesc, 1, self.textQueryLanguage);
        SourceDevice$.serializer serializerVar = SourceDevice$.serializer.INSTANCE;
        output.k(serialDesc, 2, serializerVar, self.sourceDevice);
        if (output.d0() || !u890.j(self.targetDevice, self.sourceDevice)) {
            output.k(serialDesc, 3, serializerVar, self.targetDevice);
        }
        output.k(serialDesc, 4, ParsedQuery$.serializer.INSTANCE, self.parsedQuery);
        output.G(serialDesc, 5, self.voiceFeatureName);
        String str = self.interactionId;
        if (str != null) {
            output.s(serialDesc, 6, chc1.a, str);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTextQuery() {
        return this.textQuery;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTextQueryLanguage() {
        return this.textQueryLanguage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SourceDevice getSourceDevice() {
        return this.sourceDevice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SourceDevice getTargetDevice() {
        return this.targetDevice;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ParsedQuery getParsedQuery() {
        return this.parsedQuery;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVoiceFeatureName() {
        return this.voiceFeatureName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInteractionId() {
        return this.interactionId;
    }

    public final SearchEndpointRequest copy(String textQuery, String textQueryLanguage, SourceDevice sourceDevice, SourceDevice targetDevice, ParsedQuery parsedQuery, String voiceFeatureName, String interactionId) {
        return new SearchEndpointRequest(textQuery, textQueryLanguage, sourceDevice, targetDevice, parsedQuery, voiceFeatureName, interactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEndpointRequest)) {
            return false;
        }
        SearchEndpointRequest searchEndpointRequest = (SearchEndpointRequest) other;
        return u890.j(this.textQuery, searchEndpointRequest.textQuery) && u890.j(this.textQueryLanguage, searchEndpointRequest.textQueryLanguage) && u890.j(this.sourceDevice, searchEndpointRequest.sourceDevice) && u890.j(this.targetDevice, searchEndpointRequest.targetDevice) && u890.j(this.parsedQuery, searchEndpointRequest.parsedQuery) && u890.j(this.voiceFeatureName, searchEndpointRequest.voiceFeatureName) && u890.j(this.interactionId, searchEndpointRequest.interactionId);
    }

    public final String getInteractionId() {
        return this.interactionId;
    }

    public final ParsedQuery getParsedQuery() {
        return this.parsedQuery;
    }

    public final SourceDevice getSourceDevice() {
        return this.sourceDevice;
    }

    public final SourceDevice getTargetDevice() {
        return this.targetDevice;
    }

    public final String getTextQuery() {
        return this.textQuery;
    }

    public final String getTextQueryLanguage() {
        return this.textQueryLanguage;
    }

    public final String getVoiceFeatureName() {
        return this.voiceFeatureName;
    }

    public int hashCode() {
        int iD = cy30.d((this.parsedQuery.hashCode() + ((this.targetDevice.hashCode() + ((this.sourceDevice.hashCode() + cy30.d(this.textQuery.hashCode() * 31, 31, this.textQueryLanguage)) * 31)) * 31)) * 31, 31, this.voiceFeatureName);
        String str = this.interactionId;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return super.toString();
    }

    public SearchEndpointRequest(String str, String str2, SourceDevice sourceDevice, SourceDevice sourceDevice2, ParsedQuery parsedQuery, String str3, String str4) {
        this.textQuery = str;
        this.textQueryLanguage = str2;
        this.sourceDevice = sourceDevice;
        this.targetDevice = sourceDevice2;
        this.parsedQuery = parsedQuery;
        this.voiceFeatureName = str3;
        this.interactionId = str4;
    }

    public /* synthetic */ SearchEndpointRequest(String str, String str2, SourceDevice sourceDevice, SourceDevice sourceDevice2, ParsedQuery parsedQuery, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, sourceDevice, (i & 8) != 0 ? sourceDevice : sourceDevice2, parsedQuery, str3, (i & 64) != 0 ? null : str4);
    }
}
