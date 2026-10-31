package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qvt0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mvt0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qvt0(mvt0 mvt0Var, byte b) {
        super(3);
        this.a = b;
        this.b = mvt0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        mvt0 mvt0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = mvt0Var.d;
                if (str == null) {
                    str = "";
                }
                Uri uri = Uri.parse(str);
                grx grxVar = grx.c;
                nux nuxVar = new nux(grxVar, grxVar);
                eso1.e(uri, isl.a, anm1.N("playable_row_image", u291.r(nim0Var, 64.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073741872, 0, 3576);
                return rih1Var;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = mvt0Var.c;
                uwr uwrVar = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                boolean z = mvt0Var.e;
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (z) {
                    x340Var3.i0(-2064715886);
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    wkt0.a(zkt0.a, u291.r(nim0Var, 12.0f), (ksl) null, 0L, false, x340Var, 6, 28);
                    cvx cvxVar = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.v(nim0Var, 8.0f));
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-2064459299);
                    x340Var3.r(false);
                }
                String str3 = mvt0Var.b;
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).g;
                if (z) {
                    x340Var3.i0(-1867705263);
                    j = cbx.a(x340Var).b.c;
                } else {
                    x340Var3.i0(-1867704023);
                    j = cbx.a(x340Var).b.a;
                }
                x340Var3.r(false);
                uwo1.e(str3, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var3.r(true);
                return rih1Var;
        }
    }
}
