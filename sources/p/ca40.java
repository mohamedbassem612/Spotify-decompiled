package p;

import android.app.Activity;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ca40 {
    public final o241 a;
    public final ov20 b;
    public final r0s0 c;
    public final p1t0 d;
    public final Activity e;

    public ca40(o241 o241Var, ov20 ov20Var, r0s0 r0s0Var, p1t0 p1t0Var, Activity activity) {
        this.a = o241Var;
        this.b = ov20Var;
        this.c = r0s0Var;
        this.d = p1t0Var;
        this.e = activity;
    }

    public static /* synthetic */ void d(ca40 ca40Var, String str, tv80 tv80Var, u0t0 u0t0Var, iu30 iu30Var, int i) {
        if ((i & 4) != 0) {
            u0t0Var = null;
        }
        ca40Var.c(str, tv80Var, u0t0Var, false, iu30Var);
    }

    public final Single a() {
        return this.a.a("parental-pin-required", "0").map(si10.d).take(1L).single(Boolean.FALSE);
    }

    public final void b(String str, qc40 qc40Var) {
        p1t0 p1t0Var = this.d;
        p1t0Var.b.remove(str);
        LinkedHashMap linkedHashMap = p1t0Var.a;
        iu30 iu30Var = (iu30) linkedHashMap.get(str);
        if (iu30Var == null) {
            Logger.k("Dropping PIN gate result for %s: no registered callback", new Object[]{str});
        } else {
            iu30Var.invoke(qc40Var);
            linkedHashMap.remove(str);
        }
    }

    public final void c(String str, tv80 tv80Var, u0t0 u0t0Var, boolean z, iu30 iu30Var) {
        p1t0 p1t0Var = this.d;
        p1t0Var.a.put(str, iu30Var);
        if (!z) {
            iac0 iac0Var = this.e;
            iac0 iac0Var2 = iac0Var instanceof iac0 ? iac0Var : null;
            if (iac0Var2 != null) {
                iac0Var2.getLifecycle().a(new zw3(this, str, iu30Var, (byte) 3));
            }
        }
        if (p1t0Var.b.contains(str)) {
            return;
        }
        r0s0 r0s0Var = this.c;
        if (u0t0Var != null) {
            r0s0Var.x(str, tv80Var, u0t0Var);
        } else {
            r0s0Var.w(str, tv80Var);
        }
    }
}
