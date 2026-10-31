package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bfd a;
    public final /* synthetic */ jj1 b;
    public final /* synthetic */ jj1 c;

    public oj1(bfd bfdVar, jj1 jj1Var, jj1 jj1Var2) {
        this.a = bfdVar;
        this.b = jj1Var;
        this.c = jj1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nj1 nj1Var;
        m231 m231Var;
        ti1 ti1Var;
        Object next;
        if (onmVar instanceof nj1) {
            nj1Var = (nj1) onmVar;
            int i = nj1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj1Var.b = i - Integer.MIN_VALUE;
            } else {
                nj1Var = new nj1(this, onmVar);
            }
        } else {
            nj1Var = new nj1(this, onmVar);
        }
        Object objC = nj1Var.a;
        int i2 = nj1Var.b;
        m231 m231Var2 = rih1.a;
        jj1 jj1Var = this.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                ti1Var = (ti1) obj;
                bfd bfdVar = this.a;
                String str = ti1Var.a;
                List list = ti1Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w4i1) it.next()).a);
                }
                nj1Var.d = ti1Var;
                nj1Var.b = 1;
                objC = bfdVar.b.c(str, arrayList, nj1Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ti1Var = nj1Var.d;
                hm5.M(objC);
            }
            wz1 wz1Var = (wz1) objC;
            if (wz1Var instanceof vz1) {
                List<jwm> list2 = ((vz1) wz1Var).a.e;
                ArrayList arrayList2 = new ArrayList();
                for (jwm jwmVar : list2) {
                    Iterator it2 = ti1Var.b.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!u890.j(((w4i1) next).a, jwmVar.a.a));
                    w4i1 w4i1Var = (w4i1) next;
                    jwm jwmVarA = w4i1Var != null ? jwm.a(jwmVar, w4i1Var, null, 14) : null;
                    if (jwmVarA != null) {
                        arrayList2.add(jwmVarA);
                    }
                }
                this.b.invoke(arrayList2);
            } else {
                if (!(wz1Var instanceof uz1)) {
                    throw new NoWhenBranchMatchedException();
                }
                jj1Var.invoke(((uz1) wz1Var).a);
            }
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            op71.x(nj1Var.getContext());
            jj1Var.invoke(null);
        }
        return m231Var2;
    }
}
