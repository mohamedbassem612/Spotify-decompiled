package p;

import android.os.Bundle;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qim1 implements y8l1 {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;
    public kj41 e;
    public llm f;
    public pim1 g;
    public pim1 h;
    public dl3 i;

    public qim1(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = ynb0Var4;
    }

    public final void a() {
        bcm1 bcm1Var = (bcm1) this.c.get();
        g2q0 g2q0Var = (g2q0) bcm1Var.c.b.getValue();
        if (g2q0Var != null) {
            String str = g2q0Var.b;
            qpj1 qpj1Var = bcm1Var.b;
            bcm1Var.a.a(str, bcl1.f((bcl1) qpj1Var.c, qpj1Var.p(), g2q0Var.a, (String) null, (String) null, new bek1(str, (byte) 16), 12), (Bundle) null);
        }
    }

    public final void onCreate() {
        this.e = hhp0.a.u("wrapped_full_experience");
        llm llmVar = this.f;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
        this.f = llmVarE;
        fn31.T(llmVarE, (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 26), 3);
        ahm1 ahm1Var = (ahm1) this.a.get();
        ahm1Var.g.getAndUpdate(new zgm1(ahm1Var));
        pim1 pim1Var = this.g;
        if (pim1Var != null) {
            pim1Var.invoke();
        }
    }

    public final void onDestroy() {
        llm llmVar = this.f;
        if (llmVar != null) {
            smo1.p(llmVar, (CancellationException) null);
        }
        this.f = null;
        pim1 pim1Var = this.h;
        if (pim1Var != null) {
            pim1Var.invoke();
        }
        dl3 dl3Var = this.i;
        if (dl3Var != null) {
            dl3Var.invoke();
        }
        g4k g4kVar = (g4k) this.b.get();
        if (!g4kVar.c.getAndSet(true)) {
            fn31.T(g4kVar.b, (o8n) null, 0, new bag(g4kVar, null, (byte) 23), 3);
        }
        ahm1 ahm1Var = (ahm1) this.a.get();
        ahm1Var.g.getAndUpdate(new v87(ahm1Var, (byte) 6));
        kj41 kj41Var = this.e;
        if (kj41Var != null) {
            kj41Var.stop();
        }
        this.e = null;
    }
}
