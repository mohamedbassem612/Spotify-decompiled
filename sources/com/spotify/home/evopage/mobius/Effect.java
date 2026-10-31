package com.spotify.home.evopage.mobius;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cy30;
import p.ice0;
import p.u890;
import p.x4e0;
import p.yz21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/spotify/home/evopage/mobius/Effect;", "", "LoadHomeStructure", "LoadMoreHomeStructure", "UpdateOnDemandSet", "TryAddingBrandAdPreview", "OfflineFallbackResponse", "CheckForceReload", "RefreshPromptCta", "Lcom/spotify/home/evopage/mobius/Effect$CheckForceReload;", "Lcom/spotify/home/evopage/mobius/Effect$LoadHomeStructure;", "Lcom/spotify/home/evopage/mobius/Effect$LoadMoreHomeStructure;", "Lcom/spotify/home/evopage/mobius/Effect$OfflineFallbackResponse;", "Lcom/spotify/home/evopage/mobius/Effect$RefreshPromptCta;", "Lcom/spotify/home/evopage/mobius/Effect$TryAddingBrandAdPreview;", "Lcom/spotify/home/evopage/mobius/Effect$UpdateOnDemandSet;", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface Effect {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/spotify/home/evopage/mobius/Effect$CheckForceReload;", "Lcom/spotify/home/evopage/mobius/Effect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class CheckForceReload implements Effect {
        public static final CheckForceReload INSTANCE = new CheckForceReload();

        private CheckForceReload() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CheckForceReload);
        }

        public int hashCode() {
            return -1522392767;
        }

        public String toString() {
            return "CheckForceReload";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/spotify/home/evopage/mobius/Effect$LoadMoreHomeStructure;", "Lcom/spotify/home/evopage/mobius/Effect;", "pageToken", "", "<init>", "(Ljava/lang/String;)V", "getPageToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class LoadMoreHomeStructure implements Effect {
        private final String pageToken;

        public LoadMoreHomeStructure(String str) {
            this.pageToken = str;
        }

        public static /* synthetic */ LoadMoreHomeStructure copy$default(LoadMoreHomeStructure loadMoreHomeStructure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadMoreHomeStructure.pageToken;
            }
            return loadMoreHomeStructure.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPageToken() {
            return this.pageToken;
        }

        public final LoadMoreHomeStructure copy(String pageToken) {
            return new LoadMoreHomeStructure(pageToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadMoreHomeStructure) && u890.j(this.pageToken, ((LoadMoreHomeStructure) other).pageToken);
        }

        public final String getPageToken() {
            return this.pageToken;
        }

        public int hashCode() {
            return this.pageToken.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/spotify/home/evopage/mobius/Effect$OfflineFallbackResponse;", "Lcom/spotify/home/evopage/mobius/Effect;", "filterValue", "", "<init>", "(Ljava/lang/String;)V", "getFilterValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class OfflineFallbackResponse implements Effect {
        private final String filterValue;

        public OfflineFallbackResponse(String str) {
            this.filterValue = str;
        }

        public static /* synthetic */ OfflineFallbackResponse copy$default(OfflineFallbackResponse offlineFallbackResponse, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = offlineFallbackResponse.filterValue;
            }
            return offlineFallbackResponse.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFilterValue() {
            return this.filterValue;
        }

        public final OfflineFallbackResponse copy(String filterValue) {
            return new OfflineFallbackResponse(filterValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OfflineFallbackResponse) && u890.j(this.filterValue, ((OfflineFallbackResponse) other).filterValue);
        }

        public final String getFilterValue() {
            return this.filterValue;
        }

        public int hashCode() {
            return this.filterValue.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/spotify/home/evopage/mobius/Effect$TryAddingBrandAdPreview;", "Lcom/spotify/home/evopage/mobius/Effect;", "", "firstAnchorFeatureIndex", "Lp/yz21;", "responseInstrumentationData", "<init>", "(ILp/yz21;)V", "component1", "()I", "component2", "()Lp/yz21;", "copy", "(ILp/yz21;)Lcom/spotify/home/evopage/mobius/Effect$TryAddingBrandAdPreview;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getFirstAnchorFeatureIndex", "Lp/yz21;", "getResponseInstrumentationData", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class TryAddingBrandAdPreview implements Effect {
        private final int firstAnchorFeatureIndex;
        private final yz21 responseInstrumentationData;

        public TryAddingBrandAdPreview(int i, yz21 yz21Var) {
            this.firstAnchorFeatureIndex = i;
            this.responseInstrumentationData = yz21Var;
        }

        public static /* synthetic */ TryAddingBrandAdPreview copy$default(TryAddingBrandAdPreview tryAddingBrandAdPreview, int i, yz21 yz21Var, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tryAddingBrandAdPreview.firstAnchorFeatureIndex;
            }
            if ((i2 & 2) != 0) {
                yz21Var = tryAddingBrandAdPreview.responseInstrumentationData;
            }
            return tryAddingBrandAdPreview.copy(i, yz21Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getFirstAnchorFeatureIndex() {
            return this.firstAnchorFeatureIndex;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final yz21 getResponseInstrumentationData() {
            return this.responseInstrumentationData;
        }

        public final TryAddingBrandAdPreview copy(int firstAnchorFeatureIndex, yz21 responseInstrumentationData) {
            return new TryAddingBrandAdPreview(firstAnchorFeatureIndex, responseInstrumentationData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TryAddingBrandAdPreview)) {
                return false;
            }
            TryAddingBrandAdPreview tryAddingBrandAdPreview = (TryAddingBrandAdPreview) other;
            return this.firstAnchorFeatureIndex == tryAddingBrandAdPreview.firstAnchorFeatureIndex && u890.j(this.responseInstrumentationData, tryAddingBrandAdPreview.responseInstrumentationData);
        }

        public final int getFirstAnchorFeatureIndex() {
            return this.firstAnchorFeatureIndex;
        }

        public final yz21 getResponseInstrumentationData() {
            return this.responseInstrumentationData;
        }

        public int hashCode() {
            return this.responseInstrumentationData.hashCode() + (Integer.hashCode(this.firstAnchorFeatureIndex) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lcom/spotify/home/evopage/mobius/Effect$UpdateOnDemandSet;", "Lcom/spotify/home/evopage/mobius/Effect;", "Lp/x4e0;", "loadSource", "", "filterValue", "", "onDemandSet", "<init>", "(Lp/x4e0;Ljava/lang/String;Ljava/util/Set;)V", "component1", "()Lp/x4e0;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Set;", "copy", "(Lp/x4e0;Ljava/lang/String;Ljava/util/Set;)Lcom/spotify/home/evopage/mobius/Effect$UpdateOnDemandSet;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/x4e0;", "getLoadSource", "Ljava/lang/String;", "getFilterValue", "Ljava/util/Set;", "getOnDemandSet", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class UpdateOnDemandSet implements Effect {
        private final String filterValue;
        private final x4e0 loadSource;
        private final Set<String> onDemandSet;

        public UpdateOnDemandSet(x4e0 x4e0Var, String str, Set<String> set) {
            this.loadSource = x4e0Var;
            this.filterValue = str;
            this.onDemandSet = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdateOnDemandSet copy$default(UpdateOnDemandSet updateOnDemandSet, x4e0 x4e0Var, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                x4e0Var = updateOnDemandSet.loadSource;
            }
            if ((i & 2) != 0) {
                str = updateOnDemandSet.filterValue;
            }
            if ((i & 4) != 0) {
                set = updateOnDemandSet.onDemandSet;
            }
            return updateOnDemandSet.copy(x4e0Var, str, set);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final x4e0 getLoadSource() {
            return this.loadSource;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFilterValue() {
            return this.filterValue;
        }

        public final Set<String> component3() {
            return this.onDemandSet;
        }

        public final UpdateOnDemandSet copy(x4e0 loadSource, String filterValue, Set<String> onDemandSet) {
            return new UpdateOnDemandSet(loadSource, filterValue, onDemandSet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateOnDemandSet)) {
                return false;
            }
            UpdateOnDemandSet updateOnDemandSet = (UpdateOnDemandSet) other;
            return this.loadSource == updateOnDemandSet.loadSource && u890.j(this.filterValue, updateOnDemandSet.filterValue) && u890.j(this.onDemandSet, updateOnDemandSet.onDemandSet);
        }

        public final String getFilterValue() {
            return this.filterValue;
        }

        public final x4e0 getLoadSource() {
            return this.loadSource;
        }

        public final Set<String> getOnDemandSet() {
            return this.onDemandSet;
        }

        public int hashCode() {
            int iD = cy30.d(this.loadSource.hashCode() * 31, 31, this.filterValue);
            Set<String> set = this.onDemandSet;
            return iD + (set == null ? 0 : set.hashCode());
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/spotify/home/evopage/mobius/Effect$LoadHomeStructure;", "Lcom/spotify/home/evopage/mobius/Effect;", "Lp/ice0;", "loadingStrategy", "", "refreshToken", "sessionId", "<init>", "(Lp/ice0;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lp/ice0;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lp/ice0;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/home/evopage/mobius/Effect$LoadHomeStructure;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp/ice0;", "getLoadingStrategy", "Ljava/lang/String;", "getRefreshToken", "getSessionId", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* data */ class LoadHomeStructure implements Effect {
        private final ice0 loadingStrategy;
        private final String refreshToken;
        private final String sessionId;

        public /* synthetic */ LoadHomeStructure(ice0 ice0Var, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(ice0Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }

        public static /* synthetic */ LoadHomeStructure copy$default(LoadHomeStructure loadHomeStructure, ice0 ice0Var, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                ice0Var = loadHomeStructure.loadingStrategy;
            }
            if ((i & 2) != 0) {
                str = loadHomeStructure.refreshToken;
            }
            if ((i & 4) != 0) {
                str2 = loadHomeStructure.sessionId;
            }
            return loadHomeStructure.copy(ice0Var, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ice0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRefreshToken() {
            return this.refreshToken;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final LoadHomeStructure copy(ice0 loadingStrategy, String refreshToken, String sessionId) {
            return new LoadHomeStructure(loadingStrategy, refreshToken, sessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadHomeStructure)) {
                return false;
            }
            LoadHomeStructure loadHomeStructure = (LoadHomeStructure) other;
            return this.loadingStrategy == loadHomeStructure.loadingStrategy && u890.j(this.refreshToken, loadHomeStructure.refreshToken) && u890.j(this.sessionId, loadHomeStructure.sessionId);
        }

        public final ice0 getLoadingStrategy() {
            return this.loadingStrategy;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            int iHashCode = this.loadingStrategy.hashCode() * 31;
            String str = this.refreshToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.sessionId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return super.toString();
        }

        public LoadHomeStructure(ice0 ice0Var, String str, String str2) {
            this.loadingStrategy = ice0Var;
            this.refreshToken = str;
            this.sessionId = str2;
        }
    }
}
