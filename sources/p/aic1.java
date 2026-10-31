package p;

import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.scrollsita.v1.ChapterItem;
import com.spotify.scrollsita.v1.Chapters;
import com.spotify.scrollsita.v1.CreatorBio;
import com.spotify.scrollsita.v1.Credits;
import com.spotify.scrollsita.v1.EmbeddedAd;
import com.spotify.scrollsita.v1.EmbeddedAdCardTrackingUrls;
import com.spotify.scrollsita.v1.EmbeddedAdMetadata;
import com.spotify.scrollsita.v1.EpisodeDescription;
import com.spotify.scrollsita.v1.Heading;
import com.spotify.scrollsita.v1.ImageAsset;
import com.spotify.scrollsita.v1.ImageBrandAd;
import com.spotify.scrollsita.v1.LpmShelf;
import com.spotify.scrollsita.v1.NoteItem;
import com.spotify.scrollsita.v1.Notes;
import com.spotify.scrollsita.v1.Quiz;
import com.spotify.scrollsita.v1.RelatedContent;
import com.spotify.scrollsita.v1.Section;
import com.spotify.scrollsita.v1.SongDNA;
import com.spotify.scrollsita.v1.UnmappedRelatedAudio;
import com.spotify.scrollsita.v1.VideoCarousel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aic1 extends hab0 implements iu30 {
    public static final aic1 N0;
    public static final aic1 O0;
    public static final aic1 P0;
    public static final aic1 Q0;
    public static final aic1 R0;
    public static final aic1 S0;
    public static final aic1 T0;
    public static final aic1 U0;
    public static final aic1 V0;
    public static final aic1 W0;
    public static final aic1 X;
    public static final aic1 X0;
    public static final aic1 Y;
    public static final aic1 Y0;
    public static final aic1 Z;
    public static final aic1 Z0;
    public static final aic1 a1;
    public static final aic1 b;
    public static final aic1 b1;
    public static final aic1 c;
    public static final aic1 c1;
    public static final aic1 d;
    public static final aic1 d1;
    public static final aic1 e;
    public static final aic1 e1;
    public static final aic1 f;
    public static final aic1 g;
    public static final aic1 h;
    public static final aic1 i;
    public static final aic1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new aic1(i2, (byte) 0);
        c = new aic1(i2, (byte) 1);
        d = new aic1(i2, (byte) 2);
        e = new aic1(i2, (byte) 3);
        f = new aic1(i2, (byte) 4);
        g = new aic1(i2, (byte) 5);
        h = new aic1(i2, (byte) 6);
        i = new aic1(i2, (byte) 7);
        t = new aic1(i2, (byte) 8);
        X = new aic1(i2, (byte) 9);
        Y = new aic1(i2, (byte) 10);
        Z = new aic1(i2, (byte) 11);
        N0 = new aic1(i2, (byte) 12);
        O0 = new aic1(i2, (byte) 13);
        P0 = new aic1(i2, (byte) 14);
        Q0 = new aic1(i2, (byte) 15);
        R0 = new aic1(i2, (byte) 16);
        S0 = new aic1(i2, (byte) 17);
        T0 = new aic1(i2, (byte) 18);
        U0 = new aic1(i2, (byte) 19);
        V0 = new aic1(i2, (byte) 20);
        W0 = new aic1(i2, (byte) 21);
        X0 = new aic1(i2, (byte) 22);
        Y0 = new aic1(i2, (byte) 23);
        Z0 = new aic1(i2, (byte) 24);
        a1 = new aic1(i2, (byte) 25);
        b1 = new aic1(i2, (byte) 26);
        c1 = new aic1(i2, (byte) 27);
        d1 = new aic1(i2, (byte) 28);
        e1 = new aic1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aic1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Chapters chaptersO;
        String entityUri;
        zk11 yk11Var;
        j5n0 i5n0Var;
        String str = null;
        switch (this.a) {
            case 0:
                Section section = (Section) obj;
                if (!section.Z()) {
                    return null;
                }
                EpisodeDescription episodeDescriptionW = section.w();
                return new bxo0(episodeDescriptionW.getEntityUri(), Collections.singletonList(episodeDescriptionW.getEntityUri()), episodeDescriptionW.o().getTitle());
            case 1:
                Section section2 = (Section) obj;
                if (section2.d0()) {
                    return new rxo0(section2.A().n());
                }
                return null;
            case 2:
                Section section3 = (Section) obj;
                if (section3.j0()) {
                    return new txo0(section3.G().o());
                }
                return null;
            case 3:
                Section section4 = (Section) obj;
                if (!section4.s0()) {
                    return null;
                }
                VideoCarousel videoCarouselP = section4.P();
                return new cyo0(videoCarouselP.getTitle(), videoCarouselP.o(), videoCarouselP.o());
            case 4:
                Section section5 = (Section) obj;
                if (section5.e0()) {
                    return new kxo0(section5.B().getEntityUri());
                }
                return null;
            case 5:
                Section section6 = (Section) obj;
                if (!section6.R() || (entityUri = (chaptersO = section6.o()).getEntityUri()) == null || entityUri.length() == 0 || chaptersO.n().isEmpty()) {
                    return null;
                }
                String entityUri2 = chaptersO.getEntityUri();
                String title = chaptersO.getTitle();
                str = title.length() > 0 ? title : null;
                h290 h290VarN = chaptersO.n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                Iterator it = h290VarN.iterator();
                while (it.hasNext()) {
                    arrayList.add(new eqy(((ChapterItem) it.next()).getUri()));
                }
                return new axo0(entityUri2, str, arrayList, chaptersO.p());
            case 6:
                Section section7 = (Section) obj;
                if (section7.q0()) {
                    return new vxo0(section7.N().getEntityUri());
                }
                return null;
            case 7:
                Section section8 = (Section) obj;
                if (!section8.r0()) {
                    return null;
                }
                UnmappedRelatedAudio unmappedRelatedAudioO = section8.O();
                return new xxo0(unmappedRelatedAudioO.getEntityUri(), Collections.singletonList(unmappedRelatedAudioO.getEntityUri()));
            case 8:
                Section section9 = (Section) obj;
                if (!section9.m0()) {
                    return null;
                }
                RelatedContent relatedContentI = section9.I();
                String strP = relatedContentI.p();
                h290 urisList = relatedContentI.getUrisList();
                Heading headingO = relatedContentI.o();
                int iP = headingO.p();
                int i2 = iP == 0 ? -1 : cic1.b[l1d.C(iP)];
                if (i2 == 1) {
                    yk11Var = new yk11(headingO.getTitle());
                } else if (i2 == 2) {
                    yk11Var = new xk11(headingO.o().o(), headingO.o().p());
                } else {
                    if (i2 != 3) {
                        eg.o();
                        return null;
                    }
                    yk11Var = zk11.a;
                }
                return new wxo0(strP, urisList, yk11Var, relatedContentI.getUrisList());
            case 9:
                Section section10 = (Section) obj;
                if (!section10.p0()) {
                    return null;
                }
                SongDNA songDNAM = section10.M();
                String entityUri3 = songDNAM.getEntityUri();
                entityUri3.getClass();
                List urisList2 = songDNAM.getUrisList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : urisList2) {
                    String str2 = (String) obj2;
                    str2.getClass();
                    if (str2.length() > 0 && !str2.equals(entityUri3)) {
                        arrayList2.add(obj2);
                    }
                }
                return new ayo0(entityUri3, arrayList2);
            case 10:
                Section section11 = (Section) obj;
                if (!section11.l0()) {
                    return null;
                }
                Quiz quizH = section11.H();
                int i3 = cic1.c[quizH.o().ordinal()] == 1 ? 2 : 1;
                String strT = quizH.t();
                String title2 = quizH.getTitle();
                String subtitle = quizH.getSubtitle();
                String strS = quizH.s();
                String strN = quizH.n();
                String str3 = strN.length() == 0 ? null : strN;
                if (quizH.x()) {
                    String strP2 = quizH.r().p();
                    if (strP2.length() != 0) {
                        str = strP2;
                    }
                }
                String str4 = str;
                int i4 = (quizH.x() && quizH.r().o() == ajz0.QUIZ_ICON_TYPE_INFO) ? 1 : 0;
                if (quizH.y()) {
                    i5n0Var = new j5n0(quizH.u().getEntityUri());
                } else if (quizH.z()) {
                    i5n0Var = new k5n0(quizH.v().p(), quizH.v().n());
                } else {
                    i5n0Var = quizH.w() ? new i5n0(quizH.q().n(), quizH.q().p()) : new j5n0("");
                }
                return new pxo0(strT, title2, subtitle, strS, i5n0Var, str3, i3, str4, i4);
            case 11:
                Section section12 = (Section) obj;
                if (section12.T()) {
                    return new two0(section12.q().getEntityUri());
                }
                return null;
            case 12:
                Section section13 = (Section) obj;
                if (!section13.b0()) {
                    return null;
                }
                ImageBrandAd imageBrandAdY = section13.y();
                EmbeddedAd embeddedAdN = imageBrandAdY.n();
                ImageAsset imageAsset = (ImageAsset) o7h.s0(embeddedAdN.r());
                if (imageAsset == null) {
                    return null;
                }
                EmbeddedAdMetadata embeddedAdMetadataO = imageBrandAdY.o();
                String strN2 = embeddedAdMetadataO.n();
                String strM = l1d.m("spotify:ad:", embeddedAdMetadataO.n());
                String strN3 = embeddedAdN.n();
                String strP3 = embeddedAdN.p();
                xkg0 xkg0Var = new xkg0();
                String strO = embeddedAdN.o();
                strO.getClass();
                if (strO.length() <= 0) {
                    strO = null;
                }
                if (strO != null) {
                }
                String strS2 = embeddedAdN.s();
                strS2.getClass();
                if (strS2.length() <= 0) {
                    strS2 = null;
                }
                if (strS2 != null) {
                }
                String strO2 = imageAsset.o();
                if (strO2 != null) {
                    if (strO2.length() <= 0) {
                        strO2 = null;
                    }
                    if (strO2 != null) {
                    }
                }
                xkg0Var.put("product_name", embeddedAdMetadataO.s());
                xkg0 xkg0VarB = xkg0Var.b();
                fgh0 fgh0Var = new fgh0(6, Collections.singletonList(new gq70(imageAsset.p(), imageAsset.n(), new p57(imageAsset.getUrl()))), (List) null);
                String strQ = embeddedAdMetadataO.q();
                String strO3 = embeddedAdMetadataO.o();
                String strR = embeddedAdMetadataO.r();
                Format format = Format.BANNER;
                String strT2 = embeddedAdMetadataO.t();
                Map mapU = embeddedAdMetadataO.u();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapU.size()));
                for (Map.Entry entry : mapU.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((EmbeddedAdCardTrackingUrls) entry.getValue()).o());
                }
                return new xwo0(new ji0(strN2, strM, strN3, "", strP3, 1, xkg0VarB, fgh0Var, strQ, strO3, strR, false, false, format, false, z6x.a, strT2, linkedHashMap, 262144));
            case 13:
                Section section14 = (Section) obj;
                if (!section14.i0()) {
                    return null;
                }
                Notes notesF = section14.F();
                NoteItem noteItem = (NoteItem) o7h.s0(notesF.getItemsList());
                if (noteItem == null || noteItem.getUri().length() == 0) {
                    return null;
                }
                String strO4 = notesF.o();
                String uri = noteItem.getUri();
                String imageUrl = noteItem.getImageUrl();
                String str5 = imageUrl.length() == 0 ? null : imageUrl;
                String strN4 = noteItem.n();
                return new zwo0(strO4, uri, str5, strN4.length() == 0 ? null : strN4, Collections.singletonList(noteItem.getUri()));
            case 14:
                if (((Section) obj).k0()) {
                    return new byo0();
                }
                return null;
            case 15:
                Section section15 = (Section) obj;
                if (!section15.f0()) {
                    return null;
                }
                LpmShelf lpmShelfC = section15.C();
                String entityUri4 = lpmShelfC.getEntityUri();
                String title3 = lpmShelfC.getTitle();
                String subtitle2 = lpmShelfC.getSubtitle();
                subtitle2.getClass();
                return new lxo0(entityUri4, title3, subtitle2.length() > 0 ? subtitle2 : null, lpmShelfC.o(), lpmShelfC.getUrisList(), lpmShelfC.getUrisList());
            case 16:
                Section section16 = (Section) obj;
                if (section16.Q()) {
                    return new pwo0(section16.n().getEntityUri());
                }
                return null;
            case 17:
                Section section17 = (Section) obj;
                if (section17.a0()) {
                    return new cxo0(section17.x().getTitle(), section17.x().getImageUrl(), section17.x().n());
                }
                return null;
            case 18:
                Section section18 = (Section) obj;
                if (!section18.U()) {
                    return null;
                }
                CreatorBio creatorBioR = section18.r();
                return new uwo0(creatorBioR.n(), Collections.singletonList(creatorBioR.n()), creatorBioR.getTitle());
            case 19:
                Section section19 = (Section) obj;
                if (!section19.V()) {
                    return null;
                }
                Credits creditsS = section19.s();
                return new vwo0(creditsS.getEntityUri(), creditsS.o());
            case 20:
                Section section20 = (Section) obj;
                if (section20.g0()) {
                    return new nxo0(section20.D().getEntityUri());
                }
                return null;
            case 21:
                Section section21 = (Section) obj;
                if (section21.h0()) {
                    return new oxo0(section21.E().getEntityUri());
                }
                return null;
            case 22:
                return null;
            case 23:
                return null;
            case 24:
                return Boolean.valueOf((obj instanceof x380) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (x380) obj;
            case 26:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 28:
                return null;
            default:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
        }
    }
}
