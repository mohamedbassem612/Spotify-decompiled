package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l1c extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m1c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1c(m1c m1cVar, byte b) {
        super(1);
        this.a = b;
        this.b = m1cVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        m1c m1cVar = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue() == ((Boolean) m1cVar.b.d.getValue()).booleanValue()) {
                    n511 n511Var = m1cVar.j;
                    n511Var.getClass();
                    return n511Var;
                }
                n511 n511Var2 = m1cVar.i;
                n511Var2.getClass();
                return n511Var2;
            default:
                return m1cVar.f;
        }
    }
}
