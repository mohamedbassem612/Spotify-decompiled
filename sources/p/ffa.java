package p;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ffa {
    public static final kiv a = mod.t(new ya4((byte) 7));
    public static Boolean b;

    public static final void a(af5 af5Var, lee1 lee1Var, f930 f930Var, List list, boolean z, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Executor executor = (Executor) x340Var.k(a);
        if (executor == null || !b(af5Var.b.length())) {
            x340Var.i0(317137883);
            x340Var.r(false);
        } else {
            x340Var.i0(315439796);
            try {
                executor.execute(new dfa(lee1Var, (flb0) x340Var.k(t4k.n), list, af5Var, (wat) x340Var.k(t4k.h), f930Var, z));
            } catch (RejectedExecutionException unused) {
            }
            x340Var.r(false);
        }
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
