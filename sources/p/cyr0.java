package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cyr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eyr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cyr0(eyr0 eyr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = eyr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        eyr0 eyr0Var = this.b;
        switch (b) {
            case 0:
                return new x010(d3p1.F(eyr0Var.a, eyr0Var.d, (wxr0) obj), eyr0Var.c, byr0.h, (byte) 1);
            default:
                ((qtr) obj).b(new gz0(eyr0Var, (lnm) null, (byte) 16));
                return rih1.a;
        }
    }
}
