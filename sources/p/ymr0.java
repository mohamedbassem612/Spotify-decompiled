package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ymr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ c10 c;
    public final /* synthetic */ lbt0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymr0(iu30 iu30Var, c10 c10Var, lbt0 lbt0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = c10Var;
        this.d = lbt0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c10 c10Var = this.c;
        t80 t80Var = t80.t;
        lbt0 lbt0Var = this.d;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((hvm0) obj).ordinal();
                if (iOrdinal == 1) {
                    iu30Var.invoke(new wat0(c10Var != null ? c10Var.e : null, null));
                } else if (iOrdinal == 2) {
                    c10 c10Var2 = (c10) lbt0Var.c.get(t80Var);
                    iu30Var.invoke(new jat0(c10Var2 != null ? c10Var2.e : null));
                }
                break;
            case 1:
                int iOrdinal2 = ((t191) obj).ordinal();
                if (iOrdinal2 == 1) {
                    iu30Var.invoke(new wat0(c10Var != null ? c10Var.e : null, null));
                } else if (iOrdinal2 == 2) {
                    c10 c10Var3 = (c10) lbt0Var.c.get(t80Var);
                    iu30Var.invoke(new jat0(c10Var3 != null ? c10Var3.e : null));
                }
                break;
            case 2:
                int iOrdinal3 = ((p191) obj).ordinal();
                if (iOrdinal3 == 1) {
                    iu30Var.invoke(new wat0(c10Var != null ? c10Var.e : null, null));
                } else if (iOrdinal3 == 2) {
                    c10 c10Var4 = (c10) lbt0Var.c.get(t80Var);
                    iu30Var.invoke(new jat0(c10Var4 != null ? c10Var4.e : null));
                }
                break;
            default:
                int iOrdinal4 = ((r191) obj).ordinal();
                if (iOrdinal4 == 1) {
                    iu30Var.invoke(new wat0(c10Var != null ? c10Var.e : null, null));
                } else if (iOrdinal4 == 2) {
                    c10 c10Var5 = (c10) lbt0Var.c.get(t80Var);
                    iu30Var.invoke(new jat0(c10Var5 != null ? c10Var5.e : null));
                }
                break;
        }
        return rih1Var;
    }
}
