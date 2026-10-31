package p;

import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.proto.EpisodeCollectionState;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeSyncState;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.cosmos.util.proto.ShowCollectionState;
import com.spotify.cosmos.util.proto.ShowMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import spotify.collection.esperanto.proto.CollectionEpisode;
import spotify.collection.esperanto.proto.CollectionEpisodeDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesRequest;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;
import spotify.collection.esperanto.proto.CollectionShow;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;
import spotify.collection.esperanto.proto.UnplayedEpisodeItem;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lih1 {
    public final r5h a;
    public final lv00 b;

    public lih1(r5h r5hVar, lv00 lv00Var) {
        this.a = r5hVar;
        this.b = lv00Var;
    }

    public static cen a(ImageGroup imageGroup) {
        if (imageGroup == null) {
            return vno1.k().a();
        }
        vdn vdnVarK = vno1.k();
        String standardLink = imageGroup.getStandardLink();
        if (standardLink == null) {
            standardLink = "";
        }
        vdnVarK.d(standardLink);
        String smallLink = imageGroup.getSmallLink();
        if (smallLink == null) {
            smallLink = "";
        }
        vdnVarK.c(smallLink);
        String largeLink = imageGroup.getLargeLink();
        if (largeLink == null) {
            largeLink = "";
        }
        vdnVarK.b(largeLink);
        String xlargeLink = imageGroup.getXlargeLink();
        vdnVarK.e(xlargeLink != null ? xlargeLink : "");
        return vdnVarK.a();
    }

    public static CollectionGetUnplayedEpisodesRequest b(iih1 iih1Var) {
        c4h c4hVarN = CollectionGetUnplayedEpisodesRequest.n();
        nqz0 nqz0VarF = iih1Var.f();
        mmr0 mmr0VarN = oqn1.n(0, Integer.valueOf(nqz0VarF != null ? nqz0VarF.a : Integer.MAX_VALUE));
        int iIntValue = ((Number) mmr0VarN.a).intValue();
        int iIntValue2 = ((Number) mmr0VarN.b).intValue();
        c4hVarN.u(iIntValue);
        c4hVarN.s(iIntValue2);
        nia1 nia1VarG = iih1Var.g();
        if (nia1VarG != null) {
            c4hVarN.t(tia1.b(nia1VarG));
        }
        Integer numH = iih1Var.h();
        if (numH != null) {
            c4hVarN.v(numH.intValue());
        }
        Boolean boolI = iih1Var.i();
        if (boolI != null) {
            c4hVarN.r(boolI.booleanValue());
        }
        ArrayList arrayList = new ArrayList();
        Boolean boolA = iih1Var.a();
        if (boolA != null) {
            arrayList.add("available eq " + boolA.booleanValue());
        }
        Boolean boolC = iih1Var.c();
        if (boolC != null) {
            arrayList.add("isPlayed eq " + boolC.booleanValue());
        }
        hih1 hih1VarD = iih1Var.d();
        if (hih1VarD != null) {
            if (!(hih1VarD instanceof hih1)) {
                eg.o();
                return null;
            }
            arrayList.add("timeLeft gt 0");
        }
        gih1 gih1VarB = iih1Var.b();
        if (gih1VarB != null) {
            if (!(gih1VarB instanceof gih1)) {
                eg.o();
                return null;
            }
            d1z d1zVar = d1z.a;
            arrayList.add("mediaTypeEnum ne 2");
        }
        if (!arrayList.isEmpty()) {
            c4hVarN.q(o7h.y0(arrayList, ",", null, null, null, 62));
        }
        s3h s3hVarE = iih1Var.e();
        if (s3hVarE != null) {
            p3h p3hVarA = s3hVarE.a().a();
            Map mapA = p3hVarA.a();
            HashMap mapA2 = p3hVarA.c().a();
            EpisodeDecorationPolicy.Builder builderNewBuilder = EpisodeDecorationPolicy.newBuilder();
            Object obj = mapA.get("link");
            Boolean bool = Boolean.TRUE;
            EpisodeDecorationPolicy.Builder manifestId = builderNewBuilder.setLink(u890.j(obj, bool)).setName(u890.j(mapA.get("name"), bool)).setLength(u890.j(mapA.get("length"), bool)).setDescription(u890.j(mapA.get("description"), bool)).setPublishDate(u890.j(mapA.get("publishDate"), bool)).setCovers(u890.j(mapA.get("covers"), bool)).setFreezeFrames(u890.j(mapA.get("freezeFrames"), bool)).setAvailable(u890.j(mapA.get("available"), bool)).setMediaTypeEnum(u890.j(mapA.get("mediaTypeEnum"), bool)).setBackgroundable(u890.j(mapA.get("backgroundable"), bool)).setIsExplicit(u890.j(mapA.get("isExplicit"), bool)).setIs19PlusOnly(u890.j(mapA.get("is19PlusOnly"), bool)).setIsBookChapter(u890.j(mapA.get("isBookChapter"), bool)).setIsMusicAndTalk(u890.j(mapA.get("isMusicAndTalk"), bool)).setIsCurated(u890.j(mapA.get("isCurated"), bool)).setManifestId(u890.j(mapA.get("manifestId"), bool));
            manifestId.addAllExtensionValue(p3hVarA.b());
            k3h k3hVarO = CollectionEpisodeDecorationPolicy.o();
            k3hVarO.q();
            k3hVarO.r(manifestId.build());
            k3hVarO.n(EpisodeCollectionDecorationPolicy.newBuilder().setIsFollowingShow(u890.j(mapA.get("isFollowingShow"), bool)).setIsInListenLater(u890.j(mapA.get("isInListenLater"), bool)).setIsNew(u890.j(mapA.get("isNew"), bool)).build());
            k3hVarO.v(EpisodeSyncDecorationPolicy.newBuilder().setOffline(u890.j(mapA.get("offline"), bool)).build());
            k3hVarO.t(EpisodePlayedStateDecorationPolicy.newBuilder().setTimeLeft(u890.j(mapA.get("timeLeft"), bool)).setIsPlayed(u890.j(mapA.get("isPlayed"), bool)).setPlayable(u890.j(mapA.get("playable"), bool)).setPlayabilityRestriction(u890.j(mapA.get("playabilityRestriction"), bool)).build());
            c7h c7hVarN = CollectionShowDecorationPolicy.n();
            c7hVarN.s((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setLink(u890.j(mapA2.get("link"), bool)).setName(u890.j(mapA2.get("name"), bool)).setCovers(u890.j(mapA2.get("covers"), bool)).build());
            k3hVarO.u((CollectionShowDecorationPolicy) c7hVarN.build());
            c4hVarN.n((CollectionEpisodeDecorationPolicy) k3hVarO.build());
        }
        return c4hVarN.build();
    }

    public final jf21 c(CollectionGetUnplayedEpisodesResponse collectionGetUnplayedEpisodesResponse) {
        g281 g281VarA;
        d1z d1zVar;
        g1z g1zVar;
        Iterator it;
        i1z i1zVarC;
        h290 h290VarN = collectionGetUnplayedEpisodesResponse.n();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = h290VarN.iterator();
        while (it2.hasNext()) {
            UnplayedEpisodeItem unplayedEpisodeItem = (UnplayedEpisodeItem) it2.next();
            CollectionEpisode collectionEpisodeN = unplayedEpisodeItem.n();
            String strO = unplayedEpisodeItem.o();
            if (strO == null || strO.length() == 0) {
                EpisodeMetadata episodeMetadataQ = collectionEpisodeN.q();
                EpisodeSyncState episodeSyncStateR = collectionEpisodeN.r();
                EpisodePlayState episodePlayStateS = collectionEpisodeN.s();
                EpisodeCollectionState episodeCollectionStateP = collectionEpisodeN.p();
                cen cenVarA = a(episodeMetadataQ.hasCovers() ? episodeMetadataQ.getCovers() : null);
                cen cenVarA2 = a(episodeMetadataQ.hasFreezeFrames() ? episodeMetadataQ.getFreezeFrames() : null);
                CollectionShow collectionShowT = collectionEpisodeN.t();
                if (collectionShowT == null || !collectionShowT.s()) {
                    g281VarA = new b281().a();
                } else {
                    ShowMetadata showMetadataQ = collectionShowT.q();
                    cen cenVarA3 = a(showMetadataQ.hasCovers() ? showMetadataQ.getCovers() : null);
                    b281 b281Var = new b281();
                    b281Var.d(cenVarA3);
                    b281Var.y(collectionShowT.getLink());
                    b281Var.q(showMetadataQ.getName());
                    String publisher = showMetadataQ.getPublisher();
                    if (publisher == null) {
                        publisher = "";
                    }
                    b281Var.v(publisher);
                    ShowCollectionState showCollectionStateP = collectionShowT.p();
                    boolean z = false;
                    if (showCollectionStateP != null && showCollectionStateP.getIsInCollection()) {
                        z = true;
                    }
                    b281Var.h(z);
                    g281VarA = b281Var.a();
                }
                if (episodeMetadataQ.hasMediaTypeEnum()) {
                    EpisodeMetadata.MediaType mediaTypeEnum = episodeMetadataQ.getMediaTypeEnum();
                    int i = mediaTypeEnum == null ? -1 : kih1.c[mediaTypeEnum.ordinal()];
                    if (i == 1) {
                        d1zVar = d1z.a;
                    } else if (i != 2) {
                        d1zVar = i != 3 ? d1z.d : d1z.c;
                    } else {
                        d1zVar = d1z.b;
                    }
                } else {
                    d1zVar = d1z.d;
                }
                if (episodeMetadataQ.hasEpisodeType()) {
                    EpisodeMetadata.EpisodeType episodeType = episodeMetadataQ.getEpisodeType();
                    int i2 = episodeType == null ? -1 : kih1.b[episodeType.ordinal()];
                    if (i2 == 1) {
                        g1zVar = g1z.c;
                    } else if (i2 != 2) {
                        g1zVar = i2 != 3 ? g1z.d : g1z.a;
                    } else {
                        g1zVar = g1z.b;
                    }
                } else {
                    g1zVar = g1z.d;
                }
                List<Extension> extensionList = episodeMetadataQ.getExtensionList();
                ArrayList arrayList2 = new ArrayList(q7h.U(extensionList, 10));
                for (Extension extension : extensionList) {
                    arrayList2.add(new jz00(extension.getData().t(), extension.getExtensionKind().getNumber()));
                    it2 = it2;
                }
                it = it2;
                jv00 jv00VarA = this.b.a(arrayList2);
                c1z c1zVarL = nmn1.l();
                c1zVarL.C(g281VarA);
                c1zVarL.d(cenVarA);
                c1zVarL.E(g1zVar);
                c1zVarL.F(episodeMetadataQ.getLink());
                c1zVarL.u(episodeMetadataQ.getName());
                c1zVarL.t(d1zVar);
                c1zVarL.j(cenVarA2);
                c1zVarL.r(episodeMetadataQ.getLength());
                c1zVarL.y(episodeMetadataQ.getPreviewId());
                c1zVarL.g(episodeMetadataQ.getIsExplicit());
                c1zVarL.l(episodeMetadataQ.getIs19PlusOnly());
                c1zVarL.m(episodeMetadataQ.getIsBookChapter());
                c1zVarL.A((int) episodeMetadataQ.getPublishDate());
                c1zVarL.b(episodeMetadataQ.getBackgroundable());
                c1zVarL.a(episodeMetadataQ.getAvailable());
                String manifestId = episodeMetadataQ.getManifestId();
                if (manifestId == null) {
                    manifestId = "";
                }
                c1zVarL.s(manifestId);
                String description = episodeMetadataQ.getDescription();
                if (description == null) {
                    description = "";
                }
                c1zVarL.f(description);
                c1zVarL.x(episodePlayStateS.getIsPlayed());
                c1zVarL.B(episodeCollectionStateP.getIsInListenLater());
                String previewManifestId = episodeMetadataQ.getPreviewManifestId();
                c1zVarL.z(previewManifestId != null ? previewManifestId : "");
                c1zVarL.p(episodeCollectionStateP.getIsNew());
                c1zVarL.i(episodeCollectionStateP.getIsFollowingShow());
                c1zVarL.o(episodeMetadataQ.getIsMusicAndTalk());
                c1zVarL.n(episodeMetadataQ.getIsCurated());
                c1zVarL.e(episodePlayStateS.getIsPlayable());
                PlayabilityRestriction playabilityRestriction = episodePlayStateS.getPlayabilityRestriction();
                int i3 = playabilityRestriction == null ? -1 : kih1.a[playabilityRestriction.ordinal()];
                int i4 = 4;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i4 = 3;
                    } else if (i3 != 3) {
                        i4 = i3 != 4 ? 1 : 5;
                    } else {
                        i4 = 2;
                    }
                }
                c1zVarL.w(i4);
                c1zVarL.q(Long.valueOf(episodePlayStateS.getLastPlayedAt()));
                c1zVarL.D((!episodePlayStateS.hasTimeLeft() || episodePlayStateS.getTimeLeft() < 0) ? null : Integer.valueOf(episodePlayStateS.getTimeLeft()));
                c1zVarL.v(dm5.O(episodeSyncStateR.getSyncProgress(), episodeSyncStateR.getOfflineState()));
                c1zVarL.h(jv00VarA);
                i1zVarC = c1zVarL.c();
            } else {
                c1z c1zVarL2 = nmn1.l();
                c1zVarL2.k(strO);
                i1zVarC = c1zVarL2.c();
                it = it2;
            }
            arrayList.add(i1zVarC);
            it2 = it;
        }
        return new jf21(arrayList, collectionGetUnplayedEpisodesResponse);
    }
}
