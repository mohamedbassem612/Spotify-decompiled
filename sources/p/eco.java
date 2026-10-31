package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eco {
    public final llm a;
    public final xgn0 b = ygn0.a();
    public String c;
    public s2t d;

    public eco(llm llmVar) {
        this.a = llmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, i24 i24Var, onm onmVar) {
        dco dcoVar;
        vgn0 vgn0Var;
        if (onmVar instanceof dco) {
            dcoVar = (dco) onmVar;
            int i = dcoVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dcoVar.f = i - Integer.MIN_VALUE;
            } else {
                dcoVar = new dco(this, onmVar);
            }
        } else {
            dcoVar = new dco(this, onmVar);
        }
        Object obj = dcoVar.d;
        int i2 = dcoVar.f;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                dcoVar.a = str;
                dcoVar.b = i24Var;
                vgn0Var = this.b;
                dcoVar.c = vgn0Var;
                dcoVar.f = 1;
                if (vgn0Var.a(dcoVar) != d9nVar) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l2t l2tVar = dcoVar.c;
                hm5.M(obj);
                return obj;
            }
            vgn0 vgn0Var2 = dcoVar.c;
            i24Var = dcoVar.b;
            String str2 = dcoVar.a;
            hm5.M(obj);
            vgn0Var = vgn0Var2;
            str = str2;
            saa0 saa0VarQ = this.d;
            if (saa0VarQ == null || !u890.j(this.c, str)) {
                this.c = str;
                saa0VarQ = fn31.q(this.a, (o8n) null, 0, new w73(i24Var, (lnm) null, (byte) 4), 3);
                this.d = saa0VarQ;
            }
            vgn0Var.c((Object) null);
            dcoVar.a = null;
            dcoVar.b = null;
            dcoVar.c = null;
            dcoVar.f = 2;
            Object objQ = saa0VarQ.Q(dcoVar);
            return objQ == d9nVar ? d9nVar : objQ;
        } catch (Throwable th) {
            vgn0Var.c((Object) null);
            throw th;
        }
    }
}
