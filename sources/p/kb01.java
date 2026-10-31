package p;

import com.spotify.read_reporting_esperanto.proto.ReadEndRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kb01 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ long b;
    public /* synthetic */ long c;
    public final /* synthetic */ qb01 d;
    public final /* synthetic */ jfe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb01(qb01 qb01Var, jfe jfeVar, lnm lnmVar) {
        super(3, lnmVar);
        this.d = qb01Var;
        this.e = jfeVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        kb01 kb01Var = new kb01(this.d, this.e, (lnm) obj3);
        kb01Var.b = jLongValue;
        kb01Var.c = jLongValue2;
        return kb01Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        long j = this.b;
        long j2 = this.c;
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        qb01 qb01Var = this.d;
        if (!z) {
            hm5.M(obj);
            this.b = j;
            this.c = j2;
            this.a = true;
            int i = qb01.i;
            phc phcVar = qb01Var.g;
            d9n d9nVar = d9n.a;
            if (phcVar == null) {
                objA = rih1Var;
            } else {
                wa01 wa01VarN = ReadEndRequest.n();
                wa01VarN.r(phcVar);
                wa01VarN.s(j);
                wa01VarN.n(j2);
                wa01VarN.q();
                objA = qb01Var.a(new ob01(qb01Var, (ReadEndRequest) wa01VarN.build(), (lnm) null, (byte) 0), this);
                if (objA != d9nVar) {
                    objA = rih1Var;
                }
            }
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        qb01Var.g = null;
        this.e.H((Throwable) null);
        return rih1Var;
    }
}
