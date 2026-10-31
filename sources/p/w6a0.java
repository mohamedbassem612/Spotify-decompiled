package p;

import android.app.Activity;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w6a0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z6a0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6a0(z6a0 z6a0Var, byte b) {
        super(0);
        this.a = b;
        this.b = z6a0Var;
    }

    public final Object invoke() {
        boolean z;
        switch (this.a) {
            case 0:
                z6a0 z6a0Var = this.b;
                return z6a0Var.b(z6a0Var.c());
            case 1:
                z6a0 z6a0Var2 = this.b;
                return z6a0Var2.b(z6a0Var2.c());
            case 2:
                z6a0 z6a0Var3 = this.b;
                synchronized (z6a0Var3.d) {
                    z = z6a0Var3.i;
                }
                if (z) {
                    Iterator it = z6a0Var3.f.iterator();
                    while (it.hasNext()) {
                        z6a0Var3.f((Activity) it.next());
                    }
                } else {
                    Iterator it2 = z6a0Var3.e.keySet().iterator();
                    while (it2.hasNext()) {
                        b95 b95Var = (b95) z6a0Var3.e.get((Activity) it2.next());
                        if (b95Var != null) {
                            e7a0 e7a0Var = b95Var.a;
                            if (e7a0Var.c) {
                                g7a0 g7a0Var = e7a0Var.b;
                                g7a0Var.e.getDecorView().post(new s38(false, g7a0Var));
                                e7a0Var.c = false;
                            }
                        }
                    }
                    z6a0Var3.d(new w6a0(z6a0Var3, (byte) 3));
                }
                return rih1.a;
            default:
                z6a0 z6a0Var4 = this.b;
                if (z6a0Var4.i) {
                    return null;
                }
                return z6a0Var4.b(z6a0Var4.c());
        }
    }
}
