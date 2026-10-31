package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class afb extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afb(iu30 iu30Var, qim0 qim0Var, Function0 function0, boolean z, dxo1 dxo1Var, Function0 function1, Function0 function2, Function0 function3, Function0 function4, boolean z2, vy71 vy71Var, boolean z3, int i) {
        super(2);
        this.f = iu30Var;
        this.e = qim0Var;
        this.g = function0;
        this.b = z;
        this.Y = dxo1Var;
        this.h = function1;
        this.i = function2;
        this.t = function3;
        this.X = function4;
        this.c = z2;
        this.Z = vy71Var;
        this.d = z3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.X;
        Object obj10 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                boolean z = this.d;
                int iP = czo1.p(1);
                qim0 qim0Var = this.e;
                boolean z2 = this.b;
                boolean z3 = this.c;
                upf.a((iu30) obj10, qim0Var, (Function0) obj8, z2, (dxo1) obj4, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj9, z3, (vy71) obj3, z, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                vwz0 vwz0Var = (vwz0) obj3;
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                j2p1.m((hh11) obj10, (lzn0) obj8, z4, z5, (gw3) obj7, (br0) obj6, (ecd1) obj5, (sve) obj9, z6, (n601) obj4, vwz0Var, qim0Var2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                tjz tjzVar = (tjz) obj3;
                int iP3 = czo1.p(1);
                qim0 qim0Var3 = this.e;
                whm1.b((i3k) obj10, (ycl1) obj9, (Function0) obj8, (Function0) obj7, (Function0) obj6, qim0Var3, (Function0) obj5, (String) obj4, this.b, this.c, this.d, tjzVar, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afb(i3k i3kVar, ycl1 ycl1Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, Function0 function3, String str, boolean z, boolean z2, boolean z3, tjz tjzVar, int i) {
        super(2);
        this.f = i3kVar;
        this.X = ycl1Var;
        this.g = function0;
        this.h = function1;
        this.i = function2;
        this.e = qim0Var;
        this.t = function3;
        this.Y = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.Z = tjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afb(hh11 hh11Var, lzn0 lzn0Var, boolean z, boolean z2, gw3 gw3Var, br0 br0Var, ecd1 ecd1Var, sve sveVar, boolean z3, n601 n601Var, vwz0 vwz0Var, qim0 qim0Var, int i) {
        super(2);
        this.f = hh11Var;
        this.g = lzn0Var;
        this.b = z;
        this.c = z2;
        this.h = gw3Var;
        this.i = br0Var;
        this.t = ecd1Var;
        this.X = sveVar;
        this.d = z3;
        this.Y = n601Var;
        this.Z = vwz0Var;
        this.e = qim0Var;
    }
}
