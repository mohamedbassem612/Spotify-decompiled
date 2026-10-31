package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeConcatIterable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gae implements ipc1 {
    public final List a;

    @Override // p.ipc1
    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p.ipc1
    public List b(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // p.ipc1
    public long c(int i) {
        dm5.m(i == 0);
        return 0L;
    }

    @Override // p.ipc1
    public int d() {
        return 1;
    }

    public rjo0 e(String str) {
        Object next;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((rjo0) next).a(str)) {
                return (rjo0) next;
            }
        }
        next = null;
        return (rjo0) next;
    }

    public ArrayList f() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            vuc0 uuc0Var = null;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            rzh rzhVar = (rzh) obj;
            blb blbVarA = rzhVar.a();
            if (blbVarA instanceof blb) {
                blb blbVar = blbVarA;
                uuc0Var = new vuc0(i, new xuc0(rzhVar.b(), blbVar.b(), blbVar.a()));
            } else if (blbVarA instanceof clb) {
                clb clbVar = (clb) blbVarA;
                uuc0Var = new wuc0(i, new xuc0(rzhVar.b(), clbVar.b(), clbVar.a()));
            } else if (blbVarA instanceof zkb) {
                uuc0Var = new uuc0(i, (zkb) blbVarA, rzhVar.b());
            }
            if (uuc0Var != null) {
                arrayList.add(uuc0Var);
            }
            i = i2;
        }
        return arrayList;
    }

    public Single g(String str, lik1 lik1Var) {
        List list = this.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ejo) it.next()).a(str));
        }
        return new MaybeConcatIterable(arrayList).z().doOnError(new a21(str, lik1Var, (byte) 27)).map(new ham(str, lik1Var, (byte) 15));
    }
}
