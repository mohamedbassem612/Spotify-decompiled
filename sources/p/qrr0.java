package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qrr0 {
    public final lzn0 a;
    public final okc0 b;
    public final wrr0 c;
    public final rrr0 d;
    public final q8n e;

    public qrr0(lzn0 lzn0Var, okc0 okc0Var, wrr0 wrr0Var, rrr0 rrr0Var, q8n q8nVar) {
        this.a = lzn0Var;
        this.b = okc0Var;
        this.c = wrr0Var;
        this.d = rrr0Var;
        this.e = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        krr0 krr0Var;
        zrr0 m231Var;
        if (onmVar instanceof krr0) {
            krr0Var = (krr0) onmVar;
            int i = krr0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                krr0Var.d = i - Integer.MIN_VALUE;
            } else {
                krr0Var = new krr0(this, onmVar);
            }
        } else {
            krr0Var = new krr0(this, onmVar);
        }
        Object objA = krr0Var.b;
        int i2 = krr0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                okc0 okc0Var = this.b;
                String str2 = this.c.a;
                krr0Var.a = str;
                krr0Var.d = 1;
                objA = ((rkc0) okc0Var).a(str2, str, krr0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = krr0Var.a;
                hm5.M(objA);
            }
            m231Var = (zrr0) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        lvz lvzVar = lvz.a;
        if (thA != null) {
            return lvzVar;
        }
        int iC = l1d.C(m231Var.b);
        if (iC == 0) {
            return new mvz(1, str);
        }
        if (iC == 1) {
            return new mvz(2, str);
        }
        if (iC == 2) {
            return lvzVar;
        }
        eg.o();
        return null;
    }
}
