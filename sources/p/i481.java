package p;

import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy$Builder;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import com.spotify.show_esperanto.proto.HeaderPolicy;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i481 {
    public static HeaderPolicy a(x381 x381Var) {
        t160 t160VarN = HeaderPolicy.n();
        ShowDecorationPolicy.Builder builderNewBuilder = ShowDecorationPolicy.newBuilder();
        Map map = x381Var.a;
        if (map != null) {
            builderNewBuilder.getClass();
            Object obj = map.get("link");
            if (obj != null && (obj instanceof Boolean)) {
                builderNewBuilder.setLink(((Boolean) obj).booleanValue());
            }
            Object obj2 = map.get("name");
            if (obj2 != null && (obj2 instanceof Boolean)) {
                builderNewBuilder.setName(((Boolean) obj2).booleanValue());
            }
            Object obj3 = map.get("description");
            if (obj3 != null && (obj3 instanceof Boolean)) {
                builderNewBuilder.setDescription(((Boolean) obj3).booleanValue());
            }
            Object obj4 = map.get("popularity");
            if (obj4 != null && (obj4 instanceof Boolean)) {
                builderNewBuilder.setPopularity(((Boolean) obj4).booleanValue());
            }
            Object obj5 = map.get("publisher");
            if (obj5 != null && (obj5 instanceof Boolean)) {
                builderNewBuilder.setPublisher(((Boolean) obj5).booleanValue());
            }
            Object obj6 = map.get("language");
            if (obj6 != null && (obj6 instanceof Boolean)) {
                builderNewBuilder.setLanguage(((Boolean) obj6).booleanValue());
            }
            Object obj7 = map.get("isExplicit");
            if (obj7 != null && (obj7 instanceof Boolean)) {
                builderNewBuilder.setIsExplicit(((Boolean) obj7).booleanValue());
            }
            Object obj8 = map.get("covers");
            if (obj8 != null && (obj8 instanceof Boolean)) {
                builderNewBuilder.setCovers(((Boolean) obj8).booleanValue());
            }
            Object obj9 = map.get("numEpisodes");
            if (obj9 != null && (obj9 instanceof Boolean)) {
                builderNewBuilder.setNumEpisodes(((Boolean) obj9).booleanValue());
            }
            Object obj10 = map.get("consumptionOrder");
            if (obj10 != null && (obj10 instanceof Boolean)) {
                builderNewBuilder.setConsumptionOrder(((Boolean) obj10).booleanValue());
            }
            Object obj11 = map.get("mediaTypeEnum");
            if (obj11 != null && (obj11 instanceof Boolean)) {
                builderNewBuilder.setMediaTypeEnum(((Boolean) obj11).booleanValue());
            }
            Object obj12 = map.get("copyrights");
            if (obj12 != null && (obj12 instanceof Boolean)) {
                builderNewBuilder.setCopyrights(((Boolean) obj12).booleanValue());
            }
            Object obj13 = map.get("trailerUri");
            if (obj13 != null && (obj13 instanceof Boolean)) {
                builderNewBuilder.setTrailerUri(((Boolean) obj13).booleanValue());
            }
            Object obj14 = map.get("isMusicAndTalk");
            if (obj14 != null && (obj14 instanceof Boolean)) {
                builderNewBuilder.setIsMusicAndTalk(((Boolean) obj14).booleanValue());
            }
            Object obj15 = map.get("isBook");
            if (obj15 != null && (obj15 instanceof Boolean)) {
                builderNewBuilder.setIsBook(((Boolean) obj15).booleanValue());
            }
            Object obj16 = map.get("formatListAttributes");
            if (obj16 != null && (obj16 instanceof Boolean)) {
                builderNewBuilder.setFormatListAttributes(((Boolean) obj16).booleanValue());
            }
        }
        List list = x381Var.b;
        if (list != null) {
            builderNewBuilder.addAllExtensionValue(list);
        }
        t160VarN.u((ShowDecorationPolicy) builderNewBuilder.build());
        ShowCollectionDecorationPolicy$Builder showCollectionDecorationPolicy$BuilderNewBuilder = ShowCollectionDecorationPolicy.newBuilder();
        if (map != null) {
            showCollectionDecorationPolicy$BuilderNewBuilder.getClass();
            Object obj17 = map.get("inCollection");
            if (obj17 != null && (obj17 instanceof Boolean)) {
                showCollectionDecorationPolicy$BuilderNewBuilder.setIsInCollection(((Boolean) obj17).booleanValue());
            }
        }
        t160VarN.n((ShowCollectionDecorationPolicy) showCollectionDecorationPolicy$BuilderNewBuilder.build());
        ShowPlayedStateDecorationPolicy.Builder builderNewBuilder2 = ShowPlayedStateDecorationPolicy.newBuilder();
        if (map != null) {
            builderNewBuilder2.getClass();
            Object obj18 = map.get("playedTime");
            if (obj18 != null && (obj18 instanceof Boolean)) {
                builderNewBuilder2.setPlayedTime(((Boolean) obj18).booleanValue());
            }
            Object obj19 = map.get("latestPlayedEpisodeLink");
            if (obj19 != null && (obj19 instanceof Boolean)) {
                builderNewBuilder2.setLatestPlayedEpisodeLink(((Boolean) obj19).booleanValue());
            }
            Object obj20 = map.get("playabilityRestriction");
            if (obj20 != null && (obj20 instanceof Boolean)) {
                builderNewBuilder2.setPlayabilityRestriction(((Boolean) obj20).booleanValue());
            }
            Object obj21 = map.get("isPlayable");
            if (obj21 != null && (obj21 instanceof Boolean)) {
                builderNewBuilder2.setIsPlayable(((Boolean) obj21).booleanValue());
            }
            Object obj22 = map.get("label");
            if (obj22 != null && (obj22 instanceof Boolean)) {
                builderNewBuilder2.setLabel(((Boolean) obj22).booleanValue());
            }
            Object obj23 = map.get("resumeEpisodeLink");
            if (obj23 != null && (obj23 instanceof Boolean)) {
                builderNewBuilder2.setResumeEpisodeLink(((Boolean) obj23).booleanValue());
            }
        }
        t160VarN.s((ShowPlayedStateDecorationPolicy) builderNewBuilder2.build());
        ShowOfflineStateDecorationPolicy.Builder builderNewBuilder3 = ShowOfflineStateDecorationPolicy.newBuilder();
        Object obj24 = map != null ? map.get("showOfflineState") : null;
        Map map2 = obj24 instanceof Map ? (Map) obj24 : null;
        if (map2 != null) {
            builderNewBuilder3.getClass();
            Object obj25 = map2.get("offline");
            if (obj25 != null && (obj25 instanceof Boolean)) {
                builderNewBuilder3.setOffline(((Boolean) obj25).booleanValue());
            }
            Object obj26 = map2.get("syncProgress");
            if (obj26 != null && (obj26 instanceof Boolean)) {
                builderNewBuilder3.setSyncProgress(((Boolean) obj26).booleanValue());
            }
        }
        t160VarN.q((ShowOfflineStateDecorationPolicy) builderNewBuilder3.build());
        return (HeaderPolicy) t160VarN.build();
    }
}
