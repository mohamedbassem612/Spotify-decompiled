package p;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pj80 {
    public final qdt0 a;
    public final hx4 b;
    public final Object c = new Object();
    public final bfn0 d = new bfn0(0, new egl1[16]);
    public boolean e;

    public pj80(qdt0 qdt0Var, hx4 hx4Var) {
        this.a = qdt0Var;
        this.b = hx4Var;
    }

    public final jep0 a(EditorInfo editorInfo) {
        jep0 kep0Var;
        synchronized (this.c) {
            if (this.e) {
                return null;
            }
            InputConnection inputConnectionA = this.a.a(editorInfo);
            gv20 gv20Var = new gv20((Object) this, (byte) 10);
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                kep0Var = new lep0(inputConnectionA, gv20Var);
            } else {
                kep0Var = i >= 25 ? new kep0(inputConnectionA, gv20Var) : new jep0(inputConnectionA, gv20Var);
            }
            this.d.b(new egl1(kep0Var));
            return kep0Var;
        }
    }

    public final boolean b() {
        return !this.e;
    }
}
