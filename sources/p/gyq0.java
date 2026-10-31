package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gyq0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyq0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        dg30 dg30VarF0;
        byte b = this.a;
        boolean zIsChangingConfigurations = false;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((hyq0) obj).b.n(13);
            case 1:
                return ((nyq0) obj).a.n(5);
            case 2:
                return ((hyq0) obj).b.n(9);
            case 3:
                ((nu9) obj).f();
                return rih1Var;
            case 4:
                y6r0 y6r0Var = ((b7r0) ((pbq) obj).t).get();
                if (y6r0Var != null) {
                    return y6r0Var.a;
                }
                return null;
            case 5:
                dg30 dg30Var = (qe41) obj;
                if (dg30Var instanceof dg30) {
                    zIsChangingConfigurations = dg30Var.isChangingConfigurations();
                } else if ((dg30Var instanceof zf30) && (dg30VarF0 = ((zf30) dg30Var).f0()) != null) {
                    zIsChangingConfigurations = dg30VarF0.isChangingConfigurations();
                }
                return Boolean.valueOf(zIsChangingConfigurations);
            case 6:
                a2r0 a2r0Var = (a2r0) obj;
                return (n3h1) a2r0Var.c.invoke(a2r0Var.a.b(i8h1.class), a2r0Var.b);
            case 7:
                rzo0 rzo0Var = (rzo0) obj;
                return new j3h1((i8h1) ((q7r0) rzo0Var.b).b(i8h1.class), (edr0) rzo0Var.c);
            case 8:
                q7r0 q7r0Var = ((x4r0) obj).a;
                try {
                    lir0 lir0Var = (lir0) q7r0Var.b(lir0.class);
                    i8h1 i8h1VarH = cwl1.H(q7r0Var);
                    l6h1 l6h1Var = (l6h1) q7r0Var.b(l6h1.class);
                    n7h1 n7h1VarG = cwl1.G(q7r0Var);
                    if (n7h1VarG != null) {
                        return new c8r0(i8h1VarH, l6h1Var, n7h1VarG, lir0Var.c());
                    }
                    eg.m("A page hosting the NPV must declare PageBoundLogger(true) and UbiProperties(isUbiImpressionV2LoggingEnabled = true)");
                    return null;
                } catch (IllegalStateException e) {
                    k220.p("A page hosting the NPV must declare PageBoundLogger(true) and UbiProperties(isUbiImpressionV2LoggingEnabled = true)", e);
                    return null;
                }
            case 9:
                return (g0i) ((byp) obj).b;
            case 10:
                return new p7r0((s7r0) obj);
            case 11:
                m8r0 m8r0Var = (m8r0) obj;
                luk lukVar = m8r0Var.c;
                if (lukVar != null) {
                    return lukVar.e(new e4n0(m8r0Var, b2));
                }
                return null;
            case 12:
                v8r0 v8r0Var = (v8r0) obj;
                luk lukVar2 = v8r0Var.b;
                if (lukVar2 != null) {
                    return (v8r0) lukVar2.e(new e4n0(v8r0Var, (byte) 2));
                }
                return null;
            case 13:
                w8r0 w8r0Var = (w8r0) obj;
                luk lukVar3 = w8r0Var.b;
                if (lukVar3 != null) {
                    return lukVar3.e(new c44(w8r0Var, (byte) 14));
                }
                return null;
            case 14:
                Map map = (Map) ((ss61) ((rzo0) obj).b).b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    rs61 rs61VarA = ss61.a((p6r0) entry.getKey(), (List) entry.getValue());
                    if (rs61VarA != null) {
                        arrayList.add(rs61VarA);
                    }
                }
                Set<rs61> setP1 = o7h.p1(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (rs61 rs61Var : setP1) {
                    xr61 xr61VarCreate = ((yr61) rs61Var.c().get()).create();
                    List<xt61> listU = eso1.u(xr61VarCreate, j690.e);
                    ArrayList arrayList3 = new ArrayList();
                    for (xt61 xt61Var : listU) {
                        c380 c380Var = xt61Var.e;
                        ArrayList arrayList4 = new ArrayList(q7h.U(c380Var, 10));
                        Iterator it = c380Var.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(new gbr0(rs61Var, xr61VarCreate.a, xr61VarCreate.b, xt61Var, (sq61) it.next()));
                        }
                        r7h.W(arrayList4, arrayList3);
                    }
                    r7h.W(arrayList3, arrayList2);
                }
                return arrayList2;
            case 15:
                pu00 pu00VarA = ((j1c0) ((dcr0) obj).c().a().b0(pu00.class)).a();
                return Boolean.valueOf(pu00VarA != null ? pu00VarA.a : false);
            case 16:
                return hap1.m((kgr0) obj);
            case 17:
                ygr0 ygr0Var = (ygr0) obj;
                return Float.valueOf(ygr0Var != null ? ((Number) ygr0Var.a.getValue()).floatValue() : 0.0f);
            case 18:
                ohr0 ohr0Var = (ohr0) obj;
                return new kgu(((wbr0) ohr0Var.a.d).a(ohr0Var.b.h), ohr0Var.c);
            case 19:
                return (Boolean) ((fir0) obj).c.get();
            case 20:
                return (i8h1) ((rrr0) obj).a.get();
            case 21:
                return (i8h1) ((xrp) ((rzo0) obj).b).get();
            case 22:
                m0s0 m0s0Var = (m0s0) obj;
                luk lukVar4 = m0s0Var.b;
                if (lukVar4 != null) {
                    return lukVar4.e(new e4n0(m0s0Var, (byte) 3));
                }
                return null;
            case 23:
                d1s0 d1s0Var = (d1s0) obj;
                luk lukVar5 = d1s0Var.c;
                if (lukVar5 != null) {
                    return lukVar5.e(new e4n0(d1s0Var, (byte) 4));
                }
                return null;
            case 24:
                ((i4s0) ((km0) obj).c).a();
                return rih1Var;
            case 25:
                gpv0 gpv0Var = (gpv0) obj;
                gpv0Var.d = true;
                Function0 function0 = gpv0Var.g;
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 26:
                ((shq0) obj).invoke();
                return rih1Var;
            case 27:
                ((gob) obj).invoke();
                return rih1Var;
            case 28:
                ((g5f) obj).invoke();
                return rih1Var;
            default:
                t6e0 t6e0Var = ((bks0) obj).h;
                if (t6e0Var != null) {
                    return t6e0Var.e().path();
                }
                u890.C("pageIdentifierProvider");
                throw null;
        }
    }
}
