package p;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mf61 {
    public final zov0 a;
    public final Function0 b;
    public final String c;
    public int d;
    public qd61 e;

    public mf61() {
        zov0 zov0Var = zov0.t;
        lf61 lf61Var = lf61.a;
        this.a = zov0Var;
        this.b = lf61Var;
        this.c = nhc1.W(((UUID) lf61Var.invoke()).toString(), "-", "").toLowerCase(Locale.ROOT);
        this.d = -1;
    }

    public final qd61 a() {
        qd61 qd61Var = this.e;
        if (qd61Var != null) {
            return qd61Var;
        }
        u890.C("currentSession");
        throw null;
    }
}
