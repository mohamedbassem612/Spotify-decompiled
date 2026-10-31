package p;

import android.content.Context;
import android.content.pm.PackageManager;
import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zih0 {
    public final tuk a;
    public final uic b;
    public final Context c;
    public final gg11 d;
    public final gg11 e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final ArrayList i = new ArrayList();
    public final LinkedHashMap j = new LinkedHashMap();
    public WeakReference k;
    public uhh0 l;

    public zih0(tuk tukVar, uic uicVar, tam tamVar, Context context, gg11 gg11Var, gg11 gg11Var2) {
        this.a = tukVar;
        this.b = uicVar;
        this.c = context;
        this.d = gg11Var;
        this.e = gg11Var2;
    }

    public final void a(vsr0 vsr0Var, thh0 thh0Var) {
        String str = vsr0Var.a;
        if (f() == null) {
            this.h.put(str, thh0Var);
            return;
        }
        String strT = uic.t(vsr0Var);
        if (strT != null) {
            str = strT;
        }
        vih0 vih0Var = (vih0) this.j.get(str);
        if (vih0Var == null) {
            Logger.k("MBS: No service session found for packageName: %s", new Object[]{str});
        }
        if (vih0Var != null) {
            thh0Var.b(vih0Var);
        } else {
            thh0Var.a();
        }
    }

    public final void b(String str, tn31 tn31Var) {
        x610 x610VarF = f();
        if (x610VarF == null) {
            this.f.put(str, tn31Var);
            return;
        }
        List listQ0 = ihc1.Q0(str, new String[]{"---"}, 0, 6);
        String str2 = listQ0.size() == 2 ? (String) listQ0.get(0) : null;
        if (str2 != null) {
            str = str2;
        }
        suk sukVarB = this.a.b(str);
        if (this.j.containsKey(str) || sukVarB == null) {
            return;
        }
        c(x610VarF, str, sukVarB, tn31Var);
    }

    public final void c(x610 x610Var, String str, suk sukVar, tn31 tn31Var) {
        wih0 wih0Var;
        mxh0 mxh0Var;
        String str2;
        hf61 hf61VarJ = sukVar.j();
        ynb0 ynb0Var = (ynb0) this.d.get(hf61VarJ);
        if (ynb0Var == null || (wih0Var = (wih0) ynb0Var.get()) == null) {
            nkx0.j(hf61VarJ, "No session factory found for ");
            return;
        }
        fzc fzcVarE = sukVar.e();
        ynb0 ynb0Var2 = (ynb0) this.e.get(fzcVarE);
        if (ynb0Var2 == null || (mxh0Var = (mxh0) ynb0Var2.get()) == null) {
            nkx0.j(fzcVarE, "No callback handler factory found for ");
            return;
        }
        try {
            str2 = this.c.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        this.j.put(str, wih0Var.a(sukVar.g(str, str2, sukVar.k(str, tn31Var), this.b), x610Var, mxh0Var.a(x610Var, sukVar.c(str))));
        uhh0 uhh0Var = this.l;
        if (uhh0Var != null) {
            uhh0Var.g.h.a(true);
            uhh0Var.b();
        }
        this.g.put(str, tn31Var);
    }

    public final void d() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return;
        }
        Logger.b("MBS: Executing %d pending search requests", new Object[]{Integer.valueOf(arrayList.size())});
        List<xih0> listL1 = o7h.l1(arrayList);
        arrayList.clear();
        for (xih0 xih0Var : listL1) {
            String str = xih0Var.c;
            yih0 yih0Var = xih0Var.f;
            vih0 vih0VarH = h(str);
            if (vih0VarH != null) {
                Logger.b("MBS: Executing deferred search for query='%s', package='%s'", new Object[]{xih0Var.a, str});
                vih0VarH.d(xih0Var.a, xih0Var.b, xih0Var.c, xih0Var.d, xih0Var.e, yih0Var, xih0Var.g);
            } else {
                Logger.k("No session available for deferred search, package='%s'", new Object[]{str});
                yih0Var.invoke(pih0.c, "No session found for package: " + str);
            }
        }
    }

    public final String e() {
        return this.j.keySet().toString();
    }

    public final x610 f() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (x610) weakReference.get();
        }
        return null;
    }

    public final List g() {
        return o7h.l1(this.j.values());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    public final vih0 h(String str) {
        boolean z;
        List<vih0> listG = g();
        if (listG.isEmpty()) {
            return null;
        }
        vih0 vih0Var = null;
        for (vih0 vih0Var2 : listG) {
            if (vih0Var != null) {
                vih0Var2.getClass();
                long jG = vih0Var.g();
                long jG2 = vih0Var2.g();
                if (jG2 >= jG && jG2 != jG) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (u890.j(vih0Var2.l(), str)) {
                if (vih0Var2.k()) {
                    return vih0Var2;
                }
                n57.s(String.format("The integration with package name: \"%s\" does not support extended search", Arrays.copyOf(new Object[]{vih0Var2.l()}, 1)));
                return null;
            }
            if (z && vih0Var2.k()) {
                vih0Var = vih0Var2;
            }
        }
        return vih0Var;
    }

    public final void i(boolean z) {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.k = null;
        this.f.clear();
        this.h.clear();
        this.i.clear();
        if (z) {
            this.g.clear();
        }
        LinkedHashMap linkedHashMap = this.j;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((vih0) it.next()).destroy();
        }
        linkedHashMap.clear();
        uhh0 uhh0Var = this.l;
        if (uhh0Var != null) {
            if (uhh0Var.a.g().isEmpty()) {
                uhh0Var.g.h.a(false);
            }
            uhh0Var.b();
        }
        this.l = null;
    }
}
