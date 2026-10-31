package p;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ggs0 extends xbk1 {
    public final fe41 b;
    public final ConcurrentLinkedDeque c = new ConcurrentLinkedDeque();
    public final Object d = new Object();

    public ggs0(fe41 fe41Var) {
        this.b = fe41Var;
        ArrayList arrayList = (ArrayList) fe41Var.b.s("navigation.pending_intents");
        if (arrayList != null) {
            ClassLoader classLoader = ggs0.class.getClassLoader();
            if (classLoader == null) {
                eg.m("Required value was null.");
                throw null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Intent) it.next()).setExtrasClassLoader(classLoader);
            }
            this.c.addAll(arrayList);
        }
    }

    public final void T() {
        this.b.b(new ArrayList(this.c), "navigation.pending_intents");
    }
}
