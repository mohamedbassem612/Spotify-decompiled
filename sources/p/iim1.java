package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iim1 extends hab0 implements xu30 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ h7e b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yae1 e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iim1(iu30 iu30Var, h7e h7eVar, long j, boolean z, yae1 yae1Var, lee1 lee1Var, boolean z2, long j2) {
        super(3);
        this.a = iu30Var;
        this.b = h7eVar;
        this.c = j;
        this.d = z;
        this.e = yae1Var;
        this.f = lee1Var;
        this.g = z2;
        this.h = j2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object him1Var;
        h7e h7eVar;
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
        h7e h7eVar2 = this.b;
        boolean zG2 = zG | x340Var.g(h7eVar2);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new i7e(iu30Var, h7eVar2, (byte) 1);
            x340Var.s0(objT2);
        }
        nim0 nim0Var = nim0.a;
        qim0 qim0VarV = bin.v(nim0Var, idn0Var, jtrVar, false, (String) null, (pm31) null, (Function0) objT2, 28);
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = gbm1.P0;
            x340Var.s0(objT3);
        }
        qim0 qim0VarB = u291.b(0.0f, 101.0f, 1, u291.c(dug.f(i1p1.q(s161.b(qim0VarV, false, (iu30) objT3), er31.b(4.0f)), this.c, d4o1.a), 1.0f));
        boolean zD = x340Var.d(8.0f) | x340Var.d(85.0f);
        Object objT4 = x340Var.T();
        if (zD || objT4 == m4cVar) {
            objT4 = new td4((byte) 19);
            x340Var.s0(objT4);
        }
        gfh0 gfh0Var = (gfh0) objT4;
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
        nko1.H(gfh0Var, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        boolean zG3 = x340Var.g(h7eVar2);
        Object objT5 = x340Var.T();
        if (zG3 || objT5 == m4cVar) {
            objT5 = new c4m1(h7eVar2, (byte) 8);
            x340Var.s0(objT5);
        }
        qim0 qim0VarB2 = s161.b(nim0Var, false, (iu30) objT5);
        boolean zD2 = x340Var.d(8.0f);
        boolean z = this.d;
        boolean zH = zD2 | x340Var.h(z);
        yae1 yae1Var = this.e;
        boolean zI = zH | x340Var.i(yae1Var);
        lee1 lee1Var = this.f;
        boolean zI2 = zI | x340Var.i(lee1Var) | x340Var.d(8.0f) | x340Var.g(h7eVar2);
        boolean z2 = this.g;
        boolean zH2 = zI2 | x340Var.h(z2);
        long j = this.h;
        boolean zF = x340Var.f(j) | zH2;
        Object objT6 = x340Var.T();
        if (zF || objT6 == m4cVar) {
            him1Var = new him1(z, yae1Var, lee1Var, h7eVar2, z2, j);
            h7eVar = h7eVar2;
            x340Var.s0(him1Var);
        } else {
            him1Var = objT6;
            h7eVar = h7eVar2;
        }
        op71.g(x340Var, exd0.r(qim0VarB2, (iu30) him1Var));
        if (z) {
            x340Var.i0(-1092396771);
            eso1.e(Uri.parse(h7eVar.d), isl.a, u291.r(eqr0.C(uyn1.B(k1u.u(nim0Var, z2 ? 25.0f : -25.0f), 0.0f, 8.0f, 0.0f, 8.0f, 5), 25.0f, 10.0f), 85.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
            x340Var.r(false);
        } else {
            x340Var.i0(-1091819210);
            x340Var.r(false);
        }
        x340Var.r(true);
        return rih1.a;
    }
}
