package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kz80 extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object P0;
    public final /* synthetic */ Object Q0;
    public final /* synthetic */ Object R0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz80(String str, Function0 function0, qim0 qim0Var, boolean z, boolean z2, boolean z3, boolean z4, Function0 function1, Function0 function2, tra0 tra0Var, w9u0 w9u0Var, boolean z5, boolean z6, boolean z7, boolean z8, Function0 function3, String str2, int i) {
        super(2);
        this.b = str;
        this.Y = function0;
        this.P0 = qim0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.Z = function1;
        this.N0 = function2;
        this.Q0 = tra0Var;
        this.R0 = w9u0Var;
        this.h = z5;
        this.i = z6;
        this.t = z7;
        this.X = z8;
        this.O0 = function3;
        this.c = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.R0;
        Object obj4 = this.Q0;
        Object obj5 = this.P0;
        Object obj6 = this.O0;
        Object obj7 = this.N0;
        Object obj8 = this.Z;
        Object obj9 = this.Y;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                tra0 tra0Var = (tra0) obj4;
                w9u0 w9u0Var = (w9u0) obj3;
                Function0 function0 = (Function0) obj6;
                String str = this.c;
                int iP = czo1.p(1);
                String str2 = this.b;
                boolean z = this.d;
                boolean z2 = this.e;
                boolean z3 = this.f;
                boolean z4 = this.g;
                nz80.e(str2, (Function0) obj9, (qim0) obj5, z, z2, z3, z4, (Function0) obj8, (Function0) obj7, tra0Var, w9u0Var, this.h, this.i, this.t, this.X, function0, str, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                iix0 iix0Var = (iix0) obj4;
                j2i j2iVar = (j2i) obj3;
                boolean z5 = this.X;
                int iP2 = czo1.p(1);
                String str3 = this.b;
                String str4 = this.c;
                boolean z6 = this.d;
                boolean z7 = this.e;
                boolean z8 = this.f;
                u4p1.B(str3, (djc0) obj9, str4, (n4m) obj8, (bv11) obj7, (dt11) obj6, z6, z7, z8, (c380) obj5, this.g, this.h, this.i, this.t, iix0Var, j2iVar, z5, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz80(String str, djc0 djc0Var, String str2, n4m n4mVar, bv11 bv11Var, dt11 dt11Var, boolean z, boolean z2, boolean z3, c380 c380Var, boolean z4, boolean z5, boolean z6, boolean z7, iix0 iix0Var, j2i j2iVar, boolean z8, int i) {
        super(2);
        this.b = str;
        this.Y = djc0Var;
        this.c = str2;
        this.Z = n4mVar;
        this.N0 = bv11Var;
        this.O0 = dt11Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.P0 = c380Var;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.t = z7;
        this.Q0 = iix0Var;
        this.R0 = j2iVar;
        this.X = z8;
    }
}
