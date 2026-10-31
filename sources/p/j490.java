package p;

import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j490 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ Function0 O0;
    public final /* synthetic */ boolean P0;
    public final /* synthetic */ Function0 Q0;
    public final /* synthetic */ String R0;
    public final /* synthetic */ String S0;
    public final /* synthetic */ float T0;
    public final /* synthetic */ boolean U0;
    public final /* synthetic */ iu30 V0;
    public final /* synthetic */ y7e1 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ File Z;
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ y7e1 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ y7e1 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j490(Function0 function0, boolean z, boolean z2, boolean z3, boolean z4, String str, y7e1 y7e1Var, String str2, y7e1 y7e1Var2, String str3, y7e1 y7e1Var3, String str4, File file, int i, Function0 function1, boolean z5, Function0 function2, String str5, String str6, float f, boolean z6, iu30 iu30Var) {
        super(2);
        this.a = function0;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str;
        this.g = y7e1Var;
        this.h = str2;
        this.i = y7e1Var2;
        this.t = str3;
        this.X = y7e1Var3;
        this.Y = str4;
        this.Z = file;
        this.N0 = i;
        this.O0 = function1;
        this.P0 = z5;
        this.Q0 = function2;
        this.R0 = str5;
        this.S0 = str6;
        this.T0 = f;
        this.U0 = z6;
        this.V0 = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        hax haxVar;
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        b0k b0kVar2 = (x340) b0kVar;
        boolean zY = b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = ((x340) b0kVar2).a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            qim0 qim0VarH = l6o1.H(kk0.q(b0kVar2, qim0VarE, lljVar4, 1.0f, true), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            mbh mbhVarA2 = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarH);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            String strO0 = cwl1.o0(b0kVar2, 2131956762);
            vy5 vy5Var = vy5.e;
            g820 g820VarM = k8p1.m(vy5Var, AdvertisementType.OTHER);
            y7e1 y7e1Var = this.g;
            d6e1 d6e1Var = d6e1.b;
            d7e.f(strO0, y7e1Var, d6e1Var, g820VarM, (kua0) null, (fam) null, (vu30) null, this.h, b0kVar2, 0, ContentType.LONG_FORM_ON_DEMAND);
            d7e.f(cwl1.o0(b0kVar2, 2131956746), this.i, new c6e1(3, 12), k8p1.m(vy5Var, 2000), (kua0) null, (fam) null, (vu30) null, this.t, b0kVar2, 0, ContentType.LONG_FORM_ON_DEMAND);
            String strO1 = cwl1.o0(b0kVar2, 2131956756);
            kua0 kua0Var = new kua0(0, null, 6, 0, ContentType.USER_GENERATED_LIVE);
            fam.a.getClass();
            qb4 qb4Var = s9m.b;
            qb4 qb4Var2 = s9m.d;
            qb4Var.getClass();
            d7e.f(strO1, this.X, d6e1Var, (dk80) null, kua0Var, new qb4(dm61.y0(qb4Var.b, qb4Var2.b)), dti.a, this.Y, b0kVar2, 1572864, 8);
            File file = this.Z;
            if (file == null) {
                b0kVar2.i0(860624570);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(860624571);
                d7e.b(file, this.T0, this.U0, this.V0, b0kVar2, 0);
                b0kVar2.r(false);
            }
            boolean z2 = this.b;
            boolean z3 = !z2;
            d7e.a(this.N0, 0, this.O0, b0kVar2, z3);
            if (this.P0) {
                b0kVar2.i0(861057114);
                d7e.j(0, this.Q0, b0kVar2, z3);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(861142643);
                b0kVar2.r(false);
            }
            String str = this.R0;
            if (str == null) {
                b0kVar2.i0(861175719);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(861175720);
                uwo1.e(str, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.e, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            }
            String str2 = this.S0;
            if (str2 == null) {
                b0kVar2.i0(861368198);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(861368199);
                b0k b0kVar3 = b0kVar2;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                b0kVar2 = b0kVar3;
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            String strO2 = cwl1.o0(b0kVar2, 2131956760);
            qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), voo1.g);
            if (z2) {
                b0kVar2.i0(1774783290);
                haxVar = new hax(cwl1.o0(b0kVar2, 2131963559));
                b0kVar2.r(false);
            } else if (this.c && this.d && this.e) {
                b0kVar2.i0(1774790413);
                b0kVar2.r(false);
                haxVar = jax.a;
            } else {
                b0kVar2.i0(1774788822);
                b0kVar2.r(false);
                haxVar = new hax(this.f);
            }
            two1.d(this.a, strO2, qim0VarY, true, haxVar, b0kVar2, 3072);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        return rih1.a;
    }
}
