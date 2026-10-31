package p;

import android.net.Uri;
import android.widget.ImageView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nq80 implements gw70, bxg {
    public final oq80 a;
    public final vx40 b;

    public nq80(oq80 oq80Var, vx40 vx40Var) {
        this.a = oq80Var;
        this.b = vx40Var;
        oq80Var.j = this;
        oq80Var.i = this;
    }

    public final void a(Uri uri) {
        g(uri);
    }

    public final ixg b(Uri uri) {
        return this.a.a(uri);
    }

    public final ixg c(c3i1 c3i1Var) {
        return this.a.a(c3i1Var);
    }

    public final void d(ImageView imageView) {
        eth.w(imageView).a();
    }

    public final rf01 e() {
        return (rf01) this.a.k.getValue();
    }

    public final ixg f(String str) {
        return this.a.a(str);
    }

    public final void h(String str, g5n g5nVar, Float f) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b.c;
        int iOrdinal = g5nVar.ordinal();
        String str2 = "core_cache";
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                str2 = "core_network";
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return;
                }
                str2 = "unknown";
            }
        }
        lp80 lp80Var = (lp80) concurrentHashMap.get(str);
        if (lp80Var != null) {
            concurrentHashMap.put(str, new lp80(str2, f, lp80Var.c, lp80Var.d));
        }
    }

    public final void i(String str, String str2, viz vizVar) {
        Throwable th = vizVar.c;
        String str3 = th instanceof TimeoutException ? "timeout" : "error";
        String message = th.getMessage();
        if (message == null) {
            message = th.getClass().getCanonicalName();
        }
        vx40 vx40Var = this.b;
        vx40Var.C((lp80) ((ConcurrentHashMap) vx40Var.c).get(str), str3, str2, message, str);
    }

    public final void j(String str, Map map) {
        vx40 vx40Var = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) vx40Var.c;
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        t45 t45VarA = ((zle1) vx40Var.b).a("image_loading_android");
        t45.m(t45VarA, "image_request", 4);
        t45VarA.a("library", "coil");
        concurrentHashMap.put(str, new lp80("unknown", null, t45VarA, map));
    }

    public final void k(String str, String str2, tsc1 tsc1Var) {
        String str3;
        int iC = l1d.C(tsc1Var.c);
        if (iC == 0 || iC == 1) {
            str3 = "memory_cache";
        } else if (iC == 2) {
            str3 = "request_load";
        } else {
            if (iC != 3) {
                eg.o();
                return;
            }
            str3 = "core_network";
        }
        vx40 vx40Var = this.b;
        lp80 lp80Var = (lp80) ((ConcurrentHashMap) vx40Var.c).get(str);
        String str4 = lp80Var != null ? lp80Var.a : null;
        if (!u890.j(str4, "unknown") && str4 != null) {
            str3 = str4;
        }
        vx40Var.C(lp80Var != null ? new lp80(str3, lp80Var.b, lp80Var.c, lp80Var.d) : null, "success", str2, (String) null, str);
    }
}
