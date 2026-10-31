package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r7d1 implements ipb1 {
    public static final uic c = new uic((byte) 26);
    public static volatile r7d1 d;
    public final ArrayList a = new ArrayList();
    public Bundle b;

    public final void a(jpb1 jpb1Var) {
        this.a.add(jpb1Var);
        g7d1 g7d1Var = uwo1.b;
        if (g7d1Var != null) {
            jpb1Var.onStateUpdate(g7d1Var);
        }
    }

    public final Bundle c() {
        return this.b;
    }

    public final void d(jpb1 jpb1Var) {
        this.a.remove(jpb1Var);
    }

    public final void e(Object obj) {
        g7d1 g7d1Var = (g7d1) obj;
        uwo1.b = g7d1Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jpb1) it.next()).onStateUpdate(g7d1Var);
        }
    }

    public final Object getState() {
        g7d1 g7d1Var = uwo1.b;
        if (g7d1Var != null) {
            return g7d1Var;
        }
        hhg1.n("Element state cannot be null");
        return null;
    }

    public final void j(Bundle bundle) {
        this.b = bundle;
    }
}
