package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tg6 extends hab0 implements iu30 {
    public final /* synthetic */ dw91 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dw91 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ vu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg6(dw91 dw91Var, int i, dw91 dw91Var2, boolean z, boolean z2, vu30 vu30Var) {
        super(1);
        this.a = dw91Var;
        this.b = i;
        this.c = dw91Var2;
        this.d = z;
        this.e = z2;
        this.f = vu30Var;
    }

    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.b;
        dw91 dw91Var = this.a;
        if (zBooleanValue) {
            dw91Var.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            boolean z = dw91Var.remove(Integer.valueOf(i)) != null;
            Integer numValueOf = Integer.valueOf(i);
            boolean z2 = this.d;
            this.c.put(numValueOf, Boolean.valueOf(z2));
            if (z && !this.e) {
                this.f.invoke(Integer.valueOf(i), z2 ? tf6.a : tf6.b);
            }
        }
        return rih1.a;
    }
}
