package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jii1 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kii1 b;

    public /* synthetic */ jii1(kii1 kii1Var, byte b) {
        this.a = b;
        this.b = kii1Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        kii1 kii1Var = this.b;
        switch (b) {
            case 0:
                rqe1 rqe1Var = (rqe1) obj;
                iii1 iii1Var = kii1Var.I1;
                if (iii1Var == null) {
                    u890.C("timelineDomainLogger");
                    throw null;
                }
                rqe1Var.getClass();
                iii1Var.a(rqe1Var);
                return;
            default:
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    kii1Var.Y0((xue1) it.next());
                }
                return;
        }
    }
}
