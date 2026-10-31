package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q5a extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x5a b;
    public final /* synthetic */ o8j0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5a(x5a x5aVar, o8j0 o8j0Var, iu30 iu30Var, boolean z, byte b) {
        super(2);
        this.a = b;
        this.b = x5aVar;
        this.c = o8j0Var;
        this.d = iu30Var;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (!b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b0kVar2.b0();
                } else {
                    this.b.b(this.c, this.d, this.e, null, false, false, b0kVar2, 8, 56);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                this.b.a(this.c, this.d, this.e, (b0k) obj, czo1.p(393));
                break;
            case 2:
                b0k b0kVar3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (!b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b0kVar4.b0();
                } else {
                    this.b.b(this.c, this.d, this.e, null, false, false, b0kVar4, 221192, 8);
                }
                break;
            case 3:
                b0k b0kVar5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                b0k b0kVar6 = (x340) b0kVar5;
                if (!b0kVar6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    b0kVar6.b0();
                } else {
                    this.b.c(this.c, this.d, this.e, b0kVar6, 8);
                }
                break;
            default:
                ((Number) obj2).intValue();
                this.b.a(this.c, this.d, this.e, (b0k) obj, czo1.p(393));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q5a(x5a x5aVar, o8j0 o8j0Var, iu30 iu30Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = x5aVar;
        this.c = o8j0Var;
        this.d = iu30Var;
        this.e = z;
    }
}
