package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c8i0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f8i0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8i0(f8i0 f8i0Var, byte b) {
        super(1);
        this.a = b;
        this.b = f8i0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        f8i0 f8i0Var = this.b;
        switch (b) {
            case 0:
                return hu20.e(rqt0.u(new f8f0((mr20) obj, (byte) 19)), new zz90((lnm) null, f8i0Var, (byte) 20));
            default:
                cas casVar = (a7m0) obj;
                casVar.d = z7i0.b;
                casVar.e = z7i0.c;
                casVar.c = new qn(new c8i0(f8i0Var, (byte) 0), f8i0Var.c, (byte) 7);
                return rih1.a;
        }
    }
}
