package p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ynb1 {
    public ifb1 a;
    public boolean b = true;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final dil f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public boolean j;
    public final wat k;
    public long l;

    public ynb1(wat watVar) {
        HashMap map = new HashMap();
        this.c = map;
        this.d = new HashMap();
        this.e = new HashMap();
        dil dilVar = new dil(this);
        this.f = dilVar;
        this.g = 0;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = true;
        dilVar.a = 0;
        map.put(0, dilVar);
        this.k = watVar;
        this.l = jjl.b(0, 0, 0, 0, 15);
        this.a = new ifb1(this, (byte) 4);
    }

    public final void a(Object obj) {
        this.h.add(obj);
        this.j = true;
    }

    public final dil b(Object obj) {
        HashMap map = this.c;
        u811 u811Var = (u811) map.get(obj);
        Object obj2 = u811Var;
        if (u811Var == null) {
            dil dilVar = new dil(this);
            map.put(obj, dilVar);
            dilVar.a = obj;
            obj2 = dilVar;
        }
        if (obj2 instanceof dil) {
            return (dil) obj2;
        }
        return null;
    }

    public final int c(Float f) {
        return Math.round(f.floatValue());
    }

    public final ifb1 d() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vq50 e(int i, String str) {
        dil dilVarB = b(str);
        od10 od10Var = dilVarB.c;
        if (od10Var == null || !(od10Var instanceof vq50)) {
            vq50 vq50Var = new vq50(this);
            vq50Var.b = i;
            vq50Var.g = str;
            dilVarB.c = vq50Var;
            dilVarB.a(vq50Var.b());
        }
        return (vq50) dilVarB.c;
    }

    public final j660 f(int i) {
        j660 wq60Var;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i2 = this.g;
        this.g = i2 + 1;
        String strJ = gvg.j(sb, i2, "__");
        HashMap map = this.d;
        j660 j660Var = (j660) map.get(strJ);
        j660 j660Var2 = j660Var;
        if (j660Var == null) {
            int i3 = 4;
            byte b = 1;
            switch (l1d.C(i)) {
                case 0:
                    wq60Var = new wq60(this, 1);
                    break;
                case 1:
                    wq60Var = new m5j1(this, 2);
                    break;
                case 2:
                    fj3 fj3Var = new fj3(this, i3, (byte) 0);
                    fj3Var.o0 = 0.5f;
                    wq60Var = fj3Var;
                    break;
                case 3:
                    fj3 fj3Var2 = new fj3(this, i3, b);
                    fj3Var2.o0 = 0.5f;
                    wq60Var = fj3Var2;
                    break;
                case 4:
                    wq60Var = new d9a(this, 5);
                    break;
                case 5:
                default:
                    wq60Var = new j660(this, i);
                    break;
                case 6:
                case 7:
                    wq60Var = new cw20(this, i);
                    break;
                case 8:
                case 9:
                case 10:
                    wq60Var = new og50(this, i);
                    break;
            }
            wq60Var.a = strJ;
            map.put(strJ, wq60Var);
            j660Var2 = wq60Var;
        }
        return j660Var2;
    }

    public final wq60 g() {
        return (wq60) f(1);
    }

    public final void h(String str) {
        e(0, str);
    }

    public final boolean i() {
        return this.b;
    }

    public final m5j1 j() {
        return (m5j1) f(2);
    }

    public final void k(String str) {
        e(1, str);
    }
}
