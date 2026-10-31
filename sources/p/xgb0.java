package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xgb0 {
    public final zle1 a;
    public final Set b;
    public final LinkedHashMap c = new LinkedHashMap();

    public xgb0(zle1 zle1Var, t380 t380Var) {
        this.a = zle1Var;
        this.b = t380Var;
    }

    public final void a(fdc fdcVar, int i, int i2) {
        if (fdcVar == null) {
            fdcVar = null;
        }
        if (fdcVar == null) {
            return;
        }
        if (fdcVar.X()) {
            String strR = fdcVar.R();
            LinkedHashMap linkedHashMap = this.c;
            n4e0 n4e0Var = (n4e0) linkedHashMap.get(strR);
            if (n4e0Var != null) {
                n4e0Var.a(i, i2);
            }
            linkedHashMap.remove(fdcVar.R());
        }
        fdcVar.M(i, i2);
    }

    public final fdc b(String str, String str2, boolean z) {
        Object next;
        Object next2;
        n4e0 n4e0Var;
        Set set = this.b;
        Iterator it = set.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((w64) next).b(str));
        boolean z2 = next != null;
        Iterator it2 = set.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((w64) next2).a(str));
        boolean z3 = next2 != null;
        if (!z2 && !z3) {
            return null;
        }
        if (z2 && z && (n4e0Var = (n4e0) this.c.get(str)) != null) {
            n4e0Var.b(str2);
        }
        fdc fdcVar = new fdc(this.a, str, str2, z);
        if (z3) {
            fdcVar.l0();
        }
        return fdcVar;
    }
}
