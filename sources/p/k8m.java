package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k8m extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n8m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8m(n8m n8mVar, byte b) {
        super(0);
        this.a = b;
        this.b = n8mVar;
    }

    public final Object invoke() {
        byte b = this.a;
        n8m n8mVar = this.b;
        switch (b) {
            case 0:
                return (g9m) n8mVar.c.get();
            case 1:
                yup yupVar = n8mVar.a;
                rzq rzqVar = n8mVar.g;
                switch (yupVar.a) {
                    case 0:
                        nwp nwpVar = (nwp) ((gbp) yupVar.b).c;
                        zup zupVar = (zup) nwpVar.l0.get();
                        lzn0 lzn0Var = (lzn0) nwpVar.G.get();
                        em0 em0Var = nwpVar.a;
                        oj3 oj3VarK = em0Var.k();
                        c8o.l(oj3VarK);
                        aa3 aa3Var = new aa3((byte) 5);
                        oj3 oj3VarK2 = em0Var.k();
                        c8o.l(oj3VarK2);
                        return new jf31(zupVar, lzn0Var, oj3VarK, aa3Var, wg0.r(new ycc1(oj3VarK2, (rzo) nwpVar.m0.get(), (byte) 14)), rzqVar);
                    default:
                        v5q v5qVar = (v5q) ((thq) yupVar.b).c;
                        return new jf31((zup) v5qVar.X6.get(), (lzn0) v5qVar.U0.get(), (oj3) v5qVar.p5.get(), new aa3((byte) 5), (wh1) v5qVar.Z6.get(), rzqVar);
                }
            default:
                return (pz71) n8mVar.b.get();
        }
    }
}
