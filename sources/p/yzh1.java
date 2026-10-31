package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yzh1 {
    public final zzh1 a;
    public final h0i1 b;

    public yzh1(zzh1 zzh1Var, h0i1 h0i1Var) {
        this.a = zzh1Var;
        this.b = h0i1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(yzh1 yzh1Var, onm onmVar) {
        wzh1 wzh1Var;
        if (onmVar instanceof wzh1) {
            wzh1Var = (wzh1) onmVar;
            int i = wzh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wzh1Var.c = i - Integer.MIN_VALUE;
            } else {
                wzh1Var = new wzh1(yzh1Var, onmVar);
            }
        } else {
            wzh1Var = new wzh1(yzh1Var, onmVar);
        }
        Object objA = wzh1Var.a;
        int i2 = wzh1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            wzh1Var.c = 1;
            objA = yzh1Var.a(wzh1Var);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        vzh1 vzh1Var = (vzh1) objA;
        if (vzh1Var != null) {
            return vzh1Var.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        xzh1 xzh1Var;
        if (onmVar instanceof xzh1) {
            xzh1Var = (xzh1) onmVar;
            int i = xzh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xzh1Var.c = i - Integer.MIN_VALUE;
            } else {
                xzh1Var = new xzh1(this, onmVar);
            }
        } else {
            xzh1Var = new xzh1(this, onmVar);
        }
        Object objB = xzh1Var.a;
        int i2 = xzh1Var.c;
        zzh1 zzh1Var = this.a;
        if (i2 == 0) {
            hm5.M(objB);
            if (zzh1Var.a.b()) {
                xzh1Var.c = 1;
                objB = this.b.b(xzh1Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        s3c1 s3c1Var = (s3c1) objB;
        if (s3c1Var != null) {
            String str = s3c1Var.a;
            String str2 = s3c1Var.b;
            String str3 = s3c1Var.c;
            boolean zA = zzh1Var.a.a();
            if (zA) {
                if ((str2 == null) != (str3 == null)) {
                    Logger.k("Upsell offer ignores checkout: has cta_link=%s, has legal_disclaimer=%s", new Object[]{Boolean.valueOf(str2 != null), Boolean.valueOf(str3 != null)});
                }
            }
            return (!zA || str2 == null || str3 == null) ? new tzh1(str) : new uzh1(str, str2, str3);
        }
        return null;
    }
}
