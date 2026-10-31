package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lv11 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ j2i f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv11(c380 c380Var, boolean z, n4m n4mVar, bv11 bv11Var, q1v q1vVar, boolean z2, boolean z3, iix0 iix0Var, j2i j2iVar) {
        super(3);
        this.b = c380Var;
        this.c = z;
        this.g = n4mVar;
        this.h = bv11Var;
        this.i = q1vVar;
        this.d = z2;
        this.e = z3;
        this.t = iix0Var;
        this.f = j2iVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        String str;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        boolean z = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                jmb1 jmb1Var = (jmb1) obj7;
                String str2 = jmb1Var.b.b;
                vu30 vu30Var = (vu30) obj6;
                if (str2 == null || str2.length() == 0 || (vu30Var != null && (str = (String) jmb1Var.a.e.get("recsplanation")) != null && (!ihc1.y0(str)))) {
                    str2 = null;
                }
                u4p1.q(z, apo.r(1620000736, new m8m(jmb1Var, str2, (vu30) obj5, this.b, this.d, this.e, (vu30) obj4, this.f), b0kVar), b0kVar, 48);
                break;
            default:
                ew20 ew20Var = (ew20) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!this.b.isEmpty() || z) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-724168151);
                    i = 0;
                    u4p1.c(ew20Var, (n4m) obj7, (bv11) obj6, (q1v) obj5, this.d, this.e, x340Var2, iIntValue & 14);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-723968263);
                    x340Var3.r(false);
                    i = 0;
                }
                u4p1.m(this.b, 0L, x340Var, 0, 2);
                uwr uwrVar = cbx.a;
                u4p1.s(this.b, this.c, (iix0) obj4, cbx.a(x340Var).b.a, x340Var, 0);
                this.f.invoke(x340Var, Integer.valueOf(i));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv11(jmb1 jmb1Var, boolean z, vu30 vu30Var, vu30 vu30Var2, c380 c380Var, boolean z2, boolean z3, vu30 vu30Var3, j2i j2iVar) {
        super(3);
        this.g = jmb1Var;
        this.c = z;
        this.h = vu30Var;
        this.i = vu30Var2;
        this.b = c380Var;
        this.d = z2;
        this.e = z3;
        this.t = vu30Var3;
        this.f = j2iVar;
    }
}
