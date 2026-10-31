package p;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kh30 implements aac0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ oi30 b;
    public final /* synthetic */ x8c0 c;
    public final /* synthetic */ th30 d;

    public kh30(th30 th30Var, String str, oi30 oi30Var, x8c0 x8c0Var) {
        this.d = th30Var;
        this.a = str;
        this.b = oi30Var;
        this.c = x8c0Var;
    }

    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        Bundle bundle;
        th30 th30Var = this.d;
        Map map = th30Var.m;
        k8c0 k8c0Var2 = k8c0.ON_START;
        String str = this.a;
        if (k8c0Var == k8c0Var2 && (bundle = (Bundle) map.get(str)) != null) {
            this.b.q(bundle, str);
            map.remove(str);
            th30.P(2);
        }
        if (k8c0Var == k8c0.ON_DESTROY) {
            this.c.d(this);
            th30Var.n.remove(str);
        }
    }
}
