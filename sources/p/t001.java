package p;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t001 {
    public final a1r0 a;
    public final th30 b;
    public final s001 c;
    public final cy4 d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public t001(a1r0 a1r0Var, th30 th30Var, s001 s001Var, cy4 cy4Var) {
        this.a = a1r0Var;
        this.b = th30Var;
        this.c = s001Var;
        this.d = cy4Var;
    }

    public final void a(String str, String str2) {
        Dialog dialogA1;
        boolean zA = this.d.a();
        Handler handler = this.e;
        if (zA) {
            List listU = this.b.c.u();
            if (!(listU instanceof Collection) || !listU.isEmpty()) {
                Iterator it = listU.iterator();
                while (true) {
                    if (it.hasNext()) {
                        t2u t2uVar = (zf30) it.next();
                        if (!(t2uVar instanceof t2u) || (dialogA1 = t2uVar.a1()) == null || !dialogA1.isShowing()) {
                        }
                    }
                }
            }
            Set set = s4b1.f;
            String strZ = uic.n().z();
            if (strZ != null) {
                handler.post(new hw9(this, strZ, str, str2, (byte) 13));
                return;
            }
            return;
        }
        handler.post(new hw9(this.c.a(), this, str, str2, (byte) 14));
    }
}
