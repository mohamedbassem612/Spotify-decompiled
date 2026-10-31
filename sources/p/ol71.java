package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ol71 {
    public final boolean a;
    public kj41 b;

    public ol71(boolean z) {
        hhp0 hhp0Var = hhp0.a;
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Object obj, vu30 vu30Var, onm onmVar) {
        ll71 ll71Var;
        if (onmVar instanceof ll71) {
            ll71Var = (ll71) onmVar;
            int i = ll71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ll71Var.d = i - Integer.MIN_VALUE;
            } else {
                ll71Var = new ll71(this, onmVar);
            }
        } else {
            ll71Var = new ll71(this, onmVar);
        }
        Object obj2 = ll71Var.b;
        int i2 = ll71Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                boolean z = this.a;
                d9n d9nVar = d9n.a;
                if (z) {
                    this = ihp0.l(hhp0.a, str, obj, 4);
                    nl71 nl71Var = new nl71(this);
                    ll71Var.a = this;
                    ll71Var.d = 2;
                    Object objInvoke = vu30Var.invoke(nl71Var, ll71Var);
                    if (objInvoke != d9nVar) {
                        obj2 = objInvoke;
                    }
                } else {
                    ll71Var.d = 1;
                    Object objInvoke2 = vu30Var.invoke(kl71.a, ll71Var);
                    if (objInvoke2 != d9nVar) {
                        return objInvoke2;
                    }
                }
                return d9nVar;
            }
            if (i2 == 1) {
                hm5.M(obj2);
                return obj2;
            }
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = ll71Var.a;
            hm5.M(obj2);
            this.stop();
            return obj2;
        } catch (Throwable th) {
            this.stop();
            throw th;
        }
    }
}
