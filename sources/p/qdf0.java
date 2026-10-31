package p;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qdf0 {
    public static final ExecutorService e = Executors.newCachedThreadPool(new rdf0());
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile odf0 d;

    public qdf0(Callable callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                f((odf0) callable.call());
                return;
            } catch (Throwable th) {
                f(new odf0(th));
                return;
            }
        }
        ExecutorService executorService = e;
        pdf0 pdf0Var = new pdf0(callable);
        pdf0Var.b = this;
        executorService.execute(pdf0Var);
    }

    public final synchronized void a(idf0 idf0Var) {
        Throwable th;
        try {
            odf0 odf0Var = this.d;
            if (odf0Var != null && (th = odf0Var.b) != null) {
                idf0Var.onResult(th);
            }
            this.b.add(idf0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(idf0 idf0Var) {
        fcf0 fcf0Var;
        try {
            odf0 odf0Var = this.d;
            if (odf0Var != null && (fcf0Var = odf0Var.a) != null) {
                idf0Var.onResult(fcf0Var);
            }
            this.a.add(idf0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        odf0 odf0Var = this.d;
        if (odf0Var == null) {
            return;
        }
        fcf0 fcf0Var = odf0Var.a;
        if (fcf0Var != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.a).iterator();
                while (it.hasNext()) {
                    ((idf0) it.next()).onResult(fcf0Var);
                }
            }
            return;
        }
        Throwable th = odf0Var.b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.b);
            if (arrayList.isEmpty()) {
                nue0.d("Lottie encountered an error but no failure listener was added:");
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((idf0) it2.next()).onResult(th);
            }
        }
    }

    public final synchronized void d(idf0 idf0Var) {
        this.b.remove(idf0Var);
    }

    public final synchronized void e(idf0 idf0Var) {
        this.a.remove(idf0Var);
    }

    public final void f(odf0 odf0Var) {
        if (this.d != null) {
            eg.m("A task may only be set once.");
            return;
        }
        this.d = odf0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new gv40(this, (byte) 14));
        }
    }

    public qdf0(fcf0 fcf0Var) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        f(new odf0(fcf0Var));
    }

    public qdf0(Callable callable) {
        this(callable, false);
    }
}
