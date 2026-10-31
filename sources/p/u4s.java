package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class u4s implements Update {
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    @Override // com.spotify.mobius.Update
    public final Next a(Object obj, Object obj2) {
        b3a0 b3a0Var;
        u3a0 u3a0Var = (u3a0) obj;
        q3a0 q3a0Var = (q3a0) obj2;
        t3a0 t3a0Var = u3a0Var.a;
        Set set = u3a0Var.c;
        if (q3a0Var instanceof n3a0) {
            return Next.h(u3a0.a(u3a0Var, null, ((n3a0) q3a0Var).a, null, 5));
        }
        if (q3a0Var instanceof o3a0) {
            return Next.h(u3a0.a(u3a0Var, null, null, ((o3a0) q3a0Var).a, 3));
        }
        if (q3a0Var instanceof j3a0) {
            re9 re9Var = ((j3a0) q3a0Var).a;
            LinkedHashSet linkedHashSetV0 = o7h.v0(set, re9Var.c());
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : linkedHashSetV0) {
                if (obj3 instanceof be9) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new a3a0(re9Var.a(), (be9) it.next()));
            }
            return Next.a(o7h.p1(arrayList2));
        }
        int i = 0;
        if (!(q3a0Var instanceof p3a0)) {
            if (q3a0Var instanceof m3a0) {
                m3a0 m3a0Var = (m3a0) q3a0Var;
                be9 be9Var = m3a0Var.b;
                if (!set.contains(be9Var)) {
                    return Next.j();
                }
                b3a0Var = foo1.y(be9Var) ? new b3a0(2, new String(m3a0Var.c, nne.a), be9Var) : null;
                return b3a0Var != null ? Next.a(Collections.singleton(b3a0Var)) : Next.j();
            }
            if (q3a0Var instanceof k3a0) {
                u3a0 u3a0VarA = u3a0.a(u3a0Var, t3a0.a(t3a0Var, ((k3a0) q3a0Var).a, false, false, 30), null, null, 6);
                return Next.i(u3a0VarA, dm61.y0(een.b(u3a0VarA), een.d(u3a0VarA)));
            }
            if (q3a0Var instanceof l3a0) {
                u3a0 u3a0VarA2 = u3a0.a(u3a0Var, t3a0.a(t3a0Var, false, ((l3a0) q3a0Var).a, false, 29), null, null, 6);
                return Next.i(u3a0VarA2, dm61.y0(een.b(u3a0VarA2), een.d(u3a0VarA2)));
            }
            if (q3a0Var instanceof i3a0) {
                u3a0 u3a0VarA3 = u3a0.a(u3a0Var, t3a0.a(t3a0Var, false, false, ((i3a0) q3a0Var).a, 27), null, null, 6);
                return Next.i(u3a0VarA3, dm61.y0(een.b(u3a0VarA3), een.d(u3a0VarA3)));
            }
            eg.o();
            return null;
        }
        p3a0 p3a0Var = (p3a0) q3a0Var;
        ce9 ce9Var = p3a0Var.b;
        if (!u3a0Var.b.contains(ce9Var)) {
            return Next.j();
        }
        boolean z = ce9Var instanceof ce9;
        if (z && !t3a0Var.e) {
            return Next.j();
        }
        if (z) {
            int iOrdinal = ce9Var.a.ordinal();
            if (iOrdinal == 0) {
                i = 2;
            } else if (iOrdinal == 1) {
                i = 1;
            } else if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
        } else if (foo1.z(ce9Var)) {
            i = 2;
        } else if (foo1.w(ce9Var)) {
            i = 1;
        }
        b3a0Var = i != 0 ? new b3a0(i, new String(p3a0Var.c, nne.a), ce9Var) : null;
        return b3a0Var != null ? Next.a(Collections.singleton(b3a0Var)) : Next.j();
    }
}
