package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qv11 extends hab0 implements xu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ n4m d;
    public final /* synthetic */ bv11 e;
    public final /* synthetic */ dt11 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv11(String str, boolean z, boolean z2, n4m n4mVar, bv11 bv11Var, dt11 dt11Var, boolean z3, boolean z4, String str2, djc0 djc0Var) {
        super(3);
        this.i = str;
        this.b = z;
        this.c = z2;
        this.d = n4mVar;
        this.e = bv11Var;
        this.f = dt11Var;
        this.g = z3;
        this.h = z4;
        this.t = str2;
        this.X = djc0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        lee1 lee1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.X;
        boolean z = this.b;
        dt11 dt11Var = this.f;
        Object obj5 = this.t;
        Object obj6 = this.i;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ew20 ew20Var = (ew20) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1045099686);
                    u4p1.c(ew20Var, this.d, this.e, dt11Var.a(1), this.c, this.g, x340Var2, iIntValue & 14);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1044903642);
                    x340Var3.r(false);
                }
                uwr uwrVar = cbx.a;
                u4p1.m((c380) obj6, cbx.a(x340Var).b.b, x340Var, 0, 0);
                long j = cbx.a(x340Var).b.b;
                u4p1.s((c380) obj6, this.h, (iix0) obj5, j, x340Var, 0);
                x340 x340Var4 = x340Var;
                x340Var4.i0(1213228004);
                ((j2i) obj4).invoke(x340Var4, 0);
                x340Var4.r(false);
                break;
            default:
                uwr uwrVar2 = cbx.a;
                ew20 ew20Var2 = (ew20) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                String str = (String) obj5;
                String str2 = (String) obj6;
                if (str2 == null || !z) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(775308655);
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(775150803);
                    eso1.e(Uri.parse(str2), isl.a, (qim0) null, new p3v(20.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var7, 48, 0, 4084);
                    x340Var7.r(false);
                }
                if (this.c) {
                    x340 x340Var8 = x340Var5;
                    x340Var8.i0(775555663);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var5;
                    x340Var9.i0(775359619);
                    u4p1.c(ew20Var2, this.d, this.e, dt11Var.a(1), this.g, this.h, x340Var9, iIntValue2 & 14);
                    x340Var9.r(false);
                }
                bv11 bv11Var = this.e;
                u4p1.p(bv11Var.m, dt11Var.a(2), x340Var5, 0);
                if (!bv11Var.m || str.length() <= 0) {
                    x340 x340Var10 = x340Var5;
                    x340Var10.i0(775785807);
                    x340Var10.r(false);
                } else {
                    x340 x340Var11 = x340Var5;
                    x340Var11.i0(775723342);
                    u4p1.C(cbx.a(x340Var11).b.b, x340Var11, 0);
                    x340Var11.r(false);
                }
                if (str.length() <= 0) {
                    x340 x340Var12 = x340Var5;
                    x340Var12.i0(776167727);
                    x340Var12.r(false);
                } else {
                    x340 x340Var13 = x340Var5;
                    x340Var13.i0(775839778);
                    if (str2 == null || !z) {
                        x340Var13.i0(-1637532740);
                        lee1Var = cbx.d(x340Var13).j;
                        x340Var13.r(false);
                    } else {
                        x340Var13.i0(-1637534304);
                        lee1Var = cbx.d(x340Var13).k;
                        x340Var13.r(false);
                    }
                    uwo1.e(str, null, lee1Var, cbx.a(x340Var13).b.b, null, null, 2, false, (djc0) obj4, 0, null, x340Var13, 0, 0, 1714);
                    x340Var13.r(false);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv11(boolean z, n4m n4mVar, bv11 bv11Var, dt11 dt11Var, boolean z2, boolean z3, c380 c380Var, boolean z4, iix0 iix0Var, j2i j2iVar) {
        super(3);
        this.b = z;
        this.d = n4mVar;
        this.e = bv11Var;
        this.f = dt11Var;
        this.c = z2;
        this.g = z3;
        this.i = c380Var;
        this.h = z4;
        this.t = iix0Var;
        this.X = j2iVar;
    }
}
