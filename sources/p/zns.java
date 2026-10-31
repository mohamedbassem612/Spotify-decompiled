package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zns {
    public final rmr a;
    public final bpb1 b;
    public final bpb1 c;
    public final x010 d;

    public zns(rmr rmrVar) {
        this.a = rmrVar;
        bpb1 bpb1VarB = gio1.b(gz51.c);
        this.b = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(b7x.a);
        this.c = bpb1VarB2;
        this.d = new x010(bpb1VarB, bpb1VarB2, new xq0(3, this, zns.class, "actionsState", "actionsState(Lcom/spotify/playlistediting/selection/SelectionModeTable$State;Ljava/util/Map;)Lcom/spotify/yourlibrary/yourlibraryx/shared/view/selection/SelectionActionsTable$State;", 4, (byte) 4), (byte) 1);
    }

    public final gx51 a(gz51 gz51Var, Map map) {
        if (!gz51Var.a) {
            return gx51.d;
        }
        Set set = gz51Var.b;
        ArrayList<jv51> arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jv51 jv51Var = (jv51) map.get((String) it.next());
            if (jv51Var != null) {
                arrayList.add(jv51Var);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (jv51 jv51Var2 : arrayList) {
            linkedHashMap.put(jv51Var2.a, jv51Var2.b);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        bx51 bx51Var = bx51.c;
        bx51 bx51Var2 = bx51.a;
        if (zIsEmpty) {
            return new gx51(linkedHashMap, p7h.M(new bx51[]{bx51Var2, bx51Var}), false);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (jv51 jv51Var3 : arrayList) {
            arrayList2.add(this.a.a(jv51Var3.a, jv51Var3.b));
        }
        smc0 smc0VarN = k4p1.n();
        if (arrayList2.isEmpty()) {
            smc0VarN.add(bx51Var2);
            break;
        }
        Iterator it2 = arrayList2.iterator();
        do {
            if (!it2.hasNext()) {
                smc0VarN.add(bx51Var2);
                break;
            }
        } while (((Set) it2.next()).contains(bx51Var2));
        if (arrayList.isEmpty()) {
            smc0VarN.add(bx51.b);
            break;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                smc0VarN.add(bx51.b);
                break;
            }
        } while (((jv51) it3.next()).c);
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                if (((Set) it4.next()).contains(bx51Var)) {
                    smc0VarN.add(bx51Var);
                    break;
                }
            }
        }
        return new gx51(linkedHashMap, k4p1.k(smc0VarN), true);
    }
}
