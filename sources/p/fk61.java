package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fk61 implements Function0 {
    public final d6u a;
    public final gfr b;
    public final vip0 c;
    public final ffr d;
    public final g7t e;

    public fk61(d6u d6uVar, gfr gfrVar, vip0 vip0Var, ffr ffrVar, g7t g7tVar) {
        this.a = d6uVar;
        this.b = gfrVar;
        this.c = vip0Var;
        this.d = ffrVar;
        this.e = g7tVar;
    }

    public final CompletableAndThenCompletable a(m560 m560Var, me20 me20Var, boolean z) {
        fdg1 dpa1Var;
        cto1 mb10Var = me20Var.c ? new mb10(me20Var.a) : new lb10(me20Var.b);
        if (me20Var.f) {
            String str = me20Var.d;
            str.getClass();
            dpa1Var = new epa1(str);
        } else {
            dpa1Var = new dpa1(me20Var.e);
        }
        return ((Completable) this.d.invoke(new pk61(m560Var, mb10Var, dpa1Var, z))).c((CompletableSource) this.e.invoke(me20Var, m560Var));
    }

    public final Object invoke() {
        return ((Observable) this.b.invoke()).switchMapCompletable(new ep31(this, (byte) 10));
    }
}
