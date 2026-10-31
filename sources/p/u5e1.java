package p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u5e1 implements xu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ elk1 c;
    public final /* synthetic */ idn0 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ hw61 f;
    public final /* synthetic */ j4e1 g;

    public u5e1(String str, boolean z, elk1 elk1Var, idn0 idn0Var, vu30 vu30Var, hw61 hw61Var, j4e1 j4e1Var) {
        this.a = str;
        this.b = z;
        this.c = elk1Var;
        this.d = idn0Var;
        this.e = vu30Var;
        this.f = hw61Var;
        this.g = j4e1Var;
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
            i5x0.Q0.g(this.a, vu30Var, this.b, false, this.c, this.d, this.e, (vu30) null, (vu30) null, this.f, this.g, (vzq0) null, (vu30) null, x340Var2, (iIntValue << 3) & ContentType.LONG_FORM_ON_DEMAND, 100663296, 196608);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
