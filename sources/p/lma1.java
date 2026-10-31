package p;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lma1 extends ima1 {
    public final ima1 e;

    public lma1(ema1 ema1Var, ima1 ima1Var, hfb hfbVar, boolean z, yrg0 yrg0Var) {
        super(new kc00((SharedPreferences) ema1Var.get(), (byte) 4), hfbVar, z, yrg0Var);
        this.e = ima1Var;
    }

    public static bma1 u(bma1 bma1Var) {
        return bma1.b.k(bma1Var.a);
    }

    @Override // p.ima1, p.dma1
    public final Set a(bma1 bma1Var) throws Exception {
        String str = bma1Var.a;
        SharedPreferences sharedPreferencesO = o();
        if (sharedPreferencesO.contains(str)) {
            Object objP = p(new kma1(sharedPreferencesO, str, (byte) 1));
            objP.getClass();
            return (Set) objP;
        }
        if (!sharedPreferencesO.contains("__cleared__")) {
            bma1 bma1VarU = u(bma1Var);
            ima1 ima1Var = this.e;
            if (ima1Var.n(bma1VarU)) {
                return ima1Var.a(u(bma1Var));
            }
        }
        return w7x.a;
    }

    @Override // p.ima1, p.dma1
    public final Set b(bma1 bma1Var, Set set) {
        String str = bma1Var.a;
        SharedPreferences sharedPreferencesO = o();
        if (sharedPreferencesO.contains(str)) {
            return (Set) p(new m551(sharedPreferencesO, str, set, (byte) 19));
        }
        return sharedPreferencesO.contains("__cleared__") ? set : this.e.b(u(bma1Var), set);
    }

    @Override // p.ima1, p.dma1
    public final float c(bma1 bma1Var, float f) throws Exception {
        String str = bma1Var.a;
        SharedPreferences sharedPreferencesO = o();
        if (!sharedPreferencesO.contains(str)) {
            return sharedPreferencesO.contains("__cleared__") ? f : this.e.c(u(bma1Var), f);
        }
        Object objP = p(new lfo0(sharedPreferencesO, str, f, (byte) 2));
        objP.getClass();
        return ((Number) objP).floatValue();
    }

    @Override // p.ima1, p.dma1
    public final float d(bma1 bma1Var) {
        return c(bma1Var, 0.0f);
    }

    @Override // p.ima1, p.dma1
    public final String e(bma1 bma1Var, String str) {
        String str2 = bma1Var.a;
        SharedPreferences sharedPreferencesO = o();
        if (sharedPreferencesO.contains(str2)) {
            return (String) p(new m551(sharedPreferencesO, str2, str, (byte) 18));
        }
        return sharedPreferencesO.contains("__cleared__") ? str : this.e.e(u(bma1Var), str);
    }

    @Override // p.ima1, p.dma1
    public final hma1 edit() {
        return new jma1(o().edit(), this.b, this.c, this.d);
    }

    @Override // p.ima1, p.dma1
    public final String f(bma1 bma1Var) {
        return e(bma1Var, null);
    }

    @Override // p.ima1, p.dma1
    public final long g(bma1 bma1Var, long j) throws Exception {
        String str = bma1Var.a;
        SharedPreferences sharedPreferencesO = o();
        if (!sharedPreferencesO.contains(str)) {
            return sharedPreferencesO.contains("__cleared__") ? j : this.e.g(u(bma1Var), j);
        }
        Object objP = p(new au0(sharedPreferencesO, str, j, (byte) 7));
        objP.getClass();
        return ((Number) objP).longValue();
    }

    @Override // p.ima1, p.dma1
    public final boolean h(bma1 bma1Var, boolean z) throws Exception {
        String str = bma1Var.a;
        SharedPreferences sharedPreferencesO = o();
        if (!sharedPreferencesO.contains(str)) {
            return sharedPreferencesO.contains("__cleared__") ? z : this.e.h(u(bma1Var), z);
        }
        Object objP = p(new vm1(sharedPreferencesO, str, z, (byte) 21));
        objP.getClass();
        return ((Boolean) objP).booleanValue();
    }

    @Override // p.ima1, p.dma1
    public final boolean i(bma1 bma1Var) {
        return h(bma1Var, false);
    }

    @Override // p.ima1, p.dma1
    public final long j(bma1 bma1Var) {
        return g(bma1Var, 0L);
    }

    @Override // p.ima1, p.dma1
    public final String k(bma1 bma1Var) throws Exception {
        String str = bma1Var.a;
        SharedPreferences sharedPreferencesO = o();
        if (sharedPreferencesO.contains(str)) {
            Object objP = p(new kma1(sharedPreferencesO, str, (byte) 0));
            objP.getClass();
            return (String) objP;
        }
        if (!sharedPreferencesO.contains("__cleared__")) {
            bma1 bma1VarU = u(bma1Var);
            ima1 ima1Var = this.e;
            if (ima1Var.n(bma1VarU)) {
                String strE = ima1Var.e(u(bma1Var), "");
                strE.getClass();
                return strE;
            }
        }
        return "";
    }

    @Override // p.ima1, p.dma1
    public final int l(bma1 bma1Var, int i) throws Exception {
        String str = bma1Var.a;
        SharedPreferences sharedPreferencesO = o();
        if (!sharedPreferencesO.contains(str)) {
            return sharedPreferencesO.contains("__cleared__") ? i : this.e.l(u(bma1Var), i);
        }
        Object objP = p(new wv1(sharedPreferencesO, str, i, (byte) 27));
        objP.getClass();
        return ((Number) objP).intValue();
    }

    @Override // p.ima1, p.dma1
    public final int m(bma1 bma1Var) {
        return l(bma1Var, 0);
    }
}
