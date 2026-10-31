package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hm80 extends hab0 implements zu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm80(pl80 pl80Var, int i, boolean z, iu30 iu30Var, ven0 ven0Var) {
        super(4);
        this.e = pl80Var;
        this.c = i;
        this.b = z;
        this.d = iu30Var;
        this.f = ven0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                pl80 pl80Var = (pl80) obj6;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 129) != 128)) {
                    x340Var2.b0();
                } else {
                    boolean z = i > 0;
                    int i2 = im80.b;
                    Instant instant = (Instant) ((ven0) obj5).getValue();
                    iu30 iu30Var = this.d;
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.i(pl80Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new x680(iu30Var, pl80Var, (byte) 3);
                        x340Var2.s0(objT);
                    }
                    t8p1.e(pl80Var, z, this.b, instant, (Function0) objT, null, x340Var2, 0);
                }
                break;
            default:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                l201 l201Var = (l201) obj5;
                int i3 = (iIntValue3 & 6) == 0 ? (x340Var3.g(aqb0Var) ? 4 : 2) | iIntValue3 : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i3 |= x340Var3.e(iIntValue2) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & i3, (i3 & 147) != 146)) {
                    x340Var4.b0();
                } else {
                    boolean z2 = this.b;
                    nim0 nim0Var = nim0.a;
                    if (z2 && iIntValue2 >= i) {
                        x340Var4.i0(-784618782);
                        ((phi0) obj6).c(0, 0, x340Var4, aqb0.b(aqb0Var, nim0Var, (pxg1) null, (ni20) null, 7));
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-784529564);
                        lfi1 lfi1Var = ((fxz0) l201Var.a.a.a.get(iIntValue2)).b;
                        phi0 phi0Var = (phi0) obj6;
                        String str = l201Var.c;
                        if (str == null) {
                            str = "";
                        }
                        phi0Var.f(lfi1Var, fqo1.E(lfi1Var, str), this.d, aqb0.b(aqb0Var, nim0Var, (pxg1) null, (ni20) null, 7), x340Var4, 0);
                        x340Var4.r(false);
                    }
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm80(boolean z, int i, phi0 phi0Var, l201 l201Var, iu30 iu30Var) {
        super(4);
        this.b = z;
        this.c = i;
        this.e = phi0Var;
        this.f = l201Var;
        this.d = iu30Var;
    }
}
