package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class wgg0 implements Update {
    public static final wgg0 a = new wgg0();

    public final Next a(Object obj, Object obj2) {
        Object next;
        ygg0 ygg0Var = (ygg0) obj;
        ugg0 ugg0Var = (ugg0) obj2;
        List list = ygg0Var.a;
        Map map = ygg0Var.b;
        Object obj3 = null;
        if (ugg0Var instanceof tgg0) {
            tgg0 tgg0Var = (tgg0) ugg0Var;
            boolean z = tgg0Var.b;
            String str = tgg0Var.a;
            if (map.containsKey(str)) {
                return Next.j();
            }
            List<a0g> list2 = list;
            for (Object obj4 : list2) {
                if (((a0g) obj4).a.equals(str)) {
                    obj3 = obj4;
                    break;
                }
            }
            a0g a0gVar = (a0g) obj3;
            if (a0gVar == null) {
                return Next.j();
            }
            boolean z2 = a0gVar.c;
            if (z2 == z) {
                return Next.j();
            }
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (a0g a0gVar2 : list2) {
                if (a0gVar2.a.equals(str)) {
                    a0gVar2 = new a0g(a0gVar2.a, a0gVar2.b, z);
                }
                arrayList.add(a0gVar2);
            }
            return Next.i(new ygg0(arrayList, sqg0.P(map, new mmr0(str, new rhs0(z2, z)))), Collections.singleton(new kgg0(str, z)));
        }
        if (ugg0Var instanceof sgg0) {
            sgg0 sgg0Var = (sgg0) ugg0Var;
            Object obj5 = sgg0Var.a;
            boolean z3 = sgg0Var.b;
            rhs0 rhs0Var = (rhs0) map.get(obj5);
            if (rhs0Var == null) {
                return Next.j();
            }
            if (rhs0Var.b != z3) {
                return Next.j();
            }
            ygg0 ygg0Var2 = new ygg0(list, sqg0.K(obj5, map));
            if (z3) {
                return Next.h(ygg0Var2);
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((a0g) next).a.equals(obj5));
            a0g a0gVar3 = (a0g) next;
            return Next.i(ygg0Var2, Collections.singleton(new igg0(a0gVar3 != null ? a0gVar3.b.a : null)));
        }
        if (!(ugg0Var instanceof rgg0)) {
            eg.o();
            return null;
        }
        rgg0 rgg0Var = (rgg0) ugg0Var;
        Object obj6 = rgg0Var.a;
        rhs0 rhs0Var2 = (rhs0) map.get(obj6);
        if (rhs0Var2 == null) {
            return Next.j();
        }
        if (rhs0Var2.b != rgg0Var.b) {
            return Next.j();
        }
        List<a0g> list3 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        for (a0g a0gVar4 : list3) {
            if (a0gVar4.a.equals(obj6)) {
                a0gVar4 = new a0g(a0gVar4.a, a0gVar4.b, rhs0Var2.a);
            }
            arrayList2.add(a0gVar4);
        }
        return Next.i(new ygg0(arrayList2, sqg0.K(obj6, map)), Collections.singleton(jgg0.a));
    }
}
