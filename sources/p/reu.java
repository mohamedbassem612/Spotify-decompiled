package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class reu extends hab0 implements vu30 {
    public final /* synthetic */ cz31 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reu(cz31 cz31Var, String str) {
        super(2);
        this.a = cz31Var;
        this.b = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            j2h1.b(d9y0.l(dm5.e0(et40.a, 48.0f), this.a), ql3.g, apo.r(-104152424, new qeu(this.b, (byte) 1), x340Var2), x340Var2, 384, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
