package p;

import com.spotify.messages.EventSenderStats2NonAuth;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pu51 implements xu30 {
    public static final pu51 b = new pu51();
    public final /* synthetic */ byte a = 0;

    public static EventSenderStats2NonAuth a(List list, Map map, Map map2) {
        TreeMap treeMap = new TreeMap(map);
        ad00 ad00VarA0 = EventSenderStats2NonAuth.a0();
        TreeSet treeSet = new TreeSet();
        f46.K0(new String[0], treeSet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        qd00 qd00Var = qd00.e;
        ad00VarA0.getClass();
        Map mapJ = sqg0.J(oqn1.n(qd00Var, new bd00(new sty(ad00VarA0, (byte) 11))), oqn1.n(qd00.f, new bd00(new sty(ad00VarA0, (byte) 12))), oqn1.n(qd00.g, new bd00(new sty(ad00VarA0, (byte) 13))), oqn1.n(qd00.h, new bd00(new sty(ad00VarA0, (byte) 14))), oqn1.n(qd00.i, new bd00(new sty(ad00VarA0, (byte) 15))), oqn1.n(qd00.t, new bd00(new sty(ad00VarA0, (byte) 16))), oqn1.n(qd00.X, new bd00(new sty(ad00VarA0, (byte) 17))));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd00 vd00Var = (vd00) it.next();
            String str = vd00Var.b;
            String str2 = vd00Var.d;
            treeSet.add(str);
            List list2 = (List) linkedHashMap.get(str2);
            if (list2 != null) {
                list2.add(vd00Var);
            } else {
                linkedHashMap.put(str2, p7h.O(vd00Var));
            }
        }
        treeSet.addAll(treeMap.keySet());
        treeSet.addAll(map2.keySet());
        ad00VarA0.n(treeSet);
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List<vd00> list3 = (List) ((Map.Entry) it2.next()).getValue();
            ad00VarA0.r(list3.size());
            byte[] bArr = ((vd00) list3.get(0)).c;
            hhc hhcVar = phc.b;
            ad00VarA0.x(phc.e(0, bArr, bArr.length));
            for (vd00 vd00Var2 : list3) {
                String str3 = vd00Var2.b;
                long j = vd00Var2.f;
                ad00VarA0.q(o7h.u0(treeSet, str3));
                Long l = vd00Var2.e;
                ad00VarA0.s(l != null ? l.longValue() : j);
                ad00VarA0.u(vd00Var2.g);
                ad00VarA0.t(j);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            String str4 = (String) entry.getKey();
            List<oav> list4 = (List) entry.getValue();
            ad00VarA0.C(o7h.u0(treeSet, str4));
            LinkedHashMap linkedHashMap2 = qd00.b;
            Set setO1 = o7h.o1(s3o1.u());
            for (oav oavVar : list4) {
                bd00 bd00Var = (bd00) mapJ.get(oavVar.d);
                if (bd00Var != null) {
                }
                setO1.remove(oavVar.d);
            }
            Iterator it3 = setO1.iterator();
            while (it3.hasNext()) {
                bd00 bd00Var2 = (bd00) mapJ.get((qd00) it3.next());
                if (bd00Var2 != null) {
                }
            }
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str5 = (String) entry2.getKey();
            Integer num = (Integer) entry2.getValue();
            ad00VarA0.w(o7h.u0(treeSet, str5));
            ad00VarA0.v(num.intValue());
        }
        return (EventSenderStats2NonAuth) ad00VarA0.build();
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return null;
            default:
                return a((List) obj, (Map) obj2, (Map) obj3);
        }
    }
}
