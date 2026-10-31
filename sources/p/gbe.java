package p;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gbe implements lrd1 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public final Cloneable e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;

    public gbe() {
        this.c = new Handler(Looper.getMainLooper());
        this.e = new LinkedHashMap();
        this.f = new jen0();
        this.a = 1;
        this.h = new s10(this, (byte) 19);
        this.g = new jen0();
    }

    public rl7 a(float f) {
        rl7 rl7Var = null;
        float f2 = Float.POSITIVE_INFINITY;
        for (Map.Entry entry : ((LinkedHashMap) this.e).entrySet()) {
            rl7 rl7Var2 = (rl7) entry.getKey();
            jen0 jen0Var = (jen0) entry.getValue();
            float fAbs = d(jen0Var) ? Math.abs(jen0Var.c() - f) : Float.POSITIVE_INFINITY;
            if (fAbs < f2) {
                f2 = fAbs;
                rl7Var = rl7Var2;
            }
        }
        return rl7Var;
    }

    public void b(ogr ogrVar) {
        this.i = ogrVar;
    }

    public boolean c(rl7 rl7Var) {
        jen0 jen0Var = (jen0) ((LinkedHashMap) this.e).get(rl7Var);
        return jen0Var != null && d(jen0Var);
    }

    public boolean d(jen0 jen0Var) {
        return jen0Var.e((jen0) this.g) >= 0.5f;
    }

    public rl7 e(rl7 rl7Var, jen0 jen0Var) {
        rl7 rl7Var2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        if (rl7Var == null) {
            return a(jen0Var.c());
        }
        jen0 jen0Var2 = (jen0) linkedHashMap.get(rl7Var);
        if (jen0Var2 == null) {
            return a(jen0Var.c());
        }
        if (jen0Var2.c() < jen0Var.b || jen0Var2.c() > jen0Var.d) {
            return a(jen0Var.c());
        }
        boolean z = jen0Var2.c() < jen0Var.c();
        rl7 rl7Var3 = null;
        if (z) {
            float fC = jen0Var2.c();
            float f = Float.POSITIVE_INFINITY;
            rl7Var2 = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                rl7 rl7Var4 = (rl7) entry.getKey();
                jen0 jen0Var3 = (jen0) entry.getValue();
                float fC2 = (!d(jen0Var3) || jen0Var3.c() <= fC) ? Float.POSITIVE_INFINITY : jen0Var3.c() - fC;
                if (fC2 < f) {
                    f = fC2;
                    rl7Var2 = rl7Var4;
                }
            }
        } else {
            float fC3 = jen0Var2.c();
            float f2 = Float.POSITIVE_INFINITY;
            rl7Var2 = null;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                rl7 rl7Var5 = (rl7) entry2.getKey();
                jen0 jen0Var4 = (jen0) entry2.getValue();
                float fC4 = (!d(jen0Var4) || jen0Var4.c() >= fC3) ? Float.POSITIVE_INFINITY : fC3 - jen0Var4.c();
                if (fC4 < f2) {
                    f2 = fC4;
                    rl7Var2 = rl7Var5;
                }
            }
        }
        if (rl7Var2 != null) {
            jen0 jen0Var5 = (jen0) sqg0.G(rl7Var2, linkedHashMap);
            boolean z2 = !z ? jen0Var5.c() <= jen0Var.b : jen0Var5.c() >= jen0Var.d;
            boolean z3 = Math.abs(jen0Var5.c() - jen0Var.c()) < Math.abs(jen0Var2.c() - jen0Var.c());
            if (z2 && z3) {
                rl7Var3 = rl7Var2;
            }
            if (rl7Var3 != null) {
                return rl7Var3;
            }
        }
        return rl7Var;
    }

    public void f(rl7 rl7Var) {
        ogr ogrVar;
        ogr ogrVar2;
        if (u890.j(rl7Var, (rl7) this.d)) {
            return;
        }
        rl7 rl7Var2 = (rl7) this.d;
        if (rl7Var2 != null && (ogrVar2 = (ogr) this.i) != null) {
            pgr pgrVar = (pgr) ogrVar2.b;
            Iterator it = pgrVar.d.iterator();
            while (it.hasNext()) {
                ((sl7) it.next()).a(rl7Var2);
            }
            pgrVar.g = null;
        }
        this.d = rl7Var;
        if (rl7Var == null || (ogrVar = (ogr) this.i) == null) {
            return;
        }
        pgr pgrVar2 = (pgr) ogrVar.b;
        pgrVar2.g = rl7Var;
        Iterator it2 = pgrVar2.d.iterator();
        while (it2.hasNext()) {
            ((sl7) it2.next()).b(rl7Var);
        }
    }

    public void h(rl7 rl7Var) {
        ((LinkedHashMap) this.e).remove(rl7Var);
        if (u890.j((rl7) this.d, rl7Var)) {
            f(null);
        }
    }

    public void i(jen0 jen0Var) {
        this.g = jen0Var;
    }

    public void j(jen0 jen0Var, float f) {
        Runnable runnable = (s10) this.h;
        Handler handler = (Handler) this.c;
        int i = this.a;
        ((jen0) this.f).b(jen0Var);
        this.a = Math.abs(f) < 400.0f ? 2 : 3;
        rl7 rl7Var = (rl7) this.d;
        if (rl7Var == null || !c(rl7Var)) {
            rl7Var = null;
        }
        if (this.a == 3) {
            if (this.b != 0) {
                handler.removeCallbacks(runnable);
                this.b = 0;
            }
            f(rl7Var);
            return;
        }
        if (i == 3) {
            f(rl7Var);
            if (this.b != 0) {
                return;
            }
            this.b = 2;
            handler.postDelayed(runnable, 20L);
            return;
        }
        int i2 = this.b;
        if (i2 == 2) {
            f(rl7Var);
            return;
        }
        if (i2 != 0) {
            handler.removeCallbacks(runnable);
            this.b = 0;
        }
        f(e(rl7Var, jen0Var));
    }

    public void l(rl7 rl7Var, jen0 jen0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        boolean zContainsKey = linkedHashMap.containsKey(rl7Var);
        linkedHashMap.put(rl7Var, jen0Var);
        if (rl7Var.equals((rl7) this.d) && !d(jen0Var)) {
            f(null);
        }
        if (this.a == 2) {
            if (((rl7) this.d) == null || !zContainsKey) {
                Runnable runnable = (s10) this.h;
                Handler handler = (Handler) this.c;
                if (this.b != 0) {
                    return;
                }
                this.b = 1;
                handler.postDelayed(runnable, 0L);
            }
        }
    }

    public void o(jen0 jen0Var) {
        ((jen0) this.f).b(jen0Var);
        this.a = 2;
        rl7 rl7Var = (rl7) this.d;
        if (rl7Var == null || !c(rl7Var)) {
            rl7Var = null;
        }
        f(rl7Var);
        Runnable runnable = (s10) this.h;
        Handler handler = (Handler) this.c;
        if (this.b != 0) {
            handler.removeCallbacks(runnable);
        }
        this.b = 2;
        handler.postDelayed(runnable, 20L);
    }

    public void m(rl7 rl7Var) {
    }

    public gbe(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.f = new SparseArray();
        this.g = new SparseArray();
    }
}
