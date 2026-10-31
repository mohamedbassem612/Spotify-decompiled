package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yvb extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ hux b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvb(int i, String str, hux huxVar, boolean z) {
        super(2);
        this.b = huxVar;
        this.c = str;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        boolean z = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x760.g(this.b, str, z, (b0k) obj, czo1.p(9));
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    jsl jslVar = new jsl(str);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarR = u291.r(nim0Var, 16.0f);
                    if (z) {
                        qim0VarR = qim0VarR.then(i541.D(nim0Var, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1048574));
                    }
                    w0h1.a(this.b, jslVar, qim0VarR, 0L, 0L, false, x340Var2, 8, 56);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (!z) {
                    x340Var4.i0(1235160996);
                    jsl jslVar2 = new jsl(str);
                    uwr uwrVar2 = cbx.a;
                    w0h1.a(this.b, jslVar2, (qim0) null, cbx.a(x340Var4).b.b, 0L, false, x340Var4, 8, 52);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(1235010739);
                    uwr uwrVar3 = cbx.a;
                    xto1.e((qim0) null, 3, cbx.a(x340Var4).b.a, 0L, x340Var4, 48, 9);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvb(hux huxVar, String str, boolean z) {
        super(2);
        this.b = huxVar;
        this.c = str;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvb(boolean z, hux huxVar, String str) {
        super(2);
        this.d = z;
        this.b = huxVar;
        this.c = str;
    }
}
