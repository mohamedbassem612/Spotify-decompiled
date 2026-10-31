package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.functions.Consumer;
import com.spotify.playlist.proto.PlaylistRequest;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pdb0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdb0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        ezb0 ezb0Var;
        ji0 ji0Var;
        d3d1 d3d1Var;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        tv80 tv80VarM;
        dxy dxyVar;
        n2c0 n2c0Var;
        switch (this.a) {
            case 0:
                return ((rdb0) this.b).d;
            case 1:
                aeb0 aeb0Var = (aeb0) obj;
                Consumer consumer = ((heb0) this.b).d;
                if (consumer != null) {
                    consumer.accept(aeb0Var);
                }
                return rih1.a;
            case 2:
                o860 o860Var = (o860) this.b;
                w1r0 w1r0Var = (w1r0) o860Var.c;
                uba ubaVar = (wnh1) o860Var.b;
                uba ubaVar2 = ubaVar;
                ubaVar2.getClass();
                w1r0Var.b.b(ubaVar2.a().subscribe(new ixp0(w1r0Var, (byte) 7)));
                ubaVar.G();
                ubaVar.F();
                return new jeb0((zac0) obj, o860Var);
            case 3:
                qlb qlbVar = (qlb) this.b;
                return d3p1.H(qlbVar.b, (o3r) qlbVar.f, (String) obj);
            case 4:
                if (((HashSet) this.b).add((String) obj)) {
                    n57.s("Duplicate Your Library item key");
                }
                return rih1.a;
            case 5:
                ((kxb0) this.b).d.b(((Number) obj).intValue());
                return rih1.a;
            case 6:
                return (lt20) ((rwj) this.b).e;
            case 7:
                szb0 szb0Var = (szb0) obj;
                ezb0 ezb0Var2 = (ezb0) this.b;
                d3d1 d3d1Var2 = ezb0Var2.g;
                ji0 ji0Var2 = szb0Var.a;
                int i3 = szb0Var.b;
                boolean z = szb0Var.c;
                String str4 = ezb0Var2.f;
                String str5 = ji0Var2.e;
                int i4 = ji0Var2.c1;
                String str6 = ji0Var2.h;
                String str7 = ji0Var2.a;
                String str8 = ji0Var2.c;
                String str9 = ji0Var2.t;
                int i5 = z ? 1 : 2;
                int i6 = z ? 2 : 1;
                dxy dxyVar2 = ezb0Var2.a;
                boolean z2 = i4 == 1;
                String strC = bb00.c(i6);
                String str10 = d3d1Var2.a;
                boolean zY = nhc1.Y(str5, "spotify:", false);
                yqu0 yqu0Var = (yqu0) dxyVar2.f;
                int i7 = i6;
                i8h1 i8h1Var = (i8h1) yqu0Var.c;
                tol0 tol0Var = (tol0) yqu0Var.b;
                dxy dxyVar3 = dxyVar2;
                b7x b7xVar = b7x.a;
                int iC = l1d.C(i5);
                if (iC == 0) {
                    ezb0Var = ezb0Var2;
                    ji0Var = ji0Var2;
                    d3d1Var = d3d1Var2;
                    i = i4;
                    i2 = i3;
                    str = str8;
                    str2 = str10;
                    str3 = str9;
                    if (zY) {
                        x6h1 x6h1VarC = tol0Var.a.c();
                        x6h1VarC.i.add(new a7h1("cta_card", str6, (Integer) null, str4, ""));
                        x6h1VarC.j = true;
                        tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else {
                        x6h1 x6h1VarC2 = tol0Var.a.c();
                        x6h1VarC2.i.add(new a7h1("cta_card", str6, (Integer) null, str4, ""));
                        x6h1VarC2.j = true;
                        tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str5)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    if (zY) {
                        i = i4;
                        str = str8;
                        str2 = str10;
                        d3d1Var = d3d1Var2;
                        str3 = str9;
                        x6h1 x6h1VarC3 = tol0Var.a.c();
                        ezb0Var = ezb0Var2;
                        ji0Var = ji0Var2;
                        i2 = i3;
                        x6h1VarC3.i.add(new a7h1("cta_card", str6, (Integer) null, str4, ""));
                        x6h1VarC3.j = true;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("cta_button", str6, (Integer) null, str4, (String) null));
                        x6h1VarC4.j = true;
                        tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else {
                        x6h1 x6h1VarC5 = tol0Var.a.c();
                        i = i4;
                        str2 = str10;
                        d3d1Var = d3d1Var2;
                        str3 = str9;
                        x6h1VarC5.i.add(new a7h1("cta_card", str6, (Integer) null, str4, ""));
                        x6h1VarC5.j = true;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("cta_button", str6, (Integer) null, str4, (String) null));
                        x6h1VarC6.j = true;
                        tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str5)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        ezb0Var = ezb0Var2;
                        ji0Var = ji0Var2;
                        i2 = i3;
                        str = str8;
                    }
                }
                if (zY) {
                    dxyVar = dxyVar3;
                    ((lzn0) dxyVar.d).a(str5, tv80VarM, (Bundle) null);
                } else {
                    dxyVar = dxyVar3;
                    ((ko0) dxyVar.c).c((dg30) dxyVar.e, new a580(str5, str7, str, str3));
                }
                if (z2) {
                    dxyVar3 = dxyVar3;
                    dxyVar3 = dxyVar3;
                    ao0.c((ao0) dxyVar.b, co0.d, str7, 0L, strC, str2, (String) null, (String) null, 96);
                }
                dxyVar3 = dxyVar3;
                dxyVar3 = dxyVar3;
                ezb0 ezb0Var3 = ezb0Var;
                ji0 ji0Var3 = ji0Var;
                d3d1 d3d1Var3 = d3d1Var;
                int i8 = i;
                ezb0Var3.d.a(d3d1Var3, i7, str4, i2, ji0Var3.h, ji0Var3.t);
                if (i8 != 1) {
                    aru0 aru0Var = ezb0Var3.b;
                    String str11 = ji0Var3.h;
                    z6x z6xVar = (List) ji0Var3.Q0.get("clicked");
                    if (z6xVar == null) {
                        z6xVar = z6x.a;
                    }
                    aru0Var.g(str11, "clicked", z6xVar, d3d1Var3, ji0Var3.t);
                }
                return rih1.a;
            case 8:
                tyb0 tyb0Var = ((jxo0) obj).a;
                List list = tyb0Var.b;
                fzb0 fzb0Var = (fzb0) this.b;
                if (!fzb0Var.e) {
                    fzb0Var.d.a(list);
                }
                return new vxb0(tyb0Var.a, list);
            case 9:
                Bundle bundle = (Bundle) obj;
                if (bundle != null && (n2c0Var = (n2c0) jhc1.t(bundle, "legal_page_model", n2c0.class)) != null) {
                    return n2c0Var;
                }
                o2c0 o2c0Var = ((z1c0) this.b).c;
                int i9 = o2c0Var.c;
                int i10 = o2c0Var.d;
                tpw0 tpw0Var = o2c0Var.b;
                return new n2c0(i9, i10, tpw0Var, o2c0Var.a, o2c0Var.e, true, false, tpw0Var != tpw0.e);
            case 10:
                return new CompletableFromAction(new f72((q3c0) this.b, (byte) 28));
            case 11:
                ((qtr) obj).b(new psm((umf0) this.b, null, (byte) 1));
                return rih1.a;
            case 12:
                ((qtr) obj).b(new js((mbc0) this.b, (lnm) null, (byte) 14));
                return rih1.a;
            case 13:
                return new mdc0(((aec0) this.b).e);
            case 14:
                ((qtr) obj).b(new kr((et90) this.b, (lnm) null, (byte) 24));
                return rih1.a;
            case 15:
                String str12 = (String) obj;
                ifc0 ifc0Var = (ifc0) this.b;
                LinkedHashMap linkedHashMap = ifc0Var.e;
                Object obj2 = linkedHashMap.get(str12);
                if (obj2 == null) {
                    nop nopVar = ifc0Var.b;
                    xe01 xe01Var = ifc0Var.f;
                    kp5 kp5Var = (kp5) nopVar.a.c;
                    et90 et90Var = new et90(cto1.q(((qop) kp5Var.a).c()), (xec0) ((jly0) kp5Var.f).get(), str12, xe01Var);
                    linkedHashMap.put(str12, et90Var);
                    obj2 = et90Var;
                }
                return (maa) obj2;
            case 16:
                return new x880((mr20) obj, (uqg) this.b, (byte) 21);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                x6e x6eVar = (x6e) this.b;
                l1o l1oVar = (l1o) x6eVar.c;
                return new tcc0(l1oVar.a, l1oVar.c, !((xf4) x6eVar.d).n());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                egc0 egc0Var = (egc0) this.b;
                return new kqm1("limit-auto-downloads", egc0Var.getView().getContext().getString(2131952668), zro1.x(((dgc0) obj).a, egc0Var.getView().getContext()));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                xa5 xa5Var = (xa5) obj;
                g23 g23Var = (g23) this.b;
                return xa5Var.a(((ygc0) xa5Var.e()).c ? (p9m) g23Var.b : (p9m) g23Var.c, (c391) g23Var.d);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new dl6(((hic1) obj).a, (cl6) this.b, 4);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                zuc0 zuc0Var = (zuc0) o7h.s0(((wsc0) obj).e);
                return zuc0Var == null ? new ly21(new gy21("Item not found in playlist")) : ((py21) this.b).a(new csc0(zuc0Var, (byte) 1));
            case 22:
                PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) obj;
                wo30 wo30Var = ((rsc0) this.b).b;
                kby kbyVar = wo30Var.b(playlistGetResponse.o()).f;
                PlaylistRequest.Collaborators collaboratorsQ = playlistGetResponse.o().q();
                ArrayList arrayList = new ArrayList();
                for (PlaylistRequest.Collaborator collaborator : collaboratorsQ.o()) {
                    arrayList.add(new nqc0(wo30Var.e(collaborator.r()), collaborator.n(), collaborator.p(), collaborator.q(), collaborator.o()));
                }
                return new oqc0(kbyVar.b, o7h.l1(arrayList), collaboratorsQ.p());
            case 23:
                Set set = (Set) obj;
                if (set.isEmpty()) {
                    return new huz(b7x.a, (byte) 10);
                }
                Set<ouc0> set2 = set;
                haa0 haa0Var = (haa0) this.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(set2, 10));
                for (ouc0 ouc0Var : set2) {
                    arrayList2.add(new x880(haa0Var.o(ouc0Var.a), ouc0Var, (byte) 23));
                }
                return new wa3((mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]), (byte) 20);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                int iIntValue = ((Number) obj).intValue();
                b8e0 b8e0Var = (un90) this.b;
                return (ttm1) b8e0Var.getItems().get(iIntValue - ((rr80) b8e0Var.a()).a);
            case 25:
                return new h3r(new d3r("Failed to get list with URI " + ((nwc0) this.b) + ": " + ((jy21) obj)));
            case 26:
                return new ge8((yyc0) this.b, (byte) 5);
            case 27:
                Set set3 = (Set) obj;
                if (set3.isEmpty()) {
                    return new huz(b7x.a, (byte) 10);
                }
                Set<g4d0> set4 = set3;
                r3d0 r3d0Var = (r3d0) this.b;
                ArrayList arrayList3 = new ArrayList(q7h.U(set4, 10));
                for (g4d0 g4d0Var : set4) {
                    arrayList3.add(new x880(r3d0Var.c(g4d0Var.a), g4d0Var, (byte) 26));
                }
                return new wa3((mr20[]) o7h.l1(arrayList3).toArray(new mr20[0]), (byte) 22);
            case 28:
                return wyo1.o((pp90) ((c9c0) this.b).b.current().getValue());
            default:
                ((qtr) obj).b(new skv((qj0) this.b, (lnm) null, (byte) 18));
                return rih1.a;
        }
    }
}
