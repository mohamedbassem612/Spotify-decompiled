package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class awb implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public awb(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            t1c.a(u291.s(nim0.a, this.a, this.b), x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
