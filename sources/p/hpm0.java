package p;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hpm0 implements gpm0 {
    public final hn60 a;
    public lvc1 b;
    public lvc1 c;
    public zwg e;
    public Thread.UncaughtExceptionHandler f;
    public epm0 d = epm0.a;
    public final CopyOnWriteArraySet g = new CopyOnWriteArraySet();

    public hpm0(hn60 hn60Var) {
        this.a = hn60Var;
    }

    public final void a() {
        epm0 epm0Var = epm0.a;
        try {
            try {
                lvc1 lvc1Var = this.c;
                lvc1 lvc1Var2 = this.b;
                if (lvc1Var2 == null) {
                    throw new IllegalStateException("Could not revert");
                }
                if (lvc1Var != null) {
                    avw0.d(lvc1Var.j());
                }
                lvc1Var2.a();
                b(epm0Var);
            } catch (IOException e) {
                Logger.k("Unable to revert change: %s", e.getMessage());
                b(epm0Var);
            }
        } catch (Throwable th) {
            b(epm0Var);
            throw th;
        }
    }

    public final void b(epm0 epm0Var) {
        this.d = epm0Var;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((n1c1) it.next()).a(epm0Var);
        }
    }

    public final boolean c(jdd1 jdd1Var) {
        lvc1 lvc1Var = this.c;
        lvc1 lvc1Var2 = this.b;
        if (lvc1Var == null || lvc1Var2 == null) {
            eg.m("Could not sync folders");
            return false;
        }
        b(epm0.b);
        pxd0.R(lvc1Var2, lvc1Var.j().b.getAbsolutePath());
        pxd0.Q(lvc1Var, lvc1Var2.j().b.getAbsolutePath());
        this.f = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new len(this, (byte) 1));
        lvc1 lvc1Var3 = this.c;
        lvc1 lvc1Var4 = this.b;
        if (lvc1Var3 == null || lvc1Var4 == null) {
            eg.m("Could not do sync folders");
            return false;
        }
        zwg zwgVar = new zwg(lvc1Var4.j(), lvc1Var3.j(), jdd1Var, this.a);
        this.e = zwgVar;
        boolean zM = zwgVar.M();
        if (pxd0.G(lvc1Var2)) {
            b(epm0.e);
        } else {
            pxd0.S(lvc1Var2, lvc1Var.j().b.getAbsolutePath());
            pxd0.P(lvc1Var, lvc1Var2.j().b.getAbsolutePath());
            b(epm0.c);
        }
        Thread.setDefaultUncaughtExceptionHandler(this.f);
        return zM;
    }
}
