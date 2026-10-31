package p;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ima1 implements dma1 {
    public final kly0 a;
    public final hfb b;
    public final boolean c;
    public final yrg0 d;

    public ima1(kly0 kly0Var, hfb hfbVar, boolean z, yrg0 yrg0Var) {
        this.a = kly0Var;
        this.b = hfbVar;
        this.c = z;
        this.d = yrg0Var;
    }

    @Override // p.dma1
    public Set a(bma1 bma1Var) throws Exception {
        Object objP = p(new k7a1(this, bma1Var, (byte) 3));
        if (objP != null) {
            return Collections.unmodifiableSet((Set) objP);
        }
        eg.m("Required value was null.");
        return null;
    }

    @Override // p.dma1
    public Set b(bma1 bma1Var, Set set) {
        Set set2 = (Set) p(new m551(this, bma1Var, set, (byte) 17));
        if (set2 == null) {
            return null;
        }
        return Collections.unmodifiableSet(set2);
    }

    @Override // p.dma1
    public float c(bma1 bma1Var, float f) throws Exception {
        Object objP = p(new lfo0(this, bma1Var, f, (byte) 1));
        objP.getClass();
        return ((Number) objP).floatValue();
    }

    @Override // p.dma1
    public float d(bma1 bma1Var) {
        t(bma1Var);
        return c(bma1Var, 0.0f);
    }

    @Override // p.dma1
    public String e(bma1 bma1Var, String str) {
        return (String) p(new m551(this, bma1Var, str, (byte) 16));
    }

    @Override // p.dma1
    public hma1 edit() {
        return new hma1(o().edit(), this.b, this.c, this.d);
    }

    @Override // p.dma1
    public String f(bma1 bma1Var) {
        t(bma1Var);
        return e(bma1Var, null);
    }

    @Override // p.dma1
    public long g(bma1 bma1Var, long j) throws Exception {
        Object objP = p(new au0(this, bma1Var, j, (byte) 6));
        objP.getClass();
        return ((Number) objP).longValue();
    }

    @Override // p.dma1
    public boolean h(bma1 bma1Var, boolean z) throws Exception {
        Object objP = p(new vm1(this, bma1Var, z, (byte) 20));
        objP.getClass();
        return ((Boolean) objP).booleanValue();
    }

    @Override // p.dma1
    public boolean i(bma1 bma1Var) {
        t(bma1Var);
        return h(bma1Var, false);
    }

    @Override // p.dma1
    public long j(bma1 bma1Var) {
        t(bma1Var);
        return g(bma1Var, 0L);
    }

    @Override // p.dma1
    public String k(bma1 bma1Var) throws Exception {
        Object objP = p(new ft0((Object) this, (Object) bma1Var, (byte) 23));
        if (objP != null) {
            return (String) objP;
        }
        eg.m("Required value was null.");
        return null;
    }

    @Override // p.dma1
    public int l(bma1 bma1Var, int i) throws Exception {
        Object objP = p(new wv1(this, bma1Var, i, (byte) 26));
        objP.getClass();
        return ((Number) objP).intValue();
    }

    @Override // p.dma1
    public int m(bma1 bma1Var) {
        t(bma1Var);
        return l(bma1Var, 0);
    }

    public final boolean n(bma1 bma1Var) {
        return o().contains(bma1Var.a);
    }

    public final SharedPreferences o() {
        return (SharedPreferences) this.a.get();
    }

    public final Object p(Function0 function0) throws Exception {
        if (!this.c || this.b == null) {
            return function0.invoke();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = null;
        try {
            Object objInvoke = function0.invoke();
            e = null;
            obj = objInvoke;
        } catch (Exception e) {
            e = e;
        }
        jpi1 jpi1Var = new jpi1(obj, System.currentTimeMillis() - jCurrentTimeMillis, e);
        Object objA = jpi1Var.a();
        Exception excB = jpi1Var.b();
        if (objA != null && !(objA instanceof Boolean) && !(objA instanceof Float) && !(objA instanceof Integer) && !(objA instanceof Long) && !(objA instanceof String) && (objA instanceof Set)) {
            Iterator it = ((Set) objA).iterator();
            while (it.hasNext()) {
                ((String) it.next()).getClass();
            }
        }
        gvg.s();
        if (excB == null) {
            return objA;
        }
        throw excB;
    }

    public final ezc q(bma1 bma1Var) {
        return c4p1.F(o(), this, bma1Var, h9a1.V0);
    }

    public final ezc r(bma1 bma1Var) {
        return c4p1.F(o(), this, bma1Var, h9a1.Y0);
    }

    public final ezc s(bma1 bma1Var) {
        return c4p1.F(o(), this, bma1Var, h9a1.Z0);
    }

    public final void t(bma1 bma1Var) {
        hfb hfbVar;
        if (n(bma1Var)) {
            return;
        }
        if (this.c && (hfbVar = this.b) != null) {
            ((8 & 8) != 0 ? new Date() : null).getTime();
            hfbVar.getClass();
        }
        bhn0.t(f4i1.f("key ", bma1Var.a, " has no value"));
    }
}
