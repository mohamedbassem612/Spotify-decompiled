package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zxo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ zxo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final bd71 a(vu30 vu30Var) {
        byte b = this.a;
        ipq ipqVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                asn asnVar = (asn) ((jwo) ipqVar).b;
                a1g a1gVar = (a1g) ((ae2) asnVar.a).b.get();
                c8o.l(a1gVar);
                dwr0 dwr0Var = (dwr0) ((ae2) asnVar.a).d.get();
                c8o.l(dwr0Var);
                z710 z710Var = (z710) ((ae2) asnVar.a).e.get();
                c8o.l(z710Var);
                return new bd71(a1gVar, dwr0Var, z710Var, u1n0.z((q7r0) asnVar.b), vu30Var);
            default:
                tjq tjqVar = (tjq) ipqVar.c;
                a1g a1gVar2 = (a1g) ((rk81) tjqVar.b).a.get();
                c8o.l(a1gVar2);
                dwr0 dwr0Var2 = (dwr0) ((rk81) tjqVar.b).b.get();
                c8o.l(dwr0Var2);
                z710 z710Var2 = (z710) ((rk81) tjqVar.b).d.get();
                c8o.l(z710Var2);
                return new bd71(a1gVar2, dwr0Var2, z710Var2, (i8h1) ((jly0) tjqVar.a).get(), vu30Var);
        }
    }
}
