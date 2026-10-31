package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p8c extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wen0 b;
    public final /* synthetic */ c380 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8c(wen0 wen0Var, c380 c380Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = wen0Var;
        this.c = c380Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new p8c(this.b, this.c, lnmVar, (byte) 0);
            default:
                return new p8c(this.b, this.c, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c380<knt> c380Var = this.c;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (knt kntVar : c380Var) {
                    arrayList.add(new h8k1(kntVar, kntVar));
                }
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, arrayList);
                break;
            default:
                hm5.M(obj);
                bpb1Var.l(c380Var);
                break;
        }
        return rih1Var;
    }
}
