package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kq90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cir0 b;
    public final /* synthetic */ obk1 c;
    public final /* synthetic */ ye90 d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ ViewGroup f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq90(cir0 cir0Var, obk1 obk1Var, ye90 ye90Var, j2i j2iVar, ViewGroup viewGroup, byte b) {
        super(2);
        this.a = b;
        this.b = cir0Var;
        this.c = obk1Var;
        this.d = ye90Var;
        this.e = j2iVar;
        this.f = viewGroup;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    rce0.a(cwl1.B(this.b.g()), apo.r(917977322, new cb60(this.c, this.d, this.e, this.f, (byte) 12), x340Var2), x340Var2, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    cir0 cir0Var = this.b;
                    k2r0.a(cir0Var, apo.r(-1228332679, new kq90(cir0Var, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
