package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iik0 implements f4r {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public iik0(yk90 yk90Var, c0a c0aVar) {
        this.a = (byte) 28;
        this.b = yk90Var;
    }

    public final f1r a(Object obj) {
        lch p6xVar;
        wk90 wk90VarC;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                kak0 kak0Var = (kak0) obj;
                wik0 wik0Var = (wik0) obj2;
                i13 i13Var = (i13) wik0Var.X.h;
                wik0Var.l(kak0Var, ihh1.a);
                i13Var.getClass();
                p6x p6xVar2 = new p6x();
                nm1 nm1Var = wik0Var.t;
                return g6p1.s(g6p1.s(g6p1.s(g6p1.s(g6p1.s(p6xVar2, ((iik0) nm1Var.h).a(wik0Var.t(kak0Var, ijf1.a))), ((iik0) wik0Var.i.t).a(wik0Var.u(kak0Var, (t4h1) null))), ((iik0) nm1Var.h).a(wik0Var.t(kak0Var, ijf1.b))), wik0Var.Y.c.a(wik0.r(kak0Var, (t4h1) null, false))), wik0Var.X0.a(new dik0(kak0Var.S0, kak0Var.j1)));
            case 1:
                mlk0 mlk0Var = (mlk0) obj;
                nm1 nm1Var2 = (nm1) obj2;
                return g6p1.s(((o3r) nm1Var2.c).a(mlk0Var), ((jd6) nm1Var2.g).c.a(new r7k0(mlk0Var.a, mlk0Var.b, mlk0Var.c, mlk0Var.d, mlk0Var.f, mlk0Var.g, mlk0Var.h)));
            case 2:
                cok0 cok0Var = (cok0) obj;
                psy psyVar = (psy) obj2;
                return g6p1.s(((o3r) psyVar.X).a(cok0Var), ((o3r) psyVar.c).a(cok0Var));
            case 3:
                return ((jd6) obj2).c.a((yjm0) obj);
            case 4:
                return ((uym0) obj2).f.a(((qym0) obj).a);
            case 5:
                return ((o2n0) obj2).d.a((k2n0) obj);
            case 6:
                return ((o3r) ((qlb) obj2).f).a((u2n0) obj);
            case 7:
                return ((jd6) obj2).c.a((h4n0) obj);
            case 8:
                return ((o3r) ((qlb) obj2).f).a((o4n0) obj);
            case 9:
                git0 git0Var = (git0) obj;
                return git0Var.c instanceof ih90 ? ((rit0) obj2).Z.a(git0Var) : new p6x();
            case 10:
                nm1 nm1Var3 = (nm1) obj2;
                return ((d0r) nm1Var3.g) != null ? ((o3r) nm1Var3.c).a((c1x0) obj) : new p6x();
            case 11:
                return new lch(Collections.singletonList(((f4r) ((inx0) obj2).b.d).a((tmx0) obj)));
            case 12:
                return new lch(Collections.singletonList(((f4r) ((qfv) ((kox0) obj2).d).d).a((xnx0) obj)));
            case 13:
                qlb qlbVar = (qlb) obj2;
                jd6 jd6Var = (jd6) qlbVar.f;
                o3r o3rVar = jd6Var.c;
                Set set = s4b1.f;
                String str = ((p3y0) obj).a;
                String strS = uic.x(str).s();
                f1r f1rVarA = o3rVar.a(new l3o(strS != null ? strS : "", 2, true));
                o3r o3rVar2 = jd6Var.c;
                String str2 = (String) qlbVar.e;
                return g6p1.s(f1rVarA, o3rVar2.a(new l3o(str2, 2, u890.j(str != null ? uic.x(str).s() : null, str2))));
            case 14:
                fy01 fy01Var = (fy01) obj;
                return fy01Var.c ? ((ky01) obj2).d.a(fy01Var) : new p6x();
            case 15:
                uv11 uv11Var = (uv11) obj;
                return ihc1.y0(uv11Var.a) ? new p6x() : ((f4r) obj2).a(uv11Var);
            case 16:
                fu31 fu31Var = (fu31) obj;
                ftv ftvVar = fu31Var.c;
                ftv ftvVar2 = fu31Var.b;
                ru31 ru31Var = (ru31) obj2;
                if (fu31Var.d) {
                    i13 i13Var2 = ru31Var.i.P0;
                    b7x b7xVar = b7x.a;
                    f1r f1rVarR = qxy0.r(i13Var2.a(new c8k0(ftvVar != null ? new a8k0(ftvVar.b, ftvVar.a, ftvVar.g, ftvVar.t) : new a8k0("", "", false, b7xVar), ftvVar2 != null ? new a8k0(ftvVar2.b, ftvVar2.a, ftvVar2.g, ftvVar2.t) : new a8k0("", "", false, b7xVar), ru31Var.b, fu31Var.j)));
                    if (ftvVar == null) {
                        f1rVarR = null;
                    }
                    o3r o3rVar3 = ru31Var.t.c;
                    String str3 = ftvVar2.b;
                    String str4 = (String) ftvVar2.t.get("item.speed");
                    p6xVar = g6p1.s(f1rVarR, ru31Var.p(fu31Var) ? qxy0.r(o3rVar3.a(new r7k0(str3, str4 != null ? nhc1.b0(str4) : null))) : null);
                } else {
                    p6xVar = new p6x();
                }
                return g6p1.s(p6xVar, qxy0.r(ru31Var.X.a(fu31Var)));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                p541 p541Var = (p541) obj;
                String str5 = p541Var.a;
                Set set2 = s4b1.f;
                vi11 vi11Var = (vi11) obj2;
                return uic.x(str5).c == blc0.Ef ? ((o3r) vi11Var.c).a(p541Var) : ((o3r) vi11Var.d).a(p541Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((jd6) obj2).c.a((oaa1) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                xaa1 xaa1Var = (xaa1) obj;
                cba1 cba1Var = (cba1) obj2;
                return g6p1.s(qxy0.r(cba1Var.c.a(xaa1Var)), qxy0.r(cba1Var.d.a(xaa1Var)));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                dea1 dea1Var = (dea1) obj;
                iea1 iea1Var = (iea1) obj2;
                lch lchVarS = g6p1.s(qxy0.r(iea1Var.d.a(dea1Var)), qxy0.r(iea1Var.e.a(dea1Var)));
                o3r o3rVar4 = iea1Var.f;
                String str6 = dea1Var.a;
                return g6p1.s(g6p1.s(lchVarS, qxy0.r(o3rVar4.a(str6))), qxy0.r(iea1Var.b.Y.a(new p08(str6, str6, "193a8f3811c445a2b9d5d1d696b9de07"))));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                gfb1 gfb1Var = (gfb1) obj2;
                return gfb1Var.e != null ? gfb1Var.g.a((web1) obj) : new p6x();
            case 22:
                qlb qlbVar2 = (qlb) obj2;
                return ((d0r) qlbVar2.e) != null ? ((o3r) qlbVar2.f).a((jfb1) obj) : new p6x();
            case 23:
                xgb1 xgb1Var = (xgb1) obj;
                wa71 wa71Var = xgb1Var.d;
                return ((lb) obj2).a(wa71Var.a).a(wa71Var).a(xgb1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((jd6) obj2).c.a((hjc1) obj);
            case 25:
                return ((bdd1) obj2).c.a((xcd1) obj);
            case 26:
                h290 h290Var = ((lvd1) obj).c;
                svd1 svd1Var = (svd1) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
                Iterator it = h290Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(svd1Var.b.a((String) it.next()));
                }
                if (arrayList.isEmpty()) {
                    return new p6x();
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    hhg1.h("Empty collection can't be reduced.");
                    return null;
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = g6p1.s((f1r) next, (f1r) it2.next());
                }
                return (f1r) next;
            case 27:
                return ((el9) obj2).c.a((lnh1) obj);
            case 28:
                hwq hwqVar = ((bxj1) obj).b;
                xk90 xk90Var = ((yk90) obj2).i;
                return (xk90Var == null || (wk90VarC = xk90Var.c(hwqVar, true)) == null) ? new p6x() : wk90VarC.a.a(hwqVar);
            default:
                return ((o3r) ((qlb) obj2).f).a(((i3k1) obj).a);
        }
    }

    public /* synthetic */ iik0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
