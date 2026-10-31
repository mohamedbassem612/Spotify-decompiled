package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ghv extends hab0 implements vu30 {
    public final /* synthetic */ vu30 X;
    public final /* synthetic */ j2i Y;
    public final /* synthetic */ vu30 Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ idn0 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ long i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ghv(qim0 qim0Var, int i, boolean z, String str, Function0 function0, idn0 idn0Var, float f, long j, boolean z2, vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = i;
        this.d = z;
        this.e = str;
        this.f = function0;
        this.g = idn0Var;
        this.h = f;
        this.i = j;
        this.t = z2;
        this.X = vu30Var;
        this.Y = j2iVar;
        this.Z = vu30Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, this.b);
                    if (this.c == 1) {
                        qim0VarJ = qim0VarJ.then(bin.v(nim0.a, this.g, (ga80) null, this.d, (String) null, (pm31) null, this.f, 24));
                    }
                    boolean z = this.d;
                    boolean zH = x340Var2.h(z);
                    String str = this.e;
                    boolean zG = zH | x340Var2.g(str);
                    Function0 function0 = this.f;
                    boolean zG2 = zG | x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG2 || objT == m4cVar) {
                        objT = new ehv(z, str, function0);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0VarJ, true, (iu30) objT);
                    x340Var2.j0(475845883);
                    wat watVar = (wat) x340Var2.k(t4k.h);
                    x340Var2.j0(-492369756);
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = x0d.o(watVar, x340Var2);
                    }
                    x340Var2.r(false);
                    ufh0 ufh0Var = (ufh0) objT2;
                    x340Var2.j0(-492369756);
                    Object objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = x0d.m(x340Var2);
                    }
                    x340Var2.r(false);
                    xhl xhlVar = (xhl) objT3;
                    x340Var2.j0(-492369756);
                    Object objT4 = x340Var2.T();
                    if (objT4 == m4cVar) {
                        objT4 = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT4);
                    }
                    x340Var2.r(false);
                    ven0 ven0Var = (ven0) objT4;
                    x340Var2.j0(-492369756);
                    Object objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = x0d.n(xhlVar, x340Var2);
                    }
                    x340Var2.r(false);
                    nil nilVar = (nil) objT5;
                    x340Var2.j0(-492369756);
                    Object objT6 = x340Var2.T();
                    if (objT6 == m4cVar) {
                        objT6 = bb00.i(rih1Var, f331.X0, x340Var2);
                    }
                    x340Var2.r(false);
                    ven0 ven0Var2 = (ven0) objT6;
                    who1.h(s161.b(qim0VarB, false, new tu(ufh0Var, (byte) 4)), apo.i(x340Var2, -1488813576, new fhv(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 4), this.g, this.h, this.i, this.t, this.d, this.c, this.f, this.X, this.Y, this.Z)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 4), x340Var2, 48);
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    b3o1.j(cbx.d(x340Var4).j, cbx.a(x340Var4).b.a, apo.r(288449035, new ghv(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (byte) 0), x340Var4), x340Var4, 384, 0);
                }
                break;
        }
        return rih1Var;
    }
}
