package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ev11 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ev11(cs11 cs11Var, byte b) {
        super(3);
        this.a = b;
        this.b = cs11Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        cs11 cs11Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(cs11Var.c);
                qim0 qim0VarN = anm1.N("release_row_artwork", i1p1.q(nim0Var, er31.b(4.0f)));
                akx akxVar = akx.c;
                nux nuxVar = new nux(akxVar, akxVar);
                as80 as80Var = mif1.P0;
                uwr uwrVar = cbx.a;
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                zov0 zov0Var = cbx.b(b0kVar).g;
                eso1.e(uri, isl.a, qim0VarN, new p3v(88.0f), (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073741872, 0, 3472);
                return rih1Var;
            case 1:
                uwr uwrVar2 = cbx.a;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                if (cs11Var.d != null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-780816298);
                    if (cs11Var.g) {
                        x340Var2.i0(-1549206142);
                        j = cbx.a(x340Var2).b.c;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1549204579);
                        j = cbx.a(x340Var2).b.b;
                        x340Var2.r(false);
                    }
                    long j2 = j;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), een.Z, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    xrx xrxVar = xrx.c;
                    zov0 zov0Var2 = cbx.b(x340Var2).g;
                    w0h1.a(xrxVar, isl.a, anm1.N("release_row_preTitleIcon", u291.r(nim0Var, 16.0f)), j2, 0L, false, x340Var2, xrx.d | 48, 48);
                    uwo1.e(cs11Var.d, anm1.N("release_row_preTitle", nim0Var), cbx.d(x340Var2).j, j2, null, null, 2, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1712);
                    x340Var2.r(true);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-779964852);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var4).b;
                jw31 jw31VarA2 = ew31.a(new d36(6.0f, true, new um5(false)), een.N0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(jw31VarA2, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                if (cs11Var.f) {
                    x340Var6.i0(-1406462546);
                    xap1.f(0, 1, x340Var4, null);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-1406428911);
                    x340Var6.r(false);
                }
                uwo1.e(cs11Var.b, anm1.N("release_row_subtitle", nim0Var), cbx.d(x340Var4).j, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var4, 0, 0, 1720);
                x340Var6.r(true);
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (cs11Var.e) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(-113464323);
                    w0h1.a(plx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var8, plx.d | 48, 60);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(-113324978);
                    x340Var9.r(false);
                }
                return rih1Var;
        }
    }
}
