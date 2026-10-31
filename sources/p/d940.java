package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d940 implements vu30 {
    public final /* synthetic */ byte a;
    public final jt2 b;

    public /* synthetic */ d940(jt2 jt2Var, byte b) {
        this.a = b;
        this.b = jt2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(i0h0 i0h0Var, lnm lnmVar) {
        uzb1 uzb1Var;
        if (lnmVar instanceof uzb1) {
            uzb1Var = (uzb1) lnmVar;
            int i = uzb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzb1Var.c = i - Integer.MIN_VALUE;
            } else {
                uzb1Var = new uzb1(this, lnmVar);
            }
        } else {
            uzb1Var = new uzb1(this, lnmVar);
        }
        Object obj = uzb1Var.a;
        int i2 = uzb1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            String str = i0h0Var.a;
            uzb1Var.c = 1;
            Object objF = this.b.f(str, uzb1Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        jt2 jt2Var = this.b;
        switch (b) {
            case 0:
                return jt2Var.e((e0h0) obj, (lnm) obj2);
            case 1:
                return jt2Var.b(((qzg0) obj).a, (lnm) obj2);
            case 2:
                return jt2Var.d((d0h0) obj, (lnm) obj2);
            default:
                return a((i0h0) obj, (lnm) obj2);
        }
    }
}
