package p;

import com.spotify.transcript.passthroughimpl.AudioUnavailableException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a5s0 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public /* synthetic */ long c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5s0(ijv0 ijv0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.d = ijv0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Throwable th = (Throwable) obj2;
        Number number = (Number) obj3;
        switch (b) {
            case 0:
                long jLongValue = number.longValue();
                a5s0 a5s0Var = new a5s0(4, (lnm) obj4);
                a5s0Var.d = th;
                a5s0Var.c = jLongValue;
                return a5s0Var.invokeSuspend(rih1Var);
            default:
                long jLongValue2 = number.longValue();
                a5s0 a5s0Var2 = new a5s0((ijv0) this.d, (lnm) obj4);
                a5s0Var2.c = jLongValue2;
                return a5s0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        boolean z = true;
        switch (b) {
            case 0:
                Throwable th = (Throwable) this.d;
                long j = this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (!(th instanceof AudioUnavailableException) || j >= 100) {
                        z = false;
                    } else {
                        this.d = null;
                        this.c = j;
                        this.b = true;
                        if (hap1.i(250L, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(z);
            default:
                long j2 = this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (j2 >= 3) {
                        return Boolean.FALSE;
                    }
                    long j3 = (1 + j2) * ((long) ((ijv0) this.d).c);
                    this.c = j2;
                    this.b = true;
                    if (hap1.i(j3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ a5s0(int i, lnm lnmVar) {
        super(i, lnmVar);
    }

    public a5s0() {
        super(4, (lnm) null);
    }
}
