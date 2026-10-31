package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lc71 implements f961 {
    public final uu00 a;
    public final add b;
    public final q8n c;

    public lc71(uu00 uu00Var, add addVar, fza fzaVar, tz61 tz61Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = addVar;
        this.c = q8nVar;
    }

    public static wb71 b(opa1 opa1Var, rb71 rb71Var, String str, String str2, vb71 vb71Var, ib71 ib71Var) {
        return new wb71(opa1Var != null ? opa1Var.a : null, opa1Var != null ? opa1Var.b : null, rb71Var, str, opa1Var != null ? c(opa1Var, null, vb71Var, ib71Var, "") : null, str2, ib71Var, vb71Var);
    }

    public static yb71 c(opa1 opa1Var, rb71 rb71Var, vb71 vb71Var, ib71 ib71Var, String str) {
        qb71 mb71Var;
        String str2 = opa1Var.a;
        String str3 = opa1Var.b;
        String str4 = opa1Var.c;
        int i = 1;
        if (rb71Var == null) {
            ew9 ew9Var = opa1Var.f;
            yv9 yv9Var = ew9Var.b;
            if (yv9Var instanceof yv9) {
                mb71Var = new mb71(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(yv9Var.c)}, 1)), null);
            } else if (yv9Var instanceof zv9) {
                mb71Var = new nb71(((zv9) yv9Var).c);
            } else if (yv9Var instanceof bw9) {
                mb71Var = new pb71(((bw9) yv9Var).c);
            } else {
                if (!yv9Var.equals(aw9.c)) {
                    eg.o();
                    return null;
                }
                mb71Var = new mb71("#000000", null);
            }
            rb71Var = new rb71(ew9Var.a, mb71Var);
        }
        j2p1 j2p1Var = opa1Var.d;
        if (j2p1Var.equals(lz70.c)) {
            i = 2;
        } else if (!j2p1Var.equals(mz70.c) && !j2p1Var.equals(nz70.c)) {
            eg.o();
            return null;
        }
        int i2 = i;
        d5r d5rVar = opa1Var.e;
        return new yb71(str2, str3, rb71Var, str4, i2, d5rVar != null ? new xb71(d5rVar.a, d5rVar.b) : null, ib71Var, vb71Var, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, lnm lnmVar) {
        ic71 ic71Var;
        ArrayList arrayList;
        String strJ;
        if (lnmVar instanceof ic71) {
            ic71Var = (ic71) lnmVar;
            int i = ic71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ic71Var.c = i - Integer.MIN_VALUE;
            } else {
                ic71Var = new ic71(this, (onm) lnmVar);
            }
        } else {
            ic71Var = new ic71(this, (onm) lnmVar);
        }
        Object objI = ic71Var.a;
        int i2 = ic71Var.c;
        add addVar = this.b;
        if (i2 == 0) {
            hm5.M(objI);
            ic71Var.c = 1;
            List list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list2) {
                String str = ((ec71) obj).a;
                Object objH = linkedHashMap.get(str);
                if (objH == null) {
                    objH = cfm0.h(str, linkedHashMap);
                }
                ((List) objH).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), o7h.p1((List) entry.getValue()));
            }
            Set setKeySet = linkedHashMap2.keySet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String str2 = ((ec71) it.next()).b;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            if (addVar.o()) {
                arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str3 = ((ec71) it2.next()).c;
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                }
            } else {
                arrayList = z6x.a;
            }
            objI = b5p1.i(new mpy0(new zo51(new tu41(o4p1.r(flo1.k(this.a, new ny51(setKeySet, arrayList2, arrayList, (byte) 6)), this.c), (byte) 14), this, (byte) 13), linkedHashMap2, this, (byte) 12), ic71Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        Map map = (Map) objI;
        qf4 qf4Var = addVar.a;
        if (!qf4Var.h() || !qf4Var.Z()) {
            return map;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            ec71 ec71Var = (ec71) entry2.getKey();
            bc71 bc71VarK = (bc71) entry2.getValue();
            String str4 = ec71Var.a;
            if (nzy.j(str4)) {
                Set set = s4b1.f;
                strJ = uic.x(str4).j();
            } else {
                strJ = null;
            }
            if (strJ == null || !nzy.p.e(strJ)) {
                strJ = null;
            }
            zb71 zb71VarL = wro1.L(bc71VarK);
            wb71 wb71Var = zb71VarL instanceof wb71 ? (wb71) zb71VarL : null;
            String str5 = wb71Var != null ? wb71Var.f : null;
            if (strJ != null) {
                if (str5 == null) {
                    str5 = "";
                }
                if (!nhc1.R(str5, ":image", false)) {
                    bc71VarK = fza.k(bc71VarK, strJ);
                }
            }
            linkedHashMap3.put(key, bc71VarK);
        }
        return linkedHashMap3;
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
