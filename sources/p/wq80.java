package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wq80 implements rtb0 {
    public final rtb0 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public wq80(rtb0 rtb0Var) {
        this.a = rtb0Var;
    }

    public final void d(Object obj, Object obj2, xu30 xu30Var) {
        h(obj);
        this.a.d(obj, obj2, new j2i(701964765, new cy00(this, obj, xu30Var, (byte) 16), true));
    }

    public final void e(int i, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar) {
        for (int i2 = 0; i2 < i; i2++) {
            h(iu30Var != null ? iu30Var.invoke(Integer.valueOf(i2)) : null);
        }
        this.a.e(i, iu30Var, iu30Var2, new j2i(-1900571869, new gk0(this, iu30Var, j2iVar), true));
    }

    public final void g(Object obj, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1426674375);
        int i2 = (x340Var.i(obj) ? 4 : 2) | i | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object obj2 = this.b.get(obj);
            if (obj2 == null) {
                hhg1.f(gvg.g(obj, "Unknown item with "));
                return;
            }
            ago1.b(new k3h1(((Number) obj2).intValue()), apo.r(750703482, new ak10(j2iVar, (byte) 8), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50(this, obj, j2iVar, i, (byte) 27);
        }
    }

    public final void h(Object obj) {
        if (obj == null) {
            hhg1.f(cy30.m("item key ", obj, " is null"));
            return;
        }
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.containsKey(obj)) {
            hhg1.f(gvg.g(obj, "Duplicate key "));
        } else {
            Map.Entry entry = (Map.Entry) o7h.B0(linkedHashMap.entrySet());
            linkedHashMap.put(obj, Integer.valueOf(entry != null ? ((Number) entry.getValue()).intValue() + 1 : 0));
        }
    }
}
