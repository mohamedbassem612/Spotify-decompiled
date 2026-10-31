package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ph80 extends aqi0 {
    public final zpi0 b;

    public ph80(zpi0 zpi0Var) {
        this.b = zpi0Var;
    }

    @Override // p.aqi0, p.zpi0
    public final Set b() {
        return this.b.b();
    }

    @Override // p.aqi0, p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        z6x z6xVar;
        int i = wgt.l & wgtVar.b;
        wgt wgtVar2 = i == 0 ? null : new wgt(i, wgtVar.a);
        if (wgtVar2 == null) {
            z6xVar = z6x.a;
        } else {
            Collection collectionD = this.b.d(wgtVar2, iu30Var);
            z6x arrayList = new ArrayList();
            for (Object obj : collectionD) {
                if (obj instanceof kfg) {
                    arrayList.add(obj);
                }
            }
            z6xVar = arrayList;
        }
        return (Collection) z6xVar;
    }

    @Override // p.aqi0, p.zpi0
    public final Set e() {
        return this.b.e();
    }

    @Override // p.aqi0, p.zpi0
    public final Set f() {
        return this.b.f();
    }

    @Override // p.aqi0, p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        jfg jfgVarG = this.b.g(ajn0Var, i);
        if (jfgVarG != null) {
            beg begVar = jfgVarG instanceof beg ? (beg) jfgVarG : null;
            if (begVar != null) {
                return begVar;
            }
            if (jfgVarG instanceof jit) {
                return (jit) jfgVarG;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
