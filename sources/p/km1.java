package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class km1 implements f4r {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ km1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final f1r a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nm1 nm1Var = (nm1) obj2;
                return ((d0r) nm1Var.g) != null ? ((o3r) nm1Var.c).a((am1) obj) : new p6x();
            case 1:
                return ((hw2) obj2).c.a((pw2) obj);
            case 2:
                return ((tp6) obj2).d.a((wp6) obj);
            case 3:
                p08 p08Var = (p08) obj;
                y08 y08Var = (y08) obj2;
                int iC = l1d.C(1);
                if (iC == 0) {
                    return y08Var.t.a(p08Var);
                }
                if (iC == 1) {
                    return y08Var.X.a(p08Var);
                }
                eg.o();
                return null;
            case 4:
                hw2 hw2Var = (hw2) obj2;
                o3r o3rVar = hw2Var.c;
                String str = ((rm9) hw2Var.f).a.h;
                return o3rVar.a(str != null ? str : "");
            case 5:
                nm1 nm1Var2 = (nm1) obj2;
                o3r o3rVar2 = (o3r) nm1Var2.c;
                String str2 = ((rm9) nm1Var2.f).a.h;
                return o3rVar2.a(str2 != null ? str2 : "");
            case 6:
                hw2 hw2Var2 = (hw2) obj2;
                return ((d0r) hw2Var2.h) != null ? hw2Var2.c.a((u3a) obj) : new p6x();
            case 7:
                jqa jqaVar = (jqa) obj;
                upa upaVar = (upa) obj2;
                return upaVar.b.h(jqaVar.d.a).a(jqaVar, new kd8(upaVar, jqaVar, (byte) 15)).a(jqaVar);
            case 8:
                ArrayList arrayList = ((w8e) obj).c;
                qlb qlbVar = (qlb) obj2;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((g9e) ((idd1) qlbVar.f).getValue()).c.a((d9e) it.next()));
                }
                return new lch(arrayList2);
            case 9:
                return ((qng) obj2).i.a(((mng) obj).a);
            case 10:
                o6h o6hVar = (o6h) obj;
                y5h y5hVar = (y5h) obj2;
                return y5hVar.b.h(o6hVar.e.a).a(o6hVar, new w9f(y5hVar, o6hVar, (byte) 20)).a(o6hVar);
            case 11:
                return ((o3r) ((qlb) obj2).f).a((zth) obj);
            case 12:
                return ((o3r) ((qlb) obj2).f).a(((gcm) obj).a);
            case 13:
                qlb qlbVar2 = (qlb) obj2;
                return ((d0r) qlbVar2.e) != null ? ((o3r) qlbVar2.f).a((lem) obj) : new p6x();
            case 14:
                sxm sxmVar = (sxm) obj;
                hw2 hw2Var3 = (hw2) obj2;
                return (sxmVar.b != null ? hw2Var3.c : (o3r) hw2Var3.h).a(sxmVar);
            case 15:
                return qxy0.r(((m4o) ((n0o) obj2).t).X.a(new b4o(((c0o) obj).b)));
            case 16:
                return ((o3r) obj2).a(obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                el9 el9Var = (el9) obj2;
                o3r o3rVar3 = ((m4o) el9Var.t).X;
                String str3 = ((d5w) obj).a;
                return g6p1.s(qxy0.r(o3rVar3.a(new b4o(str3))), el9Var.c.a(str3));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                koy koyVar = (koy) obj;
                xoy xoyVar = (xoy) obj2;
                String str4 = koyVar.a;
                if (koyVar.b != 2) {
                    return new p6x();
                }
                e1q0 e1q0Var = new e1q0(str4);
                return g6p1.s(g6p1.s(xoyVar.e.a.a(e1q0Var), ((o3r) xoyVar.f.d).a(new i1q0(str4, str4))), xoyVar.g.b.a(e1q0Var));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                dm20 dm20Var = (dm20) obj;
                xvu xvuVar = (xvu) obj2;
                return (dm20Var.g.a ? (o3r) xvuVar.Z : (o3r) xvuVar.Y).a(dm20Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                vt30 vt30Var = (vt30) obj;
                lb lbVar = ((it30) obj2).a;
                wa71 wa71Var = vt30Var.d;
                return lbVar.a(wa71Var.a).a(wa71Var).a(vt30Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ArrayList arrayList3 = ((sv70) obj).c;
                nm1 nm1Var3 = (nm1) obj2;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((bmt) ((idd1) nm1Var3.i).getValue()).e.a((tlt) it2.next()));
                }
                return new hga(arrayList4);
            case 22:
                s24 s24Var = (s24) obj2;
                o3r o3rVar4 = (o3r) s24Var.i;
                o3r o3rVar5 = (o3r) s24Var.X;
                cbk0 cbk0Var = (cbk0) s24Var.c;
                bt31 bt31Var = cbk0Var.b;
                String str5 = bt31Var.a;
                bt31 bt31Var2 = cbk0Var.c;
                f1r f1rVarA = o3rVar4.a(new hy31(str5, bt31Var2.a, bt31Var.c, bt31Var2.c));
                o3r o3rVar6 = (o3r) s24Var.t;
                lch lchVarS = g6p1.s(g6p1.s(f1rVarA, o3rVar6.a(cbk0Var.b.a)), o3rVar6.a(cbk0Var.c.a));
                o3r o3rVar7 = (o3r) s24Var.Y;
                f1r f1rVarA2 = o3rVar7.a(cbk0Var.b.b);
                f1r f1rVarA3 = ((o3r) s24Var.Z).a(cbk0Var.a);
                if (cbk0Var.d == null) {
                    return g6p1.s(g6p1.s(g6p1.s(g6p1.s(lchVarS, f1rVarA2), f1rVarA3), o3rVar5.a(cbk0Var.b.b)), o3rVar7.a(cbk0Var.c.b));
                }
                return cbk0Var.k ? g6p1.s(g6p1.s(g6p1.s(lchVarS, f1rVarA2), f1rVarA3), o3rVar5.a(cbk0Var.b.b)) : lchVarS;
            case 23:
                nm1 nm1Var4 = (nm1) obj2;
                ArrayList arrayList5 = ((k9e) obj).b;
                ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((v4b0) ((idd1) nm1Var4.h).getValue()).g.a((g7e) it3.next()));
                }
                return new lch(arrayList6);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                String str6 = (String) obj;
                qlb qlbVar3 = (qlb) obj2;
                return g6p1.s(((o3r) qlbVar3.f).a(str6), qxy0.r(((jd6) qlbVar3.e).c.a(new r7k0(str6))));
            case 25:
                wib0 wib0Var = (wib0) obj;
                bjb0 bjb0Var = (bjb0) obj2;
                f1r f1rVarA4 = bjb0Var.f.a(wib0Var);
                o3r o3rVar8 = bjb0Var.e.c;
                rib0 rib0Var = wib0Var.a;
                String str7 = rib0Var.a;
                lhg1 lhg1Var = rib0Var.g;
                String str8 = (String) rib0Var.d.get("item.speed");
                Double dA0 = str8 != null ? nhc1.a0(str8) : null;
                return g6p1.s(f1rVarA4, o3rVar8.a(new r7k0(str7, lhg1Var, dA0 != null ? Float.valueOf((float) dA0.doubleValue()) : null, 116)));
            case 26:
                el9 el9Var2 = (el9) obj2;
                return ((pp4) el9Var2.i).a() ? ((vl90) ((idd1) el9Var2.X).getValue()).c.a(new pl90((String) el9Var2.g)) : new p6x();
            case 27:
                xjj0 xjj0Var = (xjj0) obj2;
                return ((vl90) xjj0Var.g.getValue()).c.a(new pl90(xjj0Var.b));
            default:
                cak0 cak0Var = (cak0) obj;
                nm1 nm1Var5 = (nm1) obj2;
                return g6p1.s(((o3r) nm1Var5.c).a(cak0Var), ((o3r) nm1Var5.g).a(cak0Var));
        }
    }
}
