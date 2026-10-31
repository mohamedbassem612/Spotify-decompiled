package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class poc0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Set b;
    public /* synthetic */ g3d0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poc0() {
        super(3, (lnm) null);
        this.a = (byte) 1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        Set set = (Set) obj;
        g3d0 g3d0Var = (g3d0) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                poc0 poc0Var = new poc0(i, lnmVar, (byte) 0);
                poc0Var.b = set;
                poc0Var.c = g3d0Var;
                return poc0Var.invokeSuspend(rih1Var);
            default:
                poc0 poc0Var2 = new poc0(i, lnmVar, (byte) 1);
                poc0Var2.b = set;
                poc0Var2.c = g3d0Var;
                return poc0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Set set = this.b;
                g3d0 g3d0Var = this.c;
                hm5.M(obj);
                return new mmr0(set, g3d0Var);
            default:
                Set set2 = this.b;
                g3d0 g3d0Var2 = this.c;
                hm5.M(obj);
                return new w4u0(set2, g3d0Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ poc0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
