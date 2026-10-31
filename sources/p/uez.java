package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class uez implements Update {
    public static final uez a = new uez();

    public final Next a(Object obj, Object obj2) {
        qhm0 qhm0Var = (qhm0) obj;
        l300 l300Var = (m700) obj2;
        List list = qhm0Var.b;
        boolean z = qhm0Var.a;
        if (!(l300Var instanceof b000)) {
            if (!(l300Var instanceof l300)) {
                if (!(l300Var instanceof n500)) {
                    eg.o();
                    return null;
                }
                boolean z2 = !z;
                qhm0 qhm0VarA = qhm0.a(qhm0Var, z2, null, 6);
                return qhm0VarA.equals(qhm0Var) ? Next.j() : Next.i(qhm0VarA, Collections.singleton(new egw(z2)));
            }
            ArrayList arrayList = l300Var.a.b;
            if (list.equals(arrayList)) {
                return Next.j();
            }
            Set setW0 = dm61.w0(new riw[]{new rgw(arrayList)});
            if (!z) {
                setW0.add(new egw(true));
            }
            return Next.i(qhm0.a(qhm0Var, true, arrayList, 4), setW0);
        }
        b000 b000Var = (b000) l300Var;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((n620) it.next()).a == b000Var.a) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return Next.j();
        }
        n620 n620Var = (n620) list.get(i);
        n620 n620Var2 = new n620(n620Var.a, b000Var.b);
        if (n620Var2.equals(n620Var)) {
            return Next.j();
        }
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.set(i, n620Var2);
        Set setW1 = dm61.w0(new riw[]{new rgw(Collections.singletonList(n620Var2))});
        if (!z) {
            setW1.add(new egw(true));
        }
        return Next.i(qhm0.a(qhm0Var, true, o7h.l1(arrayList2), 4), setW1);
    }
}
