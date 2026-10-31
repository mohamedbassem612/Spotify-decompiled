package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h5v implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h5v(float f, l811 l811Var) {
        this.b = f;
        this.c = l811Var;
    }

    public final Object invoke(Object obj) {
        boolean zA;
        byte b = this.a;
        boolean z = false;
        float f = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                l811 l811Var = (l811) obj2;
                f6v f6vVar = (f6v) obj;
                boolean zJ = u890.j(f6vVar.Q(), "waiting");
                if (f6vVar.a() == null) {
                    zA = false;
                } else {
                    qqq0 qqq0VarA = f6vVar.a();
                    qqq0VarA.getClass();
                    zA = k6v.a(qqq0VarA, f);
                }
                if (l811Var.a || (zJ && zA)) {
                    z = true;
                }
                l811Var.a = z;
                return Boolean.valueOf(!z);
            default:
                mhg1 mhg1Var = (mhg1) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zG = mhg1Var.g();
                frr0 frr0Var = mhg1Var.h;
                if (!zG) {
                    if (frr0Var.s() == Long.MIN_VALUE) {
                        frr0Var.t(jLongValue);
                        mhg1Var.a.r1(true);
                    }
                    long jS = jLongValue - frr0Var.s();
                    if (f != 0.0f) {
                        jS = jch0.a0(jS / ((double) f));
                    }
                    mhg1Var.n(jS);
                    mhg1Var.h(jS, f == 0.0f);
                }
                return rih1.a;
        }
    }

    public /* synthetic */ h5v(mhg1 mhg1Var, float f) {
        this.c = mhg1Var;
        this.b = f;
    }
}
