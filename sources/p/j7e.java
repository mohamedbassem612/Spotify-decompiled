package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j7e extends hab0 implements xu30 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ h7e b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7e(iu30 iu30Var, h7e h7eVar, long j, float f, float f2, long j2, float f3) {
        super(3);
        this.a = iu30Var;
        this.b = h7eVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = j2;
        this.g = f3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        jtr jtrVar = jtr.f;
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = ktd.n(x340Var);
        }
        idn0 idn0Var = (idn0) objT;
        iu30 iu30Var = this.a;
        boolean zG = x340Var.g(iu30Var);
        h7e h7eVar = this.b;
        boolean zG2 = zG | x340Var.g(h7eVar);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new i7e(iu30Var, h7eVar, (byte) 0);
            x340Var.s0(objT2);
        }
        nim0 nim0Var = nim0.a;
        qim0 qim0VarV = bin.v(nim0Var, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28);
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = jzd.i;
            x340Var.s0(objT3);
        }
        qim0 qim0VarB = s161.b(qim0VarV, false, (iu30) objT3);
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(x340Var).f;
        qim0 qim0VarC = u291.c(dug.f(i1p1.q(qim0VarB, er31.b(4.0f)), this.c, d4o1.a), 1.0f);
        float f = this.d * 2.0f;
        float f2 = this.e;
        qim0 qim0VarB2 = u291.b(0.0f, f + f2, 1, qim0VarC);
        jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
        hzj.A.getClass();
        if (x340Var.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(hmb0.t1);
        } else {
            x340Var.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String str = h7eVar.a;
        String str2 = h7eVar.d;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        uwo1.e(str, kx40.h(1.0f, uyn1.y(nim0Var, 8.0f, 8.0f), true), lee1.a(cbx.d(x340Var).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 12582911), this.f, (a0e1) null, (iu30) null, 2, false, new cjc0(h7eVar.c == 1 ? 3 : 2), 0, (qx8) null, x340Var, 0, 0, 1712);
        x340 x340Var2 = x340Var;
        if (str2 == null || !(!ihc1.y0(str2))) {
            x340Var2.i0(1317100852);
            x340Var2.r(false);
        } else {
            x340Var2.i0(1316705881);
            Uri uri = Uri.parse(str2);
            qim0 qim0VarU = k1u.u(nim0Var, x340Var2.k(t4k.n) == flb0.a ? 25.0f : -25.0f);
            float f3 = this.d;
            eso1.e(uri, isl.a, u291.r(eqr0.C(uyn1.B(qim0VarU, 0.0f, f3, 0.0f, f3, 5), this.g, 10.0f), f2).then(new i5j1(een.O0)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
            x340Var2 = x340Var2;
            x340Var2.r(false);
        }
        x340Var2.r(true);
        return rih1.a;
    }
}
