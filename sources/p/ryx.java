package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ryx implements w5f1 {
    public final x5f1 a;
    public final e4j0 b;
    public final hrr0 c = v8r.q(null);

    public ryx(x5f1 x5f1Var, e4j0 e4j0Var) {
        this.a = x5f1Var;
        this.b = e4j0Var;
    }

    public final zen0 a() {
        return this.a.c;
    }

    public final void b() {
        this.a.b();
    }

    public final Object c(hfn0 hfn0Var, onm onmVar) {
        return this.a.c(hfn0Var, onmVar);
    }

    public final d3j0 d() {
        Object value = this.c.getValue();
        if (!this.a.isVisible()) {
            value = null;
        }
        return (d3j0) value;
    }

    public final void dismiss() {
        this.c.setValue((Object) null);
        this.a.dismiss();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(b3j0 b3j0Var, hfn0 hfn0Var, onm onmVar) {
        qyx qyxVar;
        d3j0 d3j0Var;
        Boolean bool;
        if (onmVar instanceof qyx) {
            qyxVar = (qyx) onmVar;
            int i = qyxVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qyxVar.e = i - Integer.MIN_VALUE;
            } else {
                qyxVar = new qyx(this, onmVar);
            }
        } else {
            qyxVar = new qyx(this, onmVar);
        }
        Object obj = qyxVar.c;
        int i2 = qyxVar.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            d3j0 d3j0Var2 = new d3j0(b3j0Var, x2j0.a);
            e4j0 e4j0Var = this.b;
            if (e4j0Var == null) {
                d3j0Var = d3j0Var2;
                bool = null;
                if (!u890.j(bool, Boolean.FALSE)) {
                    this.c.setValue(d3j0Var);
                    qyxVar.a = null;
                    qyxVar.b = null;
                    qyxVar.e = 2;
                    if (this.a.c(hfn0Var, qyxVar) == d9nVar) {
                    }
                }
                return rih1Var;
            }
            qyxVar.a = hfn0Var;
            qyxVar.b = d3j0Var2;
            qyxVar.e = 1;
            Object objB = e4j0Var.b(p4j0.a, d3j0Var2, qyxVar);
            if (objB != d9nVar) {
                obj = objB;
                d3j0Var = d3j0Var2;
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d3j0Var = qyxVar.b;
        hfn0Var = qyxVar.a;
        hm5.M(obj);
        bool = (Boolean) obj;
        if (!u890.j(bool, Boolean.FALSE)) {
            this.c.setValue(d3j0Var);
            qyxVar.a = null;
            qyxVar.b = null;
            qyxVar.e = 2;
            if (this.a.c(hfn0Var, qyxVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    public final boolean isVisible() {
        return this.a.isVisible();
    }
}
