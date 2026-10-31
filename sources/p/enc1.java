package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class enc1 implements at71 {
    public final at71 a;
    public final vu30 b;

    public enc1(at71 at71Var, vu30 vu30Var) {
        this.a = at71Var;
        this.b = vu30Var;
    }

    public final List c() {
        return this.a.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        dnc1 dnc1Var;
        if (lnmVar instanceof dnc1) {
            dnc1Var = (dnc1) lnmVar;
            int i = dnc1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnc1Var.c = i - Integer.MIN_VALUE;
            } else {
                dnc1Var = new dnc1(this, lnmVar);
            }
        } else {
            dnc1Var = new dnc1(this, lnmVar);
        }
        Object obj = dnc1Var.a;
        int i2 = dnc1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            cnc1 cnc1Var = new cnc1(vr20Var, this.b);
            dnc1Var.c = 1;
            Object objCollect = this.a.collect(cnc1Var, dnc1Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        jah.d();
        return null;
    }
}
