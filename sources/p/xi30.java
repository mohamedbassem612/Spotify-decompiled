package p;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xi30 {
    public static final cj30 a = new cj30();
    public static final ej30 b;

    static {
        ej30 ej30Var = null;
        try {
            ej30Var = (ej30) jj30.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = ej30Var;
    }

    public static final void a(y36 y36Var, y36 y36Var2) {
        int i = ((jv81) y36Var).c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (!y36Var2.containsKey((String) y36Var.i(i))) {
                y36Var.g(i);
            }
        }
    }

    public static final void b(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
