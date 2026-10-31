package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e0a extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(l1f1 l1f1Var, qim0 qim0Var, float f, Function0 function0, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 8;
        this.c = l1f1Var;
        this.f = qim0Var;
        this.b = f;
        this.d = function0;
        this.e = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                b5p1.b((llw0) obj5, this.b, (jlw0) obj6, (g2z) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mod.c(new ely0[]{t4k.n.a((flb0) obj5), t4k.h.a((wat) obj6)}, apo.r(-1387684648, new gf((ven0) obj3, (j2i) obj4, f, (byte) 6), x340Var2), x340Var2, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ltn1.b((String) obj5, (Function0) obj6, (qim0) obj4, (hux) obj3, this.b, (b0k) obj, czo1.p(4097));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ppo1.j(this.b, (znb0) obj5, (hob1) obj6, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), f);
                    rzo0 rzo0Var = (rzo0) obj5;
                    gfq0 gfq0Var = (gfq0) obj6;
                    th61 th61Var = (th61) obj3;
                    ods odsVar = (ods) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarH);
                    hzj.A.getClass();
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
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    ((toj0) rzo0Var.c).a(gfq0Var, th61Var, odsVar, (qim0) null, (mr20) null, x340Var4, 0, 24);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                zxo1.j((String) obj5, (String) obj6, (String) obj3, this.b, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                wwo1.f((eq01) obj5, (gw70) obj6, (iu30) obj3, this.b, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                tlc1 tlc1Var = (tlc1) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.i0(77562871);
                    j2i j2iVar = (j2i) obj4;
                    Iterator it = ((c380) obj5).iterator();
                    while (it.hasNext()) {
                        j2iVar.J(pbh.a, new mmr0((y5c1) it.next(), new p3v(tlc1Var.N0(f))), x340Var6, 0);
                    }
                    x340Var6.r(false);
                    if (((String) obj6) != null) {
                        x340Var6.i0(-1890383071);
                        qim0 qim0VarN = anm1.N("baseline_title", u291.v(nim0Var, tlc1Var.N0(f)));
                        Object objT = x340Var6.T();
                        if (objT == fkj0.X) {
                            objT = axb1.W0;
                            x340Var6.s0(objT);
                        }
                        qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT);
                        uwr uwrVar = cbx.a;
                        uwo1.e((String) obj6, qim0VarA, cbx.d(x340Var6).k, cbx.a(x340Var6).b.b, new a0e1(1), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var6, 0, 0, 1696);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-1889895410);
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                mod.d((l1f1) obj5, (qim0) obj4, this.b, (Function0) obj6, (j2i) obj3, (b0k) obj, czo1.p(24583));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(float f, rzo0 rzo0Var, gfq0 gfq0Var, th61 th61Var, ods odsVar) {
        super(2);
        this.a = (byte) 4;
        this.b = f;
        this.c = rzo0Var;
        this.d = gfq0Var;
        this.e = th61Var;
        this.f = odsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0a(Object obj, Object obj2, Object obj3, float f, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = f;
        this.f = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(String str, Function0 function0, qim0 qim0Var, hux huxVar, float f, int i) {
        super(2);
        this.a = (byte) 2;
        this.c = str;
        this.d = function0;
        this.f = qim0Var;
        this.e = huxVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(c380 c380Var, String str, tlc1 tlc1Var, float f, j2i j2iVar) {
        super(2);
        this.a = (byte) 7;
        this.c = c380Var;
        this.d = str;
        this.e = tlc1Var;
        this.b = f;
        this.f = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(flb0 flb0Var, wat watVar, ven0 ven0Var, j2i j2iVar, float f) {
        super(2);
        this.a = (byte) 1;
        this.c = flb0Var;
        this.d = watVar;
        this.e = ven0Var;
        this.f = j2iVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(llw0 llw0Var, float f, jlw0 jlw0Var, g2z g2zVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.c = llw0Var;
        this.b = f;
        this.d = jlw0Var;
        this.e = g2zVar;
        this.f = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a(float f, znb0 znb0Var, hob1 hob1Var, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 3;
        this.b = f;
        this.c = znb0Var;
        this.d = hob1Var;
        this.f = qim0Var;
        this.e = iu30Var;
    }
}
