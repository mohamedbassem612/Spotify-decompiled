package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class teq0 implements Update {
    public final Next a(Object obj, Object obj2) {
        xeq0 xeq0Var = (xeq0) obj;
        ceq0 ceq0Var = (ceq0) obj2;
        c380 c380Var = xeq0Var.c;
        Boolean bool = xeq0Var.f;
        ept eptVar = xeq0Var.b;
        cqs0 cqs0Var = xeq0Var.d;
        if (ceq0Var instanceof ndq0) {
            c380 c380VarA = mqo1.A(((ndq0) ceq0Var).a);
            if (eptVar == null) {
                return Next.h(xeq0.a(xeq0Var, null, c380VarA, null, null, null, false, 123));
            }
            ArrayList arrayList = new ArrayList(q7h.U(c380VarA, 10));
            Iterator it = c380VarA.iterator();
            while (it.hasNext()) {
                arrayList.add(((fdq0) it.next()).a);
            }
            Set setW0 = dm61.w0(new jcq0[]{new ccq0(o7h.p1(arrayList), eptVar)});
            if (bool == null) {
                setW0.add(new zbq0(((fdq0) o7h.q0(c380VarA)).a, eptVar));
            }
            return Next.i(xeq0.a(xeq0Var, null, c380VarA, null, null, null, false, 123), setW0);
        }
        if (ceq0Var instanceof qdq0) {
            ArrayList arrayList2 = new ArrayList(q7h.U(c380Var, 10));
            Iterator it2 = c380Var.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((fdq0) it2.next()).a);
            }
            Set setP1 = o7h.p1(arrayList2);
            if (setP1.isEmpty()) {
                return Next.h(xeq0.a(xeq0Var, ((qdq0) ceq0Var).a, null, null, null, null, false, 125));
            }
            ept eptVar2 = ((qdq0) ceq0Var).a;
            Set setW1 = dm61.w0(new jcq0[]{new ccq0(setP1, eptVar2)});
            if (bool == null) {
                setW1.add(new zbq0(((fdq0) o7h.q0(c380Var)).a, eptVar2));
            }
            return Next.i(xeq0.a(xeq0Var, eptVar2, null, null, null, null, false, 125), setW1);
        }
        boolean z = ceq0Var instanceof udq0;
        ubq0 ubq0Var = ubq0.a;
        sbq0 sbq0Var = sbq0.a;
        xbq0 xbq0Var = vbq0.a;
        if (z) {
            String str = ((udq0) ceq0Var).a;
            if (eptVar == null) {
                return Next.j();
            }
            if (u890.j(bool, Boolean.FALSE)) {
                return Next.h(xeq0.a(xeq0Var, null, null, null, null, null, true, 63));
            }
            xbq0 xbq0Var2 = (xbq0) cqs0Var.get(str);
            if (xbq0Var2 == null) {
                xbq0Var2 = xbq0Var;
            }
            wbq0 wbq0Var = wbq0.a;
            if (xbq0Var2.equals(wbq0Var) || (xbq0Var2 instanceof tbq0)) {
                return Next.i(xeq0.a(xeq0Var, null, null, mqo1.B(sqg0.P(cqs0Var, new mmr0(str, xbq0Var))), null, null, false, 119), Collections.singleton(new ybq0(str, eptVar)));
            }
            if (xbq0Var2.equals(sbq0Var)) {
                return Next.h(xeq0.a(xeq0Var, null, null, null, str, null, false, 111));
            }
            return (xbq0Var2.equals(xbq0Var) || xbq0Var2.equals(ubq0Var)) ? Next.i(xeq0.a(xeq0Var, null, null, mqo1.B(sqg0.P(cqs0Var, new mmr0(str, wbq0Var))), null, null, false, 119), Collections.singleton(new icq0(str, eptVar))) : Next.j();
        }
        if (ceq0Var instanceof wdq0) {
            return Next.a(Collections.singleton(new hcq0(((wdq0) ceq0Var).a)));
        }
        if (ceq0Var instanceof ydq0) {
            ydq0 ydq0Var = (ydq0) ceq0Var;
            return Next.h(xeq0.a(xeq0Var, null, null, mqo1.B(sqg0.P(cqs0Var, new mmr0(ydq0Var.a, ydq0Var.b))), null, null, false, 119));
        }
        if (ceq0Var instanceof xdq0) {
            return Next.h(xeq0.a(xeq0Var, null, null, mqo1.B(sqg0.P(cqs0Var, new mmr0(((xdq0) ceq0Var).a, ubq0Var))), null, null, false, 119));
        }
        if (ceq0Var instanceof tdq0) {
            return Next.a(Collections.singleton(fcq0.a));
        }
        if (ceq0Var instanceof zdq0) {
            String str2 = xeq0Var.e;
            if (str2 == null) {
                return Next.j();
            }
            return eptVar == null ? Next.j() : Next.i(xeq0.a(xeq0Var, null, null, mqo1.B(sqg0.P(cqs0Var, new mmr0(str2, xbq0Var))), null, null, false, 103), Collections.singleton(new dcq0(str2, eptVar)));
        }
        if (ceq0Var instanceof aeq0) {
            return Next.h(xeq0.a(xeq0Var, null, null, null, null, null, false, 111));
        }
        if (ceq0Var instanceof vdq0) {
            return Next.a(Collections.singleton(new gcq0(((vdq0) ceq0Var).a)));
        }
        if (ceq0Var instanceof beq0) {
            return Next.h(xeq0.a(xeq0Var, null, null, mqo1.B(sqg0.P(cqs0Var, new mmr0(((beq0) ceq0Var).a, sbq0Var))), null, null, false, 119));
        }
        boolean z2 = ceq0Var instanceof sdq0;
        bcq0 bcq0Var = bcq0.a;
        if (z2) {
            return Next.a(Collections.singleton(bcq0Var));
        }
        if (ceq0Var instanceof pdq0) {
            return Next.a(Collections.singleton(bcq0Var));
        }
        if (ceq0Var instanceof odq0) {
            return Next.h(xeq0.a(xeq0Var, null, null, null, null, Boolean.valueOf(((odq0) ceq0Var).a), false, 95));
        }
        if (ceq0Var instanceof rdq0) {
            return Next.h(xeq0.a(xeq0Var, null, null, null, null, null, false, 63));
        }
        eg.o();
        return null;
    }
}
