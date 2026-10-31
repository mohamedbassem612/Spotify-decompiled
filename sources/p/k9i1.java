package p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k9i1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l9i1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9i1(l9i1 l9i1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = l9i1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        l9i1 l9i1Var = this.c;
        switch (b) {
            case 0:
                k9i1 k9i1Var = new k9i1(l9i1Var, lnmVar, (byte) 0);
                k9i1Var.b = obj;
                return k9i1Var;
            default:
                k9i1 k9i1Var2 = new k9i1(l9i1Var, lnmVar, (byte) 1);
                k9i1Var2.b = obj;
                return k9i1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((WeakReference) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        l9i1 l9i1Var = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                l9i1Var.l = (WeakReference) obj2;
                break;
            default:
                c9n c9nVar = (c9n) obj2;
                hm5.M(obj);
                l4p1.u(c9nVar, new fu20(l9i1Var.d.b, new b0f1(l9i1Var, (lnm) null, (byte) 25), (byte) 1));
                l4p1.u(c9nVar, new fu20(l9i1Var.f.b, new k9i1(l9i1Var, null, (byte) 0), (byte) 1));
                break;
        }
        return rih1Var;
    }
}
