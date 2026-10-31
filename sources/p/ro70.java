package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ro70 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wo70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro70(wo70 wo70Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = wo70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        wo70 wo70Var = this.b;
        switch (b) {
            case 0:
                return new ro70(wo70Var, lnmVar, (byte) 0);
            case 1:
                return new ro70(wo70Var, lnmVar, (byte) 1);
            default:
                return new ro70(wo70Var, lnmVar, (byte) 2);
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
            case 1:
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
        wo70 wo70Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Iterator it = wo70Var.a.iterator();
                while (it.hasNext()) {
                    ((po70) it.next()).c();
                }
                break;
            case 1:
                hm5.M(obj);
                Iterator it2 = wo70Var.a.iterator();
                while (it2.hasNext()) {
                    ((po70) it2.next()).g();
                }
                break;
            default:
                hm5.M(obj);
                Iterator it3 = wo70Var.a.iterator();
                while (it3.hasNext()) {
                    ((po70) it3.next()).f();
                }
                break;
        }
        return rih1Var;
    }
}
