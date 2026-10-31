package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vz80 {
    public final a1r0 a;
    public final String b;

    public vz80(a1r0 a1r0Var) {
        this.a = a1r0Var;
        w6b1 w6b1VarA = f7b1.a(blc0.d1);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str != null) {
            this.b = str;
        } else {
            eg.m("Required value was null.");
            throw null;
        }
    }

    public final void a(int i, tv80 tv80Var) {
        a1r0.m(this.a, new Uri.Builder().encodedPath(this.b).appendQueryParameter("inputMode", ab80.c(i)).build().toString(), tv80Var, (Bundle) null, 12);
    }
}
