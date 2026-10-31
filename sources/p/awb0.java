package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class awb0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dwb0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ awb0(dwb0 dwb0Var, boolean z, byte b) {
        super(3);
        this.a = b;
        this.b = dwb0Var;
        this.c = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lee1 lee1Var;
        long j;
        lee1 lee1Var2;
        long j2;
        byte b = this.a;
        boolean z = this.c;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        dwb0 dwb0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(dwb0Var.g);
                String str = dwb0Var.a;
                qim0 qim0VarQ = i1p1.q(u291.f(nim0Var, 1.0f), er31.a);
                x2g0.o(uri, str, this.c, qim0VarQ, (b0k) obj2, 0);
                break;
            case 1:
                uwr uwrVar = cbx.a;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = dwb0Var.i;
                boolean z2 = dwb0Var.h;
                if (z2) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1006840273);
                    lee1Var = cbx.d(x340Var2).h;
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1006776909);
                    lee1Var = cbx.d(x340Var3).g;
                    x340Var3.r(false);
                }
                lee1 lee1Var3 = lee1Var;
                if (z2) {
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(-1006678794);
                    j = cbx.a(x340Var4).b.a;
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var;
                    x340Var5.i0(-1006622157);
                    j = cbx.a(x340Var5).b.b;
                    x340Var5.r(false);
                }
                uwo1.e(str2, x9p1.j(u291.D(nim0Var, een.R0, 2), z), lee1Var3, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                break;
            default:
                uwr uwrVar2 = cbx.a;
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = dwb0Var.b;
                boolean z3 = dwb0Var.h;
                if (z3) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(176781260);
                    lee1Var2 = cbx.d(x340Var7).h;
                    x340Var7.r(false);
                } else {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(176844624);
                    lee1Var2 = cbx.d(x340Var8).g;
                    x340Var8.r(false);
                }
                lee1 lee1Var4 = lee1Var2;
                if (z3) {
                    x340 x340Var9 = x340Var6;
                    x340Var9.i0(176942739);
                    j2 = cbx.a(x340Var9).b.a;
                    x340Var9.r(false);
                } else {
                    x340 x340Var10 = x340Var6;
                    x340Var10.i0(176999376);
                    j2 = cbx.a(x340Var10).b.b;
                    x340Var10.r(false);
                }
                uwo1.e(str3, x9p1.j(nim0Var, z), lee1Var4, j2, null, null, 2, false, new cjc0(2), 0, null, x340Var6, 0, 0, 1712);
                break;
        }
        return rih1Var;
    }
}
