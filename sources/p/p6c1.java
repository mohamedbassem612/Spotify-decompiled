package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p6c1 extends hab0 implements xu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ vnr0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ vnr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6c1(String str, vnr0 vnr0Var, float f, boolean z, int i, vnr0 vnr0Var2) {
        super(3);
        this.a = str;
        this.b = vnr0Var;
        this.c = f;
        this.d = z;
        this.e = i;
        this.f = vnr0Var2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function0 function0;
        boolean z;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
        gra graVar = een.d;
        gfh0 gfh0VarC = t1c.c(graVar, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z2 = x340Var3.S;
        Function0 function1 = hmb0.t1;
        if (z2) {
            x340Var3.l(function1);
        } else {
            x340Var3.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(gfh0VarC, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        h2c h2cVar = h2c.a;
        qim0 qim0VarB = h2cVar.b(nim0Var);
        Uri uri = Uri.parse(this.a);
        uwr uwrVar = cbx.a;
        i9h i9hVar = new i9h(cbx.a(x340Var).a.b.a());
        pux puxVar = new pux(i9hVar, i9hVar);
        isl islVar = isl.a;
        eso1.e(uri, islVar, qim0VarB, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, puxVar, false, false, x340Var, 1073741872, 0, 3576);
        qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 0.686f);
        gra graVar2 = een.h;
        qim0 qim0VarA = h2cVar.a(qim0VarC, graVar2);
        gfh0 gfh0VarC2 = t1c.c(graVar, false);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
        x340Var3.m0();
        if (x340Var3.S) {
            function0 = function1;
            x340Var3.l(function0);
        } else {
            function0 = function1;
            x340Var3.v0();
        }
        nko1.H(gfh0VarC2, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        qim0 qim0VarB2 = uyn1.B(h2cVar.a(u291.d(nim0Var, 1.0f), graVar2), 16.0f, 0.0f, 16.0f, 16.0f, 2);
        era eraVar = een.Q0;
        b36 b36Var = h36.e;
        mbh mbhVarA = jbh.a(b36Var, eraVar, x340Var, 0);
        int iHashCode3 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM3 = x340Var3.m();
        qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB2);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(function0);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, lljVar);
        nko1.H(xos0VarM3, x340Var, lljVar2);
        i3a.l(iHashCode3, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE3, x340Var, lljVar4);
        vnr0 vnr0Var = this.b;
        float f = this.c;
        vnr0 vnr0VarA = gqg0.a(vnr0Var, f);
        Object objT = x340Var3.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = axb1.X0;
            x340Var3.s0(objT);
        }
        qgo1.f(vnr0VarA, s161.a(nim0Var, (iu30) objT), new a0e1(3), 0, false, null, x340Var, 8, 56);
        if (this.d) {
            x340Var3.i0(2031980936);
            qim0 qim0VarB3 = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(b36Var, een.Z, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM4 = x340Var3.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB3);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(function0);
            } else {
                x340Var3.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            i3a.l(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            ilx ilxVar = ilx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            z = true;
            w0h1.a(ilxVar, islVar, anm1.N("checked_icon", u291.r(nim0Var, 12.0f)), z4p1.e(this.e), 0L, false, x340Var, ilx.d | 48, 48);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            vnr0 vnr0VarA2 = gqg0.a(this.f, f);
            qim0 qim0VarN = anm1.N("story_viewed_paragraph", nim0Var);
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = axb1.Y0;
                x340Var3.s0(objT2);
            }
            qgo1.f(vnr0VarA2, s161.a(qim0VarN, (iu30) objT2), null, 0, false, null, x340Var, 8, 60);
            x340Var3.r(true);
            x340Var3.r(false);
        } else {
            z = true;
            x340Var3.i0(2032689193);
            x340Var3.r(false);
        }
        us71.m(x340Var3, z, z, z);
        return rih1.a;
    }
}
