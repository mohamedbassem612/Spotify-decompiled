package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mw10 extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ cv30 O0;
    public final /* synthetic */ cv30 P0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw10(c380 c380Var, int i, boolean z, boolean z2, boolean z3, nf40 nf40Var, String str, l6q l6qVar, d0r d0rVar, qim0 qim0Var, boolean z4, vu30 vu30Var, xu30 xu30Var, int i2, int i3) {
        super(2);
        this.X = c380Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.Y = nf40Var;
        this.f = str;
        this.Z = l6qVar;
        this.N0 = d0rVar;
        this.g = qim0Var;
        this.h = z4;
        this.O0 = vu30Var;
        this.P0 = xu30Var;
        this.i = i2;
        this.t = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        int i2 = this.i;
        xu30 xu30Var = this.P0;
        vu30 vu30Var = this.O0;
        Object obj3 = this.N0;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) xu30Var;
                int iP = czo1.p(i2 | 1);
                int iP2 = czo1.p(i);
                boolean z = this.c;
                boolean z2 = this.d;
                boolean z3 = this.e;
                boolean z4 = this.h;
                eyo1.e((y7e1) obj6, (lz20) obj5, (j5c) obj4, z, z2, z3, z4, (Function0) obj3, (Function0) vu30Var, this.g, iu30Var, this.b, this.f, (b0k) obj, iP, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i2 | 1);
                int iP4 = czo1.p(i);
                int i3 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                boolean z7 = this.e;
                String str = this.f;
                qim0 qim0Var = this.g;
                boolean z8 = this.h;
                c680.b((c380) obj6, i3, z5, z6, z7, (nf40) obj5, str, (l6q) obj4, (d0r) obj3, qim0Var, z8, vu30Var, xu30Var, (b0k) obj, iP3, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw10(y7e1 y7e1Var, lz20 lz20Var, j5c j5cVar, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, Function0 function1, qim0 qim0Var, iu30 iu30Var, int i, String str, int i2, int i3) {
        super(2);
        this.X = y7e1Var;
        this.Y = lz20Var;
        this.Z = j5cVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.h = z4;
        this.N0 = function0;
        this.O0 = function1;
        this.g = qim0Var;
        this.P0 = iu30Var;
        this.b = i;
        this.f = str;
        this.i = i2;
        this.t = i3;
    }
}
