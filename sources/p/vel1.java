package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vel1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ dok0 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vel1(int i, int i2, int i3, int i4, ven0 ven0Var, dok0 dok0Var, iu30 iu30Var, int i5, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = ven0Var;
        this.g = dok0Var;
        this.h = iu30Var;
        this.i = i5;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        iu30 iu30Var = this.h;
        dok0 dok0Var = this.g;
        ven0 ven0Var = this.f;
        int i2 = this.e;
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                iu30Var.invoke(new aok0(ijf1.a, yoi1.p((((cfl1) ven0Var.getValue()).a ? dok0Var.a.a.b.i : ((cfl1) ven0Var.getValue()).b) + iIntValue, i, Math.min(i5, Math.max(Math.max(0, i5 - i4), i3 + i5 + i2))), false, true, iIntValue));
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                iu30Var.invoke(new aok0(ijf1.b, yoi1.p((((cfl1) ven0Var.getValue()).a ? dok0Var.a.a.b.t : ((cfl1) ven0Var.getValue()).b) + iIntValue2, Math.max(-i4, Math.min(0, (i2 - i5) - i3)), i), false, true, iIntValue2));
                break;
        }
        return rih1Var;
    }
}
