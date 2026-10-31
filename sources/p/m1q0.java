package p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class m1q0 {
    public boolean a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public Function0 c;

    public m1q0(boolean z) {
        this.a = z;
    }

    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((hhd) it.next()).cancel();
        }
    }

    public final void f(boolean z) {
        this.a = z;
        Function0 function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void c(vt9 vt9Var) {
    }

    public void d(vt9 vt9Var) {
    }
}
