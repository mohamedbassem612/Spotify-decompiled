package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fjk0 implements anc0 {
    public final /* synthetic */ byte a = 2;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;

    public fjk0(String str, iyc0 iyc0Var, d0r d0rVar, q8n q8nVar, vp4 vp4Var) {
        this.e = str;
        this.d = iyc0Var;
        this.c = q8nVar;
        this.b = vp4Var;
        o3r o3rVarO = w3p1.o(new l4r(pwc0.a, 1, gkz0.U0, new j4r(gkz0.Q0), gkz0.V0), gkz0.R0);
        o3r o3rVarO2 = w3p1.o(new l4r(pwc0.b, 1, gkz0.W0, new j4r(gkz0.S0), gkz0.X0), gkz0.T0);
        this.f = new cly0(d3p1.F(d0rVar, o3rVarO, str), (byte) 1);
        this.g = new cly0(d3p1.F(d0rVar, o3rVarO2, str), (byte) 2);
    }

    @Override // p.anc0
    public final void a() {
        switch (this.a) {
            case 0:
                xab1 xab1Var = (xab1) this.h;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            case 1:
                llm llmVar = (llm) this.g;
                if (llmVar != null) {
                    smo1.p(llmVar, (CancellationException) null);
                }
                this.g = null;
                break;
            case 2:
                xab1 xab1Var2 = (xab1) this.h;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                break;
            default:
                xab1 xab1Var3 = (xab1) this.h;
                if (xab1Var3 != null) {
                    xab1Var3.d((CancellationException) null);
                }
                break;
        }
    }

    @Override // p.anc0
    public final void b() {
        byte b = this.a;
        Object obj = this.c;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                xab1 xab1Var = (xab1) this.h;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.h = fn31.T(smo1.e((q8n) obj), (o8n) null, 0, new bu(this, (lnm) null, (byte) 25), 3);
                break;
            case 1:
                llm llmVar = (llm) this.g;
                if (llmVar != null) {
                    smo1.p(llmVar, (CancellationException) null);
                }
                llm llmVarK = i3a.k((q8n) obj);
                this.g = llmVarK;
                fn31.T(llmVarK, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 17), 3);
                break;
            case 2:
                xab1 xab1Var2 = (xab1) this.h;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                this.h = fn31.T(smo1.e((q8n) obj), (o8n) null, 0, new pew0(this, lnmVar, (byte) 29), 3);
                break;
            default:
                xab1 xab1Var3 = (xab1) this.h;
                if (xab1Var3 != null) {
                    xab1Var3.d((CancellationException) null);
                }
                this.h = fn31.T((u9c0) this.d, (o8n) null, 0, new i7u0(this, (lnm) null, (byte) 18), 3);
                break;
        }
    }

    public fjk0(koc0 koc0Var, kt91 kt91Var, q8n q8nVar, bpb1 bpb1Var, q8n q8nVar2) {
        this.b = koc0Var;
        this.d = kt91Var;
        this.c = q8nVar;
        this.e = bpb1Var;
        this.f = q8nVar2;
    }

    public fjk0(d0r d0rVar, z6k0 z6k0Var, String str, koc0 koc0Var, mnk0 mnk0Var, q8n q8nVar) {
        this.d = d0rVar;
        this.e = str;
        this.b = koc0Var;
        this.f = mnk0Var;
        this.c = q8nVar;
        this.g = new p1e0(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, uak0.X0, new j4r(uak0.V0), uak0.Y0), uak0.W0), str), (byte) 21);
    }

    public fjk0(String str, u9c0 u9c0Var, y4m1 y4m1Var, uqv0 uqv0Var, qpj1 qpj1Var, koc0 koc0Var) {
        this.e = str;
        this.d = u9c0Var;
        this.f = y4m1Var;
        this.c = uqv0Var;
        this.g = qpj1Var;
        this.b = koc0Var;
    }
}
