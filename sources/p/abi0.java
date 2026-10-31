package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class abi0 extends hab0 implements xu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ hdn0 O0;
    public final /* synthetic */ yqg P0;
    public final /* synthetic */ j2i X;
    public final /* synthetic */ vu30 Y;
    public final /* synthetic */ hob1 Z;
    public final /* synthetic */ zen0 a;
    public final /* synthetic */ oiw0 b;
    public final /* synthetic */ cr00 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ hdn0 g;
    public final /* synthetic */ hdn0 h;
    public final /* synthetic */ j2i i;
    public final /* synthetic */ j2i t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abi0(zen0 zen0Var, oiw0 oiw0Var, cr00 cr00Var, boolean z, j2i j2iVar, boolean z2, hdn0 hdn0Var, hdn0 hdn0Var2, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, vu30 vu30Var, hob1 hob1Var, boolean z3, Function0 function0, hdn0 hdn0Var3, yqg yqgVar) {
        super(3);
        this.a = zen0Var;
        this.b = oiw0Var;
        this.c = cr00Var;
        this.d = z;
        this.e = j2iVar;
        this.f = z2;
        this.g = hdn0Var;
        this.h = hdn0Var2;
        this.i = j2iVar2;
        this.t = j2iVar3;
        this.X = j2iVar4;
        this.Y = vu30Var;
        this.Z = hob1Var;
        this.N0 = z3;
        this.O0 = hdn0Var3;
        this.P0 = yqgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        Object obj5;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        cr00 cr00Var = this.c;
        String str = cr00Var.d;
        zen0 zen0Var = this.a;
        Boolean bool = (Boolean) zen0Var.d.getValue();
        boolean zBooleanValue = bool.booleanValue();
        err0 err0Var = this.h;
        int iS = err0Var.s();
        err0 err0Var2 = this.O0;
        int iS2 = err0Var2.s();
        oiw0 oiw0Var = this.b;
        boolean z = oiw0Var != null && zBooleanValue;
        kiv kivVar = t4k.h;
        x340 x340Var2 = x340Var;
        wat watVar = (wat) x340Var2.k(kivVar);
        float f = pap1.y(new p3v(watVar.M0(iS)), new p3v(z ? watVar.M0(iS2) + 8.0f : 0.0f)).a;
        float f2 = zBooleanValue ? 8.0f : 16.0f;
        float fD = i2cVar.d();
        float fC = i2cVar.c();
        wat watVar2 = (wat) x340Var2.k(kivVar);
        err0 err0Var3 = this.g;
        p3v p3vVarT = yoi1.t(new p3v(fC - 32.0f), new p3v(0.0f), zjy.p(0.0f, new p3v((fD - 8.0f) - watVar2.M0(err0Var3.s()))));
        float f3 = p3vVarT.a;
        float f4 = yoi1.t(new p3v(((fC - 16.0f) - f) - f2), new p3v(0.0f), p3vVarT).a;
        boolean zG = x340Var2.g(str);
        Object objT = x340Var2.T();
        Object obj6 = objT;
        if (zG || objT == m4cVar) {
            Uri uri = Uri.parse(str);
            x340Var2.s0(uri);
            obj6 = uri;
        }
        Uri uri2 = (Uri) obj6;
        tob1 tob1VarA = z95.a(zBooleanValue ? f4 : f3, zBooleanValue ? irn1.o0(500, 0, bth.a, 2) : irn1.j0(), (String) null, x340Var2, 0, 12);
        gra graVar = een.d;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarO = sto1.o(u291.r(anm1.N("MDCAudioCarouselArtwork", uyn1.B(i2cVar.a(nim0Var, graVar), 8.0f, 16.0f, 0.0f, 0.0f, 12)), ((p3v) tob1VarA.getValue()).a), 10.0f, er31.b(4.0f), false, 0L, 0L, 28);
        gfh0 gfh0VarC = t1c.c(graVar, false);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarO);
        hzj.A.getClass();
        if (x340Var2.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(hmb0.t1);
        } else {
            x340Var2.v0();
        }
        nko1.H(gfh0VarC, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
        fwx fwxVarG = hso1.G(box.c, 0L, u7h.b(bth.n(cr00Var, x340Var2), 1.0f, 0.0f, 0.0f, 0.0f, 14), x340Var2, box.d, 22);
        eso1.e(uri2, isl.a, qim0VarD, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var2, 1073741872, 0, 3576);
        x340Var2.r(true);
        x340Var2.f0(841867719, bool);
        bth.g(cr00Var, this.e, this.d && zBooleanValue, false, false, uyn1.A(i2cVar.a(nim0Var, graVar), ((p3v) tob1VarA.getValue()).a + 24.0f, 16.0f, 8.0f, f + f2), true, this.f, x340Var2, 1600512, 0);
        x340Var2.r(false);
        if (oiw0Var == null) {
            x340Var2.i0(328771345);
            x340Var2.r(false);
        } else {
            x340Var2.i0(328771346);
            qim0 qim0VarB = uyn1.B(i2cVar.a(nim0Var, een.t), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            pxg1 pxg1VarO0 = irn1.o0(500, 0, bth.a, 2);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                obj4 = objT2;
                y7i0 y7i0Var = y7i0.d1;
                x340Var2.s0(y7i0Var);
                obj4 = y7i0Var;
            }
            obj4 = objT2;
            fq7.d(this.a, qim0VarB, xay.o(pxg1VarO0, (iu30) obj4), xay.f(2, irn1.j0()), (String) null, apo.r(-951327003, new iwf0(err0Var2, oiw0Var, this.P0, (byte) 15), x340Var2), x340Var2, 196608, 16);
            x340Var2.r(false);
        }
        qim0 qim0VarA = i2cVar.a(nim0Var, een.Y);
        boolean zI = x340Var2.i(err0Var3) | x340Var2.i(err0Var);
        Object objT3 = x340Var2.T();
        if (zI || objT3 == m4cVar) {
            i = 1;
            tih tihVar = new tih(err0Var3, err0Var, (byte) 1);
            x340Var2.s0(tihVar);
            obj5 = tihVar;
        } else {
            i = 1;
            obj5 = objT3;
        }
        bth.b(this.i, this.t, this.X, uyn1.B(ern1.x(qim0VarA, (iu30) obj5), 24.0f, 0.0f, 0.0f, 0.0f, 14), x340Var2, 3072);
        vu30 vu30Var = this.Y;
        if (vu30Var != null) {
            x340Var2.i0(330210986);
            sgc1.n((this.Z.a() ? 1 : 0) ^ i, u291.x(0.0f, ((p3v) tob1VarA.getValue()).a, i, uyn1.B(i2cVar.a(nim0Var, graVar), 4.0f, 12.0f, 0.0f, 0.0f, 12)), vu30Var, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.i0(330482949);
            x340Var2.r(false);
        }
        if (this.N0) {
            x340Var2.i0(330515158);
            zen0Var.w1(Boolean.FALSE);
            x340Var2.i0(330677381);
            x340Var2.r(false);
            x340Var2.r(false);
        } else {
            x340Var2.i0(330683333);
            x340Var2.r(false);
        }
        return rih1.a;
    }
}
