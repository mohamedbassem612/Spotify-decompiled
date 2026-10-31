package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vbc implements deg {
    public final voe0 a;
    public final zim0 b;

    public vbc(voe0 voe0Var, ajm0 ajm0Var) {
        this.a = voe0Var;
        this.b = ajm0Var;
    }

    @Override // p.deg
    public final Collection a(kf30 kf30Var) {
        return w7x.a;
    }

    @Override // p.deg
    public final boolean b(kf30 kf30Var, ajn0 ajn0Var) {
        String strB = ajn0Var.b();
        return (nhc1.Y(strB, "Function", false) || nhc1.Y(strB, "KFunction", false) || nhc1.Y(strB, "SuspendFunction", false) || nhc1.Y(strB, "KSuspendFunction", false)) && aw30.c.a(strB, kf30Var) != null;
    }

    @Override // p.deg
    public final beg c(heg hegVar) {
        kf30 kf30Var;
        zv30 zv30VarA;
        if (!hegVar.c && !hegVar.g()) {
            String str = hegVar.b.a.a;
            if (ihc1.h0(str, "Function", false) && (zv30VarA = aw30.c.a(str, (kf30Var = hegVar.a))) != null) {
                yv30 yv30Var = zv30VarA.a;
                int i = zv30VarA.b;
                toe0 toe0Var = this.b.D(kf30Var).f;
                mma0 mma0Var = dub0.i[0];
                List list = (List) toe0Var.invoke();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof zbc) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (o7h.s0(arrayList2) == null) {
                    return new lv30(this.a, (zbc) o7h.q0(arrayList), yv30Var, i);
                }
                bhn0.d();
            }
        }
        return null;
    }
}
