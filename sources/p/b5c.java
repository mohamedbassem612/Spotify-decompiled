package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b5c implements fjo {
    public final /* synthetic */ c5c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public b5c(c5c c5cVar, String str, String str2) {
        this.a = c5cVar;
        this.b = str;
        this.c = str2;
    }

    public final djo a(String str, lik1 lik1Var) {
        m0p m0pVar = (m0p) this.a.b;
        byte b = m0pVar.a;
        String str2 = this.b;
        String str3 = this.c;
        switch (b) {
            case 0:
                x0p x0pVar = (x0p) m0pVar.b.c;
                iyc0 iyc0Var = (iyc0) x0pVar.b.R.get();
                c8o.l(iyc0Var);
                ijr ijrVar = (ijr) x0pVar.b.S.get();
                c8o.l(ijrVar);
                u0p u0pVar = (u0p) x0pVar.z.get();
                q8n q8nVar = (q8n) x0pVar.b.b.get();
                c8o.l(q8nVar);
                return new d5c(iyc0Var, ijrVar, u0pVar, q8nVar, str2, str3, lik1Var);
            case 1:
                yxo yxoVar = (yxo) m0pVar.b.c;
                iyc0 iyc0Var2 = (iyc0) ((ae7) yxoVar.d).J.get();
                c8o.l(iyc0Var2);
                ijr ijrVar2 = (ijr) ((ae7) yxoVar.d).K.get();
                c8o.l(ijrVar2);
                u0p u0pVar2 = (u0p) yxoVar.f.get();
                q8n q8nVar2 = (q8n) ((ae7) yxoVar.d).c.get();
                c8o.l(q8nVar2);
                return new d5c(iyc0Var2, ijrVar2, u0pVar2, q8nVar2, str2, str3, lik1Var);
            default:
                voa voaVar = (voa) m0pVar.b.c;
                iyc0 iyc0Var3 = (iyc0) ((oe7) voaVar.b).J.get();
                c8o.l(iyc0Var3);
                ijr ijrVar3 = (ijr) ((oe7) voaVar.b).K.get();
                c8o.l(ijrVar3);
                u0p u0pVar3 = (u0p) ((jly0) voaVar.e).get();
                q8n q8nVar3 = (q8n) ((oe7) voaVar.b).c.get();
                c8o.l(q8nVar3);
                return new d5c(iyc0Var3, ijrVar3, u0pVar3, q8nVar3, str2, str3, lik1Var);
        }
    }
}
