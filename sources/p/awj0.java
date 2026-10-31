package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class awj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ c380 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awj0(ven0 ven0Var, iu30 iu30Var, c380 c380Var) {
        super(1);
        this.d = ven0Var;
        this.b = iu30Var;
        this.c = c380Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        iu30 iu30Var = this.b;
        c380 c380Var = this.c;
        switch (b) {
            case 0:
                ven0Var.setValue((Integer) obj);
                iu30Var.invoke(new nvj0(((Number) obj).intValue(), c380Var.indexOf(ven0Var.getValue())));
                return rih1Var;
            default:
                l8w0 l8w0Var = (m8w0) obj;
                if (!l8w0Var.equals((m8w0) ven0Var.getValue())) {
                    if (l8w0Var instanceof j8w0) {
                        iu30Var.invoke(new eck0(c380Var.indexOf(l8w0Var)));
                    } else if (l8w0Var instanceof k8w0) {
                        iu30Var.invoke(new gck0(c380Var.indexOf(l8w0Var)));
                    } else {
                        if (!(l8w0Var instanceof l8w0)) {
                            eg.o();
                            return null;
                        }
                        iu30Var.invoke(new jck0(l8w0Var.a, c380Var.indexOf(l8w0Var)));
                    }
                }
                ven0Var.setValue(l8w0Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awj0(iu30 iu30Var, c380 c380Var, ven0 ven0Var) {
        super(1);
        this.b = iu30Var;
        this.c = c380Var;
        this.d = ven0Var;
    }
}
