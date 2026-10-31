package p;

import com.google.android.recaptcha.internal.zzhm;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nwo1 {
    public final vu30 a;
    public final Integer b;
    public final int c;

    public nwo1(int i, vu30 vu30Var, Integer num) {
        this.c = i;
        this.a = vu30Var;
        this.b = num;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zwo1 zwo1Var, lnm lnmVar) throws zzhm {
        mwo1 mwo1Var;
        TimeoutCancellationException e;
        rvo1 rvo1Var;
        Exception e2;
        zzhm e3;
        if (lnmVar instanceof mwo1) {
            mwo1Var = (mwo1) lnmVar;
            int i = mwo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mwo1Var.c = i - Integer.MIN_VALUE;
            } else {
                mwo1Var = new mwo1(this, lnmVar);
            }
        } else {
            mwo1Var = new mwo1(this, lnmVar);
        }
        Object obj = mwo1Var.a;
        int i2 = mwo1Var.c;
        tgo1 tgo1Var = tgo1.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                den1 den1Var = zwo1Var.b;
                rvo1 rvo1Var2 = new rvo1(zwo1Var, this.c, this.b);
                try {
                    vu30 vu30Var = this.a;
                    mwo1Var.d = rvo1Var2;
                    mwo1Var.c = 1;
                    Object objInvoke = vu30Var.invoke(rvo1Var2, mwo1Var);
                    d9n d9nVar = d9n.a;
                    if (objInvoke == d9nVar) {
                        return d9nVar;
                    }
                    obj = objInvoke;
                    rvo1Var = rvo1Var2;
                } catch (zzhm e4) {
                    e3 = e4;
                    rvo1Var = rvo1Var2;
                    rvo1Var.b(e3);
                    throw e3;
                } catch (Exception e5) {
                    e2 = e5;
                    rvo1Var = rvo1Var2;
                    zzhm zzhmVar = new zzhm(tgo1Var, ij81.d, e2.getMessage(), null);
                    rvo1Var.b(zzhmVar);
                    throw zzhmVar;
                } catch (TimeoutCancellationException e6) {
                    e = e6;
                    rvo1Var = rvo1Var2;
                    zzhm zzhmVar2 = new zzhm(tgo1Var, ij81.e, e.getMessage(), null);
                    rvo1Var.b(zzhmVar2);
                    throw zzhmVar2;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rvo1Var = mwo1Var.d;
                try {
                    hm5.M(obj);
                } catch (TimeoutCancellationException e7) {
                    e = e7;
                    zzhm zzhmVar3 = new zzhm(tgo1Var, ij81.e, e.getMessage(), null);
                    rvo1Var.b(zzhmVar3);
                    throw zzhmVar3;
                } catch (zzhm e8) {
                    e3 = e8;
                    rvo1Var.b(e3);
                    throw e3;
                } catch (Exception e9) {
                    e2 = e9;
                    zzhm zzhmVar4 = new zzhm(tgo1Var, ij81.d, e2.getMessage(), null);
                    rvo1Var.b(zzhmVar4);
                    throw zzhmVar4;
                }
            }
            rvo1Var.a.c(rvo1Var.c(3), null);
            return obj;
        } catch (Throwable th) {
            throw th;
        }
    }
}
