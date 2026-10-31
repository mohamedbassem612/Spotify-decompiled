package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aeg implements u9r {
    public final mb11 a;
    public final iu30 b;
    public final p5 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public aeg(mb11 mb11Var, iu30 iu30Var) {
        this.a = mb11Var;
        this.b = iu30Var;
        p5 p5Var = new p5(this, (byte) 10);
        this.c = p5Var;
        nf20 nf20VarT = z561.T(p5Var, new i46(mb11Var.e(), (byte) 1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mf20 mf20Var = new mf20(nf20VarT);
        while (mf20Var.hasNext()) {
            Object next = mf20Var.next();
            ajn0 ajn0VarC = ((vb11) next).c();
            Object arrayList = linkedHashMap.get(ajn0VarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(ajn0VarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        nf20 nf20VarT2 = z561.T(this.b, new i46(this.a.c(), (byte) 1));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        mf20 mf20Var2 = new mf20(nf20VarT2);
        while (mf20Var2.hasNext()) {
            Object next2 = mf20Var2.next();
            linkedHashMap2.put(((sb11) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListG = this.a.g();
        iu30 iu30Var2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListG) {
            if (((Boolean) iu30Var2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iS = zno1.s(q7h.U(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((yb11) obj2).c(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // p.u9r
    public final Set a() {
        nf20 nf20VarT = z561.T(this.c, new i46(this.a.e(), (byte) 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        mf20 mf20Var = new mf20(nf20VarT);
        while (mf20Var.hasNext()) {
            linkedHashSet.add(((vb11) mf20Var.next()).c());
        }
        return linkedHashSet;
    }

    @Override // p.u9r
    public final Collection b(ajn0 ajn0Var) {
        List list = (List) this.d.get(ajn0Var);
        return list != null ? list : z6x.a;
    }

    @Override // p.u9r
    public final yb11 c(ajn0 ajn0Var) {
        return (yb11) this.f.get(ajn0Var);
    }

    @Override // p.u9r
    public final Set d() {
        return this.f.keySet();
    }

    @Override // p.u9r
    public final Set e() {
        nf20 nf20VarT = z561.T(this.b, new i46(this.a.c(), (byte) 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        mf20 mf20Var = new mf20(nf20VarT);
        while (mf20Var.hasNext()) {
            linkedHashSet.add(((sb11) mf20Var.next()).c());
        }
        return linkedHashSet;
    }

    @Override // p.u9r
    public final sb11 f(ajn0 ajn0Var) {
        return (sb11) this.e.get(ajn0Var);
    }
}
