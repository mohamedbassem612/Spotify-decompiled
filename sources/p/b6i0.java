package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b6i0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n6i0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6i0(n6i0 n6i0Var, String str, long j, long j2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = n6i0Var;
        this.c = str;
        this.d = j;
        this.e = j2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new b6i0(this.b, this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new b6i0(this.b, this.c, this.d, this.e, lnmVar, (byte) 1);
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
        String str = this.c;
        n6i0 n6i0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                b7i0 b7i0Var = n6i0Var.g;
                String str2 = n6i0Var.e.a;
                boolean zA = n6i0Var.Y.a();
                b7i0Var.getClass();
                b7i0Var.c(this.d, this.e, wqn1.n(str), str2, zA);
                break;
            default:
                hm5.M(obj);
                b7i0 b7i0Var2 = n6i0Var.g;
                String str3 = n6i0Var.e.a;
                boolean zA2 = n6i0Var.Y.a();
                b7i0Var2.getClass();
                b7i0Var2.c(this.d, this.e, String.format("%s%s", Arrays.copyOf(new Object[]{"spotify-audio://", str}, 2)), str3, zA2);
                break;
        }
        return rih1Var;
    }
}
