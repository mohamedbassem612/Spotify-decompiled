package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c0f1 implements yze1 {
    public final e0f1 a;
    public final zle1 b;
    public final bb4 c;
    public final q8n d;

    public c0f1(e0f1 e0f1Var, zle1 zle1Var, bb4 bb4Var, q8n q8nVar) {
        this.a = e0f1Var;
        this.b = zle1Var;
        this.c = bb4Var;
        this.d = q8nVar;
    }

    @Override // p.yze1
    public final Single a(String str) {
        return d(rqt0.F(this.d, new b0f1(this, (lnm) null, (byte) 0)).flatMap(new hdn1(str, (byte) 10)).onErrorReturn(jcx0.S0), "tokenForWebAuthTransfer");
    }

    @Override // p.yze1
    public final Single b(String str) {
        return d(rqt0.F(this.d, new b0f1(this, (lnm) null, (byte) 0)).flatMap(new mcn1(str, (byte) 11)).onErrorReturn(ybx0.S0), "sessionTransferTokenForWebAuthTransfer");
    }

    @Override // p.yze1
    public final Single c() {
        return d(rqt0.F(this.d, new b0f1(this, (lnm) null, (byte) 0)).flatMap(hcx0.S0).onErrorReturn(icx0.R0), "tokenForBuiltInAuthorization");
    }

    public final Single d(Single single, String str) {
        if (!this.c.a()) {
            return single;
        }
        t45 t45VarA = this.b.a("token_exchanger");
        t45VarA.h = "android-authentication-tokenexchangeimpl";
        return single.doOnSubscribe(new z0u0(t45VarA, str, (byte) 24)).doOnSuccess(new zna1(t45VarA, (byte) 1)).doOnError(new zna1(t45VarA, (byte) 2)).doOnTerminate(new wf0(t45VarA, str, this, (byte) 23));
    }
}
