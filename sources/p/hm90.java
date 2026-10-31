package p;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hm90 implements qua0 {
    public final jn7 a;
    public final g0l b;
    public final n6r0 c;
    public final r3d0 d;
    public final mr20 e;
    public final mga f;
    public final j3r g = new j3r(cm90.d);

    public hm90(jn7 jn7Var, g0l g0lVar, q8n q8nVar, n6r0 n6r0Var, r3d0 r3d0Var, mr20 mr20Var) {
        this.a = jn7Var;
        this.b = g0lVar;
        this.c = n6r0Var;
        this.d = r3d0Var;
        this.e = mr20Var;
        this.f = d7p1.f(jd0.y, q8nVar, (vu30) null, new eoc((byte) 26), new ux70(this, (byte) 26), (iu30) null, 18);
    }

    public final void b(ses0 ses0Var) {
        this.f.b(ses0Var);
    }

    public final pua0 c(iu30 iu30Var) {
        mga mgaVar = this.f;
        mgaVar.getClass();
        return new jga(mgaVar, iu30Var);
    }

    public final zjd1 d() {
        return this.f.a;
    }

    public final LinkedHashMap f(Set set) {
        Set set2 = set;
        int iS = zno1.s(q7h.U(set2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : set2) {
            linkedHashMap.put(obj, this.g);
        }
        return linkedHashMap;
    }
}
