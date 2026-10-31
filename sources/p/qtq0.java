package p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qtq0 implements xu30 {
    public final /* synthetic */ j4e1 X;
    public final /* synthetic */ hw61 Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ elk1 d;
    public final /* synthetic */ idn0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ vu30 t;

    public qtq0(String str, boolean z, boolean z2, elk1 elk1Var, idn0 idn0Var, boolean z3, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, j4e1 j4e1Var, hw61 hw61Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = elk1Var;
        this.e = idn0Var;
        this.f = z3;
        this.g = vu30Var;
        this.h = vu30Var2;
        this.i = vu30Var3;
        this.t = vu30Var4;
        this.X = j4e1Var;
        this.Y = hw61Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vu30 vu30Var = (vu30) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            as10 as10Var = as10.U0;
            hw61 hw61Var = this.Y;
            boolean z = this.b;
            boolean z2 = this.f;
            idn0 idn0Var = this.e;
            j4e1 j4e1Var = this.X;
            as10Var.c(this.a, vu30Var, z, this.c, this.d, idn0Var, z2, this.g, this.h, this.i, this.t, j4e1Var, (vzq0) null, apo.r(-656940872, new ptq0(z, z2, idn0Var, j4e1Var, hw61Var, (byte) 0), x340Var2), x340Var2, (iIntValue << 3) & ContentType.LONG_FORM_ON_DEMAND);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
