package com.spotify.voiceassistants.playermodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.chc1;
import p.cy30;
import p.dm5;
import p.h661;
import p.nma0;
import p.o661;
import p.o6p1;
import p.p661;
import p.u890;
import p.z1k;
import p.z6x;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\r\u0010\u000eBq\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0015J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\u0019Jl\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b9\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010\u0015R\u001d\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0006\u00105\u0012\u0004\b=\u00108\u001a\u0004\b<\u0010\u0015R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010>\u0012\u0004\b@\u00108\u001a\u0004\b?\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\bB\u00108\u001a\u0004\bA\u0010\u0015R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010\u0015R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bG\u00108\u001a\u0004\bF\u0010\u0019¨\u0006J"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse;", "Lcom/spotify/voiceassistants/playermodels/SearchResponse;", "", "requestId", "intent", "error", "result", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "feedbackDetails", "action", "feedbackId", "", "alternativeResults", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/MetadataItem;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp/p661;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/MetadataItem;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lp/p661;)V", "getSearchRequestId", "()Ljava/lang/String;", "getResponseFeedbackDetails", "()Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "getResponseAlternativeResults", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/spotify/voiceassistants/playermodels/MetadataItem;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lp/z1k;", "output", "Lp/h661;", "serialDesc", "Lp/rih1;", "write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels", "(Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse;Lp/z1k;Lp/h661;)V", "write$Self", "Ljava/lang/String;", "getRequestId", "getRequestId$annotations", "()V", "getIntent", "getError", "getError$annotations", "getResult", "getResult$annotations", "Lcom/spotify/voiceassistants/playermodels/MetadataItem;", "getFeedbackDetails", "getFeedbackDetails$annotations", "getAction", "getAction$annotations", "getFeedbackId", "getFeedbackId$annotations", "Ljava/util/List;", "getAlternativeResults", "getAlternativeResults$annotations", "Companion", "$serializer", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
@o661
public final /* data */ class SearchEndpointResponse implements SearchResponse {
    private final String action;
    private final List<MetadataItem> alternativeResults;
    private final String error;
    private final MetadataItem feedbackDetails;
    private final String feedbackId;
    private final String intent;
    private final String requestId;
    private final String result;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final znb0[] $childSerializers = {null, null, null, null, dm5.S(2, SearchEndpointResponse$Companion$$childSerializers$1.INSTANCE), null, null, dm5.S(2, SearchEndpointResponse$Companion$$childSerializers$2.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse$Companion;", "", "<init>", "()V", "Lp/nma0;", "Lcom/spotify/voiceassistants/playermodels/SearchEndpointResponse;", "serializer", "()Lp/nma0;", "src_main_java_com_spotify_voiceassistants_playermodels-playermodels"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nma0 serializer() {
            return SearchEndpointResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SearchEndpointResponse(int i, String str, String str2, String str3, String str4, MetadataItem metadataItem, String str5, String str6, List list, p661 p661Var) {
        if (75 != (i & 75)) {
            o6p1.t(i, 75, SearchEndpointResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.requestId = str;
        this.intent = str2;
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = str3;
        }
        this.result = str4;
        if ((i & 16) == 0) {
            this.feedbackDetails = null;
        } else {
            this.feedbackDetails = metadataItem;
        }
        if ((i & 32) == 0) {
            this.action = null;
        } else {
            this.action = str5;
        }
        this.feedbackId = str6;
        if ((i & 128) == 0) {
            this.alternativeResults = z6x.a;
        } else {
            this.alternativeResults = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchEndpointResponse copy$default(SearchEndpointResponse searchEndpointResponse, String str, String str2, String str3, String str4, MetadataItem metadataItem, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchEndpointResponse.requestId;
        }
        if ((i & 2) != 0) {
            str2 = searchEndpointResponse.intent;
        }
        if ((i & 4) != 0) {
            str3 = searchEndpointResponse.error;
        }
        if ((i & 8) != 0) {
            str4 = searchEndpointResponse.result;
        }
        if ((i & 16) != 0) {
            metadataItem = searchEndpointResponse.feedbackDetails;
        }
        if ((i & 32) != 0) {
            str5 = searchEndpointResponse.action;
        }
        if ((i & 64) != 0) {
            str6 = searchEndpointResponse.feedbackId;
        }
        if ((i & 128) != 0) {
            list = searchEndpointResponse.alternativeResults;
        }
        String str7 = str6;
        List list2 = list;
        MetadataItem metadataItem2 = metadataItem;
        String str8 = str5;
        return searchEndpointResponse.copy(str, str2, str3, str4, metadataItem2, str8, str7, list2);
    }

    public static /* synthetic */ void getAction$annotations() {
    }

    public static /* synthetic */ void getAlternativeResults$annotations() {
    }

    public static /* synthetic */ void getError$annotations() {
    }

    public static /* synthetic */ void getFeedbackDetails$annotations() {
    }

    public static /* synthetic */ void getFeedbackId$annotations() {
    }

    public static /* synthetic */ void getRequestId$annotations() {
    }

    public static /* synthetic */ void getResult$annotations() {
    }

    public static final /* synthetic */ void write$Self$src_main_java_com_spotify_voiceassistants_playermodels_playermodels(SearchEndpointResponse self, z1k output, h661 serialDesc) {
        znb0[] znb0VarArr = $childSerializers;
        output.G(serialDesc, 0, self.requestId);
        output.G(serialDesc, 1, self.intent);
        String str = self.error;
        if (str != null) {
            output.s(serialDesc, 2, chc1.a, str);
        }
        output.G(serialDesc, 3, self.result);
        if (self.feedbackDetails != null) {
            output.s(serialDesc, 4, (nma0) znb0VarArr[4].getValue(), self.feedbackDetails);
        }
        String str2 = self.action;
        if (str2 != null) {
            output.s(serialDesc, 5, chc1.a, str2);
        }
        output.G(serialDesc, 6, self.feedbackId);
        if (!output.d0() && u890.j(self.alternativeResults, z6x.a)) {
            return;
        }
        output.k(serialDesc, 7, (nma0) znb0VarArr[7].getValue(), self.alternativeResults);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIntent() {
        return this.intent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MetadataItem getFeedbackDetails() {
        return this.feedbackDetails;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFeedbackId() {
        return this.feedbackId;
    }

    public final List<MetadataItem> component8() {
        return this.alternativeResults;
    }

    public final SearchEndpointResponse copy(String requestId, String intent, String error, String result, MetadataItem feedbackDetails, String action, String feedbackId, List<? extends MetadataItem> alternativeResults) {
        return new SearchEndpointResponse(requestId, intent, error, result, feedbackDetails, action, feedbackId, alternativeResults);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchEndpointResponse)) {
            return false;
        }
        SearchEndpointResponse searchEndpointResponse = (SearchEndpointResponse) other;
        return u890.j(this.requestId, searchEndpointResponse.requestId) && u890.j(this.intent, searchEndpointResponse.intent) && u890.j(this.error, searchEndpointResponse.error) && u890.j(this.result, searchEndpointResponse.result) && u890.j(this.feedbackDetails, searchEndpointResponse.feedbackDetails) && u890.j(this.action, searchEndpointResponse.action) && u890.j(this.feedbackId, searchEndpointResponse.feedbackId) && u890.j(this.alternativeResults, searchEndpointResponse.alternativeResults);
    }

    public final String getAction() {
        return this.action;
    }

    public final List<MetadataItem> getAlternativeResults() {
        return this.alternativeResults;
    }

    public final String getError() {
        return this.error;
    }

    public final MetadataItem getFeedbackDetails() {
        return this.feedbackDetails;
    }

    public final String getFeedbackId() {
        return this.feedbackId;
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    @Override // com.spotify.voiceassistants.playermodels.SearchResponse
    public List<MetadataItem> getResponseAlternativeResults() {
        return this.alternativeResults;
    }

    @Override // com.spotify.voiceassistants.playermodels.SearchResponse
    public MetadataItem getResponseFeedbackDetails() {
        return this.feedbackDetails;
    }

    public final String getResult() {
        return this.result;
    }

    @Override // com.spotify.voiceassistants.playermodels.SearchResponse
    public String getSearchRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int iD = cy30.d(this.requestId.hashCode() * 31, 31, this.intent);
        String str = this.error;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.result);
        MetadataItem metadataItem = this.feedbackDetails;
        int iHashCode = (iD2 + (metadataItem == null ? 0 : metadataItem.hashCode())) * 31;
        String str2 = this.action;
        return this.alternativeResults.hashCode() + cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.feedbackId);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchEndpointResponse(String str, String str2, String str3, String str4, MetadataItem metadataItem, String str5, String str6, List<? extends MetadataItem> list) {
        this.requestId = str;
        this.intent = str2;
        this.error = str3;
        this.result = str4;
        this.feedbackDetails = metadataItem;
        this.action = str5;
        this.feedbackId = str6;
        this.alternativeResults = list;
    }

    public /* synthetic */ SearchEndpointResponse(String str, String str2, String str3, String str4, MetadataItem metadataItem, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : metadataItem, (i & 32) != 0 ? null : str5, str6, (i & 128) != 0 ? z6x.a : list);
    }
}
