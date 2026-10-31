package p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class s161 {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static final qim0 a(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new qfg(iu30Var));
    }

    public static final qim0 b(qim0 qim0Var, boolean z, iu30 iu30Var) {
        return qim0Var.then(new hy5(iu30Var, z));
    }
}
