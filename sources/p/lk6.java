package p;

import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lk6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk6(float f, iu30 iu30Var, long j, float f2) {
        super(2);
        this.b = f;
        this.e = iu30Var;
        this.c = j;
        this.d = f2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        float f = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                cj6 cj6Var = (cj6) obj3;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean z = cj6Var.e;
                    String str = cj6Var.d;
                    if (!z) {
                        x340Var2.i0(-560176119);
                        FontWeight fontWeight = rk6.c;
                        boolean zD = x340Var2.d(f);
                        Object objT = x340Var2.T();
                        if (zD || objT == m4cVar) {
                            objT = new jk6((byte) 4, f);
                            x340Var2.s0(objT);
                        }
                        rk6.e(str, this.c, fontWeight, (iu30) objT, x340Var2, 384);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-560291780);
                        float f2 = this.b;
                        boolean zD2 = x340Var2.d(f2);
                        Object objT2 = x340Var2.T();
                        if (zD2 || objT2 == m4cVar) {
                            objT2 = new jk6((byte) 3, f2);
                            x340Var2.s0(objT2);
                        }
                        rk6.c(0, this.c, str, x340Var2, (iu30) objT2);
                        x340Var2.r(false);
                    }
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT3 = x340Var4.T();
                    if (zG || objT3 == m4cVar2) {
                        objT3 = new y9y(iu30Var, (byte) 4);
                        x340Var4.s0(objT3);
                    }
                    mod.d(l1f1.b, (qim0) null, this.b, (Function0) objT3, apo.r(1428821187, new y0v(this.c, f), x340Var4), x340Var4, 24582);
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT4 = x340Var4.T();
                    if (zG2 || objT4 == m4cVar2) {
                        objT4 = new y9y(iu30Var, (byte) 5);
                        x340Var4.s0(objT4);
                    }
                    mod.d(l1f1.c, (qim0) null, this.b, (Function0) objT4, apo.r(-8615188, new n5h((byte) 2, f), x340Var4), x340Var4, 24582);
                    boolean zG3 = x340Var4.g(iu30Var);
                    Object objT5 = x340Var4.T();
                    if (zG3 || objT5 == m4cVar2) {
                        objT5 = new y9y(iu30Var, (byte) 6);
                        x340Var4.s0(objT5);
                    }
                    mod.d(l1f1.d, (qim0) null, this.b, (Function0) objT5, apo.r(1788835275, new n5h((byte) 3, f), x340Var4), x340Var4, 24582);
                    boolean zG4 = x340Var4.g(iu30Var);
                    Object objT6 = x340Var4.T();
                    if (zG4 || objT6 == m4cVar2) {
                        objT6 = new y9y(iu30Var, (byte) 7);
                        x340Var4.s0(objT6);
                    }
                    mod.d(l1f1.e, (qim0) null, this.b, (Function0) objT6, apo.r(-708681558, new n5h((byte) 4, f), x340Var4), x340Var4, 24582);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk6(cj6 cj6Var, long j, float f, float f2) {
        super(2);
        this.e = cj6Var;
        this.c = j;
        this.b = f;
        this.d = f2;
    }
}
