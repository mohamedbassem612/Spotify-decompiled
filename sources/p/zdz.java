package p;

import com.google.protobuf.h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import com.spotify.show_esperanto.proto.GetUnfinishedEpisodesRequest;
import com.spotify.show_esperanto.proto.HeaderPolicy;
import com.spotify.show_esperanto.proto.ListPolicy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zdz {
    public final eys a;
    public final jih1 b;
    public final iih1 c;
    public final jma d;
    public final rpv0 e;
    public final o241 f;
    public final o6v0 g;
    public final zr00 h;
    public final yh2 i;
    public final vg4 j;

    public zdz(eys eysVar, jih1 jih1Var, iih1 iih1Var, jma jmaVar, rpv0 rpv0Var, o241 o241Var, String str, o6v0 o6v0Var, zr00 zr00Var, yh2 yh2Var, vg4 vg4Var) {
        this.a = eysVar;
        this.b = jih1Var;
        this.c = iih1Var;
        this.d = jmaVar;
        this.e = rpv0Var;
        this.f = o241Var;
        this.g = o6v0Var;
        this.h = zr00Var;
        this.i = yh2Var;
        this.j = vg4Var;
    }

    public final Observable a(int i) {
        Observable observableJust;
        EpisodeDecorationPolicy episodeDecorationPolicyBuild;
        nqz0 nqz0Var = new nqz0(i);
        iih1 iih1Var = this.c;
        iih1 iih1Var2 = new iih1(iih1Var.a, iih1Var.b, iih1Var.c, nqz0Var, iih1Var.e, iih1Var.f, iih1Var.g, iih1Var.h, iih1Var.i, iih1Var.j);
        if (this.j.a()) {
            mhh1 mhh1Var = eys.d;
            eys eysVar = this.a;
            if (eysVar.c.a()) {
                shh1 shh1Var = eysVar.b;
                ga81 ga81Var = shh1Var.a;
                nqz0 nqz0Var2 = mhh1Var.b;
                zq40 zq40VarN = GetUnfinishedEpisodesRequest.n();
                zar zarVar = mhh1Var.a.a;
                e3z e3zVar = zarVar != null ? zarVar.a : null;
                List list = e3zVar != null ? e3zVar.b : null;
                if (e3zVar != null) {
                    EpisodeDecorationPolicy.Builder isBookChapter = EpisodeDecorationPolicy.newBuilder().setLink(shh1.c(e3zVar, "link")).setName(shh1.c(e3zVar, "name")).setManifestId(shh1.c(e3zVar, "manifestId")).setLength(shh1.c(e3zVar, "length")).setPreviewId(shh1.c(e3zVar, "previewId")).setPreviewManifestId(shh1.c(e3zVar, "previewManifestId")).setDescription(shh1.c(e3zVar, "description")).setPublishDate(shh1.c(e3zVar, "publishDate")).setCovers(shh1.c(e3zVar, "covers")).setFreezeFrames(shh1.c(e3zVar, "freezeFrames")).setLanguage(shh1.c(e3zVar, "language")).setAvailable(shh1.c(e3zVar, "available")).setMediaTypeEnum(shh1.c(e3zVar, "mediaTypeEnum")).setBackgroundable(shh1.c(e3zVar, "backgroundable")).setIsExplicit(shh1.c(e3zVar, "isExplicit")).setType(shh1.c(e3zVar, "type")).setIsMusicAndTalk(shh1.c(e3zVar, "isMusicAndTalk")).setIs19PlusOnly(shh1.c(e3zVar, "is19PlusOnly")).setIsBookChapter(shh1.c(e3zVar, "isBookChapter"));
                    if (list != null) {
                        isBookChapter.addAllExtensionValue(list);
                    }
                    h hVarBuild = isBookChapter.build();
                    hVarBuild.getClass();
                    episodeDecorationPolicyBuild = (EpisodeDecorationPolicy) hVarBuild;
                } else {
                    episodeDecorationPolicyBuild = EpisodeDecorationPolicy.newBuilder().build();
                }
                EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicyBuild = zarVar != null ? (EpisodeCollectionDecorationPolicy) EpisodeCollectionDecorationPolicy.newBuilder().setIsFollowingShow(shh1.c(e3zVar, "isFollowingShow")).setIsInListenLater(shh1.c(e3zVar, "isInListenLater")).setIsNew(shh1.c(e3zVar, "isNew")).build() : EpisodeCollectionDecorationPolicy.newBuilder().build();
                EpisodeSyncDecorationPolicy episodeSyncDecorationPolicyBuild = zarVar != null ? (EpisodeSyncDecorationPolicy) EpisodeSyncDecorationPolicy.newBuilder().setOffline(shh1.c(e3zVar, "offline")).setSyncProgress(shh1.c(e3zVar, "syncProgress")).build() : EpisodeSyncDecorationPolicy.newBuilder().build();
                EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicyBuild = zarVar != null ? (EpisodePlayedStateDecorationPolicy) EpisodePlayedStateDecorationPolicy.newBuilder().setTimeLeft(shh1.c(e3zVar, "timeLeft")).setIsPlayed(shh1.c(e3zVar, "isPlayed")).setPlayable(shh1.c(e3zVar, "playable")).setPlayabilityRestriction(shh1.c(e3zVar, "playabilityRestriction")).setLastPlayedAt(shh1.c(e3zVar, "lastPlayedAt")).build() : EpisodePlayedStateDecorationPolicy.newBuilder().build();
                ShowDecorationPolicy showDecorationPolicyBuild = ShowDecorationPolicy.newBuilder().setLink(shh1.d(e3zVar, "link")).setName(shh1.d(e3zVar, "name")).setDescription(shh1.d(e3zVar, "description")).setPopularity(shh1.d(e3zVar, "popularity")).setPublisher(shh1.d(e3zVar, "publisher")).setLanguage(shh1.d(e3zVar, "language")).setIsExplicit(shh1.d(e3zVar, "isExplicit")).setCovers(shh1.d(e3zVar, "covers")).setNumEpisodes(shh1.d(e3zVar, "numEpisodes")).setConsumptionOrder(shh1.d(e3zVar, "consumptionOrder")).setMediaTypeEnum(shh1.d(e3zVar, "mediaTypeEnum")).setCopyrights(shh1.d(e3zVar, "copyrights")).setTrailerUri(shh1.d(e3zVar, "trailerUri")).setIsMusicAndTalk(shh1.d(e3zVar, "isMusicAndTalk")).build();
                ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicyBuild = ShowPlayedStateDecorationPolicy.newBuilder().build();
                ShowCollectionDecorationPolicy showCollectionDecorationPolicyBuild = ShowCollectionDecorationPolicy.newBuilder().setIsInCollection(shh1.d(e3zVar, "isInCollection")).build();
                ShowOfflineStateDecorationPolicy showOfflineStateDecorationPolicyBuild = ShowOfflineStateDecorationPolicy.newBuilder().build();
                t160 t160VarN = HeaderPolicy.n();
                t160VarN.u(showDecorationPolicyBuild);
                t160VarN.s(showPlayedStateDecorationPolicyBuild);
                t160VarN.n(showCollectionDecorationPolicyBuild);
                t160VarN.q(showOfflineStateDecorationPolicyBuild);
                HeaderPolicy headerPolicy = (HeaderPolicy) t160VarN.build();
                u0d0 u0d0VarN = ListPolicy.n();
                u0d0VarN.r(episodeDecorationPolicyBuild);
                u0d0VarN.n(episodeCollectionDecorationPolicyBuild);
                u0d0VarN.s(episodeSyncDecorationPolicyBuild);
                u0d0VarN.q(episodePlayedStateDecorationPolicyBuild);
                u0d0VarN.t(headerPolicy);
                zq40VarN.r(u0d0VarN.build());
                zq40VarN.t(0);
                zq40VarN.s(nqz0Var2.a);
                zq40VarN.v("lastPlayedAt DESC");
                ArrayList arrayListS = gm50.s(mhh1Var);
                zq40VarN.q(!arrayListS.isEmpty() ? o7h.y0(arrayListS, ",", (String) null, (String) null, (iu30) null, 62) : "");
                zq40VarN.w();
                zq40VarN.n(120);
                zq40VarN.u(0.1d);
                observableJust = ga81Var.callStream("spotify.show_esperanto.proto.ShowService", "SubUnfinishedEpisodes", zq40VarN.build()).map(gex0.Y).map(new zb91(shh1Var, (byte) 21));
            } else {
                phh1 phh1Var = eysVar.a;
                uav0 uav0Var = mhh1Var.a;
                nhh1 nhh1Var = phh1Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("updateThrottling", String.valueOf(500));
                linkedHashMap.put("responseFormat", "protobuf");
                linkedHashMap.put("sort", tia1.b(e8n.a));
                ArrayList arrayListS2 = gm50.s(mhh1Var);
                if (!arrayListS2.isEmpty()) {
                    linkedHashMap.put("filter", o7h.y0(arrayListS2, ",", (String) null, (String) null, (iu30) null, 62));
                }
                linkedHashMap.put("relTimeLeftTolerance", String.valueOf(0.1d));
                linkedHashMap.put("absTimeLeftTolerance", String.valueOf(120));
                int i2 = mhh1Var.b.a;
                linkedHashMap.put("start", String.valueOf(0));
                linkedHashMap.put("length", String.valueOf(i2));
                observableJust = phh1Var.b.a(nhh1Var.a(linkedHashMap, uav0Var).toObservable(), ohh1.a, new hcf1(1, phh1Var.c, vo30.class, "create", "create(Lcom/spotify/mobile/android/spotlets/show/proto/ShowUnfinishedEpisodesRequest$Response;)Lcom/spotify/podcast/models/model/Items;", 0, (byte) 12)).firstOrError().toObservable();
                observableJust.getClass();
            }
        } else {
            observableJust = Observable.just(sjo0.a);
            observableJust.getClass();
        }
        Observable observableOnErrorReturn = observableJust.map(pzs0.c1).onErrorReturn(qzs0.d1);
        lih1 lih1Var = this.b.a;
        return Observable.combineLatest(Observable.combineLatest(observableOnErrorReturn, lih1Var.a.callStream("spotify.collection_esperanto.proto.CollectionService", "StreamUnplayedEpisodes", lih1.b(iih1Var2)).map(uwg.T0).map(new xq81(lih1Var, (byte) 24)).map(new qmr(this, (byte) 27)).map(new rmr(this, (byte) 27)).map(stf0.g1).onErrorReturn(olj0.c1), new ubc(this, (byte) 9)).flatMap(mm10.i1).distinctUntilChanged(ns80.f1), this.f.a, new ObservableFromPublisher(this.g.a()), yoi1.i(this.h.a, o6x.a), this.i.a(), bya0.b1).distinctUntilChanged().share();
    }
}
