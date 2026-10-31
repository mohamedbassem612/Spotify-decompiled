package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zd90 extends x7e0 implements b031 {
    public final yqg d;
    public final okc0 e;
    public yd90 f;
    public llm g;

    public zd90(yqg yqgVar, okc0 okc0Var) {
        this.d = yqgVar;
        this.e = okc0Var;
    }

    public final void a(Bundle bundle) {
        String string = bundle.getString("invite_options_link_session_id");
        if (string != null) {
            this.f = new yd90(string, bundle.getLong("invite_options_link_session_valid_until"));
        }
    }

    public final void e() {
        j();
        yd90 yd90Var = this.f;
        if (yd90Var != null && yd90Var.b > this.d.b()) {
            i();
            return;
        }
        llm llmVarE = smo1.e(op71.f());
        fn31.T(llmVarE, (o8n) null, 0, new x060(this, null, (byte) 27), 3);
        this.g = llmVarE;
    }

    public final void f() {
        llm llmVar = this.g;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.g = null;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        yd90 yd90Var = this.f;
        if (yd90Var != null) {
            bundle.putString("invite_options_link_session_id", yd90Var.a);
            bundle.putLong("invite_options_link_session_valid_until", yd90Var.b);
        }
        return bundle;
    }
}
