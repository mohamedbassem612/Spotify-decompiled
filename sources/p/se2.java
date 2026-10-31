package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class se2 implements MobiusLoop.Logger {
    public final ohv0 a;
    public boolean b;

    public se2(ohv0 ohv0Var) {
        this.a = ohv0Var;
    }

    public final void a(Object obj, Object obj2, Next next) {
        String str;
        sg2 sg2Var = (sg2) obj2;
        ew80 ew80Var = ew80.c;
        boolean z = sg2Var instanceof qg2;
        ohv0 ohv0Var = this.a;
        if (z) {
            ohv0Var.a(new mhv0("sign_up_birthday", "next", ew80Var, (String) null));
            return;
        }
        if (sg2Var instanceof lg2) {
            g();
            return;
        }
        if (sg2Var instanceof og2) {
            g();
            return;
        }
        if (sg2Var instanceof rg2) {
            g();
            return;
        }
        if (sg2Var instanceof pg2) {
            ohv0Var.a(new lhv0("sign_up_birthday", "age_confirmation"));
            return;
        }
        if (sg2Var instanceof mg2) {
            ohv0Var.a(new mhv0("sign_up_birthday", "edit", ew80Var, "age_confirmation"));
            return;
        }
        if (sg2Var instanceof ng2) {
            ohv0Var.a(new mhv0("sign_up_birthday", "confirm", ew80Var, "age_confirmation"));
            return;
        }
        if (sg2Var instanceof kg2) {
            zb90 zb90Var = ((kg2) sg2Var).a;
            if (zb90Var instanceof yb90) {
                str = "Unknown";
            } else if (zb90Var instanceof xb90) {
                str = "TooYoung";
            } else if (zb90Var instanceof ub90) {
                str = "BadAge";
            } else if (zb90Var instanceof wb90) {
                str = "InvalidCountry";
            } else {
                if (!(zb90Var instanceof vb90)) {
                    eg.o();
                    return;
                }
                str = "InvalidArgument";
            }
            ohv0Var.a(new jhv0("sign_up_birthday", "error_endpoint_signup-v1-validate", 4, str));
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2, Exception exc) {
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, First first) {
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, Exception exc) {
    }

    public final void g() {
        if (this.b) {
            return;
        }
        this.a.a(new mhv0("sign_up_birthday", "birth_date", ew80.b, (String) null));
        this.b = true;
    }
}
