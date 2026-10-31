package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vyd extends a8d1 implements zu30 {
    public /* synthetic */ String a;
    public /* synthetic */ long b;
    public /* synthetic */ uyd c;

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj2).longValue();
        vyd vydVar = new vyd(4, (lnm) obj4);
        vydVar.a = (String) obj;
        vydVar.b = jLongValue;
        vydVar.c = (uyd) obj3;
        return vydVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        int size;
        int iNextIndex;
        String str = this.a;
        long j = this.b;
        uyd uydVar = this.c;
        hm5.M(obj);
        List<String> list = uydVar.a;
        boolean z = uydVar.d;
        List list2 = uydVar.b;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((zvh) obj2).a.equals(str2)) {
                    arrayList2.add(obj2);
                }
            }
            r7h.W(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((zvh) it.next()).b, arrayList3);
        }
        int iMax = 0;
        if (uydVar.c && z) {
            List list3 = list2;
            Iterator it2 = list3.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((zvh) next).a.equals(str));
            zvh zvhVar = (zvh) next;
            if (zvhVar != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((zvh) obj3).a.equals(str)) {
                        break;
                    }
                    arrayList4.add(obj3);
                }
                Iterator it3 = arrayList4.iterator();
                size = 0;
                while (it3.hasNext()) {
                    size += ((zvh) it3.next()).b.size();
                }
            } else {
                size = 0;
            }
            List list4 = zvhVar != null ? zvhVar.b : z6x.a;
            ListIterator listIterator = list4.listIterator(list4.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (j >= ((rzh) listIterator.previous()).a) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            iMax = Math.max(0, iNextIndex) + size;
        }
        return new tyd(iMax, arrayList3, z);
    }
}
