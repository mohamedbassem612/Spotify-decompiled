package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u2r implements ns31 {
    public final ks31 a = new ks31();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public final void a(or31 or31Var) {
        this.a.a(or31Var);
    }

    public final void b(l2r l2rVar) {
        qua0 qua0Var = l2rVar instanceof qua0 ? (qua0) l2rVar : null;
        zjd1 zjd1VarD = qua0Var != null ? qua0Var.d() : null;
        if (zjd1VarD != null) {
            n57.k(!c(zjd1VarD), "addDataSource: a data source for %s already exists. It has either been added previously in this builder block, or is included in the default configuration. Use overrideDataSource() to replace it if this is intentional. Please inform #blink-support if you need to override a data source.", rc11.a.b(zjd1VarD.getClass()).r());
        }
        this.b.add(l2rVar.a());
        this.d.add(l2rVar);
    }

    public final boolean c(zjd1 zjd1Var) {
        jh5 jh5Var = new jh5(zjd1Var, rih1.a);
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (ob51.f((dmh1) it.next(), jh5Var)) {
                return true;
            }
        }
        return false;
    }

    public final void d(l2r l2rVar) {
        qua0 qua0Var = l2rVar instanceof qua0 ? (qua0) l2rVar : null;
        zjd1 zjd1VarD = qua0Var != null ? qua0Var.d() : null;
        if (zjd1VarD != null) {
            n57.k(c(zjd1VarD), "overrideDataSource: no existing data source for %s to override. Use addDataSource() instead.", rc11.a.b(zjd1VarD.getClass()).r());
        }
        this.c.add(0, l2rVar.a());
        this.d.add(l2rVar);
    }
}
