package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g981 extends ov61 {
    public final a981 a;
    public final zo51 b;

    public g981(a981 a981Var) {
        this.a = a981Var;
        this.b = new zo51(((d981) a981Var).d, this, (byte) 20);
    }

    public static jt61 a(n331 n331Var) {
        if (n331Var instanceof n231) {
            return new ht61((Integer) null, 0);
        }
        if (n331Var instanceof x231) {
            return new it61(Boolean.valueOf(((x231) n331Var).a));
        }
        eg.o();
        return null;
    }

    public final mr20 getValue() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, tv80 tv80Var, lnm lnmVar) {
        e981 e981Var;
        if (lnmVar instanceof e981) {
            e981Var = (e981) lnmVar;
            int i = e981Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e981Var.d = i - Integer.MIN_VALUE;
            } else {
                e981Var = new e981(this, (onm) lnmVar);
            }
        } else {
            e981Var = new e981(this, (onm) lnmVar);
        }
        Object objB = e981Var.b;
        int i2 = e981Var.d;
        if (i2 == 0) {
            hm5.M(objB);
            e981Var.a = this;
            e981Var.d = 1;
            objB = ((d981) this.a).c.b(z, e981Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = e981Var.a;
            hm5.M(objB);
        }
        this.getClass();
        return a((n331) objB);
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), tv80Var, lnmVar);
    }
}
