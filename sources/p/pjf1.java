package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.contentagnostic.v2.ColorSet;
import com.spotify.contentagnostic.v2.ColorSetContrastOptions;
import com.spotify.contentagnostic.v2.Image;
import com.spotify.contentagnostic.v2.RgbaColor;
import com.spotify.contentagnostic.v2.Video;
import com.spotify.contentagnostic.v2.VisualIdentityTrait;
import com.spotify.extendedmetadata.extensions.artistmusicvideosimpl.proto.ArtistMusicVideos;
import com.spotify.extendedmetadata.extensions.trackdescriptorimpl.ExtensionDescriptor;
import com.spotify.extendedmetadata.extensions.trackdescriptorimpl.ExtensionDescriptorData;
import com.spotify.extendedmetadata.extensions.transcriptsearchimpl.proto.TranscriptSearch;
import com.spotify.extendedmetadata.extensions.venueartistspreviewimpl.proto.VenueArtistsPreview;
import com.spotify.extendedmetadata.extensions.venuelocationimpl.proto.VenueLocation;
import com.spotify.extendedmetadata.extensions.videoassociationsimpl.proto.VideoAssociation;
import com.spotify.extendedmetadata.extensions.videoassociationsimpl.proto.VideoAssociations;
import com.spotify.extendedmetadata.extensions.videothumbnailimpl.proto.PreviewResponse;
import com.spotify.extendedmetadata.extensions.watchfeedshowexplorerimpl.proto.EntityExplorerEntrypointResponse;
import com.spotify.extendedmetadata.extensions.watchfeedshowexplorerimpl.proto.ShowExplorerButtonComponent;
import com.spotify.extendedmetadata.extensions.watchfeedshowexplorerimpl.proto.ShowExplorerEntrypointResponse;
import com.spotify.home.v1.videosocialproofpoc.VideoSocialProofPocTrait;
import com.spotify.playlistmixing.extensions.mixtransition.proto.TransitionData;
import com.spotify.playlistmixing.extensions.tracksections.proto.Segment;
import com.spotify.playlistmixing.extensions.tracksections.proto.TrackSections;
import com.spotify.trackalternatives.v1.TrackAlternativeVersions;
import com.spotify.trackalternatives.v1.VersionGroup;
import com.spotify.trackalternatives.v1.VersionTrack;
import com.spotify.watchfeedextensions.api.v1.WatchFeedSeedItemTrait;
import com.spotify.watchfeedextensions.component.item.v1.EntityExplorerButtonComponent;
import com.spotify.watchfeedextensions.component.item.v1.InlineEntityExplorerRowComponent;
import com.spotify.watchfeedextensions.component.item.v1.PlaylistExplorerButtonComponent;
import com.spotify.watchfeedextensions.component.item.v1.PlaylistExplorerCardComponent;
import com.spotify.watchfeedextensions.component.model.v1.VideoFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import spotify.creators.v1.SectionItem;
import spotify.creators.v1.TrackCloud;
import spotify.identity.v3.UserProfileV2OuterClass$Image;
import spotify.identity.v3.UserProfileV2OuterClass$UserProfileV2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pjf1 implements ov00 {
    public final /* synthetic */ byte a;

    public static long c(RgbaColor rgbaColor) {
        return z4p1.f(rgbaColor.s(), rgbaColor.r(), rgbaColor.p(), rgbaColor.o());
    }

    public static w6l1 d(ColorSetContrastOptions colorSetContrastOptions) {
        return new w6l1(colorSetContrastOptions.w() ? e(colorSetContrastOptions.s()) : null, colorSetContrastOptions.u() ? e(colorSetContrastOptions.q()) : null, colorSetContrastOptions.v() ? e(colorSetContrastOptions.r()) : null, colorSetContrastOptions.t() ? new u7h(c(colorSetContrastOptions.p())) : null);
    }

    public static afx e(ColorSet colorSet) {
        int i = ihx.f;
        return ihx.d(colorSet.u() ? c(colorSet.o()) : u7h.d, colorSet.v() ? c(colorSet.p()) : u7h.d, colorSet.w() ? c(colorSet.r()) : u7h.d, colorSet.y() ? c(colorSet.t()) : u7h.d, colorSet.x() ? c(colorSet.s()) : u7h.d);
    }

    public final ez00 a(byte[] bArr) {
        int i;
        y6l1 a7l1Var;
        zal1 zal1Var;
        abl1 abl1Var;
        zal1 zal1Var2;
        zal1 zal1Var3;
        yal1 yal1Var;
        int i2;
        u7h u7hVar = null;
        switch (this.a) {
            case 0:
                h290<VersionGroup> h290VarN = TrackAlternativeVersions.o(bArr).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (VersionGroup versionGroup : h290VarN) {
                    versionGroup.getClass();
                    int iOrdinal = versionGroup.n().ordinal();
                    if (iOrdinal == 1) {
                        i = 2;
                    } else if (iOrdinal != 2) {
                        i = 4;
                        if (iOrdinal != 3) {
                            i = iOrdinal != 4 ? 1 : 5;
                        }
                    } else {
                        i = 3;
                    }
                    List<VersionTrack> tracksList = versionGroup.getTracksList();
                    ArrayList arrayList2 = new ArrayList(q7h.U(tracksList, 10));
                    for (VersionTrack versionTrack : tracksList) {
                        versionTrack.getClass();
                        arrayList2.add(new njf1(versionTrack.o(), versionTrack.n()));
                    }
                    arrayList.add(new mjf1(i, arrayList2));
                }
                return new ojf1(arrayList);
            case 1:
                List itemsList = TrackCloud.o(bArr).n().getItemsList();
                ArrayList arrayList3 = new ArrayList(q7h.U(itemsList, 10));
                Iterator it = itemsList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new ai51(((SectionItem) it.next()).getUri()));
                }
                return new ukf1(new eg51(arrayList3));
            case 2:
                h290<ExtensionDescriptor> h290VarN2 = ExtensionDescriptorData.o(bArr).n();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarN2, 10));
                for (ExtensionDescriptor extensionDescriptor : h290VarN2) {
                    arrayList4.add(new umf1(extensionDescriptor.o(), extensionDescriptor.getWeight(), extensionDescriptor.n()));
                }
                return new vmf1(arrayList4);
            case 3:
                h290 h290VarN3 = TrackSections.o(bArr).n();
                ArrayList arrayList5 = new ArrayList(q7h.U(h290VarN3, 10));
                Iterator it2 = h290VarN3.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new vzf1(((Segment) it2.next()).n()));
                }
                return new wzf1(arrayList5);
            case 4:
                TranscriptSearch transcriptSearchQ = TranscriptSearch.q(bArr);
                return new ldg1(transcriptSearchQ.n(), transcriptSearchQ.p() ? transcriptSearchQ.o() : null);
            case 5:
                TransitionData transitionDataS = TransitionData.s(bArr);
                String strQ = transitionDataS.q();
                String strO = transitionDataS.o();
                String playlistUri = transitionDataS.getPlaylistUri();
                String strR0 = f46.r0(transitionDataS.getItemId().t(), zdg1.t, 30);
                String strN = transitionDataS.n();
                String strP = transitionDataS.p();
                int iOrdinal2 = transitionDataS.r().ordinal();
                return new mig1(strQ, strO, playlistUri, strR0, iOrdinal2 != 1 ? iOrdinal2 != 2 ? 1 : 3 : 2, strN, strP);
            case 6:
                ArtistMusicVideos artistMusicVideosQ = ArtistMusicVideos.q(bArr);
                return new ljh1(artistMusicVideosQ.p(), artistMusicVideosQ.o(), artistMusicVideosQ.n());
            case 7:
                UserProfileV2OuterClass$UserProfileV2 userProfileV2OuterClass$UserProfileV2T = UserProfileV2OuterClass$UserProfileV2.t(bArr);
                String value = userProfileV2OuterClass$UserProfileV2T.r().getValue();
                String value2 = userProfileV2OuterClass$UserProfileV2T.p().getValue();
                String value3 = userProfileV2OuterClass$UserProfileV2T.s() ? userProfileV2OuterClass$UserProfileV2T.q().getValue() : null;
                String value4 = userProfileV2OuterClass$UserProfileV2T.n().getValue();
                h290<UserProfileV2OuterClass$Image> h290VarO = userProfileV2OuterClass$UserProfileV2T.o();
                ArrayList arrayList6 = new ArrayList(q7h.U(h290VarO, 10));
                for (UserProfileV2OuterClass$Image userProfileV2OuterClass$Image : h290VarO) {
                    arrayList6.add(new yp70(userProfileV2OuterClass$Image.getUrl(), userProfileV2OuterClass$Image.o(), userProfileV2OuterClass$Image.n()));
                }
                return new zei1(value, value2, value3, value4, arrayList6, userProfileV2OuterClass$UserProfileV2T.hasColor() ? Integer.valueOf(userProfileV2OuterClass$UserProfileV2T.getColor().getValue()) : null);
            case 8:
                return new avi1(VenueArtistsPreview.o(bArr).n());
            case 9:
                VenueLocation venueLocationW = VenueLocation.w(bArr);
                String strN2 = venueLocationW.n();
                strN2.getClass();
                String str = strN2.length() > 0 ? strN2 : null;
                String strO2 = venueLocationW.o();
                strO2.getClass();
                String str2 = strO2.length() > 0 ? strO2 : null;
                String strP2 = venueLocationW.p();
                strP2.getClass();
                String str3 = strP2.length() > 0 ? strP2 : null;
                String strT = venueLocationW.t();
                strT.getClass();
                String str4 = strT.length() > 0 ? strT : null;
                String strU = venueLocationW.u();
                strU.getClass();
                String str5 = strU.length() > 0 ? strU : null;
                double dQ = venueLocationW.q();
                double dR = venueLocationW.r();
                String strS = venueLocationW.s();
                strS.getClass();
                String str6 = strS.length() > 0 ? strS : null;
                String strV = venueLocationW.v();
                strV.getClass();
                return new ayi1(str, str2, str3, str4, str5, dQ, dR, str6, strV.length() > 0 ? strV : null);
            case 10:
                h290 h290VarN4 = VideoAssociations.o(bArr).n();
                ArrayList arrayList7 = new ArrayList(q7h.U(h290VarN4, 10));
                Iterator it3 = h290VarN4.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(new kh7(((VideoAssociation) it3.next()).n()));
                }
                return new ldj1(arrayList7);
            case 11:
                return new e2k1(VideoSocialProofPocTrait.o(bArr).n());
            case 12:
                byte[] bArrT = PreviewResponse.o(bArr).n().o().o().t();
                bArrT.getClass();
                return new g3k1(bArrT.length != 0 ? y6b1.i(zno1.z(bArrT)).toString() : null);
            case 13:
                VisualIdentityTrait visualIdentityTraitY = VisualIdentityTrait.y(bArr);
                mq70 mq70VarY = z1p1.y(visualIdentityTraitY.r());
                Image imageQ = visualIdentityTraitY.q();
                if (!visualIdentityTraitY.v()) {
                    imageQ = null;
                }
                mq70 mq70VarY2 = imageQ != null ? z1p1.y(imageQ) : null;
                Video videoP = visualIdentityTraitY.p();
                if (!visualIdentityTraitY.u()) {
                    videoP = null;
                }
                z6j1 z6j1VarY = videoP != null ? l3p1.y(videoP) : null;
                pp70 pp70VarX = z1p1.x(visualIdentityTraitY.o());
                Image imageT = visualIdentityTraitY.t();
                if (!visualIdentityTraitY.x()) {
                    imageT = null;
                }
                mq70 mq70VarY3 = imageT != null ? z1p1.y(imageT) : null;
                Image imageS = visualIdentityTraitY.s();
                if (!visualIdentityTraitY.w()) {
                    imageS = null;
                }
                return new xkk1(mq70VarY, mq70VarY2, z6j1VarY, pp70VarX, mq70VarY3, imageS != null ? z1p1.y(imageS) : null);
            case 14:
                EntityExplorerEntrypointResponse entityExplorerEntrypointResponseX = EntityExplorerEntrypointResponse.x(bArr);
                if (entityExplorerEntrypointResponseX.s()) {
                    EntityExplorerButtonComponent entityExplorerButtonComponentN = entityExplorerEntrypointResponseX.n();
                    a7l1Var = new y6l1(entityExplorerButtonComponentN.s(), entityExplorerButtonComponentN.n(), entityExplorerButtonComponentN.q(), new e7l1(entityExplorerButtonComponentN.t().p(), entityExplorerButtonComponentN.t().o(), entityExplorerButtonComponentN.t().getUri(), xvj1.z(entityExplorerButtonComponentN.t().q().name())), new x6l1(entityExplorerButtonComponentN.r().getUrl(), entityExplorerButtonComponentN.r().o()), entityExplorerButtonComponentN.getTitle(), entityExplorerButtonComponentN.getSubtitle(), entityExplorerButtonComponentN.u() ? d(entityExplorerButtonComponentN.p()) : null);
                } else if (entityExplorerEntrypointResponseX.v()) {
                    PlaylistExplorerButtonComponent playlistExplorerButtonComponentQ = entityExplorerEntrypointResponseX.q();
                    a7l1Var = new b7l1(playlistExplorerButtonComponentQ.getTitle(), playlistExplorerButtonComponentQ.n(), playlistExplorerButtonComponentQ.p());
                } else if (entityExplorerEntrypointResponseX.w()) {
                    PlaylistExplorerCardComponent playlistExplorerCardComponentR = entityExplorerEntrypointResponseX.r();
                    String title = playlistExplorerCardComponentR.getTitle();
                    String subtitle = playlistExplorerCardComponentR.getSubtitle();
                    String strN3 = playlistExplorerCardComponentR.n();
                    h290<com.spotify.watchfeedextensions.component.model.v1.Image> h290VarP = playlistExplorerCardComponentR.p();
                    ArrayList arrayList8 = new ArrayList(q7h.U(h290VarP, 10));
                    for (com.spotify.watchfeedextensions.component.model.v1.Image image : h290VarP) {
                        arrayList8.add(new x6l1(image.getUrl(), image.o()));
                    }
                    a7l1Var = new c7l1(title, subtitle, strN3, arrayList8, new e7l1(playlistExplorerCardComponentR.r().getUri(), xvj1.z(playlistExplorerCardComponentR.r().q().name())), playlistExplorerCardComponentR.q());
                } else if (entityExplorerEntrypointResponseX.t()) {
                    a7l1Var = new z6l1(entityExplorerEntrypointResponseX.o().o());
                } else if (entityExplorerEntrypointResponseX.u()) {
                    InlineEntityExplorerRowComponent inlineEntityExplorerRowComponentP = entityExplorerEntrypointResponseX.p();
                    a7l1Var = new a7l1(inlineEntityExplorerRowComponentP.q(), new e7l1(inlineEntityExplorerRowComponentP.s().p(), inlineEntityExplorerRowComponentP.s().o(), inlineEntityExplorerRowComponentP.s().getUri(), xvj1.z(inlineEntityExplorerRowComponentP.s().q().name())), new x6l1(inlineEntityExplorerRowComponentP.r().getUrl(), inlineEntityExplorerRowComponentP.r().o()), inlineEntityExplorerRowComponentP.n(), inlineEntityExplorerRowComponentP.getTitle(), inlineEntityExplorerRowComponentP.getSubtitle(), inlineEntityExplorerRowComponentP.t() ? d(inlineEntityExplorerRowComponentP.p()) : null);
                } else {
                    a7l1Var = d7l1.d;
                }
                return new f7l1(a7l1Var);
            case 15:
                WatchFeedSeedItemTrait watchFeedSeedItemTraitB = WatchFeedSeedItemTrait.B(bArr);
                String uri = watchFeedSeedItemTraitB.getUri();
                String title2 = watchFeedSeedItemTraitB.getTitle();
                if (watchFeedSeedItemTraitB.A()) {
                    com.spotify.watchfeedextensions.component.model.v1.Image imageU = watchFeedSeedItemTraitB.u();
                    zal1Var = new zal1(imageU.getUrl(), imageU.o());
                } else {
                    zal1Var = null;
                }
                if (watchFeedSeedItemTraitB.z()) {
                    VideoFile videoFileT = watchFeedSeedItemTraitB.t();
                    String uri2 = videoFileT.getUri();
                    String strName = videoFileT.q().name();
                    if (strName != null) {
                        if (strName.equals("URL")) {
                            i2 = 1;
                        } else if (strName.equals("MANIFEST_ID")) {
                            i2 = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.extendedmetadata.extensions.watchfeedseeditemtrait.WatchFeedSeedItemTrait.VideoFileType.".concat(strName));
                        }
                        abl1Var = new abl1(videoFileT.p(), videoFileT.o(), uri2, i2);
                    } else {
                        bhn0.i("Name is null");
                    }
                    i2 = 0;
                    abl1Var = new abl1(videoFileT.p(), videoFileT.o(), uri2, i2);
                } else {
                    abl1Var = null;
                }
                if (watchFeedSeedItemTraitB.w()) {
                    com.spotify.watchfeedextensions.component.model.v1.Image imageP = watchFeedSeedItemTraitB.p();
                    zal1Var2 = new zal1(imageP.getUrl(), imageP.o());
                } else {
                    zal1Var2 = null;
                }
                Double dValueOf = watchFeedSeedItemTraitB.y() ? Double.valueOf(watchFeedSeedItemTraitB.s()) : null;
                String strN4 = watchFeedSeedItemTraitB.n();
                if (watchFeedSeedItemTraitB.x()) {
                    com.spotify.watchfeedextensions.component.model.v1.Image imageR = watchFeedSeedItemTraitB.r();
                    zal1Var3 = new zal1(imageR.getUrl(), imageR.o());
                } else {
                    zal1Var3 = null;
                }
                if (watchFeedSeedItemTraitB.v()) {
                    ColorSetContrastOptions colorSetContrastOptionsO = watchFeedSeedItemTraitB.o();
                    afx afxVarI = colorSetContrastOptionsO.w() ? bin.I(colorSetContrastOptionsO.s()) : null;
                    afx afxVarI2 = colorSetContrastOptionsO.u() ? bin.I(colorSetContrastOptionsO.q()) : null;
                    afx afxVarI3 = colorSetContrastOptionsO.v() ? bin.I(colorSetContrastOptionsO.r()) : null;
                    if (colorSetContrastOptionsO.t()) {
                        u7hVar = new u7h(bin.H(colorSetContrastOptionsO.p()));
                    }
                    yal1Var = new yal1(afxVarI, afxVarI2, afxVarI3, u7hVar);
                } else {
                    watchFeedSeedItemTraitB = watchFeedSeedItemTraitB;
                    yal1Var = null;
                }
                return new bbl1(uri, title2, zal1Var, abl1Var, zal1Var2, dValueOf, strN4, zal1Var3, yal1Var, watchFeedSeedItemTraitB.q());
            default:
                try {
                    ShowExplorerButtonComponent showExplorerButtonComponentN = ShowExplorerEntrypointResponse.o(bArr).n();
                    return new fbl1(new dbl1(showExplorerButtonComponentN.getTitle(), showExplorerButtonComponentN.n(), showExplorerButtonComponentN.p()));
                } catch (InvalidProtocolBufferException unused) {
                    return new fbl1(ebl1.e);
                }
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 250;
            case 1:
                return 175;
            case 2:
                return 6;
            case 3:
                return 261;
            case 4:
                return 231;
            case 5:
                return 244;
            case 6:
                return 213;
            case 7:
                return 215;
            case 8:
                return 224;
            case 9:
                return 230;
            case 10:
                return 99;
            case 11:
                return 208;
            case 12:
                return 177;
            case 13:
                return 179;
            case 14:
                return 114;
            case 15:
                return 226;
            default:
                return 93;
        }
    }

    public final Class type() {
        switch (this.a) {
            case 0:
                return ojf1.class;
            case 1:
                return ukf1.class;
            case 2:
                return vmf1.class;
            case 3:
                return wzf1.class;
            case 4:
                return ldg1.class;
            case 5:
                return mig1.class;
            case 6:
                return ljh1.class;
            case 7:
                return zei1.class;
            case 8:
                return avi1.class;
            case 9:
                return ayi1.class;
            case 10:
                return ldj1.class;
            case 11:
                return e2k1.class;
            case 12:
                return g3k1.class;
            case 13:
                return xkk1.class;
            case 14:
                return f7l1.class;
            case 15:
                return bbl1.class;
            default:
                return fbl1.class;
        }
    }
}
