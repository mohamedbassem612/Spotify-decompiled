package p;

import com.spotify.read_reporting_esperanto.proto.ReadInterval;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jb01 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ long b;
    public /* synthetic */ long c;
    public final /* synthetic */ qb01 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb01(qb01 qb01Var, int i, int i2, lnm lnmVar) {
        super(3, lnmVar);
        this.d = qb01Var;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        int i = this.e;
        int i2 = this.f;
        jb01 jb01Var = new jb01(this.d, i, i2, (lnm) obj3);
        jb01Var.b = jLongValue;
        jb01Var.c = jLongValue2;
        return jb01Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long j = this.b;
        long j2 = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            int i = qb01.i;
            qb01 qb01Var = this.d;
            qb01Var.getClass();
            ya01 ya01VarN = ReadInterval.n();
            ya01VarN.q(this.e);
            ya01VarN.n(this.f);
            this.b = j;
            this.c = j2;
            this.a = true;
            Object objD = qb01.d(qb01Var, ya01VarN, j, j2, null, null, this, 24);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
