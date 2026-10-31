package p;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hun0 implements c7r0 {
    public final cun0 a;
    public u9c0 b;
    public boolean c;

    public hun0(cun0 cun0Var) {
        this.a = cun0Var;
    }

    @Override // p.c7r0
    public final void a(upn1 upn1Var) {
        u9c0 u9c0Var;
        iac0 iac0VarH;
        if (this.c) {
            return;
        }
        u9c0 u9c0VarQ = null;
        if (upn1Var instanceof l7r0) {
            View view = ((l7r0) upn1Var).c;
            if (view != null && (iac0VarH = x9p1.h(view)) != null) {
                u9c0VarQ = cto1.q(iac0VarH);
            }
            this.b = u9c0VarQ;
            return;
        }
        if (upn1Var instanceof h7r0) {
            if (!((h7r0) upn1Var).c || (u9c0Var = this.b) == null) {
                return;
            }
            c921.y(u9c0Var, (o8n) null, 0, new uug0(this, (lnm) null, (byte) 22), 3);
            return;
        }
        if (upn1Var instanceof n7r0) {
            this.b = null;
            this.c = true;
        }
    }

    @Override // p.c7r0
    public final void b(Bundle bundle) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("FINISHED_SAVED_STATE")) {
            z = true;
        }
        this.c = z;
    }

    @Override // p.c7r0
    public final Bundle d() {
        return mno1.h(new mmr0[]{oqn1.n("FINISHED_SAVED_STATE", Boolean.valueOf(this.c))});
    }
}
