package p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pus implements aac0 {
    public final ynb0 a;
    public mus b;
    public final idd1 c = new idd1(new ots(this, (byte) 1));
    public final rku d = new rku();

    public pus(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final nus a() {
        return (nus) this.c.getValue();
    }

    public final void b(int i, String str) {
        SingleSubject singleSubject = (SingleSubject) a().d.a.remove(str);
        if (singleSubject != null) {
            singleSubject.onSuccess(new q981(i));
        }
        qus qusVar = a().b;
        qusVar.b.onNext(new ezi0("TOOLTIP_HANDLER_ID"));
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        int i = ous.a[k8c0Var.ordinal()];
        rku rkuVar = this.d;
        if (i == 1) {
            rkuVar.b(a().b.a.observeOn(a().c).subscribe((Consumer) new cfs(this, (byte) 7)));
            return;
        }
        if (i != 2) {
            return;
        }
        ((zus) a().e).d();
        rkuVar.a();
        qus qusVar = a().b;
        qusVar.b.onNext(new ezi0("TOOLTIP_HANDLER_ID"));
    }
}
