package p;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class drb0 extends c7 {
    public final o860 Y;
    public final ac11 Z;

    public drb0(o860 o860Var, ac11 ac11Var, int i, n9r n9rVar) {
        super(1, i, new eqb0(o860Var, ac11Var, false), n9rVar, ajn0.e(ac11Var.a.getName()), (voe0) ((uw0) o860Var.b).d, false);
        this.Y = o860Var;
        this.Z = ac11Var;
    }

    @Override // p.pa
    public final List x1(List list) {
        drb0 drb0Var;
        sua suaVar;
        a8b0 a8b0Var;
        a8b0 a8b0VarK;
        o860 o860Var = this.Y;
        sua suaVar2 = (sua) ((uw0) o860Var.b).Z;
        List<a8b0> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (a8b0 a8b0Var2 : list2) {
            if (o1h1.c(a8b0Var2, j141.f, null)) {
                drb0Var = this;
                suaVar = suaVar2;
                a8b0Var = a8b0Var2;
            } else {
                drb0Var = this;
                suaVar = suaVar2;
                a8b0Var = a8b0Var2;
                a8b0VarK = suaVar.k(new uqs(drb0Var, false, o860Var, wf5.TYPE_PARAMETER_BOUNDS, false), a8b0Var, z6x.a, null, false);
                if (a8b0VarK == null) {
                }
                arrayList.add(a8b0VarK);
                this = drb0Var;
                suaVar2 = suaVar;
            }
            a8b0VarK = a8b0Var;
            arrayList.add(a8b0VarK);
            this = drb0Var;
            suaVar2 = suaVar;
        }
        return arrayList;
    }

    @Override // p.pa
    public final List y1() {
        Type[] bounds = this.Z.a.getBounds();
        z6x arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new ob11(type));
        }
        ob11 ob11Var = (ob11) o7h.X0(arrayList);
        if (u890.j(ob11Var != null ? ob11Var.a : null, Object.class)) {
            arrayList = z6x.a;
        }
        ArrayList arrayList2 = (Collection) arrayList;
        boolean zIsEmpty = arrayList2.isEmpty();
        o860 o860Var = this.Y;
        if (zIsEmpty) {
            return Collections.singletonList(y3o1.Z(((ajm0) ((uw0) o860Var.b).X).e.f(), ((ajm0) ((uw0) o860Var.b).X).e.p()));
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((st60) o860Var.e).L((ob11) it.next(), bs51.u(2, false, this, 3)));
        }
        return arrayList4;
    }
}
