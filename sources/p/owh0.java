package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class owh0 {
    public static kv40 c;
    public final Context a;
    public final ArrayList b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public owh0(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        eg.m("The media router service must only be accessed on the application's main thread.");
    }

    public static kv40 c() {
        kv40 kv40Var = c;
        if (kv40Var != null) {
            return kv40Var;
        }
        eg.m("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static owh0 d(Context context) {
        if (context == null) {
            hhg1.n("context must not be null");
            return null;
        }
        b();
        kv40 kv40Var = c;
        if (kv40Var == null) {
            kv40Var = new kv40(context.getApplicationContext());
            c = kv40Var;
        }
        ArrayList arrayList = kv40Var.h;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                owh0 owh0Var = new owh0(context);
                arrayList.add(new WeakReference(owh0Var));
                return owh0Var;
            }
            owh0 owh0Var2 = (owh0) ((WeakReference) arrayList.get(size)).get();
            if (owh0Var2 == null) {
                arrayList.remove(size);
            } else if (owh0Var2.a == context) {
                return owh0Var2;
            }
        }
    }

    public static void f(eyh0 eyh0Var) {
        lc20 lc20Var;
        b();
        kv40 kv40VarC = c();
        if (eyh0Var != null) {
            kv40VarC.getClass();
            lc20Var = new lc20(kv40VarC, eyh0Var);
        } else {
            lc20Var = null;
        }
        lc20 lc20Var2 = kv40VarC.D;
        if (lc20Var2 != null) {
            lc20Var2.h();
        }
        kv40VarC.D = lc20Var;
        if (lc20Var != null) {
            kv40VarC.n();
        }
    }

    public static void g(as31 as31Var) {
        b();
        bvh0 bvh0Var = c().r;
        if (bvh0Var == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        sf.P(bvh0Var.i, as31Var != null ? as31Var.a() : null);
    }

    public static void h(int i) {
        if (i < 0 || i > 3) {
            hhg1.n("Unsupported reason to unselect route");
            return;
        }
        b();
        kv40 kv40VarC = c();
        lwh0 lwh0VarC = kv40VarC.c();
        if (kv40VarC.h() != lwh0VarC) {
            kv40VarC.k(lwh0VarC, i, 1, true);
        }
    }

    public final void a(dwh0 dwh0Var, fwh0 fwh0Var, int i) {
        gwh0 gwh0Var;
        dwh0 dwh0Var2;
        if (fwh0Var == null) {
            hhg1.n("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((gwh0) arrayList.get(i2)).b == fwh0Var) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            gwh0Var = new gwh0(this, fwh0Var);
            arrayList.add(gwh0Var);
        } else {
            gwh0Var = (gwh0) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != gwh0Var.d) {
            gwh0Var.d = i;
            z = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        gwh0Var.e = jElapsedRealtime;
        dwh0 dwh0Var3 = gwh0Var.c;
        dwh0Var3.a();
        dwh0Var.a();
        if (dwh0Var3.b.containsAll(dwh0Var.b)) {
            z2 = z;
        } else {
            dwh0 dwh0Var4 = gwh0Var.c;
            if (dwh0Var4 == null) {
                hhg1.n("selector must not be null");
                return;
            }
            dwh0Var4.a();
            ArrayList<String> arrayList2 = !dwh0Var4.b.isEmpty() ? new ArrayList<>(dwh0Var4.b) : null;
            ArrayList<String> arrayListB = dwh0Var.b();
            if (!arrayListB.isEmpty()) {
                for (String str : arrayListB) {
                    if (str == null) {
                        hhg1.n("category must not be null");
                        return;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    if (!arrayList2.contains(str)) {
                        arrayList3.add(str);
                    }
                    arrayList2 = arrayList3;
                }
            }
            if (arrayList2 == null) {
                dwh0Var2 = dwh0.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                dwh0Var2 = new dwh0(bundle, arrayList2);
            }
            gwh0Var.c = dwh0Var2;
        }
        if (z2) {
            c().m();
        }
    }

    public final void e(fwh0 fwh0Var) {
        if (fwh0Var == null) {
            hhg1.n("callback must not be null");
            return;
        }
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((gwh0) arrayList.get(i)).b == fwh0Var) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().m();
        }
    }
}
