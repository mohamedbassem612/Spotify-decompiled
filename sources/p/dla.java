package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dla implements eec {
    public final /* synthetic */ ven0 a;
    public final /* synthetic */ chz0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ iec d;

    public dla(ven0 ven0Var, chz0 chz0Var, Function0 function0, iec iecVar) {
        this.a = ven0Var;
        this.b = chz0Var;
        this.c = function0;
        this.d = iecVar;
    }

    public final void a() {
        ven0 ven0Var = this.a;
        if (ven0Var.getValue() == null) {
            ven0Var.setValue(this.b);
            this.c.invoke();
            this.d.e.a();
        }
    }
}
