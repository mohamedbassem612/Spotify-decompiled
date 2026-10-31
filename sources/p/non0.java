package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class non0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uvj b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ non0(uvj uvjVar, iu30 iu30Var, iu30 iu30Var2, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uvjVar;
        this.c = iu30Var;
        this.d = iu30Var2;
        this.e = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        iu30 iu30Var2 = this.d;
        ven0 ven0Var = this.e;
        uvj uvjVar = this.b;
        switch (b) {
            case 0:
                xa5 xa5Var = (xa5) obj;
                sbn0 sbn0Var = sbn0.U0;
                tvj tvjVar = (tvj) ((hnn0) xa5Var.b()).b;
                if (((Boolean) uvjVar.c.getValue()).booleanValue() || ((Boolean) ven0Var.getValue()).booleanValue()) {
                    int i = vnn0.X;
                    for (vnn0 vnn0Var : z561.c0(sbn0Var, tvjVar)) {
                    }
                    return (bby) iu30Var.invoke(xa5Var);
                }
                int i2 = vnn0.X;
                for (vnn0 vnn0Var2 : z561.c0(sbn0Var, tvjVar)) {
                }
                return (bby) iu30Var2.invoke(xa5Var);
            default:
                xa5 xa5Var2 = (xa5) obj;
                sbn0 sbn0Var2 = sbn0.U0;
                tvj tvjVar2 = (tvj) ((hnn0) xa5Var2.e()).b;
                if (((Boolean) uvjVar.c.getValue()).booleanValue() || ((Boolean) ven0Var.getValue()).booleanValue()) {
                    int i3 = vnn0.X;
                    for (vnn0 vnn0Var3 : z561.c0(sbn0Var2, tvjVar2)) {
                    }
                    return (ln00) iu30Var.invoke(xa5Var2);
                }
                int i4 = vnn0.X;
                for (vnn0 vnn0Var4 : z561.c0(sbn0Var2, tvjVar2)) {
                }
                return (ln00) iu30Var2.invoke(xa5Var2);
        }
    }
}
