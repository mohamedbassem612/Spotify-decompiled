package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class l7n implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r1c0 b;

    public /* synthetic */ l7n(r1c0 r1c0Var, byte b) {
        this.a = b;
        this.b = r1c0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r1c0 r1c0Var = this.b;
        switch (b) {
            case 0:
                elb0 elb0Var = (elb0) obj;
                z9e1 z9e1VarD = r1c0Var.d();
                if (z9e1VarD != null) {
                    z9e1VarD.c = elb0Var;
                }
                return rih1Var;
            case 1:
                hrr0 hrr0Var = r1c0Var.t;
                c8e1 c8e1Var = (c8e1) obj;
                String str = c8e1Var.a.b;
                af5 af5Var = r1c0Var.j;
                if (!u890.j(str, af5Var != null ? af5Var.b : null)) {
                    r1c0Var.k.setValue(zr50.a);
                    if (((Boolean) hrr0Var.getValue()).booleanValue()) {
                        hrr0Var.setValue(Boolean.FALSE);
                    } else {
                        r1c0Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = nbe1.b;
                r1c0Var.f(j);
                r1c0Var.e(j);
                r1c0Var.u.invoke(c8e1Var);
                r1c0Var.b.b();
                return rih1Var;
            case 2:
                r1c0Var.r.b(((r180) obj).a);
                return rih1Var;
            case 3:
                return Boolean.valueOf(r1c0Var.r.b(((r180) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                r1c0Var.q.setValue(bool);
                return rih1Var;
        }
    }
}
