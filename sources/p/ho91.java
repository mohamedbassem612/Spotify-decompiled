package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ho91 implements Action {
    public final /* synthetic */ io91 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public ho91(io91 io91Var, String str, String str2, boolean z) {
        this.a = io91Var;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final void run() {
        np91 np91Var = this.a.a;
        dma1 dma1VarB = np91Var.a.b(np91Var.b, this.b);
        hma1 hma1VarEdit = dma1VarB.edit();
        bma1 bma1Var = op91.a;
        Set setA = dma1VarB.a(bma1Var);
        String str = this.c;
        boolean z = this.d;
        hma1VarEdit.e(bma1Var, z ? dm61.x0(str, setA) : dm61.u0(str, setA));
        bma1 bma1Var2 = op91.b;
        Set setA2 = dma1VarB.a(bma1Var2);
        hma1VarEdit.e(bma1Var2, z ? dm61.u0(str, setA2) : dm61.x0(str, setA2));
        hma1VarEdit.h();
    }
}
