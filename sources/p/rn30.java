package p;

import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import com.spotify.bumblebee.originalvideo.v1.OriginalVideo;
import com.spotify.bumblebee.playability.v1.proto.Playability;
import com.spotify.contentagnostic.v2.ChartPosition;
import com.spotify.contentagnostic.v2.ContributorReference;
import com.spotify.contentagnostic.v2.GranularRatings;
import com.spotify.contentagnostic.v2.IdentityTrait;
import com.spotify.contentagnostic.v2.LicensingIdentifiersTrait;
import com.spotify.contentagnostic.v2.OnPlatformReputationTrait;
import com.spotify.contentagnostic.v2.Rating;
import com.spotify.contentagnostic.v2.Verification;
import com.spotify.extendedmetadata.extensions.highlightabilityimpl.proto.Highlightability;
import com.spotify.extendedmetadata.extensions.homepreviewplaybacktrait.proto.AudioPreviewPlaybackTrait;
import com.spotify.extendedmetadata.extensions.homepreviewplaybacktrait.proto.Offsets;
import com.spotify.extendedmetadata.extensions.htmldescriptionimpl.proto.HtmlDescription;
import com.spotify.extendedmetadata.extensions.listmetadataimpl.Attributes;
import com.spotify.extendedmetadata.extensions.listmetadataimpl.Capabilities;
import com.spotify.extendedmetadata.extensions.listmetadataimpl.GrantableLevelsProto;
import com.spotify.extendedmetadata.extensions.listmetadataimpl.ListAttributeCapabilities;
import com.spotify.extendedmetadata.extensions.listmetadataimpl.PictureSize;
import com.spotify.extendedmetadata.extensions.listtuneraudioanalysis.ListTunerAudioAnalysisProto;
import com.spotify.extendedmetadata.extensions.liveeventsimpl.proto.ArtistOnTour;
import com.spotify.extendedmetadata.extensions.liveeventsimpl.proto.DateWithOffset;
import com.spotify.extendedmetadata.extensions.liveeventsimpl.proto.LiveEvent;
import com.spotify.extendedmetadata.extensions.liveeventsimpl.proto.LiveEvents;
import com.spotify.extendedmetadata.extensions.localconcertsimpl.proto.Concert;
import com.spotify.extendedmetadata.extensions.localconcertsimpl.proto.LocalConcerts;
import com.spotify.extendedmetadata.extensions.mixabilitytraitimpl.proto.MixabilityTrait;
import com.spotify.extendedmetadata.extensions.playtraitimpl.proto.PlayTrait;
import com.spotify.extendedmetadata.extensions.podcastpollimpl.proto.PodcastPoll;
import com.spotify.extendedmetadata.extensions.podcastratingimpl.proto.AverageRating;
import com.spotify.extendedmetadata.extensions.podcastratingimpl.proto.PodcastRating;
import com.spotify.extendedmetadata.extensions.podcastsegmentsimpl.proto.PodcastSegments;
import com.spotify.extendedmetadata.extensions.podcastsubscriptionsimpl.proto.PodcastSubscription;
import com.spotify.extendedmetadata.extensions.podcasttopicsimpl.proto.PodcastTopic;
import com.spotify.extendedmetadata.extensions.podcasttopicsimpl.proto.PodcastTopics;
import com.spotify.freshfindsforward.v1.FreshFindsForwardExtension;
import com.spotify.livestream.proto.api.extendedmetadata.v1.LivestreamEntityError;
import com.spotify.livestream.proto.api.extendedmetadata.v1.LivestreamEntityItem;
import com.spotify.livestream.proto.api.extendedmetadata.v1.LivestreamEntitySection;
import com.spotify.livestream.proto.api.extendedmetadata.v1.LivestreamHost;
import com.spotify.livestream.proto.api.extendedmetadata.v1.ParentInfo;
import com.spotify.madeforkids.v1.MadeForKids;
import com.spotify.npvcontrolsexperiment.v1.NpvControlsExperiment;
import com.spotify.playlistmixing.extensions.mixability.proto.Mixability;
import com.spotify.playlistmixing.extensions.mixstate.proto.MixState;
import com.spotify.playliststats.v1.PlaylistStat;
import com.spotify.playliststats.v1.PlaylistStatsExtension;
import com.spotify.share.resolved_share.proto.ResolvedShareProto;
import com.spotify.spectrum.creator_expression.v1.FeaturedEpisodeMetadata;
import com.spotify.traits.highlight.proto.HighlighPlayabilityTraitProto;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import spotify.artistsectionprovider.v1.popularreleases.PopularReleases;
import spotify.artistsectionprovider.v1.popularreleases.Release;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rn30 implements ov00 {
    public final /* synthetic */ byte a;

    public static String c(Attributes attributes, String str) {
        Object next;
        Iterator it = attributes.t().getPictureSizeList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((PictureSize) next).getTargetName(), str));
        PictureSize pictureSize = (PictureSize) next;
        String url = pictureSize != null ? pictureSize.getUrl() : null;
        if (url == null || url.length() == 0) {
            return null;
        }
        return url;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0188  */
    public final ez00 a(byte[] bArr) {
        int i;
        int i2;
        wls0 wls0Var;
        int i3;
        int i4;
        int i5;
        s8p0 s8p0Var;
        w6q0 w6q0Var;
        y6q0 y6q0Var;
        z6q0 z6q0Var;
        yst0 yst0Var;
        int i6;
        ewu0 ewu0Var;
        fwu0 fwu0Var;
        int i7 = 0;
        int i8 = 4;
        int i9 = 2;
        switch (this.a) {
            case 0:
                FreshFindsForwardExtension freshFindsForwardExtensionR = FreshFindsForwardExtension.r(bArr);
                int iOrdinal = freshFindsForwardExtensionR.q().ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else if (iOrdinal == 1) {
                    i = 2;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                } else {
                    i = 3;
                }
                return new pn30(i, freshFindsForwardExtensionR.n(), freshFindsForwardExtensionR.o(), freshFindsForwardExtensionR.p());
            case 1:
                HighlighPlayabilityTraitProto.HighlightPlayabilityTrait highlightPlayabilityTraitR = HighlighPlayabilityTraitProto.HighlightPlayabilityTrait.r(bArr);
                return new tc60(highlightPlayabilityTraitR.o(), highlightPlayabilityTraitR.p(), highlightPlayabilityTraitR.q(), highlightPlayabilityTraitR.getIsPlayable());
            case 2:
                Highlightability highlightabilityR = Highlightability.r(bArr);
                boolean zQ = highlightabilityR.q();
                Duration durationP = highlightabilityR.p();
                ytw0 ytw0Var = jfv.b;
                long jP = durationP.p();
                ngv ngvVar = ngv.e;
                long jL0 = fdg1.l0(jP, ngvVar);
                int iO = durationP.o();
                ngv ngvVar2 = ngv.b;
                long jQ = jfv.q(jL0, fdg1.k0(iO, ngvVar2));
                Duration durationO = highlightabilityR.o();
                return new be60(jQ, jfv.q(fdg1.l0(durationO.p(), ngvVar), fdg1.k0(durationO.o(), ngvVar2)), zQ);
            case 3:
                AudioPreviewPlaybackTrait audioPreviewPlaybackTraitX = AudioPreviewPlaybackTrait.x(bArr);
                String strO = audioPreviewPlaybackTraitX.o();
                String strN = audioPreviewPlaybackTraitX.v().length() > 0 ? wqn1.n(audioPreviewPlaybackTraitX.v()) : null;
                String strU = audioPreviewPlaybackTraitX.u();
                strU.getClass();
                if (ihc1.y0(strU)) {
                    strU = null;
                }
                if (strU == null) {
                    strU = "";
                }
                String str = strU;
                Offsets offsetsQ = audioPreviewPlaybackTraitX.q();
                myp0 myp0Var = new myp0(offsetsQ.q(), offsetsQ.p());
                String strW = audioPreviewPlaybackTraitX.w();
                Duration durationR = audioPreviewPlaybackTraitX.r();
                Duration durationP2 = audioPreviewPlaybackTraitX.p();
                String strT = audioPreviewPlaybackTraitX.t();
                int iOrdinal2 = audioPreviewPlaybackTraitX.s().ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 1;
                } else if (iOrdinal2 == 1) {
                    i2 = 2;
                } else if (iOrdinal2 == 2) {
                    i2 = 3;
                } else {
                    if (iOrdinal2 != 3) {
                        eg.o();
                        return null;
                    }
                    i2 = 4;
                }
                return new yo60(strO, strN, str, myp0Var, strW, durationR, durationP2, strT, i2);
            case 4:
                return new z070(HtmlDescription.p(bArr).o());
            case 5:
                IdentityTrait identityTraitS = IdentityTrait.s(bArr);
                String name = identityTraitS.getName();
                String strQ = identityTraitS.q();
                String description = identityTraitS.getDescription();
                h290<ContributorReference> h290VarP = identityTraitS.p();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
                for (ContributorReference contributorReference : h290VarP) {
                    arrayList.add(new ho70(contributorReference.getName(), contributorReference.getUri()));
                }
                return new jo70(name, strQ, description, arrayList, identityTraitS.r() ? new io70(identityTraitS.o().getName(), identityTraitS.o().getUri()) : null);
            case 6:
                return new aw21(ResolvedShareProto.ResolvedShare.p(bArr).o());
            case 7:
                LicensingIdentifiersTrait licensingIdentifiersTraitR = LicensingIdentifiersTrait.r(bArr);
                return new h8c0(licensingIdentifiersTraitR.q(), licensingIdentifiersTraitR.o(), licensingIdentifiersTraitR.p());
            case 8:
                Attributes attributesV = Attributes.v(bArr);
                String name2 = attributesV.getName();
                String strC = c(attributesV, "small");
                String strC2 = c(attributesV, "large");
                String strC3 = c(attributesV, "xlarge");
                String strC4 = c(attributesV, "default");
                aen aenVar = new aen(strC, strC2, strC3, (strC4 == null || strC4.length() == 0) ? new wdn(y6b1.i(zno1.z(attributesV.s().t())).toString()) : new xdn(strC4));
                String format = attributesV.getFormat();
                String description2 = attributesV.getDescription();
                String ownerUsername = attributesV.getOwnerUsername();
                Timestamp createdAt = attributesV.getCreatedAt();
                long jP2 = (((long) createdAt.p()) / 1000000) + (createdAt.q() * 1000);
                Timestamp updatedAt = attributesV.getUpdatedAt();
                long jP3 = (((long) updatedAt.p()) / 1000000) + (updatedAt.q() * 1000);
                Capabilities capabilitiesQ = attributesV.q();
                boolean zR = capabilitiesQ.r();
                GrantableLevelsProto grantableLevelsProtoV = capabilitiesQ.v();
                d290 d290VarO = grantableLevelsProtoV.o();
                ArrayList arrayList2 = new ArrayList(q7h.U(d290VarO, 10));
                Iterator it = d290VarO.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    wls0 wls0Var2 = wls0.c;
                    wls0 wls0Var3 = wls0.d;
                    wls0 wls0Var4 = wls0.f;
                    wls0 wls0Var5 = wls0.e;
                    wls0 wls0Var6 = wls0.a;
                    wls0 wls0Var7 = wls0.b;
                    if (!zHasNext) {
                        d290<xls0> d290VarQ = grantableLevelsProtoV.q();
                        ArrayList arrayList3 = new ArrayList(q7h.U(d290VarQ, 10));
                        for (xls0 xls0Var : d290VarQ) {
                            xls0Var.getClass();
                            switch (xls0Var.ordinal()) {
                                case 0:
                                case 6:
                                    wls0Var = wls0Var7;
                                    continue;
                                    arrayList3.add(wls0Var);
                                    break;
                                case 1:
                                    wls0Var = wls0Var2;
                                    continue;
                                    arrayList3.add(wls0Var);
                                    break;
                                case 2:
                                    wls0Var = wls0Var3;
                                    continue;
                                    arrayList3.add(wls0Var);
                                    break;
                                case 3:
                                    wls0Var = wls0Var4;
                                    continue;
                                    arrayList3.add(wls0Var);
                                    break;
                                case 4:
                                    wls0Var = wls0Var5;
                                    continue;
                                    arrayList3.add(wls0Var);
                                    break;
                                case 5:
                                    wls0Var = wls0Var6;
                                    continue;
                                    arrayList3.add(wls0Var);
                                    break;
                            }
                        }
                        rc50 rc50Var = new rc50(arrayList2, arrayList3);
                        boolean zQ2 = capabilitiesQ.q();
                        ListAttributeCapabilities listAttributeCapabilitiesW = capabilitiesQ.w();
                        return new dxc0(name2, jP2, jP3, description2, aenVar, ownerUsername, format, zno1.z(attributesV.o().p().t()), attributesV.r().o(), new x7i1(zR, new exc0(listAttributeCapabilitiesW.q().o(), listAttributeCapabilitiesW.p().o(), listAttributeCapabilitiesW.r().o()), rc50Var, zQ2, capabilitiesQ.o(), capabilitiesQ.p(), capabilitiesQ.s(), capabilitiesQ.t(), 61), attributesV.u() ? Long.valueOf(attributesV.p()) : null);
                    }
                    xls0 xls0Var2 = (xls0) it.next();
                    xls0Var2.getClass();
                    switch (xls0Var2.ordinal()) {
                        case 0:
                        case 6:
                            wls0Var2 = wls0Var7;
                            continue;
                            arrayList2.add(wls0Var2);
                            break;
                        case 1:
                            continue;
                            arrayList2.add(wls0Var2);
                            break;
                        case 2:
                            wls0Var2 = wls0Var3;
                            continue;
                            arrayList2.add(wls0Var2);
                            break;
                        case 3:
                            wls0Var2 = wls0Var4;
                            continue;
                            arrayList2.add(wls0Var2);
                            break;
                        case 4:
                            wls0Var2 = wls0Var5;
                            continue;
                            arrayList2.add(wls0Var2);
                            break;
                        case 5:
                            wls0Var2 = wls0Var6;
                            continue;
                            arrayList2.add(wls0Var2);
                            break;
                    }
                }
                eg.o();
                return null;
            case 9:
                ListTunerAudioAnalysisProto.ListTunerAudioAnalysis listTunerAudioAnalysisR = ListTunerAudioAnalysisProto.ListTunerAudioAnalysis.r(bArr);
                return new n5d0(listTunerAudioAnalysisR.q(), listTunerAudioAnalysisR.p(), listTunerAudioAnalysisR.o());
            case 10:
                LiveEvents liveEventsP = LiveEvents.p(bArr);
                h290<LiveEvent> h290VarO = liveEventsP.o();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarO, 10));
                for (LiveEvent liveEvent : h290VarO) {
                    String uri = liveEvent.getUri();
                    String title = liveEvent.getTitle();
                    String strP = liveEvent.p();
                    String imageUrl = liveEvent.getImageUrl();
                    DateWithOffset dateWithOffsetO = liveEvent.o();
                    arrayList4.add(new lnd0(uri, title, strP, imageUrl, new i7r(dateWithOffsetO.o(), dateWithOffsetO.q())));
                }
                List<ArtistOnTour> artistsList = liveEventsP.getArtistsList();
                ArrayList arrayList5 = new ArrayList(q7h.U(artistsList, 10));
                for (ArtistOnTour artistOnTour : artistsList) {
                    arrayList5.add(new xs6(artistOnTour.p(), artistOnTour.getUri(), artistOnTour.getImageUrl(), artistOnTour.getTitle(), artistOnTour.o()));
                }
                return new xou0(arrayList4, arrayList5);
            case 11:
                LivestreamEntitySection livestreamEntitySectionQ = LivestreamEntitySection.q(bArr);
                LivestreamEntityItem livestreamEntityItemP = livestreamEntitySectionQ.p();
                String title2 = livestreamEntityItemP.getTitle();
                String description3 = livestreamEntityItemP.getDescription();
                h290<LivestreamHost> h290VarU = livestreamEntityItemP.u();
                ArrayList arrayList6 = new ArrayList(q7h.U(h290VarU, 10));
                for (LivestreamHost livestreamHost : h290VarU) {
                    livestreamHost.getClass();
                    arrayList6.add(new hvd0(livestreamHost.getName(), livestreamHost.getImageUrl()));
                }
                long jZ = livestreamEntityItemP.z();
                long jS = livestreamEntityItemP.s();
                String strQ2 = livestreamEntityItemP.q();
                String strY = livestreamEntityItemP.y();
                if (strY == null) {
                    jah.g("Room URI is required to be non-null for a LivestreamEntityItem.");
                    return null;
                }
                h290 h290VarT = livestreamEntityItemP.t();
                int iOrdinal3 = livestreamEntityItemP.x().ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 1;
                } else if (iOrdinal3 != 1) {
                    i3 = iOrdinal3 != 3 ? 3 : 4;
                } else {
                    i3 = 2;
                }
                String imageUrl2 = livestreamEntityItemP.getImageUrl();
                h290<ParentInfo> h290VarW = livestreamEntityItemP.w();
                ArrayList arrayList7 = new ArrayList(q7h.U(h290VarW, 10));
                for (ParentInfo parentInfo : h290VarW) {
                    parentInfo.getClass();
                    arrayList7.add(new ivd0(parentInfo.getImageUrl(), parentInfo.getTitle(), parentInfo.getEntityUri(), false));
                }
                boolean zO = livestreamEntityItemP.o();
                switch (livestreamEntityItemP.p().ordinal()) {
                    case 1:
                        i4 = 2;
                        break;
                    case 2:
                        i4 = 3;
                        break;
                    case 3:
                        i4 = 4;
                        break;
                    case 4:
                        i4 = 5;
                        break;
                    case 5:
                        i5 = 6;
                        i4 = i5;
                        break;
                    case 6:
                        i5 = 7;
                        i4 = i5;
                        break;
                    case 7:
                        i5 = 8;
                        i4 = i5;
                        break;
                    default:
                        n57.s("Unrecognized livestream entity cta_display value received");
                        i4 = 1;
                        break;
                }
                gvd0 gvd0Var = new gvd0(title2, description3, arrayList6, jZ, jS, strQ2, strY, h290VarT, i3, imageUrl2, arrayList7, zO, i4, livestreamEntityItemP.v(), livestreamEntityItemP.A());
                LivestreamEntityError livestreamEntityErrorO = livestreamEntitySectionQ.o();
                return new jvd0(gvd0Var, new fvd0(Integer.valueOf(livestreamEntityErrorO.o()), livestreamEntityErrorO.getMessage()));
            case 12:
                h290 h290VarO2 = LocalConcerts.p(bArr).o();
                ArrayList arrayList8 = new ArrayList(q7h.U(h290VarO2, 10));
                Iterator it2 = h290VarO2.iterator();
                while (it2.hasNext()) {
                    arrayList8.add(new h6k(((Concert) it2.next()).getUri()));
                }
                return new dde0(arrayList8);
            case 13:
                return new muf0(MadeForKids.o(bArr).n());
            case 14:
                return new fuj0(MixState.p(bArr).o());
            case 15:
                return new vuj0(Mixability.p(bArr).o());
            case 16:
                MixabilityTrait mixabilityTraitQ = MixabilityTrait.q(bArr);
                return new wuj0(mixabilityTraitQ.p() ? mixabilityTraitQ.o() : true);
            case 17:
                NpvControlsExperiment npvControlsExperimentP = NpvControlsExperiment.p(bArr);
                int iOrdinal4 = npvControlsExperimentP.n().ordinal();
                if (iOrdinal4 == 0) {
                    i8 = 1;
                } else if (iOrdinal4 == 1) {
                    i8 = 2;
                } else if (iOrdinal4 == 2) {
                    i8 = 3;
                }
                d290<r8p0> d290VarO2 = npvControlsExperimentP.o();
                ArrayList arrayList9 = new ArrayList(q7h.U(d290VarO2, 10));
                for (r8p0 r8p0Var : d290VarO2) {
                    r8p0Var.getClass();
                    int iOrdinal5 = r8p0Var.ordinal();
                    if (iOrdinal5 == 0) {
                        s8p0Var = s8p0.a;
                    } else if (iOrdinal5 != 1) {
                        s8p0Var = iOrdinal5 != 2 ? s8p0.d : s8p0.c;
                    } else {
                        s8p0Var = s8p0.b;
                    }
                    arrayList9.add(s8p0Var);
                }
                return new t8p0(i8, arrayList9);
            case 18:
                OnPlatformReputationTrait onPlatformReputationTraitZ = OnPlatformReputationTrait.z(bArr);
                ChartPosition chartPositionO = onPlatformReputationTraitZ.o();
                if (!onPlatformReputationTraitZ.u()) {
                    chartPositionO = null;
                }
                if (chartPositionO != null) {
                    String name3 = chartPositionO.o().getName();
                    String uri2 = chartPositionO.o().getUri();
                    if (!chartPositionO.o().hasUri()) {
                        uri2 = null;
                    }
                    w6q0Var = new w6q0(new v6q0(name3, uri2), chartPositionO.q());
                } else {
                    w6q0Var = null;
                }
                Long lValueOf = onPlatformReputationTraitZ.v() ? Long.valueOf(onPlatformReputationTraitZ.p()) : null;
                long jS2 = onPlatformReputationTraitZ.s();
                Long lValueOf2 = onPlatformReputationTraitZ.x() ? Long.valueOf(onPlatformReputationTraitZ.r()) : null;
                Rating ratingQ = onPlatformReputationTraitZ.q();
                if (!onPlatformReputationTraitZ.w()) {
                    ratingQ = null;
                }
                if (ratingQ != null) {
                    double dO = ratingQ.o();
                    long jP4 = ratingQ.p();
                    GranularRatings granularRatingsR = ratingQ.r();
                    if (!ratingQ.s()) {
                        granularRatingsR = null;
                    }
                    y6q0Var = new y6q0(dO, jP4, granularRatingsR != null ? new x6q0(granularRatingsR.r(), granularRatingsR.t(), granularRatingsR.s(), granularRatingsR.q(), granularRatingsR.p()) : null);
                } else {
                    y6q0Var = null;
                }
                Verification verificationT = onPlatformReputationTraitZ.t();
                if (!onPlatformReputationTraitZ.y()) {
                    verificationT = null;
                }
                if (verificationT != null) {
                    boolean zQ3 = verificationT.q();
                    boolean zR2 = verificationT.r();
                    if (verificationT.s()) {
                        int iO2 = verificationT.o().o();
                        int i10 = iO2 == 0 ? -1 : b7q0.a[l1d.C(iO2)];
                        if (i10 != -1) {
                            if (i10 == 1) {
                                i7 = 1;
                            } else if (i10 == 2) {
                                i7 = 2;
                            } else if (i10 != 3) {
                                eg.o();
                                return null;
                            }
                        }
                    }
                    z6q0Var = new z6q0(zQ3, zR2, i7);
                } else {
                    z6q0Var = null;
                }
                return new a7q0(w6q0Var, lValueOf, jS2, y6q0Var, lValueOf2, z6q0Var);
            case 19:
                h290 h290VarO3 = OriginalVideo.p(bArr).o();
                ArrayList arrayList10 = new ArrayList(q7h.U(h290VarO3, 10));
                Iterator it3 = h290VarO3.iterator();
                while (it3.hasNext()) {
                    arrayList10.add(((phc) it3.next()).v());
                }
                return new erq0(arrayList10);
            case 20:
                PlayTrait playTraitQ = PlayTrait.q(bArr);
                return new nst0(new hhc0(playTraitQ.o().getUri(), playTraitQ.o().getUrl()), new ihc0(playTraitQ.p().o()));
            case 21:
                Playability playabilityP = Playability.p(bArr);
                boolean isPlayable = playabilityP.getIsPlayable();
                int iOrdinal6 = playabilityP.o().ordinal();
                if (iOrdinal6 == 0) {
                    yst0Var = yst0.g;
                } else if (iOrdinal6 == 1) {
                    yst0Var = zst0.c;
                } else if (iOrdinal6 == 2) {
                    yst0Var = yst0.d;
                } else if (iOrdinal6 == 3) {
                    yst0Var = yst0.c;
                } else if (iOrdinal6 == 4) {
                    yst0Var = yst0.e;
                } else {
                    if (iOrdinal6 != 5) {
                        eg.o();
                        return null;
                    }
                    yst0Var = yst0.f;
                }
                return new att0(isPlayable, yst0Var);
            case 22:
                h290<PlaylistStat> h290VarN = PlaylistStatsExtension.o(bArr).n();
                ArrayList arrayList11 = new ArrayList();
                for (PlaylistStat playlistStat : h290VarN) {
                    playlistStat.getClass();
                    int iOrdinal7 = playlistStat.n().ordinal();
                    if (iOrdinal7 == 0) {
                        i6 = 0;
                    } else if (iOrdinal7 == 1) {
                        i6 = 1;
                    } else if (iOrdinal7 == 2) {
                        i6 = 2;
                    } else if (iOrdinal7 != 3) {
                        if (iOrdinal7 != 4) {
                            eg.o();
                            return null;
                        }
                        i6 = 0;
                    } else {
                        i6 = 3;
                    }
                    if (i6 != 0) {
                        int iOrdinal8 = playlistStat.p().ordinal();
                        if (iOrdinal8 == 0) {
                            ewu0Var = null;
                        } else if (iOrdinal8 == 1) {
                            ewu0Var = ewu0.b;
                        } else if (iOrdinal8 == 2) {
                            ewu0Var = ewu0.c;
                        } else if (iOrdinal8 != 3) {
                            if (iOrdinal8 != 4) {
                                eg.o();
                                return null;
                            }
                            ewu0Var = null;
                        } else {
                            ewu0Var = ewu0.a;
                        }
                        if (ewu0Var == null) {
                            fwu0Var = null;
                        } else {
                            fwu0Var = new fwu0(playlistStat.o(), i6, ewu0Var);
                        }
                    } else {
                        fwu0Var = null;
                    }
                    if (fwu0Var != null) {
                        arrayList11.add(fwu0Var);
                    }
                }
                return new gwu0(arrayList11);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                FeaturedEpisodeMetadata featuredEpisodeMetadataQ = FeaturedEpisodeMetadata.q(bArr);
                int iOrdinal9 = featuredEpisodeMetadataQ.o().ordinal();
                if (iOrdinal9 == 0) {
                    i9 = 1;
                } else if (iOrdinal9 != 1) {
                    eg.o();
                    return null;
                }
                return new n4v0(i9, featuredEpisodeMetadataQ.p());
            case 24:
                return new p6v0(PodcastPoll.p(bArr).o());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                PodcastRating podcastRatingQ = PodcastRating.q(bArr);
                boolean zO2 = podcastRatingQ.o();
                u6v0 u6v0Var = new u6v0(podcastRatingQ.p().o());
                AverageRating averageRatingN = podcastRatingQ.n();
                return new v6v0(u6v0Var, zO2, new t6v0(averageRatingN.n(), averageRatingN.q(), averageRatingN.p()));
            case 26:
                return new f7v0(PodcastSegments.n(bArr).getArtistsList());
            case 27:
                PodcastSubscription podcastSubscriptionQ = PodcastSubscription.q(bArr);
                return new b9v0(podcastSubscriptionQ.o(), podcastSubscriptionQ.p(), n9v0.a[podcastSubscriptionQ.n().ordinal()] != 1 ? 1 : 2);
            case 28:
                h290<PodcastTopic> h290VarN2 = PodcastTopics.o(bArr).n();
                ArrayList arrayList12 = new ArrayList(q7h.U(h290VarN2, 10));
                for (PodcastTopic podcastTopic : h290VarN2) {
                    podcastTopic.getClass();
                    arrayList12.add(new q9v0(podcastTopic.getUri(), podcastTopic.getName()));
                }
                return new r9v0(arrayList12);
            default:
                h290<Release> h290VarN3 = PopularReleases.o(bArr).n();
                ArrayList arrayList13 = new ArrayList(q7h.U(h290VarN3, 10));
                for (Release release : h290VarN3) {
                    String uri3 = release.getUri();
                    List listN = release.n();
                    ArrayList arrayList14 = new ArrayList(q7h.U(listN, 10));
                    for (xv11 xv11Var : (AbstractList) listN) {
                        xv11Var.getClass();
                        int iOrdinal10 = xv11Var.ordinal();
                        yv11 yv11Var = yv11.a;
                        if (iOrdinal10 != 0) {
                            if (iOrdinal10 == 1) {
                                yv11Var = yv11.b;
                            } else if (iOrdinal10 == 2) {
                                yv11Var = yv11.c;
                            }
                        }
                        arrayList14.add(yv11Var);
                    }
                    arrayList13.add(new no11(uri3, arrayList14));
                }
                return new tdv0(arrayList13);
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 270;
            case 1:
                return 187;
            case 2:
                return 173;
            case 3:
                return 116;
            case 4:
                return 54;
            case 5:
                return 178;
            case 6:
                return 81;
            case 7:
                return 251;
            case 8:
                return 205;
            case 9:
                return 142;
            case 10:
                return 87;
            case 11:
                return 73;
            case 12:
                return 150;
            case 13:
                return 282;
            case 14:
                return 225;
            case 15:
                return 219;
            case 16:
                return 235;
            case 17:
                return 273;
            case 18:
                return 185;
            case 19:
                return 85;
            case 20:
                return 57;
            case 21:
                return 78;
            case 22:
                return 283;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return 107;
            case 24:
                return 29;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return 37;
            case 26:
                return 4;
            case 27:
                return 22;
            case 28:
                return 3;
            default:
                return 152;
        }
    }

    public final Class type() {
        switch (this.a) {
            case 0:
                return pn30.class;
            case 1:
                return tc60.class;
            case 2:
                return be60.class;
            case 3:
                return yo60.class;
            case 4:
                return z070.class;
            case 5:
                return jo70.class;
            case 6:
                return aw21.class;
            case 7:
                return h8c0.class;
            case 8:
                return dxc0.class;
            case 9:
                return n5d0.class;
            case 10:
                return xou0.class;
            case 11:
                return jvd0.class;
            case 12:
                return dde0.class;
            case 13:
                return muf0.class;
            case 14:
                return fuj0.class;
            case 15:
                return vuj0.class;
            case 16:
                return wuj0.class;
            case 17:
                return t8p0.class;
            case 18:
                return a7q0.class;
            case 19:
                return erq0.class;
            case 20:
                return nst0.class;
            case 21:
                return att0.class;
            case 22:
                return gwu0.class;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return n4v0.class;
            case 24:
                return p6v0.class;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return v6v0.class;
            case 26:
                return f7v0.class;
            case 27:
                return b9v0.class;
            case 28:
                return r9v0.class;
            default:
                return tdv0.class;
        }
    }
}
