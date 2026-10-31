package p;

import android.app.Application;
import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wi20 {
    public static final Object k = new Object();
    public static final y36 l = new y36(0);
    public final Context a;
    public final String b;
    public final pj20 c;
    public final k1i d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final aob0 g;
    public final lly0 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public wi20(Context context, String str, pj20 pj20Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        zod.o(str);
        this.b = str;
        this.c = pj20Var;
        c29 c29Var = hj20.a;
        i2p1.r("Firebase");
        i2p1.r("ComponentDiscovery");
        ArrayList arrayListG = aod.h(context, ComponentDiscoveryService.class).g();
        i2p1.q();
        i2p1.r("Runtime");
        lag lagVar = new lag(zch1.a);
        lagVar.d(arrayListG);
        lagVar.c(new FirebaseCommonRegistrar());
        lagVar.c(new ExecutorsRegistrar());
        lagVar.b(vzh.c(context, Context.class, new Class[0]));
        lagVar.b(vzh.c(this, wi20.class, new Class[0]));
        lagVar.b(vzh.c(pj20Var, pj20.class, new Class[0]));
        lagVar.r(new twb((byte) 2));
        if (vqo1.h(context) && hj20.b.get()) {
            lagVar.b(vzh.c(c29Var, c29.class, new Class[0]));
        }
        k1i k1iVarE = lagVar.e();
        this.d = k1iVarE;
        i2p1.q();
        this.g = new aob0(new t0s(this, context));
        this.h = k1iVarE.g(v0s.class);
        ti20 ti20Var = new ti20(this);
        a();
        if (atomicBoolean.get()) {
            rx9.e.a.get();
        }
        copyOnWriteArrayList.add(ti20Var);
        i2p1.q();
    }

    public static wi20 c() {
        wi20 wi20Var;
        synchronized (k) {
            try {
                wi20Var = (wi20) l.get("[DEFAULT]");
                if (wi20Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ph5.s() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((v0s) wi20Var.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return wi20Var;
    }

    public static wi20 f(Context context, pj20 pj20Var) {
        wi20 wi20Var;
        AtomicReference atomicReference = ui20.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = ui20.a;
            if (atomicReference2.get() == null) {
                ui20 ui20Var = new ui20();
                if (bb00.n(atomicReference2, ui20Var)) {
                    rx9.a(application);
                    rx9 rx9Var = rx9.e;
                    rx9Var.getClass();
                    synchronized (rx9Var) {
                        rx9Var.c.add(ui20Var);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            y36 y36Var = l;
            zod.v("FirebaseApp name [DEFAULT] already exists!", !y36Var.containsKey("[DEFAULT]"));
            zod.t(context, "Application context cannot be null.");
            wi20Var = new wi20(context, "[DEFAULT]", pj20Var);
            y36Var.put("[DEFAULT]", wi20Var);
        }
        wi20Var.e();
        return wi20Var;
    }

    public final void a() {
        zod.v("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(m6p1.s(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(m6p1.s(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        Context context = this.a;
        if (!vqo1.h(context)) {
            a();
            vi20.a(context);
            return;
        }
        a();
        a();
        this.d.i("[DEFAULT]".equals(this.b));
        ((v0s) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wi20)) {
            return false;
        }
        wi20 wi20Var = (wi20) obj;
        wi20Var.a();
        return this.b.equals(wi20Var.b);
    }

    public final boolean g() {
        boolean z;
        a();
        qwq qwqVar = (qwq) this.g.get();
        synchronized (qwqVar) {
            z = qwqVar.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        drj0 drj0VarR = k8p1.r(this);
        drj0VarR.d(this.b, "name");
        drj0VarR.d(this.c, "options");
        return drj0VarR.toString();
    }
}
