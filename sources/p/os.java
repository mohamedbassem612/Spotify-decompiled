package p;

import com.spotify.checkout.proto.model.v1.proto.CheckoutItemUnavailable;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.n;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class os extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ os(String str, String str2, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:295:0x05b2  */
    public final Object invoke(Object obj) throws Exception {
        String str;
        hwn iwnVar;
        int i;
        String str2;
        String str3;
        String str4;
        int i2;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        String str5 = this.c;
        String str6 = this.b;
        switch (b) {
            case 0:
                b261.n((e261) obj, str6 + ", " + str5);
                return rih1Var;
            case 1:
                b261.n((e261) obj, str6 + ". " + str5);
                return rih1Var;
            case 2:
                cd3 cd3Var = (ed3) obj;
                if (cd3Var instanceof bd3) {
                    return new gwn(127, (String) null, (String) null);
                }
                boolean z2 = cd3Var instanceof cd3;
                String str7 = this.b;
                if (!z2) {
                    if (cd3Var instanceof dd3) {
                        dd3 dd3Var = (dd3) cd3Var;
                        str = dd3Var.a;
                        String str8 = dd3Var.b;
                        if (!str.equals(str7)) {
                        }
                        iwnVar = new iwn(str7, 0L, 0L, (String) null, (String) null, (String) null, (List) null, (dwn) null, (Map) null, false, (Map) null, 2040);
                    }
                    return new gwn(127, (String) null, (String) null);
                }
                cd3 cd3Var2 = cd3Var;
                String str9 = cd3Var2.a;
                String str10 = cd3Var2.b;
                if (!str9.equals(str7) && (str5 == null || str10 == null || !str10.equals(str5))) {
                    if (cd3Var instanceof dd3) {
                        dd3 dd3Var2 = (dd3) cd3Var;
                        str = dd3Var2.a;
                        String str11 = dd3Var2.b;
                        if (!str.equals(str7) || (str5 != null && str11 != null && str11.equals(str5))) {
                            iwnVar = new iwn(str7, 0L, 0L, (String) null, (String) null, (String) null, (List) null, (dwn) null, (Map) null, false, (Map) null, 2040);
                        }
                    }
                    return new gwn(127, (String) null, (String) null);
                }
                iwnVar = new hwn(str7, 0L, 0L, (String) null, (String) null, (String) null, (List) null, (dwn) null, (Map) null, false, (Map) null, 2040);
                return iwnVar;
            case 3:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str6, jo70.class, false);
                qv00Var.a(str6, mtl.class, false);
                if (str5 != null) {
                    qv00Var.a(str5, dxc0.class, false);
                }
                return rih1Var;
            case 4:
                e261 e261Var = (e261) obj;
                if (str6 != null) {
                    b261.n(e261Var, str6);
                }
                if (str5 != null) {
                    b261.A(e261Var, str5);
                }
                return rih1Var;
            case 5:
                e261 e261Var2 = (e261) obj;
                if (str6 != null) {
                    b261.n(e261Var2, str6);
                }
                if (str5 != null) {
                    b261.A(e261Var2, str5);
                }
                return rih1Var;
            case 6:
                d441 d441VarG1 = ((y341) obj).g1("\n        SELECT * FROM BluetoothHeadphoneFilterStateEntity\n        WHERE headphoneIdentifier = ? AND owner = ?\n    ");
                try {
                    d441VarG1.K(1, str6);
                    d441VarG1.K(2, str5);
                    int iW = y7y0.w(d441VarG1, "headphoneIdentifier");
                    int iW2 = y7y0.w(d441VarG1, "owner");
                    int iW3 = y7y0.w(d441VarG1, "headphoneName");
                    int iW4 = y7y0.w(d441VarG1, "externalizationEnabledId");
                    int iW5 = y7y0.w(d441VarG1, "externalizationDisabledId");
                    int iW6 = y7y0.w(d441VarG1, "externalizationEnabled");
                    int iW7 = y7y0.w(d441VarG1, "specificEnabledId");
                    int iW8 = y7y0.w(d441VarG1, "specificDisabledId");
                    int iW9 = y7y0.w(d441VarG1, "specificEnabled");
                    int iW10 = y7y0.w(d441VarG1, "filterName");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        arrayList.add(new fhb(d441VarG1.P0(iW), d441VarG1.P0(iW2), d441VarG1.P0(iW3), d441VarG1.P0(iW4), d441VarG1.P0(iW5), ((int) d441VarG1.getLong(iW6)) != 0, d441VarG1.isNull(iW7) ? null : d441VarG1.P0(iW7), d441VarG1.P0(iW8), ((int) d441VarG1.getLong(iW9)) != 0, d441VarG1.isNull(iW10) ? null : d441VarG1.P0(iW10)));
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
            case 7:
                d441 d441VarG2 = ((y341) obj).g1("\n        DELETE FROM BluetoothHeadphoneFilterStateEntity\n        WHERE headphoneIdentifier = ? AND owner = ?\n    ");
                try {
                    d441VarG2.K(1, str6);
                    d441VarG2.K(2, str5);
                    d441VarG2.f1();
                    return rih1Var;
                } finally {
                    d441VarG2.close();
                }
            case 8:
                return new s7d(str6, (t7d) obj, str5);
            case 9:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str6);
                if (str5.length() > 0) {
                    b261.A(e261Var3, str5);
                }
                return rih1Var;
            case 10:
                String str12 = (String) obj;
                return Boolean.valueOf(str12.equals(str6) || nhc1.Y(str12, str5, false));
            case 11:
                jy21 jy21Var = (jy21) obj;
                return new pdt(str6, str5, (jy21Var instanceof dy21) || (jy21Var instanceof gy21) || (jy21Var instanceof by21) || (jy21Var instanceof cy21));
            case 12:
                e261 e261Var4 = (e261) obj;
                b261.n(e261Var4, str6);
                b261.A(e261Var4, str5);
                return rih1Var;
            case 13:
                return new t671(48, (String) obj, this.b, this.c, "context-menu", null, false);
            case 14:
                kby kbyVar = ((wsc0) obj).f;
                boolean zJ = u890.j(kbyVar.q.get("enhanced_context"), "true");
                int iOrdinal = kbyVar.n.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i = 4;
                } else {
                    if (iOrdinal != 2 && iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i = 5;
                }
                return new i5w0(new yrc0(this.b, this.c, zJ, i, false, false));
            case 15:
                e261 e261Var5 = (e261) obj;
                b261.n(e261Var5, str6);
                b261.A(e261Var5, str5);
                return rih1Var;
            case 16:
                e261 e261Var6 = (e261) obj;
                if (str6 != null) {
                    b261.n(e261Var6, str6);
                }
                b261.A(e261Var6, str5);
                b261.a(e261Var6);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                rim1 rim1Var = (rim1) obj;
                rim1Var.getClass();
                if (str6 == null) {
                    str6 = "";
                }
                String str13 = str5 != null ? str5 : "";
                String str14 = "wrapped";
                String str15 = "watchfeed";
                if (!nhc1.Y(str6, "spotify:watch-feed:wrapped", false) && !nhc1.Y(str6, "spotify:wrapped:watchfeed", false) && (!ihc1.h0(str13, "watchfeed", false) || !ihc1.h0(str13, "wrapped", false))) {
                    return null;
                }
                if (str6.length() <= 0) {
                    if (ihc1.h0(str13, "home/wrapped", false) || ihc1.h0(str13, "home-wrapped", false)) {
                        str14 = "subfeed";
                    } else if (ihc1.h0(str13, "watchfeed", false) && ihc1.h0(str13, "wrapped", false)) {
                        str14 = "watchfeed";
                    } else if (ihc1.h0(str13, "retrieval", false)) {
                        str14 = "retrieval";
                    } else if (ihc1.h0(str13, "receipt", false)) {
                        str14 = "receipt";
                    } else if (ihc1.h0(str13, "party", false)) {
                        str14 = "party";
                    }
                    str15 = str14;
                } else if (ihc1.h0(str6, "receipt", false)) {
                    str15 = "receipt";
                } else if (ihc1.h0(str6, "retrieval", false)) {
                    str15 = "retrieval";
                } else if (ihc1.h0(str6, "datastories", false)) {
                    str15 = "datastories";
                } else if (ihc1.h0(str6, "facet=wrapped-chip", false) || ihc1.h0(str6, "feed=wrapped-chip", false)) {
                    str15 = "subfeed";
                } else if (ihc1.h0(str6, "watchfeed-fallback", false)) {
                    str15 = "stage";
                } else if (ihc1.h0(str6, "presents:party", false)) {
                    str15 = "party";
                } else if (ihc1.h0(str6, "wrappedshareinstance", false)) {
                    str15 = "share-instance";
                } else if (ihc1.h0(str6, "wrapped-artist-clips", false)) {
                    str15 = "artist-clips";
                } else if (ihc1.h0(str6, "wrapped-podcast-clips", false)) {
                    str15 = "podcast-clips";
                } else if (ihc1.h0(str6, "wrapped-author-clips", false)) {
                    str15 = "author-clips";
                } else if (!ihc1.h0(str6, "watchfeed", false) && !ihc1.h0(str6, "watch-feed", false)) {
                    str15 = str6.equals("spotify:playlist:37i9dQZEVXgvuLLK4005a0") ? "your-top-songs-playlist" : "unknown";
                }
                wgm1 wgm1Var = (wgm1) rim1Var.a.getState().getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("Wrapped Context", str15);
                StoryCard storyCard = wgm1Var.a;
                if (storyCard != null) {
                    linkedHashMap.put("Wrapped Card", storyCard.getId());
                }
                if (rim1Var.d.get()) {
                    linkedHashMap.put("Share Menu", "Open");
                }
                sju sjuVarA = ((mt71) rim1Var.b.p.a.getValue()).a();
                if (sjuVarA != null && (str4 = sjuVarA.c) != null) {
                    linkedHashMap.put("Audio Preview", str4);
                }
                if (sjuVarA != null && (str3 = sjuVarA.a) != null) {
                    linkedHashMap.put("Audio Preview Title", str3);
                }
                if (sjuVarA != null && (str2 = sjuVarA.b) != null) {
                    String str16 = !ihc1.y0(str2) ? str2 : null;
                    if (str16 != null) {
                        linkedHashMap.put("Audio Preview Artist", str16);
                    }
                }
                return new pn10("MS", "Wrapped", Collections.singletonList("wrapped-bug-report"), "wrapped-".concat(str15), linkedHashMap);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qo90 qo90Var = (qo90) obj;
                po90 po90VarG = qo90Var != null ? pno1.g(qo90Var.d) : null;
                if (!u890.j(po90VarG != null ? po90VarG.b : null, str6)) {
                    return rba0.a;
                }
                String str17 = po90VarG.a;
                List list = qo90Var.f;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((no90) it.next()).c.a) {
                            z = true;
                        }
                    }
                }
                return new tba0(str17, str5, z);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new zuc0(this.b, 0, this.c, (x4i1) null, false, z6x.a, b7x.a, (pc41) null, "", false, false, false, false, swp0.c, (fbp1) null, hkj0.a, tu00.a);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                e261 e261Var7 = (e261) obj;
                b261.n(e261Var7, str6);
                b261.A(e261Var7, str5);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                n nVarW = GetCheckoutPageResponse.w();
                jwf jwfVarQ = CheckoutItemUnavailable.q();
                jwfVarQ.r(str6);
                jwfVarQ.q(ecm0.d(0, 13, false));
                jwfVarQ.n(str5);
                nVarW.n(jwfVarQ.build());
                return nVarW.build();
            case 22:
                p4h p4hVarN = ((kb61) obj).N();
                fn31.T(p4hVarN.d, (o8n) null, 0, new o4h(p4hVarN, this.b, this.c, (lnm) null, (byte) 0), 3);
                return rih1Var;
            case 23:
                p4h p4hVarN2 = ((kb61) obj).N();
                fn31.T(p4hVarN2.d, (o8n) null, 0, new o4h(p4hVarN2, this.b, this.c, (lnm) null, (byte) 1), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                wsc0 wsc0Var = (wsc0) obj;
                kby kbyVar2 = wsc0Var.f;
                boolean zJ2 = u890.j(kbyVar2.q.get("enhanced_context"), "true");
                boolean zR = eqr0.r(wsc0Var, new dlc0[]{dlc0.d});
                boolean z3 = kbyVar2.j;
                int iOrdinal2 = kbyVar2.n.ordinal();
                String str18 = this.c;
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    if (u890.j(str6, str18)) {
                        String str19 = kbyVar2.p;
                        i2 = (str19 == null || str19.length() == 0) ? 1 : 4;
                    } else {
                        i2 = 3;
                    }
                } else {
                    if (iOrdinal2 != 3) {
                        eg.o();
                        return null;
                    }
                    i2 = 5;
                }
                return new i5w0(new yrc0(this.b, str18, zJ2, i2, zR, z3));
            case 25:
                e261 e261Var8 = (e261) obj;
                b261.F(e261Var8, true);
                b261.n(e261Var8, o7h.y0(f46.i0(new String[]{str6, str5}), ", ", (String) null, (String) null, (iu30) null, 62));
                return rih1Var;
            case 26:
                b261.n((e261) obj, o7h.y0(f46.i0(new String[]{str6, (str5 == null || ihc1.y0(str5)) ? null : str5}), ", ", (String) null, (String) null, (iu30) null, 62));
                return rih1Var;
            case 27:
                return ((v1l0) obj).e(str6, str5);
            case 28:
                return ((v1l0) obj).e(str6, str5);
            default:
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("remove_recommendation", 2, sqg0.J(new mmr0[]{new mmr0("recommended_item_uri", str6 != null ? str6 : ""), new mmr0("context_uri", str5)})), ((x1l0) obj).a, r6h1.c, System.currentTimeMillis());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ os(String str, String str2, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = str2;
    }
}
