package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p2g0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2g0(ldo ldoVar, byte b) {
        super(1);
        this.a = b;
        this.b = ldoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ldo ldoVar = this.b;
        switch (b) {
            case 0:
                n2g0 n2g0Var = (n2g0) obj;
                String str = n2g0Var.f;
                if (str != null) {
                    return new huz(str, (byte) 10);
                }
                String str2 = n2g0Var.g;
                return str2 != null ? new huz(str2, (byte) 10) : new fu20(new m441(new l2g0((o3e0) ldoVar.d, n2g0Var.c, null)), new e9c0(n2g0Var, (lnm) null, (byte) 28), (byte) 1);
            default:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new jaz(ldoVar, (lnm) null, (byte) 11));
                qtrVar.d(j2g0.e, ujf0.P0);
                return rih1.a;
        }
    }
}
