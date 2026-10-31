package p;

import com.google.protobuf.Timestamp;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeShowMetadata;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.cosmos.util.proto.TrackAlbumMetadata;
import com.spotify.cosmos.util.proto.TrackArtistMetadata;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.cosmos.util.proto.TrackPlayState;
import com.spotify.playlist.proto.Capabilities;
import com.spotify.playlist.proto.FormatListAttribute;
import com.spotify.playlist.proto.Member;
import com.spotify.playlist.proto.PlaylistMembersResponse;
import com.spotify.playlist.proto.PlaylistMetadata;
import com.spotify.playlist.proto.PlaylistOfflineState;
import com.spotify.playlist.proto.PlaylistRequest;
import com.spotify.playlist.proto.PlaylistRequest$AvailableConcepts;
import com.spotify.playlist.proto.PlaylistRequest$AvailableSignal;
import com.spotify.playlist.proto.PlaylistRequest$Item;
import com.spotify.playlist.proto.PlaylistRequest$ItemCollectionState;
import com.spotify.playlist.proto.PlaylistRequest$ItemOfflineState;
import com.spotify.playlist.proto.PlaylistRequest$LensState;
import com.spotify.playlist.proto.PlaylistRequest$Playlist;
import com.spotify.playlist.proto.PlaylistRequest$RecommendationItem;
import com.spotify.playlist.proto.PlaylistRequest$Response;
import com.spotify.playlist.proto.ProvidedSortOrder;
import com.spotify.playlist.proto.ProvidedTagDefinition;
import com.spotify.playlist.proto.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wo30 implements thy0 {
    public final lv00 a;
    public final yn4 b;

    public wo30(lv00 lv00Var, yn4 yn4Var) {
        this.a = lv00Var;
        this.b = yn4Var;
    }

    public static ben a(ImageGroup imageGroup) {
        if (imageGroup == null) {
            return new ben();
        }
        String standardLink = imageGroup.getStandardLink();
        if (standardLink == null) {
            standardLink = "";
        }
        String smallLink = imageGroup.getSmallLink();
        if (smallLink == null) {
            smallLink = "";
        }
        String largeLink = imageGroup.getLargeLink();
        if (largeLink == null) {
            largeLink = "";
        }
        String xlargeLink = imageGroup.getXlargeLink();
        return new ben(standardLink, smallLink, largeLink, xlargeLink != null ? xlargeLink : "");
    }

    public static String g(List list, vp70 vp70Var) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((up70) next).b != vp70Var);
        up70 up70Var = (up70) next;
        if (up70Var != null) {
            return up70Var.a.a;
        }
        return null;
    }

    public static ltt0 h(PlayabilityRestriction playabilityRestriction) {
        switch (playabilityRestriction == null ? -1 : to30.f[playabilityRestriction.ordinal()]) {
            case 1:
                return ltt0.d;
            case 2:
                return ltt0.c;
            case 3:
                return ltt0.b;
            case 4:
                return ltt0.e;
            case 5:
                return ltt0.g;
            case 6:
                return ltt0.f;
            default:
                return ltt0.a;
        }
    }

    public static ben i(mq70 mq70Var) {
        String strG = g(mq70Var.a, vp70.b);
        List list = mq70Var.a;
        String strG2 = g(list, vp70.d);
        String strG3 = g(list, vp70.e);
        String strG4 = g(list, vp70.c);
        if (strG4 == null) {
            strG4 = "";
        }
        return new ben(strG4, strG, strG2, strG3);
    }

    public static ArrayList j(h290 h290Var) {
        ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            Extension extension = (Extension) it.next();
            arrayList.add(new jz00(extension.getData().t(), extension.getExtensionKind().getNumber()));
        }
        return arrayList;
    }

    public static ArrayList k(h290 h290Var) {
        int i;
        ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            PlaylistRequest$AvailableSignal playlistRequest$AvailableSignal = (PlaylistRequest$AvailableSignal) it.next();
            String name = playlistRequest$AvailableSignal.getName();
            int i2 = to30.g[playlistRequest$AvailableSignal.o().ordinal()];
            byte[] bArrT = null;
            if (i2 != -1) {
                i = 1;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        eg.o();
                        return null;
                    }
                }
            } else {
                i = 3;
            }
            if (playlistRequest$AvailableSignal.hasData()) {
                bArrT = playlistRequest$AvailableSignal.getData().t();
            }
            arrayList.add(new ll81(i, name, bArrT));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:368:0x0624 A[LOOP:4: B:366:0x061e->B:368:0x0624, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:371:0x0641  */
    /* JADX WARN: Code duplicated, block: B:373:0x064e  */
    /* JADX WARN: Code duplicated, block: B:375:0x0654  */
    /* JADX WARN: Code duplicated, block: B:376:0x0659  */
    /* JADX WARN: Code duplicated, block: B:379:0x0660  */
    /* JADX WARN: Code duplicated, block: B:380:0x0665  */
    /* JADX WARN: Code duplicated, block: B:383:0x066c  */
    /* JADX WARN: Code duplicated, block: B:384:0x0671  */
    /* JADX WARN: Code duplicated, block: B:386:0x0674  */
    /* JADX WARN: Code duplicated, block: B:387:0x067b  */
    /* JADX WARN: Code duplicated, block: B:389:0x0682  */
    /* JADX WARN: Code duplicated, block: B:390:0x0687  */
    /* JADX WARN: Code duplicated, block: B:393:0x0692  */
    /* JADX WARN: Code duplicated, block: B:394:0x0697  */
    /* JADX WARN: Code duplicated, block: B:396:0x069a  */
    /* JADX WARN: Code duplicated, block: B:397:0x069d  */
    /* JADX WARN: Code duplicated, block: B:400:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:401:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:403:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:404:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:407:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:410:0x06d3 A[LOOP:8: B:408:0x06cd->B:410:0x06d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:413:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:416:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:418:0x070f  */
    /* JADX WARN: Code duplicated, block: B:420:0x0718  */
    /* JADX WARN: Code duplicated, block: B:422:0x071c  */
    /* JADX WARN: Code duplicated, block: B:423:0x0722  */
    /* JADX WARN: Code duplicated, block: B:425:0x072e  */
    /* JADX WARN: Code duplicated, block: B:426:0x0730  */
    /* JADX WARN: Code duplicated, block: B:433:0x0741  */
    /* JADX WARN: Code duplicated, block: B:436:0x0748  */
    /* JADX WARN: Code duplicated, block: B:440:0x0758  */
    /* JADX WARN: Code duplicated, block: B:443:0x0761  */
    /* JADX WARN: Code duplicated, block: B:446:0x0774  */
    /* JADX WARN: Code duplicated, block: B:448:0x0784  */
    /* JADX WARN: Code duplicated, block: B:453:0x0794  */
    /* JADX WARN: Code duplicated, block: B:455:0x0797  */
    /* JADX WARN: Code duplicated, block: B:456:0x0799  */
    /* JADX WARN: Code duplicated, block: B:458:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:461:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:462:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:468:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:469:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:471:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:472:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:475:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:478:0x07ff A[LOOP:11: B:476:0x07f9->B:478:0x07ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:481:0x081a  */
    /* JADX WARN: Code duplicated, block: B:484:0x082e  */
    /* JADX WARN: Code duplicated, block: B:485:0x0831  */
    /* JADX WARN: Code duplicated, block: B:488:0x0839  */
    /* JADX WARN: Code duplicated, block: B:489:0x083c  */
    /* JADX WARN: Code duplicated, block: B:494:0x0891  */
    /* JADX WARN: Code duplicated, block: B:497:0x091b A[LOOP:6: B:495:0x0915->B:497:0x091b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:501:0x0951  */
    /* JADX WARN: Code duplicated, block: B:505:0x0961  */
    /* JADX WARN: Code duplicated, block: B:507:0x0976  */
    /* JADX WARN: Code duplicated, block: B:508:0x0979  */
    /* JADX WARN: Code duplicated, block: B:509:0x097c  */
    /* JADX WARN: Code duplicated, block: B:510:0x097f  */
    /* JADX WARN: Code duplicated, block: B:511:0x0982  */
    /* JADX WARN: Code duplicated, block: B:512:0x0985  */
    /* JADX WARN: Code duplicated, block: B:513:0x0988  */
    /* JADX WARN: Code duplicated, block: B:514:0x098b  */
    /* JADX WARN: Code duplicated, block: B:515:0x098e  */
    /* JADX WARN: Code duplicated, block: B:516:0x0991  */
    /* JADX WARN: Code duplicated, block: B:520:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:521:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:547:0x074b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x076e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r33v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r56v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r9v0, types: [p.z6x] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    public final wsc0 b(PlaylistRequest$Response playlistRequest$Response) {
        lv00 lv00Var;
        boolean z;
        ?? r13;
        ?? L1;
        x7i1 x7i1Var;
        List listL1;
        x7i1 x7i1Var2;
        ArrayList arrayListK;
        Timestamp createdAt;
        ArrayList arrayList;
        boolean zR;
        PlaylistMetadata playlistMetadataQ;
        PlaylistOfflineState playlistOfflineStateR;
        PlaylistRequest$LensState playlistRequest$LensStateP;
        String str;
        ImageGroup imageGroupZ;
        User userX;
        x4i1 x4i1VarE;
        User userV;
        x4i1 x4i1VarE2;
        LinkedHashMap linkedHashMap;
        ?? r41;
        ArrayList arrayList2;
        PlaylistRequest$LensState playlistRequest$LensState;
        String offline;
        int syncProgress;
        e3c0 e3c0Var;
        String link;
        String str2;
        String name;
        String str3;
        kby kbyVar;
        ArrayList arrayList3;
        Iterator it;
        String id;
        String name2;
        Integer numValueOf;
        uod1 uod1Var;
        ArrayList arrayList4;
        String strN;
        String name3;
        String str4;
        boolean z2;
        gby gbyVar;
        kby kbyVar2;
        smc0 smc0VarN;
        int iS;
        LinkedHashMap linkedHashMap2;
        Integer numValueOf2;
        dlc0 dlc0Var;
        ArrayList arrayList5;
        Iterator it2;
        fbp1 fbp1VarJ;
        Iterator it3;
        PlaylistRequest$Item playlistRequest$Item;
        xif1 xif1Var;
        mq70 mq70Var;
        ?? L2;
        lkj0 fjf1Var;
        List list;
        List list2;
        f1z f1zVar;
        e1z e1zVar;
        String description;
        k1z k1zVar;
        mq70 mq70Var2;
        List list3;
        List list4;
        pc41 pc41Var;
        lkj0 lkj0Var;
        String name4;
        List list5;
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = playlistRequest$Response.w().iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            lv00Var = this.a;
            if (!zHasNext) {
                break;
            }
            PlaylistRequest$Item playlistRequest$Item2 = (PlaylistRequest$Item) it4.next();
            playlistRequest$Item2.getClass();
            jv00 jv00VarA = lv00Var.a(j(playlistRequest$Item2.getExtensionList()));
            PlaylistRequest$ItemOfflineState playlistRequest$ItemOfflineStateV = playlistRequest$Item2.v();
            fbp1 fbp1VarJ2 = ucp1.j(playlistRequest$ItemOfflineStateV.getSyncProgress(), playlistRequest$ItemOfflineStateV.getOffline());
            if (playlistRequest$Item2.H() && playlistRequest$Item2.A().hasOffline()) {
                PlaylistRequest$ItemOfflineState playlistRequest$ItemOfflineStateA = playlistRequest$Item2.A();
                fbp1VarJ = ucp1.j(playlistRequest$ItemOfflineStateA.getSyncProgress(), playlistRequest$ItemOfflineStateA.getOffline());
            } else {
                fbp1VarJ = null;
            }
            TrackMetadata trackMetadataY = playlistRequest$Item2.F() ? playlistRequest$Item2.y() : null;
            TrackPlayState trackPlayStateZ = playlistRequest$Item2.G() ? playlistRequest$Item2.z() : null;
            PlaylistRequest$ItemCollectionState playlistRequest$ItemCollectionStateQ = playlistRequest$Item2.C() ? playlistRequest$Item2.q() : null;
            ngv ngvVar = ngv.SECONDS;
            ell ellVar = ell.d;
            ltt0 ltt0VarH = ltt0.a;
            yn4 yn4Var = this.b;
            if (trackMetadataY == null) {
                it3 = it4;
                playlistRequest$Item = playlistRequest$Item2;
                fjf1Var = null;
            } else {
                List<TrackArtistMetadata> artistList = trackMetadataY.getArtistList();
                ArrayList arrayList7 = new ArrayList();
                for (TrackArtistMetadata trackArtistMetadata : artistList) {
                    arrayList7.add(trackArtistMetadata == null ? new yif1() : new yif1(trackArtistMetadata.getName()));
                    playlistRequest$Item2 = playlistRequest$Item2;
                    it4 = it4;
                }
                it3 = it4;
                playlistRequest$Item = playlistRequest$Item2;
                TrackAlbumMetadata album = trackMetadataY.hasAlbum() ? trackMetadataY.getAlbum() : null;
                if (album == null) {
                    xif1Var = new xif1();
                } else {
                    xkk1 xkk1Var = (xkk1) (yn4Var.b() ? jv00VarA.a(xkk1.class) : null);
                    xif1Var = new xif1(album.getName(), (xkk1Var == null || (mq70Var = xkk1Var.a) == null) ? a(album.hasCovers() ? album.getCovers() : null) : i(mq70Var));
                }
                boolean z3 = trackPlayStateZ == null || !trackPlayStateZ.hasIsPlayable() || trackPlayStateZ.getIsPlayable();
                ltt0 ltt0VarH2 = trackPlayStateZ != null ? h(trackPlayStateZ.getPlayabilityRestriction()) : ltt0VarH;
                jo70 jo70Var = (jo70) (yn4Var.b() ? jv00VarA.a(jo70.class) : null);
                hll hllVar = (hll) (yn4Var.b() ? jv00VarA.a(hll.class) : null);
                boolean is19PlusOnly = (hllVar == null || (list2 = hllVar.b) == null) ? trackMetadataY.getIs19PlusOnly() : list2.contains(ellVar);
                if (jo70Var == null || (list = jo70Var.d) == null) {
                    L2 = o7h.l1(arrayList7);
                } else {
                    L2 = new ArrayList(q7h.U(list, 10));
                    for (Iterator it5 = r2.iterator(); it5.hasNext(); it5 = it5) {
                        L2.add(new yif1(((ho70) it5.next()).a));
                    }
                }
                fjf1Var = new fjf1(xif1Var, L2, playlistRequest$ItemCollectionStateQ != null ? playlistRequest$ItemCollectionStateQ.getIsBanned() : false, z3, ltt0VarH2, trackMetadataY.getPlayable(), is19PlusOnly, trackMetadataY.getIsPremiumOnly(), trackMetadataY.getPreviewId(), hllVar != null ? (int) jfv.u(hllVar.a, ngvVar) : trackMetadataY.getLength());
            }
            EpisodeMetadata episodeMetadataS = playlistRequest$Item.D() ? playlistRequest$Item.s() : null;
            EpisodePlayState episodePlayStateT = playlistRequest$Item.E() ? playlistRequest$Item.t() : null;
            if (episodeMetadataS == null) {
                k1zVar = null;
            } else {
                EpisodeShowMetadata show = episodeMetadataS.hasShow() ? episodeMetadataS.getShow() : null;
                if (show == null) {
                    f1zVar = new f1z("", "", "", new ben());
                } else {
                    ben benVarA = a(show.hasCovers() ? show.getCovers() : null);
                    String link2 = show.getLink();
                    String name5 = show.getName();
                    String publisher = show.getPublisher();
                    if (publisher == null) {
                        publisher = "";
                    }
                    f1zVar = new f1z(link2, name5, publisher, benVarA);
                }
                if (episodeMetadataS.hasMediaTypeEnum()) {
                    int i = to30.d[episodeMetadataS.getMediaTypeEnum().ordinal()];
                    e1zVar = i != 1 ? i != 2 ? e1z.c : e1z.b : e1z.a;
                } else {
                    e1zVar = e1z.c;
                }
                EpisodeMetadata.EpisodeType episodeType = episodeMetadataS.hasEpisodeType() ? episodeMetadataS.getEpisodeType() : EpisodeMetadata.EpisodeType.UNKNOWN;
                episodeType.getClass();
                h1z h1zVar = to30.e[episodeType.ordinal()] == 1 ? h1z.a : h1z.b;
                if (episodePlayStateT != null) {
                    ltt0VarH = h(episodePlayStateT.getPlayabilityRestriction());
                }
                ltt0 ltt0Var = ltt0VarH;
                Integer numValueOf3 = (episodePlayStateT == null || !episodePlayStateT.hasTimeLeft() || episodePlayStateT.getTimeLeft() < 0) ? null : Integer.valueOf(episodePlayStateT.getTimeLeft());
                jo70 jo70Var2 = (jo70) (yn4Var.b() ? jv00VarA.a(jo70.class) : null);
                hzy hzyVar = (hzy) (yn4Var.b() ? jv00VarA.a(hzy.class) : null);
                xkk1 xkk1Var2 = (xkk1) (yn4Var.b() ? jv00VarA.a(xkk1.class) : null);
                zoy0 zoy0Var = (zoy0) (yn4Var.b() ? jv00VarA.a(zoy0.class) : null);
                hll hllVar2 = (hll) (yn4Var.b() ? jv00VarA.a(hll.class) : null);
                String str5 = ((jo70Var2 == null || (description = jo70Var2.c) == null) && (description = episodeMetadataS.getDescription()) == null) ? "" : description;
                boolean is19PlusOnly2 = (hllVar2 == null || (list4 = hllVar2.b) == null) ? episodeMetadataS.getIs19PlusOnly() : list4.contains(ellVar);
                boolean isBookChapter = hzyVar != null ? hzyVar.a == 6 : episodeMetadataS.getIsBookChapter();
                int publishDate = (int) (zoy0Var != null ? zoy0Var.c : episodeMetadataS.getPublishDate());
                int iU = hllVar2 != null ? (int) jfv.u(hllVar2.a, ngvVar) : episodeMetadataS.getLength();
                if (hllVar2 != null && (list3 = hllVar2.d) != null) {
                    e1zVar = list3.equals(k4p1.x(fll.c)) ? e1z.b : list3.equals(k4p1.x(fll.b)) ? e1z.a : e1z.c;
                }
                e1z e1zVar2 = e1zVar;
                k1zVar = new k1z((xkk1Var2 == null || (mq70Var2 = xkk1Var2.a) == null) ? a(episodeMetadataS.hasCovers() ? episodeMetadataS.getCovers() : null) : i(mq70Var2), str5, episodeMetadataS.getPreviewId(), is19PlusOnly2, episodePlayStateT != null ? episodePlayStateT.getIsPlayable() : false, ltt0Var, episodeMetadataS.getAvailable(), iU, numValueOf3, episodePlayStateT != null ? episodePlayStateT.getIsPlayed() : false, episodePlayStateT != null ? Long.valueOf(episodePlayStateT.getLastPlayedAt()) : null, isBookChapter, publishDate, f1zVar, e1zVar2, h1zVar);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            if (playlistRequest$Item.getFormatListAttributesCount() > 0) {
                for (FormatListAttribute formatListAttribute : playlistRequest$Item.getFormatListAttributesList()) {
                    linkedHashMap3.put(formatListAttribute.getKey(), formatListAttribute.getValue());
                }
            }
            ArrayList arrayListK2 = k(playlistRequest$Item.getAvailableSignalsList());
            int iO = playlistRequest$Item.B() ? playlistRequest$Item.o() : 0;
            User userP = playlistRequest$Item.hasAddedBy() ? playlistRequest$Item.p() : null;
            x4i1 x4i1VarE3 = userP == null ? null : e(userP);
            if (playlistRequest$Item.hasSaveSource()) {
                int i2 = to30.b[playlistRequest$Item.getSaveSource().o().ordinal()];
                pc41Var = new pc41(i2 != 1 ? i2 != 2 ? 0 : 2 : 1);
            } else {
                pc41Var = null;
            }
            if (fjf1Var != null) {
                lkj0Var = fjf1Var;
            } else if (k1zVar != null) {
                lkj0Var = k1zVar;
            } else {
                fjf1Var = hkj0.a;
                lkj0Var = fjf1Var;
            }
            jo70 jo70Var3 = (jo70) (yn4Var.b() ? jv00VarA.a(jo70.class) : null);
            hll hllVar3 = (hll) (yn4Var.b() ? jv00VarA.a(hll.class) : null);
            arrayList6.add(new zuc0(playlistRequest$Item.w(), iO, playlistRequest$Item.getUri(), x4i1VarE3, playlistRequest$Item.getIsRecommendation(), arrayListK2, sqg0.U(linkedHashMap3), pc41Var, ((jo70Var3 == null || (name4 = jo70Var3.a) == null) && (name4 = playlistRequest$Item.u().getName()) == null) ? "" : name4, playlistRequest$Item.r().getIsCurated(), (hllVar3 == null || (list5 = hllVar3.b) == null) ? playlistRequest$Item.u().getIsExplicit() : list5.contains(ell.b), playlistRequest$Item.v().getLocallyPlayable(), playlistRequest$Item.x(), fbp1VarJ2, fbp1VarJ, lkj0Var, jv00VarA));
            it4 = it3;
        }
        PlaylistRequest$Playlist playlistRequest$PlaylistC = playlistRequest$Response.hasPlaylist() ? playlistRequest$Response.C() : null;
        PlaylistMetadata playlistMetadataQ2 = (playlistRequest$PlaylistC == null || !playlistRequest$PlaylistC.t()) ? null : playlistRequest$PlaylistC.q();
        Boolean boolValueOf = playlistRequest$Response.I() ? Boolean.valueOf(playlistRequest$Response.v()) : null;
        int i3 = to30.c[(playlistRequest$Response.K() ? playlistRequest$Response.B() : s2q0.UNKNOWN).ordinal()];
        r2q0 r2q0Var = r2q0.a;
        if (i3 != -1) {
            z = true;
            if (i3 == 1) {
                r2q0Var = r2q0.c;
            } else if (i3 == 2) {
                r2q0Var = r2q0.b;
            } else if (i3 != 3) {
                if (i3 != 4 && i3 != 5) {
                    eg.o();
                    return null;
                }
                r2q0Var = r2q0.d;
            }
        } else {
            z = true;
        }
        r2q0 r2q0Var2 = r2q0Var;
        Boolean boolValueOf2 = playlistRequest$Response.hasPlayable() ? Boolean.valueOf(playlistRequest$Response.getPlayable()) : null;
        vls0 vls0VarP = playlistRequest$Response.H() ? playlistRequest$Response.p().p() : vls0.UNKNOWN;
        boolean zL = playlistRequest$Response.L();
        ?? arrayList8 = z6x.a;
        if (zL) {
            x7i1 x7i1VarF = f(playlistRequest$Response.G());
            if (x7i1VarF == null) {
                x7i1Var = new x7i1(false, null, null, false, false, false, false, false, 8191);
            } else {
                x7i1Var2 = x7i1VarF;
            }
            arrayListK = k(playlistRequest$Response.getAvailableSignalsList());
            createdAt = playlistRequest$Response.getCreatedAt();
            h290<PlaylistRequest$AvailableConcepts> h290VarO = playlistRequest$Response.o();
            arrayList = new ArrayList(q7h.U(h290VarO, 10));
            for (PlaylistRequest$AvailableConcepts playlistRequest$AvailableConcepts : h290VarO) {
                arrayList.add(new o5k(playlistRequest$AvailableConcepts.o(), playlistRequest$AvailableConcepts.p()));
            }
            zR = playlistRequest$Response.r();
            if (playlistRequest$PlaylistC == null) {
                if (playlistRequest$PlaylistC.t()) {
                    playlistMetadataQ = playlistRequest$PlaylistC.q();
                } else {
                    playlistMetadataQ = null;
                }
                if (playlistRequest$PlaylistC.u()) {
                    playlistOfflineStateR = playlistRequest$PlaylistC.r();
                } else {
                    playlistOfflineStateR = null;
                }
                if (playlistRequest$PlaylistC.s()) {
                    playlistRequest$LensStateP = playlistRequest$PlaylistC.p();
                } else {
                    playlistRequest$LensStateP = null;
                }
                if (playlistMetadataQ == null) {
                    kbyVar2 = new kby(null, -1);
                } else {
                    str = null;
                    if (playlistMetadataQ.J()) {
                        imageGroupZ = playlistMetadataQ.z();
                    } else {
                        imageGroupZ = null;
                    }
                    ben benVarA2 = a(imageGroupZ);
                    if (playlistMetadataQ.I()) {
                        userX = playlistMetadataQ.x();
                    } else {
                        userX = null;
                    }
                    if (userX == null) {
                        x4i1VarE = null;
                    } else {
                        x4i1VarE = e(userX);
                    }
                    if (playlistMetadataQ.H()) {
                        userV = playlistMetadataQ.v();
                    } else {
                        userV = null;
                    }
                    if (userV == null) {
                        x4i1VarE2 = null;
                    } else {
                        x4i1VarE2 = e(userV);
                    }
                    linkedHashMap = new LinkedHashMap();
                    if (playlistMetadataQ.getFormatListAttributesCount() > 0) {
                        for (FormatListAttribute formatListAttribute2 : playlistMetadataQ.getFormatListAttributesList()) {
                            linkedHashMap.put(formatListAttribute2.getKey(), formatListAttribute2.getValue());
                        }
                    }
                    if (playlistMetadataQ.B() > 0) {
                        h290<ProvidedSortOrder> h290VarC = playlistMetadataQ.C();
                        arrayList4 = new ArrayList();
                        for (ProvidedSortOrder providedSortOrder : h290VarC) {
                            strN = providedSortOrder.n();
                            if (providedSortOrder.p()) {
                                strN.getClass();
                                if (strN.length() > 0) {
                                    str = strN;
                                }
                            }
                            if (str == null) {
                                gbyVar = null;
                            } else {
                                name3 = providedSortOrder.getName();
                                if (name3 == null) {
                                    str4 = "";
                                } else {
                                    str4 = name3;
                                }
                                if (providedSortOrder.q() || providedSortOrder.o()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                gbyVar = new gby(str4, str, z2);
                            }
                            if (gbyVar != null) {
                                arrayList4.add(gbyVar);
                            }
                            arrayList6 = arrayList6;
                            playlistRequest$LensStateP = playlistRequest$LensStateP;
                            str = null;
                        }
                        r41 = arrayList4;
                    } else {
                        r41 = arrayList8;
                    }
                    arrayList2 = arrayList6;
                    playlistRequest$LensState = playlistRequest$LensStateP;
                    if (playlistMetadataQ.D() > 0) {
                        h290<ProvidedTagDefinition> h290VarE = playlistMetadataQ.E();
                        arrayList8 = new ArrayList();
                        for (ProvidedTagDefinition providedTagDefinition : h290VarE) {
                            id = providedTagDefinition.getId();
                            if (providedTagDefinition.q()) {
                                id.getClass();
                                if (id.length() > 0 || !providedTagDefinition.r()) {
                                    id = null;
                                }
                            } else {
                                id = null;
                            }
                            if (id == null) {
                                uod1Var = null;
                            } else {
                                name2 = providedTagDefinition.getName();
                                if (name2 == null) {
                                    name2 = "";
                                }
                                int iO2 = providedTagDefinition.o();
                                if (providedTagDefinition.p()) {
                                    numValueOf = Integer.valueOf(providedTagDefinition.n());
                                } else {
                                    numValueOf = null;
                                }
                                uod1Var = new uod1(iO2, id, numValueOf, name2);
                            }
                            if (uod1Var != null) {
                                arrayList8.add(uod1Var);
                            }
                        }
                    }
                    ?? r56 = arrayList8;
                    if (playlistOfflineStateR != null) {
                        offline = playlistOfflineStateR.getOffline();
                    } else {
                        offline = null;
                    }
                    if (playlistOfflineStateR != null) {
                        syncProgress = playlistOfflineStateR.getSyncProgress();
                    } else {
                        syncProgress = 0;
                    }
                    wls0 wls0VarD = d(vls0VarP);
                    jv00 jv00VarA2 = lv00Var.a(j(playlistMetadataQ.getExtensionList()));
                    if (playlistRequest$LensState != null) {
                        h290 h290VarP = playlistRequest$LensState.p();
                        arrayList3 = new ArrayList(q7h.U(h290VarP, 10));
                        it = h290VarP.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(new y2c0(((PlaylistRequest.Lens) it.next()).getName()));
                        }
                        e3c0Var = new e3c0(arrayList3);
                    } else {
                        e3c0Var = new e3c0();
                    }
                    e3c0 e3c0Var2 = e3c0Var;
                    long jQ = createdAt.q();
                    boolean zT = playlistMetadataQ.t();
                    link = playlistMetadataQ.getLink();
                    if (link == null) {
                        str2 = "";
                    } else {
                        str2 = link;
                    }
                    name = playlistMetadataQ.getName();
                    if (name == null) {
                        str3 = "";
                    } else {
                        str3 = name;
                    }
                    kbyVar = new kby(str2, str3, playlistMetadataQ.getDescription(), benVarA2, x4i1VarE, zT, playlistMetadataQ.getFollowed(), playlistMetadataQ.A(), playlistMetadataQ.p(), playlistMetadataQ.w(), playlistMetadataQ.y(), boolValueOf2, boolValueOf, r2q0Var2, playlistMetadataQ.q(), playlistMetadataQ.s(), sqg0.U(linkedHashMap), r41, ucp1.j(syncProgress, offline), playlistMetadataQ.F(), x4i1VarE2, wls0VarD, x7i1Var2, jv00VarA2, e3c0Var2, arrayListK, playlistMetadataQ.o(), jQ, playlistMetadataQ.getDeletedByOwner(), playlistMetadataQ.G(), zR, r56, arrayList);
                }
                smc0VarN = k4p1.n();
                for (PlaylistRequest$RecommendationItem playlistRequest$RecommendationItem : playlistRequest$Response.D()) {
                    fbp1 fbp1VarJ3 = ucp1.j(0, playlistRequest$RecommendationItem.r().getOffline());
                    String link3 = playlistRequest$RecommendationItem.q().getLink();
                    String name6 = playlistRequest$RecommendationItem.q().getName();
                    boolean isCurated = playlistRequest$RecommendationItem.q().getIsCurated();
                    String previewId = playlistRequest$RecommendationItem.q().getPreviewId();
                    boolean is19PlusOnly3 = playlistRequest$RecommendationItem.q().getIs19PlusOnly();
                    boolean isExplicit = playlistRequest$RecommendationItem.q().getIsExplicit();
                    boolean isBanned = playlistRequest$RecommendationItem.p().getIsBanned();
                    ben benVarA3 = a(playlistRequest$RecommendationItem.q().getAlbum().getCovers());
                    boolean isPremiumOnly = playlistRequest$RecommendationItem.q().getIsPremiumOnly();
                    boolean isPlayable = playlistRequest$RecommendationItem.s().getIsPlayable();
                    List artistList2 = playlistRequest$RecommendationItem.q().getArtistList();
                    arrayList5 = new ArrayList(q7h.U(artistList2, 10));
                    it2 = artistList2.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(((TrackArtistMetadata) it2.next()).getName());
                    }
                    smc0VarN.add(new q111(link3, name6, previewId, benVarA3, is19PlusOnly3, isBanned, isCurated, isExplicit, isPremiumOnly, isPlayable, arrayList5, fbp1VarJ3, playlistRequest$RecommendationItem.o()));
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                h290<eru0> h290VarA = playlistRequest$Response.A();
                iS = zno1.s(q7h.U(h290VarA, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap2 = new LinkedHashMap(iS);
                for (eru0 eru0Var : h290VarA) {
                    switch (to30.a[eru0Var.h().ordinal()]) {
                        case 1:
                            dlc0Var = dlc0.a;
                            break;
                        case 2:
                            dlc0Var = dlc0.b;
                            break;
                        case 3:
                            dlc0Var = dlc0.c;
                            break;
                        case 4:
                            dlc0Var = dlc0.d;
                            break;
                        case 5:
                            dlc0Var = dlc0.e;
                            break;
                        case 6:
                            dlc0Var = dlc0.f;
                            break;
                        case 7:
                            dlc0Var = dlc0.g;
                            break;
                        case 8:
                            dlc0Var = dlc0.h;
                            break;
                        case 9:
                            dlc0Var = dlc0.t;
                            break;
                        default:
                            dlc0Var = dlc0.i;
                            break;
                    }
                    mmr0 mmr0VarN = oqn1.n(dlc0Var, Integer.valueOf(eru0Var.i()));
                    linkedHashMap2.put(mmr0VarN.a, mmr0VarN.b);
                }
                List listL2 = o7h.l1(arrayList2);
                long jT = playlistRequest$Response.t();
                List listL3 = o7h.l1(smc0VarK);
                boolean zY = playlistRequest$Response.y();
                int iF = playlistRequest$Response.F();
                int iE = playlistRequest$Response.E();
                long jX = playlistRequest$Response.x();
                boolean zU = playlistRequest$Response.u();
                int iP = playlistRequest$Response.q().p();
                if (playlistRequest$Response.J()) {
                    numValueOf2 = Integer.valueOf(playlistRequest$Response.z());
                } else {
                    numValueOf2 = null;
                }
                return new wsc0(iF, playlistRequest$Response.C().q().u(), iE, zY, listL2, kbyVar, jT, numValueOf2, zU, linkedHashMap2, jX, listL3, iP, 8192);
            }
            kbyVar2 = new kby(null, -1);
            kbyVar = kbyVar2;
            arrayList2 = arrayList6;
            smc0VarN = k4p1.n();
            while (r1.hasNext()) {
                fbp1 fbp1VarJ4 = ucp1.j(0, playlistRequest$RecommendationItem.r().getOffline());
                String link4 = playlistRequest$RecommendationItem.q().getLink();
                String name7 = playlistRequest$RecommendationItem.q().getName();
                boolean isCurated2 = playlistRequest$RecommendationItem.q().getIsCurated();
                String previewId2 = playlistRequest$RecommendationItem.q().getPreviewId();
                boolean is19PlusOnly4 = playlistRequest$RecommendationItem.q().getIs19PlusOnly();
                boolean isExplicit2 = playlistRequest$RecommendationItem.q().getIsExplicit();
                boolean isBanned2 = playlistRequest$RecommendationItem.p().getIsBanned();
                ben benVarA4 = a(playlistRequest$RecommendationItem.q().getAlbum().getCovers());
                boolean isPremiumOnly2 = playlistRequest$RecommendationItem.q().getIsPremiumOnly();
                boolean isPlayable2 = playlistRequest$RecommendationItem.s().getIsPlayable();
                List artistList3 = playlistRequest$RecommendationItem.q().getArtistList();
                arrayList5 = new ArrayList(q7h.U(artistList3, 10));
                it2 = artistList3.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((TrackArtistMetadata) it2.next()).getName());
                }
                smc0VarN.add(new q111(link4, name7, previewId2, benVarA4, is19PlusOnly4, isBanned2, isCurated2, isExplicit2, isPremiumOnly2, isPlayable2, arrayList5, fbp1VarJ4, playlistRequest$RecommendationItem.o()));
            }
            smc0 smc0VarK2 = k4p1.k(smc0VarN);
            h290<eru0> h290VarA2 = playlistRequest$Response.A();
            iS = zno1.s(q7h.U(h290VarA2, 10));
            if (iS < 16) {
                iS = 16;
            }
            linkedHashMap2 = new LinkedHashMap(iS);
            while (r1.hasNext()) {
                switch (to30.a[eru0Var.h().ordinal()]) {
                    case 1:
                        dlc0Var = dlc0.a;
                        break;
                    case 2:
                        dlc0Var = dlc0.b;
                        break;
                    case 3:
                        dlc0Var = dlc0.c;
                        break;
                    case 4:
                        dlc0Var = dlc0.d;
                        break;
                    case 5:
                        dlc0Var = dlc0.e;
                        break;
                    case 6:
                        dlc0Var = dlc0.f;
                        break;
                    case 7:
                        dlc0Var = dlc0.g;
                        break;
                    case 8:
                        dlc0Var = dlc0.h;
                        break;
                    case 9:
                        dlc0Var = dlc0.t;
                        break;
                    default:
                        dlc0Var = dlc0.i;
                        break;
                }
                mmr0 mmr0VarN2 = oqn1.n(dlc0Var, Integer.valueOf(eru0Var.i()));
                linkedHashMap2.put(mmr0VarN2.a, mmr0VarN2.b);
            }
            List listL4 = o7h.l1(arrayList2);
            long jT2 = playlistRequest$Response.t();
            List listL5 = o7h.l1(smc0VarK2);
            boolean zY2 = playlistRequest$Response.y();
            int iF2 = playlistRequest$Response.F();
            int iE2 = playlistRequest$Response.E();
            long jX2 = playlistRequest$Response.x();
            boolean zU2 = playlistRequest$Response.u();
            int iP2 = playlistRequest$Response.q().p();
            if (playlistRequest$Response.J()) {
                numValueOf2 = Integer.valueOf(playlistRequest$Response.z());
            } else {
                numValueOf2 = null;
            }
            return new wsc0(iF2, playlistRequest$Response.C().q().u(), iE2, zY2, listL4, kbyVar, jT2, numValueOf2, zU2, linkedHashMap2, jX2, listL5, iP2, 8192);
        }
        boolean zW = playlistMetadataQ2 != null ? playlistMetadataQ2.w() : false;
        boolean collaborative = playlistMetadataQ2 != null ? playlistMetadataQ2.getCollaborative() : false;
        exc0 exc0Var = new exc0(zW, zW, zW);
        boolean z4 = (zW || collaborative) ? z : false;
        t0z t0zVar = wls0.h;
        if (zW) {
            listL1 = o7h.l1(t0zVar);
        } else {
            r13 = arrayList8;
        }
        if (zW) {
            r13 = listL1;
            L1 = o7h.l1(t0zVar);
        } else {
            r13 = listL1;
            L1 = arrayList8;
        }
        x7i1Var = new x7i1(z4, exc0Var, new rc50(r13, L1), false, false, false, false, false, 7729);
        x7i1Var2 = x7i1Var;
        arrayListK = k(playlistRequest$Response.getAvailableSignalsList());
        createdAt = playlistRequest$Response.getCreatedAt();
        h290<PlaylistRequest$AvailableConcepts> h290VarO2 = playlistRequest$Response.o();
        arrayList = new ArrayList(q7h.U(h290VarO2, 10));
        while (r8.hasNext()) {
            arrayList.add(new o5k(playlistRequest$AvailableConcepts.o(), playlistRequest$AvailableConcepts.p()));
        }
        zR = playlistRequest$Response.r();
        if (playlistRequest$PlaylistC == null) {
            if (playlistRequest$PlaylistC.t()) {
                playlistMetadataQ = playlistRequest$PlaylistC.q();
            } else {
                playlistMetadataQ = null;
            }
            if (playlistRequest$PlaylistC.u()) {
                playlistOfflineStateR = playlistRequest$PlaylistC.r();
            } else {
                playlistOfflineStateR = null;
            }
            if (playlistRequest$PlaylistC.s()) {
                playlistRequest$LensStateP = playlistRequest$PlaylistC.p();
            } else {
                playlistRequest$LensStateP = null;
            }
            if (playlistMetadataQ == null) {
                kbyVar2 = new kby(null, -1);
            } else {
                str = null;
                if (playlistMetadataQ.J()) {
                    imageGroupZ = playlistMetadataQ.z();
                } else {
                    imageGroupZ = null;
                }
                ben benVarA5 = a(imageGroupZ);
                if (playlistMetadataQ.I()) {
                    userX = playlistMetadataQ.x();
                } else {
                    userX = null;
                }
                if (userX == null) {
                    x4i1VarE = null;
                } else {
                    x4i1VarE = e(userX);
                }
                if (playlistMetadataQ.H()) {
                    userV = playlistMetadataQ.v();
                } else {
                    userV = null;
                }
                if (userV == null) {
                    x4i1VarE2 = null;
                } else {
                    x4i1VarE2 = e(userV);
                }
                linkedHashMap = new LinkedHashMap();
                if (playlistMetadataQ.getFormatListAttributesCount() > 0) {
                    while (r14.hasNext()) {
                        linkedHashMap.put(formatListAttribute2.getKey(), formatListAttribute2.getValue());
                    }
                }
                if (playlistMetadataQ.B() > 0) {
                    h290<ProvidedSortOrder> h290VarC2 = playlistMetadataQ.C();
                    arrayList4 = new ArrayList();
                    while (r11.hasNext()) {
                        strN = providedSortOrder.n();
                        if (providedSortOrder.p()) {
                            strN.getClass();
                            if (strN.length() > 0) {
                                str = strN;
                            }
                        }
                        if (str == null) {
                            gbyVar = null;
                        } else {
                            name3 = providedSortOrder.getName();
                            if (name3 == null) {
                                str4 = "";
                            } else {
                                str4 = name3;
                            }
                            if (providedSortOrder.q()) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            gbyVar = new gby(str4, str, z2);
                        }
                        if (gbyVar != null) {
                            arrayList4.add(gbyVar);
                        }
                        arrayList6 = arrayList6;
                        playlistRequest$LensStateP = playlistRequest$LensStateP;
                        str = null;
                    }
                    r41 = arrayList4;
                } else {
                    r41 = arrayList8;
                }
                arrayList2 = arrayList6;
                playlistRequest$LensState = playlistRequest$LensStateP;
                if (playlistMetadataQ.D() > 0) {
                    h290<ProvidedTagDefinition> h290VarE2 = playlistMetadataQ.E();
                    arrayList8 = new ArrayList();
                    while (r1.hasNext()) {
                        id = providedTagDefinition.getId();
                        if (providedTagDefinition.q()) {
                            id.getClass();
                            if (id.length() > 0) {
                                id = null;
                            } else {
                                id = null;
                            }
                        } else {
                            id = null;
                        }
                        if (id == null) {
                            uod1Var = null;
                        } else {
                            name2 = providedTagDefinition.getName();
                            if (name2 == null) {
                                name2 = "";
                            }
                            int iO3 = providedTagDefinition.o();
                            if (providedTagDefinition.p()) {
                                numValueOf = Integer.valueOf(providedTagDefinition.n());
                            } else {
                                numValueOf = null;
                            }
                            uod1Var = new uod1(iO3, id, numValueOf, name2);
                        }
                        if (uod1Var != null) {
                            arrayList8.add(uod1Var);
                        }
                    }
                }
                ?? r57 = arrayList8;
                if (playlistOfflineStateR != null) {
                    offline = playlistOfflineStateR.getOffline();
                } else {
                    offline = null;
                }
                if (playlistOfflineStateR != null) {
                    syncProgress = playlistOfflineStateR.getSyncProgress();
                } else {
                    syncProgress = 0;
                }
                wls0 wls0VarD2 = d(vls0VarP);
                jv00 jv00VarA3 = lv00Var.a(j(playlistMetadataQ.getExtensionList()));
                if (playlistRequest$LensState != null) {
                    h290 h290VarP2 = playlistRequest$LensState.p();
                    arrayList3 = new ArrayList(q7h.U(h290VarP2, 10));
                    it = h290VarP2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new y2c0(((PlaylistRequest.Lens) it.next()).getName()));
                    }
                    e3c0Var = new e3c0(arrayList3);
                } else {
                    e3c0Var = new e3c0();
                }
                e3c0 e3c0Var3 = e3c0Var;
                long jQ2 = createdAt.q();
                boolean zT2 = playlistMetadataQ.t();
                link = playlistMetadataQ.getLink();
                if (link == null) {
                    str2 = "";
                } else {
                    str2 = link;
                }
                name = playlistMetadataQ.getName();
                if (name == null) {
                    str3 = "";
                } else {
                    str3 = name;
                }
                kbyVar = new kby(str2, str3, playlistMetadataQ.getDescription(), benVarA5, x4i1VarE, zT2, playlistMetadataQ.getFollowed(), playlistMetadataQ.A(), playlistMetadataQ.p(), playlistMetadataQ.w(), playlistMetadataQ.y(), boolValueOf2, boolValueOf, r2q0Var2, playlistMetadataQ.q(), playlistMetadataQ.s(), sqg0.U(linkedHashMap), r41, ucp1.j(syncProgress, offline), playlistMetadataQ.F(), x4i1VarE2, wls0VarD2, x7i1Var2, jv00VarA3, e3c0Var3, arrayListK, playlistMetadataQ.o(), jQ2, playlistMetadataQ.getDeletedByOwner(), playlistMetadataQ.G(), zR, r57, arrayList);
            }
            smc0VarN = k4p1.n();
            while (r1.hasNext()) {
                fbp1 fbp1VarJ5 = ucp1.j(0, playlistRequest$RecommendationItem.r().getOffline());
                String link5 = playlistRequest$RecommendationItem.q().getLink();
                String name8 = playlistRequest$RecommendationItem.q().getName();
                boolean isCurated3 = playlistRequest$RecommendationItem.q().getIsCurated();
                String previewId3 = playlistRequest$RecommendationItem.q().getPreviewId();
                boolean is19PlusOnly5 = playlistRequest$RecommendationItem.q().getIs19PlusOnly();
                boolean isExplicit3 = playlistRequest$RecommendationItem.q().getIsExplicit();
                boolean isBanned3 = playlistRequest$RecommendationItem.p().getIsBanned();
                ben benVarA6 = a(playlistRequest$RecommendationItem.q().getAlbum().getCovers());
                boolean isPremiumOnly3 = playlistRequest$RecommendationItem.q().getIsPremiumOnly();
                boolean isPlayable3 = playlistRequest$RecommendationItem.s().getIsPlayable();
                List artistList4 = playlistRequest$RecommendationItem.q().getArtistList();
                arrayList5 = new ArrayList(q7h.U(artistList4, 10));
                it2 = artistList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((TrackArtistMetadata) it2.next()).getName());
                }
                smc0VarN.add(new q111(link5, name8, previewId3, benVarA6, is19PlusOnly5, isBanned3, isCurated3, isExplicit3, isPremiumOnly3, isPlayable3, arrayList5, fbp1VarJ5, playlistRequest$RecommendationItem.o()));
            }
            smc0 smc0VarK3 = k4p1.k(smc0VarN);
            h290<eru0> h290VarA3 = playlistRequest$Response.A();
            iS = zno1.s(q7h.U(h290VarA3, 10));
            if (iS < 16) {
                iS = 16;
            }
            linkedHashMap2 = new LinkedHashMap(iS);
            while (r1.hasNext()) {
                switch (to30.a[eru0Var.h().ordinal()]) {
                    case 1:
                        dlc0Var = dlc0.a;
                        break;
                    case 2:
                        dlc0Var = dlc0.b;
                        break;
                    case 3:
                        dlc0Var = dlc0.c;
                        break;
                    case 4:
                        dlc0Var = dlc0.d;
                        break;
                    case 5:
                        dlc0Var = dlc0.e;
                        break;
                    case 6:
                        dlc0Var = dlc0.f;
                        break;
                    case 7:
                        dlc0Var = dlc0.g;
                        break;
                    case 8:
                        dlc0Var = dlc0.h;
                        break;
                    case 9:
                        dlc0Var = dlc0.t;
                        break;
                    default:
                        dlc0Var = dlc0.i;
                        break;
                }
                mmr0 mmr0VarN3 = oqn1.n(dlc0Var, Integer.valueOf(eru0Var.i()));
                linkedHashMap2.put(mmr0VarN3.a, mmr0VarN3.b);
            }
            List listL6 = o7h.l1(arrayList2);
            long jT3 = playlistRequest$Response.t();
            List listL7 = o7h.l1(smc0VarK3);
            boolean zY3 = playlistRequest$Response.y();
            int iF3 = playlistRequest$Response.F();
            int iE3 = playlistRequest$Response.E();
            long jX3 = playlistRequest$Response.x();
            boolean zU3 = playlistRequest$Response.u();
            int iP3 = playlistRequest$Response.q().p();
            if (playlistRequest$Response.J()) {
                numValueOf2 = Integer.valueOf(playlistRequest$Response.z());
            } else {
                numValueOf2 = null;
            }
            return new wsc0(iF3, playlistRequest$Response.C().q().u(), iE3, zY3, listL6, kbyVar, jT3, numValueOf2, zU3, linkedHashMap2, jX3, listL7, iP3, 8192);
        }
        kbyVar2 = new kby(null, -1);
        kbyVar = kbyVar2;
        arrayList2 = arrayList6;
        smc0VarN = k4p1.n();
        while (r1.hasNext()) {
            fbp1 fbp1VarJ6 = ucp1.j(0, playlistRequest$RecommendationItem.r().getOffline());
            String link6 = playlistRequest$RecommendationItem.q().getLink();
            String name9 = playlistRequest$RecommendationItem.q().getName();
            boolean isCurated4 = playlistRequest$RecommendationItem.q().getIsCurated();
            String previewId4 = playlistRequest$RecommendationItem.q().getPreviewId();
            boolean is19PlusOnly6 = playlistRequest$RecommendationItem.q().getIs19PlusOnly();
            boolean isExplicit4 = playlistRequest$RecommendationItem.q().getIsExplicit();
            boolean isBanned4 = playlistRequest$RecommendationItem.p().getIsBanned();
            ben benVarA7 = a(playlistRequest$RecommendationItem.q().getAlbum().getCovers());
            boolean isPremiumOnly4 = playlistRequest$RecommendationItem.q().getIsPremiumOnly();
            boolean isPlayable4 = playlistRequest$RecommendationItem.s().getIsPlayable();
            List artistList5 = playlistRequest$RecommendationItem.q().getArtistList();
            arrayList5 = new ArrayList(q7h.U(artistList5, 10));
            it2 = artistList5.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((TrackArtistMetadata) it2.next()).getName());
            }
            smc0VarN.add(new q111(link6, name9, previewId4, benVarA7, is19PlusOnly6, isBanned4, isCurated4, isExplicit4, isPremiumOnly4, isPlayable4, arrayList5, fbp1VarJ6, playlistRequest$RecommendationItem.o()));
        }
        smc0 smc0VarK4 = k4p1.k(smc0VarN);
        h290<eru0> h290VarA4 = playlistRequest$Response.A();
        iS = zno1.s(q7h.U(h290VarA4, 10));
        if (iS < 16) {
            iS = 16;
        }
        linkedHashMap2 = new LinkedHashMap(iS);
        while (r1.hasNext()) {
            switch (to30.a[eru0Var.h().ordinal()]) {
                case 1:
                    dlc0Var = dlc0.a;
                    break;
                case 2:
                    dlc0Var = dlc0.b;
                    break;
                case 3:
                    dlc0Var = dlc0.c;
                    break;
                case 4:
                    dlc0Var = dlc0.d;
                    break;
                case 5:
                    dlc0Var = dlc0.e;
                    break;
                case 6:
                    dlc0Var = dlc0.f;
                    break;
                case 7:
                    dlc0Var = dlc0.g;
                    break;
                case 8:
                    dlc0Var = dlc0.h;
                    break;
                case 9:
                    dlc0Var = dlc0.t;
                    break;
                default:
                    dlc0Var = dlc0.i;
                    break;
            }
            mmr0 mmr0VarN4 = oqn1.n(dlc0Var, Integer.valueOf(eru0Var.i()));
            linkedHashMap2.put(mmr0VarN4.a, mmr0VarN4.b);
        }
        List listL8 = o7h.l1(arrayList2);
        long jT4 = playlistRequest$Response.t();
        List listL9 = o7h.l1(smc0VarK4);
        boolean zY4 = playlistRequest$Response.y();
        int iF4 = playlistRequest$Response.F();
        int iE4 = playlistRequest$Response.E();
        long jX4 = playlistRequest$Response.x();
        boolean zU4 = playlistRequest$Response.u();
        int iP4 = playlistRequest$Response.q().p();
        if (playlistRequest$Response.J()) {
            numValueOf2 = Integer.valueOf(playlistRequest$Response.z());
        } else {
            numValueOf2 = null;
        }
        return new wsc0(iF4, playlistRequest$Response.C().q().u(), iE4, zY4, listL8, kbyVar, jT4, numValueOf2, zU4, linkedHashMap2, jX4, listL9, iP4, 8192);
    }

    public final iqi0 c(String str, PlaylistMembersResponse playlistMembersResponse) {
        cji0 cji0Var;
        String title = playlistMembersResponse.getTitle();
        int iQ = playlistMembersResponse.q();
        x7i1 x7i1VarF = f(playlistMembersResponse.getCapabilities());
        x7i1 x7i1Var = x7i1VarF == null ? new x7i1(false, null, null, false, false, false, false, false, 8191) : x7i1VarF;
        wls0 wls0VarD = d(playlistMembersResponse.n());
        h290<Member> h290VarP = playlistMembersResponse.p();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
        for (Member member : h290VarP) {
            member.getClass();
            boolean zO = member.o();
            x4i1 x4i1VarE = e(member.r());
            int iP = member.p();
            int numEpisodes = member.getNumEpisodes();
            int iOrdinal = member.n().ordinal();
            if (iOrdinal == 0) {
                cji0Var = cji0.a;
            } else if (iOrdinal == 1) {
                cji0Var = cji0.b;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                cji0Var = cji0.c;
            }
            arrayList.add(new fji0(x4i1VarE, iP, zO, numEpisodes, cji0Var, d(member.q())));
        }
        return new iqi0(str, title, iQ, x7i1Var, wls0VarD, arrayList);
    }

    public final wls0 d(vls0 vls0Var) {
        int iOrdinal = vls0Var.ordinal();
        if (iOrdinal == 0) {
            return wls0.b;
        }
        if (iOrdinal == 1) {
            return wls0.c;
        }
        if (iOrdinal == 2) {
            return wls0.d;
        }
        if (iOrdinal == 3) {
            return wls0.f;
        }
        if (iOrdinal == 4) {
            return wls0.e;
        }
        if (iOrdinal == 5) {
            return wls0.a;
        }
        eg.o();
        return null;
    }

    public final x4i1 e(User user) {
        if (user == null) {
            return new x4i1(127, null, null, null, null, null);
        }
        String displayName = user.getDisplayName();
        boolean z = displayName == null || displayName.length() == 0;
        boolean z2 = !z;
        String username = user.getUsername();
        String str = username == null ? "" : username;
        Integer numValueOf = user.hasColor() ? Integer.valueOf(uah.l(user.getColor(), 255)) : null;
        String strP = user.p();
        String link = user.getLink();
        if (link == null) {
            link = "";
        }
        return new x4i1(numValueOf, link, str, !z ? user.getDisplayName() : str, strP, user.q(), z2);
    }

    public final x7i1 f(Capabilities capabilities) {
        if (capabilities == null) {
            return null;
        }
        boolean zS = capabilities.s();
        boolean zT = capabilities.t();
        boolean zW = capabilities.w();
        boolean zU = capabilities.u();
        boolean zO = capabilities.o();
        boolean zV = capabilities.v();
        boolean zR = capabilities.r();
        boolean zP = capabilities.p();
        boolean zQ = capabilities.q();
        boolean zX = capabilities.x();
        boolean zY = capabilities.y();
        exc0 exc0Var = new exc0(capabilities.B().p().n(), capabilities.B().o().n(), capabilities.B().q().n());
        d290<vls0> d290VarN = capabilities.A().n();
        ArrayList arrayList = new ArrayList(q7h.U(d290VarN, 10));
        for (vls0 vls0Var : d290VarN) {
            vls0Var.getClass();
            arrayList.add(d(vls0Var));
        }
        d290<vls0> d290VarP = capabilities.A().p();
        ArrayList arrayList2 = new ArrayList(q7h.U(d290VarP, 10));
        for (vls0 vls0Var2 : d290VarP) {
            vls0Var2.getClass();
            arrayList2.add(d(vls0Var2));
        }
        return new x7i1(zS, zT, zV, zW, zU, zO, exc0Var, new rc50(arrayList, arrayList2), zR, zP, zQ, zX, zY);
    }
}
