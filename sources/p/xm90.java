package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xm90 {
    public n1i a = n1i.a;
    public final j0d1 b;
    public final dt71 c;
    public final o0i d;

    public xm90(q8n q8nVar, dlg1 dlg1Var, hp80 hp80Var, z0i z0iVar, n2u0 n2u0Var) {
        vpl vplVarA;
        kxt0 kxt0Var;
        j0d1 j0d1VarB = guo1.B();
        this.b = j0d1VarB;
        llm llmVarE = smo1.e(flo1.l(j0d1VarB, q8nVar));
        dt71 dt71VarD = mgo1.d(3, 5, 2);
        this.c = dt71VarD;
        w8l1 w8l1Var = z0iVar instanceof w8l1 ? (w8l1) z0iVar : null;
        if (w8l1Var != null) {
            vplVarA = w8l1Var.a();
            kxt0Var = null;
        } else {
            vplVarA = null;
            kxt0Var = null;
        }
        this.d = new o0i(llmVarE, dt71VarD, new n0i(vplVarA != null ? vplVarA.g() : kxt0Var, n2u0Var), dlg1Var, hp80Var);
    }

    public final void a(n1i n1iVar) {
        dt71 dt71Var;
        n1i n1iVar2 = this.a;
        if (n1iVar2 != n1iVar) {
            z6x z6xVar = z6x.a;
            if (n1iVar2 == n1iVar) {
                List list = cbc0.a;
            } else {
                List list2 = cbc0.a;
                int iIndexOf = list2.indexOf(n1iVar2);
                int iIndexOf2 = list2.indexOf(n1iVar);
                if (iIndexOf2 != -1) {
                    List<n1i> listSubList = iIndexOf == -1 ? list2.subList(0, iIndexOf2 + 1) : iIndexOf < iIndexOf2 || iIndexOf == -1 ? list2.subList(iIndexOf, iIndexOf2 + 1) : o7h.T0(list2.subList(iIndexOf2, iIndexOf + 1));
                    n1i n1iVar3 = n1i.c;
                    if (listSubList.contains(n1iVar3) && o7h.q0(listSubList) != n1iVar3 && o7h.A0(listSubList) != n1iVar3) {
                        listSubList = o7h.J0(listSubList, n1iVar3);
                    }
                    z6x arrayList = new ArrayList();
                    for (n1i n1iVar4 : listSubList) {
                        arrayList.add(new mmr0(n1iVar2, n1iVar4));
                        n1iVar2 = n1iVar4;
                    }
                    z6xVar = arrayList;
                }
            }
            List listK0 = o7h.k0((Iterable) z6xVar, 1);
            ArrayList arrayList2 = new ArrayList(q7h.U(listK0, 10));
            Iterator it = listK0.iterator();
            while (it.hasNext()) {
                arrayList2.add((n1i) ((mmr0) it.next()).b);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                dt71Var = this.c;
                if (!zHasNext) {
                    break;
                } else {
                    dt71Var.a((n1i) it2.next());
                }
            }
            this.a = n1iVar;
            if (n1iVar == n1i.a) {
                dt71Var.d();
                op71.s(this.b);
            }
        }
    }
}
