package p;

import android.os.Bundle;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x841 implements g50 {
    public final dg30 b;
    public final ccc0 c;
    public final op31 d;
    public final q8n e;
    public final Object g;
    public final /* synthetic */ byte a = 1;
    public final vku f = new vku();

    public x841(dg30 dg30Var, ccc0 ccc0Var, op31 op31Var, q8n q8nVar, q8n q8nVar2) {
        this.b = dg30Var;
        this.c = ccc0Var;
        this.d = op31Var;
        this.e = q8nVar;
        this.g = q8nVar2;
        ((f0i) dg30Var).a.a(new i83(this, (byte) 18));
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        String str3;
        tv80 tv80Var;
        byte b = this.a;
        b3i1 b3i1Var = wyu0.f;
        b3i1 b3i1Var2 = nyu0.e;
        q8n q8nVar = this.e;
        vku vkuVar = this.f;
        switch (b) {
            case 0:
                w1q0Var.invoke(Boolean.TRUE);
                tv80 serializable = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                tv80 tv80Var2 = serializable instanceof tv80 ? serializable : null;
                Set set = s4b1.f;
                if (uic.h(str2, new blc0[]{blc0.g1, blc0.ti, blc0.fh, blc0.u1})) {
                    tv80Var = tv80Var2;
                    str3 = str2;
                    vkuVar.a(j2h1.D(q8nVar, new v841(this, str3, tv80Var, null, (byte) 0)).o(Functions.h).subscribe());
                } else {
                    str3 = str2;
                    tv80Var = tv80Var2;
                    if (uic.k(str3, new b3i1[]{b3i1Var2, b3i1Var})) {
                        vkuVar.a(rqt0.F(q8nVar, new d821(this, str3, (lnm) null, (byte) 26)).subscribe(w841.b, w841.c));
                    }
                }
                fn31.T(cto1.q(this.b), (o8n) null, 0, new v841(this, str3, tv80Var, null, (byte) 1), 3);
                break;
            default:
                w1q0Var.invoke(Boolean.TRUE);
                tv80 serializable2 = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                tv80 tv80Var3 = serializable2 instanceof tv80 ? serializable2 : null;
                Set set2 = s4b1.f;
                if (uic.h(str2, new blc0[]{blc0.g1, blc0.ti, blc0.fh, blc0.u1})) {
                    vkuVar.a(j2h1.D(q8nVar, new n641(this, str2, tv80Var3, (lnm) null, (byte) 3)).o(Functions.h).subscribe());
                } else if (uic.k(str2, new b3i1[]{b3i1Var2, b3i1Var})) {
                    vkuVar.a(rqt0.F((q8n) this.g, new d821(this, str2, (lnm) null, (byte) 29)).subscribe(w841.f, w841.g));
                }
                break;
        }
    }

    public x841(dg30 dg30Var, ldj0 ldj0Var, ccc0 ccc0Var, op31 op31Var, q8n q8nVar) {
        this.b = dg30Var;
        this.g = ldj0Var;
        this.c = ccc0Var;
        this.d = op31Var;
        this.e = q8nVar;
        ((f0i) dg30Var).a.a(new i83(this, (byte) 17));
    }
}
