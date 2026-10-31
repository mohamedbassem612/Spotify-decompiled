package p;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lxj extends hab0 implements Function0 {
    public final /* synthetic */ xtb0 a;
    public final /* synthetic */ tr80 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ drr0 e;
    public final /* synthetic */ tr80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxj(xtb0 xtb0Var, tr80 tr80Var, float f, ven0 ven0Var, drr0 drr0Var, tr80 tr80Var2) {
        super(0);
        this.a = xtb0Var;
        this.b = tr80Var;
        this.c = f;
        this.d = ven0Var;
        this.e = drr0Var;
        this.f = tr80Var2;
    }

    public final Object invoke() {
        Object next;
        xtb0 xtb0Var = this.a;
        ptb0 ptb0VarH = xtb0Var.h();
        i25 i25Var = xtb0Var.e;
        List list = ptb0VarH.l;
        int iA = rxj.a(this.b, this.c, this.d, this.e, list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            qtb0 qtb0Var = (qtb0) next;
            tr80 tr80Var = this.f;
            int i = ((rr80) tr80Var).a;
            int i2 = ((rr80) tr80Var).b;
            int i3 = qtb0Var.a;
            if (i <= i3 && i3 <= i2 && qtb0Var.p + qtb0Var.q > iA) {
                break;
            }
        }
        qtb0 qtb0Var2 = (qtb0) next;
        return new vwj(qtb0Var2 != null ? qtb0Var2.a : ((err0) i25Var.b).s(), ((err0) i25Var.b).s() + p7h.L(list));
    }
}
