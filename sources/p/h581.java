package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h581 extends ov61 {
    public final b581 a;
    public final zo51 b;

    public h581(b581 b581Var) {
        this.a = b581Var;
        this.b = new zo51(((e581) b581Var).d, this, (byte) 19);
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
        f581 f581Var;
        if (lnmVar instanceof f581) {
            f581Var = (f581) lnmVar;
            int i = f581Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f581Var.d = i - Integer.MIN_VALUE;
            } else {
                f581Var = new f581(this, (onm) lnmVar);
            }
        } else {
            f581Var = new f581(this, (onm) lnmVar);
        }
        Object objB = f581Var.b;
        int i2 = f581Var.d;
        if (i2 == 0) {
            hm5.M(objB);
            f581Var.a = this;
            f581Var.d = 1;
            objB = ((e581) this.a).c.b(z, f581Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = f581Var.a;
            hm5.M(objB);
        }
        this.getClass();
        return a((n331) objB);
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), tv80Var, lnmVar);
    }
}
