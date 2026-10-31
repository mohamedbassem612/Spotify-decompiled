package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mp00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ koe1 b;
    public final /* synthetic */ np00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp00(koe1 koe1Var, np00 np00Var, byte b) {
        super(1);
        this.a = b;
        this.b = koe1Var;
        this.c = np00Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b.a;
                np00 np00Var = this.c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sbu0 sbu0Var = (sbu0) np00Var.c.remove((String) it.next());
                    if (sbu0Var != null) {
                        synchronized (sbu0Var) {
                            dm5.y(sbu0Var.j);
                            sbu0Var.k = true;
                            sbu0Var.a(false);
                        }
                    }
                }
                return rih1.a;
            default:
                koe1 koe1Var = this.b;
                if (koe1Var != null) {
                    this.c.c(koe1Var);
                }
                return rih1.a;
        }
    }
}
