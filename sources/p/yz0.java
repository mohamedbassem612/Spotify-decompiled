package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yz0 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Throwable d;
    public /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 4;
        vr20 vr20Var = (vr20) obj;
        Throwable th = (Throwable) obj2;
        long jLongValue = ((Number) obj3).longValue();
        lnm lnmVar = (lnm) obj4;
        switch (b) {
            case 0:
                yz0 yz0Var = new yz0(i, lnmVar, (byte) 0);
                yz0Var.c = vr20Var;
                yz0Var.d = th;
                yz0Var.e = jLongValue;
                return yz0Var.invokeSuspend(rih1Var);
            default:
                yz0 yz0Var2 = new yz0(i, lnmVar, (byte) 1);
                yz0Var2.c = vr20Var;
                yz0Var2.d = th;
                yz0Var2.e = jLongValue;
                return yz0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.a;
        boolean z = false;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Throwable th = this.d;
                long j = this.e;
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                hm5.M(obj);
                if (!(th instanceof CancellationException)) {
                    Boolean bool = Boolean.FALSE;
                    this.c = null;
                    this.d = null;
                    this.e = j;
                    this.b = (byte) 1;
                    if (vr20Var.emit(bool, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return Boolean.valueOf(z);
                long jMin = Math.min(1000 << ((int) (j <= 5 ? j : 5L)), 30000L);
                this.c = null;
                this.d = null;
                this.e = j;
                this.b = (byte) 2;
                if (hap1.i(jMin, this) == d9nVar) {
                    return d9nVar;
                }
                z = true;
                return Boolean.valueOf(z);
            default:
                vr20 vr20Var2 = this.c;
                Throwable th2 = this.d;
                long j2 = this.e;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return Boolean.TRUE;
                }
                hm5.M(obj);
                if ((th2 instanceof CancellationException) || !(th2 instanceof Exception)) {
                    throw th2;
                }
                this.c = null;
                this.d = th2;
                this.e = j2;
                this.b = (byte) 1;
                if (vr20Var2.emit(z6x.a, this) == d9nVar) {
                    return d9nVar;
                }
                Logger.l(th2, "Apple TV state observation failed; retrying", new Object[0]);
                long j3 = j2 <= 29 ? j2 : 29L;
                this.c = null;
                this.d = null;
                this.e = j2;
                this.b = (byte) 2;
                if (hap1.i((j3 + 1) * 1000, this) == d9nVar) {
                    return d9nVar;
                }
                return Boolean.TRUE;
        }
    }
}
