package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zdn0 extends z031 implements vu30 {
    public nh40 b;
    public aen0 c;
    public long[] d;
    public int e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ aen0 h;
    public final /* synthetic */ nh40 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdn0(aen0 aen0Var, nh40 nh40Var, lnm lnmVar) {
        super(2, lnmVar);
        this.h = aen0Var;
        this.i = nh40Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        zdn0 zdn0Var = new zdn0(this.h, this.i, lnmVar);
        zdn0Var.g = obj;
        return zdn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((r561) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        r561 r561Var;
        aen0 aen0Var;
        long[] jArr;
        int i;
        nh40 nh40Var;
        boolean z = this.f;
        if (!z) {
            hm5.M(obj);
            r561Var = (r561) this.g;
            aen0Var = this.h;
            ydn0 ydn0VarB = aen0.b(aen0Var);
            jArr = ydn0VarB.c;
            i = ydn0VarB.e;
            nh40Var = this.i;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.e;
            jArr = this.d;
            aen0Var = this.c;
            nh40Var = this.b;
            r561Var = (r561) this.g;
            hm5.M(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return rih1.a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        nh40Var.b(i);
        Object obj2 = aen0.b(aen0Var).b[i];
        this.g = r561Var;
        this.b = nh40Var;
        this.c = aen0Var;
        this.d = jArr;
        this.e = i2;
        this.f = true;
        r561Var.b(obj2, this);
        return d9n.a;
    }
}
