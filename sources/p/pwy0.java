package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pwy0 {
    public final gg11 a;

    public pwy0(gg11 gg11Var) {
        this.a = gg11Var;
    }

    public final Object a(omo1 omo1Var, gca gcaVar) {
        owy0 owy0Var;
        kly0 kly0Var = (kly0) this.a.get(omo1Var.getClass());
        if (kly0Var == null || (owy0Var = (owy0) kly0Var.get()) == null) {
            return new fs50(new aho0(1), omo1Var.o(), qmo1.r(omo1Var));
        }
        if (owy0Var.a().n().equals(omo1Var.getClass())) {
            return owy0Var.b(omo1Var, gcaVar);
        }
        String name = owy0Var.getClass().getName();
        String name2 = omo1Var.getClass().getName();
        String name3 = owy0Var.a().n().getName();
        StringBuilder sbN = gvg.n("Push notification type handler ", name, " is registered for ", name2, ", but handles ");
        sbN.append(name3);
        Logger.d(sbN.toString(), new Object[0]);
        return new fs50(new aho0(1), omo1Var.o(), qmo1.r(omo1Var));
    }
}
