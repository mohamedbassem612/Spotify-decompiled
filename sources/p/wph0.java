package p;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wph0 {
    public final nxh0 a;
    public final txh0 b;
    public final qyh0 c;
    public final vku d = new vku();
    public final ArrayList e = new ArrayList();

    public wph0(nxh0 nxh0Var, txh0 txh0Var, qyh0 qyh0Var, boolean z) {
        this.a = nxh0Var;
        this.b = txh0Var;
        this.c = qyh0Var;
        txh0Var.e = new an90(this, (byte) 10);
    }

    public final void a(String str, kxh0 kxh0Var, vu30 vu30Var) {
        if (this.b.d == null) {
            this.e.add(new k7h0(this, str, kxh0Var, vu30Var, (byte) 2));
        } else {
            this.c.getClass();
            this.d.a(this.a.a(str, kxh0Var, 2).flatMapCompletable(new j2e0(vu30Var, str, (byte) 22)).o(new eb80(this, kxh0Var, (byte) 25)).subscribe());
        }
    }

    public final s8d0 b(String str, String str2, Bundle bundle) {
        this.c.getClass();
        nxh0 nxh0Var = this.a;
        return czo1.n(nxh0Var.b(2, str, str2).k(nxh0Var.c(2, str, str2)).flatMap(new w6e0(this, str, str2, bundle, (byte) 18)).onErrorReturn(new fad0(this, str2, (byte) 25)));
    }
}
