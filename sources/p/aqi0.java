package p;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class aqi0 implements zpi0 {
    @Override // p.zpi0
    public Collection a(ajn0 ajn0Var, int i) {
        return z6x.a;
    }

    @Override // p.zpi0
    public Set b() {
        Collection collectionD = d(wgt.f49p, aht.N0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof xw81) {
                linkedHashSet.add(((xw81) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // p.zpi0
    public Collection c(ajn0 ajn0Var, int i) {
        return z6x.a;
    }

    @Override // p.zpi0
    public Collection d(wgt wgtVar, iu30 iu30Var) {
        return z6x.a;
    }

    @Override // p.zpi0
    public Set e() {
        return null;
    }

    @Override // p.zpi0
    public Set f() {
        Collection collectionD = d(wgt.q, aht.N0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof xw81) {
                linkedHashSet.add(((xw81) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // p.zpi0
    public jfg g(ajn0 ajn0Var, int i) {
        return null;
    }
}
