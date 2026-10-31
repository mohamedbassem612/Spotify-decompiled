package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xxb implements vu30 {
    public final /* synthetic */ j2i a;
    public final /* synthetic */ float b;

    public xxb(float f, j2i j2iVar) {
        this.a = j2iVar;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.invoke(uyn1.j(0.0f, 0.0f, 0.0f, this.b, 7), x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
