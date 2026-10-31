package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ibs0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lbs0 b;

    public /* synthetic */ ibs0(lbs0 lbs0Var, byte b) {
        this.a = b;
        this.b = lbs0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        lbs0 lbs0Var = this.b;
        switch (b) {
            case 0:
                xcs0 xcs0Var = lbs0Var.c;
                String str = ((qfw) obj).a;
                Set setO1 = o7h.o1(xcs0Var.b());
                setO1.add(str);
                hma1 hma1VarEdit = xcs0Var.a.edit();
                hma1VarEdit.d(xcs0.k, xcs0Var.c.b(xcs0Var.e, setO1));
                hma1VarEdit.g();
                break;
            default:
                rew rewVar = (rew) obj;
                lbs0Var.c.d(rewVar.a, rewVar.b);
                break;
        }
    }
}
