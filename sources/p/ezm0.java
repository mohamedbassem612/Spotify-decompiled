package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ezm0 implements bzm0, zfb0 {
    public final zia a = new zia();
    public final Object b = new Object();
    public final LinkedHashMap c = new LinkedHashMap();

    public final Observable a() {
        return this.a.map(f331.W0).distinctUntilChanged();
    }

    public final void b(yyp0 yyp0Var, azm0 azm0Var) {
        synchronized (this.b) {
            try {
                cxc cxcVarC = ((l270) czm0.b.invoke(yyp0Var)).c();
                azm0 azm0Var2 = azm0.b;
                if (azm0Var == azm0Var2 || !this.c.containsKey(azm0Var2)) {
                    this.a.accept(new dzm0(azm0Var, cxcVarC));
                }
                this.c.put(azm0Var, cxcVarC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(azm0 azm0Var) {
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = this.c;
                azm0 azm0Var2 = azm0.a;
                cxc cxcVar = (cxc) linkedHashMap.get(azm0Var2);
                if (cxcVar == null || azm0Var != azm0.b) {
                    cxcVar = null;
                }
                this.a.accept(new dzm0(azm0Var2, cxcVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object getLast() {
        dzm0 dzm0Var = (dzm0) this.a.a.get();
        if (dzm0Var != null) {
            return dzm0Var.b;
        }
        return null;
    }
}
