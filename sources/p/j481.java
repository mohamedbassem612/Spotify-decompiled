package p;

import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy$Builder;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.show_esperanto.proto.HeaderPolicy;
import com.spotify.show_esperanto.proto.ListPolicy;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j481 {
    public static ListPolicy a(e3z e3zVar) {
        Map map = e3zVar.c;
        u0d0 u0d0VarN = ListPolicy.n();
        aqa0 aqa0Var = e3zVar.a;
        if (aqa0Var != null) {
            Map map2 = aqa0Var.a;
            t160 t160VarN = HeaderPolicy.n();
            ShowDecorationPolicy.Builder builderNewBuilder = ShowDecorationPolicy.newBuilder();
            builderNewBuilder.getClass();
            Object obj = map2.get("link");
            if (obj != null && (obj instanceof Boolean)) {
                builderNewBuilder.setLink(((Boolean) obj).booleanValue());
            }
            Object obj2 = map2.get("name");
            if (obj2 != null && (obj2 instanceof Boolean)) {
                builderNewBuilder.setName(((Boolean) obj2).booleanValue());
            }
            Object obj3 = map2.get("trailerUri");
            if (obj3 != null && (obj3 instanceof Boolean)) {
                builderNewBuilder.setTrailerUri(((Boolean) obj3).booleanValue());
            }
            Object obj4 = map2.get("publisher");
            if (obj4 != null && (obj4 instanceof Boolean)) {
                builderNewBuilder.setPublisher(((Boolean) obj4).booleanValue());
            }
            Object obj5 = map2.get("covers");
            if (obj5 != null && (obj5 instanceof Boolean)) {
                builderNewBuilder.setCovers(((Boolean) obj5).booleanValue());
            }
            t160VarN.u((ShowDecorationPolicy) builderNewBuilder.build());
            ShowCollectionDecorationPolicy$Builder showCollectionDecorationPolicy$BuilderNewBuilder = ShowCollectionDecorationPolicy.newBuilder();
            showCollectionDecorationPolicy$BuilderNewBuilder.getClass();
            Object obj6 = map2.get("inCollection");
            if (obj6 != null && (obj6 instanceof Boolean)) {
                showCollectionDecorationPolicy$BuilderNewBuilder.setIsInCollection(((Boolean) obj6).booleanValue());
            }
            t160VarN.n((ShowCollectionDecorationPolicy) showCollectionDecorationPolicy$BuilderNewBuilder.build());
            u0d0VarN.t((HeaderPolicy) t160VarN.build());
        }
        EpisodeDecorationPolicy.Builder builderNewBuilder2 = EpisodeDecorationPolicy.newBuilder();
        if (map != null) {
            builderNewBuilder2.getClass();
            Object obj7 = map.get("link");
            if (obj7 != null && (obj7 instanceof Boolean)) {
                builderNewBuilder2.setLink(((Boolean) obj7).booleanValue());
            }
            Object obj8 = map.get("name");
            if (obj8 != null && (obj8 instanceof Boolean)) {
                builderNewBuilder2.setName(((Boolean) obj8).booleanValue());
            }
            Object obj9 = map.get("length");
            if (obj9 != null && (obj9 instanceof Boolean)) {
                builderNewBuilder2.setLength(((Boolean) obj9).booleanValue());
            }
            Object obj10 = map.get("publishDate");
            if (obj10 != null && (obj10 instanceof Boolean)) {
                builderNewBuilder2.setPublishDate(((Boolean) obj10).booleanValue());
            }
            Object obj11 = map.get("available");
            if (obj11 != null && (obj11 instanceof Boolean)) {
                builderNewBuilder2.setAvailable(((Boolean) obj11).booleanValue());
            }
            Object obj12 = map.get("covers");
            if (obj12 != null && (obj12 instanceof Boolean)) {
                builderNewBuilder2.setCovers(((Boolean) obj12).booleanValue());
            }
            Object obj13 = map.get("freezeFrames");
            if (obj13 != null && (obj13 instanceof Boolean)) {
                builderNewBuilder2.setFreezeFrames(((Boolean) obj13).booleanValue());
            }
            Object obj14 = map.get("manifestId");
            if (obj14 != null && (obj14 instanceof Boolean)) {
                builderNewBuilder2.setManifestId(((Boolean) obj14).booleanValue());
            }
            Object obj15 = map.get("mediaTypeEnum");
            if (obj15 != null && (obj15 instanceof Boolean)) {
                builderNewBuilder2.setMediaTypeEnum(((Boolean) obj15).booleanValue());
            }
            Object obj16 = map.get("isExplicit");
            if (obj16 != null && (obj16 instanceof Boolean)) {
                builderNewBuilder2.setIsExplicit(((Boolean) obj16).booleanValue());
            }
            Object obj17 = map.get("is19PlusOnly");
            if (obj17 != null && (obj17 instanceof Boolean)) {
                builderNewBuilder2.setIs19PlusOnly(((Boolean) obj17).booleanValue());
            }
            Object obj18 = map.get("backgroundable");
            if (obj18 != null && (obj18 instanceof Boolean)) {
                builderNewBuilder2.setBackgroundable(((Boolean) obj18).booleanValue());
            }
            Object obj19 = map.get("description");
            if (obj19 != null && (obj19 instanceof Boolean)) {
                builderNewBuilder2.setDescription(((Boolean) obj19).booleanValue());
            }
            Object obj20 = map.get("type");
            if (obj20 != null && (obj20 instanceof Boolean)) {
                builderNewBuilder2.setType(((Boolean) obj20).booleanValue());
            }
            Object obj21 = map.get("isMusicAndTalk");
            if (obj21 != null && (obj21 instanceof Boolean)) {
                builderNewBuilder2.setIsMusicAndTalk(((Boolean) obj21).booleanValue());
            }
            Object obj22 = map.get("isBookChapter");
            if (obj22 != null && (obj22 instanceof Boolean)) {
                builderNewBuilder2.setIsBookChapter(((Boolean) obj22).booleanValue());
            }
            Object obj23 = map.get("isCurated");
            if (obj23 != null && (obj23 instanceof Boolean)) {
                builderNewBuilder2.setIsCurated(((Boolean) obj23).booleanValue());
            }
        }
        List list = e3zVar.b;
        if (list != null) {
            builderNewBuilder2.addAllExtensionValue(list);
        }
        u0d0VarN.r(builderNewBuilder2.build());
        if (map != null) {
            EpisodeSyncDecorationPolicy.Builder builderNewBuilder3 = EpisodeSyncDecorationPolicy.newBuilder();
            builderNewBuilder3.getClass();
            Object obj24 = map.get("offline");
            if (obj24 != null && (obj24 instanceof Boolean)) {
                builderNewBuilder3.setOffline(((Boolean) obj24).booleanValue());
            }
            Object obj25 = map.get("syncProgress");
            if (obj25 != null && (obj25 instanceof Boolean)) {
                builderNewBuilder3.setSyncProgress(((Boolean) obj25).booleanValue());
            }
            u0d0VarN.s(builderNewBuilder3.build());
            EpisodeCollectionDecorationPolicy.Builder builderNewBuilder4 = EpisodeCollectionDecorationPolicy.newBuilder();
            builderNewBuilder4.getClass();
            Object obj26 = map.get("isNew");
            if (obj26 != null && (obj26 instanceof Boolean)) {
                builderNewBuilder4.setIsNew(((Boolean) obj26).booleanValue());
            }
            Object obj27 = map.get("isInListenLater");
            if (obj27 != null && (obj27 instanceof Boolean)) {
                builderNewBuilder4.setIsInListenLater(((Boolean) obj27).booleanValue());
            }
            u0d0VarN.n(builderNewBuilder4.build());
            EpisodePlayedStateDecorationPolicy.Builder builderNewBuilder5 = EpisodePlayedStateDecorationPolicy.newBuilder();
            builderNewBuilder5.getClass();
            Object obj28 = map.get("isPlayed");
            if (obj28 != null && (obj28 instanceof Boolean)) {
                builderNewBuilder5.setIsPlayed(((Boolean) obj28).booleanValue());
            }
            Object obj29 = map.get("timeLeft");
            if (obj29 != null && (obj29 instanceof Boolean)) {
                builderNewBuilder5.setTimeLeft(((Boolean) obj29).booleanValue());
            }
            Object obj30 = map.get("playable");
            if (obj30 != null && (obj30 instanceof Boolean)) {
                builderNewBuilder5.setPlayable(((Boolean) obj30).booleanValue());
            }
            Object obj31 = map.get("playabilityRestriction");
            if (obj31 != null && (obj31 instanceof Boolean)) {
                builderNewBuilder5.setPlayabilityRestriction(((Boolean) obj31).booleanValue());
            }
            u0d0VarN.q(builderNewBuilder5.build());
        }
        return u0d0VarN.build();
    }
}
