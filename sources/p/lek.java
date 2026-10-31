package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import com.spotify.artistfacts.v1.ArtistFact;
import com.spotify.artistfacts.v1.GetArtistFactsResponse;
import com.spotify.automix.proto.CuepointsOuterClass$Cuepoint;
import com.spotify.automix.proto.CuepointsOuterClass$Cuepoints;
import com.spotify.contentagnostic.ContentTypeTrait;
import com.spotify.contentagnostic.v2.Capability;
import com.spotify.contentagnostic.v2.ConsumptionExperienceTrait;
import com.spotify.contentagnostic.v2.ContentCapabilityTrait;
import com.spotify.contentagnostic.v2.ContentExperienceTrait;
import com.spotify.contentagnostic.v2.Contributor;
import com.spotify.contentagnostic.v2.CreditsSource;
import com.spotify.contentagnostic.v2.CreditsTrait;
import com.spotify.contentagnostic.v2.DetailedEvaluationTrait;
import com.spotify.contentagnostic.v2.EntityTypeTrait;
import com.spotify.contentagnostic.v2.Genre;
import com.spotify.contentagnostic.v2.Restricted;
import com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto.CampaignUserStatePurchase;
import com.spotify.extendedmetadata.extensions.concertcampaignuserstateimpl.proto.ConcertCampaignUserState;
import com.spotify.extendedmetadata.extensions.concertlocationimpl.proto.LatLon;
import com.spotify.extendedmetadata.extensions.concertlocationimpl.proto.Location;
import com.spotify.extendedmetadata.extensions.concertlocationimpl.proto.PhysicalLocation;
import com.spotify.extendedmetadata.extensions.concertmarketingimpl.proto.Image;
import com.spotify.extendedmetadata.extensions.concertmarketingimpl.proto.Marketing;
import com.spotify.extendedmetadata.extensions.concertperformersimpl.proto.Performer;
import com.spotify.extendedmetadata.extensions.concertperformersimpl.proto.PerformerGroup;
import com.spotify.extendedmetadata.extensions.contentalternativesimpl.proto.ContentAlternative;
import com.spotify.extendedmetadata.extensions.contentalternativesimpl.proto.ContentAlternatives;
import com.spotify.extendedmetadata.extensions.contentbyorabout.proto.ContentByOrAbout;
import com.spotify.extendedmetadata.extensions.contextualflairplaylistimpl.proto.SupportedBadges;
import com.spotify.extendedmetadata.extensions.contextualflairtrackimpl.proto.Badge;
import com.spotify.extendedmetadata.extensions.coverimageimpl.proto.CoverImage;
import com.spotify.extendedmetadata.extensions.displaysegmentsimpl.proto.DisplaySegment;
import com.spotify.extendedmetadata.extensions.displaysegmentsimpl.proto.DisplaySegmentsExtension;
import com.spotify.extendedmetadata.extensions.duplicateitemstraitimpl.DuplicateItemsTrait;
import com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto.BookmarkItem;
import com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto.EntityBookmarks;
import com.spotify.extendedmetadata.extensions.entitybookmarksimpl.proto.EpisodeBookmarks;
import com.spotify.extendedmetadata.extensions.entitycappingimpl.proto.EntityCapping;
import com.spotify.extendedmetadata.extensions.episodetranscriptsimpl.proto.EpisodeTranscriptMetadata;
import com.spotify.extendedmetadata.extensions.episodetranscriptsimpl.proto.EpisodeTranscriptsMetadata;
import com.spotify.fingerprintfilterservice.AdPlacement;
import com.spotify.fingerprintfilterservice.EpisodeAdPlacements;
import com.spotify.metadata.classic.proto.Metadata;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import spotify.creators.v1.CreatorAppearsOn;
import spotify.creators.v1.SectionItem;
import spotify.creators.v1.creatorfanfunding.CreatorFanFunding;
import spotify.creators.v1.creatorpinneditem.CreatorPinnedItem;
import spotify.creators.v1.creatorplaylists.CreatorPlaylists;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lek implements ov00 {
    public final /* synthetic */ byte a;

    public /* synthetic */ lek(byte b) {
        this.a = b;
    }

    public static gdz c(Metadata.AudioFile audioFile) {
        int i;
        String strZ = zno1.z(audioFile.n().t());
        switch (audioFile.o().ordinal()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            case 9:
                i = 10;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 11;
                break;
            case 17:
                i = 18;
                break;
            default:
                eg.o();
                return null;
        }
        return new gdz(strZ, i);
    }

    public static uob d(BookmarkItem bookmarkItem) {
        String id = bookmarkItem.getId();
        long jP = bookmarkItem.p();
        long jN = bookmarkItem.n();
        String title = bookmarkItem.getTitle();
        Timestamp timestampO = bookmarkItem.o();
        return new uob(jP, jN, (timestampO.q() * 1000) + ((long) (timestampO.p() / 1000000)), id, title);
    }

    public static nrl e(Capability capability) {
        int iP = capability.p();
        int i = iP == 0 ? -1 : rrl.a[l1d.C(iP)];
        if (i != -1) {
            if (i == 1) {
                return irl.a;
            }
            if (i == 2) {
                return jrl.a;
            }
            orl orlVar = null;
            if (i == 3) {
                Restricted restrictedO = capability.o();
                int iN = restrictedO.n();
                int i2 = iN == 0 ? -1 : rrl.b[l1d.C(iN)];
                if (i2 != -1) {
                    if (i2 == 1) {
                        orlVar = new orl(restrictedO.p().getKey(), restrictedO.p().o());
                    } else if (i2 != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new lrl(orlVar);
            }
            if (i == 4) {
                return krl.a;
            }
            if (i != 5) {
                eg.o();
                return null;
            }
        }
        return mrl.a;
    }

    public static xeo f(CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint) {
        int i;
        long jQ = cuepointsOuterClass$Cuepoint.q();
        float fR = cuepointsOuterClass$Cuepoint.r();
        int iOrdinal = cuepointsOuterClass$Cuepoint.p().ordinal();
        int i2 = 1;
        if (iOrdinal == 0) {
            i = i2;
        } else if (iOrdinal == 1) {
            i = 2;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            i2 = 3;
            i = i2;
        }
        return new xeo(jQ, fR, i, cuepointsOuterClass$Cuepoint.n());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static String g(phc phcVar) throws InvalidProtocolBufferException {
        if (phcVar.size() == 16) {
            return g9a.a(phcVar.t());
        }
        throw new InvalidProtocolBufferException("Invalid GID");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final ez00 a(byte[] bArr) throws InvalidProtocolBufferException {
        d7d z6dVar;
        d7d w6dVar;
        rnt rntVar;
        fll fllVar;
        ell ellVar;
        kql kqlVar;
        ktl ktlVar;
        txn mxnVar;
        int i;
        int i2;
        String str;
        int i3;
        int i4 = 8;
        int i5 = 6;
        int i6 = 2;
        switch (this.a) {
            case 0:
                ConcertCampaignUserState concertCampaignUserStateT = ConcertCampaignUserState.t(bArr);
                int iS = concertCampaignUserStateT.s();
                switch (iS != 0 ? kek.a[l1d.C(iS)] : -1) {
                    case 1:
                        z6dVar = new z6d(concertCampaignUserStateT.r().n(), concertCampaignUserStateT.r().r().q(), concertCampaignUserStateT.r().q().q(), concertCampaignUserStateT.r().p());
                        w6dVar = z6dVar;
                        break;
                    case 2:
                        w6dVar = new w6d(concertCampaignUserStateT.o().n(), concertCampaignUserStateT.o().r().q(), concertCampaignUserStateT.o().q().q(), concertCampaignUserStateT.o().p());
                        break;
                    case 3:
                        w6dVar = b7d.a;
                        break;
                    case 4:
                        w6dVar = c7d.a;
                        break;
                    case 5:
                        switch (concertCampaignUserStateT.p().o().ordinal()) {
                            case 1:
                                i5 = 2;
                                break;
                            case 2:
                                i5 = 3;
                                break;
                            case 3:
                                i5 = 4;
                                break;
                            case 4:
                                i5 = 5;
                                break;
                            case 5:
                                break;
                            case 6:
                                i5 = 7;
                                break;
                            default:
                                i5 = 1;
                                break;
                        }
                        w6dVar = new x6d(i5);
                        break;
                    case 6:
                        h290<CampaignUserStatePurchase> h290VarO = concertCampaignUserStateT.q().o();
                        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                        for (CampaignUserStatePurchase campaignUserStatePurchase : h290VarO) {
                            arrayList.add(new g6d(campaignUserStatePurchase.n(), campaignUserStatePurchase.o()));
                        }
                        z6dVar = new y6d(concertCampaignUserStateT.q().p(), arrayList);
                        w6dVar = z6dVar;
                        break;
                    default:
                        w6dVar = a7d.a;
                        break;
                }
                String strN = concertCampaignUserStateT.n();
                return new jek(w6dVar, ihc1.y0(strN) ? null : strN);
            case 1:
                Location locationR = Location.r(bArr);
                String name = locationR.getName();
                int iN = locationR.n();
                if ((iN != 0 ? wpk.a[l1d.C(iN)] : -1) == 1) {
                    PhysicalLocation physicalLocationO = locationR.o();
                    String strN2 = physicalLocationO.n();
                    LatLon latLonP = physicalLocationO.p();
                    rntVar = new rnt(strN2, new ugb0(latLonP.o(), latLonP.p()));
                } else {
                    rntVar = mpi1.Y0;
                }
                return new lhe0(name, rntVar, locationR.q() ? locationR.p() : null);
            case 2:
                List imageList = Marketing.o(bArr).n().getImageList();
                int iS2 = zno1.s(q7h.U(imageList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                Iterator it = imageList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ifk ifkVar = ifk.b;
                    ifk ifkVar2 = ifk.c;
                    ifk ifkVar3 = ifk.d;
                    ifk ifkVar4 = ifk.a;
                    if (!zHasNext) {
                        String str2 = (String) linkedHashMap.get(ifkVar);
                        String str3 = (String) linkedHashMap.get(ifkVar2);
                        String str4 = (String) linkedHashMap.get(ifkVar3);
                        String str5 = (String) linkedHashMap.get(ifkVar4);
                        return new jfk(str5 != null ? str5 : "", str2, str3, str4);
                    }
                    Image image = (Image) it.next();
                    int i7 = xpk.a[image.o().ordinal()];
                    if (i7 != 1) {
                        ifkVar = i7 != 2 ? i7 != 3 ? ifkVar4 : ifkVar3 : ifkVar2;
                    }
                    linkedHashMap.put(ifkVar, y6b1.i(zno1.z(image.n().t())).toString());
                }
                break;
            case 3:
                h290<Performer> h290VarN = PerformerGroup.o(bArr).n();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                for (Performer performer : h290VarN) {
                    String strP = performer.p();
                    int i8 = gqk.a[performer.n().ordinal()];
                    arrayList2.add(new mks0(strP, i8 != 1 ? i8 != 2 ? 1 : 3 : 2, performer.o()));
                }
                return new fqk(arrayList2);
            case 4:
                ConsumptionExperienceTrait consumptionExperienceTraitR = ConsumptionExperienceTrait.r(bArr);
                ytw0 ytw0Var = jfv.b;
                long jL0 = fdg1.l0(consumptionExperienceTraitR.getDuration().p(), ngv.e);
                List listO = consumptionExperienceTraitR.o();
                ArrayList arrayList3 = new ArrayList(q7h.U(listO, 10));
                for (g4m g4mVar : (AbstractList) listO) {
                    g4mVar.getClass();
                    int iOrdinal = g4mVar.ordinal();
                    if (iOrdinal == 0) {
                        ellVar = ell.a;
                    } else if (iOrdinal == 1) {
                        ellVar = ell.b;
                    } else if (iOrdinal == 2) {
                        ellVar = ell.c;
                    } else if (iOrdinal != 3) {
                        ellVar = iOrdinal != 4 ? ell.f : ell.e;
                    } else {
                        ellVar = ell.d;
                    }
                    arrayList3.add(ellVar);
                }
                h290<Genre> h290VarQ = consumptionExperienceTraitR.q();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarQ, 10));
                for (Genre genre : h290VarQ) {
                    genre.getClass();
                    arrayList4.add(new gll(genre.getName(), genre.getUri()));
                }
                d290<he30> d290VarP = consumptionExperienceTraitR.p();
                ArrayList arrayList5 = new ArrayList(q7h.U(d290VarP, 10));
                for (he30 he30Var : d290VarP) {
                    he30Var.getClass();
                    int iOrdinal2 = he30Var.ordinal();
                    if (iOrdinal2 == 0) {
                        fllVar = fll.a;
                    } else if (iOrdinal2 == 1) {
                        fllVar = fll.b;
                    } else if (iOrdinal2 == 2) {
                        fllVar = fll.c;
                    } else if (iOrdinal2 == 3) {
                        fllVar = fll.d;
                    } else if (iOrdinal2 != 4) {
                        fllVar = iOrdinal2 != 5 ? fll.g : fll.f;
                    } else {
                        fllVar = fll.e;
                    }
                    arrayList5.add(fllVar);
                }
                return new hll(jL0, arrayList3, arrayList4, arrayList5);
            case 5:
                Metadata.ContentAccessStatus contentAccessStatusP = Metadata.ContentAccessStatus.p(bArr);
                if (contentAccessStatusP.o()) {
                    kqlVar = kql.a;
                } else if (contentAccessStatusP.n()) {
                    kqlVar = hql.a;
                } else {
                    kqlVar = contentAccessStatusP.getSerializedSize() > 0 ? jql.a : iql.a;
                }
                return new bql(kqlVar);
            case 6:
                h290<ContentAlternative> h290VarN2 = ContentAlternatives.o(bArr).n();
                ArrayList arrayList6 = new ArrayList(q7h.U(h290VarN2, 10));
                for (ContentAlternative contentAlternative : h290VarN2) {
                    String uri = contentAlternative.getUri();
                    String strP2 = contentAlternative.p();
                    int iO = contentAlternative.o();
                    arrayList6.add(new xql(uri, strP2, (iO == 0 ? -1 : zql.a[l1d.C(iO)]) == 1 ? new zy3(contentAlternative.n().p(), contentAlternative.n().o()) : null));
                }
                return new yql(arrayList6);
            case 7:
                return new hrl(ContentByOrAbout.o(bArr).n());
            case 8:
                ContentCapabilityTrait contentCapabilityTraitS = ContentCapabilityTrait.s(bArr);
                return new prl(e(contentCapabilityTraitS.p()), e(contentCapabilityTraitS.n()), e(contentCapabilityTraitS.q()), e(contentCapabilityTraitS.r()), e(contentCapabilityTraitS.o()));
            case 9:
                int iOrdinal3 = ContentExperienceTrait.o(bArr).n().ordinal();
                if (iOrdinal3 == 0) {
                    ktlVar = ktl.a;
                } else if (iOrdinal3 == 1) {
                    ktlVar = ktl.b;
                } else if (iOrdinal3 != 2) {
                    if (iOrdinal3 != 3) {
                        eg.o();
                        return null;
                    }
                    ktlVar = ktl.a;
                } else {
                    ktlVar = ktl.c;
                }
                return new mtl(ktlVar);
            case 10:
                ContentTypeTrait contentTypeTraitP = ContentTypeTrait.p(bArr);
                contentTypeTraitP.getClass();
                switch (contentTypeTraitP.o().ordinal()) {
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
                        i4 = 6;
                        break;
                    case 6:
                        i4 = 7;
                        break;
                    case 7:
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                return new iam(i4);
            case 11:
                return new xmm(SupportedBadges.o(bArr).n());
            case 12:
                Badge badgeQ = Badge.q(bArr);
                return new zmm(badgeQ.o(), badgeQ.n(), badgeQ.p());
            case 13:
                h290 h290VarN3 = CoverImage.o(bArr).n();
                int iS3 = zno1.s(q7h.U(h290VarN3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                Iterator it2 = h290VarN3.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    zdn zdnVar = zdn.b;
                    zdn zdnVar2 = zdn.c;
                    zdn zdnVar3 = zdn.d;
                    zdn zdnVar4 = zdn.a;
                    if (!zHasNext2) {
                        String str6 = (String) linkedHashMap2.get(zdnVar);
                        String str7 = (String) linkedHashMap2.get(zdnVar2);
                        String str8 = (String) linkedHashMap2.get(zdnVar3);
                        String str9 = (String) linkedHashMap2.get(zdnVar4);
                        return new den(str9 != null ? str9 : "", str6, str7, str8);
                    }
                    com.spotify.extendedmetadata.extensions.coverimageimpl.proto.Image image2 = (com.spotify.extendedmetadata.extensions.coverimageimpl.proto.Image) it2.next();
                    int i9 = rdn.a[image2.o().ordinal()];
                    if (i9 != 1) {
                        zdnVar = i9 != 2 ? i9 != 3 ? zdnVar4 : zdnVar3 : zdnVar2;
                    }
                    linkedHashMap2.put(zdnVar, y6b1.i(zno1.z(image2.n().t())).toString());
                }
                break;
            case 14:
                List itemsList = CreatorAppearsOn.o(bArr).n().getItemsList();
                ArrayList arrayList7 = new ArrayList(q7h.U(itemsList, 10));
                Iterator it3 = itemsList.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(new di51(((SectionItem) it3.next()).getUri()));
                }
                return new jxn(new fg51(arrayList7));
            case 15:
                h290<ArtistFact> h290VarN4 = GetArtistFactsResponse.o(bArr).n();
                ArrayList arrayList8 = new ArrayList(q7h.U(h290VarN4, 10));
                for (ArtistFact artistFact : h290VarN4) {
                    artistFact.getClass();
                    int iP = artistFact.p();
                    switch (iP == 0 ? -1 : vxn.a[l1d.C(iP)]) {
                        case 1:
                            mxnVar = new mxn(artistFact.o().o());
                            break;
                        case 2:
                            mxnVar = oxn.a;
                            break;
                        case 3:
                            mxnVar = new pxn(artistFact.r().o(), artistFact.r().p());
                            break;
                        case 4:
                            mxnVar = new qxn(artistFact.s().o(), artistFact.s().p());
                            break;
                        case 5:
                            mxnVar = sxn.a;
                            break;
                        case 6:
                            int iN2 = artistFact.n().n();
                            int i10 = iN2 == 0 ? -1 : vxn.b[l1d.C(iN2)];
                            if (i10 == 1) {
                                i = 1;
                            } else if (i10 == 2) {
                                i = 2;
                            } else {
                                if (i10 != 3) {
                                    eg.o();
                                    return null;
                                }
                                i = 3;
                            }
                            mxnVar = new lxn(i);
                            break;
                        case 7:
                            mxnVar = nxn.a;
                            break;
                        case 8:
                            mxnVar = rxn.a;
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                    arrayList8.add(new kxn(mxnVar, artistFact.q()));
                }
                return new uxn(arrayList8);
            case 16:
                CreatorFanFunding creatorFanFundingO = CreatorFanFunding.o(bArr);
                return new o0o(creatorFanFundingO.getUrl(), creatorFanFundingO.n());
            case 17:
                CreatorPinnedItem creatorPinnedItemA = CreatorPinnedItem.A(bArr);
                return new o2o(creatorPinnedItemA.y(), creatorPinnedItemA.getUri(), creatorPinnedItemA.getTitle(), creatorPinnedItemA.getSubtitle(), creatorPinnedItemA.v(), creatorPinnedItemA.x(), creatorPinnedItemA.n(), creatorPinnedItemA.p(), creatorPinnedItemA.t(), creatorPinnedItemA.s().q(), creatorPinnedItemA.q(), creatorPinnedItemA.u(), creatorPinnedItemA.r(), creatorPinnedItemA.o(), creatorPinnedItemA.z() ? Long.valueOf(creatorPinnedItemA.w()) : null);
            case 18:
                List itemsList2 = CreatorPlaylists.o(bArr).n().getItemsList();
                ArrayList arrayList9 = new ArrayList(q7h.U(itemsList2, 10));
                Iterator it4 = itemsList2.iterator();
                while (it4.hasNext()) {
                    arrayList9.add(new xh51(((spotify.creators.v1.creatorplaylists.SectionItem) it4.next()).getUri()));
                }
                return new q2o(new bg51(arrayList9));
            case 19:
                CreditsTrait creditsTraitP = CreditsTrait.p(bArr);
                h290<Contributor> h290VarN5 = creditsTraitP.n();
                ArrayList arrayList10 = new ArrayList(q7h.U(h290VarN5, 10));
                for (Contributor contributor : h290VarN5) {
                    arrayList10.add(new g7o(contributor.getName(), contributor.getRole(), contributor.hasUri() ? contributor.getUri() : null, contributor.hasUrl() ? contributor.getUrl() : null, contributor.p() ? new h7o(contributor.n().getName()) : null, contributor.o() ? f7o.a : null));
                }
                h290 h290VarO2 = creditsTraitP.o();
                ArrayList arrayList11 = new ArrayList(q7h.U(h290VarO2, 10));
                Iterator it5 = h290VarO2.iterator();
                while (it5.hasNext()) {
                    arrayList11.add(new i7o(((CreditsSource) it5.next()).getName()));
                }
                return new j7o(arrayList10, arrayList11);
            case 20:
                CuepointsOuterClass$Cuepoints cuepointsOuterClass$CuepointsT = CuepointsOuterClass$Cuepoints.t(bArr);
                xeo xeoVarF = cuepointsOuterClass$CuepointsT.r() ? f(cuepointsOuterClass$CuepointsT.n()) : null;
                xeo xeoVarF2 = cuepointsOuterClass$CuepointsT.s() ? f(cuepointsOuterClass$CuepointsT.o()) : null;
                h290<CuepointsOuterClass$Cuepoint> h290VarP = cuepointsOuterClass$CuepointsT.p();
                ArrayList arrayList12 = new ArrayList(q7h.U(h290VarP, 10));
                for (CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint : h290VarP) {
                    cuepointsOuterClass$Cuepoint.getClass();
                    arrayList12.add(f(cuepointsOuterClass$Cuepoint));
                }
                h290<CuepointsOuterClass$Cuepoint> h290VarQ2 = cuepointsOuterClass$CuepointsT.q();
                ArrayList arrayList13 = new ArrayList(q7h.U(h290VarQ2, 10));
                for (CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint2 : h290VarQ2) {
                    cuepointsOuterClass$Cuepoint2.getClass();
                    arrayList13.add(f(cuepointsOuterClass$Cuepoint2));
                }
                return new yeo(xeoVarF, xeoVarF2, arrayList12, arrayList13);
            case 21:
                DetailedEvaluationTrait detailedEvaluationTraitP = DetailedEvaluationTrait.p(bArr);
                String description = detailedEvaluationTraitP.getDescription();
                h290<com.spotify.contentagnostic.v2.Image> h290VarO3 = detailedEvaluationTraitP.o();
                ArrayList arrayList14 = new ArrayList(q7h.U(h290VarO3, 10));
                for (com.spotify.contentagnostic.v2.Image image3 : h290VarO3) {
                    image3.getClass();
                    arrayList14.add(z1p1.y(image3));
                }
                return new pnt(description, arrayList14);
            case 22:
                DisplaySegmentsExtension displaySegmentsExtensionR = DisplaySegmentsExtension.r(bArr);
                String strO = displaySegmentsExtensionR.o();
                h290<DisplaySegment> h290VarQ3 = displaySegmentsExtensionR.q();
                ArrayList arrayList15 = new ArrayList(q7h.U(h290VarQ3, 10));
                for (DisplaySegment displaySegment : h290VarQ3) {
                    displaySegment.getClass();
                    String uri2 = displaySegment.getUri();
                    int iOrdinal4 = displaySegment.r().ordinal();
                    if (iOrdinal4 == 0) {
                        i2 = 1;
                    } else if (iOrdinal4 == 1) {
                        i2 = 2;
                    } else if (iOrdinal4 == 2) {
                        i2 = 3;
                    } else {
                        if (iOrdinal4 != 3) {
                            eg.o();
                            return null;
                        }
                        i2 = 4;
                    }
                    arrayList15.add(new zju(uri2, i2, displaySegment.n(), displaySegment.p(), displaySegment.q(), displaySegment.getTitle(), displaySegment.getSubtitle(), displaySegment.getImageUrl(), Boolean.valueOf(displaySegment.o())));
                }
                return new bku(strO, arrayList15, displaySegmentsExtensionR.n(), new aku(displaySegmentsExtensionR.p().getCanUpsell()));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new efv(DuplicateItemsTrait.o(bArr).n());
            case 24:
                EntityBookmarks entityBookmarksQ = EntityBookmarks.q(bArr);
                int iN3 = entityBookmarksQ.n();
                int i11 = iN3 != 0 ? ldy.a[l1d.C(iN3)] : -1;
                if (i11 == 1) {
                    String uri3 = entityBookmarksQ.o().getUri();
                    h290<BookmarkItem> h290VarN6 = entityBookmarksQ.o().n();
                    ArrayList arrayList16 = new ArrayList(q7h.U(h290VarN6, 10));
                    for (BookmarkItem bookmarkItem : h290VarN6) {
                        bookmarkItem.getClass();
                        arrayList16.add(d(bookmarkItem));
                    }
                    return new idy(uri3, arrayList16);
                }
                if (i11 != 2) {
                    int iN4 = entityBookmarksQ.n();
                    if (iN4 == 1) {
                        str = "EPISODE_BOOKMARKS";
                    } else if (iN4 != 2) {
                        str = iN4 != 3 ? "null" : "BODY_NOT_SET";
                    } else {
                        str = "SHOW_BOOKMARKS";
                    }
                    throw new InvalidProtocolBufferException("Unsupported case: ".concat(str));
                }
                String uri4 = entityBookmarksQ.p().getUri();
                h290<EpisodeBookmarks> h290VarO4 = entityBookmarksQ.p().o();
                ArrayList arrayList17 = new ArrayList(q7h.U(h290VarO4, 10));
                for (EpisodeBookmarks episodeBookmarks : h290VarO4) {
                    episodeBookmarks.getClass();
                    String uri5 = episodeBookmarks.getUri();
                    h290<BookmarkItem> h290VarN7 = episodeBookmarks.n();
                    ArrayList arrayList18 = new ArrayList(q7h.U(h290VarN7, 10));
                    for (BookmarkItem bookmarkItem2 : h290VarN7) {
                        bookmarkItem2.getClass();
                        arrayList18.add(d(bookmarkItem2));
                    }
                    arrayList17.add(new idy(uri5, arrayList18));
                }
                return new jdy(uri4, arrayList17);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                int i12 = tdy.a[EntityCapping.o(bArr).n().ordinal()];
                if (i12 == -1) {
                    i6 = 1;
                } else if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        eg.o();
                        return null;
                    }
                    i6 = 1;
                }
                return new sdy(i6);
            case 26:
                switch (EntityTypeTrait.o(bArr).n().ordinal()) {
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
                        i4 = 6;
                        break;
                    case 6:
                        i4 = 7;
                        break;
                    case 7:
                    case 8:
                    default:
                        i4 = 1;
                        break;
                    case 9:
                        break;
                    case 10:
                        i4 = 9;
                        break;
                    case 11:
                        i4 = 10;
                        break;
                    case 12:
                        i4 = 11;
                        break;
                    case 13:
                        i4 = 12;
                        break;
                    case 14:
                        i4 = 13;
                        break;
                    case 15:
                        i4 = 14;
                        break;
                    case 16:
                        i4 = 15;
                        break;
                    case 17:
                        i4 = 16;
                        break;
                    case 18:
                        i4 = 17;
                        break;
                    case 19:
                        i4 = 18;
                        break;
                }
                return new hzy(i4);
            case 27:
                EpisodeAdPlacements episodeAdPlacementsR = EpisodeAdPlacements.r(bArr);
                int iN5 = episodeAdPlacementsR.n();
                h290<AdPlacement> h290VarQ4 = episodeAdPlacementsR.q();
                ArrayList arrayList19 = new ArrayList(q7h.U(h290VarQ4, 10));
                for (AdPlacement adPlacement : h290VarQ4) {
                    arrayList19.add(new wu0(adPlacement.p(), adPlacement.n(), adPlacement.o()));
                }
                return new o1z(iN5, episodeAdPlacementsR.p(), episodeAdPlacementsR.o(), arrayList19);
            case 28:
                EpisodeTranscriptsMetadata episodeTranscriptsMetadataP = EpisodeTranscriptsMetadata.p(bArr);
                String strN3 = episodeTranscriptsMetadataP.n();
                h290<EpisodeTranscriptMetadata> h290VarO5 = episodeTranscriptsMetadataP.o();
                ArrayList arrayList20 = new ArrayList(q7h.U(h290VarO5, 10));
                for (EpisodeTranscriptMetadata episodeTranscriptMetadata : h290VarO5) {
                    episodeTranscriptMetadata.getClass();
                    arrayList20.add(new cdz(episodeTranscriptMetadata.getUri(), episodeTranscriptMetadata.getLanguage(), episodeTranscriptMetadata.n(), episodeTranscriptMetadata.q(), episodeTranscriptMetadata.o(), episodeTranscriptMetadata.p()));
                }
                return new ddz(strN3, arrayList20);
            default:
                Metadata.Episode episodeA = Metadata.Episode.A(bArr);
                String strG = g(episodeA.t());
                y6b1 y6b1Var = new y6b1(v6b1.I1, g(episodeA.t()), 0);
                String name2 = episodeA.getName();
                kdz kdzVar = episodeA.hasShow() ? new kdz(episodeA.y().getName(), new y6b1(v6b1.H1, g(episodeA.y().r()), 0)) : null;
                h290<Metadata.AudioFile> h290VarN8 = episodeA.n();
                ArrayList arrayList21 = new ArrayList(q7h.U(h290VarN8, 10));
                for (Metadata.AudioFile audioFile : h290VarN8) {
                    audioFile.getClass();
                    arrayList21.add(c(audioFile));
                }
                List<Metadata.VideoFile> videoList = episodeA.getVideoList();
                ArrayList arrayList22 = new ArrayList(q7h.U(videoList, 10));
                for (Metadata.VideoFile videoFile : videoList) {
                    videoFile.getClass();
                    arrayList22.add(new ldz(zno1.z(videoFile.n().t())));
                }
                h290<Metadata.AudioFile> h290VarO6 = episodeA.o();
                ArrayList arrayList23 = new ArrayList(q7h.U(h290VarO6, 10));
                for (Metadata.AudioFile audioFile2 : h290VarO6) {
                    audioFile2.getClass();
                    arrayList23.add(c(audioFile2));
                }
                Metadata.ImageGroup imageGroupQ = episodeA.q();
                if (imageGroupQ.getImageCount() <= 0) {
                    imageGroupQ = null;
                }
                den denVarT = boo1.t(imageGroupQ);
                boolean zR = episodeA.r();
                int iOrdinal5 = episodeA.z().ordinal();
                if (iOrdinal5 == 0) {
                    i3 = 1;
                } else if (iOrdinal5 == 1) {
                    i3 = 2;
                } else {
                    if (iOrdinal5 != 2) {
                        eg.o();
                        return null;
                    }
                    i3 = 3;
                }
                boolean zV = episodeA.v();
                boolean zU = episodeA.u();
                String description2 = episodeA.getDescription();
                long duration = episodeA.getDuration();
                idz idzVar = new idz(episodeA.x().getYear(), episodeA.x().r(), episodeA.x().n(), episodeA.x().p(), episodeA.x().q());
                List<Metadata.ContentRating> listP = episodeA.p();
                ArrayList arrayList24 = new ArrayList(q7h.U(listP, 10));
                for (Metadata.ContentRating contentRating : listP) {
                    arrayList24.add(new hdz(contentRating.n(), contentRating.o()));
                }
                String strZ = zno1.z(episodeA.w().o().t());
                String strS = episodeA.s();
                String str10 = strS == null ? "" : strS;
                String language = episodeA.getLanguage();
                return new mdz(y6b1Var, strG, name2, kdzVar, denVarT, arrayList21, arrayList22, arrayList23, zR, i3, zV, zU, description2, duration, idzVar, arrayList24, strZ, str10, language == null ? "" : language);
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 241;
            case 1:
                return 123;
            case 2:
                return 124;
            case 3:
                return 125;
            case 4:
                return 182;
            case 5:
                return 267;
            case 6:
                return 103;
            case 7:
                return 211;
            case 8:
                return 239;
            case 9:
                return 249;
            case 10:
                return 127;
            case 11:
                return 146;
            case 12:
                return 147;
            case 13:
                return 79;
            case 14:
                return 203;
            case 15:
                return 255;
            case 16:
                return 199;
            case 17:
                return 201;
            case 18:
                return 200;
            case 19:
                return 186;
            case 20:
                return 28;
            case 21:
                return 184;
            case 22:
                return 38;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return 159;
            case 24:
                return 157;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return 133;
            case 26:
                return 220;
            case 27:
                return 207;
            case 28:
                return 21;
            default:
                return 12;
        }
    }

    public final Class type() {
        switch (this.a) {
            case 0:
                return jek.class;
            case 1:
                return lhe0.class;
            case 2:
                return jfk.class;
            case 3:
                return fqk.class;
            case 4:
                return hll.class;
            case 5:
                return bql.class;
            case 6:
                return yql.class;
            case 7:
                return hrl.class;
            case 8:
                return prl.class;
            case 9:
                return mtl.class;
            case 10:
                return iam.class;
            case 11:
                return xmm.class;
            case 12:
                return zmm.class;
            case 13:
                return den.class;
            case 14:
                return jxn.class;
            case 15:
                return uxn.class;
            case 16:
                return o0o.class;
            case 17:
                return o2o.class;
            case 18:
                return q2o.class;
            case 19:
                return j7o.class;
            case 20:
                return yeo.class;
            case 21:
                return pnt.class;
            case 22:
                return bku.class;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return efv.class;
            case 24:
                return kdy.class;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return sdy.class;
            case 26:
                return hzy.class;
            case 27:
                return o1z.class;
            case 28:
                return ddz.class;
            default:
                return mdz.class;
        }
    }
}
