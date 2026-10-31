package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uhh0 {
    public final zih0 a;
    public final Set b;
    public final r8l c;
    public final txh0 d;
    public final sxh0 e;
    public final m89 f;
    public final d6b1 g;

    public uhh0(d6b1 d6b1Var, zih0 zih0Var, Set set, r8l r8lVar, txh0 txh0Var, sxh0 sxh0Var, m89 m89Var, uic uicVar) {
        this.g = d6b1Var;
        this.a = zih0Var;
        this.b = set;
        this.c = r8lVar;
        this.d = txh0Var;
        this.e = sxh0Var;
        this.f = m89Var;
    }

    public final void a(String str) {
        tn31 tn31Var;
        zih0 zih0Var = this.a;
        x610 x610VarF = zih0Var.f();
        if (zih0Var.j.containsKey(str) || (tn31Var = (tn31) zih0Var.g.get(str)) == null) {
            return;
        }
        Logger.g("MBS: Recreating previous MBS session for %s", new Object[]{str});
        if (x610VarF == null) {
            zih0Var.f.put(str, tn31Var);
            return;
        }
        suk sukVarB = zih0Var.a.b(str);
        if (sukVarB != null) {
            zih0Var.c(x610VarF, str, sukVarB, tn31Var);
        }
    }

    public final void b() {
        List listG = this.a.g();
        ArrayList arrayList = new ArrayList(listG.size());
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(((vih0) it.next()).f());
        }
        m89 m89Var = this.f;
        m89Var.getClass();
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((lxh0) it2.next()).m());
        }
        m89Var.a.a(o7h.j0(q7h.V(arrayList2)));
    }
}
