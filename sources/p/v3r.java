package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v3r extends hab0 implements iu30 {
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
    public /* synthetic */ v3r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, byte b) {
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
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a3  */
    public final Object invoke(Object obj) {
        ymd0 kdn0Var;
        ymd0 kdn0Var2;
        ymd0 kdn0Var3;
        Object obj2;
        ymd0 kdn0Var4;
        whx0 whx0Var;
        iix0 iix0Var;
        iix0 iix0Var2;
        byte b = this.a;
        Object obj3 = this.X;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        Object obj11 = this.Z;
        Object obj12 = this.b;
        Object obj13 = this.g;
        Object obj14 = this.Y;
        switch (b) {
            case 0:
                List list = (List) obj;
                return ((ju30) obj12).l(((l4r) obj10).e.invoke(list.get(0)), ((l4r) obj9).e.invoke(list.get(1)), ((l4r) obj8).e.invoke(list.get(2)), ((l4r) obj7).e.invoke(list.get(3)), ((l4r) obj13).e.invoke(list.get(4)), ((l4r) obj6).e.invoke(list.get(5)), ((l4r) obj5).e.invoke(list.get(6)), ((l4r) obj4).e.invoke(list.get(7)), ((l4r) obj3).e.invoke(list.get(8)), ((l4r) obj14).e.invoke(list.get(9)), ((l4r) obj11).e.invoke(list.get(10)));
            case 1:
                irn1.k((c9n) obj12, (ven0) obj10, (ven0) obj9, (q3w) obj8, (Function0) obj7, (zah1) obj13, (ven0) obj6, (ven0) obj5, (ven0) obj4, (vu30) obj3, (ven0) obj14, (ven0) obj11, (String) obj, false);
                return rih1.a;
            case 2:
                return new e27(new jwy((q8n) obj12, (oey) obj10, (cxy) obj9, (eb80) obj8, (o4t) obj7, (ekb) obj13, (bhf) obj6, (lhc) obj5, (t8r0) obj4, (wh71) obj3, (oud) obj, (ol71) obj14), new lz9((g2z) obj11, (byte) 1));
            default:
                uv11 uv11Var = (uv11) obj;
                zob1 zob1Var = (zob1) obj14;
                d0r d0rVar = (d0r) obj13;
                String str = uv11Var.a;
                fai0 fai0Var = new fai0();
                epb1 epb1Var = (epb1) obj12;
                nt01 nt01Var = new nt01((xu30) obj11, uv11Var, (byte) 9);
                fai0 fai0Var2 = new fai0();
                Object value = epb1Var.Y.getValue();
                fai0Var2.m(value != null ? nt01Var.invoke(value) : null);
                fai0Var2.n(epb1Var, new jp5(fai0Var2, nt01Var, (byte) 10));
                vu30 vu30Var = (vu30) obj10;
                rrt0 rrt0Var = rrt0.b;
                if (vu30Var == null || (kdn0Var = (ymd0) vu30Var.invoke(str, uv11Var.d)) == null) {
                    kdn0Var = new kdn0(rrt0Var);
                }
                xu30 xu30Var = (xu30) obj9;
                if (xu30Var == null || (kdn0Var2 = (ymd0) xu30Var.invoke(str, uv11Var.b, epb1Var)) == null) {
                    kdn0Var2 = new kdn0(j6u.a);
                }
                iu30 iu30Var = (iu30) obj8;
                if (iu30Var == null || (kdn0Var3 = (ymd0) iu30Var.invoke(str)) == null) {
                    obj2 = null;
                    kdn0Var3 = new kdn0(new dt11((q1v) null, 3));
                } else {
                    obj2 = null;
                }
                kdn0 kdn0Var5 = new kdn0(obj2);
                iu30 iu30Var2 = (iu30) obj7;
                if (iu30Var2 == null || (kdn0Var4 = (ymd0) iu30Var2.invoke(str)) == null) {
                    kdn0Var4 = new kdn0();
                }
                ay8 ay8VarF = d0rVar != null ? d3p1.F(d0rVar, js11.a, uv11Var) : null;
                y8n y8nVarJ = ay8VarF != null ? t5p1.j(new cly0(ay8VarF, (byte) 4), 3) : null;
                fai0Var.n((ymd0) ((iu30) obj6).invoke(str), new df3(fai0Var, (byte) 18));
                fai0Var.n((ymd0) ((iu30) obj5).invoke(str), new df3(fai0Var, (byte) 19));
                fai0Var.n((ymd0) ((vu30) obj4).invoke(str, epb1Var), new df3(fai0Var, (byte) 20));
                fai0Var.n((ymd0) ((vu30) obj3).invoke(str, epb1Var), new df3(fai0Var, (byte) 21));
                fai0Var.n(fai0Var2, new df3(fai0Var, (byte) 22));
                fai0Var.n(kdn0Var5, new df3(fai0Var, (byte) 23));
                if (zob1Var != null) {
                    fai0Var.n(t5p1.j(zob1Var, 3), new jp5(uv11Var, fai0Var, (byte) 9));
                }
                if (y8nVarJ != null) {
                    fai0Var.n(y8nVarJ, new df3(fai0Var, (byte) 24));
                }
                fai0Var.n(kdn0Var, new df3(fai0Var, (byte) 25));
                fai0Var.n(kdn0Var3, new df3(fai0Var, (byte) 15));
                fai0Var.n(kdn0Var2, new df3(fai0Var, (byte) 16));
                fai0Var.n(kdn0Var4, new df3(fai0Var, (byte) 17));
                if (d0rVar != null) {
                    k1r k1rVar = ay8VarF != null ? (k1r) ay8VarF.a.getValue() : null;
                    i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
                    if (i1rVar != null) {
                        iix0Var = (iix0) i1rVar.a;
                        iix0Var2 = iix0Var;
                    } else {
                        iix0Var2 = null;
                    }
                } else if (zob1Var == null || (whx0Var = (whx0) zob1Var.getValue()) == null) {
                    iix0Var2 = null;
                } else {
                    iix0Var = (iix0) whx0Var.a.get(str);
                    iix0Var2 = iix0Var;
                }
                rrt0 rrt0Var2 = (rrt0) kdn0Var.e();
                rrt0 rrt0Var3 = rrt0Var2 == null ? rrt0Var : rrt0Var2;
                dt11 dt11Var = (dt11) kdn0Var3.e();
                if (dt11Var == null) {
                    dt11Var = new dt11((q1v) null, 3);
                }
                fai0Var.m(new k910(r6g1.a, dt11Var, iix0Var2, (n6u) null, rrt0Var3, false, false, false, (Double) kdn0Var5.e(), (me2) null, (xn70) null, false, 7640));
                return fai0Var;
        }
    }
}
