package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class g221 implements Update {
    public final Next a(Object obj, Object obj2) {
        int i;
        k221 k221Var = (k221) obj;
        q121 q121Var = (q121) obj2;
        o331 o331Var = k221Var.i;
        String str = k221Var.a;
        if (!(q121Var instanceof i121)) {
            if (!(q121Var instanceof j121)) {
                if (q121Var instanceof m121) {
                    m121 m121Var = (m121) q121Var;
                    return Next.i(k221.a(k221Var, false, null, 0, null, false, false, !m121Var.b, new w131(m121Var.a), 127), Collections.singleton(new s021(str)));
                }
                if (q121Var instanceof k121) {
                    return Next.i(k221.a(k221Var, false, null, 0, null, false, false, false, null, 447), Collections.singleton(new r021(o331Var, false)));
                }
                if (q121Var instanceof o121) {
                    return Next.i(k221.a(k221Var, false, null, 0, null, false, false, false, null, 495), Collections.singleton(new t021(u121.c)));
                }
                if (q121Var instanceof p121) {
                    k221 k221VarA = k221.a(k221Var, false, null, 0, null, false, false, false, null, 495);
                    m0u m0uVar = ((p121) q121Var).a;
                    return Next.i(k221VarA, f46.S0(new w021[]{new t021(new t121(str, m0uVar)), new v021(str, m0uVar, false)}));
                }
                if (q121Var instanceof n121) {
                    n121 n121Var = (n121) q121Var;
                    boolean z = n121Var.c;
                    return n121Var.b ? Next.a(Collections.singleton(new r021(x131.a, !z))) : Next.a(Collections.singleton(new r021(new t231(n121Var.a), !z)));
                }
                if (q121Var.equals(l121.a)) {
                    return Next.i(k221.a(k221Var, false, null, 0, null, false, false, false, null, 479), Collections.singleton(new t021(v121.c)));
                }
                if (q121Var instanceof h121) {
                    return ((h121) q121Var).a ? Next.h(k221.a(k221Var, false, null, 0, null, false, true, false, null, 319)) : Next.a(Collections.singleton(new r021(o331Var, k221Var.h)));
                }
                eg.o();
                return null;
            }
            j121 j121Var = (j121) q121Var;
            px31 px31Var = j121Var.c;
            if ((px31Var instanceof mx31) || (px31Var instanceof kx31)) {
                return Next.j();
            }
            if (px31Var instanceof lx31) {
                return Next.h(k221.a(k221Var, false, null, 0, null, true, false, false, null, 479));
            }
            if (!u890.j(px31Var, ox31.a)) {
                eg.o();
                return null;
            }
            m0u m0uVar2 = j121Var.b;
            int iC = l1d.C(m0uVar2.d.b);
            if (iC != 0) {
                if (iC == 1 || iC == 2 || iC == 3) {
                    return Next.a(Collections.singleton(new v021(str, m0uVar2, true)));
                }
                if (iC == 4) {
                    return Next.h(k221.a(k221Var, false, null, 0, j121Var.b, false, false, false, null, 495));
                }
                if (iC != 5) {
                    eg.o();
                    return null;
                }
            }
            Set setSingleton = Collections.singleton(new q021(str, m0uVar2));
            ept eptVar = m0uVar2.c;
            if (eptVar.b == bpt.d && eptVar.e == 6) {
                setSingleton = dm61.x0(u021.a, setSingleton);
            }
            return Next.a(setSingleton);
        }
        x221 x221Var = ((i121) q121Var).a;
        boolean zJ = mym.j(x221Var.a);
        xvd xvdVar = new xvd(new xvd(new xvd(new p0d((byte) 21), (byte) 5), (byte) 6), (byte) 4);
        xvd xvdVar2 = new xvd(new p0d((byte) 22), (byte) 7);
        int i2 = x221Var.b;
        ArrayList arrayList = x221Var.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            m0u m0uVar3 = (m0u) obj3;
            if (m0uVar3.e || m0uVar3.b) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = arrayList2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((m0u) it.next()).e && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        boolean z2 = i >= i2;
        boolean z3 = i >= i2 - 1;
        ArrayList arrayList3 = new ArrayList();
        e221 e221Var = e221.a;
        if (z2) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList2) {
                if (((m0u) obj4).e) {
                    arrayList4.add(obj4);
                } else {
                    arrayList5.add(obj4);
                }
            }
            for (m0u m0uVar4 : o7h.a1(arrayList4, xvdVar)) {
                arrayList3.add(new d221(m0uVar4, j2p1.s(m0uVar4)));
            }
            arrayList3.add(e221Var);
            Iterator it2 = o7h.a1(arrayList5, xvdVar2).iterator();
            while (it2.hasNext()) {
                arrayList3.add(new d221((m0u) it2.next(), lx31.a));
            }
        } else {
            for (m0u m0uVar5 : o7h.a1(arrayList2, xvdVar)) {
                arrayList3.add(new d221(m0uVar5, j2p1.s(m0uVar5)));
            }
            if (z3) {
                arrayList3.add(e221Var);
            }
        }
        return Next.h(k221.a(k221Var, zJ, mqo1.A(arrayList3), x221Var.b, null, false, false, false, null, 497));
    }
}
