package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract /* synthetic */ class c13 {
    public static int[] _values() {
        return l1d.H(3);
    }

    public static int a(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "navigate_to_page";
        }
        if (i == 2) {
            return "create_view";
        }
        if (i == 3) {
            return "create_page_content";
        }
        if (i == 4) {
            return "load_data";
        }
        if (i == 5) {
            return "render_content";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "data_load_failed";
        }
        if (i == 3) {
            return "cancelled";
        }
        throw null;
    }

    public static float d(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static int e(float f, float f2, float f3) {
        return Math.round((f + f2) * f3);
    }

    public static int f(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int g(StringBuilder sb, xe5 xe5Var, ArrayList arrayList, int i, int i2) {
        arrayList.add(xe5Var.a(sb.length()));
        return i + i2;
    }

    public static String h(String str, float f, String str2) {
        return str + f + str2;
    }

    public static Set i(Class cls) {
        return Collections.singleton(new yp21(cls));
    }

    public static pe j(gw70 gw70Var, ivj ivjVar) {
        c8o.l(gw70Var);
        pe peVarH = ivjVar.h();
        c8o.l(peVarH);
        return peVarH;
    }

    public static wnb0 k(nim0 nim0Var, float f, x340 x340Var, float f2, boolean z) {
        op71.g(x340Var, u291.v(nim0Var, f));
        return new wnb0(f2, z);
    }

    public static hrr0 l(boolean z, x340 x340Var) {
        hrr0 hrr0VarQ = v8r.q(Boolean.valueOf(z));
        x340Var.s0(hrr0VarQ);
        return hrr0VarQ;
    }

    public static r6h1 m(ArrayList arrayList, z6x z6xVar, y6h1 y6h1Var, ArrayList arrayList2, u8h1 u8h1Var) {
        arrayList.addAll(z6xVar);
        arrayList.add(y6h1Var);
        return new r6h1(arrayList2, u8h1Var);
    }

    public static void n(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void o(x340 x340Var, int i, int i2, vu30 vu30Var, x340 x340Var2) {
        x340Var.i0(i);
        vu30Var.invoke(x340Var2, Integer.valueOf(i2));
    }

    public static float p(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "FOREGROUND";
        }
        if (i == 2) {
            return "BACKGROUND";
        }
        throw null;
    }

    public static /* synthetic */ int r(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("FOREGROUND")) {
            return 1;
        }
        if (str.equals("BACKGROUND")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.ubi.navigationloggerimpl.mobius.AppForegroundState.".concat(str));
        return 0;
    }
}
