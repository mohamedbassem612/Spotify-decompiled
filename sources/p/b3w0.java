package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import com.google.protobuf.Duration;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import com.spotify.artistpolicy.extensions.speedability.proto.Speedability;
import com.spotify.cardconfig.v1.proto.CardConfigProto;
import com.spotify.contentagnostic.PreviewTrait;
import com.spotify.contentagnostic.v2.PreviewOffsets;
import com.spotify.contentagnostic.v2.PreviewPlaybackTrait;
import com.spotify.contentagnostic.v2.PublishingMetadataTrait;
import com.spotify.extendedmetadata.extensions.previewcardtrait.proto.ContentParent;
import com.spotify.extendedmetadata.extensions.previewcardtrait.proto.DescriptorTag;
import com.spotify.extendedmetadata.extensions.previewcardtrait.proto.Labels;
import com.spotify.extendedmetadata.extensions.previewcardtrait.proto.PreviewCardTrait;
import com.spotify.extendedmetadata.extensions.privacytraitimpl.PrivacyTrait;
import com.spotify.extendedmetadata.extensions.promov1trait.proto.Creator;
import com.spotify.extendedmetadata.extensions.promov1trait.proto.Label;
import com.spotify.extendedmetadata.extensions.promov1trait.proto.PromoV1Trait;
import com.spotify.extendedmetadata.extensions.promov3trait.proto.PromoV3Trait;
import com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto.GatedRelation;
import com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto.RelatedEntities;
import com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto.RelatedEntity;
import com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto.Relation;
import com.spotify.extendedmetadata.extensions.relatedentitiesimpl.proto.ValueProp;
import com.spotify.extendedmetadata.extensions.reorderingtraitimpl.ReorderingTrait;
import com.spotify.extendedmetadata.extensions.rootlistabilityimpl.RootlistabilityTrait;
import com.spotify.extendedmetadata.extensions.shortcutscardtrait.proto.ShortcutsCardTrait;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.AccountLinkPrompt;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.AudiobookPriceOuterClass;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.AudiobookPriceOuterClass$Price;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.BasicExplanation;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.CheckoutOnWebOverlayExplanation;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.ConsumptionCappedExplanation;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.DelegateToUpsellExplanation;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.EngagementExplanation;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.ShowAccess;
import com.spotify.extendedmetadata.extensions.showaccessimpl.proto.UpsellLinkExplanation;
import com.spotify.extendedmetadata.extensions.simplecardtrait.proto.SimpleCardTrait;
import com.spotify.extendedmetadata.extensions.snapshotsharingimpl.proto.ResolvedShareProto$ResolvedShare;
import com.spotify.metadata.classic.proto.Metadata;
import com.spotify.playlistmixing.extensions.mixthreebandwaveforms.proto.ThreeBandWaveforms;
import com.spotify.prereleases.extension.Agent;
import com.spotify.prereleases.extension.Copyright;
import com.spotify.prereleases.extension.Image;
import com.spotify.prereleases.extension.Prerelease;
import com.spotify.share.restrictions.proto.ShareRestrictionsProto$ShareDestination;
import com.spotify.share.restrictions.proto.ShareRestrictionsProto$ShareFormatRestriction;
import com.spotify.share.restrictions.proto.ShareRestrictionsProto$ShareRestrictions;
import com.spotify.songdna.artistfacts.v1.ArtistFacts;
import com.spotify.songdna.credits.v1.Contributor;
import com.spotify.songdna.credits.v1.Credits;
import com.spotify.songdna.credits.v1.Role;
import com.spotify.songdna.credits.v1.RoleGroup;
import com.spotify.songdna.credits.v1.Source;
import com.spotify.songdnaeligibility.SongDnaEligibility;
import com.spotify.sponsoredplaylist.v1.extension.Sponsorship;
import com.spotify.traits.share.proto.ShareTraitProto$ShareOption;
import com.spotify.traits.share.proto.ShareTraitProto$ShareTrait;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import spotify.artistsectionprovider.v1.RecommendedPlaylist;
import spotify.artistsectionprovider.v1.RecommendedPlaylists;
import spotify.artistsectionprovider.v1.RelatedReleases;
import spotify.artistsectionprovider.v1.Release;
import spotify.creators.v1.relatedcreators.RelatedCreators;
import spotify.creators.v1.relatedcreators.SectionItem;
import spotify.creators.v1.topplayables.TopPlayables;
import spotify.speechless.v1.ShareCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b3w0 implements ov00 {
    public final /* synthetic */ byte a;

    public /* synthetic */ b3w0(byte b) {
        this.a = b;
    }

    public static njw0 c(PreviewPlaybackTrait previewPlaybackTrait) {
        String str;
        int iP = previewPlaybackTrait.p();
        int i = iP == 0 ? -1 : qjw0.a[l1d.C(iP)];
        if (i == 1) {
            return new ljw0(jto1.B(previewPlaybackTrait.o().o()));
        }
        ojw0 ojw0Var = null;
        if (i == 2) {
            z6j1 z6j1VarY = l3p1.y(previewPlaybackTrait.r().o());
            PreviewOffsets previewOffsetsP = previewPlaybackTrait.r().p();
            if (previewOffsetsP != null) {
                ytw0 ytw0Var = jfv.b;
                long jP = previewOffsetsP.p().p();
                ngv ngvVar = ngv.e;
                ojw0Var = new ojw0(fdg1.l0(jP, ngvVar), fdg1.l0(previewOffsetsP.o().p(), ngvVar));
            }
            return new mjw0(z6j1VarY, ojw0Var);
        }
        int iP2 = previewPlaybackTrait.p();
        if (iP2 == 1) {
            str = "VIDEO";
        } else if (iP2 != 2) {
            str = iP2 != 3 ? "null" : "MEDIA_NOT_SET";
        } else {
            str = "AUDIO";
        }
        hhg1.n("Unknown media type: ".concat(str));
        return null;
    }

    private final ez00 d(byte[] bArr) {
        j1b1 k1b1Var;
        Sponsorship sponsorshipP = Sponsorship.p(bArr);
        int iO = sponsorshipP.o();
        int i = iO == 0 ? -1 : t1b1.a[l1d.C(iO)];
        if (i == 1) {
            k1b1Var = new k1b1(sponsorshipP.n().q(), sponsorshipP.n().o(), sponsorshipP.n().p());
        } else if (i != 2) {
            k1b1Var = null;
            if (i != 3) {
                eg.o();
                return null;
            }
        } else {
            k1b1Var = j1b1.a;
        }
        return new m1b1(k1b1Var);
    }

    private final ez00 e(byte[] bArr) {
        ThreeBandWaveforms threeBandWaveformsS = ThreeBandWaveforms.s(bArr);
        int iQ = threeBandWaveformsS.q();
        int iR = threeBandWaveformsS.r();
        b290<Integer> b290VarO = threeBandWaveformsS.o();
        ArrayList arrayList = new ArrayList(q7h.U(b290VarO, 10));
        for (Integer num : b290VarO) {
            num.getClass();
            arrayList.add(new p3h1((byte) yoi1.p(num.intValue(), 0, 255)));
        }
        b290<Integer> b290VarP = threeBandWaveformsS.p();
        ArrayList arrayList2 = new ArrayList(q7h.U(b290VarP, 10));
        for (Integer num2 : b290VarP) {
            num2.getClass();
            arrayList2.add(new p3h1((byte) yoi1.p(num2.intValue(), 0, 255)));
        }
        b290<Integer> b290VarN = threeBandWaveformsS.n();
        ArrayList arrayList3 = new ArrayList(q7h.U(b290VarN, 10));
        for (Integer num3 : b290VarN) {
            num3.getClass();
            arrayList3.add(new p3h1((byte) yoi1.p(num3.intValue(), 0, 255)));
        }
        return new zge1(iQ, iR, arrayList, arrayList2, arrayList3);
    }

    public static j281 f(AudiobookPriceOuterClass.AudiobookPrice audiobookPrice) {
        AudiobookPriceOuterClass$Price audiobookPriceOuterClass$PriceQ = audiobookPrice.q();
        s281 s281Var = new s281(audiobookPriceOuterClass$PriceQ.o(), audiobookPriceOuterClass$PriceQ.q(), audiobookPriceOuterClass$PriceQ.n());
        AudiobookPriceOuterClass$Price audiobookPriceOuterClass$PriceP = audiobookPrice.p();
        return new j281(s281Var, new s281(audiobookPriceOuterClass$PriceP.o(), audiobookPriceOuterClass$PriceP.q(), audiobookPriceOuterClass$PriceP.n()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:176:0x0532  */
    /* JADX WARN: Code duplicated, block: B:180:0x055e  */
    /* JADX WARN: Code duplicated, block: B:184:0x057d  */
    /* JADX WARN: Code duplicated, block: B:186:0x058d  */
    /* JADX WARN: Code duplicated, block: B:193:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:195:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:198:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:202:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:203:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:207:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:210:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:211:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:215:0x0622  */
    /* JADX WARN: Code duplicated, block: B:218:0x062d  */
    /* JADX WARN: Code duplicated, block: B:221:0x0639  */
    /* JADX WARN: Code duplicated, block: B:222:0x063c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0669  */
    /* JADX WARN: Code duplicated, block: B:226:0x066c  */
    /* JADX WARN: Code duplicated, block: B:229:0x067c  */
    /* JADX WARN: Code duplicated, block: B:230:0x067f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0689  */
    /* JADX WARN: Code duplicated, block: B:234:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:237:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:239:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:243:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:244:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:246:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:254:0x0707  */
    /* JADX WARN: Code duplicated, block: B:255:0x0724  */
    /* JADX WARN: Code duplicated, block: B:492:0x0d92  */
    /* JADX WARN: Code duplicated, block: B:501:0x0da9  */
    /* JADX WARN: Code duplicated, block: B:502:0x0dc1  */
    /* JADX WARN: Code duplicated, block: B:505:0x0dd2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:506:0x0dd4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:507:0x0dd6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:508:0x0dd8  */
    /* JADX WARN: Code duplicated, block: B:509:0x0ddb  */
    /* JADX WARN: Code duplicated, block: B:510:0x0de0  */
    /* JADX WARN: Code duplicated, block: B:511:0x0de3  */
    /* JADX WARN: Code duplicated, block: B:546:0x0596 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0592 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final ez00 a(byte[] bArr) throws InvalidProtocolBufferException {
        int i;
        int i2;
        tyl tylVar;
        int iOrdinal;
        int i3;
        int i4;
        ArrayList arrayList;
        Long lValueOf;
        uoy0 voy0Var;
        xn11 d840Var;
        ysi1 ysi1Var;
        xn11 sq50Var;
        pan0 pan0Var;
        y771 y771Var;
        e6p1 k281Var;
        int i5;
        e6p1 n281Var;
        k281 k281Var2;
        boolean zW;
        ArrayList arrayList2;
        Iterator it;
        boolean zHasNext;
        v281 v281Var;
        ArrayList arrayList3;
        Iterator it2;
        String strQ;
        sk70 sk70VarP;
        int[] iArr;
        int i6;
        u281 u281Var;
        u281 u281Var2;
        q281 q281Var;
        q281 q281Var2;
        t281 t281Var;
        t281 t281Var2;
        byte[] bArrT;
        byte[] bArr2;
        r281 r281Var;
        EngagementExplanation engagementExplanationT;
        AudiobookPriceOuterClass.AudiobookPrice audiobookPriceW;
        j281 j281VarF;
        j281 j281Var;
        CheckoutOnWebOverlayExplanation checkoutOnWebOverlayExplanationP;
        AudiobookPriceOuterClass.AudiobookPrice audiobookPriceR;
        int iOrdinal2;
        v281 v281Var2;
        int iOrdinal3;
        int i7;
        int i8;
        ell ellVar;
        h4p1 bw9Var;
        d5r d5rVar;
        Date date;
        int i9 = 5;
        int i10 = 4;
        int i11 = 2;
        switch (this.a) {
            case 0:
                Prerelease prereleaseP = Prerelease.p(bArr);
                String uri = prereleaseP.getUri();
                String uri2 = prereleaseP.n().getUri();
                String name = prereleaseP.n().getName();
                String strQ2 = prereleaseP.n().q();
                h290<Image> h290VarN = prereleaseP.n().n();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarN, 10));
                for (Image image : h290VarN) {
                    arrayList4.add(new nq70(Integer.valueOf(image.p()), Integer.valueOf(image.n()), image.getUri(), image.o()));
                }
                List<Agent> agentsList = prereleaseP.n().getAgentsList();
                ArrayList arrayList5 = new ArrayList(q7h.U(agentsList, 10));
                for (Agent agent : agentsList) {
                    arrayList5.add(new on2(agent.getUri(), agent.getName()));
                }
                List<Copyright> copyrightList = prereleaseP.n().getCopyrightList();
                ArrayList arrayList6 = new ArrayList(q7h.U(copyrightList, 10));
                for (Copyright copyright : copyrightList) {
                    String strN = copyright.n();
                    int i12 = c3w0.a[copyright.o().ordinal()];
                    arrayList6.add(new n4n(i12 != 1 ? i12 != 2 ? 1 : 3 : 2, strN));
                }
                return new myv0(uri, prereleaseP.o().q(), new jby(uri2, name, strQ2, arrayList4, arrayList5, arrayList6, Boolean.valueOf(prereleaseP.n().p())));
            case 1:
                PreviewCardTrait previewCardTraitC = PreviewCardTrait.C(bArr);
                String title = previewCardTraitC.getTitle();
                String strP = previewCardTraitC.p();
                String description = previewCardTraitC.getDescription();
                String entityUri = previewCardTraitC.getEntityUri();
                String strV = previewCardTraitC.v();
                String strU = previewCardTraitC.u();
                String strR = previewCardTraitC.r();
                Duration duration = previewCardTraitC.getDuration();
                Timestamp timestampY = previewCardTraitC.y();
                long jQ = (timestampY.q() * 1000) + ((long) (timestampY.p() / 1000000));
                String strN2 = previewCardTraitC.n();
                String strA = previewCardTraitC.A();
                int iOrdinal4 = previewCardTraitC.x().ordinal();
                if (iOrdinal4 == 0) {
                    i = 1;
                } else if (iOrdinal4 == 1) {
                    i = 2;
                } else {
                    if (iOrdinal4 != 2) {
                        if (iOrdinal4 == 3) {
                            i = 4;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    i = 3;
                }
                Labels labelsT = previewCardTraitC.t();
                gab0 gab0Var = new gab0(labelsT.p(), labelsT.o());
                h290<DescriptorTag> h290VarQ = previewCardTraitC.q();
                ArrayList arrayList7 = new ArrayList(q7h.U(h290VarQ, 10));
                for (DescriptorTag descriptorTag : h290VarQ) {
                    descriptorTag.getClass();
                    arrayList7.add(new hht(descriptorTag.getName()));
                }
                int iW = previewCardTraitC.w();
                int iOrdinal5 = previewCardTraitC.s().ordinal();
                if (iOrdinal5 == 0) {
                    i2 = 1;
                    aj90 aj90Var = new aj90(iW, i2);
                    if (previewCardTraitC.B()) {
                        ContentParent contentParentO = previewCardTraitC.o();
                        tylVar = new tyl(contentParentO.getName(), contentParentO.getUri(), contentParentO.getImageUrl());
                    } else {
                        tylVar = new tyl("", "", "");
                    }
                    iOrdinal = previewCardTraitC.z().ordinal();
                    if (iOrdinal == 0) {
                        i3 = 1;
                    } else if (iOrdinal != 1) {
                        i3 = 2;
                    } else if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            eg.o();
                        }
                        i3 = 1;
                    } else {
                        i3 = 3;
                    }
                    return new nbw0(title, strP, description, entityUri, strV, strU, strR, duration, jQ, strN2, strA, i, gab0Var, arrayList7, aj90Var, tylVar, i3);
                }
                if (iOrdinal5 == 1) {
                    i2 = 2;
                } else if (iOrdinal5 != 2) {
                    if (iOrdinal5 == 3) {
                        i4 = 4;
                    } else if (iOrdinal5 == 4) {
                        i4 = 5;
                    } else if (iOrdinal5 == 5) {
                        i2 = 1;
                    } else {
                        eg.o();
                    }
                    i2 = i4;
                } else {
                    i2 = 3;
                }
                aj90 aj90Var2 = new aj90(iW, i2);
                if (previewCardTraitC.B()) {
                    ContentParent contentParentO2 = previewCardTraitC.o();
                    tylVar = new tyl(contentParentO2.getName(), contentParentO2.getUri(), contentParentO2.getImageUrl());
                } else {
                    tylVar = new tyl("", "", "");
                }
                iOrdinal = previewCardTraitC.z().ordinal();
                if (iOrdinal == 0) {
                    i3 = 1;
                } else if (iOrdinal != 1) {
                    i3 = 2;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        eg.o();
                    }
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                return new nbw0(title, strP, description, entityUri, strV, strU, strR, duration, jQ, strN2, strA, i, gab0Var, arrayList7, aj90Var2, tylVar, i3);
                return null;
            case 2:
                PreviewPlaybackTrait previewPlaybackTraitS = PreviewPlaybackTrait.s(bArr);
                try {
                    return new pjw0(previewPlaybackTraitS.hasUri() ? previewPlaybackTraitS.getUri() : null, c(previewPlaybackTraitS), previewPlaybackTraitS.q());
                } catch (Exception e) {
                    throw new InvalidProtocolBufferException(e.getMessage());
                }
            case 3:
                return new xlw0(PreviewTrait.o(bArr).getUri());
            case 4:
                return new iow0(PrivacyTrait.o(bArr).n());
            case 5:
                PromoV1Trait promoV1TraitZ = PromoV1Trait.z(bArr);
                String title2 = promoV1TraitZ.getTitle();
                String subtitle = promoV1TraitZ.getSubtitle();
                String strT = promoV1TraitZ.t();
                String imageUrl = promoV1TraitZ.getImageUrl();
                String strO = promoV1TraitZ.o();
                h290 h290VarS = promoV1TraitZ.s();
                ArrayList arrayList8 = z6x.a;
                if (h290VarS != null) {
                    ArrayList arrayList9 = new ArrayList(q7h.U(h290VarS, 10));
                    Iterator it3 = h290VarS.iterator();
                    while (it3.hasNext()) {
                        arrayList9.add(new s9b0(((Label) it3.next()).getName()));
                    }
                    arrayList = arrayList9;
                } else {
                    arrayList = arrayList8;
                }
                if (promoV1TraitZ.y()) {
                    Timestamp timestampX = promoV1TraitZ.x();
                    lValueOf = Long.valueOf((timestampX.q() * 1000) + ((long) (timestampX.p() / 1000000)));
                } else {
                    lValueOf = null;
                }
                String strN3 = promoV1TraitZ.n();
                h290 h290VarP = promoV1TraitZ.p();
                if (h290VarP != null) {
                    arrayList8 = new ArrayList(q7h.U(h290VarP, 10));
                    Iterator it4 = h290VarP.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(new zwn(((Creator) it4.next()).getName()));
                    }
                }
                ArrayList arrayList10 = arrayList8;
                String strV2 = promoV1TraitZ.v();
                String description2 = promoV1TraitZ.getDescription();
                String str = description2 == null ? "" : description2;
                boolean z = promoV1TraitZ.w() == d131.IS_EXPLICIT;
                int iU = promoV1TraitZ.u();
                String strR2 = promoV1TraitZ.r();
                return new pnx0(title2, subtitle, strT, imageUrl, strO, arrayList, lValueOf, strN3, arrayList10, strV2, str, z, iU, strR2 == null ? "" : strR2, promoV1TraitZ.q());
            case 6:
                PromoV3Trait promoV3TraitW = PromoV3Trait.w(bArr);
                String title3 = promoV3TraitW.getTitle();
                String subtitle2 = promoV3TraitW.getSubtitle();
                String strQ3 = promoV3TraitW.q();
                String strS = promoV3TraitW.s();
                String strO2 = promoV3TraitW.o();
                String strR3 = promoV3TraitW.r();
                strR3.getClass();
                String str2 = !ihc1.y0(strR3) ? strR3 : null;
                String strV3 = promoV3TraitW.v();
                String strT2 = promoV3TraitW.t();
                strT2.getClass();
                return new oox0(title3, subtitle2, strQ3, strS, strO2, str2, strV3, !ihc1.y0(strT2) ? strT2 : null, new nox0(promoV3TraitW.n().p(), promoV3TraitW.n().o()), new nox0(promoV3TraitW.u().p(), promoV3TraitW.u().o()), promoV3TraitW.p());
            case 7:
                PublishingMetadataTrait publishingMetadataTraitR = PublishingMetadataTrait.r(bArr);
                publishingMetadataTraitR.getClass();
                int iP = publishingMetadataTraitR.p().p();
                int i13 = iP == 0 ? -1 : apy0.a[l1d.C(iP)];
                if (i13 == 1) {
                    voy0Var = new voy0(publishingMetadataTraitR.p().q().getYear());
                } else if (i13 != 2) {
                    voy0Var = i13 != 3 ? uoy0.a : new xoy0(publishingMetadataTraitR.p().s().getYear(), publishingMetadataTraitR.p().s().q(), publishingMetadataTraitR.p().s().o());
                } else {
                    voy0Var = new woy0(publishingMetadataTraitR.p().r().getYear(), publishingMetadataTraitR.p().r().p());
                }
                return new zoy0(publishingMetadataTraitR.o(), new jxp0(voy0Var, (byte) 25), publishingMetadataTraitR.q().q());
            case 8:
                List urisList = RecommendedPlaylists.n(bArr).getUrisList();
                ArrayList arrayList11 = new ArrayList(q7h.U(urisList, 10));
                Iterator it5 = urisList.iterator();
                while (it5.hasNext()) {
                    arrayList11.add(((RecommendedPlaylist) it5.next()).getUri());
                }
                return new s211(arrayList11);
            case 9:
                List itemsList = RelatedCreators.o(bArr).n().getItemsList();
                ArrayList arrayList12 = new ArrayList(q7h.U(itemsList, 10));
                Iterator it6 = itemsList.iterator();
                while (it6.hasNext()) {
                    arrayList12.add(new yh51(((SectionItem) it6.next()).getUri()));
                }
                return new kl11(new cg51(arrayList12));
            case 10:
                h290<RelatedEntity> h290VarN2 = RelatedEntities.o(bArr).n();
                ArrayList arrayList13 = new ArrayList(q7h.U(h290VarN2, 10));
                for (RelatedEntity relatedEntity : h290VarN2) {
                    h290<Relation> h290VarO = relatedEntity.o();
                    ArrayList arrayList14 = new ArrayList(q7h.U(h290VarO, 10));
                    for (Relation relation : h290VarO) {
                        int iQ = relation.q();
                        int i14 = iQ == 0 ? -1 : ml11.a[l1d.C(iQ)];
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 == 3) {
                                    d840Var = c541.a;
                                } else {
                                    if (i14 != i10) {
                                        if (i14 == i9) {
                                            d290<oan0> d290VarO = relation.p().o();
                                            ArrayList arrayList15 = new ArrayList(q7h.U(d290VarO, 10));
                                            for (oan0 oan0Var : d290VarO) {
                                                int i15 = oan0Var == null ? -1 : nl11.a[oan0Var.ordinal()];
                                                if (i15 == 1) {
                                                    pan0Var = pan0.b;
                                                } else if (i15 == 2) {
                                                    pan0Var = pan0.a;
                                                } else if (i15 == 3) {
                                                    pan0Var = pan0.c;
                                                } else {
                                                    nkx0.q(oan0Var, "Unknown MusicVideoRelatedAssociationRelationType: ");
                                                }
                                                arrayList15.add(pan0Var);
                                            }
                                            d840Var = new nan0(arrayList15);
                                        } else {
                                            nkx0.q(relation, "Unknown relation type: ");
                                        }
                                        return null;
                                    }
                                    sq50Var = new phf1(relation.r().o());
                                }
                                arrayList14.add(new wn11(d840Var));
                                i9 = 5;
                                i10 = 4;
                            } else {
                                sq50Var = new sq50(relation.o().o());
                            }
                            d840Var = sq50Var;
                            arrayList14.add(new wn11(d840Var));
                            i9 = 5;
                            i10 = 4;
                        } else {
                            GatedRelation gatedRelationN = relation.n();
                            String strO3 = gatedRelationN.o();
                            h290<ValueProp> h290VarP2 = gatedRelationN.p();
                            ArrayList arrayList16 = new ArrayList(q7h.U(h290VarP2, 10));
                            for (ValueProp valueProp : h290VarP2) {
                                valueProp.getClass();
                                int iP2 = valueProp.p();
                                int i16 = iP2 == 0 ? -1 : nl11.b[l1d.C(iP2)];
                                if (i16 != 1) {
                                    if (i16 == 2) {
                                        i581 i581VarO = valueProp.o();
                                        switch (i581VarO) {
                                            case SHOW_GATED_VALUE_PROP_UNKNOWN:
                                                ysi1Var = j581.a;
                                                arrayList16.add(new vsi1(ysi1Var));
                                                break;
                                            case SHOW_GATED_VALUE_PROP_UNSPECIFIED:
                                                ysi1Var = j581.b;
                                                arrayList16.add(new vsi1(ysi1Var));
                                                break;
                                            case SHOW_GATED_VALUE_PROP_AD_FREE:
                                                ysi1Var = j581.c;
                                                arrayList16.add(new vsi1(ysi1Var));
                                                break;
                                            case SHOW_GATED_VALUE_PROP_EXTENDED:
                                                ysi1Var = j581.d;
                                                arrayList16.add(new vsi1(ysi1Var));
                                                break;
                                            case SHOW_GATED_VALUE_PROP_EARLY_ACCESS:
                                                ysi1Var = j581.e;
                                                arrayList16.add(new vsi1(ysi1Var));
                                                break;
                                            case SHOW_GATED_VALUE_PROP_VIDEO:
                                                ysi1Var = j581.f;
                                                arrayList16.add(new vsi1(ysi1Var));
                                                break;
                                            case SHOW_GATED_VALUE_PROP_FULL_LENGTH_EPISODES:
                                                ysi1Var = j581.g;
                                                arrayList16.add(new vsi1(ysi1Var));
                                                break;
                                            case SHOW_GATED_VALUE_PROP_BONUS:
                                                ysi1Var = j581.h;
                                                arrayList16.add(new vsi1(ysi1Var));
                                                break;
                                            default:
                                                nkx0.q(i581VarO, "Unknown ShowGatedRelationValuePropProto: ");
                                                break;
                                        }
                                    } else {
                                        nkx0.q(valueProp, "Unknown valuePropType type: ");
                                    }
                                    return null;
                                }
                                w3z w3zVarN = valueProp.n();
                                switch (w3zVarN) {
                                    case EPISODE_GATED_VALUE_PROP_UNKNOWN:
                                        ysi1Var = x3z.a;
                                        arrayList16.add(new vsi1(ysi1Var));
                                        break;
                                    case EPISODE_GATED_VALUE_PROP_UNSPECIFIED:
                                        ysi1Var = x3z.b;
                                        arrayList16.add(new vsi1(ysi1Var));
                                        break;
                                    case EPISODE_GATED_VALUE_PROP_AD_FREE:
                                        ysi1Var = x3z.c;
                                        arrayList16.add(new vsi1(ysi1Var));
                                        break;
                                    case EPISODE_GATED_VALUE_PROP_EXTENDED:
                                        ysi1Var = x3z.d;
                                        arrayList16.add(new vsi1(ysi1Var));
                                        break;
                                    case EPISODE_GATED_VALUE_PROP_EARLY_ACCESS:
                                        ysi1Var = x3z.e;
                                        arrayList16.add(new vsi1(ysi1Var));
                                        break;
                                    case EPISODE_GATED_VALUE_PROP_VIDEO:
                                        ysi1Var = x3z.f;
                                        arrayList16.add(new vsi1(ysi1Var));
                                        break;
                                    case EPISODE_GATED_VALUE_PROP_FULL_LENGTH_EPISODES:
                                        ysi1Var = x3z.g;
                                        arrayList16.add(new vsi1(ysi1Var));
                                        break;
                                    case EPISODE_GATED_VALUE_PROP_NONE:
                                        ysi1Var = x3z.h;
                                        arrayList16.add(new vsi1(ysi1Var));
                                        break;
                                    default:
                                        nkx0.q(w3zVarN, "Unknown EpisodeGatedRelationValueProp: ");
                                        return null;
                                }
                            }
                            d840Var = new d840(strO3, arrayList16);
                            arrayList14.add(new wn11(d840Var));
                            i9 = 5;
                            i10 = 4;
                        }
                    }
                    arrayList13.add(new pl11(relatedEntity.n(), arrayList14));
                    i9 = 5;
                    i10 = 4;
                }
                return new ll11(arrayList13);
            case 11:
                h290<Release> h290VarN3 = RelatedReleases.o(bArr).n();
                ArrayList arrayList17 = new ArrayList(q7h.U(h290VarN3, 10));
                for (Release release : h290VarN3) {
                    String uri3 = release.getUri();
                    List listN = release.n();
                    ArrayList arrayList18 = new ArrayList(q7h.U(listN, 10));
                    for (wv11 wv11Var : (AbstractList) listN) {
                        wv11Var.getClass();
                        int iOrdinal6 = wv11Var.ordinal();
                        vv11 vv11Var = vv11.a;
                        if (iOrdinal6 != 0) {
                            if (iOrdinal6 == 1) {
                                vv11Var = vv11.b;
                            } else if (iOrdinal6 == 2) {
                                vv11Var = vv11.c;
                            }
                        }
                        arrayList18.add(vv11Var);
                    }
                    arrayList17.add(new mo11(uri3, arrayList18));
                }
                return new mm11(arrayList17);
            case 12:
                return new qe21(ReorderingTrait.o(bArr).n());
            case 13:
                return new qp31(RootlistabilityTrait.o(bArr).n());
            case 14:
                CardConfigProto.CardConfig cardConfigP = CardConfigProto.CardConfig.p(bArr);
                byte[] bArrT2 = cardConfigP.n().t();
                String strO4 = cardConfigP.o();
                String entityUri2 = cardConfigP.getEntityUri();
                bArrT2.getClass();
                return new rz61(strO4, entityUri2, bArrT2);
            case 15:
                h290<ShareRestrictionsProto$ShareFormatRestriction> h290VarN4 = ShareRestrictionsProto$ShareRestrictions.o(bArr).n();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (ShareRestrictionsProto$ShareFormatRestriction shareRestrictionsProto$ShareFormatRestriction : h290VarN4) {
                    String strQ4 = shareRestrictionsProto$ShareFormatRestriction.q();
                    boolean zP = shareRestrictionsProto$ShareFormatRestriction.p();
                    d290 d290VarO2 = shareRestrictionsProto$ShareFormatRestriction.o();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Iterator it7 = d290VarO2.iterator();
                    while (it7.hasNext()) {
                        int iOrdinal7 = ((ie71) it7.next()).ordinal();
                        if (iOrdinal7 == 0) {
                            y771Var = y771.b;
                        } else {
                            if (iOrdinal7 != 1) {
                                eg.o();
                                return null;
                            }
                            y771Var = y771.a;
                        }
                        linkedHashSet2.add(y771Var);
                    }
                    h290 h290VarN5 = shareRestrictionsProto$ShareFormatRestriction.n();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    Iterator it8 = h290VarN5.iterator();
                    while (it8.hasNext()) {
                        linkedHashSet3.add(new he71(((ShareRestrictionsProto$ShareDestination) it8.next()).n()));
                    }
                    linkedHashSet.add(new e871(strQ4, zP, linkedHashSet2, linkedHashSet3));
                }
                return new ge71(linkedHashSet);
            case 16:
                h290<ShareTraitProto$ShareOption> h290VarN6 = ShareTraitProto$ShareTrait.o(bArr).n();
                ArrayList arrayList19 = new ArrayList(q7h.U(h290VarN6, 10));
                for (ShareTraitProto$ShareOption shareTraitProto$ShareOption : h290VarN6) {
                    arrayList19.add(shareTraitProto$ShareOption.p() ? new qc71(shareTraitProto$ShareOption.o()) : new pc71(shareTraitProto$ShareOption.n()));
                }
                return new vn71(arrayList19);
            case 17:
                ShortcutsCardTrait shortcutsCardTraitO = ShortcutsCardTrait.o(bArr);
                return new z081(shortcutsCardTraitO.getImageUrl(), shortcutsCardTraitO.getTitle(), shortcutsCardTraitO.n(), shortcutsCardTraitO.getEntityUri());
            case 18:
                ShowAccess showAccessL = ShowAccess.L(bArr);
                showAccessL.getClass();
                int iU2 = showAccessL.u();
                switch (iU2 == 0 ? -1 : x281.b[l1d.C(iU2)]) {
                    case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                    case 12:
                    case 13:
                        n281Var = null;
                        if (showAccessL.K() || showAccessL.A().getUrl().length() == 0) {
                            k281Var2 = null;
                        } else {
                            AccountLinkPrompt accountLinkPromptA = showAccessL.A();
                            k281Var2 = new k281(0, accountLinkPromptA.getTitle(), accountLinkPromptA.o(), accountLinkPromptA.p(), accountLinkPromptA.getUrl());
                        }
                        zW = showAccessL.w();
                        d290 d290VarD = showAccessL.D();
                        arrayList2 = new ArrayList(q7h.U(d290VarD, 10));
                        it = d290VarD.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            v281Var = v281.a;
                            if (zHasNext) {
                                d290 d290VarE = showAccessL.E();
                                arrayList3 = new ArrayList(q7h.U(d290VarE, 10));
                                it2 = d290VarE.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                    v281[] v281VarArrValues = v281.values();
                                    if (iOrdinal2 >= 0 || iOrdinal2 >= v281VarArrValues.length) {
                                        v281Var2 = v281Var;
                                    } else {
                                        v281Var2 = v281VarArrValues[iOrdinal2];
                                    }
                                    arrayList3.add(v281Var2);
                                }
                                strQ = showAccessL.C().q();
                                sk70VarP = showAccessL.C().p();
                                iArr = x281.a;
                                if (iArr[sk70VarP.ordinal()] == 1) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (!showAccessL.C().r()) {
                                    i6 = 0;
                                }
                                u281Var = new u281(strQ, i6);
                                if (ihc1.y0(strQ)) {
                                    u281Var2 = null;
                                } else {
                                    u281Var2 = u281Var;
                                }
                                q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                if (showAccessL.H()) {
                                    q281Var2 = q281Var;
                                } else {
                                    q281Var2 = null;
                                }
                                t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                if (showAccessL.J()) {
                                    t281Var2 = t281Var;
                                } else {
                                    t281Var2 = null;
                                }
                                bArrT = showAccessL.y().t();
                                if (showAccessL.u() == 10) {
                                    bArr2 = bArrT;
                                } else {
                                    bArr2 = null;
                                }
                                if (showAccessL.u() == 11) {
                                    r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                } else {
                                    r281Var = null;
                                }
                                w281 w281Var = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                if (showAccessL.G()) {
                                    checkoutOnWebOverlayExplanationP = showAccessL.p();
                                    if (checkoutOnWebOverlayExplanationP != null || (audiobookPriceR = checkoutOnWebOverlayExplanationP.r()) == null) {
                                        j281Var = null;
                                    } else {
                                        j281VarF = f(audiobookPriceR);
                                        j281Var = j281VarF;
                                    }
                                } else if (showAccessL.I() || !showAccessL.t().v() || (engagementExplanationT = showAccessL.t()) == null || (audiobookPriceW = engagementExplanationT.w()) == null) {
                                    j281Var = null;
                                } else {
                                    j281VarF = f(audiobookPriceW);
                                    j281Var = j281VarF;
                                }
                                return j281Var != null ? new w281(w281Var.a, w281Var.b, w281Var.c, w281Var.d, w281Var.e, j281Var, w281Var.g, w281Var.h, w281Var.i, w281Var.j, w281Var.k, w281Var.l) : w281Var;
                            }
                            iOrdinal3 = ((hjh1) it.next()).ordinal();
                            v281[] v281VarArrValues2 = v281.values();
                            if (iOrdinal3 < 0 && iOrdinal3 < v281VarArrValues2.length) {
                                v281Var = v281VarArrValues2[iOrdinal3];
                            }
                            arrayList2.add(v281Var);
                        }
                        break;
                    case 0:
                    default:
                        eg.o();
                        return null;
                    case 4:
                        BasicExplanation basicExplanationO = showAccessL.o();
                        k281Var = new k281(0, basicExplanationO.getTitle(), basicExplanationO.o(), basicExplanationO.p(), (String) null);
                        n281Var = k281Var;
                        if (showAccessL.K()) {
                            k281Var2 = null;
                        } else {
                            k281Var2 = null;
                        }
                        zW = showAccessL.w();
                        d290 d290VarD2 = showAccessL.D();
                        arrayList2 = new ArrayList(q7h.U(d290VarD2, 10));
                        it = d290VarD2.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            v281Var = v281.a;
                            if (zHasNext) {
                                d290 d290VarE2 = showAccessL.E();
                                arrayList3 = new ArrayList(q7h.U(d290VarE2, 10));
                                it2 = d290VarE2.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                    v281[] v281VarArrValues3 = v281.values();
                                    if (iOrdinal2 >= 0) {
                                        v281Var2 = v281Var;
                                    } else {
                                        v281Var2 = v281Var;
                                    }
                                    arrayList3.add(v281Var2);
                                }
                                strQ = showAccessL.C().q();
                                sk70VarP = showAccessL.C().p();
                                iArr = x281.a;
                                if (iArr[sk70VarP.ordinal()] == 1) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (!showAccessL.C().r()) {
                                    i6 = 0;
                                }
                                u281Var = new u281(strQ, i6);
                                if (ihc1.y0(strQ)) {
                                    u281Var2 = u281Var;
                                } else {
                                    u281Var2 = null;
                                }
                                q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                if (showAccessL.H()) {
                                    q281Var2 = q281Var;
                                } else {
                                    q281Var2 = null;
                                }
                                t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                if (showAccessL.J()) {
                                    t281Var2 = t281Var;
                                } else {
                                    t281Var2 = null;
                                }
                                bArrT = showAccessL.y().t();
                                if (showAccessL.u() == 10) {
                                    bArr2 = bArrT;
                                } else {
                                    bArr2 = null;
                                }
                                if (showAccessL.u() == 11) {
                                    r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                } else {
                                    r281Var = null;
                                }
                                w281 w281Var2 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                if (showAccessL.G()) {
                                    checkoutOnWebOverlayExplanationP = showAccessL.p();
                                    if (checkoutOnWebOverlayExplanationP != null) {
                                    }
                                    j281Var = null;
                                } else {
                                    if (showAccessL.I()) {
                                    }
                                    j281Var = null;
                                }
                                if (j281Var != null) {
                                }
                            }
                            iOrdinal3 = ((hjh1) it.next()).ordinal();
                            v281[] v281VarArrValues4 = v281.values();
                            if (iOrdinal3 < 0) {
                            }
                            arrayList2.add(v281Var);
                            break;
                        }
                        break;
                    case 5:
                        UpsellLinkExplanation upsellLinkExplanationF = showAccessL.F();
                        String title4 = upsellLinkExplanationF.getTitle();
                        String strO5 = upsellLinkExplanationF.o();
                        String strP2 = upsellLinkExplanationF.p();
                        String url = upsellLinkExplanationF.getUrl();
                        int iOrdinal8 = upsellLinkExplanationF.r().ordinal();
                        if (iOrdinal8 == 0 || iOrdinal8 == 1) {
                            i5 = 1;
                        } else if (iOrdinal8 != 2) {
                            if (iOrdinal8 != 3) {
                                eg.o();
                                return null;
                            }
                            i5 = 1;
                        } else {
                            i5 = 2;
                        }
                        k281Var = new k281(i5, title4, strO5, strP2, url);
                        n281Var = k281Var;
                        if (showAccessL.K()) {
                            k281Var2 = null;
                        } else {
                            k281Var2 = null;
                        }
                        zW = showAccessL.w();
                        d290 d290VarD3 = showAccessL.D();
                        arrayList2 = new ArrayList(q7h.U(d290VarD3, 10));
                        it = d290VarD3.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            v281Var = v281.a;
                            if (zHasNext) {
                                d290 d290VarE3 = showAccessL.E();
                                arrayList3 = new ArrayList(q7h.U(d290VarE3, 10));
                                it2 = d290VarE3.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                    v281[] v281VarArrValues5 = v281.values();
                                    if (iOrdinal2 >= 0) {
                                        v281Var2 = v281Var;
                                    } else {
                                        v281Var2 = v281Var;
                                    }
                                    arrayList3.add(v281Var2);
                                }
                                strQ = showAccessL.C().q();
                                sk70VarP = showAccessL.C().p();
                                iArr = x281.a;
                                if (iArr[sk70VarP.ordinal()] == 1) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (!showAccessL.C().r()) {
                                    i6 = 0;
                                }
                                u281Var = new u281(strQ, i6);
                                if (ihc1.y0(strQ)) {
                                    u281Var2 = u281Var;
                                } else {
                                    u281Var2 = null;
                                }
                                q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                if (showAccessL.H()) {
                                    q281Var2 = q281Var;
                                } else {
                                    q281Var2 = null;
                                }
                                t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                if (showAccessL.J()) {
                                    t281Var2 = t281Var;
                                } else {
                                    t281Var2 = null;
                                }
                                bArrT = showAccessL.y().t();
                                if (showAccessL.u() == 10) {
                                    bArr2 = bArrT;
                                } else {
                                    bArr2 = null;
                                }
                                if (showAccessL.u() == 11) {
                                    r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                } else {
                                    r281Var = null;
                                }
                                w281 w281Var3 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                if (showAccessL.G()) {
                                    checkoutOnWebOverlayExplanationP = showAccessL.p();
                                    if (checkoutOnWebOverlayExplanationP != null) {
                                    }
                                    j281Var = null;
                                } else {
                                    if (showAccessL.I()) {
                                    }
                                    j281Var = null;
                                }
                                if (j281Var != null) {
                                }
                            }
                            iOrdinal3 = ((hjh1) it.next()).ordinal();
                            v281[] v281VarArrValues6 = v281.values();
                            if (iOrdinal3 < 0) {
                            }
                            arrayList2.add(v281Var);
                            break;
                        }
                        break;
                    case 6:
                        EngagementExplanation engagementExplanationT2 = showAccessL.t();
                        n281Var = new n281(engagementExplanationT2.getTitle(), engagementExplanationT2.p(), engagementExplanationT2.q(), engagementExplanationT2.r(), engagementExplanationT2.t(), engagementExplanationT2.u(), engagementExplanationT2.o(), engagementExplanationT2.x() ? f(engagementExplanationT2.w()) : null, engagementExplanationT2.v());
                        if (showAccessL.K()) {
                            k281Var2 = null;
                        } else {
                            k281Var2 = null;
                        }
                        zW = showAccessL.w();
                        d290 d290VarD4 = showAccessL.D();
                        arrayList2 = new ArrayList(q7h.U(d290VarD4, 10));
                        it = d290VarD4.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            v281Var = v281.a;
                            if (zHasNext) {
                                d290 d290VarE4 = showAccessL.E();
                                arrayList3 = new ArrayList(q7h.U(d290VarE4, 10));
                                it2 = d290VarE4.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                    v281[] v281VarArrValues7 = v281.values();
                                    if (iOrdinal2 >= 0) {
                                        v281Var2 = v281Var;
                                    } else {
                                        v281Var2 = v281Var;
                                    }
                                    arrayList3.add(v281Var2);
                                }
                                strQ = showAccessL.C().q();
                                sk70VarP = showAccessL.C().p();
                                iArr = x281.a;
                                if (iArr[sk70VarP.ordinal()] == 1) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (!showAccessL.C().r()) {
                                    i6 = 0;
                                }
                                u281Var = new u281(strQ, i6);
                                if (ihc1.y0(strQ)) {
                                    u281Var2 = u281Var;
                                } else {
                                    u281Var2 = null;
                                }
                                q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                if (showAccessL.H()) {
                                    q281Var2 = q281Var;
                                } else {
                                    q281Var2 = null;
                                }
                                t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                if (showAccessL.J()) {
                                    t281Var2 = t281Var;
                                } else {
                                    t281Var2 = null;
                                }
                                bArrT = showAccessL.y().t();
                                if (showAccessL.u() == 10) {
                                    bArr2 = bArrT;
                                } else {
                                    bArr2 = null;
                                }
                                if (showAccessL.u() == 11) {
                                    r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                } else {
                                    r281Var = null;
                                }
                                w281 w281Var4 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                if (showAccessL.G()) {
                                    checkoutOnWebOverlayExplanationP = showAccessL.p();
                                    if (checkoutOnWebOverlayExplanationP != null) {
                                    }
                                    j281Var = null;
                                } else {
                                    if (showAccessL.I()) {
                                    }
                                    j281Var = null;
                                }
                                if (j281Var != null) {
                                }
                            }
                            iOrdinal3 = ((hjh1) it.next()).ordinal();
                            v281[] v281VarArrValues8 = v281.values();
                            if (iOrdinal3 < 0) {
                            }
                            arrayList2.add(v281Var);
                            break;
                        }
                        break;
                    case 8:
                        n281Var = new p281(showAccessL.p().o(), showAccessL.p().u(), showAccessL.p().s(), showAccessL.p().t(), showAccessL.p().q());
                        if (showAccessL.K()) {
                            k281Var2 = null;
                        } else {
                            k281Var2 = null;
                        }
                        zW = showAccessL.w();
                        d290 d290VarD5 = showAccessL.D();
                        arrayList2 = new ArrayList(q7h.U(d290VarD5, 10));
                        it = d290VarD5.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            v281Var = v281.a;
                            if (zHasNext) {
                                d290 d290VarE5 = showAccessL.E();
                                arrayList3 = new ArrayList(q7h.U(d290VarE5, 10));
                                it2 = d290VarE5.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                    v281[] v281VarArrValues9 = v281.values();
                                    if (iOrdinal2 >= 0) {
                                        v281Var2 = v281Var;
                                    } else {
                                        v281Var2 = v281Var;
                                    }
                                    arrayList3.add(v281Var2);
                                }
                                strQ = showAccessL.C().q();
                                sk70VarP = showAccessL.C().p();
                                iArr = x281.a;
                                if (iArr[sk70VarP.ordinal()] == 1) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (!showAccessL.C().r()) {
                                    i6 = 0;
                                }
                                u281Var = new u281(strQ, i6);
                                if (ihc1.y0(strQ)) {
                                    u281Var2 = u281Var;
                                } else {
                                    u281Var2 = null;
                                }
                                q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                if (showAccessL.H()) {
                                    q281Var2 = q281Var;
                                } else {
                                    q281Var2 = null;
                                }
                                t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                if (showAccessL.J()) {
                                    t281Var2 = t281Var;
                                } else {
                                    t281Var2 = null;
                                }
                                bArrT = showAccessL.y().t();
                                if (showAccessL.u() == 10) {
                                    bArr2 = bArrT;
                                } else {
                                    bArr2 = null;
                                }
                                if (showAccessL.u() == 11) {
                                    r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                } else {
                                    r281Var = null;
                                }
                                w281 w281Var5 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                if (showAccessL.G()) {
                                    checkoutOnWebOverlayExplanationP = showAccessL.p();
                                    if (checkoutOnWebOverlayExplanationP != null) {
                                    }
                                    j281Var = null;
                                } else {
                                    if (showAccessL.I()) {
                                    }
                                    j281Var = null;
                                }
                                if (j281Var != null) {
                                }
                            }
                            iOrdinal3 = ((hjh1) it.next()).ordinal();
                            v281[] v281VarArrValues10 = v281.values();
                            if (iOrdinal3 < 0) {
                            }
                            arrayList2.add(v281Var);
                            break;
                        }
                        break;
                    case 9:
                        k281Var = new o281(showAccessL.v().p());
                        n281Var = k281Var;
                        if (showAccessL.K()) {
                            k281Var2 = null;
                        } else {
                            k281Var2 = null;
                        }
                        zW = showAccessL.w();
                        d290 d290VarD6 = showAccessL.D();
                        arrayList2 = new ArrayList(q7h.U(d290VarD6, 10));
                        it = d290VarD6.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            v281Var = v281.a;
                            if (zHasNext) {
                                d290 d290VarE6 = showAccessL.E();
                                arrayList3 = new ArrayList(q7h.U(d290VarE6, 10));
                                it2 = d290VarE6.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                    v281[] v281VarArrValues11 = v281.values();
                                    if (iOrdinal2 >= 0) {
                                        v281Var2 = v281Var;
                                    } else {
                                        v281Var2 = v281Var;
                                    }
                                    arrayList3.add(v281Var2);
                                }
                                strQ = showAccessL.C().q();
                                sk70VarP = showAccessL.C().p();
                                iArr = x281.a;
                                if (iArr[sk70VarP.ordinal()] == 1) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (!showAccessL.C().r()) {
                                    i6 = 0;
                                }
                                u281Var = new u281(strQ, i6);
                                if (ihc1.y0(strQ)) {
                                    u281Var2 = u281Var;
                                } else {
                                    u281Var2 = null;
                                }
                                q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                if (showAccessL.H()) {
                                    q281Var2 = q281Var;
                                } else {
                                    q281Var2 = null;
                                }
                                t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                if (showAccessL.J()) {
                                    t281Var2 = t281Var;
                                } else {
                                    t281Var2 = null;
                                }
                                bArrT = showAccessL.y().t();
                                if (showAccessL.u() == 10) {
                                    bArr2 = bArrT;
                                } else {
                                    bArr2 = null;
                                }
                                if (showAccessL.u() == 11) {
                                    r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                } else {
                                    r281Var = null;
                                }
                                w281 w281Var6 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                if (showAccessL.G()) {
                                    checkoutOnWebOverlayExplanationP = showAccessL.p();
                                    if (checkoutOnWebOverlayExplanationP != null) {
                                    }
                                    j281Var = null;
                                } else {
                                    if (showAccessL.I()) {
                                    }
                                    j281Var = null;
                                }
                                if (j281Var != null) {
                                }
                            }
                            iOrdinal3 = ((hjh1) it.next()).ordinal();
                            v281[] v281VarArrValues12 = v281.values();
                            if (iOrdinal3 < 0) {
                            }
                            arrayList2.add(v281Var);
                            break;
                        }
                        break;
                    case 10:
                        ConsumptionCappedExplanation consumptionCappedExplanationQ = showAccessL.q();
                        k281Var = new l281(consumptionCappedExplanationQ.getTitle(), consumptionCappedExplanationQ.o(), consumptionCappedExplanationQ.p(), consumptionCappedExplanationQ.q(), consumptionCappedExplanationQ.s());
                        n281Var = k281Var;
                        if (showAccessL.K()) {
                            k281Var2 = null;
                        } else {
                            k281Var2 = null;
                        }
                        zW = showAccessL.w();
                        d290 d290VarD7 = showAccessL.D();
                        arrayList2 = new ArrayList(q7h.U(d290VarD7, 10));
                        it = d290VarD7.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            v281Var = v281.a;
                            if (zHasNext) {
                                d290 d290VarE7 = showAccessL.E();
                                arrayList3 = new ArrayList(q7h.U(d290VarE7, 10));
                                it2 = d290VarE7.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                    v281[] v281VarArrValues13 = v281.values();
                                    if (iOrdinal2 >= 0) {
                                        v281Var2 = v281Var;
                                    } else {
                                        v281Var2 = v281Var;
                                    }
                                    arrayList3.add(v281Var2);
                                }
                                strQ = showAccessL.C().q();
                                sk70VarP = showAccessL.C().p();
                                iArr = x281.a;
                                if (iArr[sk70VarP.ordinal()] == 1) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (!showAccessL.C().r()) {
                                    i6 = 0;
                                }
                                u281Var = new u281(strQ, i6);
                                if (ihc1.y0(strQ)) {
                                    u281Var2 = u281Var;
                                } else {
                                    u281Var2 = null;
                                }
                                q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                if (showAccessL.H()) {
                                    q281Var2 = q281Var;
                                } else {
                                    q281Var2 = null;
                                }
                                t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                if (showAccessL.J()) {
                                    t281Var2 = t281Var;
                                } else {
                                    t281Var2 = null;
                                }
                                bArrT = showAccessL.y().t();
                                if (showAccessL.u() == 10) {
                                    bArr2 = bArrT;
                                } else {
                                    bArr2 = null;
                                }
                                if (showAccessL.u() == 11) {
                                    r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                } else {
                                    r281Var = null;
                                }
                                w281 w281Var7 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                if (showAccessL.G()) {
                                    checkoutOnWebOverlayExplanationP = showAccessL.p();
                                    if (checkoutOnWebOverlayExplanationP != null) {
                                    }
                                    j281Var = null;
                                } else {
                                    if (showAccessL.I()) {
                                    }
                                    j281Var = null;
                                }
                                if (j281Var != null) {
                                }
                            }
                            iOrdinal3 = ((hjh1) it.next()).ordinal();
                            v281[] v281VarArrValues14 = v281.values();
                            if (iOrdinal3 < 0) {
                            }
                            arrayList2.add(v281Var);
                            break;
                        }
                        break;
                    case 11:
                        DelegateToUpsellExplanation delegateToUpsellExplanationR = showAccessL.r();
                        int iOrdinal9 = delegateToUpsellExplanationR.p().ordinal();
                        if (iOrdinal9 == 0) {
                            i11 = 0;
                        } else if (iOrdinal9 != 1) {
                            if (iOrdinal9 != 2) {
                                if (iOrdinal9 != 3) {
                                    eg.o();
                                    return null;
                                }
                                i11 = 0;
                            }
                            n281Var = null;
                            if (showAccessL.K()) {
                                k281Var2 = null;
                            } else {
                                k281Var2 = null;
                            }
                            zW = showAccessL.w();
                            d290 d290VarD8 = showAccessL.D();
                            arrayList2 = new ArrayList(q7h.U(d290VarD8, 10));
                            it = d290VarD8.iterator();
                            while (true) {
                                zHasNext = it.hasNext();
                                v281Var = v281.a;
                                if (zHasNext) {
                                    d290 d290VarE8 = showAccessL.E();
                                    arrayList3 = new ArrayList(q7h.U(d290VarE8, 10));
                                    it2 = d290VarE8.iterator();
                                    while (it2.hasNext()) {
                                        iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                        v281[] v281VarArrValues15 = v281.values();
                                        if (iOrdinal2 >= 0) {
                                            v281Var2 = v281Var;
                                        } else {
                                            v281Var2 = v281Var;
                                        }
                                        arrayList3.add(v281Var2);
                                    }
                                    strQ = showAccessL.C().q();
                                    sk70VarP = showAccessL.C().p();
                                    iArr = x281.a;
                                    if (iArr[sk70VarP.ordinal()] == 1) {
                                        i6 = 1;
                                    } else {
                                        i6 = 0;
                                    }
                                    if (!showAccessL.C().r()) {
                                        i6 = 0;
                                    }
                                    u281Var = new u281(strQ, i6);
                                    if (ihc1.y0(strQ)) {
                                        u281Var2 = u281Var;
                                    } else {
                                        u281Var2 = null;
                                    }
                                    q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                    if (showAccessL.H()) {
                                        q281Var2 = q281Var;
                                    } else {
                                        q281Var2 = null;
                                    }
                                    t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                    if (showAccessL.J()) {
                                        t281Var2 = t281Var;
                                    } else {
                                        t281Var2 = null;
                                    }
                                    bArrT = showAccessL.y().t();
                                    if (showAccessL.u() == 10) {
                                        bArr2 = bArrT;
                                    } else {
                                        bArr2 = null;
                                    }
                                    if (showAccessL.u() == 11) {
                                        r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                    } else {
                                        r281Var = null;
                                    }
                                    w281 w281Var8 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                    if (showAccessL.G()) {
                                        checkoutOnWebOverlayExplanationP = showAccessL.p();
                                        if (checkoutOnWebOverlayExplanationP != null) {
                                        }
                                        j281Var = null;
                                    } else {
                                        if (showAccessL.I()) {
                                        }
                                        j281Var = null;
                                    }
                                    if (j281Var != null) {
                                    }
                                }
                                iOrdinal3 = ((hjh1) it.next()).ordinal();
                                v281[] v281VarArrValues16 = v281.values();
                                if (iOrdinal3 < 0) {
                                }
                                arrayList2.add(v281Var);
                            }
                        } else {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            k281Var = new m281(delegateToUpsellExplanationR.o(), i11);
                            if (!ihc1.y0(delegateToUpsellExplanationR.o())) {
                                n281Var = k281Var;
                            }
                            if (showAccessL.K()) {
                                k281Var2 = null;
                            } else {
                                k281Var2 = null;
                            }
                            zW = showAccessL.w();
                            d290 d290VarD9 = showAccessL.D();
                            arrayList2 = new ArrayList(q7h.U(d290VarD9, 10));
                            it = d290VarD9.iterator();
                            while (true) {
                                zHasNext = it.hasNext();
                                v281Var = v281.a;
                                if (zHasNext) {
                                    d290 d290VarE9 = showAccessL.E();
                                    arrayList3 = new ArrayList(q7h.U(d290VarE9, 10));
                                    it2 = d290VarE9.iterator();
                                    while (it2.hasNext()) {
                                        iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                        v281[] v281VarArrValues17 = v281.values();
                                        if (iOrdinal2 >= 0) {
                                            v281Var2 = v281Var;
                                        } else {
                                            v281Var2 = v281Var;
                                        }
                                        arrayList3.add(v281Var2);
                                    }
                                    strQ = showAccessL.C().q();
                                    sk70VarP = showAccessL.C().p();
                                    iArr = x281.a;
                                    if (iArr[sk70VarP.ordinal()] == 1) {
                                        i6 = 1;
                                    } else {
                                        i6 = 0;
                                    }
                                    if (!showAccessL.C().r()) {
                                        i6 = 0;
                                    }
                                    u281Var = new u281(strQ, i6);
                                    if (ihc1.y0(strQ)) {
                                        u281Var2 = u281Var;
                                    } else {
                                        u281Var2 = null;
                                    }
                                    q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                    if (showAccessL.H()) {
                                        q281Var2 = q281Var;
                                    } else {
                                        q281Var2 = null;
                                    }
                                    t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                    if (showAccessL.J()) {
                                        t281Var2 = t281Var;
                                    } else {
                                        t281Var2 = null;
                                    }
                                    bArrT = showAccessL.y().t();
                                    if (showAccessL.u() == 10) {
                                        bArr2 = bArrT;
                                    } else {
                                        bArr2 = null;
                                    }
                                    if (showAccessL.u() == 11) {
                                        r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                    } else {
                                        r281Var = null;
                                    }
                                    w281 w281Var9 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                    if (showAccessL.G()) {
                                        checkoutOnWebOverlayExplanationP = showAccessL.p();
                                        if (checkoutOnWebOverlayExplanationP != null) {
                                        }
                                        j281Var = null;
                                    } else {
                                        if (showAccessL.I()) {
                                        }
                                        j281Var = null;
                                    }
                                    if (j281Var != null) {
                                    }
                                }
                                iOrdinal3 = ((hjh1) it.next()).ordinal();
                                v281[] v281VarArrValues18 = v281.values();
                                if (iOrdinal3 < 0) {
                                }
                                arrayList2.add(v281Var);
                            }
                        }
                        n281Var = null;
                        if (showAccessL.K()) {
                            k281Var2 = null;
                        } else {
                            k281Var2 = null;
                        }
                        zW = showAccessL.w();
                        d290 d290VarD10 = showAccessL.D();
                        arrayList2 = new ArrayList(q7h.U(d290VarD10, 10));
                        it = d290VarD10.iterator();
                        while (true) {
                            zHasNext = it.hasNext();
                            v281Var = v281.a;
                            if (zHasNext) {
                                d290 d290VarE10 = showAccessL.E();
                                arrayList3 = new ArrayList(q7h.U(d290VarE10, 10));
                                it2 = d290VarE10.iterator();
                                while (it2.hasNext()) {
                                    iOrdinal2 = ((hjh1) it2.next()).ordinal();
                                    v281[] v281VarArrValues19 = v281.values();
                                    if (iOrdinal2 >= 0) {
                                        v281Var2 = v281Var;
                                    } else {
                                        v281Var2 = v281Var;
                                    }
                                    arrayList3.add(v281Var2);
                                }
                                strQ = showAccessL.C().q();
                                sk70VarP = showAccessL.C().p();
                                iArr = x281.a;
                                if (iArr[sk70VarP.ordinal()] == 1) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                if (!showAccessL.C().r()) {
                                    i6 = 0;
                                }
                                u281Var = new u281(strQ, i6);
                                if (ihc1.y0(strQ)) {
                                    u281Var2 = u281Var;
                                } else {
                                    u281Var2 = null;
                                }
                                q281Var = new q281(showAccessL.s().r() ? iArr[showAccessL.s().q().ordinal()] != 1 ? 0 : 1 : 0, showAccessL.s().getTitle(), showAccessL.s().o());
                                if (showAccessL.H()) {
                                    q281Var2 = q281Var;
                                } else {
                                    q281Var2 = null;
                                }
                                t281Var = new t281(showAccessL.z().getTitle(), showAccessL.z().o(), showAccessL.z().p(), showAccessL.z().q());
                                if (showAccessL.J()) {
                                    t281Var2 = t281Var;
                                } else {
                                    t281Var2 = null;
                                }
                                bArrT = showAccessL.y().t();
                                if (showAccessL.u() == 10) {
                                    bArr2 = bArrT;
                                } else {
                                    bArr2 = null;
                                }
                                if (showAccessL.u() == 11) {
                                    r281Var = new r281(showAccessL.x().getTitle(), showAccessL.x().o(), showAccessL.x().p(), showAccessL.x().q(), showAccessL.x().s());
                                } else {
                                    r281Var = null;
                                }
                                w281 w281Var10 = new w281(n281Var, k281Var2, zW, arrayList2, arrayList3, u281Var2, q281Var2, t281Var2, bArr2, r281Var, showAccessL.B(), 32);
                                if (showAccessL.G()) {
                                    checkoutOnWebOverlayExplanationP = showAccessL.p();
                                    if (checkoutOnWebOverlayExplanationP != null) {
                                    }
                                    j281Var = null;
                                } else {
                                    if (showAccessL.I()) {
                                    }
                                    j281Var = null;
                                }
                                if (j281Var != null) {
                                }
                            }
                            iOrdinal3 = ((hjh1) it.next()).ordinal();
                            v281[] v281VarArrValues110 = v281.values();
                            if (iOrdinal3 < 0) {
                            }
                            arrayList2.add(v281Var);
                            break;
                        }
                        break;
                }
                break;
            case 19:
                Metadata.Show showV = Metadata.Show.v(bArr);
                String name2 = showV.getName();
                String publisher = showV.getPublisher();
                boolean zQ = showV.q();
                String description3 = showV.getDescription();
                String language = showV.getLanguage();
                List copyrightList2 = showV.getCopyrightList();
                ArrayList arrayList20 = new ArrayList(q7h.U(copyrightList2, 10));
                Iterator it9 = copyrightList2.iterator();
                while (it9.hasNext()) {
                    arrayList20.add(((Metadata.Copyright) it9.next()).n());
                }
                boolean zS = showV.s();
                boolean zU = showV.u();
                int i17 = wa81.a[showV.t().ordinal()];
                if (i17 == 1) {
                    i7 = 2;
                } else if (i17 != 2) {
                    i7 = i17 != 3 ? 4 : 3;
                } else {
                    i7 = 1;
                }
                den denVarT = boo1.t(showV.o().getImageCount() > 0 ? showV.o() : null);
                phc phcVarR = showV.r();
                if (phcVarR.size() != 16) {
                    throw new InvalidProtocolBufferException("Invalid GID");
                }
                String string = new y6b1(v6b1.H1, g9a.a(phcVarR.t()), 0).toString();
                int iOrdinal10 = showV.n().ordinal();
                if (iOrdinal10 == 0) {
                    i8 = 1;
                } else if (iOrdinal10 == 1) {
                    i8 = 2;
                } else {
                    if (iOrdinal10 != 2) {
                        eg.o();
                        return null;
                    }
                    i8 = 3;
                }
                return new va81(string, name2, publisher, description3, language, arrayList20, denVarT, zQ, zS, zU, i7, showV.getTrailerUri(), i8);
            case 20:
                SimpleCardTrait simpleCardTraitY = SimpleCardTrait.y(bArr);
                String strR4 = simpleCardTraitY.r();
                String title5 = simpleCardTraitY.getTitle();
                String subtitle3 = simpleCardTraitY.getSubtitle();
                String strT3 = simpleCardTraitY.t();
                int iOrdinal11 = simpleCardTraitY.v().ordinal();
                if (iOrdinal11 == 0) {
                    ellVar = ell.a;
                } else if (iOrdinal11 == 1) {
                    ellVar = ell.b;
                } else if (iOrdinal11 == 2) {
                    ellVar = ell.d;
                } else {
                    if (iOrdinal11 != 3) {
                        eg.o();
                        return null;
                    }
                    ellVar = ell.f;
                }
                ell ellVar2 = ellVar;
                String strO6 = simpleCardTraitY.o();
                h290 h290VarS2 = simpleCardTraitY.s();
                ArrayList arrayList21 = new ArrayList(q7h.U(h290VarS2, 10));
                Iterator it10 = h290VarS2.iterator();
                while (it10.hasNext()) {
                    arrayList21.add(new sod1(((com.spotify.extendedmetadata.extensions.simplecardtrait.proto.Label) it10.next()).o()));
                }
                h290 h290VarQ2 = simpleCardTraitY.q();
                ArrayList arrayList22 = new ArrayList(q7h.U(h290VarQ2, 10));
                Iterator it11 = h290VarQ2.iterator();
                while (it11.hasNext()) {
                    arrayList22.add(new axn(((com.spotify.extendedmetadata.extensions.simplecardtrait.proto.Creator) it11.next()).getName()));
                }
                return new gw81(strR4, title5, subtitle3, strT3, ellVar2, arrayList21, arrayList22, strO6, simpleCardTraitY.u().q(), simpleCardTraitY.getDuration().p(), simpleCardTraitY.p(), simpleCardTraitY.x() ? simpleCardTraitY.w() : null);
            case 21:
                return new xv91(ResolvedShareProto$ResolvedShare.o(bArr).n());
            case 22:
                ArtistFacts artistFactsP = ArtistFacts.p(bArr);
                return new z6a1(artistFactsP.n(), artistFactsP.o());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                h290<Contributor> h290VarN7 = Credits.o(bArr).n();
                ArrayList arrayList23 = new ArrayList(q7h.U(h290VarN7, 10));
                for (Contributor contributor : h290VarN7) {
                    contributor.getClass();
                    String uri4 = contributor.hasUri() ? contributor.getUri() : null;
                    String name3 = contributor.getName();
                    Role roleO = contributor.o();
                    String name4 = roleO.getName();
                    h290<RoleGroup> h290VarO2 = roleO.o();
                    ArrayList arrayList24 = new ArrayList(q7h.U(h290VarO2, 10));
                    for (RoleGroup roleGroup : h290VarO2) {
                        roleGroup.getClass();
                        arrayList24.add(new d7a1(roleGroup.getName()));
                    }
                    c7a1 c7a1Var = new c7a1(name4, arrayList24);
                    h290<Source> h290VarP3 = contributor.p();
                    ArrayList arrayList25 = new ArrayList(q7h.U(h290VarP3, 10));
                    for (Source source : h290VarP3) {
                        source.getClass();
                        arrayList25.add(new e7a1(source.getName(), source.n()));
                    }
                    arrayList23.add(new b7a1(uri4, name3, c7a1Var, arrayList25, contributor.n()));
                }
                return new f7a1(arrayList23);
            case 24:
                return new qaa1(SongDnaEligibility.o(bArr).n());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ShareCard shareCardQ = ShareCard.q(bArr);
                String title6 = shareCardQ.getTitle();
                String description4 = shareCardQ.getDescription();
                String imageUrl2 = shareCardQ.getImageUrl();
                float f = 0.0f;
                try {
                    List listQ0 = ihc1.Q0(shareCardQ.n().n(), new String[]{":"}, 0, 6);
                    if (listQ0.size() != 2) {
                        listQ0 = null;
                    }
                    if (listQ0 != null) {
                        f = Float.parseFloat((String) listQ0.get(0)) / Float.parseFloat((String) listQ0.get(1));
                    }
                } catch (Exception unused) {
                }
                int iP3 = shareCardQ.n().p();
                int i18 = iP3 == 0 ? -1 : ppa1.a[l1d.C(iP3)];
                if (i18 == 1) {
                    bw9Var = new bw9(shareCardQ.n().q());
                } else if (i18 == 2) {
                    bw9Var = new zv9(shareCardQ.n().getImageUrl());
                } else if (i18 == 3) {
                    bw9Var = new yv9(shareCardQ.n().getColor());
                } else {
                    if (i18 != 4) {
                        eg.o();
                        return null;
                    }
                    bw9Var = aw9.c;
                }
                ew9 ew9Var = new ew9(f, bw9Var);
                int i19 = ppa1.b[shareCardQ.p().ordinal()];
                nz70 nz70Var = i19 != 1 ? i19 != 2 ? nz70.c : mz70.c : lz70.c;
                if (shareCardQ.o().n() == 0 || shareCardQ.o().p() == 0 || (date = new SimpleDateFormat("MM", Locale.getDefault()).parse(String.valueOf(shareCardQ.o().p()))) == null) {
                    d5rVar = null;
                } else {
                    String str3 = new SimpleDateFormat("MMM", Locale.getDefault()).format(date);
                    String strValueOf = String.valueOf(shareCardQ.o().n());
                    str3.getClass();
                    d5rVar = new d5r(strValueOf, str3);
                }
                return new opa1(title6, description4, imageUrl2, nz70Var, d5rVar, ew9Var);
            case 26:
                return new ixa1(Speedability.o(bArr).n());
            case 27:
                return d(bArr);
            case 28:
                return e(bArr);
            default:
                List itemsList2 = TopPlayables.o(bArr).n().getItemsList();
                ArrayList arrayList26 = new ArrayList(q7h.U(itemsList2, 10));
                Iterator it12 = itemsList2.iterator();
                while (it12.hasNext()) {
                    arrayList26.add(new zh51(((spotify.creators.v1.topplayables.SectionItem) it12.next()).getUri()));
                }
                return new kbf1(new dg51(arrayList26));
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 138;
            case 1:
                return 118;
            case 2:
                return 181;
            case 3:
                return 148;
            case 4:
                return 158;
            case 5:
                return 167;
            case 6:
                return 171;
            case 7:
                return 183;
            case 8:
                return 151;
            case 9:
                return 165;
            case 10:
                return 216;
            case 11:
                return 153;
            case 12:
                return 160;
            case 13:
                return 149;
            case 14:
                return 262;
            case 15:
                return 154;
            case 16:
                return 80;
            case 17:
                return 119;
            case 18:
                return 31;
            case 19:
                return 11;
            case 20:
                return 97;
            case 21:
                return 105;
            case 22:
                return 236;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return 232;
            case 24:
                return 227;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return 168;
            case 26:
                return 257;
            case 27:
                return 252;
            case 28:
                return 237;
            default:
                return 169;
        }
    }

    public final Class type() {
        switch (this.a) {
            case 0:
                return myv0.class;
            case 1:
                return nbw0.class;
            case 2:
                return pjw0.class;
            case 3:
                return xlw0.class;
            case 4:
                return iow0.class;
            case 5:
                return pnx0.class;
            case 6:
                return oox0.class;
            case 7:
                return zoy0.class;
            case 8:
                return s211.class;
            case 9:
                return kl11.class;
            case 10:
                return ll11.class;
            case 11:
                return mm11.class;
            case 12:
                return qe21.class;
            case 13:
                return qp31.class;
            case 14:
                return rz61.class;
            case 15:
                return ge71.class;
            case 16:
                return vn71.class;
            case 17:
                return z081.class;
            case 18:
                return w281.class;
            case 19:
                return va81.class;
            case 20:
                return gw81.class;
            case 21:
                return xv91.class;
            case 22:
                return z6a1.class;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return f7a1.class;
            case 24:
                return qaa1.class;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return opa1.class;
            case 26:
                return ixa1.class;
            case 27:
                return m1b1.class;
            case 28:
                return zge1.class;
            default:
                return kbf1.class;
        }
    }
}
