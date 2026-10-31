package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class zz51 implements Update {
    public static final zz51 a = new zz51();

    public final Next a(Object obj, Object obj2) {
        b061 b061Var = (b061) obj;
        yz51 yz51Var = (yz51) obj2;
        if (yz51Var.equals(uz51.a)) {
            return Next.a(Collections.singleton(sz51.a));
        }
        if (yz51Var instanceof vz51) {
            return Next.h(b061.a(b061Var, ((vz51) yz51Var).a, null, 383));
        }
        if (yz51Var instanceof xz51) {
            return Next.h(b061.a(b061Var, null, o7h.Z0(((xz51) yz51Var).a), 255));
        }
        if (!(yz51Var instanceof wz51)) {
            eg.o();
            return null;
        }
        wz51 wz51Var = (wz51) yz51Var;
        String str = b061Var.b;
        List list = b061Var.g;
        String str2 = b061Var.c;
        String str3 = b061Var.a;
        List list2 = b061Var.i;
        List list3 = list2;
        int iS = zno1.s(q7h.U(list3, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            linkedHashMap.put(String.valueOf(iIntValue), ((yde1) list.get(iIntValue)).b);
        }
        return Next.a(Collections.singleton(new tz51(str, str2, str3, linkedHashMap, dgo1.o(b061Var.d), ((of51) list.get(((Number) o7h.q0(list2)).intValue())).p(), wz51Var.a)));
    }
}
