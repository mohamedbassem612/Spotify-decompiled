package p;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qd41 implements nd41, qe41 {
    public final /* synthetic */ od41 a;
    public tac0 b;
    public nt21 c;

    public qd41(od41 od41Var) {
        this.a = od41Var;
        Object objF = od41Var.f("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objF instanceof Bundle ? (Bundle) objF : null;
        if (bundle != null && this.c == null) {
            nt21 nt21VarO = obg1.o(this);
            this.c = nt21VarO;
            nt21VarO.n(bundle);
        }
        od41Var.a("androidx.savedstate.SavedStateRegistry", new ww21(this, (byte) 3));
    }

    @Override // p.nd41
    public final md41 a(String str, Function0 function0) {
        return this.a.a(str, function0);
    }

    @Override // p.nd41
    public final boolean d(Object obj) {
        return this.a.d(obj);
    }

    @Override // p.nd41
    public final Map e() {
        return this.a.e();
    }

    @Override // p.nd41
    public final Object f(String str) {
        return this.a.f(str);
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        tac0 tac0Var = this.b;
        if (tac0Var != null) {
            return tac0Var;
        }
        tac0 tac0VarQ = gto1.q(this);
        this.b = tac0VarQ;
        return tac0VarQ;
    }

    @Override // p.qe41
    public final oe41 p() {
        nt21 nt21VarO = this.c;
        if (nt21VarO == null) {
            nt21VarO = obg1.o(this);
            this.c = nt21VarO;
            nt21VarO.n((Bundle) null);
        }
        return nt21VarO.j();
    }
}
