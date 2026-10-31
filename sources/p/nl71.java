package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nl71 implements il71 {
    public final /* synthetic */ nif1 a;

    public nl71(nif1 nif1Var) {
        this.a = nif1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.il71
    public final Object a(String str, vu30 vu30Var, lnm lnmVar) {
        ml71 ml71Var;
        if (lnmVar instanceof ml71) {
            ml71Var = (ml71) lnmVar;
            int i = ml71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ml71Var.d = i - Integer.MIN_VALUE;
            } else {
                ml71Var = new ml71(this, lnmVar);
            }
        } else {
            ml71Var = new ml71(this, lnmVar);
        }
        Object objInvoke = ml71Var.b;
        int i2 = ml71Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                this = this.a.c((Long) null, str);
                jl71 jl71Var = new jl71();
                ml71Var.a = this;
                ml71Var.d = 1;
                objInvoke = vu30Var.invoke(jl71Var, ml71Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = ml71Var.a;
                hm5.M(objInvoke);
            }
            this.a((Long) null);
            return objInvoke;
        } catch (Throwable th) {
            this.a((Long) null);
            throw th;
        }
    }

    @Override // p.il71
    public final void setAttribute(String str, String str2) {
        this.a.setAttribute(str, str2);
    }
}
