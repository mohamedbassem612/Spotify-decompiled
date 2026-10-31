package p;

import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yro1 implements eto1 {
    public zzhm c;
    public yln1 d;
    public final cik1 f;
    public final qeh1 g;
    public final xgn0 a = ygn0.a();
    public ayh b = sap1.a();
    public bto1 e = bto1.a;

    public yro1(qeh1 qeh1Var, cik1 cik1Var) {
        this.g = qeh1Var;
        this.f = cik1Var;
    }

    public static final boolean e(Exception exc) {
        if (!(exc instanceof zzhm)) {
            return true;
        }
        tgo1 tgo1Var = ((zzhm) exc).a;
        return (tgo1Var == tgo1.e || tgo1Var == tgo1.f || tgo1Var == tgo1.g) ? false : true;
    }

    public final qwo1 a(long j, eqo1 eqo1Var) {
        return new qwo1(new hro1(j, (lnm) null, this));
    }

    public final qwo1 b(String str, vi01 vi01Var, long j) {
        return new qwo1(new lwn1(this, j, str, vi01Var, (lnm) null));
    }

    public final bto1 c() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(yqo1 yqo1Var, onm onmVar) {
        qqo1 qqo1Var;
        hql1 hql1Var;
        if (onmVar instanceof qqo1) {
            qqo1Var = (qqo1) onmVar;
            int i = qqo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qqo1Var.c = i - Integer.MIN_VALUE;
            } else {
                qqo1Var = new qqo1(this, onmVar);
            }
        } else {
            qqo1Var = new qqo1(this, onmVar);
        }
        Object obj = qqo1Var.a;
        int i2 = qqo1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            hql1 hql1Var2 = new hql1((byte) 6);
            qqo1Var.d = hql1Var2;
            qqo1Var.c = 1;
            Object objInvoke = yqo1Var.invoke(qqo1Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
            hql1Var = hql1Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hql1Var = qqo1Var.d;
            hm5.M(obj);
        }
        qxg1 qxg1Var = (qxg1) hql1Var.a;
        long jNanoTime = System.nanoTime();
        ulo1.v(qxg1Var.b, "This stopwatch is already stopped.");
        qxg1Var.b = false;
        qxg1Var.c = (jNanoTime - qxg1Var.d) + qxg1Var.c;
        qxg1 qxg1Var2 = (qxg1) hql1Var.a;
        return new Long((qxg1Var2.b ? (System.nanoTime() - qxg1Var2.d) + qxg1Var2.c : qxg1Var2.c) / 1000000);
    }
}
