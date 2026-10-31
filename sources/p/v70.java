package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v70 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ no5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v70(no5 no5Var, byte b) {
        super(1);
        this.a = b;
        this.b = no5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String string = null;
        no5 no5Var = this.b;
        switch (b) {
            case 0:
                m70 m70Var = (m70) obj;
                mr20 mr20Var = m70Var.b;
                if (mr20Var != null) {
                    return new u70(mr20Var, (byte) 0);
                }
                Integer num = m70Var.a;
                if (num != null) {
                    string = no5Var.a.getString(num.intValue());
                }
                string.getClass();
                return new huz(new it61(string), (byte) 10);
            default:
                jp61 jp61Var = (jp61) obj;
                return new lt20(new zo51(jp61Var.b.l, jp61Var, (byte) 9), new dwf0(no5Var, jp61Var, (lnm) null, (byte) 21), (byte) 0);
        }
    }
}
