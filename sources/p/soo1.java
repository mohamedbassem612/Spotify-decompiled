package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class soo1 extends vmo1 {
    public final ArrayList m;

    public soo1(pwn1 pwn1Var, ArrayList arrayList) {
        super(pwn1Var);
        this.m = arrayList;
    }

    @Override // p.wan1
    public final void c1(kko1 kko1Var) {
        int i = kko1Var.a;
        i1(new kyn1(zko1.q(i), kko1Var.b));
        if (i != 0) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((FutureTask) it.next()).cancel(true);
            }
        }
    }
}
