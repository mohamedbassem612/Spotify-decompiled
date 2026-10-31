package p;

import android.util.Log;
import androidx.car.app.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hp41 implements whg0 {
    public final ArrayDeque a = new ArrayDeque();
    public final androidx.car.app.k b;
    public final tac0 c;

    public hp41(androidx.car.app.k kVar, tac0 tac0Var) {
        this.b = kVar;
        this.c = tac0Var;
        tac0Var.a(new pj00(this, (byte) 3));
    }

    public static void g(ap41 ap41Var, boolean z) {
        w8c0 w8c0Var = ap41Var.b.i;
        if (w8c0Var.a(w8c0.e)) {
            ap41Var.b(k8c0.ON_PAUSE);
        }
        if (w8c0Var.a(w8c0.d)) {
            ap41Var.b(k8c0.ON_STOP);
        }
        if (z) {
            ap41Var.b(k8c0.ON_DESTROY);
        }
    }

    public final ap41 a() {
        sge1.a();
        ap41 ap41Var = (ap41) this.a.peek();
        Objects.requireNonNull(ap41Var);
        return ap41Var;
    }

    public final void b() {
        sge1.a();
        if (this.c.i.equals(w8c0.a)) {
            Log.isLoggable("CarApp", 3);
            return;
        }
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() > 1) {
            c(Collections.singletonList((ap41) arrayDeque.pop()));
        }
    }

    public final void c(List list) {
        ap41 ap41VarA = a();
        ap41VarA.f = true;
        ((b) this.b.e(b.class)).c.a("app", "invalidate", new um5((byte) 15));
        tac0 tac0Var = this.c;
        if (tac0Var.i.a(w8c0.d)) {
            ap41VarA.b(k8c0.ON_START);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ap41 ap41Var = (ap41) it.next();
            if (Log.isLoggable("CarApp", 3)) {
                Objects.toString(ap41Var);
            }
            g(ap41Var, true);
        }
        if (Log.isLoggable("CarApp", 3)) {
            ap41VarA.toString();
        }
        if (tac0Var.i.a(w8c0.e) && this.a.contains(ap41VarA)) {
            ap41VarA.b(k8c0.ON_RESUME);
        }
    }

    public final void d(String str) {
        sge1.a();
        if (this.c.i.equals(w8c0.a)) {
            Log.isLoggable("CarApp", 3);
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.size() <= 1 || str.equals(a().d)) {
                break;
            } else {
                arrayList.add((ap41) arrayDeque.pop());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c(arrayList);
    }

    public final void e(ap41 ap41Var) {
        sge1.a();
        tac0 tac0Var = this.c;
        w8c0 w8c0Var = tac0Var.i;
        w8c0 w8c0Var2 = w8c0.a;
        if (w8c0Var.equals(w8c0Var2)) {
            Log.isLoggable("CarApp", 3);
            return;
        }
        if (ap41Var.b.i.equals(w8c0Var2)) {
            eg.m(String.format(Locale.US, "Failed to push screen (%s), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", ap41Var));
            return;
        }
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(ap41Var);
        }
        ArrayDeque arrayDeque = this.a;
        boolean zContains = arrayDeque.contains(ap41Var);
        w8c0 w8c0Var3 = w8c0.e;
        if (!zContains) {
            ap41 ap41Var2 = (ap41) arrayDeque.peek();
            f(ap41Var, true);
            if (arrayDeque.contains(ap41Var)) {
                if (ap41Var2 != null) {
                    g(ap41Var2, false);
                }
                if (tac0Var.i.a(w8c0Var3)) {
                    ap41Var.b(k8c0.ON_RESUME);
                    return;
                }
                return;
            }
            return;
        }
        ap41 ap41Var3 = (ap41) arrayDeque.peek();
        if (ap41Var3 == null || ap41Var3 == ap41Var) {
            return;
        }
        arrayDeque.remove(ap41Var);
        f(ap41Var, false);
        g(ap41Var3, false);
        if (tac0Var.i.a(w8c0Var3)) {
            ap41Var.b(k8c0.ON_RESUME);
        }
    }

    public final void f(ap41 ap41Var, boolean z) {
        this.a.push(ap41Var);
        w8c0 w8c0Var = w8c0.c;
        tac0 tac0Var = this.c;
        if (z && tac0Var.i.a(w8c0Var)) {
            ap41Var.b(k8c0.ON_CREATE);
        }
        if (ap41Var.b.i.a(w8c0Var) && tac0Var.i.a(w8c0.d)) {
            ((b) this.b.e(b.class)).c.a("app", "invalidate", new um5((byte) 15));
            ap41Var.b(k8c0.ON_START);
        }
    }
}
