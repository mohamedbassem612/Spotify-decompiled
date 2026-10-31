package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i0j0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hrr0 b;
    public final /* synthetic */ wmy c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0j0(hrr0 hrr0Var, wmy wmyVar, String str, String str2, String str3, byte b) {
        super(2);
        this.a = b;
        this.b = hrr0Var;
        this.c = wmyVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    hrr0 hrr0Var = this.b;
                    if (!((Boolean) hrr0Var.getValue()).booleanValue()) {
                        x340Var2.i0(287789663);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(287220751);
                        boolean zI = x340Var2.i(hrr0Var);
                        wmy wmyVar = this.c;
                        boolean zI2 = zI | x340Var2.i(wmyVar);
                        Object objT = x340Var2.T();
                        if (zI2 || objT == fkj0.X) {
                            objT = new dvg0(wmyVar, hrr0Var, (byte) 11);
                            x340Var2.s0(objT);
                        }
                        x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-2119561015, new jb1(this.d, hrr0Var, this.c, this.e, this.f, (byte) 20), x340Var2), x340Var2, 0, 48, 2046);
                        x340Var2.r(false);
                    }
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-2089878109, new i0j0(this.b, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
