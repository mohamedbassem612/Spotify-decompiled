package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class im21 extends zf30 {
    public final jf11 F1;
    public Intent G1;
    public ik21 H1;
    public final pf30 I1 = a0(new cj8(this, (byte) 12), new e1r0((byte) 5));

    public im21(jf11 jf11Var) {
        this.F1 = jf11Var;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        String string;
        super.w0(bundle);
        ik21 ik21Var = this.H1;
        if (ik21Var == null) {
            u890.C("reportBlockingFlow");
            throw null;
        }
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 == null || (string = bundle2.getString("entity-url")) == null) {
            string = "";
        }
        ik21Var.j = string;
        if (bundle == null) {
            ik21 ik21Var2 = this.H1;
            if (ik21Var2 == null) {
                u890.C("reportBlockingFlow");
                throw null;
            }
            ik21Var2.c();
            Intent intent = this.G1;
            if (intent != null) {
                this.I1.a(intent);
            } else {
                u890.C("intent");
                throw null;
            }
        }
    }
}
