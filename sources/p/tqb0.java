package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tqb0 extends crb0 {
    public final wb11 n;
    public final nqb0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final soe0 f44p;
    public final ffr q;

    public tqb0(o860 o860Var, wb11 wb11Var, nqb0 nqb0Var) {
        super(o860Var, null);
        this.n = wb11Var;
        this.o = nqb0Var;
        voe0 voe0Var = (voe0) ((uw0) o860Var.b).d;
        this.f44p = new soe0(voe0Var, new jqb0(o860Var, this, (byte) 1));
        this.q = voe0Var.b(new da((Object) this, (Object) o860Var, (byte) 29));
    }

    @Override // p.yqb0, p.aqi0, p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        return z6x.a;
    }

    @Override // p.yqb0, p.aqi0, p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        if (!wgtVar.a(wgt.l | wgt.e)) {
            return z6x.a;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            n9r n9rVar = (n9r) obj;
            if ((n9rVar instanceof beg) && ((Boolean) iu30Var.invoke(((beg) n9rVar).getName())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p.aqi0, p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        return u(ajn0Var, null);
    }

    @Override // p.yqb0
    public final Set h(wgt wgtVar, iu30 iu30Var) {
        if (!wgtVar.a(wgt.e)) {
            return w7x.a;
        }
        Set set = (Set) this.f44p.invoke();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(ajn0.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // p.yqb0
    public final n9r p() {
        return this.o;
    }

    public final beg u(ajn0 ajn0Var, mb11 mb11Var) {
        ajn0 ajn0Var2 = moa1.a;
        if (ajn0Var.b().length() <= 0 || ajn0Var.b) {
            return null;
        }
        Set set = (Set) this.f44p.invoke();
        if (mb11Var == null && set != null && !set.contains(ajn0Var.b())) {
            return null;
        }
        return (beg) this.q.invoke(new pqb0(ajn0Var, mb11Var));
    }
}
