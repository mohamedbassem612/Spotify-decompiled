package p;

import com.spotify.cosmos.util.libs.proto.PlayabilityRestriction;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState;
import com.spotify.mobile.android.spotlets.show.proto.Extension;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest;
import com.spotify.mobile.android.spotlets.show.proto.ShowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vo30 {
    public final lv00 a;

    public vo30(lv00 lv00Var) {
        this.a = lv00Var;
    }

    public static cen a(ImageGroup.ProtoImageGroup protoImageGroup) {
        if (protoImageGroup == null) {
            return new cen();
        }
        String standardLink = protoImageGroup.getStandardLink();
        if (standardLink == null) {
            standardLink = "";
        }
        String smallLink = protoImageGroup.getSmallLink();
        if (smallLink == null) {
            smallLink = "";
        }
        String largeLink = protoImageGroup.getLargeLink();
        if (largeLink == null) {
            largeLink = "";
        }
        String xlargeLink = protoImageGroup.getXlargeLink();
        return new cen(standardLink, smallLink, largeLink, xlargeLink != null ? xlargeLink : "");
    }

    public static int f(PlayabilityRestriction playabilityRestriction) {
        int i = so30.d[playabilityRestriction.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 1 : 5;
        }
        return 2;
    }

    public static ArrayList g(h290 h290Var) {
        ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            Extension extension = (Extension) it.next();
            arrayList.add(new jz00(extension.getData().t(), extension.n()));
        }
        return arrayList;
    }

    public final i1z b(EpisodeMetadata.ProtoEpisodeMetadata protoEpisodeMetadata, EpisodeState.ProtoEpisodeOfflineState protoEpisodeOfflineState, EpisodeState.ProtoEpisodePlayState protoEpisodePlayState, EpisodeState.ProtoEpisodeCollectionState protoEpisodeCollectionState, String str) {
        g281 g281VarA;
        d1z d1zVar;
        g1z g1zVar;
        if (str != null && str.length() != 0) {
            c1z c1zVarL = nmn1.l();
            c1zVarL.k(str);
            return c1zVarL.c();
        }
        if (protoEpisodeMetadata == null) {
            return null;
        }
        ImageGroup.ProtoImageGroup protoImageGroupN = protoEpisodeMetadata.n();
        if (!protoEpisodeMetadata.hasCovers()) {
            protoImageGroupN = null;
        }
        cen cenVarA = a(protoImageGroupN);
        ImageGroup.ProtoImageGroup protoImageGroupQ = protoEpisodeMetadata.q();
        if (!protoEpisodeMetadata.hasFreezeFrames()) {
            protoImageGroupQ = null;
        }
        cen cenVarA2 = a(protoImageGroupQ);
        EpisodeMetadata.ProtoEpisodeShowMetadata protoEpisodeShowMetadataS = protoEpisodeMetadata.s();
        if (!protoEpisodeMetadata.hasShow()) {
            protoEpisodeShowMetadataS = null;
        }
        if (protoEpisodeShowMetadataS == null) {
            g281VarA = new b281().a();
        } else {
            ImageGroup.ProtoImageGroup protoImageGroupN2 = protoEpisodeShowMetadataS.n();
            if (!protoEpisodeShowMetadataS.hasCovers()) {
                protoImageGroupN2 = null;
            }
            cen cenVarA3 = a(protoImageGroupN2);
            b281 b281Var = new b281();
            b281Var.d(cenVarA3);
            b281Var.y(protoEpisodeShowMetadataS.getLink());
            b281Var.q(protoEpisodeShowMetadataS.getName());
            String publisher = protoEpisodeShowMetadataS.getPublisher();
            if (publisher == null) {
                publisher = "";
            }
            b281Var.v(publisher);
            g281VarA = b281Var.a();
        }
        Enum enumR = protoEpisodeMetadata.r();
        if (!protoEpisodeMetadata.hasMediaTypeEnum()) {
            enumR = null;
        }
        int i = enumR == null ? -1 : so30.c[enumR.ordinal()];
        if (i == 1) {
            d1zVar = d1z.a;
        } else if (i != 2) {
            d1zVar = i != 3 ? d1z.d : d1z.c;
        } else {
            d1zVar = d1z.b;
        }
        int iOrdinal = protoEpisodeMetadata.p().ordinal();
        if (iOrdinal == 1) {
            g1zVar = g1z.a;
        } else if (iOrdinal != 2) {
            g1zVar = iOrdinal != 3 ? g1z.d : g1z.c;
        } else {
            g1zVar = g1z.b;
        }
        jv00 jv00VarA = this.a.a(g(protoEpisodeMetadata.getExtensionList()));
        c1z c1zVarL2 = nmn1.l();
        c1zVarL2.C(g281VarA);
        c1zVarL2.d(cenVarA);
        c1zVarL2.E(g1zVar);
        c1zVarL2.F(protoEpisodeMetadata.getLink());
        c1zVarL2.u(protoEpisodeMetadata.getName());
        c1zVarL2.t(d1zVar);
        c1zVarL2.j(cenVarA2);
        c1zVarL2.r(protoEpisodeMetadata.getLength());
        c1zVarL2.y(protoEpisodeMetadata.getPreviewId());
        c1zVarL2.g(protoEpisodeMetadata.getIsExplicit());
        c1zVarL2.l(protoEpisodeMetadata.getIs19PlusOnly());
        c1zVarL2.m(protoEpisodeMetadata.getIsBookChapter());
        c1zVarL2.A((int) protoEpisodeMetadata.getPublishDate());
        c1zVarL2.b(protoEpisodeMetadata.getBackgroundable());
        c1zVarL2.a(protoEpisodeMetadata.getAvailable());
        String manifestId = protoEpisodeMetadata.getManifestId();
        if (manifestId == null) {
            manifestId = "";
        }
        c1zVarL2.s(manifestId);
        String description = protoEpisodeMetadata.getDescription();
        if (description == null) {
            description = "";
        }
        c1zVarL2.f(description);
        c1zVarL2.x(protoEpisodePlayState != null && protoEpisodePlayState.getIsPlayed());
        c1zVarL2.B(protoEpisodeCollectionState != null && protoEpisodeCollectionState.getIsInListenLater());
        c1zVarL2.n(protoEpisodeMetadata.getIsCurated());
        String previewManifestId = protoEpisodeMetadata.getPreviewManifestId();
        c1zVarL2.z(previewManifestId != null ? previewManifestId : "");
        c1zVarL2.p(protoEpisodeCollectionState != null && protoEpisodeCollectionState.getIsNew());
        c1zVarL2.i(protoEpisodeCollectionState != null && protoEpisodeCollectionState.getIsFollowingShow());
        c1zVarL2.o(protoEpisodeMetadata.getIsMusicAndTalk());
        c1zVarL2.e(protoEpisodePlayState != null && protoEpisodePlayState.getIsPlayable());
        c1zVarL2.w(protoEpisodePlayState != null ? f(protoEpisodePlayState.p()) : 1);
        c1zVarL2.q(protoEpisodePlayState != null ? Long.valueOf(protoEpisodePlayState.o()) : null);
        c1zVarL2.D((protoEpisodePlayState == null || !protoEpisodePlayState.hasTimeLeft() || protoEpisodePlayState.getTimeLeft() < 0) ? null : Integer.valueOf(protoEpisodePlayState.getTimeLeft()));
        c1zVarL2.v(dm5.O(protoEpisodeOfflineState != null ? protoEpisodeOfflineState.getSyncProgress() : 0, protoEpisodeOfflineState != null ? protoEpisodeOfflineState.getOfflineState() : null));
        c1zVarL2.h(jv00VarA);
        return c1zVarL2.c();
    }

    public final i1z c(ShowShowRequest.ProtoShowRequestItem protoShowRequestItem) {
        return b(protoShowRequestItem.u() ? protoShowRequestItem.p() : null, protoShowRequestItem.v() ? protoShowRequestItem.q() : null, protoShowRequestItem.w() ? protoShowRequestItem.r() : null, protoShowRequestItem.t() ? protoShowRequestItem.o() : null, protoShowRequestItem.x() ? protoShowRequestItem.s() : null);
    }

    public final g281 d(ShowMetadata.ProtoShowMetadata protoShowMetadata, ShowState.ProtoShowCollectionState protoShowCollectionState, ShowState.ProtoShowPlayState protoShowPlayState, ShowState.ProtoShowOfflineState protoShowOfflineState) {
        d281 d281Var;
        f281 f281Var;
        e281 e281Var;
        String latestPlayedEpisodeLink;
        String resumeEpisodeLink;
        if (protoShowMetadata == null) {
            return new b281().a();
        }
        jv00 jv00VarA = this.a.a(g(protoShowMetadata.getExtensionList()));
        ImageGroup.ProtoImageGroup protoImageGroupO = protoShowMetadata.o();
        if (!protoShowMetadata.hasCovers()) {
            protoImageGroupO = null;
        }
        cen cenVarA = a(protoImageGroupO);
        String consumptionOrder = protoShowMetadata.getConsumptionOrder();
        if ("episodic".equalsIgnoreCase(consumptionOrder)) {
            d281Var = d281.b;
        } else if ("sequential".equalsIgnoreCase(consumptionOrder)) {
            d281Var = d281.c;
        } else {
            d281Var = "recent".equalsIgnoreCase(consumptionOrder) ? d281.d : d281.a;
        }
        Integer numValueOf = Integer.valueOf(protoShowMetadata.getMediaTypeEnum());
        if (!protoShowMetadata.hasMediaTypeEnum()) {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            f281Var = f281.a;
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            f281Var = f281.b;
        } else {
            f281Var = (numValueOf != null && numValueOf.intValue() == 2) ? f281.c : f281.d;
        }
        b281 b281Var = new b281();
        b281Var.d(cenVarA);
        b281Var.y(protoShowMetadata.getLink());
        b281Var.q(protoShowMetadata.getName());
        b281Var.p(f281Var);
        b281Var.b(d281Var);
        if (protoShowPlayState == null) {
            e281Var = e281.a;
        } else {
            int i = so30.b[protoShowPlayState.o().ordinal()];
            if (i == 1) {
                e281Var = e281.b;
            } else if (i != 2) {
                e281Var = i != 3 ? e281.a : e281.d;
            } else {
                e281Var = e281.c;
            }
        }
        b281Var.m(e281Var);
        b281Var.e(protoShowMetadata.getDescription());
        b281Var.c(protoShowMetadata.n());
        b281Var.x(protoShowMetadata.getTrailerUri());
        b281Var.n();
        b281Var.f(protoShowMetadata.getIsExplicit());
        b281Var.h(protoShowCollectionState != null && protoShowCollectionState.getIsInCollection());
        if (protoShowPlayState == null || (latestPlayedEpisodeLink = protoShowPlayState.getLatestPlayedEpisodeLink()) == null) {
            latestPlayedEpisodeLink = "";
        }
        b281Var.o(latestPlayedEpisodeLink);
        if (protoShowPlayState == null || (resumeEpisodeLink = protoShowPlayState.getResumeEpisodeLink()) == null) {
            resumeEpisodeLink = "";
        }
        b281Var.w(resumeEpisodeLink);
        b281Var.t(protoShowPlayState != null ? protoShowPlayState.getPlayedPercentage() : 0);
        b281Var.u(protoShowPlayState != null ? protoShowPlayState.getPlayedTime() : 0L);
        b281Var.s(protoShowPlayState != null ? f(protoShowPlayState.p()) : 1);
        b281Var.r(dm5.O(protoShowOfflineState != null ? protoShowOfflineState.getSyncProgress() : 0, protoShowOfflineState != null ? protoShowOfflineState.getOfflineState() : null));
        b281Var.l(protoShowPlayState != null && protoShowPlayState.getIsPlayable());
        String publisher = protoShowMetadata.getPublisher();
        if (publisher == null) {
            publisher = "";
        }
        b281Var.v(publisher);
        b281Var.k(protoShowMetadata.getIsMusicAndTalk());
        b281Var.j(protoShowMetadata.getIsBook());
        b281Var.g(jv00VarA);
        List<ShowMetadata.ProtoFormatListAttribute> formatListAttributesList = protoShowMetadata.getFormatListAttributesList();
        int iS = zno1.s(q7h.U(formatListAttributesList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (ShowMetadata.ProtoFormatListAttribute protoFormatListAttribute : formatListAttributesList) {
            String key = protoFormatListAttribute.getKey();
            if (key == null) {
                key = "";
            }
            String value = protoFormatListAttribute.getValue();
            if (value == null) {
                value = "";
            }
            mmr0 mmr0VarN = oqn1.n(key, value);
            linkedHashMap.put(mmr0VarN.a, mmr0VarN.b);
        }
        b281Var.i(linkedHashMap);
        return b281Var.a();
    }

    public final Map e(ShowDecorateRequest.ProtoDecorateResponse protoDecorateResponse) {
        if (protoDecorateResponse == null) {
            return null;
        }
        return sqg0.V(z561.f0(jl30.V0, new sgg1(new u830(this, (byte) 8), new i46(protoDecorateResponse.n(), (byte) 1))));
    }
}
