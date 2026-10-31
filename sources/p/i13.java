package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i13 implements f4r {
    public final /* synthetic */ byte a;
    public static final i13 b = new i13(0);
    public static final i13 c = new i13(1);
    public static final i13 d = new i13(2);
    public static final i13 e = new i13(3);
    public static final i13 f = new i13(4);
    public static final i13 g = new i13(5);
    public static final i13 h = new i13(6);
    public static final i13 i = new i13(7);
    public static final i13 j = new i13(8);
    public static final i13 k = new i13(9);
    public static final i13 l = new i13(10);
    public static final i13 m = new i13(11);
    public static final i13 n = new i13(12);
    public static final i13 o = new i13(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final i13 f16p = new i13(14);
    public static final i13 q = new i13(15);
    public static final i13 r = new i13(16);
    public static final i13 s = new i13(17);
    public static final i13 t = new i13(18);
    public static final i13 u = new i13(19);
    public static final i13 v = new i13(20);
    public static final i13 w = new i13(21);
    public static final i13 x = new i13(22);
    public static final i13 y = new i13(23);
    public static final i13 z = new i13(24);
    public static final i13 A = new i13(25);

    public /* synthetic */ i13(byte b2) {
        this.a = b2;
    }

    public final f1r a(Object obj) {
        byte b2 = this.a;
        z6x z6xVar = z6x.a;
        switch (b2) {
            case 0:
                List list = ((m13) obj).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jh5(new xv00(rc11.a.b(a7q0.class)), (String) it.next()));
                }
                jh5[] jh5VarArr = (jh5[]) arrayList.toArray(new jh5[0]);
                jh5[] jh5VarArr2 = (jh5[]) Arrays.copyOf(jh5VarArr, jh5VarArr.length);
                ArrayList arrayList2 = new ArrayList(jh5VarArr2.length);
                for (jh5 jh5Var : jh5VarArr2) {
                    arrayList2.add(new e1r(jh5Var, 2, xdc0.Y0));
                }
                return new hoc0(arrayList2, false);
            case 1:
                ilg0 ilg0Var = (ilg0) obj;
                return ilg0Var.e ? zs6.a.a(ilg0Var.a) : new p6x();
            case 2:
                return xei1.a.a(((bo7) obj).a);
            case 3:
                return new p6x();
            case 4:
                return new p6x();
            case 5:
                return new p6x();
            case 6:
                return new p6x();
            case 7:
                return pvh.a.a(((jvh) obj).a);
            case 8:
                return new p6x();
            case 9:
                return new p6x();
            case 10:
                return new p6x();
            case 11:
                return new p6x();
            case 12:
                String str = (String) obj;
                return g6p1.s(g6p1.s(w5b0.h.a(str), w5b0.i.a(str)), w5b0.j.a(str));
            case 13:
                return new p6x();
            case 14:
                return new p6x();
            case 15:
                List<String> list2 = ((gqm0) obj).a;
                if (list2.isEmpty()) {
                    return new hoc0(z6xVar, true);
                }
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : list2) {
                    jd11 jd11Var = rc11.a;
                    arrayList3.add(new e1r(new jh5(new xv00(jd11Var.b(jo70.class)), str2), 1, xjm0.O0));
                    arrayList3.add(new e1r(new jh5(new xv00(jd11Var.b(xkk1.class)), str2), 2, xjm0.P0));
                }
                return new hoc0(arrayList3, true);
            case 16:
                List<String> list3 = ((tqm0) obj).a;
                if (list3.isEmpty()) {
                    return new hoc0(z6xVar, true);
                }
                ArrayList arrayList4 = new ArrayList();
                for (String str3 : list3) {
                    jd11 jd11Var2 = rc11.a;
                    arrayList4.add(new e1r(new jh5(new xv00(jd11Var2.b(j6k.class)), str3), 1, xjm0.Q0));
                    arrayList4.add(new e1r(new jh5(new xv00(jd11Var2.b(lhe0.class)), str3), 1, xjm0.R0));
                }
                String str4 = (String) o7h.s0(list3);
                if (str4 != null) {
                    jd11 jd11Var3 = rc11.a;
                    arrayList4.add(new e1r(new jh5(new xv00(jd11Var3.b(jfk.class)), str4), 2, xjm0.S0));
                    arrayList4.add(new e1r(new jh5(new xv00(jd11Var3.b(fqk.class)), str4), 1, xjm0.T0));
                }
                return new hoc0(arrayList4, true);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return dku0.a.a((wju0) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new p6x();
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                fmg0 fmg0Var = (fmg0) obj;
                String str5 = fmg0Var.b;
                return (str5 == null || !fmg0Var.h) ? new p6x() : zs6.a.a(str5);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new p6x();
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new p6x();
            case 22:
                return new p6x();
            case 23:
                return new p6x();
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new p6x();
            case 25:
                List list4 = ((j6l1) obj).c;
                if (list4.isEmpty()) {
                    return new hoc0(z6xVar, true);
                }
                List list5 = list4;
                ArrayList arrayList5 = new ArrayList(q7h.U(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new e1r(new jh5(new xv00(rc11.a.b(bbl1.class)), (String) it2.next()), 2, v5l1.t));
                }
                return new hoc0(arrayList5, false);
            case 26:
                return x4o.f(x4o.g((f5o) obj)).a(rih1.a);
            case 27:
                return new p6x();
            default:
                if (((c8k0) obj) instanceof c8k0) {
                    return new p6x();
                }
                eg.o();
                return null;
        }
    }
}
