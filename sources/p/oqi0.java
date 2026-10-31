package p;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oqi0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oqi0(pqi0 pqi0Var, byte b) {
        super(0);
        this.a = b;
        this.b = pqi0Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                pqi0 pqi0Var = this.b;
                pqi0Var.c(pqi0Var.d.q());
                return rih1.a;
            case 1:
                pqi0 pqi0Var2 = this.b;
                pqi0Var2.c(pqi0Var2.d.r());
                return rih1.a;
            case 2:
                pqi0 pqi0Var3 = this.b;
                dxy dxyVar = pqi0Var3.f;
                String str = pqi0Var3.b.i;
                synchronized (dxyVar) {
                    if (((AtomicBoolean) dxyVar.g).compareAndSet(false, true)) {
                        tv80 tv80VarQ = ((kqi0) dxyVar.e).q();
                        fn31.T((u9c0) dxyVar.f, (o8n) null, 0, new d7i0((tji0) dxyVar.c, ((sqi0) dxyVar.b).a, (lnm) null, (byte) 2), 3);
                        ((lzn0) dxyVar.d).e();
                        if (str != null) {
                            ((lzn0) dxyVar.d).f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(tv80VarQ)));
                        }
                        break;
                    }
                }
                return rih1.a;
            case 3:
                pqi0 pqi0Var4 = this.b;
                pqi0Var4.c(pqi0Var4.d.r());
                return rih1.a;
            default:
                pqi0 pqi0Var5 = this.b;
                kqi0 kqi0Var = pqi0Var5.d;
                i8h1 i8h1Var = (i8h1) kqi0Var.b;
                m1m0 m1m0Var = (m1m0) ((idd1) kqi0Var.c).getValue();
                m1m0Var.getClass();
                x6h1 x6h1VarC = m1m0Var.a.c();
                x6h1VarC.i.add(new a7h1("scrim", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                pqi0Var5.c(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null));
                return rih1.a;
        }
    }
}
