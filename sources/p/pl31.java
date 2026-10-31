package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pl31 extends hab0 implements xu30 {
    public final /* synthetic */ ll31 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kj31 c;
    public final /* synthetic */ vnr0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ vnr0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl31(ll31 ll31Var, boolean z, kj31 kj31Var, vnr0 vnr0Var, float f, boolean z2, int i, vnr0 vnr0Var2) {
        super(3);
        this.a = ll31Var;
        this.b = z;
        this.c = kj31Var;
        this.d = vnr0Var;
        this.e = f;
        this.f = z2;
        this.g = i;
        this.h = vnr0Var2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h2c h2cVar;
        b0k b0kVar;
        llj lljVar;
        boolean z;
        b0k b0kVar2 = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
        gra graVar = een.d;
        gfh0 gfh0VarC = t1c.c(graVar, false);
        x340 x340Var = (x340) b0kVar2;
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
        hzj.A.getClass();
        x340 x340Var2 = (x340) b0kVar2;
        if (x340Var2.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var2.m0();
        boolean z2 = x340Var2.S;
        n4k n4kVar = hmb0.t1;
        if (z2) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        llj lljVar2 = y580.O0;
        nko1.H(gfh0VarC, b0kVar2, lljVar2);
        llj lljVar3 = y580.N0;
        nko1.H(xos0VarM, b0kVar2, lljVar3);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar4 = y580.R0;
        nko1.H(numValueOf, b0kVar2, lljVar4);
        nko1.F(b0kVar2);
        llj lljVar5 = y580.Y;
        nko1.H(qim0VarE, b0kVar2, lljVar5);
        h2c h2cVar2 = h2c.a;
        qim0 qim0VarB = h2cVar2.b(nim0Var);
        uwr uwrVar = cbx.a;
        qim0 qim0VarF = dug.f(qim0VarB, cbx.a(b0kVar2).a.b.a(), d4o1.a);
        gfh0 gfh0VarC2 = t1c.c(graVar, false);
        int iHashCode2 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM2 = x340Var2.m();
        qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(gfh0VarC2, b0kVar2, lljVar2);
        nko1.H(xos0VarM2, b0kVar2, lljVar3);
        i3a.l(iHashCode2, b0kVar2, lljVar4, b0kVar2);
        nko1.H(qim0VarE2, b0kVar2, lljVar5);
        ll31 ll31Var = this.a;
        if (ll31Var instanceof kl31) {
            x340Var2.i0(380523460);
            h2cVar = h2cVar2;
            b0kVar = b0kVar2;
            lljVar = lljVar4;
            apo.e(((kl31) ll31Var).a, this.b, this.c, u291.d(nim0Var, 1.0f), b0kVar, 0);
            x340Var2.r(false);
        } else {
            h2cVar = h2cVar2;
            b0kVar = b0kVar2;
            lljVar = lljVar4;
            x340Var2.i0(380748334);
            x340Var2.r(false);
        }
        x340Var2.r(true);
        qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 0.686f);
        gra graVar2 = een.h;
        qim0 qim0VarA = h2cVar.a(qim0VarC, graVar2);
        gfh0 gfh0VarC3 = t1c.c(graVar, false);
        int iHashCode3 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM3 = x340Var2.m();
        qim0 qim0VarE3 = zr7.E(b0kVar, qim0VarA);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(gfh0VarC3, b0kVar, lljVar2);
        nko1.H(xos0VarM3, b0kVar, lljVar3);
        i3a.l(iHashCode3, b0kVar, lljVar, b0kVar);
        nko1.H(qim0VarE3, b0kVar, lljVar5);
        qim0 qim0VarB2 = uyn1.B(h2cVar.a(u291.d(nim0Var, 1.0f), graVar2), 16.0f, 0.0f, 16.0f, 0.0f, 10);
        era eraVar = een.Q0;
        b36 b36Var = h36.e;
        mbh mbhVarA = jbh.a(b36Var, eraVar, b0kVar, 0);
        int iHashCode4 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM4 = x340Var2.m();
        qim0 qim0VarE4 = zr7.E(b0kVar, qim0VarB2);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(mbhVarA, b0kVar, lljVar2);
        nko1.H(xos0VarM4, b0kVar, lljVar3);
        i3a.l(iHashCode4, b0kVar, lljVar, b0kVar);
        nko1.H(qim0VarE4, b0kVar, lljVar5);
        vnr0 vnr0Var = this.d;
        float f = this.e;
        vnr0 vnr0VarA = vnr0.a(gqg0.a(vnr0Var, f), (String) null, lee1.a(vnr0Var.b, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744447), (kor0) null, 0L, 29);
        Object objT = x340Var2.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = oe31.d1;
            x340Var2.s0(objT);
        }
        llj lljVar6 = lljVar;
        b0k b0kVar3 = b0kVar;
        qgo1.f(vnr0VarA, s161.a(nim0Var, (iu30) objT), new a0e1(3), 0, false, (iu30) null, b0kVar3, 8, 56);
        if (this.f) {
            x340Var2.i0(1411212585);
            qim0 qim0VarB3 = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(b36Var, een.Z, b0kVar3, 0);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(b0kVar3, qim0VarB3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar2);
            nko1.H(xos0VarM5, b0kVar3, lljVar3);
            i3a.l(iHashCode5, b0kVar3, lljVar6, b0kVar3);
            nko1.H(qim0VarE5, b0kVar3, lljVar5);
            ilx ilxVar = ilx.c;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            w0h1.a(ilxVar, isl.a, anm1.N("checked_icon", u291.r(nim0Var, 12.0f)), z4p1.e(this.g), 0L, false, b0kVar3, ilx.d | 48, 48);
            op71.g(b0kVar3, u291.v(nim0Var, 8.0f));
            vnr0 vnr0VarA2 = gqg0.a(this.h, f);
            qim0 qim0VarN = anm1.N("story_viewed_paragraph", nim0Var);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = oe31.e1;
                x340Var2.s0(objT2);
            }
            qgo1.f(vnr0VarA2, s161.a(qim0VarN, (iu30) objT2), (a0e1) null, 0, false, (iu30) null, b0kVar3, 8, 60);
            z = true;
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            z = true;
            x340Var2.i0(1411942945);
            x340Var2.r(false);
        }
        us71.m(x340Var2, z, z, z);
        return rih1.a;
    }
}
