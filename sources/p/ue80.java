package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ue80 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q811 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue80(q811 q811Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = q811Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jbj0 jbj0Var = jbj0.a;
        iu30 iu30Var = this.c;
        q811 q811Var = this.b;
        switch (b) {
            case 0:
                z = ((Number) obj).intValue() > 50;
                if (!u890.j(q811Var.a, Boolean.valueOf(z))) {
                    q811Var.a = Boolean.valueOf(z);
                    if (z) {
                        iu30Var.invoke(jbj0Var);
                    }
                }
                break;
            case 1:
                z = ((Number) obj).intValue() > 50;
                if (!u890.j(q811Var.a, Boolean.valueOf(z))) {
                    q811Var.a = Boolean.valueOf(z);
                    if (z) {
                        iu30Var.invoke(jbj0Var);
                    }
                }
                break;
            default:
                z = ((Number) obj).intValue() > 50;
                if (!u890.j(q811Var.a, Boolean.valueOf(z))) {
                    q811Var.a = Boolean.valueOf(z);
                    if (z) {
                        iu30Var.invoke(jbj0Var);
                    }
                }
                break;
        }
        return rih1Var;
    }
}
