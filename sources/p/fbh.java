package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fbh implements anc0, mqb1 {
    public final wen0 a;
    public final vxe1 b;
    public final q8n c;
    public llm d;
    public final bpb1 e;
    public final int f;
    public final mr20 g;

    public fbh(mr20 mr20Var, wen0 wen0Var, mr20 mr20Var2, vxe1 vxe1Var, q8n q8nVar) {
        this.a = wen0Var;
        this.b = vxe1Var;
        this.c = q8nVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.e = bpb1VarB;
        uwr uwrVar = cbx.a;
        this.f = z4p1.G(((yex) zex.a.d).e);
        this.g = rqt0.u(new m441(new hff((Object) rqt0.u(h5p1.s(bpb1VarB, new m441(new tya(mr20Var, (lnm) null, (byte) 2)), new nwd(mr20Var2, (byte) 14), new w63(this, (lnm) null, (byte) 4))), (lnm) null, (Object) this, (byte) 6)));
    }

    public final void a() {
        llm llmVar = this.d;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.d = null;
    }

    public final void b() {
        llm llmVar = this.d;
        lnm lnmVar = null;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        llm llmVarE = smo1.e(this.c);
        fn31.T(llmVarE, (o8n) null, 0, new awe(this, lnmVar, (byte) 9), 3);
        this.d = llmVarE;
    }

    public final void e(Bundle bundle) {
        ymc0 ymc0Var = bundle != null ? (ymc0) jhc1.t(bundle, "list_colors", ymc0.class) : null;
        this.e.l(ymc0Var != null ? Integer.valueOf(ymc0Var.a) : null);
        this.a.l(ymc0Var);
    }

    public final void f(Bundle bundle) {
        ymc0 ymc0Var = (ymc0) this.a.getValue();
        if (ymc0Var == null) {
            return;
        }
        bundle.putParcelable("list_colors", ymc0Var);
    }
}
