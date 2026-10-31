package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n0i0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ q0i0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0i0(String str, q0i0 q0i0Var, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = q0i0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        q0i0 q0i0Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                return new m441(new v4e0(d3p1.F((d0r) obj, m2i0.a, str), (lnm) null, q0i0Var, (byte) 20));
            default:
                return new b8d0(d3p1.F((d0r) obj, m2i0.b, str), q0i0Var, (byte) 27);
        }
    }
}
