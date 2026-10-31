package p;

import com.google.protobuf.Duration;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.browse.clientnative.integration.services.structureapi.DismissedEntity;
import com.spotify.browse.clientnative.mobius.Model;
import com.spotify.browse.clientnative.mobius.c;
import com.spotify.browsita.v1.resolved.BrandAds;
import com.spotify.browsita.v1.resolved.EmbeddedAdMetadata;
import com.spotify.browsita.v1.resolved.EmbeddedAdTrackingUrls;
import com.spotify.browsita.v1.resolved.Heading;
import com.spotify.browsita.v1.resolved.Item;
import com.spotify.browsita.v1.resolved.PlayLinkPromo;
import com.spotify.browsita.v1.resolved.PreviewPromotionCarouselItem;
import com.spotify.browsita.v1.resolved.ResolvedBrowse;
import com.spotify.browsita.v1.resolved.Section;
import com.spotify.browsita.v1.resolved.SectionInfo;
import com.spotify.browsita.v1.resolved.WatchFeedItem;
import com.spotify.contentagnostic.v2.ColorSetContrastOptions;
import com.spotify.home.browse.clientnative.proto.BrowseAdProto$ImageAsset;
import com.spotify.home.browse.clientnative.proto.BrowseAdProto$VideoAsset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class zu21 {
    public static final Model a(ResolvedBrowse resolvedBrowse, Set set, String str) {
        Iterator it;
        ArrayList arrayList;
        s7c m9eVar;
        int i;
        int i2;
        String strO;
        s7c hbi0Var;
        v6l1 v6l1Var;
        fah fahVar;
        String strO2;
        h290 h290VarO = resolvedBrowse.o().o();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = h290VarO.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            z6x z6xVar = z6x.a;
            if (!zHasNext) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (obj instanceof s7c) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList4.addAll(0, z6xVar);
                String strP = resolvedBrowse.n().p();
                String strO3 = resolvedBrowse.n().o();
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    s7c s7cVar = (s7c) c.b(arrayList4).get((String) it3.next());
                    DismissedEntity dismissedEntity = s7cVar == null ? null : new DismissedEntity(s7cVar.getId(), DismissedEntity.Type.EXPLICIT_FEEDBACK);
                    if (dismissedEntity != null) {
                        arrayList5.add(dismissedEntity);
                    }
                }
                return new Model(strP, strO3, arrayList4, o7h.p1(arrayList5), str, false, 32, null);
            }
            Section section = (Section) it2.next();
            int iW = section.w();
            int i3 = 2;
            int i4 = 1;
            switch (iW == 0 ? -1 : yu21.a[l1d.C(iW)]) {
                case 1:
                    it = it2;
                    arrayList = arrayList2;
                    String strT = rwq0.t(section);
                    String strO4 = section.v().o();
                    x360 x360VarV = q1o1.v(section.q().p(), false);
                    List<Item> itemsList = section.q().getItemsList();
                    ArrayList arrayList6 = new ArrayList(q7h.U(itemsList, 10));
                    for (Item item : itemsList) {
                        String uri = item.getUri();
                        String strO5 = item.o();
                        int iOrdinal = section.q().o().ordinal();
                        if (iOrdinal != 0) {
                            i = 1;
                            if (iOrdinal == 1) {
                                i2 = 2;
                            } else if (iOrdinal == 2) {
                                i2 = 3;
                            }
                            arrayList6.add(new n7e(i2, uri, strO5));
                        } else {
                            i = 1;
                        }
                        i2 = i;
                        arrayList6.add(new n7e(i2, uri, strO5));
                    }
                    m9eVar = new m9e(strT, strO4, arrayList6, x360VarV);
                    break;
                case 2:
                    it = it2;
                    arrayList = arrayList2;
                    m9eVar = new zmx0(rwq0.t(section), section.v().o(), q1o1.v(section.t().p(), false), new fpx0(section.t().q().getUri(), section.t().q().o(), section.t().n(), yi51.a[section.t().r().ordinal()] == 1 ? 2 : 1));
                    break;
                case 3:
                    it = it2;
                    arrayList = arrayList2;
                    PlayLinkPromo playLinkPromoR = section.r();
                    String strT2 = rwq0.t(section);
                    SectionInfo sectionInfoV = section.v();
                    String str2 = (sectionInfoV == null || (strO = sectionInfoV.o()) == null) ? "" : strO;
                    Heading headingP = playLinkPromoR.p();
                    if (!playLinkPromoR.s()) {
                        headingP = null;
                    }
                    x360 x360VarV2 = headingP != null ? q1o1.v(headingP, true) : null;
                    String uri2 = playLinkPromoR.hasItem() ? playLinkPromoR.q().getUri() : "";
                    uri2.getClass();
                    EmbeddedAdMetadata embeddedAdMetadataN = playLinkPromoR.n();
                    if (!playLinkPromoR.r()) {
                        embeddedAdMetadataN = null;
                    }
                    m9eVar = new cnt0(strT2, str2, x360VarV2, uri2, embeddedAdMetadataN != null ? fho1.v(embeddedAdMetadataN) : null);
                    break;
                case 4:
                    it = it2;
                    arrayList = arrayList2;
                    hbi0Var = new hbi0(rwq0.t(section), section.v().o(), section.n().q().getUri(), section.n().q().o(), section.n().r(), fho1.v(section.n().n()), q1o1.v(section.n().p(), true));
                    m9eVar = hbi0Var;
                    break;
                case 5:
                    it = it2;
                    arrayList = arrayList2;
                    m9eVar = new hbi0(rwq0.t(section), section.v().o(), section.o().q().getUri(), section.o().q().o(), section.o().r(), fho1.v(section.o().n()), q1o1.v(section.o().p(), true));
                    break;
                case 6:
                    it = it2;
                    arrayList = arrayList2;
                    m9eVar = new dox0(rwq0.t(section), section.v().o(), q1o1.v(section.u().p(), false), new hpx0(section.u().q().getUri(), section.u().q().o(), section.u().n()));
                    break;
                case 7:
                    it = it2;
                    arrayList = arrayList2;
                    String strO6 = section.v().o();
                    String strO7 = section.v().o();
                    Heading headingO = section.z().o();
                    hvl1 hvl1Var = new hvl1(headingO.q().q(), 242, (String) null, headingO.q().r() ? headingO.q().p().o() : null, false, headingO.q().r() ? headingO.q().p().getUri() : null);
                    List<WatchFeedItem> itemsList2 = section.z().getItemsList();
                    ArrayList arrayList7 = new ArrayList(q7h.U(itemsList2, 10));
                    for (WatchFeedItem watchFeedItem : itemsList2) {
                        ii90 ii90Var = new ii90(watchFeedItem.o().getUri(), watchFeedItem.o().o());
                        if (watchFeedItem.q()) {
                            String uri3 = watchFeedItem.n().getUri();
                            String strS = watchFeedItem.n().s();
                            String strV = watchFeedItem.n().v();
                            String title = watchFeedItem.n().getTitle();
                            String subtitle = watchFeedItem.n().getSubtitle();
                            iq70 iq70Var = new iq70(watchFeedItem.n().x().getUrl(), watchFeedItem.n().x().o());
                            String uri4 = watchFeedItem.n().y().getUri();
                            int i5 = zi51.a[watchFeedItem.n().y().q().ordinal()];
                            int i6 = i5 != i4 ? i5 != i3 ? 3 : i3 : i4;
                            Duration durationP = watchFeedItem.n().y().p();
                            long jP = durationP.p();
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            long jO = (((long) durationP.o()) / 1000000) + timeUnit.toMillis(jP);
                            Duration durationO = watchFeedItem.n().y().o();
                            dlj1 dlj1Var = new dlj1(jO, (((long) durationO.o()) / 1000000) + timeUnit.toMillis(durationO.p()), uri4, i6);
                            String strU = watchFeedItem.n().u();
                            String strN = watchFeedItem.n().n();
                            iq70 iq70Var2 = new iq70(watchFeedItem.n().p().getUrl(), watchFeedItem.n().p().o());
                            String strQ = watchFeedItem.n().q();
                            Float fValueOf = watchFeedItem.n().B() ? Float.valueOf((float) watchFeedItem.n().w()) : null;
                            iq70 iq70Var3 = watchFeedItem.n().A() ? new iq70(watchFeedItem.n().t().getUrl(), watchFeedItem.n().t().o()) : null;
                            if (watchFeedItem.n().z()) {
                                ColorSetContrastOptions colorSetContrastOptionsO = watchFeedItem.n().o();
                                fahVar = new fah(colorSetContrastOptionsO.w() ? dgo1.v(colorSetContrastOptionsO.s()) : null, colorSetContrastOptionsO.u() ? dgo1.v(colorSetContrastOptionsO.q()) : null, colorSetContrastOptionsO.v() ? dgo1.v(colorSetContrastOptionsO.r()) : null, colorSetContrastOptionsO.t() ? new u7h(dgo1.t(colorSetContrastOptionsO.p())) : null);
                            } else {
                                fahVar = null;
                            }
                            v6l1Var = new v6l1(uri3, strS, strV, title, subtitle, iq70Var, dlj1Var, strU, strN, iq70Var2, strQ, fValueOf, iq70Var3, fahVar);
                        } else {
                            v6l1Var = null;
                        }
                        String string = UUID.randomUUID().toString();
                        String strN2 = watchFeedItem.p().n();
                        String strQ2 = watchFeedItem.p().q();
                        String strP2 = watchFeedItem.p().p();
                        strP2.getClass();
                        arrayList7.add(new x8l1(ii90Var, v6l1Var, string, strN2, strQ2, strP2.length() > 0 ? strP2 : null));
                        i3 = 2;
                        i4 = 1;
                    }
                    m9eVar = new j8l1(strO6, strO7, hvl1Var, new jal1(arrayList7));
                    break;
                case 8:
                    if (section.p().n().t().isEmpty()) {
                        it = it2;
                        arrayList = arrayList2;
                        if (section.p().n().r().isEmpty()) {
                            m9eVar = null;
                        } else {
                            String strT3 = rwq0.t(section);
                            String strO8 = section.v().o();
                            BrandAds brandAdsP = section.p();
                            BrowseAdProto$ImageAsset browseAdProto$ImageAsset = (BrowseAdProto$ImageAsset) o7h.q0(brandAdsP.n().r());
                            String id = brandAdsP.o().getId();
                            String strM = l1d.m("spotify:ad:", brandAdsP.o().getId());
                            String strN3 = brandAdsP.n().n();
                            String strP3 = brandAdsP.n().p();
                            xkg0 xkg0Var = new xkg0();
                            String strO9 = brandAdsP.n().o();
                            strO9.getClass();
                            if (strO9.length() <= 0) {
                                strO9 = null;
                            }
                            if (strO9 != null) {
                            }
                            String strS2 = brandAdsP.n().s();
                            strS2.getClass();
                            if (strS2.length() <= 0) {
                                strS2 = null;
                            }
                            if (strS2 != null) {
                            }
                            String strO10 = browseAdProto$ImageAsset.o();
                            strO10.getClass();
                            if (strO10.length() <= 0) {
                                strO10 = null;
                            }
                            if (strO10 != null) {
                            }
                            xkg0Var.put("product_name", brandAdsP.o().r());
                            xkg0 xkg0VarB = xkg0Var.b();
                            fgh0 fgh0Var = new fgh0(6, Collections.singletonList(new gq70(browseAdProto$ImageAsset.p(), browseAdProto$ImageAsset.n(), new p57(browseAdProto$ImageAsset.getImageUrl()))), (List) null);
                            String strP4 = brandAdsP.o().p();
                            String strN4 = brandAdsP.o().n();
                            String strQ3 = brandAdsP.o().q();
                            Format format = Format.BANNER;
                            String strS3 = brandAdsP.o().s();
                            Map mapT = brandAdsP.o().t();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapT.size()));
                            for (Map.Entry entry : mapT.entrySet()) {
                                linkedHashMap.put(entry.getKey(), ((EmbeddedAdTrackingUrls) entry.getValue()).o());
                            }
                            hbi0Var = new oiu(strT3, strO8, new ji0(id, strM, strN3, "", strP3, 1, xkg0VarB, fgh0Var, strP4, strN4, strQ3, false, false, format, false, z6xVar, strS3, linkedHashMap, 262144));
                        }
                    } else {
                        String strT4 = rwq0.t(section);
                        String strO11 = section.v().o();
                        EmbeddedAdMetadata embeddedAdMetadataO = section.p().o();
                        BrandAds brandAdsP2 = section.p();
                        String id2 = brandAdsP2.o().getId();
                        String strM2 = l1d.m("spotify:ad:", brandAdsP2.o().getId());
                        String strN5 = brandAdsP2.n().n();
                        String strP5 = brandAdsP2.n().p();
                        xkg0 xkg0Var2 = new xkg0();
                        String strO12 = brandAdsP2.n().o();
                        strO12.getClass();
                        String str3 = strO12.length() > 0 ? strO12 : null;
                        if (str3 != null) {
                        }
                        String strS4 = brandAdsP2.n().s();
                        strS4.getClass();
                        if (strS4.length() <= 0) {
                            strS4 = null;
                        }
                        if (strS4 != null) {
                        }
                        BrowseAdProto$ImageAsset browseAdProto$ImageAsset2 = (BrowseAdProto$ImageAsset) o7h.s0(brandAdsP2.n().r());
                        if (browseAdProto$ImageAsset2 != null && (strO2 = browseAdProto$ImageAsset2.o()) != null) {
                            if (strO2.length() <= 0) {
                                strO2 = null;
                            }
                            if (strO2 != null) {
                            }
                        }
                        xkg0Var2.put("product_name", brandAdsP2.o().r());
                        xkg0 xkg0VarB2 = xkg0Var2.b();
                        h290<BrowseAdProto$VideoAsset> h290VarT = brandAdsP2.n().t();
                        ArrayList arrayList8 = new ArrayList(q7h.U(h290VarT, 10));
                        for (BrowseAdProto$VideoAsset browseAdProto$VideoAsset : h290VarT) {
                            String strO13 = browseAdProto$VideoAsset.o();
                            arrayList8.add((strO13 == null || strO13.length() == 0) ? new a7j1("video/mp4", 0, 0, 0, new p57(browseAdProto$VideoAsset.getUrl()), Long.valueOf(browseAdProto$VideoAsset.n())) : new a7j1("video/mp4", 0, 0, 0, new o57(browseAdProto$VideoAsset.o()), Long.valueOf(browseAdProto$VideoAsset.n())));
                            it2 = it2;
                        }
                        it = it2;
                        fgh0 fgh0Var2 = new fgh0(5, (List) null, arrayList8);
                        String strP6 = brandAdsP2.o().p();
                        String strN6 = brandAdsP2.o().n();
                        String strQ4 = brandAdsP2.o().q();
                        Format format2 = Format.VIDEO;
                        String strS5 = brandAdsP2.o().s();
                        Map mapT2 = brandAdsP2.o().t();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(mapT2.size()));
                        for (Map.Entry entry2 : mapT2.entrySet()) {
                            linkedHashMap2.put(entry2.getKey(), ((EmbeddedAdTrackingUrls) entry2.getValue()).o());
                            fgh0Var2 = fgh0Var2;
                        }
                        arrayList = arrayList2;
                        hbi0Var = new acj1(strT4, strO11, new vcj1(new ji0(id2, strM2, strN5, "", strP5, 1, xkg0VarB2, fgh0Var2, strP6, strN6, strQ4, false, false, format2, false, z6xVar, strS5, linkedHashMap2, 262144), embeddedAdMetadataO));
                    }
                    m9eVar = hbi0Var;
                    break;
                case 9:
                    m9eVar = new jc81(rwq0.t(section), section.v().o(), new kc81(section.x().r().getUri(), section.x().n(), new sd81(section.x().q().p().o(), section.x().q().p().getSubtitle()), section.x().s() ? section.x().o() : null));
                    it = it2;
                    arrayList = arrayList2;
                    break;
                case 10:
                    String strT5 = rwq0.t(section);
                    String strO14 = section.v().o();
                    x360 x360VarV3 = q1o1.v(section.s().p(), false);
                    String strQ5 = section.s().q();
                    n1x n1xVarV = fho1.v(section.s().n());
                    List<PreviewPromotionCarouselItem> itemsList3 = section.s().getItemsList();
                    ArrayList arrayList9 = new ArrayList();
                    for (PreviewPromotionCarouselItem previewPromotionCarouselItem : itemsList3) {
                        int iN = previewPromotionCarouselItem.n();
                        xkw0 xkw0Var = (iN == 0 ? -1 : xi51.a[l1d.C(iN)]) == 1 ? new xkw0(previewPromotionCarouselItem.o().q().getUri(), previewPromotionCarouselItem.o().r(), previewPromotionCarouselItem.o().q().o()) : null;
                        if (xkw0Var != null) {
                            arrayList9.add(xkw0Var);
                        }
                    }
                    it = it2;
                    arrayList = arrayList2;
                    m9eVar = new wkw0(strT5, strO14, x360VarV3, strQ5, n1xVarV, arrayList9);
                    break;
                case 11:
                    it = it2;
                    arrayList = arrayList2;
                    m9eVar = new pvj1(rwq0.t(section), section.v().o(), section.y().q().getUri(), section.y().r(), section.y().q().o(), fho1.v(section.y().n()), q1o1.v(section.y().p(), true));
                    break;
                default:
                    it = it2;
                    arrayList = arrayList2;
                    m9eVar = null;
                    break;
            }
            ArrayList arrayList10 = arrayList;
            if (m9eVar != null) {
                arrayList10.add(m9eVar);
            }
            arrayList2 = arrayList10;
            it2 = it;
        }
    }
}
