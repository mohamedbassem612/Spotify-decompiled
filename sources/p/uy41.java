package p;

import android.os.Parcelable;
import com.google.protobuf.Int64Value;
import com.spotify.searchview.proto.Album;
import com.spotify.searchview.proto.Artist;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.searchview.proto.AudioShow;
import com.spotify.searchview.proto.Audiobook;
import com.spotify.searchview.proto.AutocompleteQuery;
import com.spotify.searchview.proto.Concert;
import com.spotify.searchview.proto.ConcertCampaign;
import com.spotify.searchview.proto.ConcertCampaignUserState;
import com.spotify.searchview.proto.ConversationStarterItem;
import com.spotify.searchview.proto.DateWithOffset;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.GatingDecision;
import com.spotify.searchview.proto.Genre;
import com.spotify.searchview.proto.Kallax;
import com.spotify.searchview.proto.OnDemand;
import com.spotify.searchview.proto.Playlist;
import com.spotify.searchview.proto.PodcastChapter;
import com.spotify.searchview.proto.RelatedEntity;
import com.spotify.searchview.proto.Section;
import com.spotify.searchview.proto.SectionItem;
import com.spotify.searchview.proto.Snippet;
import com.spotify.searchview.proto.Track;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uy41 {
    public static i6k a(Concert concert) {
        String uri = concert.getUri();
        DateWithOffset dateWithOffsetN = concert.n();
        return new i6k(uri, new j7r(dateWithOffsetN.n(), dateWithOffsetN.p()), concert.getTitle(), concert.getSubtitle());
    }

    public static kw91 c(Snippet snippet) {
        h290<Snippet.Segment> h290VarO = snippet.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (Snippet.Segment segment : h290VarO) {
            arrayList.add(new jp51(segment.getValue(), segment.n()));
        }
        return new kw91(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0286 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x028a  */
    /* JADX WARN: Code duplicated, block: B:104:0x028d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0291  */
    /* JADX WARN: Code duplicated, block: B:107:0x0294  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c6 A[LOOP:3: B:113:0x02c0->B:115:0x02c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:288:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:290:0x06fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x06fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:292:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:294:0x0701  */
    /* JADX WARN: Code duplicated, block: B:295:0x0704  */
    /* JADX WARN: Code duplicated, block: B:297:0x0708  */
    /* JADX WARN: Code duplicated, block: B:298:0x070b  */
    /* JADX WARN: Code duplicated, block: B:299:0x070e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0712  */
    /* JADX WARN: Code duplicated, block: B:304:0x071e  */
    /* JADX WARN: Code duplicated, block: B:306:0x0721  */
    /* JADX WARN: Code duplicated, block: B:308:0x072c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x072e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:310:0x0730  */
    /* JADX WARN: Code duplicated, block: B:313:0x0735  */
    /* JADX WARN: Code duplicated, block: B:315:0x0739  */
    /* JADX WARN: Code duplicated, block: B:318:0x0758  */
    /* JADX WARN: Code duplicated, block: B:320:0x0767 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x0769 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:325:0x0770  */
    /* JADX WARN: Code duplicated, block: B:326:0x0773  */
    /* JADX WARN: Code duplicated, block: B:329:0x077f  */
    /* JADX WARN: Code duplicated, block: B:332:0x078d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x078f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:335:0x0792  */
    /* JADX WARN: Code duplicated, block: B:337:0x0796  */
    /* JADX WARN: Code duplicated, block: B:338:0x0799  */
    /* JADX WARN: Code duplicated, block: B:341:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:342:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:344:0x07be  */
    /* JADX WARN: Code duplicated, block: B:349:0x076c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:92:0x020f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0263  */
    /* JADX WARN: Code duplicated, block: B:94:0x0265 A[PHI: r25
      0x0265: PHI (r25v17 p.lby) = (r25v14 p.lby), (r25v16 p.lby), (r25v16 p.lby), (r25v16 p.lby), (r25v18 p.lby), (r25v18 p.lby), (r25v18 p.lby) binds: [B:93:0x0263, B:85:0x01fb, B:87:0x0201, B:89:0x0205, B:77:0x01c8, B:79:0x01ce, B:81:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0269  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15, types: [p.e940] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48, types: [p.fby] */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47, types: [p.o940] */
    /* JADX WARN: Type inference failed for: r7v50 */
    public final lby b(Entity entity) {
        lby lbyVar;
        o2v0 jb6Var;
        l6k l6kVar;
        iek gekVar;
        aql aqlVar;
        p1g1 p1g1Var;
        tkf1 tkf1Var;
        o2v0 jjf1Var;
        int i;
        o2v0 i53Var;
        int i2;
        du7 du7Var;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        String strQ;
        ?? r22;
        ArrayList arrayList2;
        Iterator it;
        String strO;
        ?? r24;
        o2v0 yf51Var;
        int iQ;
        int i7;
        lby lbyVar2;
        Parcelable qfj1Var;
        lby lbyVarB;
        ei90 ei90Var;
        lby lbyVarB2;
        ei90 ei90Var2;
        String strN;
        ?? r6;
        int iY;
        ?? r7;
        GatingDecision gatingDecisionW;
        int iR;
        int i8;
        ?? o940Var;
        n940 l940Var;
        int iOrdinal;
        k940 k940Var;
        GatingDecision.GatingContext gatingContextP;
        ?? e940Var;
        ArrayList arrayList3;
        int iOrdinal2;
        h940 h940Var;
        int iC;
        Parcelable parcelable;
        lle lleVar;
        String uri = entity.getUri();
        String name = entity.getName();
        String strZ = entity.z();
        String strF = entity.F();
        int iV = entity.v();
        lby lbyVar3 = null;
        switch (iV == 0 ? -1 : ty41.a[l1d.C(iV)]) {
            case -1:
            case 18:
                n57.e("Expected entity type for entity: " + entity);
                return null;
            case 0:
            default:
                eg.o();
                return null;
            case 1:
                lbyVar = null;
                Artist artistO = entity.o();
                boolean zR = artistO.r();
                boolean z = false;
                boolean z2 = artistO.s() && artistO.n().n() == 1;
                if (artistO.s() && artistO.n().n() == 2) {
                    z = true;
                }
                i6k i6kVarA = artistO.u() ? a(artistO.q()) : null;
                if (artistO.t()) {
                    ConcertCampaign concertCampaignO = artistO.o();
                    String uri2 = concertCampaignO.getUri();
                    String name2 = concertCampaignO.getName();
                    String imageUrl = concertCampaignO.getImageUrl();
                    String strO2 = concertCampaignO.o();
                    ConcertCampaignUserState concertCampaignUserStateQ = concertCampaignO.q();
                    int iP = concertCampaignUserStateQ.p();
                    int i9 = iP == 0 ? -1 : ty41.h[l1d.C(iP)];
                    if (i9 == -1) {
                        gekVar = hek.a;
                    } else if (i9 == 1) {
                        gekVar = fek.a;
                    } else if (i9 != 2) {
                        if (i9 != 3) {
                            eg.o();
                            return null;
                        }
                        gekVar = hek.a;
                    } else {
                        gekVar = new gek(concertCampaignUserStateQ.o().o());
                    }
                    l6kVar = new l6k(uri2, name2, imageUrl, strO2, concertCampaignO.p(), gekVar);
                } else {
                    l6kVar = null;
                }
                jb6Var = new jb6(zR, z2, z, i6kVarA, l6kVar);
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO, 10));
                        for (f940 f940Var : (AbstractList) listO) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 2:
                lbyVar = null;
                Track trackG = entity.G();
                boolean zT = trackG.t();
                boolean zD = trackG.D();
                RelatedEntity relatedEntityA = trackG.A();
                ol11 ol11Var = new ol11(relatedEntityA.getUri(), relatedEntityA.getName());
                h290<RelatedEntity> h290VarB = trackG.B();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarB, 10));
                for (RelatedEntity relatedEntity : h290VarB) {
                    arrayList4.add(new ol11(relatedEntity.getUri(), relatedEntity.getName()));
                }
                boolean zX = trackG.x();
                boolean zW = trackG.w();
                OnDemand onDemandY = trackG.y();
                p2q0 p2q0Var = new p2q0(onDemandY.o(), onDemandY.getPlaylistUri());
                boolean z3 = trackG.z();
                int i10 = ty41.e[trackG.r().ordinal()];
                if (i10 == -1) {
                    aqlVar = ypl.a;
                } else if (i10 == 1) {
                    aqlVar = zpl.a;
                } else if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        eg.o();
                        return null;
                    }
                    aqlVar = ypl.a;
                } else {
                    aqlVar = xpl.a;
                }
                aql aqlVar2 = aqlVar;
                String strO3 = trackG.o();
                String str = !ihc1.y0(strO3) ? strO3 : null;
                String strP = trackG.p();
                String str2 = !ihc1.y0(strP) ? strP : null;
                boolean zN = trackG.n();
                kw91 kw91VarC = c(trackG.v());
                int iOrdinal3 = trackG.C().ordinal();
                if (iOrdinal3 == 0) {
                    p1g1Var = m1g1.a;
                } else if (iOrdinal3 == 1) {
                    p1g1Var = i1g1.a;
                } else if (iOrdinal3 == 2) {
                    p1g1Var = j1g1.a;
                } else if (iOrdinal3 == 3) {
                    p1g1Var = n1g1.a;
                } else if (iOrdinal3 != 4) {
                    if (iOrdinal3 != 5) {
                        eg.o();
                        return null;
                    }
                    p1g1Var = m1g1.a;
                } else {
                    p1g1Var = o1g1.a;
                }
                p1g1 p1g1Var2 = p1g1Var;
                int iOrdinal4 = trackG.q().ordinal();
                if (iOrdinal4 == 0) {
                    tkf1Var = skf1.a;
                } else if (iOrdinal4 == 1) {
                    tkf1Var = rkf1.a;
                } else if (iOrdinal4 != 2) {
                    if (iOrdinal4 != 3) {
                        eg.o();
                        return null;
                    }
                    tkf1Var = skf1.a;
                } else {
                    tkf1Var = qkf1.a;
                }
                jjf1Var = new jjf1(zT, zD, ol11Var, arrayList4, zX, zW, p2q0Var, z3, aqlVar2, str, str2, zN, kw91VarC, p1g1Var2, tkf1Var, new kfv(trackG.getDuration().p()), trackG.u());
                jb6Var = jjf1Var;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO2 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO2, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 3:
                lbyVar = null;
                Album albumN = entity.n();
                h290<RelatedEntity> h290VarN = albumN.n();
                ArrayList arrayList5 = new ArrayList(q7h.U(h290VarN, 10));
                for (RelatedEntity relatedEntity2 : h290VarN) {
                    arrayList5.add(new ol11(relatedEntity2.getUri(), relatedEntity2.getName()));
                }
                switch (ty41.f[albumN.t().ordinal()]) {
                    case -1:
                    case 1:
                    case 8:
                        i = 1;
                        break;
                    case 0:
                    default:
                        eg.o();
                        return null;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    case 7:
                        i = 7;
                        break;
                }
                int i11 = ty41.g[albumN.s().ordinal()];
                f53 c53Var = d53.a;
                if (i11 != -1 && i11 != 1) {
                    if (i11 == 2) {
                        c53Var = new c53(albumN.u());
                    } else if (i11 == 3) {
                        c53Var = b53.a;
                    } else if (i11 != 4) {
                        eg.o();
                        return null;
                    }
                }
                i53Var = new i53(arrayList5, i, c53Var, albumN.r(), albumN.p(), albumN.q());
                jb6Var = i53Var;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO3 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO3, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 4:
                lbyVar = null;
                Playlist playlistB = entity.B();
                jb6Var = new tfu0(playlistB.q(), playlistB.p(), playlistB.s(), playlistB.o(), playlistB.r());
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO4 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO4, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 5:
                lbyVar = null;
                Genre genreX = entity.x();
                int i12 = ty41.d[genreX.p().ordinal()];
                if (i12 == -1 || i12 == 1) {
                    i2 = 1;
                } else if (i12 == 2) {
                    i2 = 2;
                } else if (i12 != 3) {
                    if (i12 != 4) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                jb6Var = new ji40(i2, genreX.o());
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO5 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO5, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 6:
                lbyVar = null;
                AudioShow audioShowQ = entity.q();
                jb6Var = new k48(audioShowQ.p(), audioShowQ.n(), audioShowQ.q());
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO6 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO6, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 7:
                lbyVar = null;
                AudioEpisode audioEpisodeP = entity.p();
                String strS = audioEpisodeP.s();
                boolean zP = audioEpisodeP.p();
                kfv kfvVar = new kfv(audioEpisodeP.getDuration().p());
                String description = audioEpisodeP.getDescription();
                wve1 wve1Var = new wve1(audioEpisodeP.r().q());
                boolean zQ = audioEpisodeP.q();
                kw91 kw91VarC2 = c(audioEpisodeP.t());
                boolean zW2 = audioEpisodeP.w();
                String strX = audioEpisodeP.x();
                boolean zN2 = audioEpisodeP.n();
                Int64Value int64ValueU = audioEpisodeP.u();
                Long lValueOf = int64ValueU != null ? Long.valueOf(int64ValueU.o()) : null;
                int iOrdinal5 = audioEpisodeP.v().ordinal();
                if (iOrdinal5 == 0) {
                    du7Var = du7.a;
                } else if (iOrdinal5 == 1) {
                    du7Var = du7.b;
                } else if (iOrdinal5 != 2) {
                    if (iOrdinal5 != 3) {
                        eg.o();
                        return null;
                    }
                    du7Var = du7.a;
                } else {
                    du7Var = du7.c;
                }
                jjf1Var = new cu7(strS, zP, kfvVar, description, wve1Var, zQ, kw91VarC2, zW2, strX, lValueOf, zN2, du7Var);
                jb6Var = jjf1Var;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO7 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO7, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 8:
                lbyVar = null;
                jb6Var = new fww0(entity.D().o());
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO8 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO8, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 9:
                lbyVar = null;
                Audiobook audiobookR = entity.r();
                h290 h290VarO = audiobookR.o();
                boolean zQ2 = audiobookR.q();
                kfv kfvVar2 = new kfv(audiobookR.getDuration().p());
                String description2 = audiobookR.getDescription();
                String strP2 = audiobookR.n().p();
                boolean zN3 = audiobookR.n().n();
                int i13 = ty41.c[audiobookR.t().ordinal()];
                t68 r68Var = s68.a;
                if (i13 != -1 && i13 != 1) {
                    if (i13 == 2) {
                        r68Var = new r68(new wve1(audiobookR.s().q()));
                    } else if (i13 == 3) {
                        r68Var = q68.a;
                    } else if (i13 != 4) {
                        eg.o();
                        return null;
                    }
                }
                i53Var = new v68(h290VarO, zQ2, kfvVar2, description2, strP2, zN3, r68Var, audiobookR.r().o());
                jb6Var = i53Var;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO9 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO9, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 10:
                lbyVar = null;
                AutocompleteQuery autocompleteQueryS = entity.s();
                jb6Var = new k39(autocompleteQueryS.getUri(), c(autocompleteQueryS.o()));
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO10 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO10, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 11:
                Section sectionE = entity.E();
                String strN2 = sectionE.n();
                switch (ty41.i[sectionE.r().ordinal()]) {
                    case -1:
                    case 8:
                    case 9:
                    case 10:
                        i3 = 3;
                        List<SectionItem> itemsList = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        for (SectionItem sectionItem : itemsList) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (!(ei90Var instanceof k39) || (ei90Var instanceof yf51)) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = new ci40(lbyVarB);
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (!(ei90Var2 instanceof k39) || (ei90Var2 instanceof yf51)) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = new qo80(lbyVarB2, sectionItem.p().getSessionId(), sectionItem.p().getMessageId());
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description3 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN2 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN2, 10));
                        it = h290VarN2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description3, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO11 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO11, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 0:
                    default:
                        eg.o();
                        return null;
                    case 1:
                        i3 = 1;
                        List<SectionItem> itemsList2 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt2 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt2, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description4 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN3 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN3, 10));
                        it = h290VarN3.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description4, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO12 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO12, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 2:
                        i3 = 2;
                        List<SectionItem> itemsList3 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt3 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt3, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description5 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN4 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN4, 10));
                        it = h290VarN4.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description5, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO13 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO13, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 3:
                        i3 = 4;
                        List<SectionItem> itemsList4 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt4 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt4, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description6 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN5 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN5, 10));
                        it = h290VarN5.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description6, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO14 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO14, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 4:
                        i3 = 5;
                        List<SectionItem> itemsList5 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt5 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt5, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description7 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN6 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN6, 10));
                        it = h290VarN6.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description7, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO15 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO15, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 5:
                        i3 = 6;
                        List<SectionItem> itemsList6 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt6 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt6, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description8 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN7 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN7, 10));
                        it = h290VarN7.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description8, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO16 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO16, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 6:
                        i3 = 7;
                        List<SectionItem> itemsList7 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt7 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt7, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description9 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN8 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN8, 10));
                        it = h290VarN8.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description9, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO17 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO17, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 7:
                        i4 = 8;
                        i3 = i4;
                        List<SectionItem> itemsList8 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt8 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt8, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description10 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN9 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN9, 10));
                        it = h290VarN9.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description10, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO18 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO18, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 11:
                        i4 = 9;
                        i3 = i4;
                        List<SectionItem> itemsList9 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt9 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt9, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description11 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN10 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN10, 10));
                        it = h290VarN10.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description11, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO19 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO19, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 12:
                        i3 = 10;
                        List<SectionItem> itemsList10 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt10 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt10, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description12 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN11 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN11, 10));
                        it = h290VarN11.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description12, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO110 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO110, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 13:
                        i4 = 11;
                        i3 = i4;
                        List<SectionItem> itemsList11 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt11 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt11, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description13 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN12 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN12, 10));
                        it = h290VarN12.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description13, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO111 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO111, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                    case 14:
                        i4 = 12;
                        i3 = i4;
                        List<SectionItem> itemsList12 = sectionE.getItemsList();
                        arrayList = new ArrayList();
                        while (r7.hasNext()) {
                            iQ = sectionItem.q();
                            if (iQ == 0) {
                                i7 = -1;
                            } else {
                                i7 = ty41.j[l1d.C(iQ)];
                            }
                            switch (i7) {
                                case -1:
                                case 4:
                                case 5:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = lbyVar2;
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 0:
                                default:
                                    eg.o();
                                    return lbyVar3;
                                case 1:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qfj1(sectionItem.s().getTitle(), sectionItem.s().getSubtitle(), sectionItem.s().r(), sectionItem.s().s(), sectionItem.s().t(), sectionItem.s().q(), sectionItem.s().o(), sectionItem.s().getIsExplicit(), sectionItem.s().p(), "");
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 2:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB = b(sectionItem.o().o());
                                    if (lbyVarB != null) {
                                        ei90Var = lbyVarB.e;
                                        if (ei90Var instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 3:
                                    lbyVar2 = lbyVar3;
                                    lbyVarB2 = b(sectionItem.p().o());
                                    if (lbyVarB2 != null) {
                                        ei90Var2 = lbyVarB2.e;
                                        if (ei90Var2 instanceof k39) {
                                            qfj1Var = lbyVar2;
                                        } else {
                                            qfj1Var = lbyVar2;
                                        }
                                    } else {
                                        qfj1Var = lbyVar2;
                                    }
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 6:
                                    lbyVar2 = lbyVar3;
                                    qfj1Var = new qm11(sectionItem.r().d(), sectionItem.r().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                                case 7:
                                    lbyVar2 = lbyVar3;
                                    String prompt12 = sectionItem.n().getPrompt();
                                    strN = sectionItem.n().n();
                                    if (strN.length() == 0) {
                                        r6 = lbyVar2;
                                    } else {
                                        r6 = strN;
                                    }
                                    qfj1Var = new e2n(prompt12, r6, sectionItem.n().getUri());
                                    if (qfj1Var != null) {
                                        arrayList.add(qfj1Var);
                                    }
                                    lbyVar3 = lbyVar2;
                                    break;
                            }
                        }
                        lbyVar = lbyVar3;
                        String description14 = sectionE.getDescription();
                        i5 = ty41.k[sectionE.q().ordinal()];
                        if (i5 == 1) {
                            i6 = 1;
                        } else if (i5 != 2) {
                            i6 = 2;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                eg.o();
                                return lbyVar;
                            }
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        strQ = sectionE.o().q();
                        if (strQ.length() == 0) {
                            r22 = lbyVar;
                        } else {
                            r22 = strQ;
                        }
                        h290 h290VarN13 = sectionE.o().n();
                        arrayList2 = new ArrayList(q7h.U(h290VarN13, 10));
                        it = h290VarN13.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((ConversationStarterItem) it.next()).getPrompt());
                        }
                        strO = sectionE.o().o();
                        if (strO.length() == 0) {
                            r24 = lbyVar;
                        } else {
                            r24 = strO;
                        }
                        yf51Var = new yf51(strN2, i3, arrayList, description14, i6, r22, arrayList2, r24);
                        jb6Var = yf51Var;
                        iY = entity.y();
                        if (iY != 0) {
                            iC = l1d.C(iY);
                            if (iC == 0) {
                                parcelable = dby.a;
                            } else if (iC == 1) {
                                parcelable = eby.a;
                            } else if (iC == 2) {
                                parcelable = cby.a;
                            } else {
                                if (iC != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                parcelable = lbyVar;
                            }
                            r7 = parcelable;
                        } else {
                            r7 = lbyVar;
                        }
                        gatingDecisionW = entity.w();
                        iR = gatingDecisionW.r();
                        if (iR == 0) {
                            i8 = -1;
                        } else {
                            i8 = ty41.l[l1d.C(iR)];
                        }
                        if (i8 == -1) {
                            o940Var = lbyVar;
                        } else {
                            if (i8 == 1) {
                                l940Var = m940.a;
                            } else if (i8 != 2) {
                                if (i8 != 3) {
                                    eg.o();
                                    return lbyVar;
                                }
                                o940Var = lbyVar;
                            } else {
                                List listO112 = gatingDecisionW.o().o();
                                arrayList3 = new ArrayList(q7h.U(listO112, 10));
                                while (r7.hasNext()) {
                                    f940Var.getClass();
                                    iOrdinal2 = f940Var.ordinal();
                                    if (iOrdinal2 == 0) {
                                        h940Var = h940.a;
                                    } else if (iOrdinal2 != 1) {
                                        if (iOrdinal2 != 2) {
                                            eg.o();
                                            return lbyVar;
                                        }
                                        h940Var = h940.a;
                                    } else {
                                        h940Var = h940.b;
                                    }
                                    arrayList3.add(h940Var);
                                }
                                l940Var = new l940(arrayList3);
                            }
                            iOrdinal = gatingDecisionW.q().ordinal();
                            if (iOrdinal == 0) {
                                k940Var = k940.a;
                            } else if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                k940Var = k940.a;
                            } else {
                                k940Var = k940.b;
                            }
                            gatingContextP = gatingDecisionW.p();
                            if (gatingContextP.p().length() == 0) {
                                e940Var = lbyVar;
                            } else {
                                e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                            }
                            o940Var = new o940(l940Var, k940Var, e940Var);
                        }
                        return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
                }
            case 12:
                yf51Var = tm8.a;
                lbyVar = null;
                jb6Var = yf51Var;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO113 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO113, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 13:
                yf51Var = a(entity.t());
                lbyVar = null;
                jb6Var = yf51Var;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO114 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO114, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 14:
                jb6Var = new xui1(entity.H().getSubtitle());
                lbyVar = null;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO115 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO115, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 15:
                Kallax kallaxA = entity.A();
                boolean zO = kallaxA.o();
                boolean zP2 = kallaxA.p();
                String strQ2 = kallaxA.q();
                if (ihc1.y0(strQ2)) {
                    strQ2 = null;
                }
                List artistsList = kallaxA.getArtistsList();
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = artistsList.iterator();
                while (it2.hasNext()) {
                    String name3 = ((RelatedEntity) it2.next()).getName();
                    if (ihc1.y0(name3)) {
                        name3 = null;
                    }
                    if (name3 != null) {
                        arrayList6.add(name3);
                    }
                }
                jb6Var = new yma0(strQ2, arrayList6, zO, zP2);
                lbyVar = null;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO116 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO116, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 16:
                PodcastChapter podcastChapterC = entity.C();
                String subtitle = podcastChapterC.getSubtitle();
                String strS2 = podcastChapterC.s();
                kfv kfvVar3 = new kfv(podcastChapterC.getDuration().p());
                boolean zP3 = podcastChapterC.p();
                boolean zQ3 = podcastChapterC.q();
                boolean zN4 = podcastChapterC.n();
                wve1 wve1Var2 = new wve1(podcastChapterC.r().q());
                boolean zU = podcastChapterC.u();
                String strV = podcastChapterC.v();
                int iOrdinal6 = podcastChapterC.t().ordinal();
                if (iOrdinal6 == 0) {
                    lleVar = lle.a;
                } else if (iOrdinal6 == 1) {
                    lleVar = lle.b;
                } else if (iOrdinal6 != 2) {
                    if (iOrdinal6 != 3) {
                        eg.o();
                        return null;
                    }
                    lleVar = lle.a;
                } else {
                    lleVar = lle.c;
                }
                yf51Var = new o2v0(subtitle, strS2, kfvVar3, zP3, zQ3, zN4, wve1Var2, zU, strV, lleVar);
                lbyVar = null;
                jb6Var = yf51Var;
                iY = entity.y();
                if (iY != 0) {
                    iC = l1d.C(iY);
                    if (iC == 0) {
                        parcelable = dby.a;
                    } else if (iC == 1) {
                        parcelable = eby.a;
                    } else if (iC == 2) {
                        parcelable = cby.a;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        parcelable = lbyVar;
                    }
                    r7 = parcelable;
                } else {
                    r7 = lbyVar;
                }
                gatingDecisionW = entity.w();
                iR = gatingDecisionW.r();
                if (iR == 0) {
                    i8 = -1;
                } else {
                    i8 = ty41.l[l1d.C(iR)];
                }
                if (i8 == -1) {
                    o940Var = lbyVar;
                } else {
                    if (i8 == 1) {
                        l940Var = m940.a;
                    } else if (i8 != 2) {
                        if (i8 != 3) {
                            eg.o();
                            return lbyVar;
                        }
                        o940Var = lbyVar;
                    } else {
                        List listO117 = gatingDecisionW.o().o();
                        arrayList3 = new ArrayList(q7h.U(listO117, 10));
                        while (r7.hasNext()) {
                            f940Var.getClass();
                            iOrdinal2 = f940Var.ordinal();
                            if (iOrdinal2 == 0) {
                                h940Var = h940.a;
                            } else if (iOrdinal2 != 1) {
                                if (iOrdinal2 != 2) {
                                    eg.o();
                                    return lbyVar;
                                }
                                h940Var = h940.a;
                            } else {
                                h940Var = h940.b;
                            }
                            arrayList3.add(h940Var);
                        }
                        l940Var = new l940(arrayList3);
                    }
                    iOrdinal = gatingDecisionW.q().ordinal();
                    if (iOrdinal == 0) {
                        k940Var = k940.a;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return lbyVar;
                        }
                        k940Var = k940.a;
                    } else {
                        k940Var = k940.b;
                    }
                    gatingContextP = gatingDecisionW.p();
                    if (gatingContextP.p().length() == 0) {
                        e940Var = lbyVar;
                    } else {
                        e940Var = new e940(gatingContextP.p(), gatingContextP.n());
                    }
                    o940Var = new o940(l940Var, k940Var, e940Var);
                }
                return new lby(uri, name, strZ, strF, jb6Var, r7, o940Var);
            case 17:
                return null;
        }
    }
}
