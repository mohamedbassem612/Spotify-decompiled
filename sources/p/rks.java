package p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rks implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LinkedHashMap b;

    public /* synthetic */ rks(LinkedHashMap linkedHashMap, byte b) {
        this.a = b;
        this.b = linkedHashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        LinkedHashMap linkedHashMap = this.b;
        switch (b) {
            case 0:
                Integer num = Integer.MAX_VALUE;
                ki90 ki90Var = (ki90) obj;
                Integer num2 = (Integer) linkedHashMap.get(ki90Var.a.a);
                if (num2 == null) {
                    List list = ki90Var.a.g;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Integer num3 = (Integer) linkedHashMap.get((String) it.next());
                        if (num3 != null) {
                            arrayList.add(num3);
                        }
                    }
                    num2 = (Integer) o7h.G0(arrayList);
                    if (num2 == null) {
                        num2 = num;
                    }
                }
                ki90 ki90Var2 = (ki90) obj2;
                Integer num4 = (Integer) linkedHashMap.get(ki90Var2.a.a);
                if (num4 != null) {
                    num = num4;
                } else {
                    List list2 = ki90Var2.a.g;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Integer num5 = (Integer) linkedHashMap.get((String) it2.next());
                        if (num5 != null) {
                            arrayList2.add(num5);
                        }
                    }
                    Integer num6 = (Integer) o7h.G0(arrayList2);
                    if (num6 != null) {
                        num = num6;
                    }
                }
                return pap1.t(num2, num);
            default:
                Integer num7 = (Integer) linkedHashMap.get(((rvb1) obj2).a);
                Integer numValueOf = Integer.valueOf(num7 != null ? num7.intValue() : 0);
                Integer num8 = (Integer) linkedHashMap.get(((rvb1) obj).a);
                return pap1.t(numValueOf, Integer.valueOf(num8 != null ? num8.intValue() : 0));
        }
    }
}
