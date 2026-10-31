package p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qp80 implements u601 {
    public final /* synthetic */ rp80 a;

    public qp80(rp80 rp80Var) {
        this.a = rp80Var;
    }

    public final mr20 a() {
        return new m441(new x060(this.a, (lnm) null, (byte) 21));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(vu30 vu30Var, lnm lnmVar) {
        pp80 pp80Var;
        if (lnmVar instanceof pp80) {
            pp80Var = (pp80) lnmVar;
            int i = pp80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pp80Var.c = i - Integer.MIN_VALUE;
            } else {
                pp80Var = new pp80(this, lnmVar);
            }
        } else {
            pp80Var = new pp80(this, lnmVar);
        }
        Object obj = pp80Var.a;
        d9n d9nVar = d9n.a;
        int i2 = pp80Var.c;
        rp80 rp80Var = this.a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                throw new KotlinNothingValueException();
            }
            hm5.M(obj);
            int i3 = rp80Var.e + 1;
            rp80Var.e = i3;
            if (i3 == 1) {
                rp80Var.e();
            }
            ien0 ien0Var = rp80Var.d;
            pp80Var.c = 1;
            ien0Var.b(vu30Var, pp80Var);
            return d9nVar;
        } catch (Throwable th) {
            rp80Var.c();
            throw th;
        }
    }

    public final Object getValue() {
        rp80 rp80Var = this.a;
        u601 u601Var = rp80Var.c;
        return u601Var == null ? (op80) rp80Var.d.a.getValue() : rp80Var.a((op80) u601Var.getValue());
    }
}
