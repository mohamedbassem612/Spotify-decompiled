package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fp91 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ip91 c;

    public /* synthetic */ fp91(byte b, String str, ip91 ip91Var) {
        this.a = b;
        this.b = str;
        this.c = ip91Var;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                vo91 vo91Var = new vo91(new zo91(this.b, this.c.a.b()));
                boolean zA = this.c.o.a();
                ip91 ip91Var = this.c;
                if (zA) {
                    ip91Var.o.onNext(vo91Var);
                    this.c.l.onNext(rih1.a);
                    return;
                } else {
                    synchronized (ip91Var.m) {
                        ip91Var.n.add(vo91Var);
                    }
                    return;
                }
            default:
                xo91 xo91Var = new xo91(this.b);
                boolean zA2 = this.c.o.a();
                ip91 ip91Var2 = this.c;
                if (zA2) {
                    ip91Var2.o.onNext(xo91Var);
                    return;
                }
                synchronized (ip91Var2.m) {
                    ip91Var2.n.add(xo91Var);
                }
                return;
        }
    }
}
