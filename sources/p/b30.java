package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 29:
                this.b = iu30Var;
                this.c = i;
                super(2);
                break;
            default:
                j2i j2iVar = pej.a;
                this.b = iu30Var;
                this.c = i;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03cb  */
    public final Object invoke(Object obj, Object obj2) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        z50 z50Var = z50.c;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                syo1.d(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                syo1.i(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ryn1.b(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                fyo1.c(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                t6p1.c(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                t6p1.f(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                a9k a9kVar = (a9k) obj;
                z8k z8kVar = (z8k) obj2;
                String str = a9kVar.a;
                r6h1 r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(i));
                String strO = e9k.o(a9kVar);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-concerts-campaign-card";
                x6h1VarI.f = "2.3.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.e = strO;
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                if (z8kVar.equals(m8k.a)) {
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("join_waitlist_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str != null ? str : "")), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar.equals(t8k.a)) {
                    if (a9kVar.l) {
                        x6h1 x6h1VarC3 = y6h1VarA.c();
                        x6h1VarC3.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("remind_me_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str != null ? str : "")), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC5 = y6h1VarA.c();
                        x6h1VarC5.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("remind_me_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str != null ? str : "")), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
                    }
                } else if (z8kVar.equals(p8k.a)) {
                    x6h1 x6h1VarC7 = y6h1VarA.c();
                    x6h1VarC7.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("not_interested_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str != null ? str : "")), x6h1VarC8.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar.equals(x8k.a)) {
                    x6h1 x6h1VarC9 = y6h1VarA.c();
                    x6h1VarC9.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("cant_attend_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar.equals(h8k.a)) {
                    x6h1 x6h1VarC11 = y6h1VarA.c();
                    x6h1VarC11.i.add(new a7h1("cant_attend_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str != null ? str : "")), x6h1VarC11.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar.equals(k8k.a)) {
                    x6h1 x6h1VarC12 = y6h1VarA.c();
                    x6h1VarC12.i.add(new a7h1("cant_attend_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar instanceof g8k) {
                    x6h1 x6h1VarC13 = y6h1VarA.c();
                    x6h1VarC13.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("buy_tickets_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((g8k) z8kVar).a)), x6h1VarC14.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar instanceof y8k) {
                    x6h1 x6h1VarC15 = y6h1VarA.c();
                    x6h1VarC15.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                    x6h1VarC16.i.add(new a7h1("see_all_events_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC16.a();
                    String str2 = ((y8k) z8kVar).a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(z8kVar instanceof w8k)) {
                        if ((z8kVar instanceof r8k) || (z8kVar instanceof j8k) || (z8kVar instanceof i8k) || (z8kVar instanceof n8k) || (z8kVar instanceof o8k) || (z8kVar instanceof q8k) || (z8kVar instanceof u8k) || (z8kVar instanceof l8k) || (z8kVar instanceof v8k) || (z8kVar instanceof s8k)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC17 = y6h1VarA.c();
                    x6h1VarC17.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 7:
                hdk hdkVar = (jdk) obj;
                ddk ddkVar = (ddk) obj2;
                r6h1 r6h1Var2 = (r6h1) iu30Var.invoke(Integer.valueOf(i));
                Integer numValueOf = Integer.valueOf(i);
                String uri = hdkVar.getUri();
                String strQ = sok.q(hdkVar);
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-concert-campaign-promo-card";
                x6h1VarI2.f = "3.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.c = numValueOf;
                x6h1VarI2.e = strQ;
                x6h1VarI2.d = uri;
                y6h1 y6h1VarA3 = x6h1VarI2.a();
                if (ddkVar.equals(yck.a)) {
                    String uri2 = hdkVar.getUri();
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri2 != null ? uri2 : "")), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (ddkVar instanceof zck) {
                        int iOrdinal = ((zck) ddkVar).a.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            x6h1 x6h1VarC18 = y6h1VarA3.c();
                            x6h1VarC18.i.add(new a7h1("see_tickets_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC18.j = false;
                            y6h1 y6h1VarA4 = x6h1VarC18.a();
                            String uri3 = hdkVar.getUri();
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri3 != null ? uri3 : "")), y6h1VarA4, r6h1Var2, System.currentTimeMillis());
                        } else if (iOrdinal == 2) {
                            x6h1 x6h1VarC19 = y6h1VarA3.c();
                            x6h1VarC19.i.add(new a7h1("join_waitlist_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC19.j = false;
                            y6h1 y6h1VarA5 = x6h1VarC19.a();
                            String uri4 = hdkVar.getUri();
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", uri4 != null ? uri4 : "")), y6h1VarA5, r6h1Var2, System.currentTimeMillis());
                        } else {
                            if (iOrdinal == 3) {
                                return null;
                            }
                            if (iOrdinal != 4) {
                                if (iOrdinal == 5) {
                                    return null;
                                }
                                eg.o();
                                return null;
                            }
                            x6h1 x6h1VarC110 = y6h1VarA3.c();
                            x6h1VarC110.i.add(new a7h1("see_tickets_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC110.j = false;
                            y6h1 y6h1VarA6 = x6h1VarC110.a();
                            String uri5 = hdkVar.getUri();
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri5 != null ? uri5 : "")), y6h1VarA6, r6h1Var2, System.currentTimeMillis());
                        }
                    } else if (ddkVar.equals(bdk.a)) {
                        x6h1 x6h1VarC20 = y6h1VarA3.c();
                        x6h1VarC20.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC20.a(), r6h1Var2, System.currentTimeMillis());
                    } else if (ddkVar.equals(cdk.a)) {
                        x6h1 x6h1VarC21 = y6h1VarA3.c();
                        x6h1VarC21.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        y6h1 y6h1VarA7 = x6h1VarC21.a();
                        String strU = sok.u(hdkVar);
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", strU != null ? strU : ""), new mmr0("share_id", "share-campaign-promo-card")})), y6h1VarA7, r6h1Var2, System.currentTimeMillis());
                    } else {
                        if (!ddkVar.equals(adk.a)) {
                            eg.o();
                            return null;
                        }
                        if ((hdkVar instanceof hdk) && hdkVar.v) {
                            x6h1 x6h1VarC22 = y6h1VarA3.c();
                            x6h1VarC22.i.add(new a7h1("expand_toggle_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC22.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1Var2, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC23 = y6h1VarA3.c();
                            x6h1VarC23.i.add(new a7h1("expand_toggle_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC23.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC23.a(), r6h1Var2, System.currentTimeMillis());
                        }
                    }
                }
                return w7h1Var2;
            case 8:
                ((Number) obj2).intValue();
                j2i j2iVar = pej.a;
                kuo1.a(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                si1.e(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                j82.e(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                j82.f(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                d1u.e(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                d1u.g(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                d1u.h(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                d1u.r(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                qxd0.m(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj2).intValue();
                exd0.d(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                exd0.f(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                hqq0.b(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                dgd0.c(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    idx idxVar = new idx(4);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new uef0(iu30Var, (byte) 24);
                        x340Var2.s0(objT);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT), idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-830956126, new vx1(i, (byte) 27), x340Var2), x340Var2, 0, 48, 2044);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    idx idxVar2 = new idx(4);
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new uef0(iu30Var, (byte) 27);
                        x340Var4.s0(objT2);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT2), idxVar2, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1665622339, new p4g0(i, (byte) 0), x340Var4), x340Var4, 0, 48, 2044);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                fho1.e(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj2).intValue();
                tho1.h(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                gyo1.q(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                vgo1.h(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ujo1.g(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                dzo1.e(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                cbp1.f(iu30Var, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b30(byte b, int i, iu30 iu30Var, boolean z) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = i;
    }
}
