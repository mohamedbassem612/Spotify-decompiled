package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s8r0 implements kvn0 {
    public final mwn0 a;
    public final iwr b;
    public final lzn0 c;

    public s8r0(mwn0 mwn0Var, iwr iwrVar, lzn0 lzn0Var) {
        this.a = mwn0Var;
        this.b = iwrVar;
        this.c = lzn0Var;
    }

    public final void a(String str, tv80 tv80Var, Bundle bundle) {
        lsn0 lsn0Var = tv80Var != null ? new lsn0(str, tv80Var.a) : jsn0.a;
        mwn0 mwn0Var = this.a;
        mwn0Var.e(lsn0Var);
        mwn0Var.f(lsn0Var);
        m8d1 m8d1Var = (m8d1) this.b.invoke();
        if (m8d1Var != null) {
            p9m p9mVar = smg1.b;
            n8d1 n8d1Var = m8d1Var.a;
            if (str.equals(n8d1Var.b.getValue())) {
                return;
            }
            n8d1Var.c = p9mVar;
            n8d1Var.a.setValue(str);
        }
    }

    public final void h(String str) {
        this.c.e();
    }
}
