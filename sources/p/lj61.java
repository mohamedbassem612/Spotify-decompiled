package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lj61 {
    public static final jj61 c = new jj61();
    public static final lnv0 d = sj1.x(id61.b, new ze3(fft0.Y0, (byte) 3), 12);
    public final dg90 a;
    public final y321 b;

    public lj61(wi20 wi20Var, o8n o8nVar, o8n o8nVar2, mj20 mj20Var) {
        wi20Var.a();
        Context context = wi20Var.a;
        df61 df61Var = df61.a;
        xz5 xz5VarA = df61.a(wi20Var);
        dg90 dg90Var = new dg90(context);
        k811 k811Var = new k811(xz5VarA, o8nVar);
        mma0[] mma0VarArr = jj61.a;
        c.getClass();
        y321 y321Var = new y321(mj20Var, xz5VarA, k811Var, (r4r) d.a(context, jj61.a[0]));
        this.a = dg90Var;
        this.b = y321Var;
    }

    public final double a() {
        Double dH = this.a.h();
        if (dH != null) {
            double dDoubleValue = dH.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        cb61 cb61Var = this.b.b().b;
        if (cb61Var == null) {
            u890.C("sessionConfigs");
            throw null;
        }
        Double d2 = cb61Var.b;
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        kj61 kj61Var;
        if (onmVar instanceof kj61) {
            kj61Var = (kj61) onmVar;
            int i = kj61Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kj61Var.d = i - Integer.MIN_VALUE;
            } else {
                kj61Var = new kj61(this, onmVar);
            }
        } else {
            kj61Var = new kj61(this, onmVar);
        }
        Object obj = kj61Var.b;
        int i2 = kj61Var.d;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            kj61Var.a = this;
            kj61Var.d = 1;
            if (d9nVar != d9nVar2) {
            }
        }
        if (i2 == 1) {
            this = kj61Var.a;
            hm5.M(obj);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        y321 y321Var = this.b;
        kj61Var.a = null;
        kj61Var.d = 2;
        return y321Var.c(kj61Var) == d9nVar2 ? d9nVar2 : d9nVar;
    }
}
