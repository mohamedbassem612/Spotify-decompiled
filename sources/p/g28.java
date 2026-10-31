package p;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g28 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g28(r390 r390Var, long j, ExoPlayer exoPlayer, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = r390Var;
        this.b = j;
        this.d = exoPlayer;
        this.e = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                g28 g28Var = new g28(obj3, obj2, this.b, lnmVar, (byte) 0);
                g28Var.c = obj;
                return g28Var;
            case 1:
                return new g28((r390) this.c, this.b, (ExoPlayer) obj3, (Function0) obj2, lnmVar);
            default:
                g28 g28Var2 = new g28(obj3, obj2, this.b, lnmVar, (byte) 2);
                g28Var2.c = obj;
                return g28Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                ssw0 ssw0Var = (ssw0) this.c;
                hm5.M(obj);
                xab1 xab1VarT = fn31.T(ssw0Var, (o8n) null, 2, new k96((m441) this.d, ssw0Var, (lnm) null, (byte) 14), 1);
                h28 h28Var = (h28) this.e;
                xab1VarT.L(new f28(fn31.T(ssw0Var, (o8n) null, 4, new wn2(h28Var, xab1VarT, this.b, (lnm) null, (byte) 1), 1), ssw0Var, h28Var, this.b));
                xab1VarT.start();
                return rih1.a;
            case 1:
                hm5.M(obj);
                if (!((r390) this.c).Y && ((r390) this.c).P0.get() == this.b) {
                    ((r390) this.c).G0((ExoPlayer) this.d, (i390) ((Function0) this.e).invoke());
                }
                return rih1.a;
            default:
                hm5.M(obj);
                zwo1 zwo1Var = (zwo1) this.c;
                alg1 alg1Var = (alg1) this.d;
                xnn1 xnn1Var = (xnn1) this.e;
                long j = this.b;
                synchronized (zwo1Var) {
                    try {
                        s2t s2tVar = (s2t) alg1Var.e;
                        if (s2tVar == null || s2tVar.v()) {
                            alg1Var.e = fn31.q(((qeh1) alg1Var.f).a(), (o8n) null, 0, new u4c(zwo1Var, alg1Var, xnn1Var, j, (lnm) null), 3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g28(Object obj, Object obj2, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = j;
    }
}
