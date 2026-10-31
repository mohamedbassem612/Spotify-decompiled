package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jtd extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ etd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jtd(etd etdVar, byte b) {
        super(3);
        this.a = b;
        this.b = etdVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        x340 x340Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        etd etdVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(etdVar.a);
                as80 as80Var = mif1.S0;
                box boxVar = box.c;
                nux nuxVar = new nux(boxVar, boxVar);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                eso1.e(uri, isl.a, u291.r(i1p1.q(nim0Var, er31.b(6.0f)), 156.0f), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, b0kVar, 1073966128, 0, 3456);
                return rih1Var;
            case 1:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(false)), een.N0, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                if (etdVar.i) {
                    x340Var4.i0(-713897035);
                    xap1.f(0, 1, x340Var2, null);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-713855712);
                    x340Var4.r(false);
                }
                if (etdVar.c.length() > 0) {
                    x340Var4.i0(-713782304);
                    String str = etdVar.c;
                    cjc0 cjc0Var = etdVar.b.length() == 0 ? new cjc0(2) : new cjc0(1);
                    z = true;
                    x340Var = x340Var4;
                    uwo1.e(str, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(5), null, 2, false, cjc0Var, 0, null, x340Var2, 0, 0, 1698);
                    x340Var.r(false);
                } else {
                    z = true;
                    x340Var = x340Var4;
                    x340Var.i0(-713430144);
                    x340Var.r(false);
                }
                x340Var.r(z);
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (etdVar.b.length() > 0) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(-166535733);
                    String str2 = etdVar.b;
                    cjc0 cjc0Var2 = new cjc0(2);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str2, null, cbx.d(x340Var6).k, cbx.a(x340Var6).b.a, new a0e1(5), null, 2, false, cjc0Var2, 0, null, x340Var6, 0, 0, 1698);
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(-166289531);
                    x340Var7.r(false);
                }
                return rih1Var;
        }
    }
}
