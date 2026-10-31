package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xk90 {
    public final wmy a;
    public final List b;
    public final j2i c;
    public final LinkedHashMap d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;

    public xk90(List list, j2i j2iVar, wmy wmyVar) {
        boolean z;
        this.a = wmyVar;
        this.b = list;
        this.c = j2iVar;
        List<s1v0> list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (s1v0 s1v0Var : list2) {
            yd91 yd91VarD = ((pk90) s1v0Var.b).d();
            linkedHashMap.put(s1v0Var.a, new rk90((maa) yd91VarD.c.invoke(), yd91VarD.a, yd91VarD.b));
        }
        this.d = linkedHashMap;
        List list3 = this.b;
        boolean z2 = false;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((pk90) ((s1v0) it.next()).b).c() != p381.a) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        this.e = z;
        List list4 = this.b;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (!((pk90) ((s1v0) it2.next()).b).c().b().b().isEmpty()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f = z2;
        this.g = new HashMap();
    }

    public final boolean a(m381 m381Var, vhc1 vhc1Var) {
        if (m381Var == p381.a) {
            return true;
        }
        if (!m381Var.b().b().isEmpty()) {
            i1r i1rVarB = ((rzq) this.a.d).b(m381Var.b().a(vhc1Var));
            return (i1rVarB instanceof i1r) && m381Var.r(vhc1Var, i1rVarB.a);
        }
        HashMap map = this.g;
        Object obj = map.get(m381Var);
        if (obj == null) {
            i1r i1rVarA = m381Var.b().a(vhc1Var).a(b7x.a);
            i1r i1rVar = i1rVarA instanceof i1r ? i1rVarA : null;
            if (i1rVar == null || (obj = i1rVar.a) == null) {
                return false;
            }
            map.put(m381Var, obj);
        }
        return m381Var.r(vhc1Var, obj);
    }

    public final String b(hwq hwqVar, boolean z, x340 x340Var, int i) {
        List list;
        Object next;
        String str;
        Object next2;
        s1v0 s1v0Var;
        m4c m4cVar = fkj0.X;
        x340Var.i0(-365477049);
        boolean z2 = this.e;
        List list2 = this.b;
        if (z2) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                s1v0Var = (s1v0) next2;
                if (z) {
                    break;
                }
            } while (((pk90) s1v0Var.b).a());
            s1v0 s1v0Var2 = (s1v0) next2;
            str = s1v0Var2 != null ? s1v0Var2.a : null;
            x340Var.r(false);
            return str;
        }
        vhc1 vhc1VarU = i2p1.u(hwqVar);
        if (!this.f) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                s1v0 s1v0Var3 = (s1v0) next;
                if (z || !((pk90) s1v0Var3.b).a()) {
                    if (a(((pk90) s1v0Var3.b).c(), vhc1VarU)) {
                        break;
                    }
                }
            }
            s1v0 s1v0Var4 = (s1v0) next;
            str = s1v0Var4 != null ? s1v0Var4.a : null;
            x340Var.r(false);
            return str;
        }
        int i2 = (i & 112) ^ 48;
        boolean z3 = true;
        boolean z4 = (i2 > 32 && x340Var.h(z)) || (i & 48) == 32;
        Object objT = x340Var.T();
        Object obj = objT;
        if (z4 || objT == m4cVar) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                s1v0 s1v0Var5 = (s1v0) obj2;
                if (z || !((pk90) s1v0Var5.b).a()) {
                    arrayList.add(obj2);
                }
            }
            x340Var.s0(arrayList);
            obj = arrayList;
        }
        List list3 = (List) obj;
        boolean zG = x340Var.g(list3);
        Object objT2 = x340Var.T();
        Object obj3 = objT2;
        if (zG || objT2 == m4cVar) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list3) {
                if (!((pk90) ((s1v0) obj4).b).c().b().b().isEmpty()) {
                    arrayList2.add(obj4);
                }
            }
            x340Var.s0(arrayList2);
            obj3 = arrayList2;
        }
        List list4 = (List) obj3;
        boolean zI = x340Var.i(list3) | x340Var.i(this) | x340Var.i(vhc1VarU);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new xvy(list3, this, vhc1VarU, (byte) 29);
            x340Var.s0(objT3);
        }
        Function0 function0 = (Function0) objT3;
        boolean zG2 = x340Var.g(vhc1VarU);
        if ((i2 <= 32 || !x340Var.h(z)) && (i & 48) != 32) {
            z3 = false;
        }
        boolean z5 = zG2 | z3;
        Object objT4 = x340Var.T();
        if (z5 || objT4 == m4cVar) {
            objT4 = v8r.q(function0.invoke());
            x340Var.s0(objT4);
        }
        ven0 ven0Var = (ven0) objT4;
        boolean zI2 = x340Var.i(list4) | x340Var.i(this) | x340Var.i(vhc1VarU) | x340Var.i(ven0Var) | x340Var.g(function0);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            list = list4;
            zn0 zn0Var = new zn0(list, this, vhc1VarU, ven0Var, function0, (lnm) null);
            x340Var.s0(zn0Var);
            objT5 = zn0Var;
        } else {
            list = list4;
        }
        qxd0.s(vhc1VarU, list, (vu30) objT5, x340Var);
        String str2 = (String) ven0Var.getValue();
        x340Var.r(false);
        return str2;
    }

    public final wk90 c(hwq hwqVar, boolean z) {
        z6x z6xVar;
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            s1v0 s1v0Var = (s1v0) obj;
            if (z || !((pk90) s1v0Var.b).a()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (this.f) {
            vhc1 vhc1VarU = i2p1.u(hwqVar);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!((pk90) ((s1v0) obj2).b).c().b().b().isEmpty()) {
                    arrayList2.add(obj2);
                }
            }
            z6x arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((pk90) ((s1v0) it.next()).b).c().b().a(vhc1VarU));
            }
            z6xVar = arrayList3;
        } else {
            z6xVar = z6x.a;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            rk90 rk90Var = (rk90) this.d.get(((s1v0) it2.next()).a);
            maa maaVar = rk90Var != null ? rk90Var.a : null;
            wul1 wul1Var = maaVar instanceof wul1 ? (wul1) maaVar : null;
            if (wul1Var != null) {
                arrayList4.add(wul1Var);
            }
        }
        return new wk90(this, z6xVar, arrayList4, hwqVar);
    }
}
