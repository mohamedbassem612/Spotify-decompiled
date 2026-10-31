package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zou0 extends x7e0 implements b031 {
    public xab1 X;
    public k331 Y = b331.a;
    public final rwz0 d;
    public final bqr0 e;
    public final acr f;
    public final q8n g;
    public final nzu0 h;
    public final jzu0 i;
    public final n5u0 t;

    public zou0(rwz0 rwz0Var, bqr0 bqr0Var, acr acrVar, q8n q8nVar, nzu0 nzu0Var, jzu0 jzu0Var, n5u0 n5u0Var) {
        this.d = rwz0Var;
        this.e = bqr0Var;
        this.f = acrVar;
        this.g = q8nVar;
        this.h = nzu0Var;
        this.i = jzu0Var;
        this.t = n5u0Var;
    }

    public final void a(Bundle bundle) {
        this.t.invoke(bundle);
        acr acrVar = this.f;
        acrVar.getClass();
        fzc0 fzc0Var = (fzc0) bundle.getParcelable("key_deep_linking_provider_parameters");
        if (fzc0Var != null) {
            acrVar.a = fzc0Var;
        }
        bqr0 bqr0Var = this.e;
        bqr0Var.getClass();
        fzc0 fzc0Var2 = (fzc0) bundle.getParcelable("key_parameters_holder_parameters");
        if (fzc0Var2 != null) {
            bqr0Var.a = fzc0Var2;
        }
        rwz0 rwz0Var = this.d;
        rwz0Var.getClass();
        rwz0Var.e = bundle.getLong(rwz0.class.getName(), 0L);
    }

    public final void e() {
        j();
        xab1 xab1Var = this.X;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.X = fn31.T(smo1.e(this.g), (o8n) null, 0, new elu0(this, null), 3);
    }

    public final void f() {
        xab1 xab1Var = this.X;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putAll((Bundle) this.i.invoke());
        acr acrVar = this.f;
        acrVar.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("key_deep_linking_provider_parameters", acrVar.a);
        bundle.putAll(bundle2);
        bqr0 bqr0Var = this.e;
        bqr0Var.getClass();
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("key_parameters_holder_parameters", bqr0Var.a);
        bundle.putAll(bundle3);
        bundle.putLong(rwz0.class.getName(), this.d.e);
        return bundle;
    }
}
