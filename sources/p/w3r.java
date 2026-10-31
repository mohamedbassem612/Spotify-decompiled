package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w3r extends hab0 implements iu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
        this.X = obj10;
        this.Y = obj11;
        this.Z = obj12;
        this.N0 = obj13;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0188  */
    public final Object invoke(Object obj) {
        mr20 huzVar;
        byte b = this.a;
        Object obj2 = this.X;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        Object obj11 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                return ((ku30) obj11).E0(((l4r) obj10).e.invoke(list.get(0)), ((l4r) obj9).e.invoke(list.get(1)), ((l4r) obj8).e.invoke(list.get(2)), ((l4r) obj7).e.invoke(list.get(3)), ((l4r) obj6).e.invoke(list.get(4)), ((l4r) obj5).e.invoke(list.get(5)), ((l4r) obj4).e.invoke(list.get(6)), ((l4r) obj3).e.invoke(list.get(7)), ((l4r) obj2).e.invoke(list.get(8)), ((l4r) this.Y).e.invoke(list.get(9)), ((l4r) this.Z).e.invoke(list.get(10)), ((l4r) this.N0).e.invoke(list.get(11)));
            default:
                um01 um01Var = (um01) obj;
                d0r d0rVar = (d0r) obj6;
                cn01 cn01Var = (cn01) obj5;
                ne neVar = (ne) obj4;
                di4 di4Var = (di4) obj3;
                bv40 bv40Var = (bv40) obj2;
                rh11 rh11Var = (rh11) this.Y;
                waz0 waz0Var = (waz0) this.Z;
                ux3 ux3Var = (ux3) this.N0;
                mr20 ht20Var = new ht20((mr20) obj10, new egv0(2, (lnm) null, (byte) 9));
                mr20 ht20Var2 = new ht20(d3p1.H(d0rVar, w3p1.o(new l4r(pwc0.r, 2, mm01.S0, new j4r(mm01.U0), mm01.T0), mm01.V0), um01Var), new egv0(2, (lnm) null, (byte) 7));
                mr20 ht20Var3 = new ht20(yoi1.g(((yh2) obj9).a()), new egv0(2, (lnm) null, (byte) 4));
                mr20 ht20Var4 = new ht20(((ov20) obj8).a, new egv0(2, (lnm) null, (byte) 10));
                q8b q8bVar = um01Var.d;
                String str = um01Var.a;
                mr20 ht20Var5 = new ht20(yoi1.g(((f8b) obj7).a(q8bVar.b)), new egv0(2, (lnm) null, (byte) 5));
                mr20 ht20Var6 = new ht20(new sr0(d3p1.H(d0rVar, ((wm01) obj11).b, um01Var), cn01Var, um01Var, di4Var, (byte) 23), new b201(bn01.a(cn01Var, um01Var.b, (jo70) null, (xkk1) null, (hll) null, (zoy0) null, (ldj1) null, (mtl) null, di4Var.Q(), di4Var.R()), (lnm) null, (byte) 13));
                if (di4Var.I()) {
                    Set set = s4b1.f;
                    if (uic.h(str, new blc0[]{blc0.U4, blc0.Y4})) {
                        Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
                        jd11 jd11Var = rc11.a;
                        huzVar = rqt0.u(new ht20(new f5y0(d3p1.H(d0rVar, w3p1.n(new l4r(new xv00(jd11Var.b(j6k.class)), 2, th01.Z, new j4r(th01.Q0), th01.N0), new l4r(new xv00(jd11Var.b(lhe0.class)), 2, th01.O0, new j4r(th01.R0), th01.P0), atz0.U0), um01Var), localeForLanguageTag, (byte) 14), new egv0(2, (lnm) null, (byte) 6)));
                    } else {
                        huzVar = new huz(new mfk(), (byte) 10);
                    }
                } else {
                    huzVar = new huz(new mfk(), (byte) 10);
                }
                mr20 ht20Var7 = new ht20(neVar.H(str), new egv0(2, (lnm) null, (byte) 11));
                FlowableMap flowableMapJ = g7h.d((g7h) neVar.c, "", new String[]{str}).toFlowable(BackpressureStrategy.d).J(new vdn1(str, (byte) 14)).J(b4x0.h);
                vbm[] vbmVarArr = q601.a;
                mr20 ht20Var8 = new ht20(new kge(flowableMapJ), new egv0(2, (lnm) null, (byte) 8));
                boolean zE = sgy.e(str);
                md2 md2Var = md2.c;
                return rqt0.u(new sr0((mr20[]) o7h.l1(p7h.M(new mr20[]{ht20Var, ht20Var2, ht20Var3, ht20Var4, ht20Var5, ht20Var6, ht20Var7, ht20Var8, new ht20(zE ? bv40Var.k(str) : new huz(md2Var, (byte) 10), new egv0(2, (lnm) null, (byte) 3)), new ht20(sgy.i(str) ? bv40Var.k(str) : new huz(md2Var, (byte) 10), new egv0(2, (lnm) null, (byte) 12)), new ht20(waz0Var.e(), new b201(waz0Var, (lnm) null, (byte) 12)), ux3Var.a() ? ux3Var.b() : new huz(Boolean.FALSE, (byte) 10), huzVar})).toArray(new mr20[0]), rh11Var, waz0Var, um01Var, (byte) 22));
        }
    }
}
