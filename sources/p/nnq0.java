package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nnq0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ onq0 b;

    public /* synthetic */ nnq0(onq0 onq0Var, byte b) {
        this.a = b;
        this.b = onq0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        onq0 onq0Var = this.b;
        switch (b) {
            case 0:
                a1r0.j((a1r0) onq0Var.a.c, "spotify:internal:puffin-intro", (String) null, (Bundle) null, false, 14);
                break;
            case 1:
                a1r0.j((a1r0) onq0Var.a.c, "spotify:internal:puffin-wired-management", (String) null, (Bundle) null, false, 14);
                break;
            default:
                dxy dxyVar = onq0Var.a;
                m560 m560Var = ((jnq0) obj).b;
                dma1 dma1Var = ((b050) dxyVar.d).a;
                if (!(m560Var instanceof k560)) {
                    if (!(m560Var instanceof l560)) {
                        eg.o();
                        break;
                    }
                } else {
                    bma1 bma1Var = csy0.a;
                    Set setB = dma1Var.b(bma1Var, w7x.a);
                    setB.getClass();
                    Set setO1 = o7h.o1(setB);
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.e(bma1Var, dm61.x0(((k560) m560Var).a, setO1));
                    hma1VarEdit.g();
                    break;
                }
                break;
        }
    }
}
