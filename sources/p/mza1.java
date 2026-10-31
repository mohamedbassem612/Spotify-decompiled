package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mza1 implements o5s {
    public final /* synthetic */ iac0 a;
    public final /* synthetic */ qza1 b;

    public mza1(iac0 iac0Var, qza1 qza1Var) {
        this.a = iac0Var;
        this.b = qza1Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        Object value;
        qza1 qza1Var = this.b;
        n0b1 n0b1Var = qza1Var.g;
        p0b1 p0b1Var = n0b1Var.a;
        String str = n0b1Var.b;
        bpb1 bpb1Var = p0b1Var.a;
        do {
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, sqg0.K(str, (Map) value)));
        lza1.a.remove(qza1Var.a);
    }

    public final void onStart(iac0 iac0Var) {
        fn31.T(cto1.q(this.a), (o8n) null, 0, new xba1(this.b, (lnm) null, (byte) 4), 3);
    }
}
