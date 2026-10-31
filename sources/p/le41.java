package p;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class le41 implements ipb1 {
    public final /* synthetic */ ipb1 a;

    public le41(ipb1 ipb1Var, Function0 function0, String str, iu30 iu30Var, mc41 mc41Var) {
        Object objE;
        this.a = ipb1Var;
        Bundle bundle = ((Bundle) function0.invoke()).getBundle(str);
        if (bundle != null) {
            if (bundle.getBoolean("com.spotify.element.state_holder_saved_state")) {
                j(bundle.getBundle("ui_state"));
                bundle = bundle.getBundle("element_state");
            }
            if (bundle != null) {
                bundle = bundle.isEmpty() ? null : bundle;
                if (bundle != null && (objE = mc41Var.e(bundle, spc0.a)) != null) {
                    e(objE);
                }
            }
        }
        iu30Var.invoke(new v721(str, this, mc41Var, (byte) 20));
    }

    public final void a(jpb1 jpb1Var) {
        this.a.a(jpb1Var);
    }

    public final boolean b() {
        return this.a.b();
    }

    public final Bundle c() {
        return this.a.c();
    }

    public final void d(jpb1 jpb1Var) {
        this.a.d(jpb1Var);
    }

    public final void e(Object obj) {
        this.a.e(obj);
    }

    public final dts f() {
        return this.a.f();
    }

    public final dts g() {
        return this.a.g();
    }

    public final Object getState() {
        return this.a.getState();
    }

    public final String h() {
        return this.a.h();
    }

    public final String i() {
        return this.a.i();
    }

    public final void j(Bundle bundle) {
        this.a.j(bundle);
    }

    public final dts k() {
        return this.a.k();
    }

    public final Bundle serialize() {
        return this.a.serialize();
    }
}
