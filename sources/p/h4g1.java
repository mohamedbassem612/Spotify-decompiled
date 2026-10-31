package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h4g1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b0i0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4g1(b0i0 b0i0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = b0i0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        b0i0 b0i0Var = this.c;
        switch (b) {
            case 0:
                h4g1 h4g1Var = new h4g1(b0i0Var, lnmVar, (byte) 0);
                h4g1Var.b = obj;
                return h4g1Var;
            default:
                h4g1 h4g1Var2 = new h4g1(b0i0Var, lnmVar, (byte) 1);
                h4g1Var2.b = obj;
                return h4g1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((r4g1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = 0;
        switch (this.a) {
            case 0:
                r4g1 r4g1Var = (r4g1) this.b;
                hm5.M(obj);
                b0i0 b0i0Var = this.c;
                synchronized (b0i0Var.e) {
                    f4g1 f4g1VarI = b0i0Var.i(r4g1Var);
                    if (f4g1VarI != null) {
                        Logger.b(f4g1VarI.b.toString(), new Object[0]);
                        n57.v(new IllegalStateException(f4g1VarI.a));
                    }
                    break;
                }
                return rih1.a;
            default:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                b0i0 b0i0Var2 = this.c;
                l4p1.u(c9nVar, new fu20(d5p1.g(((v4g1) b0i0Var2.b).f), new h4g1(b0i0Var2, null, b), (byte) 1));
                b0i0Var2.a = ((yqg) b0i0Var2.c).b();
                return l4p1.u(c9nVar, new fu20(new m441(new w621(c9nVar, (lnm) null, (byte) 20)), new vbc1(b0i0Var2, (lnm) null, (byte) 10), (byte) 1));
        }
    }
}
