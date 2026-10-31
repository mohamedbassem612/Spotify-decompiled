package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kf61 implements if61 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final wi20 a;
    public final mj20 b;
    public final lj61 c;
    public final rmr d;
    public final o8n e;

    public kf61(wi20 wi20Var, mj20 mj20Var, lj61 lj61Var, rmr rmrVar, o8n o8nVar) {
        this.a = wi20Var;
        this.b = mj20Var;
        this.c = lj61Var;
        this.d = rmrVar;
        this.e = o8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        jf61 jf61Var;
        boolean zBooleanValue;
        if (onmVar instanceof jf61) {
            jf61Var = (jf61) onmVar;
            int i = jf61Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jf61Var.d = i - Integer.MIN_VALUE;
            } else {
                jf61Var = new jf61(this, onmVar);
            }
        } else {
            jf61Var = new jf61(this, onmVar);
        }
        Object obj = jf61Var.b;
        int i2 = jf61Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            jf61Var.a = this;
            jf61Var.d = 1;
            Object objB = this.c.b(jf61Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = jf61Var.a;
            hm5.M(obj);
        }
        lj61 lj61Var = this.c;
        Boolean boolI = lj61Var.a.i();
        if (boolI != null) {
            zBooleanValue = boolI.booleanValue();
        } else {
            Boolean boolA = lj61Var.b.a();
            zBooleanValue = boolA != null ? boolA.booleanValue() : true;
        }
        if (zBooleanValue) {
            return f <= this.c.a() ? yah0.m(true) : yah0.m(false);
        }
        return yah0.m(false);
    }
}
