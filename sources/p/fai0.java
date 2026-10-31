package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class fai0 extends kdn0 {
    public final r441 Y;

    public fai0(Object obj) {
        super(obj);
        this.Y = new r441();
    }

    @Override // p.ymd0
    public void h() {
        Iterator it = this.Y.iterator();
        while (true) {
            n441 n441Var = (n441) it;
            if (!n441Var.hasNext()) {
                return;
            } else {
                ((eai0) ((Map.Entry) n441Var.next()).getValue()).a();
            }
        }
    }

    @Override // p.ymd0
    public void i() {
        Iterator it = this.Y.iterator();
        while (true) {
            n441 n441Var = (n441) it;
            if (!n441Var.hasNext()) {
                return;
            }
            eai0 eai0Var = (eai0) ((Map.Entry) n441Var.next()).getValue();
            eai0Var.a.k(eai0Var);
        }
    }

    public void n(ymd0 ymd0Var, rjp0 rjp0Var) {
        if (ymd0Var == null) {
            bhn0.i("source cannot be null");
            return;
        }
        eai0 eai0Var = new eai0(ymd0Var, rjp0Var);
        eai0 eai0Var2 = (eai0) this.Y.b(ymd0Var, eai0Var);
        if (eai0Var2 != null && eai0Var2.b != rjp0Var) {
            hhg1.n("This source was already added with the different observer");
        } else if (eai0Var2 == null && this.c > 0) {
            eai0Var.a();
        }
    }

    public fai0() {
        this.Y = new r441();
    }
}
